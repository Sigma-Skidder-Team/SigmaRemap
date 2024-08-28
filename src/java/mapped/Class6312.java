package mapped;

import com.mentalfrostbyte.jello.sound.Sound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class6312 implements ActionListener {
   private static String[] field27806;
   public final Sound field27807;
   public final Class4381 field27808;

   public Class6312(Class4381 var1, Sound var2) {
      this.field27808 = var1;
      this.field27807 = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.field27807.method10521();
   }
}
