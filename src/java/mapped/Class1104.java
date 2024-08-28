package mapped;

import java.util.Random;

public class Class1104 extends Class1009 {
   private int field6063;
   private boolean field6064;

   public Class1104(Class8992<? extends Class1104> var1, World var2) {
      super(var1, var2);
      this.field5594 = 3;
   }

   @Override
   public void method4219() {
      this.field5600.method20002(1, new Class2603(this));
      this.field5600.method20002(2, new Class2647(this, 1.0, false));
      this.field5600.method20002(3, new Class2737(this, 1.0));
      this.field5600.method20002(7, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.method20002(8, new Class2668(this));
      this.field5601.method20002(1, new Class2704(this).method10918());
      this.field5601.method20002(2, new Class2709<PlayerEntity>(this, PlayerEntity.class, true));
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return 0.13F;
   }

   public static Class7037 method5296() {
      return Class1009.method4343().method21849(Class9173.field42105, 8.0).method21849(Class9173.field42108, 0.25).method21849(Class9173.field42110, 2.0);
   }

   @Override
   public boolean method2940() {
      return false;
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field26551;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26553;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field26552;
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
      this.method2863(Class6067.field26554, 0.15F, 1.0F);
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.field6063 = var1.method122("Lifetime");
      this.field6064 = var1.method132("PlayerSpawned");
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method102("Lifetime", this.field6063);
      var1.method115("PlayerSpawned", this.field6064);
   }

   @Override
   public void tick() {
      this.field4965 = this.field5031;
      super.tick();
   }

   @Override
   public void method3144(float var1) {
      this.field5031 = var1;
      super.method3144(var1);
   }

   @Override
   public double method2894() {
      return 0.1;
   }

   public boolean method5297() {
      return this.field6064;
   }

   public void method5298(boolean var1) {
      this.field6064 = var1;
   }

   @Override
   public void method2871() {
      super.method2871();
      if (!this.field5024.field9020) {
         if (!this.method4282()) {
            this.field6063++;
         }

         if (this.field6063 >= 2400) {
            this.method2904();
         }
      } else {
         for (int var3 = 0; var3 < 2; var3++) {
            this.field5024
               .method6746(
                  Class7940.field34090,
                  this.method3438(0.5),
                  this.method3441(),
                  this.method3445(0.5),
                  (this.field5054.nextDouble() - 0.5) * 2.0,
                  -this.field5054.nextDouble(),
                  (this.field5054.nextDouble() - 0.5) * 2.0
               );
         }
      }
   }

   public static boolean method5299(Class8992<Class1104> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      if (!method4342(var0, var1, var2, var3, var4)) {
         return false;
      } else {
         PlayerEntity var7 = var1.method7186((double)var3.method8304() + 0.5, (double)var3.getY() + 0.5, (double)var3.method8306() + 0.5, 5.0, true);
         return var7 == null;
      }
   }

   @Override
   public Class7809 method3089() {
      return Class7809.field33507;
   }
}
