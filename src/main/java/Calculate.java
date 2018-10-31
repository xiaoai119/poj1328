import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created By xfj on 2018/10/31
 */
public class Calculate {
    public static int solve(List<Point> poins,int d){
        int radar=0;
        ArrayList<Segment> segments = getSegments(poins, d);
        List<Segment> segmentsSorted = segments.stream().sorted(Comparator.comparing(Segment::getRight)).collect(Collectors.toList());
        for(int i=0;i<segmentsSorted.size();i++){
            if (segmentsSorted.get(i).flag==0){
                Double rc=segmentsSorted.get(i).getRight();
                radar++;
                for(int index=i;index<segmentsSorted.size();index++){
                    if(segmentsSorted.get(index).left<=rc&&segmentsSorted.get(index).right>=rc){
                        segmentsSorted.get(index).flag=1;
                    }else if(segments.get(index).getLeft()>rc){
                        break;
                    }
                }
            }
        }
        return radar;
    }

    private static ArrayList<Segment> getSegments(List<Point> poins, int d) {
        ArrayList<Segment> segments = new ArrayList<Segment>();
        for(int i=0;i<poins.size();i++){
            double delta = Math.sqrt(d * d - Math.pow(poins.get(i).getY(),2));
            segments.add(new Segment(poins.get(i).getX()-delta,poins.get(i).getX()+delta));
        }
        return segments;
    }

}
