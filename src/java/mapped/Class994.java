package mapped;

public class Class994 extends AbstractMinecartEntity {
   private static final DataParameter<Boolean> field5481 = EntityDataManager.<Boolean>method35441(Class994.class, Class7784.field33398);
   private int field5482;
   public double field5483;
   public double field5484;
   private static final Class120 field5485 = Class120.method339(Items.field37798, Items.field37799);

   public Class994(EntityType<? extends Class994> var1, World var2) {
      super(var1, var2);
   }

   public Class994(World var1, double var2, double var4, double var6) {
      super(EntityType.field41053, var1, var2, var4, var6);
   }

   @Override
   public MinecartType getMinecartType() {
      return MinecartType.FURNACE;
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5481, false);
   }

   @Override
   public void tick() {
      super.tick();
      if (!this.world.method6714()) {
         if (this.field5482 > 0) {
            this.field5482--;
         }

         if (this.field5482 <= 0) {
            this.field5483 = 0.0;
            this.field5484 = 0.0;
         }

         this.method4076(this.field5482 > 0);
      }

      if (this.method4075() && this.rand.nextInt(4) == 0) {
         this.world.method6746(Class7940.field34085, this.getPosX(), this.getPosY() + 0.8, this.getPosZ(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   public double method3588() {
      return 0.2;
   }

   @Override
   public void method3586(Class8654 var1) {
      super.method3586(var1);
      if (!var1.method31131() && this.world.method6789().method17135(Class5462.field24229)) {
         this.method3300(Blocks.FURNACE);
      }
   }

   @Override
   public void method3591(BlockPos var1, BlockState var2) {
      double var5 = 1.0E-4;
      double var7 = 0.001;
      super.method3591(var1, var2);
      Vector3d var9 = this.method3433();
      double var10 = method3234(var9);
      double var12 = this.field5483 * this.field5483 + this.field5484 * this.field5484;
      if (var12 > 1.0E-4 && var10 > 0.001) {
         double var14 = (double) MathHelper.method37766(var10);
         double var16 = (double) MathHelper.method37766(var12);
         this.field5483 = var9.field18048 / var14 * var16;
         this.field5484 = var9.field18050 / var14 * var16;
      }
   }

   @Override
   public void method3593() {
      double var3 = this.field5483 * this.field5483 + this.field5484 * this.field5484;
      if (!(var3 > 1.0E-7)) {
         this.method3434(this.method3433().method11347(0.98, 0.0, 0.98));
      } else {
         var3 = (double) MathHelper.method37766(var3);
         this.field5483 /= var3;
         this.field5484 /= var3;
         this.method3434(this.method3433().method11347(0.8, 0.0, 0.8).method11339(this.field5483, 0.0, this.field5484));
      }

      super.method3593();
   }

   @Override
   public ActionResultType method3304(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (field5485.test(var5) && this.field5482 + 3600 <= 32000) {
         if (!var1.abilities.isCreativeMode) {
            var5.method32182(1);
         }

         this.field5482 += 3600;
      }

      if (this.field5482 > 0) {
         this.field5483 = this.getPosX() - var1.getPosX();
         this.field5484 = this.getPosZ() - var1.getPosZ();
      }

      return ActionResultType.method9002(this.world.field9020);
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method108("PushX", this.field5483);
      var1.method108("PushZ", this.field5484);
      var1.method101("Fuel", (short)this.field5482);
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.field5483 = var1.method125("PushX");
      this.field5484 = var1.method125("PushZ");
      this.field5482 = var1.method121("Fuel");
   }

   public boolean method4075() {
      return this.dataManager.<Boolean>method35445(field5481);
   }

   public void method4076(boolean var1) {
      this.dataManager.method35446(field5481, var1);
   }

   @Override
   public BlockState method3604() {
      return Blocks.FURNACE
         .method11579()
         .method23465(Class3353.field18875, Direction.NORTH)
         .method23465(Class3353.field18876, Boolean.valueOf(this.method4075()));
   }
}
