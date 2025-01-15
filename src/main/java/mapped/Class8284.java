// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.swing.LayoutStyle;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeListener;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public final class Class8284 implements Class8285
{
    @Override
    public void method27532(final Class2416 host) {
        final JButton button = new JButton();
        button.setText(">");
        button.setToolTipText("Play");
        button.addActionListener(new Class7052(this, host));
        final JButton button2 = new JButton();
        button2.setText("||");
        button2.setToolTipText("Pause");
        button2.addActionListener(new Class7045(this, host));
        final JButton button3 = new JButton();
        button3.setText("#");
        button3.setToolTipText("Stop");
        button3.addActionListener(new Class7049(this, host));
        final JButton button4 = new JButton();
        button4.setText("|<");
        button4.setToolTipText("Skip Backward");
        button4.addActionListener(new Class7051(this, host));
        final JButton button5 = new JButton();
        button5.setText(">|");
        button5.setToolTipText("Skip Forward");
        button5.addActionListener(new Class7055(this, host));
        final JSlider slider = new JSlider();
        slider.setToolTipText("Volume");
        slider.addChangeListener(new Class7057(this, host, slider));
        slider.setMinimum(0);
        slider.setMaximum(100);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        final JCheckBox checkBox = new JCheckBox();
        checkBox.setText("Repeat");
        checkBox.addActionListener(new Class7046(this, host, checkBox));
        final JCheckBox checkBox2 = new JCheckBox();
        checkBox2.setText("Shuffle");
        checkBox2.addActionListener(new Class7054(this, host, checkBox2));
        final GroupLayout layout = new GroupLayout(host);
        host.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(button).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addComponent(button2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(button3).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(button4).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(button5)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(checkBox2).addComponent(checkBox)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(slider, 0, 0, 32767))).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(button, GroupLayout.Alignment.LEADING, -1, -1, 32767).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(button2).addComponent(button3).addComponent(button4).addComponent(button5)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addComponent(checkBox2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(checkBox)).addComponent(slider, -2, 42, -2)))).addContainerGap(-1, 32767)));
    }
}
