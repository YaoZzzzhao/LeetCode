//package LeetCode;
//
///**
// * Write a function to find the longest common prefix string amongst an array of strings.
// *
// * If there is no common prefix, return an empty string "".
// *
// * Example 1:
// *
// * Input: ["flower","flow","flight"]
// * Output: "fl"
// * Example 2:
// *
// * Input: ["dog","racecar","car"]
// * Output: ""
// * Explanation: There is no common prefix among the input strings.
// */
//
//public class LeetCode14 {
//    public static String longestCommonPrefix(String[] strs) {
//        int r = strs.length;
//        int c = 0;
//        for(String i:strs){
//            if( i == "") return "";
//            int m = i.toCharArray().length;
//            if(m>c){
//                c = m;
//            }
//        }
//        char[] ans = new char[c];
//        char[][] chars = new char[r][c];
//
//        for(int i = 0;i<r;i++){
//            chars[i] = strs[i].toCharArray();
//        }
//
//        for(int j=0;j<c;j++){
//            if(chars[0][j] == ){
//                j = c+1;
//            }
//            char check = chars[0][j];
//            for(int i = 0;i<r;i++){
//                if(check != chars[i][j]){
//                    i = r;
//                    j = c+1;
//                    break;
//                }
//            }
//            if(j != c+1) ans[j] = check;
//        }
//
//        String string = new String(ans);
//        return string.trim();
//    }
//
//    public static void main(String[] args){
//        String[] test = {"aa","a"};
//        String ans = longestCommonPrefix(test);
//        System.out.println(ans);
//    }
//}
