package mapped;

import java.lang.reflect.Field;

public class Class7111 implements Class7108 {
   private Class6636 field30628 = null;
   private Class field30629 = null;
   private int field30630;

   public Class7111(Class6636 var1, Class var2) {
      this(var1, var2, 0);
   }

   public Class7111(Class6636 var1, Class var2, int var3) {
      this.field30628 = var1;
      this.field30629 = var2;
      this.field30630 = var3;
   }

   @Override
   public Field method22145() {
      Class var3 = this.field30628.method20244();
      if (var3 == null) {
         return null;
      } else {
         try {
            Field[] var4 = var3.getDeclaredFields();
            int var5 = 0;

            for (int var6 = 0; var6 < var4.length; var6++) {
               Field var7 = var4[var6];
               if (var7.getType() == this.field30629) {
                  if (var5 == this.field30630) {
                     var7.setAccessible(true);
                     return var7;
                  }

                  var5++;
               }
            }

            Class9751.method38308("(Reflector) Field not present: " + var3.getName() + ".(type: " + this.field30629 + ", index: " + this.field30630 + ")");
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
