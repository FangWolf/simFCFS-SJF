public class Mission implements Comparable<Mission> {
    String name;
    int ArrivalTime;    //到达时间
    int ServiceTime;    //服务时间
    int StartingTime;   //开始时间
    int FinishingTime;  //完成时间
    int TurnAroundTime; //周转时间
    double WeightTurnAroundTime; //带权周转时间
    String ServiceStatus; //运行状态
    int Stime;

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

    public double getWeightTurnAroundTime() {
        return WeightTurnAroundTime;
    }

    public void setWeightTurnAroundTime(double weightTurnAroundTime) {
        WeightTurnAroundTime = weightTurnAroundTime;
    }

    public String getServiceStatus() {
        return ServiceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        ServiceStatus = serviceStatus;
    }

    public int getStime() {
        return Stime;
    }

    public void setStime(int stime) {
        Stime = stime;
    }

    @Override
    public int compareTo(Mission o) {
        if (this.ArrivalTime >= o.getArrivalTime()) {
            return 1;
        }
        return -1;
    }
}
