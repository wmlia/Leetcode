public class Test66{
    public static void main(String[] args) {
//        给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
//        最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
//        你可以假设除了整数 0 之外，这个整数不会以零开头。
        int[] digits={9};


        int[] plusOne=plusOne(digits);

        for (int i = 0; i <plusOne.length ; i++) {
            if(i!=plusOne.length-1){
                System.out.print(plusOne[i]+",");
            }else {
                System.out.print(plusOne[i]);
            }

        }

    }

    public static int[] plusOne(int[] digits) {
        for (int i = 0; i <digits.length ; i++) {
            if(digits[digits.length-1-i]<9){
                digits[digits.length-1-i]+=1;
                return digits;
            }
            digits[digits.length-1-i]=0;
        }
        int [] result = new int[digits.length+1];
        result[0]=1;
        return result;
    }
}
