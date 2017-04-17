package com.weaxme.graph.window;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.weaxme.graph.service.IGraphApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Vitaliy Gonchar
 */
@Singleton
public class SimpleGraphCommandWindow extends JFrame {
    private JPanel rootPanel;
    private JButton buildGraphButton;
    private JComboBox delayBox;
    private JFormattedTextField startField;
    private JFormattedTextField endField;
    private JFormattedTextField graphFunctionField;
    private JFormattedTextField stepField;

    @Inject
    private IGraphApplication app;


    private static final Logger LOG = LoggerFactory.getLogger(SimpleGraphCommandWindow.class);

    public SimpleGraphCommandWindow() {
        super("Simple graph command window");
        buildGraphButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                app.repaintGraph();
            }
        });

        setContentPane(rootPanel);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }

    private void createUIComponents() {
        rootPanel = new JPanel();
    }

}
