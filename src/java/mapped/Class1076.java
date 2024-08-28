package mapped;

import javax.annotation.Nullable;

public class Class1076 extends AbstractHorseEntity {
   private final Class2669 field5919 = new Class2669(this);
   private boolean field5920;
   private int field5921;

   public Class1076(Class8992<? extends Class1076> var1, Class1655 var2) {
      super(var1, var2);
   }

   public static Class7037 method4999() {
      return method4951().method21849(Class9173.field42105, 15.0).method21849(Class9173.field42108, 0.2F);
   }

   @Override
   public void method4925() {
      this.method3085(Class9173.field42117).method38661(this.method4972());
   }

   @Override
   public void method4929() {
   }

   @Override
   public Class9455 method4241() {
      super.method4241();
      return !this.method3263(Class8953.field40469) ? Class6067.field27061 : Class6067.field27065;
   }

   @Override
   public Class9455 method2880() {
      super.method2880();
      return Class6067.field27062;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      super.method2879(var1);
      return Class6067.field27063;
   }

   @Override
   public Class9455 method2859() {
      if (this.field5036) {
         if (!this.method3329()) {
            return Class6067.field27068;
         }

         this.field5901++;
         if (this.field5901 > 5 && this.field5901 % 3 == 0) {
            return Class6067.field27066;
         }

         if (this.field5901 <= 5) {
            return Class6067.field27068;
         }
      }

      return Class6067.field27064;
   }

   @Override
   public void method3242(float var1) {
      if (!this.field5036) {
         super.method3242(Math.min(0.1F, var1 * 25.0F));
      } else {
         super.method3242(0.3F);
      }
   }

   @Override
   public void method4960() {
      if (!this.method3250()) {
         super.method4960();
      } else {
         this.method2863(Class6067.field27067, 0.4F, 1.0F);
      }
   }

   @Override
   public Class7809 method3089() {
      return Class7809.field33506;
   }

   @Override
   public double method3310() {
      return super.method3310() - 0.1875;
   }

   @Override
   public void method2871() {
      super.method2871();
      if (this.method5000() && this.field5921++ >= 18000) {
         this.method2904();
      }
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method115("SkeletonTrap", this.method5000());
      var1.method102("SkeletonTrapTime", this.field5921);
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.method5001(var1.method132("SkeletonTrap"));
      this.field5921 = var1.method122("SkeletonTrapTime");
   }

   @Override
   public boolean method3007() {
      return true;
   }

   @Override
   public float method3106() {
      return 0.96F;
   }

   public boolean method5000() {
      return this.field5920;
   }

   public void method5001(boolean var1) {
      if (var1 != this.field5920) {
         this.field5920 = var1;
         if (!var1) {
            this.field5600.method20003(this.field5919);
         } else {
            this.field5600.method20002(1, this.field5919);
         }
      }
   }

   @Nullable
   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      return Class8992.field41079.method33215(var1);
   }

   @Override
   public Class2274 method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.method3094(var2);
      if (this.method4932()) {
         if (!this.method3005()) {
            if (!var1.method2851()) {
               if (!this.method3329()) {
                  if (!var5.method32105()) {
                     if (var5.method32107() == Class8514.field37886 && !this.method4943()) {
                        this.openGUI(var1);
                        return Class2274.method9002(this.field5024.field9020);
                     }

                     Class2274 var6 = var5.method32125(var1, this, var2);
                     if (var6.method9000()) {
                        return var6;
                     }
                  }

                  this.method4920(var1);
                  return Class2274.method9002(this.field5024.field9020);
               } else {
                  return super.method4285(var1, var2);
               }
            } else {
               this.openGUI(var1);
               return Class2274.method9002(this.field5024.field9020);
            }
         } else {
            return super.method4285(var1, var2);
         }
      } else {
         return Class2274.field14820;
      }
   }
}
