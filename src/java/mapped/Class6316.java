package mapped;

import com.mentalfrostbyte.jello.sound.Sound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

public class Class6316 implements ActionListener {
   private static String[] field27820;
   public final Sound field27821;
   public final JCheckBox field27822;
   public final Class4381 field27823;

   public Class6316(Class4381 var1, Sound var2, JCheckBox var3) {
      this.field27823 = var1;
      this.field27821 = var2;
      this.field27822 = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.field27821.method10532(this.field27822.isSelected());
   }
}
