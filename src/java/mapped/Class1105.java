package mapped;

import javax.annotation.Nullable;
import java.util.EnumSet;
import java.util.Random;

public class Class1105 extends Class1009 {
   private static String[] field6065;
   private static final Class9289<Boolean> field6066 = Class9361.<Boolean>method35441(Class1105.class, Class7784.field33398);
   private static final Class9289<Integer> field6067 = Class9361.<Integer>method35441(Class1105.class, Class7784.field33391);
   private float field6068;
   private float field6069;
   private float field6070;
   private float field6071;
   private float field6072;
   private Class880 field6073;
   private int field6074;
   private boolean field6075;
   public Class2736 field6076;

   public Class1105(Class8992<? extends Class1105> var1, World var2) {
      super(var1, var2);
      this.field5594 = 10;
      this.method4224(Class2163.field14191, 0.0F);
      this.field5596 = new Class6828(this);
      this.field6068 = this.field5054.nextFloat();
      this.field6069 = this.field6068;
   }

   @Override
   public void method4219() {
      Class2660 var3 = new Class2660(this, 1.0);
      this.field6076 = new Class2736(this, 1.0, 80);
      this.field5600.method20002(4, new Class2724(this));
      this.field5600.method20002(5, var3);
      this.field5600.method20002(7, this.field6076);
      this.field5600.method20002(8, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.method20002(8, new Class2612(this, Class1105.class, 12.0F, 0.01F));
      this.field5600.method20002(9, new Class2668(this));
      this.field6076.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
      var3.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
      this.field5601.method20002(1, new Class2709<Class880>(this, Class880.class, 10, true, false, new Class121(this)));
   }

   public static Class7037 method5300() {
      return Class1009.method4343()
         .method21849(Class9173.field42110, 6.0)
         .method21849(Class9173.field42108, 0.5)
         .method21849(Class9173.field42106, 16.0)
         .method21849(Class9173.field42105, 30.0);
   }

   @Override
   public Class6990 method4221(World var1) {
      return new Class6997(this, var1);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field6066, false);
      this.field5063.method35442(field6067, 0);
   }

   @Override
   public boolean method2998() {
      return true;
   }

   @Override
   public Class7809 method3089() {
      return Class7809.field33509;
   }

   public boolean method5301() {
      return this.field5063.<Boolean>method35445(field6066);
   }

   private void method5302(boolean var1) {
      this.field5063.method35446(field6066, var1);
   }

   public int method5303() {
      return 80;
   }

   private void method5304(int var1) {
      this.field5063.method35446(field6067, var1);
   }

   public boolean method5305() {
      return this.field5063.<Integer>method35445(field6067) != 0;
   }

   @Nullable
   public Class880 method5306() {
      if (this.method5305()) {
         if (!this.field5024.field9020) {
            return this.method4232();
         } else if (this.field6073 == null) {
            Entity var3 = this.field5024.method6774(this.field5063.<Integer>method35445(field6067));
            if (!(var3 instanceof Class880)) {
               return null;
            } else {
               this.field6073 = (Class880)var3;
               return this.field6073;
            }
         } else {
            return this.field6073;
         }
      } else {
         return null;
      }
   }

   @Override
   public void method3155(Class9289<?> var1) {
      super.method3155(var1);
      if (field6067.equals(var1)) {
         this.field6074 = 0;
         this.field6073 = null;
      }
   }

   @Override
   public int method4236() {
      return 160;
   }

   @Override
   public Class9455 method4241() {
      return !this.method3255() ? Class6067.field26644 : Class6067.field26643;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return !this.method3255() ? Class6067.field26650 : Class6067.field26649;
   }

   @Override
   public Class9455 method2880() {
      return !this.method3255() ? Class6067.field26647 : Class6067.field26646;
   }

   @Override
   public boolean method2940() {
      return false;
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return var2.field39969 * 0.5F;
   }

   @Override
   public float method4339(BlockPos var1, Class1662 var2) {
      return !var2.method6739(var1).method23486(Class8953.field40469) ? super.method4339(var1, var2) : 10.0F + var2.method7009(var1) - 0.5F;
   }

