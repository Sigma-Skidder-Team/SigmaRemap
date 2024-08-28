package mapped;

import java.lang.reflect.Constructor;

public class Class6634 implements Class6632 {
   private Class6636 field29176 = null;
   private Class[] field29177 = null;
   private boolean field29178 = false;
   private Constructor field29179 = null;

   public Class6634(Class6636 var1, Class[] var2) {
      this.field29176 = var1;
      this.field29177 = var2;
      Class9787.method38574(this);
   }

   public Constructor method20239() {
      if (this.field29178) {
         return this.field29179;
      } else {
         this.field29178 = true;
         Class var3 = this.field29176.method20244();
         if (var3 == null) {
            return null;
         } else {
            try {
               this.field29179 = method20240(var3, this.field29177);
               if (this.field29179 == null) {
                  Class9751.method38303("(Reflector) Constructor not present: " + var3.getName() + ", params: " + Class8720.method31471(this.field29177));
               }

               if (this.field29179 != null) {
                  this.field29179.setAccessible(true);
               }
            } catch (Throwable var5) {
               var5.printStackTrace();
            }

            return this.field29179;
         }
      }
   }

   private static Constructor method20240(Class var0, Class[] var1) {
      Constructor[] var4 = var0.getDeclaredConstructors();

      for (int var5 = 0; var5 < var4.length; var5++) {
         Constructor var6 = var4[var5];
         Class[] var7 = var6.getParameterTypes();
         if (Class9299.method35088(var1, var7)) {
            return var6;
         }
      }

      return null;
   }

   public boolean method20241() {
      return !this.field29178 ? this.method20239() != null : this.field29179 != null;
   }

   public void method20242() {
      this.field29178 = true;
      this.field29179 = null;
   }

   public Object method20243(Object... var1) {
      return Class9299.method35087(this, var1);
   }

   @Override
   public void method20232() {
      Constructor var3 = this.method20239();
   }
}
