package com.imooc.io;

import java.io.*;
import java.util.*;
public class Cdltest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File fi=new File("cdl");
        
        if(fi.exists()){
        	System.out.println("Ŀ¼���ļ����ѱ�����");
        }else{ 
        	fi.mkdir();
        }
        System.out.println(fi.isDirectory());
        
        //�������ͬ�����ļ���Ŀ¼���򲻻ᱻ����
        if(fi.createNewFile()){
        	System.out.println("�ļ�������");
        }else{
        	System.out.println("�ļ�δ������");
        }
        bufferread();
	}
	
	public static void bufferread() throws IOException{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		 System.out.print("����һ���ַ���");
		 char c =(char)br.read();
		 System.out.println(c);
	}

}
