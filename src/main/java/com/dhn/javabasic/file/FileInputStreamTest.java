package com.dhn.javabasic.file;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @description: 字节输入流
 * @author: Dong HuaNan
 * @date: 2020/4/1 11:22
 */
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        //注：写绝对路径
        FileInputStream fileInputStream = new FileInputStream("E:\\MyIntellijSpace3\\project\\src\\main\\java\\com\\dhn\\javabasic\\file\\FileNote");
        //创建容量为1024的“竹筒”
        byte[] bbuf = new byte[1024];
        //保存实际读取的字节数
        int hasRead = 0;
        //使用循环重复“取水”
        while ((hasRead = fileInputStream.read(bbuf)) > 0){
            //取出“竹筒”中的水滴（字节），将字节数组转换成字符串输入
            System.out.println(new String(bbuf,0,hasRead));

        }
        fileInputStream.close();
    }


}
