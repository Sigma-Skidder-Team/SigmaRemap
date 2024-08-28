package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.text.ITextComponent;

import java.util.List;
import java.util.function.Predicate;

public class Class1079 extends Class1009 implements Class1080, Class1022 {
   private static final Class9289<Integer> field5923 = Class9361.<Integer>method35441(Class1079.class, Class7784.field33391);
   private static final Class9289<Integer> field5924 = Class9361.<Integer>method35441(Class1079.class, Class7784.field33391);
   private static final Class9289<Integer> field5925 = Class9361.<Integer>method35441(Class1079.class, Class7784.field33391);
   private static final List<Class9289<Integer>> field5926 = ImmutableList.of(field5923, field5924, field5925);
   private static final Class9289<Integer> field5927 = Class9361.<Integer>method35441(Class1079.class, Class7784.field33391);
   private final float[] field5928 = new float[2];
   private final float[] field5929 = new float[2];
   private final float[] field5930 = new float[2];
   private final float[] field5931 = new float[2];
   private final int[] field5932 = new int[2];
   private final int[] field5933 = new int[2];
   private int field5934;
   private final Class3624 field5935 = (Class3624)new Class3624(this.getDisplayName(), Class2303.field15725, Class2300.field15703).method12281(true);
   private static final Predicate<Class880> field5936 = var0 -> var0.method3089() != Class7809.field33506 && var0.method3170();
   private static final Class8522 field5937 = new Class8522().method30203(20.0).method30209(field5936);

   public Class1079(Class8992<? extends Class1079> var1, World var2) {
      super(var1, var2);
      this.method3043(this.method3075());
      this.method4230().method21674(true);
      this.field5594 = 50;
   }

   @Override
   public void method4219() {
      this.field5600.method20002(0, new Class2733(this));
      this.field5600.method20002(2, new Class2598(this, 1.0, 40, 20.0F));
      this.field5600.method20002(5, new Class2737(this, 1.0));
      this.field5600.method20002(6, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.method20002(7, new Class2668(this));
      this.field5601.method20002(1, new Class2704(this));
      this.field5601.method20002(2, new Class2709<Class1006>(this, Class1006.class, 0, false, false, field5936));
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5923, 0);
      this.field5063.method35442(field5924, 0);
      this.field5063.method35442(field5925, 0);
      this.field5063.method35442(field5927, 0);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method102("Invul", this.method5012());
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.method5013(var1.method122("Invul"));
      if (this.method3381()) {
         this.field5935.method12284(this.getDisplayName());
      }
   }

   @Override
   public void method3379(ITextComponent var1) {
      super.method3379(var1);
      this.field5935.method12284(this.getDisplayName());
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field27239;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field27242;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field27241;
   }

