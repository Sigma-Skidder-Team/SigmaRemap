package remapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1838 {
   private static final Logger field_9313 = LogManager.getLogger();
   private final class_8823 field_9315;

   public class_1838(class_3171<class_8823> var1) {
      this.field_9315 = (class_8823)var1.method_14623();
   }

   public class_6325 method_8118(class_8669<class_6325> var1, int var2, int var3) {
      int var6 = this.field_9315.method_13700(var2, var3);
      class_5621 var7 = class_6297.method_28740(var6);
      if (var7 != null) {
         class_6325 var8 = (class_6325)var1.method_39799(var7);
         if (var8 != null) {
            return var8;
         } else if (!class_7665.field_38958) {
            field_9313.warn("Unknown biome id: ", var6);
            return var1.method_39799(class_6297.method_28740(0));
         } else {
            throw (IllegalStateException) Util.method_44658(new IllegalStateException("Unknown biome id: " + var6));
         }
      } else {
         throw new IllegalStateException("Unknown biome id emitted by layers: " + var6);
      }
   }
}
