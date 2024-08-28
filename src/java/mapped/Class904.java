package mapped;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Class904 extends Class882 {
   private static String[] field5147;
   private final Random field5148 = new Random();
   private boolean field5149;
   private int field5150;
   private static final Class9289<Integer> field5151 = Class9361.<Integer>method35441(Class904.class, Class7784.field33391);
   private static final Class9289<Boolean> field5152 = Class9361.<Boolean>method35441(Class904.class, Class7784.field33398);
   private int field5153;
   private int field5154;
   private int field5155;
   private int field5156;
   private float field5157;
   private boolean field5158 = true;
   private Entity field5159;
   private Class2152 field5160 = Class2152.field14071;
   private final int field5161;
   private final int field5162;

   private Class904(World var1, PlayerEntity var2, int var3, int var4) {
      super(Class8992.field41112, var1);
      this.field5077 = true;
      this.method3459(var2);
      var2.field4930 = this;
      this.field5161 = Math.max(0, var3);
      this.field5162 = Math.max(0, var4);
   }

   public Class904(World var1, PlayerEntity var2, double var3, double var5, double var7) {
      this(var1, var2, 0, 0);
      this.method3215(var3, var5, var7);
      this.field5025 = this.getPosX();
      this.field5026 = this.getPosY();
      this.field5027 = this.getPosZ();
   }

   public Class904(PlayerEntity var1, World var2, int var3, int var4) {
      this(var2, var1, var3, var4);
      float var7 = var1.field5032;
      float var8 = var1.field5031;
      float var9 = MathHelper.method37764(-var8 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var10 = MathHelper.method37763(-var8 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var11 = -MathHelper.method37764(-var7 * (float) (Math.PI / 180.0));
      float var12 = MathHelper.method37763(-var7 * (float) (Math.PI / 180.0));
      double var13 = var1.getPosX() - (double)var10 * 0.3;
      double var15 = var1.method3442();
      double var17 = var1.getPosZ() - (double)var9 * 0.3;
      this.method3273(var13, var15, var17, var8, var7);
      Vector3d var19 = new Vector3d((double)(-var10), (double) MathHelper.method37777(-(var12 / var11), -5.0F, 5.0F), (double)(-var9));
      double var20 = var19.method11348();
      var19 = var19.method11347(
         0.6 / var20 + 0.5 + this.field5054.nextGaussian() * 0.0045,
         0.6 / var20 + 0.5 + this.field5054.nextGaussian() * 0.0045,
         0.6 / var20 + 0.5 + this.field5054.nextGaussian() * 0.0045
      );
      this.method3434(var19);
      this.field5031 = (float)(MathHelper.method37814(var19.field18048, var19.field18050) * 180.0F / (float)Math.PI);
      this.field5032 = (float)(MathHelper.method37814(var19.field18049, (double) MathHelper.method37766(method3234(var19))) * 180.0F / (float)Math.PI);
      this.field5033 = this.field5031;
      this.field5034 = this.field5032;
   }

   @Override
   public void method2850() {
      this.method3210().method35442(field5151, 0);
      this.method3210().method35442(field5152, false);
   }

   @Override
   public void method3155(Class9289<?> var1) {
      if (field5151.equals(var1)) {
         int var4 = this.method3210().<Integer>method35445(field5151);
         this.field5159 = var4 <= 0 ? null : this.field5024.method6774(var4 - 1);
      }

      if (field5152.equals(var1)) {
         this.field5149 = this.method3210().<Boolean>method35445(field5152);
         if (this.field5149) {
            this.method3435(this.method3433().field18048, (double)(-0.4F * MathHelper.method37783(this.field5148, 0.6F, 1.0F)), this.method3433().field18050);
         }
      }

      super.method3155(var1);
   }

   @Override
   public boolean method3291(double var1) {
      double var5 = 64.0;
      return var1 < 4096.0;
   }

   @Override
   public void method3131(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
   }

   @Override
   public void tick() {
      this.field5148.setSeed(this.getUniqueID().getLeastSignificantBits() ^ this.field5024.method6783());
      super.tick();
      PlayerEntity var3 = this.method3544();
      if (var3 != null) {
         if (this.field5024.field9020 || !this.method3534(var3)) {
            if (!this.field5036) {
               this.field5153 = 0;
            } else {
               this.field5153++;
               if (this.field5153 >= 1200) {
                  this.method2904();
                  return;
               }
            }

            float var4 = 0.0F;
            BlockPos var5 = this.method3432();
            Class7379 var6 = this.field5024.method6739(var5);
            if (var6.method23486(Class8953.field40469)) {
               var4 = var6.method23475(this.field5024, var5);
            }

            boolean var7 = var4 > 0.0F;
            if (this.field5160 != Class2152.field14071) {
               if (this.field5160 == Class2152.field14072) {
                  if (this.field5159 != null) {
                     if (!this.field5159.field5041) {
                        this.method3215(this.field5159.getPosX(), this.field5159.method3440(0.8), this.field5159.getPosZ());
                     } else {
                        this.field5159 = null;
                        this.field5160 = Class2152.field14071;
                     }
                  }

                  return;
               }

               if (this.field5160 == Class2152.field14073) {
                  Vector3d var10 = this.method3433();
                  double var11 = this.getPosY() + var10.field18049 - (double)var5.getY() - (double)var4;
                  if (Math.abs(var11) < 0.01) {
                     var11 += Math.signum(var11) * 0.1;
                  }

                  this.method3435(var10.field18048 * 0.9, var10.field18049 - var11 * (double)this.field5054.nextFloat() * 0.2, var10.field18050 * 0.9);
                  if (this.field5154 <= 0 && this.field5156 <= 0) {
                     this.field5158 = true;
                  } else {
                     this.field5158 = this.field5158 && this.field5150 < 10 && this.method3538(var5);
                  }

                  if (!var7) {
                     this.field5150 = Math.min(10, this.field5150 + 1);
                  } else {
                     this.field5150 = Math.max(0, this.field5150 - 1);
                     if (this.field5149) {
                        this.method3434(this.method3433().method11339(0.0, -0.1 * (double)this.field5148.nextFloat() * (double)this.field5148.nextFloat(), 0.0));
                     }

                     if (!this.field5024.field9020) {
                        this.method3537(var5);
                     }
                  }
               }
            } else {
               if (this.field5159 != null) {
                  this.method3434(Vector3d.field18047);
                  this.field5160 = Class2152.field14072;
                  return;
               }

               if (var7) {
                  this.method3434(this.method3433().method11347(0.3, 0.2, 0.3));
                  this.field5160 = Class2152.field14073;
                  return;
               }

               this.method3535();
            }

            if (!var6.method23486(Class8953.field40469)) {
               this.method3434(this.method3433().method11339(0.0, -0.03, 0.0));
            }

            this.move(Class2107.field13742, this.method3433());
            this.method3468();
            if (this.field5160 == Class2152.field14071 && (this.field5036 || this.field5037)) {
               this.method3434(Vector3d.field18047);
            }

            double var8 = 0.92;
            this.method3434(this.method3433().method11344(0.92));
            this.method3216();
         }
      } else {
         this.method2904();
      }
   }

   private boolean method3534(PlayerEntity var1) {
      ItemStack var4 = var1.method3090();
      ItemStack var5 = var1.method3091();
      boolean var6 = var4.method32107() == Class8514.field37906;
      boolean var7 = var5.method32107() == Class8514.field37906;
      if (!var1.field5041 && var1.method3066() && (var6 || var7) && !(this.getDistanceSq(var1) > 1024.0)) {
         return false;
      } else {
         this.method2904();
         return true;
      }
   }

   private void method3535() {
      Class8710 var3 = Class9456.method36385(this, this::method3467);
      this.method3464(var3);
   }

   @Override
   public boolean method3467(Entity var1) {
      return super.method3467(var1) || var1.method3066() && var1 instanceof ItemEntity;
   }

   @Override
   public void method3465(Class8709 var1) {
      super.method3465(var1);
      if (!this.field5024.field9020) {
         this.field5159 = var1.method31416();
         this.method3536();
      }
   }

   @Override
   public void method3466(Class8711 var1) {
      super.method3466(var1);
      this.method3434(this.method3433().method11333().method11344(var1.method31418(this)));
   }

   private void method3536() {
      this.method3210().method35446(field5151, this.field5159.method3205() + 1);
   }

   private void method3537(BlockPos var1) {
      ServerWorld var4 = (ServerWorld)this.field5024;
      int var5 = 1;
      BlockPos var6 = var1.method8311();
      if (this.field5054.nextFloat() < 0.25F && this.field5024.method6796(var6)) {
         var5++;
      }

      if (this.field5054.nextFloat() < 0.5F && !this.field5024.method7022(var6)) {
         var5--;
      }

      if (this.field5154 <= 0) {
         if (this.field5156 <= 0) {
            if (this.field5155 <= 0) {
               this.field5155 = MathHelper.method37782(this.field5054, 100, 600);
               this.field5155 = this.field5155 - this.field5162 * 20 * 5;
            } else {
               this.field5155 -= var5;
               float var9 = 0.15F;
               if (this.field5155 >= 20) {
                  if (this.field5155 >= 40) {
                     if (this.field5155 < 60) {
                        var9 = (float)((double)var9 + (double)(60 - this.field5155) * 0.01);
                     }
                  } else {
                     var9 = (float)((double)var9 + (double)(40 - this.field5155) * 0.02);
                  }
               } else {
                  var9 = (float)((double)var9 + (double)(20 - this.field5155) * 0.05);
               }

               if (this.field5054.nextFloat() < var9) {
                  float var10 = MathHelper.method37783(this.field5054, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
                  float var11 = MathHelper.method37783(this.field5054, 25.0F, 60.0F);
                  double var12 = this.getPosX() + (double)(MathHelper.method37763(var10) * var11 * 0.1F);
                  double var14 = (double)((float) MathHelper.method37769(this.getPosY()) + 1.0F);
                  double var16 = this.getPosZ() + (double)(MathHelper.method37764(var10) * var11 * 0.1F);
                  Class7380 var18 = var4.method6738(new BlockPos(var12, var14 - 1.0, var16));
                  if (var18.method23448(Blocks.WATER)) {
                     var4.method6939(Class7940.field34099, var12, var14, var16, 2 + this.field5054.nextInt(2), 0.1F, 0.0, 0.1F, 0.0);
                  }
               }

               if (this.field5155 <= 0) {
                  this.field5157 = MathHelper.method37783(this.field5054, 0.0F, 360.0F);
                  this.field5156 = MathHelper.method37782(this.field5054, 20, 80);
               }
            }
         } else {
            this.field5156 -= var5;
            if (this.field5156 <= 0) {
               this.method2863(Class6067.field26585, 0.25F, 1.0F + (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.4F);
               double var7 = this.getPosY() + 0.5;
               var4.method6939(
                  Class7940.field34052,
                  this.getPosX(),
                  var7,
                  this.getPosZ(),
                  (int)(1.0F + this.method3429() * 20.0F),
                  (double)this.method3429(),
                  0.0,
                  (double)this.method3429(),
                  0.2F
               );
               var4.method6939(
                  Class7940.field34073,
                  this.getPosX(),
                  var7,
                  this.getPosZ(),
                  (int)(1.0F + this.method3429() * 20.0F),
                  (double)this.method3429(),
                  0.0,
                  (double)this.method3429(),
                  0.2F
               );
               this.field5154 = MathHelper.method37782(this.field5054, 20, 40);
               this.method3210().method35446(field5152, true);
            } else {
               this.field5157 = (float)((double)this.field5157 + this.field5054.nextGaussian() * 4.0);
               float var21 = this.field5157 * (float) (Math.PI / 180.0);
               float var22 = MathHelper.method37763(var21);
               float var23 = MathHelper.method37764(var21);
               double var24 = this.getPosX() + (double)(var22 * (float)this.field5156 * 0.1F);
               double var25 = (double)((float) MathHelper.method37769(this.getPosY()) + 1.0F);
               double var26 = this.getPosZ() + (double)(var23 * (float)this.field5156 * 0.1F);
               Class7380 var27 = var4.method6738(new BlockPos(var24, var25 - 1.0, var26));
               if (var27.method23448(Blocks.WATER)) {
                  if (this.field5054.nextFloat() < 0.15F) {
                     var4.method6939(Class7940.field34052, var24, var25 - 0.1F, var26, 1, (double)var22, 0.1, (double)var23, 0.0);
                  }

                  float var19 = var22 * 0.04F;
                  float var20 = var23 * 0.04F;
                  var4.method6939(Class7940.field34073, var24, var25, var26, 0, (double)var20, 0.01, (double)(-var19), 1.0);
                  var4.method6939(Class7940.field34073, var24, var25, var26, 0, (double)(-var20), 0.01, (double)var19, 1.0);
               }
            }
         }
      } else {
         this.field5154--;
         if (this.field5154 <= 0) {
            this.field5155 = 0;
            this.field5156 = 0;
            this.method3210().method35446(field5152, false);
         }
      }
   }

   private boolean method3538(BlockPos var1) {
      Class2331 var4 = Class2331.field15949;

      for (int var5 = -1; var5 <= 2; var5++) {
         Class2331 var6 = this.method3539(var1.method8336(-2, var5, -2), var1.method8336(2, var5, 2));
         switch (Class8935.field40425[var6.ordinal()]) {
            case 1:
               return false;
            case 2:
               if (var4 == Class2331.field15949) {
                  return false;
               }
               break;
            case 3:
               if (var4 == Class2331.field15947) {
                  return false;
               }
         }

         var4 = var6;
      }

      return true;
   }

   private Class2331 method3539(BlockPos var1, BlockPos var2) {
      return BlockPos.method8360(var1, var2)
         .<Class2331>map(this::method3540)
         .reduce((var0, var1x) -> var0 != var1x ? Class2331.field15949 : var0)
         .orElse(Class2331.field15949);
   }

   private Class2331 method3540(BlockPos var1) {
      Class7380 var4 = this.field5024.method6738(var1);
      if (!var4.method23393() && !var4.method23448(Blocks.LILY_PAD)) {
         Class7379 var5 = var4.method23449();
         return var5.method23486(Class8953.field40469) && var5.method23473() && var4.method23414(this.field5024, var1).method19516()
            ? Class2331.field15948
            : Class2331.field15949;
      } else {
         return Class2331.field15947;
      }
   }

   public boolean method3541() {
      return this.field5158;
   }

   @Override
   public void method2724(Class39 var1) {
   }

   @Override
   public void method2723(Class39 var1) {
   }

   public int method3542(ItemStack var1) {
      PlayerEntity var4 = this.method3544();
      if (!this.field5024.field9020 && var4 != null) {
         int var5 = 0;
         if (this.field5159 == null) {
            if (this.field5154 > 0) {
               Class9464 var6 = new Class9464((ServerWorld)this.field5024)
                  .method36454(Class9525.field44335, this.getPositionVec())
                  .method36454(Class9525.field44338, var1)
                  .method36454(Class9525.field44330, this)
                  .method36450(this.field5054)
                  .method36453((float)this.field5161 + var4.method2978());
               Class7318 var7 = this.field5024.method6715().method1411().method1058(Class8793.field39591);
               List<ItemStack> var8 = var7.method23182(var6.method36460(Class8524.field38285));
               CriteriaTriggers.field44494.method15124((ServerPlayerEntity)var4, var1, this, var8);

               for (ItemStack var10 : var8) {
                  ItemEntity var11 = new ItemEntity(this.field5024, this.getPosX(), this.getPosY(), this.getPosZ(), var10);
                  double var12 = var4.getPosX() - this.getPosX();
                  double var14 = var4.getPosY() - this.getPosY();
                  double var16 = var4.getPosZ() - this.getPosZ();
                  double var18 = 0.1;
                  var11.method3435(var12 * 0.1, var14 * 0.1 + Math.sqrt(Math.sqrt(var12 * var12 + var14 * var14 + var16 * var16)) * 0.08, var16 * 0.1);
                  this.field5024.method6916(var11);
                  var4.field5024
                     .method6916(
                        new ExperienceOrbEntity(var4.field5024, var4.getPosX(), var4.getPosY() + 0.5, var4.getPosZ() + 0.5, this.field5054.nextInt(6) + 1)
                     );
                  if (var10.method32107().method11743(Class5985.field26114)) {
                     var4.method2912(Class8876.field40138, 1);
                  }
               }

               var5 = 1;
            }
         } else {
            this.method3543();
            CriteriaTriggers.field44494.method15124((ServerPlayerEntity)var4, var1, this, Collections.<ItemStack>emptyList());
            this.field5024.method6786(this, (byte)31);
            var5 = !(this.field5159 instanceof ItemEntity) ? 5 : 3;
         }

         if (this.field5036) {
            var5 = 2;
         }

         this.method2904();
         return var5;
      } else {
         return 0;
      }
   }

   @Override
   public void method2866(byte var1) {
      if (var1 == 31 && this.field5024.field9020 && this.field5159 instanceof PlayerEntity && ((PlayerEntity)this.field5159).method2905()) {
         this.method3543();
      }

      super.method2866(var1);
   }

   public void method3543() {
      Entity var3 = this.method3460();
      if (var3 != null) {
         Vector3d var4 = new Vector3d(var3.getPosX() - this.getPosX(), var3.getPosY() - this.getPosY(), var3.getPosZ() - this.getPosZ())
            .method11344(0.1);
         this.field5159.method3434(this.field5159.method3433().method11338(var4));
      }
   }

   @Override
   public boolean method2940() {
      return false;
   }

   @Override
   public void method2904() {
      super.method2904();
      PlayerEntity var3 = this.method3544();
      if (var3 != null) {
         var3.field4930 = null;
      }
   }

   @Nullable
   public PlayerEntity method3544() {
      Entity var3 = this.method3460();
      return !(var3 instanceof PlayerEntity) ? null : (PlayerEntity)var3;
   }

   @Nullable
   public Entity method3545() {
      return this.field5159;
   }

   @Override
   public boolean method3367() {
      return false;
   }

   @Override
   public Packet<?> method2835() {
      Entity var3 = this.method3460();
      return new Class5487(this, var3 != null ? var3.method3205() : this.method3205());
   }
}