package com.it.demo;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

/**
 * Software：IntelliJ IDEA 2020.1 x64
 * CassName:      Demo02
 * Author:         夏泽华
 * Date:           2020/12/13 20:56
 * 描述：
 */
public class Demo02 {
    public static void main(String[] args) throws Exception {
        FileWriter fileWriter = new FileWriter("file.txt");
        char[] arr = new char[]{'西','可'};
        fileWriter.write(arr);
        fileWriter.close();
    }
}
