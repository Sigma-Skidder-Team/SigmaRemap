package remapped;

import java.lang.reflect.Field;

public class class_8299 implements class_5711 {
   private class_9859 field_42528 = null;
   private String field_42529 = null;

   public class_8299(class_9859 var1, String var2) {
      this.field_42528 = var1;
      this.field_42529 = var2;
   }

   @Override
   public Field method_25796() {
      Class var3 = this.field_42528.method_45471();
      if (var3 == null) {
         return null;
      } else {
         try {
            Field var4 = this.method_38285(var3, this.field_42529);
            var4.setAccessible(true);
            return var4;
         } catch (NoSuchFieldException var5) {
            class_9569.method_44218("(Reflector) Field not present: " + var3.getName() + "." + this.field_42529);
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

   private Field method_38285(Class var1, String var2) throws NoSuchFieldException {
      Field[] var5 = var1.getDeclaredFields();

      for (int var6 = 0; var6 < var5.length; var6++) {
         Field var7 = var5[var6];
         if (var7.getName().equals(var2)) {
            return var7;
         }
      }

      if (var1 != Object.class) {
         return this.method_38285(var1.getSuperclass(), var2);
      } else {
         throw new NoSuchFieldException(var2);
      }
   }
}
