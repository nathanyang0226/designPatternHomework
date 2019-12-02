package com.gupao.homework.designpattern.propxy.staticProxy;

public class DynamicDatasourceEntity {

    //默认数据源
    public final static String DEFAULT_SOUCE=null;

    private final static ThreadLocal<String> local=new ThreadLocal<String>();

    private DynamicDatasourceEntity(){

    }

    //清空数据源
    public static void clear(){
        local.remove();
    }

    //获取当前正在使用的数据源
    public String getCurrent(){
       return local.get();
    }

    //还原当前切面的的数据源
    public static void restore(){
        local.set(DEFAULT_SOUCE);
    }


    //设置已知名字的数据源
    public static void set(String source){
        local.set(source);
    }


    //根据年份动态设置数据源

    public static void set(int year){
        local.set("DB_"+year);
    }

}
