public class Mission {
    String name;
    int ArrivalTime;    //到达时间
    int ServiceTime;    //服务时间
    int StartingTime;   //开始时间
    int FinishingTime;  //完成时间
    int TurnAroundTime; //周转时间

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    public int getServiceTime() {
        return ServiceTime;
    }

    public void setServiceTime(int serviceTime) {
        ServiceTime = serviceTime;
    }

    public int getStartingTime() {
        return StartingTime;
    }

    public void setStartingTime(int startingTime) {
        StartingTime = startingTime;
    }

    public int getFinishingTime() {
        return FinishingTime;
    }

    public void setFinishingTime(int finishingTime) {
        FinishingTime = finishingTime;
    }

    public int getTurnAroundTime() {
        return TurnAroundTime;
    }

    public void setTurnAroundTime(int turnAroundTime) {
        TurnAroundTime = turnAroundTime;
    }
}
