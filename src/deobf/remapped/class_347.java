package remapped;

import java.awt.Color;
import javax.swing.JColorChooser;

public final class class_347 extends class_8064 {
   public class_347(String var1, String var2) {
      super(var1, var2);
   }

   @Override
   public void method_10499() {
      Color var3 = JColorChooser.showDialog(null, "Choose a color", class_8391.method_38662(this.field_41269));
      if (var3 != null) {
         this.field_41269 = class_8391.toString(var3);
      }
   }

   @Override
   public Object method_10500() {
      return class_8391.method_38662(this.field_41269);
   }
}
