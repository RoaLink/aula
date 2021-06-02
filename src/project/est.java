package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class est {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();

		list.add("jonh");
		list.add("sa");
		list.add("g");
		list.add("fy");

		for (String x : list) {
			System.out.println(x);

		}

		System.out.println("---------------------------------------------");

		list.removeIf(x -> x.charAt(0) == 's');

		for (String x : list) {
			System.out.println(x);

			System.out.println("---------------------------------------------");
			System.out.println("index of j " + list.indexOf("jonh"));

			System.out.println("---------------------------------------------");

			List<String> result = list.stream().filter(y -> x.charAt(0) == 'j').collect(Collectors.toList());
			for (String y : list) {
				System.out.println(y);
			}
			System.out.println("---------------------------------------------");
			String name = list.stream().filter(y -> x.charAt(0) == 'j').findFirst().orElse(null);
			for (String y : list) {
				System.out.println(x);}
		}
	}
}
