package mapped;

import javax.annotation.Nullable;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Random;

public class Class1114 extends Class1113 {
   private static final DataParameter<Byte> field6093 = EntityDataManager.<Byte>method35441(Class1114.class, Class7784.field33390);
   private static final Class8522 field6094 = new Class8522().method30203(4.0).method30205();
   private BlockPos field6095;

   public Class1114(EntityType<? extends Class1114> var1, World var2) {
      super(var1, var2);
      this.method5365(true);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field6093, (byte)0);
   }

   @Override
   public float method3099() {
      return 0.1F;
   }

   @Override
   public float method3100() {
      return super.method3100() * 0.95F;
   }

   @Nullable
   @Override
   public Class9455 method4241() {
      return this.method5364() && this.rand.nextInt(4) != 0 ? null : Sounds.field26380;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Sounds.field26382;
   }

   @Override
   public Class9455 method2880() {
      return Sounds.field26381;
   }

   @Override
   public boolean method3140() {
      return false;
   }

   @Override
   public void method3128(Entity var1) {
   }

   @Override
   public void method3126() {
   }

   public static Class7037 method5363() {
      return Class1006.method4220().method21849(Class9173.field42105, 6.0);
   }

   public boolean method5364() {
      return (this.dataManager.<Byte>method35445(field6093) & 1) != 0;
   }

   public void method5365(boolean var1) {
      int var4 = this.dataManager.<Byte>method35445(field6093);
      if (!var1) {
         this.dataManager.method35446(field6093, (byte)(var4 & -2));
      } else {
         this.dataManager.method35446(field6093, (byte)(var4 | 1));
      }
   }

   @Override
   public void tick() {
      super.tick();
      if (!this.method5364()) {
         this.method3434(this.method3433().method11347(1.0, 0.6, 1.0));
      } else {
         this.method3434(Vector3d.ZERO);
         this.method3446(this.getPosX(), (double) MathHelper.floor(this.getPosY()) + 1.0 - (double)this.method3430(), this.getPosZ());
      }
   }

   @Override
   public void method4258() {
      super.method4258();
      BlockPos var3 = this.getPosition();
      BlockPos var4 = var3.method8311();
      if (!this.method5364()) {
         if (this.field6095 != null && (!this.world.method7007(this.field6095) || this.field6095.getY() < 1)) {
            this.field6095 = null;
         }

         if (this.field6095 == null || this.rand.nextInt(30) == 0 || this.field6095.method8317(this.getPositionVec(), 2.0)) {
            this.field6095 = new BlockPos(
               this.getPosX() + (double)this.rand.nextInt(7) - (double)this.rand.nextInt(7),
               this.getPosY() + (double)this.rand.nextInt(6) - 2.0,
               this.getPosZ() + (double)this.rand.nextInt(7) - (double)this.rand.nextInt(7)
            );
         }

         double var6 = (double)this.field6095.getX() + 0.5 - this.getPosX();
         double var8 = (double)this.field6095.getY() + 0.1 - this.getPosY();
         double var10 = (double)this.field6095.getZ() + 0.5 - this.getPosZ();
         Vector3d var12 = this.method3433();
         Vector3d var13 = var12.method11339(
            (Math.signum(var6) * 0.5 - var12.field18048) * 0.1F,
            (Math.signum(var8) * 0.7F - var12.field18049) * 0.1F,
            (Math.signum(var10) * 0.5 - var12.field18050) * 0.1F
         );
         this.method3434(var13);
         float var14 = (float)(MathHelper.method37814(var13.field18050, var13.field18048) * 180.0F / (float)Math.PI) - 90.0F;
         float var15 = MathHelper.method37792(var14 - this.rotationYaw);
         this.field4984 = 0.5F;
         this.rotationYaw += var15;
         if (this.rand.nextInt(100) == 0 && this.world.getBlockState(var4).method23400(this.world, var4)) {
            this.method5365(true);
         }
      } else {
         boolean var5 = this.method3245();
         if (!this.world.getBlockState(var4).method23400(this.world, var3)) {
            this.method5365(false);
            if (!var5) {
               this.world.method6869((PlayerEntity)null, 1025, var3, 0);
            }
         } else {
            if (this.rand.nextInt(200) == 0) {
               this.field4967 = (float)this.rand.nextInt(360);
            }

            if (this.world.method7188(field6094, this) != null) {
               this.method5365(false);
               if (!var5) {
                  this.world.method6869((PlayerEntity)null, 1025, var3, 0);
               }
            }
         }
      }
   }

   @Override
   public boolean method2940() {
      return false;
   }

   @Override
   public boolean method2921(float var1, float var2) {
      return false;
   }

   @Override
   public void method2761(double var1, boolean var3, BlockState var4, BlockPos var5) {
   }

   @Override
   public boolean method3371() {
      return true;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (!this.method2760(var1)) {
         if (!this.world.field9020 && this.method5364()) {
            this.method5365(false);
         }

         return super.method2741(var1, var2);
      } else {
         return false;
      }
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.dataManager.method35446(field6093, var1.method120("BatFlags"));
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method100("BatFlags", this.dataManager.<Byte>method35445(field6093));
   }

   public static boolean method5366(EntityType<Class1114> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      if (var3.getY() < var1.method6776()) {
         int var7 = var1.method7015(var3);
         int var8 = 4;
         if (!method5367()) {
            if (var4.nextBoolean()) {
               return false;
            }
         } else {
            var8 = 7;
         }

         return var7 <= var4.nextInt(var8) ? method4264(var0, var1, var2, var3, var4) : false;
      } else {
         return false;
      }
   }

   private static boolean method5367() {
      LocalDate var2 = LocalDate.now();
      int var3 = var2.get(ChronoField.DAY_OF_MONTH);
      int var4 = var2.get(ChronoField.MONTH_OF_YEAR);
      return var4 == 10 && var3 >= 20 || var4 == 11 && var3 <= 3;
   }

   @Override
   public float method2957(Pose var1, EntitySize var2) {
      return var2.field39969 / 2.0F;
   }
}
