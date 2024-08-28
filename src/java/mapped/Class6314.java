package mapped;

import com.mentalfrostbyte.jello.sound.Sound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class6314 implements ActionListener {
   private static String[] field27813;
   public final Sound field27814;
   public final Class4381 field27815;

   public Class6314(Class4381 var1, Sound var2) {
      this.field27815 = var1;
      this.field27814 = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.field27814.method10527();
   }
}
