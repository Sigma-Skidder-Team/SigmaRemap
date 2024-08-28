package mapped;

import javax.annotation.Nullable;

public class Class895 extends Class890 {
   private static String[] field5130;

   public Class895(Class8992<? extends Class895> var1, Class1655 var2) {
      super(var1, var2);
   }

   public Class895(Class1655 var1, Class880 var2) {
      super(Class8992.field41090, var2, var1);
   }

   public Class895(Class1655 var1, double var2, double var4, double var6) {
      super(Class8992.field41090, var2, var4, var6, var1);
   }

   @Override
   public Class3257 method3512() {
      return Class8514.field37966;
   }

   @Override
   public void method3465(Class8709 var1) {
      super.method3465(var1);
      var1.method31416().method2741(Class8654.method31123(this, this.method3460()), 0.0F);
   }

   @Override
   public void method3464(Class8710 var1) {
      super.method3464(var1);
      Entity var4 = this.method3460();

      for (int var5 = 0; var5 < 32; var5++) {
         this.field5024
            .method6746(
               Class7940.field34090,
               this.getPosX(),
               this.getPosY() + this.field5054.nextDouble() * 2.0,
               this.getPosZ(),
               this.field5054.nextGaussian(),
               0.0,
               this.field5054.nextGaussian()
            );
      }

      if (!this.field5024.field9020 && !this.field5041) {
         if (!(var4 instanceof Class878)) {
            if (var4 != null) {
               var4.method2793(this.getPosX(), this.getPosY(), this.getPosZ());
               var4.field5045 = 0.0F;
            }
         } else {
            Class878 var7 = (Class878)var4;
            if (var7.field4855.method15589().method30707() && var7.field5024 == this.field5024 && !var7.method3176()) {
               if (this.field5054.nextFloat() < 0.05F && this.field5024.method6789().method17135(Class5462.field24226)) {
                  Class1104 var6 = Class8992.field41026.method33215(this.field5024);
                  var6.method5298(true);
                  var6.method3273(var4.getPosX(), var4.getPosY(), var4.getPosZ(), var4.field5031, var4.field5032);
                  this.field5024.method6916(var6);
               }

               if (var4.method3328()) {
                  var4.method2759();
               }

               var4.method2793(this.getPosX(), this.getPosY(), this.getPosZ());
               var4.field5045 = 0.0F;
               var4.method2741(Class8654.field39002, 5.0F);
            }
         }

         this.method2904();
      }
   }

   @Override
   public void tick() {
      Entity var3 = this.method3460();
      if (var3 instanceof PlayerEntity && !var3.method3066()) {
         this.method2904();
      } else {
         super.tick();
      }
   }

   @Nullable
   @Override
   public Entity method2745(Class1657 var1) {
      Entity var4 = this.method3460();
      if (var4 != null && var4.field5024.method6813() != var1.method6813()) {
         this.method3459((Entity)null);
      }

      return super.method2745(var1);
   }
}
