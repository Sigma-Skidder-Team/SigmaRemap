package mapped;

import com.mentalfrostbyte.jello.sound.Sound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class6310 implements ActionListener {
   private static String[] field27800;
   public final Sound field27801;
   public final Class4381 field27802;

   public Class6310(Class4381 var1, Sound var2) {
      this.field27802 = var1;
      this.field27801 = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.field27801.method10528();
   }
}
