package test;

import util.GUIUtil;

import javax.swing.*;

/**
 * 测试类
 * Created by LuoSw on 2016/10/27 0027.
 */
public class Test {

    public static void main(String[] args) {

        GUIUtil.useLNF();
        JPanel p = new JPanel();
        p.add(new JButton("按钮1"));
        p.add(new JButton("按钮2"));
        GUIUtil.showPanel(p);

    }

}
