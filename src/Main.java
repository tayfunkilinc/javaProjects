import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] names = {{"Ali", "Jim"},{"Mike","Jane", "Joe"},{"Mike", "Martin"},{"Ronald"}};

        System.out.println(Arrays.deepToString(names));//[[Ali, Jim], [Mike, Jane, Joe], [Mike, Martin], [Ronald]]

        String[][] langs = new String[4][];
        System.out.println(Arrays.deepToString(langs));
        //[null, null, null, null]

        langs[0] = new String[]{"apple", "banana"};
        langs[1] = new String[]{"cat", "dog", "bird"};
        langs[2] = new String[]{"java", "python", "javascript", "swift"};
        langs[3] = new String[]{"red", "blue"};

        System.out.println(Arrays.deepToString(langs));
        //[[apple, banana], [cat, dog, bird], [java, python, javascript, swift], [red, blue]]

        for (String[] inner : langs){ //string[]===string[][]
            System.out.println(Arrays.toString(inner));
        }
        /*
        [apple, banana]
        [cat, dog, bird]
        [java, python, javascript, swift]
        [red, blue]
         */
        for (String[] inner : langs){

            for (String elementOfInner : inner){
                System.out.println(elementOfInner);
            }
            System.out.println("-----------------");
        }

                    /*
         Homework: Print the every single element of arrays in complex array which contains "a" on the console....
            String[][] langs = new String[4][]; //outer complex structure is created, but inner simple structures are nıt...
            System.out.println(Arrays.deepToString(langs)); //[null, null, null, null]

            langs[0] = new String[]{"apple", "banana"};
            langs[1] = new String[]{"cat", "dog", "bird"};
            langs[2] = new String[]{"java", "python", "javascript", "swift"};
            langs[3] = new String[]{"red", "blue"};
            System.out.println(Arrays.deepToString(langs)); //[[apple, banana], [cat, dog, bird], [java, python, javascript, swift], [red, blue]]
                */






    }
}