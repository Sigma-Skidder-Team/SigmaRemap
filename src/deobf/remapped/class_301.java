package remapped;

import java.util.Timer;

public class class_301 implements class_7381 {
   private static String[] field_1104;

   public class_301(class_1761 var1, Timer var2) {
      this.field_1103 = var1;
      this.field_1105 = var2;
   }

   @Override
   public void method_33626() {
      this.field_1105.cancel();
   }
}
