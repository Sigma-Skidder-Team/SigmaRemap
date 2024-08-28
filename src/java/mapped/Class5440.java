package mapped;

import java.awt.Color;
import javax.swing.JColorChooser;

public final class Class5440 extends Class5436 {
   public Class5440(String var1, String var2) {
      super(var1, var2);
   }

   @Override
   public void method17099() {
      Color var3 = JColorChooser.showDialog(null, "Choose a color", Class9439.method36289(this.field24179));
      if (var3 != null) {
         this.field24179 = Class9439.toString(var3);
      }
   }

   @Override
   public Object method17100() {
      return Class9439.method36289(this.field24179);
   }
}
