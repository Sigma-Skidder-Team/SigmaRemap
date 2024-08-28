package mapped;

import com.mentalfrostbyte.jello.sound.Sound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

public class Class6315 implements ActionListener {
   private static String[] field27816;
   public final Sound field27817;
   public final JCheckBox field27818;
   public final Class4381 field27819;

   public Class6315(Class4381 var1, Sound var2, JCheckBox var3) {
      this.field27819 = var1;
      this.field27817 = var2;
      this.field27818 = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.field27817.method10534(this.field27818.isSelected());
   }
}
