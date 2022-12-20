package lotto;

import java.util.Random;

public class lott2 {
	public static void main(String[] args)  {

        Random rd = new Random();//랜덤 객체 생성
          
        	System.out.println(rd.nextInt(5)+1+"조");

            for(int i=0;i<6;i++) {
                System.out.print("["+(rd.nextInt(10))+"]"); //번호 출력
            }
        }
    }
