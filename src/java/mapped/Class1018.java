package mapped;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.UUID;

public abstract class Class1018 extends Class1045 {
   private int field5702;
   private UUID field5703;

   public Class1018(Class8992<? extends Class1018> var1, World var2) {
      super(var1, var2);
      this.method4224(Class2163.field14195, 16.0F);
      this.method4224(Class2163.field14196, -1.0F);
   }

   @Override
   public void method4258() {
      if (this.method4767() != 0) {
         this.field5702 = 0;
      }

      super.method4258();
   }

   @Override
   public void method2871() {
      super.method2871();
      if (this.method4767() != 0) {
         this.field5702 = 0;
      }

      if (this.field5702 > 0) {
         this.field5702--;
         if (this.field5702 % 10 == 0) {
            double var3 = this.field5054.nextGaussian() * 0.02;
            double var5 = this.field5054.nextGaussian() * 0.02;
            double var7 = this.field5054.nextGaussian() * 0.02;
            this.field5024.method6746(Class7940.field34080, this.method3438(1.0), this.method3441() + 0.5, this.method3445(1.0), var3, var5, var7);
         }
      }
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (!this.method2760(var1)) {
         this.field5702 = 0;
         return super.method2741(var1, var2);
      } else {
         return false;
      }
   }

   @Override
   public float method4339(BlockPos var1, Class1662 var2) {
      return !var2.method6738(var1.method8313()).method23448(Blocks.field36395) ? var2.method7009(var1) - 0.5F : 10.0F;
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method102("InLove", this.field5702);
      if (this.field5703 != null) {
         var1.method104("LoveCause", this.field5703);
      }
   }

   @Override
   public double method2894() {
      return 0.14;
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.field5702 = var1.method122("InLove");
      this.field5703 = !var1.method106("LoveCause") ? null : var1.method105("LoveCause");
   }

   public static boolean method4500(Class8992<? extends Class1018> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      return var1.method6738(var3.method8313()).method23448(Blocks.field36395) && var1.method7021(var3, 0) > 8;
   }

   @Override
   public int method4236() {
      return 120;
   }

   @Override
   public boolean method4254(double var1) {
      return false;
   }

   @Override
   public int method2937(PlayerEntity var1) {
      return 1 + this.field5024.field9016.nextInt(3);
   }

   public boolean method4381(ItemStack var1) {
      return var1.method32107() == Class8514.field37842;
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (this.method4381(var5)) {
         int var6 = this.method4767();
         if (!this.field5024.field9020 && var6 == 0 && this.method4502()) {
            this.method4501(var1, var5);
            this.method4503(var1);
            return ActionResultType.field14818;
         }

         if (this.method3005()) {
            this.method4501(var1, var5);
            this.method4768((int)((float)(-var6 / 20) * 0.1F), true);
            return ActionResultType.method9002(this.field5024.field9020);
         }

         if (this.field5024.field9020) {
            return ActionResultType.field14819;
         }
      }

      return super.method4285(var1, var2);
   }

   public void method4501(PlayerEntity var1, ItemStack var2) {
      if (!var1.field4919.field29609) {
         var2.method32182(1);
      }
   }

   public boolean method4502() {
      return this.field5702 <= 0;
   }

   public void method4503(PlayerEntity var1) {
      this.field5702 = 600;
      if (var1 != null) {
         this.field5703 = var1.getUniqueID();
      }

      this.field5024.method6786(this, (byte)18);
   }

   public void method4504(int var1) {
      this.field5702 = var1;
   }

   public int method4505() {
      return this.field5702;
   }

   @Nullable
   public ServerPlayerEntity method4506() {
      if (this.field5703 != null) {
         PlayerEntity var3 = this.field5024.method7196(this.field5703);
         return !(var3 instanceof ServerPlayerEntity) ? null : (ServerPlayerEntity)var3;
      } else {
         return null;
      }
   }

   public boolean method4507() {
      return this.field5702 > 0;
   }

   public void method4508() {
      this.field5702 = 0;
   }

   public boolean method4386(Class1018 var1) {
      if (var1 != this) {
         return var1.getClass() != this.getClass() ? false : this.method4507() && var1.method4507();
      } else {
         return false;
      }
   }

   public void method4509(ServerWorld var1, Class1018 var2) {
      Class1045 var5 = this.method4389(var1, var2);
      if (var5 != null) {
         ServerPlayerEntity var6 = this.method4506();
         if (var6 == null && var2.method4506() != null) {
            var6 = var2.method4506();
         }

         if (var6 != null) {
            var6.method2911(Class8876.field40136);
            CriteriaTriggers.field44479.method15112(var6, this, var2, var5);
         }

         this.method4770(6000);
         var2.method4770(6000);
         this.method4508();
         var2.method4508();
         var5.method4308(true);
         var5.method3273(this.getPosX(), this.getPosY(), this.getPosZ(), 0.0F, 0.0F);
         var1.method6995(var5);
         var1.method6786(this, (byte)18);
         if (var1.method6789().method17135(Class5462.field24227)) {
            var1.method6916(new ExperienceOrbEntity(var1, this.getPosX(), this.getPosY(), this.getPosZ(), this.method3013().nextInt(7) + 1));
         }
      }
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 18) {
         super.method2866(var1);
      } else {
         for (int var4 = 0; var4 < 7; var4++) {
            double var5 = this.field5054.nextGaussian() * 0.02;
            double var7 = this.field5054.nextGaussian() * 0.02;
            double var9 = this.field5054.nextGaussian() * 0.02;
            this.field5024.method6746(Class7940.field34080, this.method3438(1.0), this.method3441() + 0.5, this.method3445(1.0), var5, var7, var9);
         }
      }
   }
}
