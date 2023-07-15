package search;

import java.util.*;

public class BinarySearch {

	public static int binarySearch(int data[],int start,int end,int key) {
		
		if(start>end) {
			return -1;
		}
		int mid = (start+end)/2;
		if(key == data[mid]) {
			return mid+1;
		}else if(key > data[mid]) {
			return binarySearch(data,mid+1,end,key);
		}else {
			return binarySearch(data,start,mid-1,key);
		}
	}
	
	public static void main(String[] args) {
		
		int data[] = {1,2,3,10,20,31,56,78,81,100};
		Scanner scanner = new Scanner(System.in);
		System.out.println("찾고싶은 값을 입력해주세요 :");
		int key = scanner.nextInt();
		int index = binarySearch(data,0,data.length-1,key);
		if(index != -1) {
			System.out.print("찾는 값은 "+index+"번째에 있습니다.");
		}else {
			System.out.print("찾는 값이 존재하지 않습니다.");
		}

	}

}
