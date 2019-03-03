package com.coder.t1_8;

import java.util.Arrays;
import java.util.List;

public class Lambda {
	public static void test() {
		String[] atp = { "RafaelNadal", "NovakDjokovic", "StanislasWawrinka", "DavidFerrer", "RogerFederer",
				"AndyMurray", "TomasBerdych", "JuanMartinDelPotro" };
		List<String> players = Arrays.asList(atp);

		// 以前的循环方式
//		for (String player : players) {
//			System.out.print(player + ";");
//		}

		// 使用lambda表达式以及函数操作(functionaloperation)
		 players.forEach((player) -> System.out.print(player + ";"));

		// 在Java8中使用双冒号操作符(doublecolonoperator)
//		players.forEach(System.out::println);
	}
	
	
	public static void main(String[] args) {
		test();
	}
}
