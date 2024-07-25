package remapped;

import java.util.function.Predicate;

public class class_4931 {
   private static String[] field_25531;
   public static final class_4931 field_25526 = new class_4931();
   private double field_25525 = -1.0;
   private boolean field_25524;
   private boolean field_25528;
   private boolean field_25527;
   private boolean field_25529;
   private boolean field_25530 = true;
   private Predicate<class_5834> field_25523;

   public class_4931 method_22607(double var1) {
      this.field_25525 = var1;
      return this;
   }

   public class_4931 method_22603() {
      this.field_25524 = true;
      return this;
   }

   public class_4931 method_22601() {
      this.field_25528 = true;
      return this;
   }

   public class_4931 method_22602() {
      this.field_25527 = true;
      return this;
   }

   public class_4931 method_22609() {
      this.field_25529 = true;
      return this;
   }

   public class_4931 method_22608() {
      this.field_25530 = false;
      return this;
   }

   public class_4931 method_22606(Predicate<class_5834> var1) {
      this.field_25523 = var1;
      return this;
   }

   public boolean method_22604(class_5834 var1, class_5834 var2) {
      if (var1 != var2) {
         if (!var2.method_37221()) {
            if (var2.isAlive()) {
               if (!this.field_25524 && var2.method_37367()) {
                  return false;
               } else if (this.field_25523 != null && !this.field_25523.test(var2)) {
                  return false;
               } else {
                  if (var1 != null) {
                     if (!this.field_25529) {
                        if (!var1.method_26608(var2)) {
                           return false;
                        }

                        if (!var1.method_26610(var2.getType())) {
                           return false;
                        }
                     }

                     if (!this.field_25528 && var1.method_37344(var2)) {
                        return false;
                     }

                     if (this.field_25525 > 0.0) {
                        double var5 = !this.field_25530 ? 1.0 : var2.method_26516(var1);
                        double var7 = Math.max(this.field_25525 * var5, 2.0);
                        double var9 = var1.method_37273(var2.getPosX(), var2.method_37309(), var2.getPosZ());
                        if (var9 > var7 * var7) {
                           return false;
                        }
                     }

                     if (!this.field_25527 && var1 instanceof MobEntity && !((MobEntity)var1).method_26928().method_36736(var2)) {
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
