package remapped;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class class_817 implements class_8861 {
   private class_9859 field_4337 = null;
   private String field_4336 = null;
   private Class[] field_4335 = null;
   private boolean field_4339 = false;
   private Method field_4334 = null;

   public class_817(class_9859 var1, String var2) {
      this(var1, var2, (Class[])null);
   }

   public class_817(class_9859 var1, String var2, Class[] var3) {
      this.field_4337 = var1;
      this.field_4336 = var2;
      this.field_4335 = var3;
      class_9696.method_44804(this);
   }

   public Method method_3580() {
      if (this.field_4339) {
         return this.field_4334;
      } else {
         this.field_4339 = true;
         Class var3 = this.field_4337.method_45471();
         if (var3 == null) {
            return null;
         } else {
            try {
               if (this.field_4335 == null) {
                  Method[] var4 = method_3579(var3, this.field_4336);
                  if (var4.length <= 0) {
                     class_9569.method_44218("(Reflector) Method not present: " + var3.getName() + "." + this.field_4336);
                     return null;
                  }

                  if (var4.length > 1) {
                     class_9569.method_44224("(Reflector) More than one method found: " + var3.getName() + "." + this.field_4336);

                     for (int var5 = 0; var5 < var4.length; var5++) {
                        Method var6 = var4[var5];
                        class_9569.method_44224("(Reflector)  - " + var6);
                     }

                     return null;
                  }

                  this.field_4334 = var4[0];
               } else {
                  this.field_4334 = method_3595(var3, this.field_4336, this.field_4335);
               }

               if (this.field_4334 == null) {
                  class_9569.method_44218("(Reflector) Method not present: " + var3.getName() + "." + this.field_4336);
                  return null;
               } else {
                  this.field_4334.setAccessible(true);
                  return this.field_4334;
               }
            } catch (Throwable var7) {
               var7.printStackTrace();
               return null;
            }
         }
      }
   }

   public boolean method_3596() {
      return !this.field_4339 ? this.method_3580() != null : this.field_4334 != null;
   }

   public Class method_3577() {
      Method var3 = this.method_3580();
      return var3 != null ? var3.getReturnType() : null;
   }

   public void method_3583() {
      this.field_4339 = true;
      this.field_4334 = null;
   }

   public Object method_3582(Object... var1) {
      return class_7860.method_35556(this, var1);
   }

   public boolean method_3592(Object... var1) {
      return class_7860.method_35566(this, var1);
   }

   public int method_3589(Object... var1) {
      return class_7860.method_35570(this, var1);
   }

   public float method_3594(Object... var1) {
      return class_7860.method_35586(this, var1);
   }

   public double method_3587(Object... var1) {
      return class_7860.method_35579(this, var1);
   }

   public String method_3585(Object... var1) {
      return class_7860.method_35576(this, var1);
   }

   public Object method_3581(Object var1) {
      return class_7860.method_35556(this, var1);
   }

   public boolean method_3591(Object var1) {
      return class_7860.method_35566(this, var1);
   }

   public int method_3588(Object var1) {
      return class_7860.method_35570(this, var1);
   }

   public float method_3593(Object var1) {
      return class_7860.method_35586(this, var1);
   }

   public double method_3586(Object var1) {
      return class_7860.method_35579(this, var1);
   }

   public String method_3578(Object var1) {
      return class_7860.method_35576(this, var1);
   }

   public void method_3590(Object... var1) {
      class_7860.method_35547(this, var1);
   }

   public static Method method_3595(Class var0, String var1, Class[] var2) {
      Method[] var5 = var0.getDeclaredMethods();

      for (int var6 = 0; var6 < var5.length; var6++) {
         Method var7 = var5[var6];
         if (var7.getName().equals(var1)) {
            Class[] var8 = var7.getParameterTypes();
            if (class_7860.method_35577(var2, var8)) {
               return var7;
            }
         }
      }

      return null;
   }

   public static Method[] method_3579(Class var0, String var1) {
      ArrayList var4 = new ArrayList();
      Method[] var5 = var0.getDeclaredMethods();

      for (int var6 = 0; var6 < var5.length; var6++) {
         Method var7 = var5[var6];
         if (var7.getName().equals(var1)) {
            var4.add(var7);
         }
      }

      return var4.<Method>toArray(new Method[var4.size()]);
   }

   @Override
   public void method_40748() {
      Method var3 = this.method_3580();
   }
}
