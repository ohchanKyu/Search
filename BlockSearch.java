package search;

import java.util.Scanner;

class Block
{
	int maxData;
	int data[];
	public Block(int data[],int number[],int blockSize) {
		this.data = new int[blockSize];
		for(int i=0;i<blockSize;i++) {
			if(number[0]+i >= data.length) {
				break;
			}
			this.data[i] = data[number[0]+i];
		}
		number[0]+=blockSize;
		
		maxData = data[0];
		for(int i=0;i<this.data.length;i++) {
			if(this.data[i] > maxData) {
				maxData = this.data[i];
			}
		}
	}
}

public class BlockSearch {

	public static void blockSearch(Block block[],int key) {
		
		int searchBlockNumber = -1;
		for(int i=0;i<block.length;i++) {
			int maxNumber = block[i].maxData;
			if(key <= maxNumber) {
				searchBlockNumber = i+1;
				break;
			}
		}
		if(searchBlockNumber == -1) {
			System.out.println("찾는 값이 Block에 없습니다.");
		}else {
			System.out.println("찾는 값은 "+searchBlockNumber+"번째 Block에 있습니다.");
		}
		int searchDataArray[] = block[searchBlockNumber-1].data;
		int index = -1;
		for(int i=0;i<searchDataArray.length;i++) {
			if(key == searchDataArray[i]) {
				index = i+1;
				System.out.println((i+1)+"번쨰 Index에 존재합니다");
				break;
			}
		}
		if(index == -1) {
			System.out.println("찾는 값이 해당 Block에 존재하지 않습니다.");
		}
	}
	
	public static void main(String[] args) {
		
		int blockSize = 4;
		int data[] = {8,18,13,5,31,26,22,33,42,38,46,40,54,65,61};
		
		int blockNumber = 0;
		
		if(data.length % blockSize != 0) {
			blockNumber = data.length / blockSize+1;
		}else {
			blockNumber = data.length / blockSize;
		}
		Block block[] = new Block[blockNumber];
		
		int count[] = {0};
		for(int i=0;i<block.length;i++) {
			block[i] = new Block(data,count,blockSize);
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("찾고싶은 값을 입력해주세요 :");
		int key = scanner.nextInt();
		blockSearch(block,key);
		
	}

}
