import acm.graphics.GArc;
import acm.program.GraphicsProgram;

public class ArcTest extends GraphicsProgram {

    public static void main(String[] args) {
        new ArcTest().start();
    }

    public void run() {
        int cx = getWidth();
        int cy = getHeight();

        double d = cx / 2;

        GArc arc = new GArc(d, d, 0, 90);
        add(arc, (cx - d) / 2, (cy - d) / 2);

        waitForClick();

        remove(arc);

        GArc arc2 = new GArc(d, d, 45, 270);
        add(arc2, (cx - d) / 2, (cy - d) / 2);

        waitForClick();

        remove(arc2);

        GArc arc3 = new GArc(d, d, -90, 45);
        add(arc3, (cx - d) / 2, (cy - d) / 2);

        waitForClick();

        remove(arc3);

        GArc arc4 = new GArc(d, d, 0, -180);
        arc4.setFilled(true);

        add(arc4, (cx - d) / 2, (cy - d) / 2);
    }
}
