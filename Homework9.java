import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        HashMap<String, String> db = new HashMap<>();

        try {
            Scanner fileScanner = new Scanner(new File("db.txt"));

            while (fileScanner.hasNext()) {
                String id = fileScanner.next();
                String password = fileScanner.next();

                db.put(id, password);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("db.txt 파일을 찾을 수 없습니다.");
            return;
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");

            System.out.print("id : ");
            String inputId = sc.nextLine().trim();

            if (!db.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.print("password : ");
            String inputPass = sc.nextLine().trim();

            String correctPass = db.get(inputId);

            if (correctPass.equals(inputPass)) {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
            }
        }

        sc.close();
    }
}