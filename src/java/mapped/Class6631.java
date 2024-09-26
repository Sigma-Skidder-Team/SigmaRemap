package mapped;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Class6631 implements Class6632 {
   private Class6636 field29167 = null;
   private String field29168 = null;
   private Class[] field29169 = null;
   private boolean field29170 = false;
   private Method field29171 = null;

   public Class6631(Class6636 var1, String var2) {
      this(var1, var2, (Class[])null);
   }

   public Class6631(Class6636 var1, String var2, Class[] var3) {
      this.field29167 = var1;
      this.field29168 = var2;
      this.field29169 = var3;
      Class9787.method38574(this);
   }

   public Method method20213() {
      if (this.field29170) {
         return this.field29171;
      } else {
         this.field29170 = true;
         Class var3 = this.field29167.method20244();
         if (var3 == null) {
            return null;
         } else {
            try {
               if (this.field29169 == null) {
                  Method[] var4 = method20231(var3, this.field29168);
                  if (var4.length <= 0) {
                     return null;
                  }

                  if (var4.length > 1) {
                     Class9751.method38304("(Reflector) More than one method found: " + var3.getName() + "." + this.field29168);

                     for (int var5 = 0; var5 < var4.length; var5++) {
                        Method var6 = var4[var5];
                        Class9751.method38304("(Reflector)  - " + var6);
                     }

                     return null;
                  }

                  this.field29171 = var4[0];
               } else {
                  this.field29171 = method20230(var3, this.field29168, this.field29169);
               }

               if (this.field29171 == null) {
                  return null;
               } else {
                  this.field29171.setAccessible(true);
                  return this.field29171;
               }
            } catch (Throwable var7) {
               var7.printStackTrace();
               return null;
            }
         }
      }
   }

   public boolean exists() {
      return !this.field29170 ? this.method20213() != null : this.field29171 != null;
   }

   public Class method20215() {
      Method var3 = this.method20213();
      return var3 != null ? var3.getReturnType() : null;
   }

   public void method20216() {
      this.field29170 = true;
      this.field29171 = null;
   }

   public Object method20217(Object... var1) {
      return Reflector.method35062(this, var1);
   }

   public boolean method20218(Object... var1) {
      return Reflector.method35056(this, var1);
   }

   public int method20219(Object... var1) {
      return Reflector.method35057(this, var1);
   }

   public float method20220(Object... var1) {
      return Reflector.method35059(this, var1);
   }

   public double method20221(Object... var1) {
      return Reflector.method35060(this, var1);
   }

   public String method20222(Object... var1) {
      return Reflector.method35061(this, var1);
   }

   public Object method20223(Object var1) {
      return Reflector.method35062(this, var1);
   }

   public boolean method20224(Object var1) {
      return Reflector.method35056(this, var1);
   }

   public int method20225(Object var1) {
      return Reflector.method35057(this, var1);
   }

   public float method20226(Object var1) {
      return Reflector.method35059(this, var1);
   }

   public double method20227(Object var1) {
      return Reflector.method35060(this, var1);
   }

   public String method20228(Object var1) {
      return Reflector.method35061(this, var1);
   }

   public void method20229(Object... var1) {
      Reflector.method35055(this, var1);
   }

   public static Method method20230(Class var0, String var1, Class[] var2) {
      Method[] var5 = var0.getDeclaredMethods();

      for (int var6 = 0; var6 < var5.length; var6++) {
         Method var7 = var5[var6];
         if (var7.getName().equals(var1)) {
            Class[] var8 = var7.getParameterTypes();
            if (Reflector.method35088(var2, var8)) {
               return var7;
            }
         }
      }

      return null;
   }

   public static Method[] method20231(Class var0, String var1) {
      List<Method> var4 = new ArrayList<>();
      Method[] var5 = var0.getDeclaredMethods();

      for (int var6 = 0; var6 < var5.length; var6++) {
         Method var7 = var5[var6];
         if (var7.getName().equals(var1)) {
            var4.add(var7);
         }
      }

      return var4.toArray(new Method[var4.size()]);
   }

   @Override
   public void method20232() {
      Method var3 = this.method20213();
   }
}
