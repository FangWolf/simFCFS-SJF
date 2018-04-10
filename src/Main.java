import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Mission> list = new ArrayList<>();
        Mission mission = new Mission();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String[] ss = s.split(" ");
            mission.setName(ss[0]);
            mission.setArrivalTime(Integer.parseInt(ss[1]));
            mission.setServiceTime(Integer.parseInt(ss[2]));
            list.add(mission);
        }

    }
}
