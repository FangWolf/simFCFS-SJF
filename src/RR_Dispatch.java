import java.util.LinkedList;
import java.util.List;

public class RR_Dispatch {
    public RR_Dispatch(List<Mission> list) {
        //排好序的list放入队列中
        LinkedList<Mission> queue = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            queue.offer(list.get(i));
        }

        int RR = 4;//时间片大小
        int temp = 0;
        try {
            while (queue.getFirst() != null) {
                Mission mission = queue.getFirst();
                if (mission.getStime() <= RR) {
                    mission.setServiceStatus("F");
                    mission.setFinishingTime(mission.getFinishingTime() + mission.getStime() + temp);
                    mission.setTurnAroundTime(mission.getFinishingTime() - mission.getArrivalTime());
                    mission.setWeightTurnAroundTime((double) mission.getTurnAroundTime() / (double) mission.getServiceTime());
                    System.out.println(mission.getName() + " 周转时间：" + mission.TurnAroundTime + " 带权周转时间" + mission.WeightTurnAroundTime);
                    System.out.println(mission.getName() + "-" + mission.getServiceStatus());
                    temp = mission.getFinishingTime();
                    queue.pollFirst();
                    for (Mission m : queue) {
                        System.out.println(m.getName() + "-" + m.getServiceStatus());
                    }
                    System.out.println("继续处理");
                } else {
                    mission.setStime(mission.getStime() - RR);
                    for (Mission m : queue) {
                        m.setFinishingTime(mission.getFinishingTime() + RR);
                    }
                    queue.pollFirst();
                    queue.offer(mission);
                }
            }
        } catch (Exception e) {
        }
    }
}
