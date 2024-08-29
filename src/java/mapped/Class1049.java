package mapped;

import java.util.Random;

public abstract class Class1049 extends Class1047 {
   private static final DataParameter<Boolean> field5809 = EntityDataManager.<Boolean>method35441(Class1049.class, Class7784.field33398);

   public Class1049(EntityType<? extends Class1049> var1, World var2) {
      super(var1, var2);
      this.field5596 = new Class6830(this);
   }

   @Override
   public float method2957(Pose var1, EntitySize var2) {
      return var2.field39969 * 0.65F;
   }

   public static Class7037 method4791() {
      return Class1006.method4220().method21849(Class9173.field42105, 3.0);
   }

   @Override
   public boolean method4255() {
      return super.method4255() || this.method4793();
   }

   public static boolean method4792(EntityType<? extends Class1049> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      return var1.getBlockState(var3).method23448(Blocks.WATER) && var1.getBlockState(var3.up()).method23448(Blocks.WATER);
   }

   @Override
   public boolean method4254(double var1) {
      return !this.method4793() && !this.method3381();
   }

   @Override
   public int method4267() {
      return 8;
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5809, false);
   }

   private boolean method4793() {
      return this.dataManager.<Boolean>method35445(field5809);
   }

   public void method4794(boolean var1) {
      this.dataManager.method35446(field5809, var1);
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method115("FromBucket", this.method4793());
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.method4794(var1.method132("FromBucket"));
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.method20002(0, new Class2747(this, 1.25));
      this.field5600.method20002(2, new Class2770<PlayerEntity>(this, PlayerEntity.class, 8.0F, 1.6, 1.4, Class8088.field34763::test));
      this.field5600.method20002(4, new Class2741(this));
   }

   @Override
   public Class6990 method4221(World var1) {
      return new Class6997(this, var1);
   }

   @Override
   public void method2915(Vector3d var1) {
      if (this.method3138() && this.method3250()) {
         this.method3265(0.01F, var1);
         this.move(Class2107.field13742, this.method3433());
         this.method3434(this.method3433().method11344(0.9));
         if (this.method4232() == null) {
            this.method3434(this.method3433().method11339(0.0, -0.005, 0.0));
         }
      } else {
         super.method2915(var1);
      }
   }

   @Override
   public void method2871() {
      if (!this.method3250() && this.onGround && this.collidedVertically) {
         this.method3434(
            this.method3433()
               .method11339((double)((this.rand.nextFloat() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.rand.nextFloat() * 2.0F - 1.0F) * 0.05F))
         );
         this.onGround = false;
         this.isAirBorne = true;
         this.method2863(this.method4798(), this.method3099(), this.method3100());
      }

      super.method2871();
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (var5.getItem() == Items.field37883 && this.method3066()) {
         this.method2863(Sounds.field26430, 1.0F, 1.0F);
         var5.method32182(1);
         ItemStack var6 = this.method4796();
         this.method4795(var6);
         if (!this.world.isRemote) {
            CriteriaTriggers.field44474.method15152((ServerPlayerEntity)var1, var6);
         }

         if (!var5.isEmpty()) {
            if (!var1.inventory.method4045(var6)) {
               var1.method2882(var6, false);
            }
         } else {
            var1.method3095(var2, var6);
         }

         this.method2904();
         return ActionResultType.method9002(this.world.isRemote);
      } else {
         return super.method4285(var1, var2);
      }
   }

   public void method4795(ItemStack var1) {
      if (this.method3381()) {
         var1.method32150(this.method3380());
      }
   }

   public abstract ItemStack method4796();

   public boolean method4797() {
      return true;
   }

   public abstract Class9455 method4798();

   @Override
   public Class9455 method2859() {
      return Sounds.field26583;
   }

   @Override
   public void method3241(BlockPos var1, BlockState var2) {
   }
}
