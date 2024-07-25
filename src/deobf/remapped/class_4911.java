package remapped;

import java.lang.reflect.Constructor;

public class class_4911 implements class_8861 {
   private class_9859 field_25419 = null;
   private Class[] field_25418 = null;
   private boolean field_25420 = false;
   private Constructor field_25422 = null;

   public class_4911(class_9859 var1, Class[] var2) {
      this.field_25419 = var1;
      this.field_25418 = var2;
      class_9696.method_44804(this);
   }

   public Constructor method_22502() {
      if (this.field_25420) {
         return this.field_25422;
      } else {
         this.field_25420 = true;
         Class var3 = this.field_25419.method_45471();
         if (var3 == null) {
            return null;
         } else {
            try {
               this.field_25422 = method_22499(var3, this.field_25418);
               if (this.field_25422 == null) {
                  class_9569.method_44223("(Reflector) Constructor not present: " + var3.getName() + ", params: " + class_5657.method_25595(this.field_25418));
               }

               if (this.field_25422 != null) {
                  this.field_25422.setAccessible(true);
               }
            } catch (Throwable var5) {
               var5.printStackTrace();
            }

            return this.field_25422;
         }
      }
   }

   private static Constructor method_22499(Class var0, Class[] var1) {
      Constructor[] var4 = var0.getDeclaredConstructors();

      for (int var5 = 0; var5 < var4.length; var5++) {
         Constructor var6 = var4[var5];
         Class[] var7 = var6.getParameterTypes();
         if (class_7860.method_35577(var1, var7)) {
            return var6;
         }
      }

      return null;
   }

   public boolean method_22501() {
      return !this.field_25420 ? this.method_22502() != null : this.field_25422 != null;
   }

   public void method_22498() {
      this.field_25420 = true;
      this.field_25422 = null;
   }

   public Object method_22500(Object... var1) {
      return class_7860.method_35574(this, var1);
   }

   @Override
   public void method_40748() {
      Constructor var3 = this.method_22502();
   }
}
