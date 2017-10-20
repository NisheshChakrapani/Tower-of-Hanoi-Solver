/**
 * Created by nishu on 2/12/2017.
 */
public class TowerOfHanoi {
    private static int numMoves = 0;
    public static void main(String[] args) {
        move(10, 0, 1, 2);
        System.out.println("Total moves: " + numMoves);
    }

    private static void move(int topDisk, int from, int using, int to) {
        if (topDisk == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            numMoves++;
        } else {
            move(topDisk-1, from, to, using);
            System.out.println("Move disk " + topDisk + " from " + from + " to " + to);
            move(topDisk-1, using, from, to);
            numMoves++;
        }
    }
}
