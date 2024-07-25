package remapped;

import java.lang.reflect.Field;

public class class_6841 implements class_5711 {
   private class_9859 field_35272 = null;
   private Class field_35270 = null;
   private int field_35273;

   public class_6841(class_9859 var1, Class var2) {
      this(var1, var2, 0);
   }

   public class_6841(class_9859 var1, Class var2, int var3) {
      this.field_35272 = var1;
      this.field_35270 = var2;
      this.field_35273 = var3;
   }

   @Override
   public Field method_25796() {
      Class var3 = this.field_35272.method_45471();
      if (var3 == null) {
         return null;
      } else {
         try {
            Field[] var4 = var3.getDeclaredFields();
            int var5 = 0;

            for (int var6 = 0; var6 < var4.length; var6++) {
               Field var7 = var4[var6];
               if (var7.getType() == this.field_35270) {
                  if (var5 == this.field_35273) {
                     var7.setAccessible(true);
                     return var7;
                  }

                  var5++;
               }
            }

            class_9569.method_44218("(Reflector) Field not present: " + var3.getName() + ".(type: " + this.field_35270 + ", index: " + this.field_35273 + ")");
            return null;
         } catch (SecurityException var8) {
            var8.printStackTrace();
            return null;
         } catch (Throwable var9) {
            var9.printStackTrace();
            return null;
         }
      }
   }
}
