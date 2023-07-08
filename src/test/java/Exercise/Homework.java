//package Exercise;
//
//public class Homework {
//
//    public static boolean ih(int i, int i1) {
//
//        //Given two temperatures, return true if one is less than 0
//        // and the other is greater than 100.
//        //
//        //
//        //icyHot(120, -1) → true
//        //icyHot(-1, 120) → true
//        //icyHot(2, 120) → false
//
//        public static boolean ih(int temp1, int temp2){
//            if ((temp1<0 && temp2 >100) || (temp1>100 && temp2<0)){
//                return true;
//            }else {
//                return false;
//            }
//        }
////Given a string, return a new string where the last 3 chars are now in
//// upper case. If the string has less than 3 chars, uppercase whatever is there.
//// Note that str.toUpperCase() returns the uppercase version of a string.
////
////
////endUp("Hello") → "HeLLO"
////endUp("hi there") → "hi thERE"
////endUp("hi") → "HI"
//
//        public static String end(String){
//            if (str.length()<=3) {
//                return str.toUpperCase();
//            }else{
//                int cut = str.length() -3;
//                String front = str.substring(0,cut);
//                String back = str.substring(cut);
//                return front + back.toUpperCase();
//            }
//
////Given an array of ints, return a new array length 2 containing the
//// first and last elements from the original array. The original array will
//// be length 1 or more.
////makeEnds([1, 2, 3]) → [1, 3]
////makeEnds([1, 2, 3, 4]) → [1, 4]
////makeEnds([7, 4, 6, 2]) → [7, 2]
//
//        public static int[] makeEnds(int[] nums){
//            int[] result = new int[2];
//            result[0] = nums[0];
//            result[1] = nums[nums.length-1];
//            return result;
//        }
//
//
//
//   // Given three int values, a b c, return the largest.
//     //   intMax(1, 2, 3) → 3
//       // intMax(1, 3, 2) → 3
//      //  intMax(3, 2, 1) → 3
//
//    public int intMax(int a, int b, int c) {
//
//        int MAX = a;
//
//        if ( b > MAX) MAX = b;
//
//        if ( c >MAX) MAX = c;
//
//        return MAX;
//    }
//
//    //Given an array of ints length 3, return the sum of all the elements.
//     //   sum3([1, 2, 3]) → 6
//     //   sum3([5, 11, 2]) → 18
//      //  sum3([7, 0, 0]) → 7
//
//    public int sum3(int[] nums) {
//
//        return nums[0] + nums[1] + nums[2];
//    }
//
//    //Given two temperatures, return true if one is less than 0 and the other is greater than 100.
//   // icyHot(120, -1) → true
//   // icyHot(-1, 120) → true
//   // icyHot(2, 120) → false
//
//public int in (int temp2, String Str, Object str) {
//    int temp1 = 0;
//    if (( temp1 < 0 && temp2 > 100 ) || ( temp1 > 100 && temp2 < 0 )) {
//        return true;
//    } else {
//        return false;
//    }
//
//    // Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.
//    // endUp("Hello") → "HeLLO"
//    // endUp("hi there") → "hi thERE"
//    //endUp("hi") → "HI"
//
//    public static String end ( String str){
//        if (Str.length() <= 3) {
//            return Str.toUpperCase();
//        } else {
//            int cut = str.length() - 3;
//            String front;
//            front = str.substring(0, cut);
//            String back = str.Substring(cut);
//            return front + back.toUpperCase();
//        }
//
//        //Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
//        // makeEnds([1, 2, 3]) → [1, 3]
//        // makeEnds([1, 2, 3, 4]) → [1, 4]
//        //makeEnds([7, 4, 6, 2]) → [7, 2]
//
//        public static int[] makeEnds ( int[] nums){
//            int[] result = new int[2];
//            result[0] = nums[0];
//            result[1] = nums[nums.length - 1];
//            return result;
//
//        }
//        // We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
//        // hasTeen(13, 20, 10) → true
//        // hasTeen(20, 19, 10) → true
//        //  hasTeen(20, 10, 13) → true
//
//        public boolean hasTeen ( int a, int b, int c){
//            return ( ( a >= 13 && a <= 19 ) || ( b >= 13 && b <= 19 ) || ( c >= 13 && c <= 19 ) );
//            return true;
//        }
//        return false;
//    }
//}
//    // Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
//    // everyNth("Miracle", 2) → "Mrce"
//    // everyNth("abcdefg", 2) → "aceg"
//    //  everyNth("abcdefg", 3) → "adg"
//
//    public String everyNth ( String str,int n){
//        String temp = "";
//        for (int i = 0; i < str.length(); i = i + n) {
//            temp += str.charAt(i);
//        }
//        return temp;
//    }
//
//    //We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
//    //loneTeen(13, 99) → true
//    // loneTeen(21, 19) → true
//    // loneTeen(13, 13) → false
//
//    public boolean loneTeen ( int a, int b){
//        if (( a >= 13 && a <= 19 ) && ( b < 13 || b > 19 ))
//            return true;
//        else if (( b >= 13 && b <= 19 ) && ( a < 13 || a > 19 ))
//            return true;
//        else
//            return false;
//    }
//
//   // Given two int values, return their sum. Unless the two values are the same, then return double their sum.
//    //  sumDouble(1, 2) → 3
//   // sumDouble(3, 2) → 5
//   // sumDouble(2, 2) → 8
//
//    public int sumDouble(int a, int b) {
//        if(a==b){
//            return ((a+b)*2);
//        }
//        else{
//            return a+b;
//        }
//    }
//   // Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
//   // delDel("adelbc") → "abc"
//   // delDel("adelHello") → "aHello"
//   // delDel("adedbc") → "adedbc"
//
//
//    public String delDel(String str) {
//
//        if (str.startsWith("del", 1))
//
//        return str.charAt(0) + str.substring(4, str.length());
//  else
//        return str;
//
//    }
//    //Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
//       //posNeg(1, -1, false) → true
//   // posNeg(-1, 1, false) → true
//   // posNeg(-4, -5, true) → true
//    public boolean posNeg(int a, int b, boolean negative) {
//        if(a<0 && b>0 && negative==false){
//            return true;
//        }
//        else if(a>0 && b<0 && negative==false){
//            return true;
//        }
//        else if(a<0 && b<0 && negative==true){
//            return true;
//        }
//        else {
//            return false;
//        }
//
//   // We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
//   // parrotTrouble(true, 6) → true
//   // parrotTrouble(true, 7) → false
//   // parrotTrouble(false, 6) → false
//
//        public boolean parrotTrouble(boolean talking, int hour) {
//            if(talking && (hour < 7 || hour > 20)) {
//                return true;
//            }
//            return false;
//        }
//
//      //  Return true if the given string contains between 1 and 3 'e' chars.
//        // stringE("Hello") → true
//       // stringE("Heelle") → true
//        //stringE("Heelele") → false
//        public boolean stringE(String str) {
//            int len = str.length();
//            int counter = 0;
//            for (int i = 0; i < len; i++) {
//                if (str.charAt(i) == 'e')
//                counter++;
//            }
//            if (counter >= 1 && counter <= 3)
//            return true;
//  else
//            return false;
//        }
//
//     //   Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
//       // diff21(19) → 2
//        // diff21(10) → 11
//    //  diff21(21) → 0
//
//        public int diff21(int n) {
//            if(n<=21){
//                return 21-n;
//            }
//            else if(n>21){
//                return ((n-21)*2);
//            }
//            return 0;
//        }
// // Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
// // notString("candy") → "not candy"
// // notString("x") → "not x"
// // notString("not bad") → "not bad"
//
//        public String notString(String str) {
//            if(str.length() > 2 && str.substring(0,3).equals("not")) {
//                return str;
//            }
//            return "not " + str;
//        }
//  // Given a string, return a new string where the first and last chars have been exchanged.
//    // frontBack("code") → "eodc"
//  //  frontBack("a") → "a"
//  //frontBack("ab") → "ba"
//
//    public static void end() {
//    }
//
//    public static void end() {
//    }
//
//    public static void end() {
//    }
//
//    public static void makeEnds() {
//    }
//
//    public static void makeEnds() {
//    }