   @Override
   public void method2871() {
      Vector3d var3 = this.method3433().method11347(1.0, 0.6, 1.0);
      if (!this.field5024.field9020 && this.method5014(0) > 0) {
         Entity var4 = this.field5024.method6774(this.method5014(0));
         if (var4 != null) {
            double var5 = var3.field18049;
            if (this.getPosY() < var4.getPosY() || !this.method5016() && this.getPosY() < var4.getPosY() + 5.0) {
               var5 = Math.max(0.0, var5);
               var5 += 0.3 - var5 * 0.6F;
            }

            var3 = new Vector3d(var3.field18048, var5, var3.field18050);
            Vector3d var7 = new Vector3d(var4.getPosX() - this.getPosX(), 0.0, var4.getPosZ() - this.getPosZ());
            if (method3234(var7) > 9.0) {
               Vector3d var8 = var7.method11333();
               var3 = var3.method11339(var8.field18048 * 0.3 - var3.field18048 * 0.6, 0.0, var8.field18050 * 0.3 - var3.field18050 * 0.6);
            }
         }
      }

      this.method3434(var3);
      if (method3234(var3) > 0.05) {
         this.field5031 = (float) MathHelper.method37814(var3.field18050, var3.field18048) * (180.0F / (float)Math.PI) - 90.0F;
      }

      super.method2871();

      for (int var33 = 0; var33 < 2; var33++) {
         this.field5931[var33] = this.field5929[var33];
         this.field5930[var33] = this.field5928[var33];
      }

      for (int var34 = 0; var34 < 2; var34++) {
         int var9 = this.method5014(var34 + 1);
         Entity var10 = null;
         if (var9 > 0) {
            var10 = this.field5024.method6774(var9);
         }

         if (var10 == null) {
            this.field5929[var34] = this.method5007(this.field5929[var34], this.field4965, 10.0F);
         } else {
            double var11 = this.method5004(var34 + 1);
            double var13 = this.method5005(var34 + 1);
            double var15 = this.method5006(var34 + 1);
            double var17 = var10.getPosX() - var11;
            double var19 = var10.method3442() - var13;
            double var21 = var10.getPosZ() - var15;
            double var23 = (double) MathHelper.method37766(var17 * var17 + var21 * var21);
            float var25 = (float)(MathHelper.method37814(var21, var17) * 180.0F / (float)Math.PI) - 90.0F;
            float var26 = (float)(-(MathHelper.method37814(var19, var23) * 180.0F / (float)Math.PI));
            this.field5928[var34] = this.method5007(this.field5928[var34], var26, 40.0F);
            this.field5929[var34] = this.method5007(this.field5929[var34], var25, 10.0F);
         }
      }

      boolean var35 = this.method5016();

      for (int var37 = 0; var37 < 3; var37++) {
         double var27 = this.method5004(var37);
         double var29 = this.method5005(var37);
         double var31 = this.method5006(var37);
         this.field5024
            .method6746(
               Class7940.field34092,
               var27 + this.field5054.nextGaussian() * 0.3F,
               var29 + this.field5054.nextGaussian() * 0.3F,
               var31 + this.field5054.nextGaussian() * 0.3F,
               0.0,
               0.0,
               0.0
            );
         if (var35 && this.field5024.field9016.nextInt(4) == 0) {
            this.field5024
               .method6746(
                  Class7940.field34068,
                  var27 + this.field5054.nextGaussian() * 0.3F,
                  var29 + this.field5054.nextGaussian() * 0.3F,
                  var31 + this.field5054.nextGaussian() * 0.3F,
                  0.7F,
                  0.7F,
                  0.5
               );
         }
      }

      if (this.method5012() > 0) {
         for (int var38 = 0; var38 < 3; var38++) {
            this.field5024
               .method6746(
                  Class7940.field34068,
                  this.getPosX() + this.field5054.nextGaussian(),
                  this.getPosY() + (double)(this.field5054.nextFloat() * 3.3F),
                  this.getPosZ() + this.field5054.nextGaussian(),
                  0.7F,
                  0.7F,
                  0.9F
               );
         }
      }
   }

