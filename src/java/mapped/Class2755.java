package mapped;

public class Class2755 extends Class2754 {
   private static String[] field17294;
   public final Class1095 field17295;

   public Class2755(Class1095 var1) {
      this.field17295 = var1;
   }

   @Override
   public boolean method10803() {
      if (this.field17295.method5142()) {
         Class880 var3 = this.field17295.method4232();
         if (var3 != null && var3.method3066()) {
            if (var3.method3387() == var3.method3386()) {
               boolean var4 = Class1095.method5152(this.field17295, var3);
               if (!var4) {
                  this.field17295.method4230().method21652(var3, 0);
                  this.field17295.method5143(false);
                  this.field17295.method5144(false);
               }

               return var4;
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

   @Override
   public boolean method10806() {
      Class880 var3 = this.field17295.method4232();
      if (var3 != null && var3.method3066()) {
         double var4 = this.field17295.method3433().field18049;
         return (!(var4 * var4 < 0.05F) || !(Math.abs(this.field17295.field5032) < 15.0F) || !this.field17295.field5036) && !this.field17295.method5131();
      } else {
         return false;
      }
   }

   @Override
   public boolean method10808() {
      return false;
   }

   @Override
   public void method10804() {
      this.field17295.method3133(true);
      this.field17295.method5141(true);
      this.field17295.method5144(false);
      Class880 var3 = this.field17295.method4232();
      this.field17295.method4227().method28040(var3, 60.0F, 30.0F);
      Vector3d var4 = new Vector3d(
            var3.getPosX() - this.field17295.getPosX(),
            var3.getPosY() - this.field17295.getPosY(),
            var3.getPosZ() - this.field17295.getPosZ()
         )
         .method11333();
      this.field17295.method3434(this.field17295.method3433().method11339(var4.field18048 * 0.8, 0.9, var4.field18050 * 0.8));
      this.field17295.method4230().method21666();
   }

   @Override
   public void method10807() {
      this.field17295.method5143(false);
      Class1095.method5172(this.field17295, 0.0F);
      Class1095.method5173(this.field17295, 0.0F);
      this.field17295.method5144(false);
      this.field17295.method5141(false);
   }

   @Override
   public void method10805() {
      Class880 var3 = this.field17295.method4232();
      if (var3 != null) {
         this.field17295.method4227().method28040(var3, 60.0F, 30.0F);
      }

      if (!this.field17295.method5131()) {
         Vector3d var4 = this.field17295.method3433();
         if (var4.field18049 * var4.field18049 < 0.03F && this.field17295.field5032 != 0.0F) {
            this.field17295.field5032 = MathHelper.method37828(this.field17295.field5032, 0.0F, 0.2F);
         } else {
            double var5 = Math.sqrt(Entity.method3234(var4));
            double var7 = Math.signum(-var4.field18049) * Math.acos(var5 / var4.method11348()) * 180.0F / (float)Math.PI;
            this.field17295.field5032 = (float)var7;
         }
      }

      if (var3 != null && this.field17295.method3275(var3) <= 2.0F) {
         this.field17295.method3114(var3);
      } else if (this.field17295.field5032 > 0.0F
         && this.field17295.field5036
         && (float)this.field17295.method3433().field18049 != 0.0F
         && this.field17295.field5024.method6738(this.field17295.method3432()).method23448(Blocks.SNOW)) {
         this.field17295.field5032 = 60.0F;
         this.field17295.method4233((Class880)null);
         Class1095.method5170(this.field17295, true);
      }
   }
}
