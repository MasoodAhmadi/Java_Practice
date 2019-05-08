package com.company;
import java.util.ArrayList;
public class Foodball {
    public static void main (String [] args){
        Team barcelona = new Team("FC Barcelone");
        barcelona.getteamname();
        barcelona.setMaxSize(16);
        barcelona.addfootballer(new footballer("Brain",  2));
        barcelona.addfootballer(new footballer("Mikael", 1));
        barcelona.addfootballer(new footballer("pikka",  3));
        barcelona.addfootballer(new footballer("Jannati",1));
        barcelona.addfootballer(new footballer("Khan",2));
        barcelona.printdata();
        System.out.println();
        System.out.println("Number of players are :  "+barcelona.getMaxsize());
        System.out.println("Total Goals :  "+barcelona.getGoals());
    }
}
class  Team {
    private   String teamname;
    private   String playername;
    private  int goals;
    private  footballer nwfootballer;
    private ArrayList<footballer> player=new ArrayList<>();
  private int maxSize;
    public Team() {
        teamname="Unknown";
        playername="Unknown";
      //  nwfootballer=(new footballer("N/A","N/A"));
    }
    public Team(String ateamname,String aplayername) {
        teamname=ateamname;
        playername=aplayername;
         // nwfootballer=(new footballer("N/A","N/A"));
    }
    public Team (String ateamname,String aplayername,footballer afootballer ){
        teamname=ateamname;
        playername=aplayername;
        //   nwfootballer=afootballer;
    }
    public Team (String ateamname,String aplayername, int agoal){
        teamname=ateamname;
        playername=aplayername;
        goals=agoal;
    }
    public Team(String ateamname) {
        teamname=ateamname;
    }
    public String getteamname() {
        return teamname;
    }
    public void setTeams(String aTeamname){
        teamname=aTeamname;
    }
    public void setMaxSize(int aMaxsise){
        maxSize=aMaxsise;
    }
    public Integer getMaxsize(){
        return maxSize;
    }
    public String getPlayername(){
        return playername;
    }
    public int getGoals(){
        int goals=0;
        for (footballer p: player ){
            goals += p.getGoals();
        }
        return goals;
    }
    public void setGoal (int agoal){
        goals=agoal;

    }
    public void addfootballer(footballer afootballer){
        player.add(afootballer);
    }
    public void addplayername(String afootballer,int agoal){
        player.add(new footballer(afootballer,agoal));
    }
    public void addplayername(footballer afootballer){
        playername+=afootballer.getname();
        playername+=afootballer.getGoals();
    }
    void printdata(){
        System.out.println("Team : "+teamname);

        for( footballer c : player ){
            c.printdata();
        }
       // int c=goals.size();
    //    System.out.println("Size of the player: "+c);
    }
}
class footballer{
    private String name;
    private int goals;
    public footballer(footballer afootballer) {
    }
    public footballer(String aplayername, int agoal) {
        name =aplayername;
        goals=agoal;
    }
    public int getGoals(){
        return goals;
    }
    public String getname(){
        return name;
    }
    public void setname(String aname){
        name=aname;
    }
    public void setGoals(int agoals){
        goals=agoals;
    }
    public void printdata() {
        System.out.println (" Player : " + name + ", goals " + goals);
    }
}

