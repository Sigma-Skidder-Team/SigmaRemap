package remapped;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class class_7880 implements class_5711 {
   private Field field_40328 = null;

   public class_7880(Class var1, Class[] var2, Class var3, Class[] var4, String var5) {
      Field[] var8 = var1.getDeclaredFields();
      ArrayList var9 = new ArrayList();

      for (int var10 = 0; var10 < var8.length; var10++) {
         Field var11 = var8[var10];
         var9.add(var11.getType());
      }

      ArrayList var14 = new ArrayList();
      var14.addAll(Arrays.asList(var2));
      var14.add(var3);
      var14.addAll(Arrays.asList(var4));
      int var15 = Collections.indexOfSubList(var9, var14);
      if (var15 >= 0) {
         int var12 = Collections.indexOfSubList(var9.subList(var15 + 1, var9.size()), var14);
         if (var12 < 0) {
            int var13 = var15 + var2.length;
            this.field_40328 = var8[var13];
         } else {
            class_9569.method_44218("(Reflector) More than one match found for field: " + var5);
         }
      } else {
         class_9569.method_44218("(Reflector) Field not found: " + var5);
      }
   }

   @Override
   public Field method_25796() {
      return this.field_40328;
   }
}
