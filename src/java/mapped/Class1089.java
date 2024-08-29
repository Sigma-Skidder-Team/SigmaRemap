package mapped;

public class Class1089 extends Class1018 {
   private static final Class120 field5964 = Class120.method339(Items.field37841, Items.field37960, Items.field37959, Items.field38112);
   public float field5965;
   public float field5966;
   public float field5967;
   public float field5968;
   public float field5969 = 1.0F;
   public int field5970 = this.field5054.nextInt(6000) + 6000;
   public boolean field5971;

   public Class1089(EntityType<? extends Class1089> var1, World var2) {
      super(var1, var2);
      this.method4224(Class2163.field14191, 0.0F);
   }

   @Override
   public void method4219() {
      this.field5600.method20002(0, new Class2603(this));
      this.field5600.method20002(1, new Class2747(this, 1.4));
      this.field5600.method20002(2, new Class2785(this, 1.0));
      this.field5600.method20002(3, new Class2680(this, 1.0, false, field5964));
      this.field5600.method20002(4, new Class2764(this, 1.1));
      this.field5600.method20002(5, new Class2737(this, 1.0));
      this.field5600.method20002(6, new Class2612(this, PlayerEntity.class, 6.0F));
      this.field5600.method20002(7, new Class2668(this));
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return !this.method3005() ? var2.field39969 * 0.92F : var2.field39969 * 0.85F;
   }

   public static Class7037 method5069() {
      return Class1006.method4220().method21849(Class9173.field42105, 4.0).method21849(Class9173.field42108, 0.25);
   }

   @Override
   public void method2871() {
      super.method2871();
      this.field5968 = this.field5965;
      this.field5967 = this.field5966;
      this.field5966 = (float)((double)this.field5966 + (double)(!this.field5036 ? 4 : -1) * 0.3);
      this.field5966 = MathHelper.method37777(this.field5966, 0.0F, 1.0F);
      if (!this.field5036 && this.field5969 < 1.0F) {
         this.field5969 = 1.0F;
      }

      this.field5969 = (float)((double)this.field5969 * 0.9);
      Vector3d var3 = this.method3433();
      if (!this.field5036 && var3.field18049 < 0.0) {
         this.method3434(var3.method11347(1.0, 0.6, 1.0));
      }

      this.field5965 = this.field5965 + this.field5969 * 2.0F;
      if (!this.world.field9020 && this.method3066() && !this.method3005() && !this.method5070() && --this.field5970 <= 0) {
         this.method2863(Sounds.field26452, 1.0F, (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F + 1.0F);
         this.method3300(Items.field37904);
         this.field5970 = this.field5054.nextInt(6000) + 6000;
      }
   }

   @Override
   public boolean method2921(float var1, float var2) {
      return false;
   }

   @Override
   public Class9455 method4241() {
      return Sounds.field26450;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Sounds.field26453;
   }

   @Override
   public Class9455 method2880() {
      return Sounds.field26451;
   }

   @Override
   public void method3241(BlockPos var1, BlockState var2) {
      this.method2863(Sounds.field26454, 0.15F, 1.0F);
   }

   public Class1089 method4389(ServerWorld var1, Class1045 var2) {
      return EntityType.field41014.method33215(var1);
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return field5964.test(var1);
   }

   @Override
   public int method2937(PlayerEntity var1) {
      return !this.method5070() ? super.method2937(var1) : 10;
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.field5971 = var1.method132("IsChickenJockey");
      if (var1.contains("EggLayTime")) {
         this.field5970 = var1.method122("EggLayTime");
      }
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method115("IsChickenJockey", this.field5971);
      var1.method102("EggLayTime", this.field5970);
   }

   @Override
   public boolean method4254(double var1) {
      return this.method5070();
   }

   @Override
   public void method3307(Entity var1) {
      super.method3307(var1);
      float var4 = MathHelper.sin(this.field4965 * (float) (Math.PI / 180.0));
      float var5 = MathHelper.cos(this.field4965 * (float) (Math.PI / 180.0));
      float var6 = 0.1F;
      float var7 = 0.0F;
      var1.method3215(this.getPosX() + (double)(0.1F * var4), this.method3440(0.5) + var1.method2894() + 0.0, this.getPosZ() - (double)(0.1F * var5));
      if (var1 instanceof Class880) {
         ((Class880)var1).field4965 = this.field4965;
      }
   }

   public boolean method5070() {
      return this.field5971;
   }

   public void method5071(boolean var1) {
      this.field5971 = var1;
   }
}
