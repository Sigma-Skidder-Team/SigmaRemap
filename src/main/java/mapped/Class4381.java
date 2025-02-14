package mapped;

import com.mentalfrostbyte.jello.sound.Sound;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public final class Class4381 implements Class4380 {
   @Override
   public void method13744(Sound var1) {
      JButton var4 = new JButton();
      var4.setText(">");
      var4.setToolTipText("Play");
      var4.addActionListener(new Class6312(this, var1));
      JButton var5 = new JButton();
      var5.setText("||");
      var5.setToolTipText("Pause");
      var5.addActionListener(new Class6317(this, var1));
      JButton var6 = new JButton();
      var6.setText("#");
      var6.setToolTipText("Stop");
      var6.addActionListener(new Class6311(this, var1));
      JButton var7 = new JButton();
      var7.setText("|<");
      var7.setToolTipText("Skip Backward");
      var7.addActionListener(new Class6310(this, var1));
      JButton var8 = new JButton();
      var8.setText(">|");
      var8.setToolTipText("Skip Forward");
      var8.addActionListener(new Class6314(this, var1));
      JSlider var9 = new JSlider();
      var9.setToolTipText("Volume");
      var9.addChangeListener(new Class6308(this, var1, var9));
      var9.setMinimum(0);
      var9.setMaximum(100);
      var9.setMajorTickSpacing(50);
      var9.setMinorTickSpacing(10);
      var9.setPaintTicks(true);
      var9.setPaintTrack(true);
      JCheckBox var10 = new JCheckBox();
      var10.setText("Repeat");
      var10.addActionListener(new Class6315(this, var1, var10));
      JCheckBox var11 = new JCheckBox();
      var11.setText("Shuffle");
      var11.addActionListener(new Class6316(this, var1, var11));
      GroupLayout var12 = new GroupLayout(var1);
      var1.setLayout(var12);
      var12.setHorizontalGroup(
         var12.createParallelGroup(Alignment.LEADING)
            .addGroup(
               var12.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(var4)
                  .addPreferredGap(ComponentPlacement.RELATED)
                  .addGroup(
                     var12.createParallelGroup(Alignment.LEADING, false)
                        .addGroup(
                           var12.createSequentialGroup()
                              .addComponent(var5)
                              .addPreferredGap(ComponentPlacement.RELATED)
                              .addComponent(var6)
                              .addPreferredGap(ComponentPlacement.RELATED)
                              .addComponent(var7)
                              .addPreferredGap(ComponentPlacement.RELATED)
                              .addComponent(var8)
                        )
                        .addGroup(
                           var12.createSequentialGroup()
                              .addGroup(var12.createParallelGroup(Alignment.LEADING).addComponent(var11).addComponent(var10))
                              .addPreferredGap(ComponentPlacement.RELATED)
                              .addComponent(var9, 0, 0, 32767)
                        )
                  )
                  .addContainerGap(-1, 32767)
            )
      );
      var12.setVerticalGroup(
         var12.createParallelGroup(Alignment.LEADING)
            .addGroup(
               var12.createSequentialGroup()
                  .addContainerGap()
                  .addGroup(
                     var12.createParallelGroup(Alignment.TRAILING, false)
                        .addComponent(var4, Alignment.LEADING, -1, -1, 32767)
                        .addGroup(
                           Alignment.LEADING,
                           var12.createSequentialGroup()
                              .addGroup(
                                 var12.createParallelGroup(Alignment.BASELINE).addComponent(var5).addComponent(var6).addComponent(var7).addComponent(var8)
                              )
                              .addPreferredGap(ComponentPlacement.RELATED)
                              .addGroup(
                                 var12.createParallelGroup(Alignment.TRAILING)
                                    .addGroup(var12.createSequentialGroup().addComponent(var11).addPreferredGap(ComponentPlacement.RELATED).addComponent(var10))
                                    .addComponent(var9, -2, 42, -2)
                              )
                        )
                  )
                  .addContainerGap(-1, 32767)
            )
      );
   }
}
