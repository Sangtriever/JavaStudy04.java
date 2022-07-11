// 제로베이스 과제 04
// 주민등록번호 생성 프로그램
// 작성자 : 이상현

import java.util.Random;
import java.util.Scanner;
public class 과제4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("[주민등록번호 게산]");

        System.out.print("출생년도를 입력해 주세요.(yyyy) : ");
        int year = in.nextInt();
        int yearresult = year%100;

        System.out.print("출생월을 입력해 주세요.  (mm)   : ");
        int month = in.nextInt();
        if(month >12) {
            System.out.println("출생월을 다시 입력해 주세요.(1~12)");
            return;
        }

        System.out.print("출생일을 입력해 주세요.  (dd)   : ");
        int day = in.nextInt();
        if(day >31){
            System.out.println("출생일을 다시 입력해 주세요.(1~31)");
            return;
        }

        System.out.print("성별을 입력해 주세요.    (m/f)  : ");
        String gender = in.next();
        if(gender.equals("m") ||gender.equals("M") || gender.equals("f") || gender.equals("F")) {
        }else {
            System.out.println("성별을 다시 입력해 주세요.(m/f)");
            return;
        }


        // 주민번호 앞자리
        String front = String.format("%d%d%d",yearresult,month,day);
        int num7=0;
        if (year >=1800 && year <=1899) {
            num7=9;
        }else if(year >=1900 && year <=1999){
            num7=1;
        }else{
            num7=3;
        }
//        System.out.println(gender);
        if(gender.equals("f")){
            num7++;

        }
        if(num7==10){
            num7=0;
        }


        Random random = new Random();
        int ran = random.nextInt(1000000);
//        System.out.println(String.format("%06d",ran));

        System.out.println(String.format("주민등록번호 %02d%d%d-%d%06d ",year,month,day,num7,ran));



    }
}
