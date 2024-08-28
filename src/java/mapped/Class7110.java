package mapped;

import java.lang.reflect.Field;

public class Class7110 implements Class7108 {
   private Class6636 field30626 = null;
   private String field30627 = null;

   public Class7110(Class6636 var1, String var2) {
      this.field30626 = var1;
      this.field30627 = var2;
   }

   @Override
   public Field method22145() {
      Class var3 = this.field30626.method20244();
      if (var3 == null) {
         return null;
      } else {
         try {
            Field var4 = this.method22146(var3, this.field30627);
            var4.setAccessible(true);
            return var4;
         } catch (NoSuchFieldException var5) {
            Class9751.method38308("(Reflector) Field not present: " + var3.getName() + "." + this.field30627);
            return null;
         } catch (SecurityException var6) {
            var6.printStackTrace();
            return null;
         } catch (Throwable var7) {
            var7.printStackTrace();
            return null;
         }
      }
   }

   private Field method22146(Class var1, String var2) throws NoSuchFieldException {
      Field[] var5 = var1.getDeclaredFields();

      for (int var6 = 0; var6 < var5.length; var6++) {
         Field var7 = var5[var6];
         if (var7.getName().equals(var2)) {
            return var7;
         }
      }

      if (var1 != Object.class) {
         return this.method22146(var1.getSuperclass(), var2);
      } else {
         throw new NoSuchFieldException(var2);
      }
   }
}
