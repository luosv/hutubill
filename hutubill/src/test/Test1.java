package test;

import util.GUIUtil;

import javax.swing.*;

/**
 * 测试展示面板
 * Created by luosv on 2016/11/25 0025.
 */
public class Test1 {

    public static void main(String[] args) {

        GUIUtil.useLNF();
        JPanel p = new JPanel();
        p.add(new JButton("按钮1"));
        p.add(new JButton("按钮2"));
        GUIUtil.showPanel(p);

    }

}
