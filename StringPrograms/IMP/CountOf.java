package StringPrograms.IMP;

public class CountOf {
    public static void main(String[] args) {
        String str = "Deepesh Prajapati online compiler java programming Deepesh Prajapati";
        String[] str1 = str.split(" ");
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].equals("processed")) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < str1.length; j++) {
                if (str1[i].equals(str1[j])) {
                    count++;
                    str1[j] = "processed";
                }
            }
            System.out.println("Count of '" + str1[i] + "' - " + count);
        }
    }
}
