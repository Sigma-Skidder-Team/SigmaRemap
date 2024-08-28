package mapped;

import javax.annotation.Nullable;

public class Class1021 extends Class1056 implements Class1020, Class1022 {
   private static final Class9289<Byte> field5709 = Class9361.<Byte>method35441(Class1021.class, Class7784.field33390);

   public Class1021(Class8992<? extends Class1021> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      this.field5600.method20002(1, new Class2598(this, 1.25, 20, 10.0F));
      this.field5600.method20002(2, new Class2737(this, 1.0, 1.0000001E-5F));
      this.field5600.method20002(3, new Class2612(this, PlayerEntity.class, 6.0F));
      this.field5600.method20002(4, new Class2668(this));
      this.field5601.method20002(1, new Class2709<Class1006>(this, Class1006.class, 10, true, false, var0 -> var0 instanceof Class1008));
   }

   public static Class7037 method4529() {
      return Class1006.method4220().method21849(Class9173.field42105, 4.0).method21849(Class9173.field42108, 0.2F);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5709, (byte)16);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method115("Pumpkin", this.method4531());
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      if (var1.method118("Pumpkin")) {
         this.method4532(var1.method132("Pumpkin"));
      }
   }

   @Override
   public boolean method3124() {
      return true;
   }

   @Override
   public void method2871() {
      super.method2871();
      if (!this.field5024.field9020) {
         int var3 = MathHelper.method37769(this.getPosX());
         int var4 = MathHelper.method37769(this.getPosY());
         int var5 = MathHelper.method37769(this.getPosZ());
         if (this.field5024.method7003(new BlockPos(var3, 0, var5)).method32503(new BlockPos(var3, var4, var5)) > 1.0F) {
            this.method2741(Class8654.field38994, 1.0F);
         }

         if (!this.field5024.method6789().method17135(Class5462.field24224)) {
            return;
         }

         Class7380 var6 = Blocks.SNOW.method11579();

         for (int var7 = 0; var7 < 4; var7++) {
            var3 = MathHelper.method37769(this.getPosX() + (double)((float)(var7 % 2 * 2 - 1) * 0.25F));
            var4 = MathHelper.method37769(this.getPosY());
            var5 = MathHelper.method37769(this.getPosZ() + (double)((float)(var7 / 2 % 2 * 2 - 1) * 0.25F));
            BlockPos var8 = new BlockPos(var3, var4, var5);
            if (this.field5024.method6738(var8).method23393()
               && this.field5024.method7003(var8).method32503(var8) < 0.8F
               && var6.method23443(this.field5024, var8)) {
               this.field5024.method6730(var8, var6);
            }
         }
      }
   }

   @Override
   public void method4530(Class880 var1, float var2) {
      Class894 var5 = new Class894(this.field5024, this);
      double var6 = var1.method3442() - 1.1F;
      double var8 = var1.getPosX() - this.getPosX();
      double var10 = var6 - var5.getPosY();
      double var12 = var1.getPosZ() - this.getPosZ();
      float var14 = MathHelper.method37766(var8 * var8 + var12 * var12) * 0.2F;
      var5.method3462(var8, var10 + (double)var14, var12, 1.6F, 12.0F);
      this.method2863(Class6067.field27114, 1.0F, 0.4F / (this.method3013().nextFloat() * 0.4F + 0.8F));
      this.field5024.method6916(var5);
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return 1.7F;
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (var5.method32107() == Class8514.field37956 && this.method4516()) {
         this.method4515(Class2266.field14735);
         if (!this.field5024.field9020) {
            var5.method32121(1, var1, var1x -> var1x.method3185(var2));
         }

         return ActionResultType.method9002(this.field5024.field9020);
      } else {
         return ActionResultType.field14820;
      }
   }

   @Override
   public void method4515(Class2266 var1) {
      this.field5024.method6744((PlayerEntity)null, this, Class6067.field27115, var1, 1.0F, 1.0F);
      if (!this.field5024.method6714()) {
         this.method4532(false);
         this.method3303(new ItemStack(Class8514.field37439), 1.7F);
      }
   }

   @Override
   public boolean method4516() {
      return this.method3066() && this.method4531();
   }

   public boolean method4531() {
      return (this.field5063.<Byte>method35445(field5709) & 16) != 0;
   }

   public void method4532(boolean var1) {
      byte var4 = this.field5063.<Byte>method35445(field5709);
      if (!var1) {
         this.field5063.method35446(field5709, (byte)(var4 & -17));
      } else {
         this.field5063.method35446(field5709, (byte)(var4 | 16));
      }
   }

   @Nullable
   @Override
   public Class9455 method4241() {
      return Class6067.field27111;
   }

   @Nullable
   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field27113;
   }

   @Nullable
   @Override
   public Class9455 method2880() {
      return Class6067.field27112;
   }

   @Override
   public Vector3d method3394() {
      return new Vector3d(0.0, (double)(0.75F * this.method3393()), (double)(this.method3429() * 0.4F));
   }
}
