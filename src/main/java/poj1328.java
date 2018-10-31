import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created By xfj on 2018/10/31
 */
public class poj1328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] split = line.split(" ");
        int n=Integer.parseInt(split[0]);
        int d=Integer.parseInt(split[1]);
        ArrayList<Point> points = new ArrayList<Point>();

        for(int i=0;i<n;i++){
            line = sc.nextLine();
            split = line.split(" ");
            assert (split.length == 2);
            points.add(new Point(Integer.parseInt(split[0]),Integer.parseInt(split[1])));
        }
        System.out.println(Calculate.solve(points,d));
    }
}
