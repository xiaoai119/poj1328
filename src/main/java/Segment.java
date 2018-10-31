/**
 * Created By xfj on 2018/10/31
 */
public class Segment {
    Double left;
    Double right;
    int flag=0;

    public Segment(Double left, Double right) {
        this.left = left;
        this.right = right;
    }

    public void setLeft(Double left) {
        this.left = left;
    }

    public void setRight(Double right) {
        this.right = right;
    }

    public Double getLeft() {
        return left;
    }

    public Double getRight() {
        return right;
    }
}
