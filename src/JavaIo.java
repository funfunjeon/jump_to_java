import java.io.*;
import java.util.Scanner;

public class JavaIo {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("C:/Users/jeon/Desktop/sample.txt"));
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String s = "Life is too short";
        pw.println(s);
        s="you need python";
        s=s.replaceAll("python", "java");
        pw.println(s);

        pw.close();
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/jeon/Desktop/sample.txt"));

        while(true) {
            String line = br.readLine();
            if (line==null) break;  // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            System.out.println(line);
        }
        br.close();

    }
}
