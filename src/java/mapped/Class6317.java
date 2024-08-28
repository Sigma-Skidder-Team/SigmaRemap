package mapped;

import com.mentalfrostbyte.jello.sound.Sound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class6317 implements ActionListener {
   private static String[] field27824;
   public final Sound field27825;
   public final Class4381 field27826;

   public Class6317(Class4381 var1, Sound var2) {
      this.field27826 = var1;
      this.field27825 = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.field27825.method10523();
   }
}
