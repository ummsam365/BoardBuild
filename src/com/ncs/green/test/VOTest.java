package com.ncs.green.test;
import com.ncs.green.vo.BoardVO;

public class VOTest {

	public static void main(String[] args) {
		// BoardVO
		BoardVO vo = new BoardVO();
		vo.setSeq(100);
		vo.setId("banana");
		vo.setTitle("Ant와 Maven 의 비교");
		
		System.out.println("*** AntBuild Project Test ***");
		System.out.println("1. BoardVO 직접출력 =>"+vo);
		
		// VOService 로 출력 하기
		// => VOService 클래스를 이용해서 위의 vo의 내용을 출력하는 구문을 완성하고
		//    실행 결과를 제출 하세요 ...    
		
	} // main
} // class
