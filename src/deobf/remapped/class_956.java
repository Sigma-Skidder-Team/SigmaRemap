package remapped;

public abstract class class_956 extends class_3599 {
   public final MobEntity field_4915;
   public final boolean field_4921;
   private final boolean field_4916;
   private int field_4917;
   private int field_4919;
   private int field_4920;
   public class_5834 field_4918;
   public int field_4922 = 60;

   public class_956(MobEntity var1, boolean var2) {
      this(var1, var2, false);
   }

   public class_956(MobEntity var1, boolean var2, boolean var3) {
      this.field_4915 = var1;
      this.field_4921 = var2;
      this.field_4916 = var3;
   }

   @Override
   public boolean method_16799() {
      class_5834 var3 = this.field_4915.method_17809();
      if (var3 == null) {
         var3 = this.field_4918;
      }

      if (var3 != null) {
         if (var3.isAlive()) {
            class_5086 var4 = this.field_4915.method_37095();
            class_5086 var5 = var3.method_37095();
            if (var4 != null && var5 == var4) {
               return false;
            } else {
               double var6 = this.method_4211();
               if (!(this.field_4915.method_37275(var3) > var6 * var6)) {
                  if (this.field_4921) {
                     if (!this.field_4915.method_26928().method_36736(var3)) {
                        if (++this.field_4920 > this.field_4922) {
                           return false;
                        }
                     } else {
                        this.field_4920 = 0;
                     }
                  }

                  if (var3 instanceof PlayerEntity && ((PlayerEntity)var3).playerAbilities.disableDamage) {
                     return false;
                  } else {
                     this.field_4915.method_26860(var3);
                     return true;
                  }
               } else {
                  return false;
               }
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public double method_4211() {
      return this.field_4915.method_26575(Attributes.FOLLOW_RANGE);
   }

   @Override
   public void method_16796() {
      this.field_4917 = 0;
      this.field_4919 = 0;
      this.field_4920 = 0;
   }

   @Override
   public void method_16793() {
      this.field_4915.method_26860((class_5834)null);
      this.field_4918 = null;
   }

   public boolean method_4210(class_5834 var1, class_4931 var2) {
      if (var1 != null) {
         if (var2.method_22604(this.field_4915, var1)) {
            if (this.field_4915.method_26880(var1.method_37075())) {
               if (this.field_4916) {
                  if (--this.field_4919 <= 0) {
                     this.field_4917 = 0;
                  }

                  if (this.field_4917 == 0) {
                     this.field_4917 = !this.method_4212(var1) ? 2 : 1;
                  }

                  if (this.field_4917 == 2) {
                     return false;
                  }
               }

               return true;
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

   private boolean method_4212(class_5834 var1) {
      this.field_4919 = 10 + this.field_4915.method_26594().nextInt(5);
      class_3998 var4 = this.field_4915.method_26927().method_5598(var1, 0);
      if (var4 != null) {
         class_5851 var5 = var4.method_18448();
         if (var5 != null) {
            int var6 = var5.field_29731 - class_9299.method_42847(var1.getPosX());
            int var7 = var5.field_29736 - class_9299.method_42847(var1.getPosZ());
            return (double)(var6 * var6 + var7 * var7) <= 2.25;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public class_956 method_4209(int var1) {
      this.field_4922 = var1;
      return this;
   }
}