   @Override
   public void method4258() {
      if (this.method5012() <= 0) {
         super.method4258();

         for (int var3 = 1; var3 < 3; var3++) {
            if (this.field5055 >= this.field5932[var3 - 1]) {
               this.field5932[var3 - 1] = this.field5055 + 10 + this.field5054.nextInt(10);
               if (this.field5024.method6997() == Class2197.field14353 || this.field5024.method6997() == Class2197.field14354) {
                  int var4 = var3 - 1;
                  int var5 = this.field5933[var3 - 1];
                  this.field5933[var4] = this.field5933[var3 - 1] + 1;
                  if (var5 > 15) {
                     float var6 = 10.0F;
                     float var7 = 5.0F;
                     double var8 = MathHelper.method37784(this.field5054, this.getPosX() - 10.0, this.getPosX() + 10.0);
                     double var10 = MathHelper.method37784(this.field5054, this.getPosY() - 5.0, this.getPosY() + 5.0);
                     double var12 = MathHelper.method37784(this.field5054, this.getPosZ() - 10.0, this.getPosZ() + 10.0);
                     this.method5009(var3 + 1, var8, var10, var12, true);
                     this.field5933[var3 - 1] = 0;
                  }
               }

               int var23 = this.method5014(var3);
               if (var23 <= 0) {
                  List var27 = this.field5024.<Class880>method7195(Class880.class, field5937, this, this.method3389().method19663(20.0, 8.0, 20.0));

                  for (int var29 = 0; var29 < 10 && !var27.isEmpty(); var29++) {
                     Class880 var31 = (Class880)var27.get(this.field5054.nextInt(var27.size()));
                     if (var31 != this && var31.method3066() && this.method3135(var31)) {
                        if (!(var31 instanceof PlayerEntity)) {
                           this.method5015(var3, var31.method3205());
                        } else if (!((PlayerEntity)var31).field4919.field29606) {
                           this.method5015(var3, var31.method3205());
                        }
                        break;
                     }

                     var27.remove(var31);
                  }
               } else {
                  Entity var26 = this.field5024.method6774(var23);
                  if (var26 == null || !var26.method3066() || this.getDistanceSq(var26) > 900.0 || !this.method3135(var26)) {
                     this.method5015(var3, 0);
                  } else if (var26 instanceof PlayerEntity && ((PlayerEntity)var26).field4919.field29606) {
                     this.method5015(var3, 0);
                  } else {
                     this.method5008(var3 + 1, (Class880)var26);
                     this.field5932[var3 - 1] = this.field5055 + 40 + this.field5054.nextInt(20);
                     this.field5933[var3 - 1] = 0;
                  }
               }
            }
         }

         if (this.method4232() == null) {
            this.method5015(0, 0);
         } else {
            this.method5015(0, this.method4232().method3205());
         }

         if (this.field5934 > 0) {
            this.field5934--;
            if (this.field5934 == 0 && this.field5024.method6789().method17135(Class5462.field24224)) {
               int var21 = MathHelper.method37769(this.getPosY());
               int var24 = MathHelper.method37769(this.getPosX());
               int var28 = MathHelper.method37769(this.getPosZ());
               boolean var30 = false;

               for (int var32 = -1; var32 <= 1; var32++) {
                  for (int var14 = -1; var14 <= 1; var14++) {
                     for (int var15 = 0; var15 <= 3; var15++) {
                        int var16 = var24 + var32;
                        int var17 = var21 + var15;
                        int var18 = var28 + var14;
                        BlockPos var19 = new BlockPos(var16, var17, var18);
                        Class7380 var20 = this.field5024.method6738(var19);
                        if (method5002(var20)) {
                           var30 = this.field5024.method7180(var19, true, this) || var30;
                        }
                     }
                  }
               }

               if (var30) {
                  this.field5024.method6869((PlayerEntity)null, 1022, this.method3432(), 0);
               }
            }
         }

         if (this.field5055 % 20 == 0) {
            this.method3041(1.0F);
         }

         this.field5935.method12278(this.method3042() / this.method3075());
      } else {
         int var22 = this.method5012() - 1;
         if (var22 <= 0) {
            Class2141 var25 = !this.field5024.method6789().method17135(Class5462.field24224) ? Class2141.field14014 : Class2141.field14016;
            this.field5024.method6756(this, this.getPosX(), this.method3442(), this.getPosZ(), 7.0F, false, var25);
            if (!this.method3245()) {
               this.field5024.method6801(1023, this.method3432(), 0);
            }
         }

         this.method5013(var22);
         if (this.field5055 % 10 == 0) {
            this.method3041(10.0F);
         }
      }
   }

   public static boolean method5002(Class7380 var0) {
      return !var0.method23393() && !Class7645.field32792.method24917(var0.method23383());
   }

   public void method5003() {
      this.method5013(220);
      this.method3043(this.method3075() / 3.0F);
   }

   @Override
   public void method2928(Class7380 var1, Vector3d var2) {
   }

   @Override
   public void method3400(Class878 var1) {
      super.method3400(var1);
      this.field5935.method12263(var1);
   }

   @Override
   public void method3401(Class878 var1) {
      super.method3401(var1);
      this.field5935.method12265(var1);
   }

   private double method5004(int var1) {
      if (var1 > 0) {
         float var4 = (this.field4965 + (float)(180 * (var1 - 1))) * (float) (Math.PI / 180.0);
         float var5 = MathHelper.method37764(var4);
         return this.getPosX() + (double)var5 * 1.3;
      } else {
         return this.getPosX();
      }
   }

   private double method5005(int var1) {
      return var1 > 0 ? this.getPosY() + 2.2 : this.getPosY() + 3.0;
   }

   private double method5006(int var1) {
      if (var1 > 0) {
         float var4 = (this.field4965 + (float)(180 * (var1 - 1))) * (float) (Math.PI / 180.0);
         float var5 = MathHelper.method37763(var4);
         return this.getPosZ() + (double)var5 * 1.3;
      } else {
         return this.getPosZ();
      }
   }

