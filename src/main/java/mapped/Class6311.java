package mapped;

import com.mentalfrostbyte.jello.sound.Sound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class6311 implements ActionListener {
   private static String[] field27803;
   public final Sound field27804;
   public final Class4381 field27805;

   public Class6311(Class4381 var1, Sound var2) {
      this.field27805 = var1;
      this.field27804 = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.field27804.method10525();
   }
}
