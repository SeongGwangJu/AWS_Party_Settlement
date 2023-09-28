package PartyPay;

import java.sql.SQLNonTransientConnectionException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int moneyToPay = 0;
        int totalExpense = 0;
        String category;
        int expense;
        int numberPeople;
        String peopleToPay;
        int expensePerPerson;

        System.out.println("중강파티 정산을 시작합니다.\n");

        while(true) {
            System.out.print("정산 항목 >>> ");
            category = sc.nextLine();

            if(category.contains("끝") || category.contains("end")) {
                System.out.println("totalExpense = " + totalExpense);
                System.out.println("\n 종강파티 땐 모두 모여서 또 놀아요.\n 추석 잘쉬고 다음 주에 봬요.");
                break;
            }

            System.out.print("비용 >>> ");
            expense = sc.nextInt();
            totalExpense += expense;

            System.out.print("인원수 :");
            numberPeople = sc.nextInt();
            sc.nextLine();

            System.out.print("여기까지의 비용을 지불할 사람을 입력 >>>");
            peopleToPay = sc.nextLine();

            expensePerPerson = (expense / numberPeople);
            moneyToPay += expensePerPerson;

            System.out.println(peopleToPay + "이(가) 입금할 금액 :" + moneyToPay);

            System.out.println("============================");
        }
    }
}
