package mapped;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class6304 implements ActionListener {
   private static String[] field27782;
   public final Class2516 field27783;

   public Class6304(Class2516 var1) {
      this.field27783 = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.field27783.field16650 = true;
      this.field27783.setVisible(false);
   }
}