   private float method5007(float var1, float var2, float var3) {
      float var6 = MathHelper.method37792(var2 - var1);
      if (var6 > var3) {
         var6 = var3;
      }

      if (var6 < -var3) {
         var6 = -var3;
      }

      return var1 + var6;
   }

   private void method5008(int var1, Class880 var2) {
      this.method5009(
         var1, var2.getPosX(), var2.getPosY() + (double)var2.method3393() * 0.5, var2.getPosZ(), var1 == 0 && this.field5054.nextFloat() < 0.001F
      );
   }

   private void method5009(int var1, double var2, double var4, double var6, boolean var8) {
      if (!this.method3245()) {
         this.field5024.method6869((PlayerEntity)null, 1024, this.method3432(), 0);
      }

      double var11 = this.method5004(var1);
      double var13 = this.method5005(var1);
      double var15 = this.method5006(var1);
      double var17 = var2 - var11;
      double var19 = var4 - var13;
      double var21 = var6 - var15;
      Class902 var23 = new Class902(this.field5024, this, var17, var19, var21);
      var23.method3459(this);
      if (var8) {
         var23.method3533(true);
      }

      var23.method3446(var11, var13, var15);
      this.field5024.method6916(var23);
   }

   @Override
   public void method4530(Class880 var1, float var2) {
      this.method5008(0, var1);
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (this.method2760(var1)) {
         return false;
      } else if (var1 == Class8654.field38999 || var1.method31109() instanceof Class1079) {
         return false;
      } else if (this.method5012() > 0 && var1 != Class8654.field39004) {
         return false;
      } else {
         if (this.method5016()) {
            Entity var5 = var1.method31113();
            if (var5 instanceof AbstractArrowEntity) {
               return false;
            }
         }

         Entity var7 = var1.method31109();
         if (var7 != null && !(var7 instanceof PlayerEntity) && var7 instanceof Class880 && ((Class880)var7).method3089() == this.method3089()) {
            return false;
         } else {
            if (this.field5934 <= 0) {
               this.field5934 = 20;
            }

            for (int var6 = 0; var6 < this.field5933.length; var6++) {
               this.field5933[var6] = this.field5933[var6] + 3;
            }

            return super.method2741(var1, var2);
         }
      }
   }

   @Override
   public void method3054(Class8654 var1, int var2, boolean var3) {
      super.method3054(var1, var2, var3);
      ItemEntity var6 = this.method3300(Class8514.field38066);
      if (var6 != null) {
         var6.method4136();
      }
   }

   @Override
   public void method3447() {
      if (this.field5024.method6997() == Class2197.field14351 && this.method4256()) {
         this.method2904();
      } else {
         this.field4973 = 0;
      }
   }

   @Override
   public boolean method2921(float var1, float var2) {
      return false;
   }

   @Override
   public boolean method3035(Class2023 var1) {
      return false;
   }

   public static Class7037 method2997() {
      return Class1009.method4343()
         .method21849(Class9173.field42105, 300.0)
         .method21849(Class9173.field42108, 0.6F)
         .method21849(Class9173.field42106, 40.0)
         .method21849(Class9173.field42113, 4.0);
   }

   public float method5010(int var1) {
      return this.field5929[var1];
   }

   public float method5011(int var1) {
      return this.field5928[var1];
   }

   public int method5012() {
      return this.field5063.<Integer>method35445(field5927);
   }

   public void method5013(int var1) {
      this.field5063.method35446(field5927, var1);
   }

   public int method5014(int var1) {
      return this.field5063.<Integer>method35445(field5926.get(var1));
   }

   public void method5015(int var1, int var2) {
      this.field5063.method35446(field5926.get(var1), var2);
   }

   @Override
   public boolean method5016() {
      return this.method3042() <= this.method3075() / 2.0F;
   }

   @Override
   public Class7809 method3089() {
      return Class7809.field33506;
   }

   @Override
   public boolean method3313(Entity var1) {
      return false;
   }

   @Override
   public boolean method3367() {
      return false;
   }

   @Override
   public boolean method3036(Class2023 var1) {
      return var1.method8627() != Class8254.field35486 ? super.method3036(var1) : false;
   }
}