   @Override
   public void method2871() {
      if (this.method3066()) {
         if (this.field5024.field9020) {
            this.field6069 = this.field6068;
            if (this.method3250()) {
               if (!this.method5301()) {
                  this.field6070 = this.field6070 + (0.125F - this.field6070) * 0.2F;
               } else if (!(this.field6070 < 0.5F)) {
                  this.field6070 = this.field6070 + (0.5F - this.field6070) * 0.1F;
               } else {
                  this.field6070 = 4.0F;
               }
            } else {
               this.field6070 = 2.0F;
               Vector3d var3 = this.method3433();
               if (var3.field18049 > 0.0 && this.field6075 && !this.method3245()) {
                  this.field5024.method6745(this.getPosX(), this.getPosY(), this.getPosZ(), this.method5307(), this.method2864(), 1.0F, 1.0F, false);
               }

               this.field6075 = var3.field18049 < 0.0 && this.field5024.method6765(this.method3432().method8313(), this);
            }

            this.field6068 = this.field6068 + this.field6070;
            this.field6072 = this.field6071;
            if (this.method3255()) {
               if (!this.method5301()) {
                  this.field6071 = this.field6071 + (1.0F - this.field6071) * 0.06F;
               } else {
                  this.field6071 = this.field6071 + (0.0F - this.field6071) * 0.25F;
               }
            } else {
               this.field6071 = this.field5054.nextFloat();
            }

            if (this.method5301() && this.method3250()) {
               Vector3d var17 = this.method3281(0.0F);

               for (int var4 = 0; var4 < 2; var4++) {
                  this.field5024
                     .method6746(
                        Class7940.field34052,
                        this.method3438(0.5) - var17.field18048 * 1.5,
                        this.method3441() - var17.field18049 * 1.5,
                        this.method3445(0.5) - var17.field18050 * 1.5,
                        0.0,
                        0.0,
                        0.0
                     );
               }
            }

            if (this.method5305()) {
               if (this.field6074 < this.method5303()) {
                  this.field6074++;
               }

               Class880 var18 = this.method5306();
               if (var18 != null) {
                  this.method4227().method28040(var18, 90.0F, 90.0F);
                  this.method4227().method28037();
                  double var5 = (double)this.method5310(0.0F);
                  double var7 = var18.getPosX() - this.getPosX();
                  double var9 = var18.method3440(0.5) - this.method3442();
                  double var11 = var18.getPosZ() - this.getPosZ();
                  double var13 = Math.sqrt(var7 * var7 + var9 * var9 + var11 * var11);
                  var7 /= var13;
                  var9 /= var13;
                  var11 /= var13;
                  double var15 = this.field5054.nextDouble();

                  while (var15 < var13) {
                     var15 += 1.8 - var5 + this.field5054.nextDouble() * (1.7 - var5);
                     this.field5024
                        .method6746(
                           Class7940.field34052,
                           this.getPosX() + var7 * var15,
                           this.method3442() + var9 * var15,
                           this.getPosZ() + var11 * var15,
                           0.0,
                           0.0,
                           0.0
                        );
                  }
               }
            }
         }

         if (!this.method3255()) {
            if (this.field5036) {
               this.method3434(
                  this.method3433()
                     .method11339((double)((this.field5054.nextFloat() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.field5054.nextFloat() * 2.0F - 1.0F) * 0.4F))
               );
               this.field5031 = this.field5054.nextFloat() * 360.0F;
               this.field5036 = false;
               this.field5078 = true;
            }
         } else {
            this.method3352(300);
         }

         if (this.method5305()) {
            this.field5031 = this.field4967;
         }
      }

      super.method2871();
   }

   public Class9455 method5307() {
      return Class6067.field26648;
   }

   public float method5308(float var1) {
      return MathHelper.method37821(var1, this.field6069, this.field6068);
   }

   public float method5309(float var1) {
      return MathHelper.method37821(var1, this.field6072, this.field6071);
   }

   public float method5310(float var1) {
      return ((float)this.field6074 + var1) / (float)this.method5303();
   }

   @Override
   public boolean method4266(Class1662 var1) {
      return var1.method7050(this);
   }

   public static boolean method5311(Class8992<? extends Class1105> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      return (var4.nextInt(20) == 0 || !var1.method7008(var3))
         && var1.method6997() != Class2197.field14351
         && (var2 == Class2202.field14393 || var1.method6739(var3).method23486(Class8953.field40469));
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (!this.method5301() && !var1.method31144() && var1.method31113() instanceof Class880) {
         Class880 var5 = (Class880)var1.method31113();
         if (!var1.method31131()) {
            var5.method2741(Class8654.method31125(this), 2.0F);
         }
      }

      if (this.field6076 != null) {
         this.field6076.method10944();
      }

      return super.method2741(var1, var2);
   }

   @Override
   public int method4259() {
      return 180;
   }

   @Override
   public void method2915(Vector3d var1) {
      if (this.method3138() && this.method3250()) {
         this.method3265(0.1F, var1);
         this.move(Class2107.field13742, this.method3433());
         this.method3434(this.method3433().method11344(0.9));
         if (!this.method5301() && this.method4232() == null) {
            this.method3434(this.method3433().method11339(0.0, -0.005, 0.0));
         }
      } else {
         super.method2915(var1);
      }
   }

   // $VF: synthetic method
   public static void method5312(Class1105 var0, int var1) {
      var0.method5304(var1);
   }

   // $VF: synthetic method
   public static void method5313(Class1105 var0, boolean var1) {
      var0.method5302(var1);
   }
}
