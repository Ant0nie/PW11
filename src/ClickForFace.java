import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.event.MouseEvent;

public class ClickForFace extends GraphicsProgram {

    public static final int FACE_DIAM = 50;

    public static final int WINDOW_WIDTH = 300;
    public static final int WINDOW_HEIGHT = 400;

    //� ��� ������� ���� ������ run() ��� ����� ������,
    //�� ������ �� �� �볺���
    //�����, �� ��� ��������� ������� �� ������������ ������� ����

    //����� init ����������� ����������� ���� ������ ��������
    public void init() {
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        addMouseListeners();
    }

    //����������� �����, �� ����������� ��� ��������� ����
    public void mouseClicked(MouseEvent e) {
        GRect face = new GRect(FACE_DIAM, FACE_DIAM);
        add(face, e.getX(), e.getY());
    }
}
