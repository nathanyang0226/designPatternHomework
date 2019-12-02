package com.gupao.homework.designpattern.customJdkProxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class GpClassLoader extends ClassLoader {

    private File classPathFile;

    public GpClassLoader() {
        String path = GpClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(path);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String packageName = GpClassLoader.class.getPackage().getName() + "." + name;
        if (classPathFile != null) {
            File classFile = new File(classPathFile, name.replaceAll("\\.", "/") + ".class");
            if (classFile.exists()) {
                FileInputStream fi = null;
                ByteArrayOutputStream bos = null;
                try {
                    fi = new FileInputStream(classFile);
                    bos = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int len;
                    while ((len = fi.read(buff)) != -1) {
                        bos.write(buff, 0, len);
                    }
                    return defineClass(packageName, bos.toByteArray(), 0, bos.size());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
