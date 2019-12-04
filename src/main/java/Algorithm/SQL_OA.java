package Algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class SQL_OA {
    // I try to solve this question by using Dynamic Programming
    public static int getMostMoney(String[] games, int[] time, int[] money){
        int l = time.length;   //The lengths of the three lists should be same;
        int t = 120;            //The total time
        int[] played = new int[l];
        int[][] val = new int[l][121];
        for(int i=1;i<l;i++){
            for(int j=1;j<121;j++){
                if(j<time[i]){
                    val[i][j] = val[i-1][j];
                }else
                    val[i][j]=Math.max(val[i-1][j],val[i-1][j-time[i]]+money[i]);
            }
        }
        for(int i = l-1;i>=1;i--){
            if(val[i][t] != val[i-1][t]){
                System.out.println(games[i]);   //print the best combination of games
                t -= time[i];
            }
        }

        return val[l-1][120];       //In this question, Adam can earn $780 at most;
    }



    public static Map<String,Integer> actorActMostMovies(List<String> actorName){
        Map<String,Integer> m = new HashMap<>();
        for(int i = 0;i<actorName.size();i++){
            if(!m.containsKey(actorName.get(i))){
                m.put(actorName.get(i),1);
            }else{
                m.replace(actorName.get(i),m.get(actorName.get(i))+1);
            }
        }

//        Map<String,Integer> ans = new HashMap<>();
        Map<String,Integer> ans = m.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).limit(10).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        ans.forEach((key, value) -> System.out.println(key + " : " + value));
        return ans;
    }

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Leonardo DiCaprio");
        l.add("Samuel L. Jackson");
        l.add("Tom Cruise");
        l.add("Leonardo DiCaprio");
        String[] games = {"Pac-man","Speed Racer","Pump it Up","Space Invaders","Mario Bros","Mortal Kombat","Atari Breakout","Super Tetris","Star Wars","Street Fighter II"};
        int[] time = {75,45,30,35,30,15,60,90,20,10};
        int[] money = {250,280,150,120,200,100,300,350,110,90};
        System.out.println(getMostMoney(games,time,money));
//        actorActMostMovies(l);
    }
}
