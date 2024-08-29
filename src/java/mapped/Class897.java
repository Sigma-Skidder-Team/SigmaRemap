package mapped;

public class Class897 extends Entity implements Class889 {
   private static final Class9289<ItemStack> field5132 = Class9361.<ItemStack>method35441(Class897.class, Class7784.field33396);
   private double field5133;
   private double field5134;
   private double field5135;
   private int field5136;
   private boolean field5137;

   public Class897(EntityType<? extends Class897> var1, World var2) {
      super(var1, var2);
   }

   public Class897(World var1, double var2, double var4, double var6) {
      this(EntityType.field41030, var1);
      this.field5136 = 0;
      this.method3215(var2, var4, var6);
   }

   public void method3522(ItemStack var1) {
      if (var1.getItem() != Items.field37979 || var1.method32141()) {
         this.method3210().method35446(field5132, Util.<ItemStack>method38508(var1.copy(), var0 -> var0.method32180(1)));
      }
   }

   private ItemStack method3523() {
      return this.method3210().<ItemStack>method35445(field5132);
   }

   @Override
   public ItemStack method3509() {
      ItemStack var3 = this.method3523();
      return !var3.isEmpty() ? var3 : new ItemStack(Items.field37979);
   }

   @Override
   public void method2850() {
      this.method3210().method35442(field5132, ItemStack.EMPTY);
   }

   @Override
   public boolean method3291(double var1) {
      double var5 = this.method3389().method19675() * 4.0;
      if (Double.isNaN(var5)) {
         var5 = 4.0;
      }

      var5 *= 64.0;
      return var1 < var5 * var5;
   }

   public void method3524(BlockPos var1) {
      double var4 = (double)var1.getX();
      int var6 = var1.getY();
      double var7 = (double)var1.getZ();
      double var9 = var4 - this.getPosX();
      double var11 = var7 - this.getPosZ();
      float var13 = MathHelper.method37766(var9 * var9 + var11 * var11);
      if (!(var13 > 12.0F)) {
         this.field5133 = var4;
         this.field5134 = (double)var6;
         this.field5135 = var7;
      } else {
         this.field5133 = this.getPosX() + var9 / (double)var13 * 12.0;
         this.field5135 = this.getPosZ() + var11 / (double)var13 * 12.0;
         this.field5134 = this.getPosY() + 8.0;
      }

      this.field5136 = 0;
      this.field5137 = this.field5054.nextInt(5) > 0;
   }

   @Override
   public void method3325(double var1, double var3, double var5) {
      this.method3435(var1, var3, var5);
      if (this.field5034 == 0.0F && this.field5033 == 0.0F) {
         float var9 = MathHelper.method37766(var1 * var1 + var5 * var5);
         this.field5031 = (float)(MathHelper.method37814(var1, var5) * 180.0F / (float)Math.PI);
         this.field5032 = (float)(MathHelper.method37814(var3, (double)var9) * 180.0F / (float)Math.PI);
         this.field5033 = this.field5031;
         this.field5034 = this.field5032;
      }
   }

   @Override
   public void tick() {
      super.tick();
      Vector3d var3 = this.method3433();
      double var4 = this.getPosX() + var3.field18048;
      double var6 = this.getPosY() + var3.field18049;
      double var8 = this.getPosZ() + var3.field18050;
      float var10 = MathHelper.method37766(method3234(var3));
      this.field5032 = Class882.method3469(this.field5034, (float)(MathHelper.method37814(var3.field18049, (double)var10) * 180.0F / (float)Math.PI));
      this.field5031 = Class882.method3469(this.field5033, (float)(MathHelper.method37814(var3.field18048, var3.field18050) * 180.0F / (float)Math.PI));
      if (!this.world.field9020) {
         double var12 = this.field5133 - var4;
         double var14 = this.field5135 - var8;
         float var16 = (float)Math.sqrt(var12 * var12 + var14 * var14);
         float var17 = (float) MathHelper.method37814(var14, var12);
         double var18 = MathHelper.method37822(0.0025, (double)var10, (double)var16);
         double var20 = var3.field18049;
         if (var16 < 1.0F) {
            var18 *= 0.8;
            var20 *= 0.8;
         }

         int var22 = !(this.getPosY() < this.field5134) ? -1 : 1;
         var3 = new Vector3d(Math.cos((double)var17) * var18, var20 + ((double)var22 - var20) * 0.015F, Math.sin((double)var17) * var18);
         this.method3434(var3);
      }

      float var11 = 0.25F;
      if (!this.method3250()) {
         this.world
            .method6746(
               Class7940.field34090,
               var4 - var3.field18048 * 0.25 + this.field5054.nextDouble() * 0.6 - 0.3,
               var6 - var3.field18049 * 0.25 - 0.5,
               var8 - var3.field18050 * 0.25 + this.field5054.nextDouble() * 0.6 - 0.3,
               var3.field18048,
               var3.field18049,
               var3.field18050
            );
      } else {
         for (int var23 = 0; var23 < 4; var23++) {
            this.world
               .method6746(
                  Class7940.field34052,
                  var4 - var3.field18048 * 0.25,
                  var6 - var3.field18049 * 0.25,
                  var8 - var3.field18050 * 0.25,
                  var3.field18048,
                  var3.field18049,
                  var3.field18050
               );
         }
      }

      if (this.world.field9020) {
         this.method3446(var4, var6, var8);
      } else {
         this.method3215(var4, var6, var8);
         this.field5136++;
         if (this.field5136 > 80 && !this.world.field9020) {
            this.method2863(Class6067.field26543, 1.0F, 1.0F);
            this.method2904();
            if (!this.field5137) {
               this.world.method6999(2003, this.getPosition(), 0);
            } else {
               this.world.method6916(new ItemEntity(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), this.method3509()));
            }
         }
      }
   }

   @Override
   public void method2724(CompoundNBT var1) {
      ItemStack var4 = this.method3523();
      if (!var4.isEmpty()) {
         var1.put("Item", var4.method32112(new CompoundNBT()));
      }
   }

   @Override
   public void method2723(CompoundNBT var1) {
      ItemStack var4 = ItemStack.method32104(var1.getCompound("Item"));
      this.method3522(var4);
   }

   @Override
   public float method3267() {
      return 1.0F;
   }

   @Override
   public boolean method3360() {
      return false;
   }

   @Override
   public Packet<?> method2835() {
      return new Class5487(this);
   }
}
