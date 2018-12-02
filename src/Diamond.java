import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Diamond extends GraphicsProgram {

    public void run() {
        GPolygon diamond = createDiamondE(100, 75);
        diamond.setFilled(true);
        diamond.setFillColor(Color.MAGENTA);
        add(diamond, getWidth() / 2, getHeight() / 2);
    }

    /**
     * ����� ����� ������ - ������
     *
     * @param width  - ������ �������
     * @param height - ������ �������
     * @return ��'��� ���� GPolygon
     */
    private GPolygon createDiamond(double width, double height) {

        GPolygon diamond = new GPolygon();
        //������� ����� �����
        //����� ����� ����������� � ��������� �������� ������ ������ � ������ ���� (���� �� ������)
        //� � 0 ����� �� �� ��
        diamond.addVertex(-width / 2, 0);
        //����� ����� ����������� ������
        diamond.addVertex(0, -height / 2);
        //����� ����� ������
        diamond.addVertex(width / 2, 0);
        //�������� �����
        diamond.addVertex(0, height / 2);
        return diamond;
    }

    private GPolygon createDiamondE(double width, double height) {

        GPolygon diamond = new GPolygon();
        //������� ����� �����
        //����� ����� ����������� � ��������� �������� ������ ������ � ������ ���� (���� �� ������)
        //� � 0 ����� �� �� ��
        diamond.addVertex(-width / 2, 0);
        //����� ��������� �������� ����� ���������� �������� � ����������
        diamond.addEdge(width / 2, -height / 2);
        diamond.addEdge(width / 2, height / 2);
        diamond.addEdge(-width / 2, height / 2);
        diamond.addEdge(-width / 2, -height / 2);
        return diamond;
    }

}
