package remapped;

import javax.annotation.Nullable;

public class class_5948 extends class_4109 {
   private final class_2065 field_30333 = new class_2065(this);
   private boolean field_30330;
   private int field_30331;

   public class_5948(class_6629<? extends class_5948> var1, World var2) {
      super(var1, var2);
   }

   public static class_1313 method_27192() {
      return method_19064().method_5984(class_7331.field_37468, 15.0).method_5984(class_7331.field_37465, 0.2F);
   }

   @Override
   public void method_19084() {
      this.method_26561(class_7331.field_37464).method_45006(this.method_19046());
   }

   @Override
   public void method_19063() {
   }

   @Override
   public class_8461 method_26918() {
      super.method_26918();
      return !this.method_37261(class_6503.field_33094) ? class_463.field_2783 : class_463.field_2768;
   }

   @Override
   public class_8461 method_26599() {
      super.method_26599();
      return class_463.field_2713;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      super.method_26541(var1);
      return class_463.field_2000;
   }

   @Override
   public class_8461 method_37239() {
      if (this.field_41726) {
         if (!this.method_37151()) {
            return class_463.field_2087;
         }

         this.field_20023++;
         if (this.field_20023 > 5 && this.field_20023 % 3 == 0) {
            return class_463.field_2172;
         }

         if (this.field_20023 <= 5) {
            return class_463.field_2087;
         }
      }

      return class_463.field_2292;
   }

   @Override
   public void method_37203(float var1) {
      if (!this.field_41726) {
         super.method_37203(Math.min(0.1F, var1 * 25.0F));
      } else {
         super.method_37203(0.3F);
      }
   }

   @Override
   public void method_19048() {
      if (!this.method_37285()) {
         super.method_19048();
      } else {
         this.method_37155(class_463.field_2012, 0.4F, 1.0F);
      }
   }

   @Override
   public class_2780 method_26550() {
      return class_2780.field_13579;
   }

   @Override
   public double method_37149() {
      return super.method_37149() - 0.1875;
   }

   @Override
   public void method_26606() {
      super.method_26606();
      if (this.method_27191() && this.field_30331++ >= 18000) {
         this.method_37204();
      }
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      var1.method_25934("SkeletonTrap", this.method_27191());
      var1.method_25931("SkeletonTrapTime", this.field_30331);
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      this.method_27190(var1.method_25933("SkeletonTrap"));
      this.field_30331 = var1.method_25947("SkeletonTrapTime");
   }

   @Override
   public boolean method_37168() {
      return true;
   }

   @Override
   public float method_26458() {
      return 0.96F;
   }

   public boolean method_27191() {
      return this.field_30330;
   }

   public void method_27190(boolean var1) {
      if (var1 != this.field_30330) {
         this.field_30330 = var1;
         if (!var1) {
            this.field_29916.method_3488(this.field_30333);
         } else {
            this.field_29916.method_3485(1, this.field_30333);
         }
      }
   }

   @Nullable
   @Override
   public class_1899 method_8638(class_6331 var1, class_1899 var2) {
      return class_6629.field_34261.method_30484(var1);
   }

   @Override
   public class_6910 method_26857(class_704 var1, class_2584 var2) {
      ItemStack var5 = var1.method_26617(var2);
      if (this.method_19043()) {
         if (!this.method_26449()) {
            if (!var1.method_3236()) {
               if (!this.method_37151()) {
                  if (!var5.method_28022()) {
                     if (var5.method_27960() == class_4897.field_24836 && !this.method_43357()) {
                        this.method_19076(var1);
                        return class_6910.method_31659(this.field_41768.field_33055);
                     }

                     class_6910 var6 = var5.method_28000(var1, this, var2);
                     if (var6.method_31662()) {
                        return var6;
                     }
                  }

                  this.method_19039(var1);
                  return class_6910.method_31659(this.field_41768.field_33055);
               } else {
                  return super.method_26857(var1, var2);
               }
            } else {
               this.method_19076(var1);
               return class_6910.method_31659(this.field_41768.field_33055);
            }
         } else {
            return super.method_26857(var1, var2);
         }
      } else {
         return class_6910.field_35521;
      }
   }
}
