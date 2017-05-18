package com.anjuke;

import java.util.Scanner;

public class WAPRouters {

	public static int stepMax(int rn,boolean[] crossed,boolean[] crossed_with_neighbor,int[] sat,boolean[][] adj){
		int max = 0;
		int index = 0;
		
		for(int i=0; i<rn; i++){
			if(crossed[i]==true){
				continue;
			}else{
				int satSum = 0;
				if(crossed_with_neighbor[i] == false){
					satSum += sat[i];
				}
				
				for(int j=0; j<rn; j++){
					if(adj[i][j] == true && crossed_with_neighbor[j] == false){
						satSum += sat[j];
					}
					
				}
//				System.out.println("i=" + i);
//				System.out.println("staSum=" + satSum);
				if(max < satSum){
					max = satSum;
					index = i;
				}
			}
			
		}
		crossed[index] = true;
		crossed_with_neighbor[index] = true;
		for(int j=0; j<rn; j++){
			if(adj[index][j] == true){
				crossed_with_neighbor[j] = true;
			}
		}
//		System.out.println("+++++++++++++++++++");
//		System.out.println("index:" + index);
//		System.out.println("max=" + max);
		return max;
		
	}
	
	public static boolean isFinished(boolean[]crossed){
		for(int i=0; i<crossed.length;i++){
			if(crossed[i] == false){
				return false;
			}
		}
		return true;
	}
	
	public static int TotalMax(int router,int rn,boolean[]crossed,boolean[] crossed_with_neighbor,int[] sat,boolean[][] adj){
		System.out.println("Starting computing totalMAX...");
		int totalMax = 0;
		for(int i=0; i <router; i++){
			if(isFinished(crossed)){
				break;
			}
			totalMax += stepMax(rn,crossed,crossed_with_neighbor,sat,adj);
//			System.out.println("i="+i);
//			for(int j=0; j<rn;j++){
//				System.out.println("the" + j +"of crossed_neighbour is:" + crossed_with_neighbor[j]);
//				System.out.println("---------------------");
//				System.out.println("the" + j +"of crossed is:" + crossed[j]);
//			}
//			System.out.println();
		}
		return totalMax;
		
	}
	
	
	public static void main(String [] args){
		System.out.println("starting ...");
		Scanner scan = new Scanner(System.in);
		int room_nums = scan.nextInt();
		int router_nums = scan.nextInt();
		int door_nums = room_nums -1;
		
//		System.out.println("room_nums:" + room_nums);
		
		if(room_nums<2||room_nums>1000||router_nums<=0||router_nums>room_nums||router_nums>100)
	    {
	        System.out.println("Error Input!");
	        return;
	    }
		
		int[] satisfication = new int[room_nums];
		boolean[][] adj = new boolean[room_nums][room_nums];
		boolean[] crossed = new boolean[room_nums];
		boolean[] crossed_with_neighbour = new boolean[room_nums];
		
		//Initialization
		for(int i=0; i<room_nums; i++){
			satisfication[i] = 0;
			crossed[i] = false;
			crossed_with_neighbour[i] = false; 
			for(int j=0; j<room_nums; j++){
				adj[i][j] = false;
			}
		}
		
		//satisfication point
		for(int i=0; i<room_nums; i++){
			int s = scan.nextInt();
//			System.out.println("satisfication_point:" + s);
			if(s>=1 && s<=10){
				satisfication[i] = s;
			}else{
				System.out.println("Error Input!");
				return;
			}
		}
		
		//create graph
		for(int i = 0; i<door_nums; i++){
			int t = scan.nextInt()-1;
			int s = scan.nextInt()-1;
//			System.out.println("t=" + t +",s=" + s);
			adj[t][s] = true;
			adj[s][t] = true;
		}
		
			
		
		
		int totalMax = TotalMax(router_nums,room_nums,crossed,crossed_with_neighbour,satisfication,adj);
		System.out.println(totalMax);
		
		
		
		
		
		
		
		
	}


}
