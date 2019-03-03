package com.coder.t1_8;

import java.util.ArrayList;
import java.util.Comparator;

public class AnonymousInnerClassTest {
	public static void sort(){
		 ArrayList<Integer> integers = new ArrayList<Integer>() ;
	        integers.add(9);
	        integers.add(8);
	        integers.add(7);
	        integers.add(6);
	        integers.sort(new Comparator<Integer>() {
	            public int compare(Integer o1, Integer o2) {
	                return o1.compareTo(o2);
	            }
	        });
	        System.out.println("匿名内部类排序输出:"+integers);


	        integers.sort((o1,o2)->o1.compareTo(02));
	        System.out.println("lambda1表达式排序输出:"+integers);


	        integers.sort(Integer::compareTo);
	        System.out.println("lambda2表达式排序输出:"+integers);

	}
	public static void main(String[] args) {
		sort();
	}
}
