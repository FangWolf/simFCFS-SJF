import java.util.List;

public class Dispatch {
    public Dispatch(List<Mission> list) {
        System.out.println("准备调度作业");
        for (Mission m : list) {
            System.out.println(m.getName() + "-" + m.getServiceStatus());
        }
        //第一个
        //开始时间
        list.get(0).setStartingTime(list.get(0).getArrivalTime());
        //完成时间
        list.get(0).setFinishingTime(list.get(0).getArrivalTime() + list.get(0).getServiceTime());
        //周转时间
        list.get(0).setTurnAroundTime(list.get(0).getFinishingTime() - list.get(0).getArrivalTime());
        //带权周转时间
        list.get(0).setWeightTurnAroundTime((double) list.get(0).getTurnAroundTime() / (double) list.get(0).getServiceTime());
        //状态
        list.get(0).setServiceStatus("F");
        System.out.println("处理=" + list.get(0).getName() +
                " 周转时间=" + list.get(0).getTurnAroundTime() +
                " 带权周转时间=" + list.get(0).getWeightTurnAroundTime());
        for (Mission m : list) {
            System.out.println(m.getName() + "-" + m.getServiceStatus());
        }
        //第二个及以后的
        for (int i = 1; i < list.size(); i++) {
            //开始时间
            list.get(i).setStartingTime(list.get(i - 1).getFinishingTime());
            //完成时间
            list.get(i).setFinishingTime(list.get(i).getStartingTime() + list.get(i).getServiceTime());
            //周转时间
            list.get(i).setTurnAroundTime(list.get(i).getFinishingTime() - list.get(i).getArrivalTime());
            //带权周转时间
            list.get(i).setWeightTurnAroundTime((double)list.get(i).getTurnAroundTime() / (double) list.get(i).getServiceTime());
            //状态
            list.get(i).setServiceStatus("F");
            System.out.println("处理=" + list.get(i).getName() +
                    " 周转时间=" + list.get(i).getTurnAroundTime() +
                    " 带权周转时间=" + list.get(i).getWeightTurnAroundTime());
            for (Mission m : list) {
                System.out.println(m.getName() + "-" + m.getServiceStatus());
            }
        }
    }
}
