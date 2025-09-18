public class DataManipulation {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2},
                {3,4,5},
                {6,7,8,9,},
                {},
                null
        };

        int addR = sumArray(matrix);
        System.out.println("Total Sum of the Jagged Array Elements is: " + addR);

        String str = "Java is fun";
        String revStr = reverseWords(str);
        System.out.println("Original String is: " + str);
        System.out.println("Reversed String is: " + revStr);

    }
    public static int sumArray(int[][] arr) {
        if (arr == null) return 0;
        int sum = 0;
        for(int rowIndex = 0; rowIndex < arr.length; rowIndex++){
            int[] row = arr[rowIndex];
            if(row == null) {
                continue;
            }
            for(int col = 0; col < row.length; col++){
                sum += row[col];
            }
        }
        return sum;
    }
    public static String reverseWords(String sentence){
        if (sentence == null || sentence.trim().isEmpty()){
            return sentence;
        }

        String[] words = sentence.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if(i != 0) sb.append(" ");
        }
        return sb.toString();
    }
}
