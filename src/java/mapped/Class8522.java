package mapped;

import java.util.function.Predicate;

public class Class8522 {
   private static String[] field38239;
   public static final Class8522 field38240 = new Class8522();
   private double field38241 = -1.0;
   private boolean field38242;
   private boolean field38243;
   private boolean field38244;
   private boolean field38245;
   private boolean field38246 = true;
   private Predicate<Class880> field38247;

   public Class8522 method30203(double var1) {
      this.field38241 = var1;
      return this;
   }

   public Class8522 method30204() {
      this.field38242 = true;
      return this;
   }

   public Class8522 method30205() {
      this.field38243 = true;
      return this;
   }

   public Class8522 method30206() {
      this.field38244 = true;
      return this;
   }

   public Class8522 method30207() {
      this.field38245 = true;
      return this;
   }

   public Class8522 method30208() {
      this.field38246 = false;
      return this;
   }

   public Class8522 method30209(Predicate<Class880> var1) {
      this.field38247 = var1;
      return this;
   }

   public boolean method30210(Class880 var1, Class880 var2) {
      if (var1 != var2) {
         if (!var2.isSpectator()) {
            if (var2.method3066()) {
               if (!this.field38242 && var2.method3362()) {
                  return false;
               } else if (this.field38247 != null && !this.field38247.test(var2)) {
                  return false;
               } else {
                  if (var1 != null) {
                     if (!this.field38245) {
                        if (!var1.method3026(var2)) {
                           return false;
                        }

                        if (!var1.method2996(var2.getType())) {
                           return false;
                        }
                     }

                     if (!this.field38243 && var1.method3345(var2)) {
                        return false;
                     }

                     if (this.field38241 > 0.0) {
                        double var5 = !this.field38246 ? 1.0 : var2.method3025(var1);
                        double var7 = Math.max(this.field38241 * var5, 2.0);
                        double var9 = var1.method3276(var2.getPosX(), var2.getPosY(), var2.getPosZ());
                        if (var9 > var7 * var7) {
                           return false;
                        }
                     }

                     if (!this.field38244 && var1 instanceof Class1006 && !((Class1006)var1).method4231().method35460(var2)) {
                        return false;
                     }
                  }

                  return true;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
