package com.ritubrata.various;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryAddition {
	static String addBinary(final String a, final String b)	{
		String result = "";
		int s = 0;
		int i = a.length() - 1, j = b.length() - 1;
		while (i >= 0 || j >= 0 || s == 1){
			s += i >= 0? a.charAt(i) - '0': 0;
			s += j >= 0? b.charAt(j) - '0': 0;
			result = (char)(s % 2 + '0') + result;
			s /= 2;
			i--; j--;
		}
		if(result.startsWith("0")) {
			return result.substring(1);
		}else {
			return result;
		}
	}
	public static void main(final String[] args) throws IOException {
		final InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		final BufferedReader in = new BufferedReader(reader);
		String line;
		List<String> binarList  = new ArrayList<>();
		while ((line = in.readLine()) != null) {
			binarList = Arrays.asList(line.split(","));
		}

		System.out.println(addBinary(binarList.get(0), binarList.get(1)));
	}
}
