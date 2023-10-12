package com.ritubrata.integers;

public class PalindromeExample {

	public static void findPalindromeNumber(int num) {
		int r,sum=0,temp;
		temp=num;
		if(num<=0){
			System.out.println("no");
		}else{
			while(num>0){
				r = num%10;
				sum = sum*10 + r ;
				num = num/10;
			}

			if(temp == sum){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}

	}
	public static void main(final String args[]){
		try {
			findPalindromeNumber(45454);
			findPalindromeNumber(123);
			findPalindromeNumber(-123);
			findPalindromeNumber(Integer.parseInt("abc"));
		}catch(final NumberFormatException e) {
			throw new NumberFormatException("Entered String is not Number");
		}



	}

}
