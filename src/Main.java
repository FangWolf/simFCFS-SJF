import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Mission> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入任务数");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("输入作业名 到达时间 服务时间");
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String[] ss = s.split(" ");
            Mission mission=new Mission();
            mission.setName(ss[0]);
            mission.setArrivalTime(Integer.parseInt(ss[1]));
            mission.setServiceTime(Integer.parseInt(ss[2]));
            mission.setStime(Integer.parseInt(ss[2]));
            mission.setServiceStatus("W");  //状态初始为W
            list.add(mission);
        }
        Collections.sort(list);//按到达时间排序
        new RR_Dispatch(list);//时间片轮转调度
        //new Dispatch(list); //调度
    }
}
