package com.imooc.io;

import java.io.*;
import java.util.*;


abstract class  Animal{
	public abstract void eat();
	public abstract void bark();
}

public class Cdltest {
    String name;
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		String str="�´���abc";
		//Gbk���뷽ʽ��eclipseĬ�ϣ�����ռ�����ֽڣ�Ӣ��ռһ��
		byte[] b=str.getBytes();
		for (byte c : b) {
			System.out.print(Integer.toHexString(c &0xff)+" ");
		}
		System.out.println();
		//utf-8���뷽ʽ������ռ3���ֽڣ�Ӣ��ռһ���ֽ�
		byte[] b1=str.getBytes("utf-8"); 
		for (byte c : b1) {
			System.out.print(Integer.toHexString(c&0xff)+" ");
		}
		
		System.out.println();
		//utf-16be���뷽ʽ ��java���뷽ʽ����ռ�����ֽ�
		byte[] b2 =str.getBytes("utf-16be");
        for (byte c : b2) {
			System.out.print(Integer.toHexString(c&0xff)+" ");
		} 
        System.out.println();
        //Cdltest dx=new Cdltest("chen daliang");
        //dx.iotest();
        
        //��̬
        Animal dogs=new Dog();
        Animal cats=new Cat();
        dogs.bark();
        dogs.eat();
        cats.bark();
        cats.eat();
	}
	
	public  void iotest(){
		Scanner s=new Scanner(System.in);
		System.out.println("�������ַ�����");
		if(s.hasNextLine()){
			String inp=s.nextLine();
			System.out.println("�ַ���:"+inp);
		}else{
			System.out.println("�����ַ���");
		}
		System.out.println("�������ַ�����");
		if(s.hasNextLine()){
			String inp1=s.nextLine();
			System.out.println("�ַ���"+inp1);
		}else{
			System.out.println("�����ַ���");
		}
		
		
	}
	
	public Cdltest(String name){
		this.name=name;
	    	
	}

}

//һ����̳�һ�������������д���ĳ��󷽷������������Ϊ������
class Cat extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("è����");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("è��");
		
	}
	
}

class Dog extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}
	
}

