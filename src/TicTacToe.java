import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;
import java.awt.event.MouseEvent;


public class TicTacToe extends GraphicsProgram {

    private final static int WINDOW_HEIGHT = 512;
    private final static int WINDOW_WIDTH = WINDOW_HEIGHT;
    public GRect cell1 = new GRect(WINDOW_WIDTH / 3, WINDOW_HEIGHT / 3);
    public GRect cell2 = new GRect(WINDOW_WIDTH / 3, WINDOW_HEIGHT / 3);
    public GRect cell3 = new GRect(WINDOW_WIDTH / 3, WINDOW_HEIGHT / 3);
    public GRect cell4 = new GRect(WINDOW_WIDTH / 3, WINDOW_HEIGHT / 3);
    public GRect cell5 = new GRect(WINDOW_WIDTH / 3, WINDOW_HEIGHT / 3);
    public GRect cell6 = new GRect(WINDOW_WIDTH / 3, WINDOW_HEIGHT / 3);
    public GRect cell7 = new GRect(WINDOW_WIDTH / 3, WINDOW_HEIGHT / 3);
    public GRect cell8 = new GRect(WINDOW_WIDTH / 3, WINDOW_HEIGHT / 3);
    public GRect cell9 = new GRect(WINDOW_WIDTH / 3, WINDOW_HEIGHT / 3);
    private GPoint clickPoint;
    private GObject obj;
    private GImage background = new GImage("field.png");
    private GCompound maskLayer = new GCompound();

    public void run() {
        int i = 0;
        setup();
        addMouseListeners();
        while (i != 9) {
            i = maskLayer.getElementCount();
        }
        removeAll();
    }

    public void setup() {
        this.setSize(WINDOW_WIDTH + 15, WINDOW_HEIGHT + 62);
        background.scale((double) WINDOW_WIDTH / 1080, (double) WINDOW_HEIGHT / 1080);
        add(background, 0, 0);
        add(cell1, 0, 0);
        cell1.setVisible(false);
        cell1.setFilled(true);
        cell1.setFillColor(Color.GREEN);
        add(cell2, (double) (WINDOW_WIDTH) / 3, 0);
        cell2.setVisible(false);
        cell2.setFilled(true);
        cell2.setFillColor(Color.GREEN);
        add(cell3, (double) (WINDOW_WIDTH) * 2 / 3, 0);
        cell3.setVisible(false);
        cell3.setFilled(true);
        cell3.setFillColor(Color.GREEN);
        add(cell4, 0, (double) WINDOW_HEIGHT / 3);
        cell4.setVisible(false);
        cell4.setFilled(true);
        cell4.setFillColor(Color.GREEN);
        add(cell5, (double) (WINDOW_WIDTH) / 3, (double) WINDOW_HEIGHT / 3);
        cell5.setVisible(false);
        cell5.setFilled(true);
        cell5.setFillColor(Color.GREEN);
        add(cell6, (double) (WINDOW_WIDTH) * 2 / 3, (double) WINDOW_HEIGHT / 3);
        cell6.setVisible(false);
        cell6.setFilled(true);
        cell6.setFillColor(Color.GREEN);
        add(cell7, 0, (double) WINDOW_HEIGHT * 2 / 3);
        cell7.setVisible(false);
        cell7.setFilled(true);
        cell7.setFillColor(Color.GREEN);
        add(cell8, (double) (WINDOW_WIDTH) / 3, (double) WINDOW_HEIGHT * 2 / 3);
        cell8.setVisible(false);
        cell8.setFilled(true);
        cell8.setFillColor(Color.GREEN);
        add(cell9, (double) (WINDOW_WIDTH) * 2 / 3, (double) WINDOW_HEIGHT * 2 / 3);
        cell9.setVisible(false);
        cell9.setFilled(true);
        cell9.setFillColor(Color.GREEN);
        add(maskLayer);
    }

    public void mouseClicked(MouseEvent e) {
        clickPoint = new GPoint(e.getPoint());
        obj = getElementAt(clickPoint);
        if (obj != background && obj != maskLayer) {
            maskLayer.add(obj);
            addCross(obj.getX(), obj.getY());
            maskLayer.sendToFront();
        }
    }

    public void addCross(double x, double y) {
        GImage cross;
        cross = new GImage("cross.png");
        cross.scale((double) WINDOW_WIDTH / 3240, (double) WINDOW_HEIGHT / 3240);
        add(cross, x, y);
    }
}
