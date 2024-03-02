package Example01;

public class Example01 {
    public static void main(String[] args) {
        /*String s = "Marra";
1.soru
        for (int i = s.length() - 1; i >= 0; i--) {

            String c = s.substring(i, i + 1);

            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.println(c);
            }
        }

        //2.soru
        String s = "Apex";
        String result = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }

        System.out.println(result);

//Output?
//3.soru
        String result = "";

        for (int i = 1; i < 4; i++) {

            for (int j = (5 - i); j > 1; j--) {
                result = result + (i + j);
            }

            System.out.println(result);
            result = "";
        }
        //4.soru
        int i = 1;
        int product = 1;
        while (i <= 4) {

            product = product * i;
            i++;
            System.out.println(product);

        }
//Output?

        int m = 10;
        int n = 2;
        int sum = 0;

        while(m>n){

            m--;
            n = n + 2;
            sum = sum + m + n;

        }

        System.out.println(sum);
//Output?
//5.soru
        int num = 0;

        do {

            if (num % 2 == 0) {
                num += 2;              // means==>  num = num + 2
            }

        } while (num < 7);

        System.out.println(num);
//Output?
*/
         //6.soru
        int i = 758;
        int s = 0;

        do {

            s = s + i % 10;
            i = i / 10;

        } while (i != 0);

        System.out.println(s);

//Output?

    }
}
