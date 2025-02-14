package mapped;

import com.mentalfrostbyte.jello.sound.Sound;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Class6308 implements ChangeListener {
   private static String[] field27794;
   public final Sound field27795;
   public final JSlider field27796;
   public final Class4381 field27797;

   public Class6308(Class4381 var1, Sound var2, JSlider var3) {
      this.field27797 = var1;
      this.field27795 = var2;
      this.field27796 = var3;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      this.field27795.method10530(this.field27796.getValue());
   }
}
