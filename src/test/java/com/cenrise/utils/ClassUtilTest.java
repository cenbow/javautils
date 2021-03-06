package com.cenrise.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.junit.Test;

import com.cenrise.utils.model.BusinessLog;


public class ClassUtilTest {

    @Test
    public void testField() throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        System.out.println("=============所有字段===============");
        String[] fields = ClassUtil.getField("evilp0s.RegUtil");
        for (String f : fields) {
            System.out.println(f);
        }
    }

    @Test
    public void testMetod() throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        System.out.println("============所有方法================");
        String[] methods = ClassUtil.getMethod("evilp0s.StringUtil");
        for (String m : methods) {
            System.out.println(m);
        }
    }

    @Test
    public void testGetClass() {
        System.out.println("============所有类================");
        List<String> classNames = ClassUtil.getClassName("evilp0s", true);
        for (String str : classNames) {
            System.out.println(str);
        }
    }

    @Test
    public void testGetterAndSetter() throws InvocationTargetException, IllegalAccessException {

        System.out.println("============Setter和Getter================");
        BusinessLog log = new BusinessLog();
        ClassUtil.setter(log, "operationName", "setter-method-test", String.class);
        System.out.println(log);

    }

}