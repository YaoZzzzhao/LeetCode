package Algorithm;

import java.util.Arrays;

public class OA {
    static int shortestSubstring(String s) {

//        boolean[] arr = new boolean[26];
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (arr[s.charAt(i) - 'a'] == false) {
//                arr[s.charAt(i) - 'a'] = true;
//                count++;
//            }
//        }
//        boolean[] copy = new boolean[26];
//        for(int j = 0;j<26;j++){
//            copy[j] = arr[j];
//        }
//        int n = 0;      // tell if all char occur in the substring
//        int length = 0;     //record the length of every substring
//        int min = s.length()-1;
//        int index = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if(copy[s.charAt(i) - 'a'] == true){
//                copy[s.charAt(i) - 'a'] = false;
//                n++;
//            }else if(s.charAt(i) == s.charAt(index)){
//                index++;
//                length--;
//            }
//            length ++;
//            if(n==count){
//                min = Math.min(min,length);
//                length = 0;
//                n=0;
//                while ([s.charAt(start)] > 1)
//                {
//                    if (curr_count[s.charAt(start)] > 1)
//                        curr_count[s.charAt(start)]--;
//                    start++;
//                }
//            }
//        }
//        return min;

        final int MAX_CHARS = 100000;
        int n = s.length();
        // Count all distinct characters.
        int dist_count = 0;
        boolean[] visited = new boolean[MAX_CHARS];
        Arrays.fill(visited, false);
        for (int i=0; i<n; i++)
        {
            if (visited[s.charAt(i)] == false)
            {
                visited[s.charAt(i)] = true;
                dist_count++;
            }
        }
        int start = 0, start_index = -1;
        int min_len = Integer.MAX_VALUE;
        int count = 0;
        int[] curr_count =  new int[MAX_CHARS];
        for (int j=0; j<n; j++)
        {
            // Count occurrence of characters of sing
            curr_count[s.charAt(j)]++;
            // If any distinct character matched,
            // then increment count
            if (curr_count[s.charAt(j)] == 1 )
                count++;
            // if all the characters are matched
            if (count == dist_count)
            {
                // Try to minimize the window i.e., check if
                // any character is occurring more no. of times
                // than its occurrence in pattern, if yes
                // then remove it from starting and also remove
                // the useless characters.
                while (curr_count[s.charAt(start)] > 1)
                {
                    if (curr_count[s.charAt(start)] > 1)
                        curr_count[s.charAt(start)]--;
                    start++;
                }
                // Update window size
                int len_window = j - start + 1;
                if (min_len > len_window)
                {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
        // Return subsing starting from start_index
        // and length min_len
//        return s.subsing(start_index, start_index+min_len).length();
        return start_index+min_len - start_index;
    }

    public static void main(String[] args) {
        String s = "abbaacc";
        System.out.println(shortestSubstring(s));
    }
}
