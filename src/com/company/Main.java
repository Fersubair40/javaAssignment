package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		String canMessage = "transaction cancelled";

		System.out.println("Welcome to MTN Data Service");
		System.out.println("Choose preferred package below");
		System.out.println("1. Daily bundles");
		System.out.println("2. Weekly bundles");
		System.out.println("3. Monthly bundles");
		System.out.println("4. Binge Bundle");
		System.out.println("5. Mega bundles");

		Scanner input = new Scanner(System.in);
		// in.close();
		int value;
		value = input.nextInt();

		if (value == 1) {
			System.out.println("Daily Bundles");
			System.out.println("1. 1GB for #1000");
			System.out.println("2. 2GB for #2000");
			System.out.println("3. 3GB for #3000");

			Scanner dailyBundle = new Scanner((System.in));
			int dailyvalue;
			dailyvalue = dailyBundle.nextInt();

			if (dailyvalue == 1) {
				System.out.println("Confirm transaction");
				System.out.println("1. Yes");
				System.out.println("2. No");
				Scanner dailytran = new Scanner(System.in);
				int tranvalue;
				tranvalue = dailytran.nextInt();
				if (tranvalue == 1) {
					System.out.println("Data purchased successful");
				} else {
					System.out.println( "" );
				}
			}
			if (dailyvalue == 2) {
				System.out.println("Confirm transaction");
				System.out.println("1. Yes");
				System.out.println("2. No");
				Scanner dailytran = new Scanner(System.in);
				int tranvalue;
				tranvalue = dailytran.nextInt();
				if (tranvalue == 1) {
					System.out.println("Data purchased successful");
				} else {
					System.out.println("Transaction cancelled");
				}
			}
			if (dailyvalue == 3) {
				System.out.println("Confirm transaction");
				System.out.println("1. Yes");
				System.out.println("2. No");
				Scanner dailytran = new Scanner(System.in);
				int tranvalue;
				tranvalue = dailytran.nextInt();
				if (tranvalue == 1) {
					System.out.println("Data purchased successful");
				} else {
					System.out.println("Transaction cancelled");
				}
			}
		}
		if (value == 2) {
			System.out.println("Weekly Bundles");
			System.out.println("1. 1GB for #1000");
			System.out.println("2. 2GB for #2000");
			System.out.println("3. 1GB for #3000");

			Scanner weeklyBundle = new Scanner(System.in);
			int weeklyvalue;

			weeklyvalue = weeklyBundle.nextInt();
			if (weeklyvalue == 1) {
				System.out.println("Confirm transaction");
				System.out.println("1. Yes");
				System.out.println("2. No");
				Scanner weeklytran = new Scanner(System.in);
				int tranvalue;
				tranvalue = weeklytran.nextInt();
				if (tranvalue == 1) {
					System.out.println("Data purchased successful");
				} else {
					System.out.println("Transaction cancelled");
				}
			}
			if (weeklyvalue == 2) {
				System.out.println(" Confirm transaction");
				System.out.println("1. Yes");
				System.out.println("2. No");
				Scanner weeklytran = new Scanner(System.in);
				int tranValue;
				tranValue = weeklytran.nextInt();
				if (tranValue == 1) {
					System.out.println("Data purchased successful");
				} else {
					System.out.println("Transaction cancelled");
				}
			}
			if (weeklyvalue == 3) {
				System.out.println("Confirm transaction");
				System.out.println("1. Yes");
				System.out.println("2. No");
				Scanner weeklytran = new Scanner(System.in);
				int tranvalue;
				tranvalue = weeklytran.nextInt();
				if (tranvalue == 1) {
					System.out.println("Data purchased successful");
				} else {
					System.out.println("Transaction cancelled");
				}
			}
		}

		if (value == 3) {
			System.out.println("Monthly bundles");
			System.out.println("1. 2GB for #2000");
			System.out.println("2. 3GB for #3500");
			System.out.println("3. 4GB for #5000");

			Scanner monthlybundle = new Scanner(System.in);
			int monthlyvalue;
			monthlyvalue = monthlybundle.nextInt();

			if (monthlyvalue == 1) {
				System.out.println("Confirm transaction");
				System.out.println("1. Yes");
				System.out.println("2. No");

				Scanner monthlytran = new Scanner(System.in);
				int tranvalue;
				tranvalue = monthlytran.nextInt();
				if (tranvalue == 1) {
					System.out.println("Data purchased successful");
				} else {
					System.out.println("Transaction cancelled");
				}
			}
			if (monthlyvalue == 2) {
				System.out.println("Confirm transaction");
				System.out.println("1. Yes");
				System.out.println("2. No");

				Scanner monthlytran = new Scanner(System.in);
				int tranvalue;
				tranvalue = monthlytran.nextInt();
				if (tranvalue == 1) {
					System.out.println("Data purchased successful");
				} else {
					System.out.println("Transaction cancelled");
				}
			}
			if (monthlyvalue == 3) {
				System.out.println("Confirm transaction");
				System.out.println("1. Yes");
				System.out.println("2. No");

				Scanner monthlytran = new Scanner(System.in);
				int tranvalue;
				tranvalue = monthlytran.nextInt();
				if (tranvalue == 1) {
					System.out.println("Data purchased successful");
				} else {
					System.out.println("Transaction cancelled");
				}
			}
		}
		if (value == 4) {
			System.out.println("Binge bundle");
			System.out.println("1. 1GB for #350");
			System.out.println("2. 2GB for #500");
			Scanner bingebundle = new Scanner(System.in);
			int bingevalue;
			bingevalue = bingebundle.nextInt();

			if (bingevalue == 1) {
				System.out.println("Confirm transaction");
				System.out.println("1. Yes");
				System.out.println("2. No");
				Scanner bingetran = new Scanner(System.in);
				int tranvalue;
				tranvalue = bingetran.nextInt();
				if (tranvalue == 1) {
					System.out.println("Data  purchased successful");
				} else {
					System.out.println("Transaction cancelled");
				}
			}
			if (bingevalue == 2) {
				System.out.println("Confirm transaction");
				System.out.println("1. Yes");
				System.out.println("2. No");
				Scanner bingetran = new Scanner(System.in);
				int tranvalue;
				tranvalue = bingetran.nextInt();
				if (tranvalue == 1) {
					System.out.println("Data purchased successful");
				} else {
					System.out.println("Transaction cancelled");
				}
			}
		}
		if (value == 5) {
			System.out.println("Mega bundle");
			System.out.println("1. 30GB for #10,000");
			System.out.println("2. 40GB for #25,000");
			System.out.println("3. 50GB for #45,000");
			System.out.println("4. 70GB for #65,000");
			Scanner megabundle = new Scanner(System.in);
			int megavalue;
			megavalue = megabundle.nextInt();

			if (megavalue == 1) {
				System.out.println(" Confirm transaction");
				System.out.println("1. Yes");
				System.out.println("2. No");
				Scanner megatran = new Scanner(System.in);
				int tranvalue;
				tranvalue = megatran.nextInt();
				if (tranvalue == 1) {
					System.out.println("Data purchased successful");
				} else {
					System.out.println("Transaction cancelled");
				}
			}
			if (megavalue == 2) {
				System.out.println("Confirm transaction");
				System.out.println("1. Yes");
				System.out.println("2. No");
				Scanner megatran = new Scanner(System.in);
				int tranvalue;
				tranvalue = megatran.nextInt();
				if (tranvalue == 1) {
					System.out.println("Data purchased successful");
				} else {
					System.out.println("Transaction cancelled");
				}
			}
			if (megavalue == 3) {
				System.out.println("Confirm transaction");
				System.out.println("1. Yes");
				System.out.println("2. No");
				Scanner megatran = new Scanner(System.in);
				int tranvalue;
				tranvalue = megatran.nextInt();
				if (tranvalue == 1) {
					System.out.println("Data purchased successful");
				} else {
					System.out.println("Transaction cancelled");
				}
			}
			if (megavalue == 4) {
				System.out.println("Confirm transaction");
				System.out.println("1. Yes");
				System.out.println("2. No");
				Scanner megatran = new Scanner(System.in);
				int tranvalue;
				tranvalue = megatran.nextInt();
				if (tranvalue == 1) {
					System.out.println("Data purchased successful");
				} else {
					System.out.println("Transaction cancelled");
				}
			}
		}
	}
}
