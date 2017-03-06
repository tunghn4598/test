package main;
import java.util.Scanner;
import java.lang.*;
public class Tuiton_Fee 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Initial tuiton fee");
		int tuitonfee = sc.nextInt();
		System.out.println("Percentage increase");
		int perin = sc.nextInt();
		double cost = tuitonfee;
		for( int i =1; i < 4; cost = cost +  tuitonfee*Math.pow((1.00+(perin/100.00)), i), i++ );
		System.out.printf("Total cost %.2f",cost);
	}
}