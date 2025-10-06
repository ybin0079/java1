import  java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 수를 입력할 예정인가요?:");
        int size = sc.nextInt();
        int[] num = new int[size];

        System.out.print("수를 입력하세요:");
        for(int i=0;i< size;i++){
            num[i] = sc.nextInt();
        }

        int min = num[0];
        int max = num[0];

        for( int i =1; i<num.length; i++){
            if (num[i]>max)
                max=num[i];
            if (num[i]<min)
                min=num[i];

        }
        System.out.println("최대값:"+ max);
        System.out.println("최소값"+min);

        sc.close();
        }




    }
