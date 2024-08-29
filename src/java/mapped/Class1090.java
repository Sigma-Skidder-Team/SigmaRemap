package mapped;

import javax.annotation.Nullable;
import java.util.Random;

public class Class1090 extends Class1018 {
   private static final Class120 field5972 = Class120.method339(Items.field37909, Items.field37910);
   private static final DataParameter<Boolean> field5973 = EntityDataManager.<Boolean>method35441(Class1090.class, Class7784.field33398);
   private Class2775<PlayerEntity> field5974;
   private Class2681 field5975;

   public Class1090(EntityType<? extends Class1090> var1, World var2) {
      super(var1, var2);
      this.method5077();
   }

   private boolean method5072() {
      return this.dataManager.<Boolean>method35445(field5973);
   }

   private void method5073(boolean var1) {
      this.dataManager.method35446(field5973, var1);
      this.method5077();
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method115("Trusting", this.method5072());
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.method5073(var1.method132("Trusting"));
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5973, false);
   }

   @Override
   public void method4219() {
      this.field5975 = new Class2681(this, 0.6, field5972, true);
      this.field5600.method20002(1, new Class2603(this));
      this.field5600.method20002(3, this.field5975);
      this.field5600.method20002(7, new Class2745(this, 0.3F));
      this.field5600.method20002(8, new Class2695(this));
      this.field5600.method20002(9, new Class2785(this, 0.8));
      this.field5600.method20002(10, new Class2737(this, 0.8, 1.0000001E-5F));
      this.field5600.method20002(11, new Class2612(this, PlayerEntity.class, 10.0F));
      this.field5601.method20002(1, new Class2709<Class1089>(this, Class1089.class, false));
      this.field5601.method20002(1, new Class2709<Class1088>(this, Class1088.class, 10, false, false, Class1088.field5963));
   }

   @Override
   public void method4258() {
      if (!this.method4228().method20811()) {
         this.method3211(Pose.STANDING);
         this.setSprinting(false);
      } else {
         double var3 = this.method4228().method20812();
         if (var3 != 0.6) {
            if (var3 != 1.33) {
               this.method3211(Pose.STANDING);
               this.setSprinting(false);
            } else {
               this.method3211(Pose.STANDING);
               this.setSprinting(true);
            }
         } else {
            this.method3211(Pose.field13624);
            this.setSprinting(false);
         }
      }
   }

   @Override
   public boolean method4254(double var1) {
      return !this.method5072() && this.ticksExisted > 2400;
   }

   public static Class7037 method5074() {
      return Class1006.method4220().method21849(Class9173.field42105, 10.0).method21849(Class9173.field42108, 0.3F).method21849(Class9173.field42110, 3.0);
   }

   @Override
   public boolean method2921(float var1, float var2) {
      return false;
   }

   @Nullable
   @Override
   public Class9455 method4241() {
      return Sounds.field26865;
   }

   @Override
   public int method4236() {
      return 900;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Sounds.field26864;
   }

   @Override
   public Class9455 method2880() {
      return Sounds.field26866;
   }

   private float method5075() {
      return (float)this.method3086(Class9173.field42110);
   }

   @Override
   public boolean method3114(Entity var1) {
      return var1.method2741(Class8654.method31115(this), this.method5075());
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      return !this.method2760(var1) ? super.method2741(var1, var2) : false;
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if ((this.field5975 == null || this.field5975.method10900()) && !this.method5072() && this.method4381(var5) && var1.getDistanceSq(this) < 9.0) {
         this.method4501(var1, var5);
         if (!this.world.isRemote) {
            if (this.rand.nextInt(3) != 0) {
               this.method5076(false);
               this.world.method6786(this, (byte)40);
            } else {
               this.method5073(true);
               this.method5076(true);
               this.world.method6786(this, (byte)41);
            }
         }

         return ActionResultType.method9002(this.world.isRemote);
      } else {
         return super.method4285(var1, var2);
      }
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 41) {
         if (var1 != 40) {
            super.method2866(var1);
         } else {
            this.method5076(false);
         }
      } else {
         this.method5076(true);
      }
   }

   private void method5076(boolean var1) {
      Class7435 var4 = Class7940.field34080;
      if (!var1) {
         var4 = Class7940.field34092;
      }

      for (int var5 = 0; var5 < 7; var5++) {
         double var6 = this.rand.nextGaussian() * 0.02;
         double var8 = this.rand.nextGaussian() * 0.02;
         double var10 = this.rand.nextGaussian() * 0.02;
         this.world.method6746(var4, this.method3438(1.0), this.method3441() + 0.5, this.method3445(1.0), var6, var8, var10);
      }
   }

   public void method5077() {
      if (this.field5974 == null) {
         this.field5974 = new Class2775<PlayerEntity>(this, PlayerEntity.class, 16.0F, 0.8, 1.33);
      }

      this.field5600.method20003(this.field5974);
      if (!this.method5072()) {
         this.field5600.method20002(4, this.field5974);
      }
   }

   public Class1090 method4389(ServerWorld var1, Class1045 var2) {
      return EntityType.field41059.method33215(var1);
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return field5972.test(var1);
   }

   public static boolean method5078(EntityType<Class1090> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      return var4.nextInt(3) != 0;
   }

   @Override
   public boolean method4266(Class1662 var1) {
      if (var1.method7050(this) && !var1.method7014(this.getBoundingBox())) {
         BlockPos var4 = this.getPosition();
         if (var4.getY() < var1.method6776()) {
            return false;
         }

         BlockState var5 = var1.getBlockState(var4.down());
         if (var5.method23448(Blocks.field36395) || var5.method23446(BlockTags.field32767)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      if (var4 == null) {
         var4 = new Class5097(1.0F);
      }

      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }

   @Override
   public Vector3d method3394() {
      return new Vector3d(0.0, (double)(0.5F * this.method3393()), (double)(this.method3429() * 0.4F));
   }

   // $VF: synthetic method
   public static boolean method5079(Class1090 var0) {
      return var0.method5072();
   }
}
