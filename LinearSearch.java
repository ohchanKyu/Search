package search;

import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		
		int data[] = {1,2,3,99,10,88,50,100,20,81};
		Scanner scanner = new Scanner(System.in);
		System.out.println("찾고싶은 값을 입력해주세요 :");
		int key = scanner.nextInt();
		int index = 0;
		boolean success = false;
		while(index<data.length) {
			if(data[index]==key) {
				System.out.print("찾으시는 값은 "+(index+1)+"번째에 있습니다.");
				success = true;
				break;
			}
			index++;
		}
		if(success==false) {
			System.out.print("찾는 값이 존재하지 않습니다.");
		}
	}

}
