package mapped;

import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;

import javax.annotation.Nullable;
import java.util.LinkedHashSet;
import java.util.Random;

public class Class1070 extends Class1018 implements Class1071, Class1069 {
   private static String[] field5902;
   private static final Class120 field5903 = Class120.method339(Class8514.field37349);
   private static final Class120 field5904 = Class120.method339(Class8514.field37349, Class8514.field38065);
   private static final Class9289<Integer> field5905 = Class9361.<Integer>method35441(Class1070.class, Class7784.field33391);
   private static final Class9289<Boolean> field5906 = Class9361.<Boolean>method35441(Class1070.class, Class7784.field33398);
   private static final Class9289<Boolean> field5907 = Class9361.<Boolean>method35441(Class1070.class, Class7784.field33398);
   private final Class6500 field5908 = new Class6500(this.field5063, field5905, field5907);
   private Class2680 field5909;
   private Class2747 field5910;

   public Class1070(Class8992<? extends Class1070> var1, Class1655 var2) {
      super(var1, var2);
      this.field5019 = true;
      this.method4224(Class2163.field14191, -1.0F);
      this.method4224(Class2163.field14190, 0.0F);
      this.method4224(Class2163.field14195, 0.0F);
      this.method4224(Class2163.field14196, 0.0F);
   }

   public static boolean method4976(Class8992<Class1070> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      Mutable var7 = var3.method8354();

      do {
         var7.method8379(Direction.field673);
      } while (var1.method6739(var7).method23486(Class8953.field40470));

      return var1.method6738(var7).method23393();
   }

   @Override
   public void method3155(Class9289<?> var1) {
      if (field5905.equals(var1) && this.field5024.field9020) {
         this.field5908.method19689();
      }

      super.method3155(var1);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5905, 0);
      this.field5063.method35442(field5906, false);
      this.field5063.method35442(field5907, false);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      this.field5908.method19691(var1);
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.field5908.method19692(var1);
   }

   @Override
   public boolean method4943() {
      return this.field5908.method19694();
   }

   @Override
   public boolean method4901() {
      return this.method3066() && !this.method3005();
   }

   @Override
   public void method4942(Class2266 var1) {
      this.field5908.method19693(true);
      if (var1 != null) {
         this.field5024.method6744((PlayerEntity)null, this, Class6067.field27101, var1, 0.5F, 1.0F);
      }
   }

   @Override
   public void method4219() {
      this.field5910 = new Class2747(this, 1.65);
      this.field5600.method20002(1, this.field5910);
      this.field5600.method20002(2, new Class2785(this, 1.0));
      this.field5909 = new Class2680(this, 1.4, false, field5904);
      this.field5600.method20002(3, this.field5909);
      this.field5600.method20002(4, new Class2638(this, 1.5));
      this.field5600.method20002(5, new Class2764(this, 1.1));
      this.field5600.method20002(7, new Class2736(this, 1.0, 60));
      this.field5600.method20002(8, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.method20002(8, new Class2668(this));
      this.field5600.method20002(9, new Class2612(this, Class1070.class, 8.0F));
   }

   public void method4977(boolean var1) {
      this.field5063.method35446(field5906, var1);
   }

   public boolean method4978() {
      return !(this.method3421() instanceof Class1070) ? this.field5063.<Boolean>method35445(field5906) : ((Class1070)this.method3421()).method4978();
   }

   @Override
   public boolean method3107(Class7631 var1) {
      return var1.method25067(Class8953.field40470);
   }

   @Override
   public double method3310() {
      float var3 = Math.min(0.25F, this.field4960);
      float var4 = this.field4961;
      return (double)this.method3430() - 0.19 + (double)(0.12F * Class9679.method37764(var4 * 1.5F) * 2.0F * var3);
   }

   @Override
   public boolean method4277() {
      Entity var3 = this.method3407();
      if (!(var3 instanceof PlayerEntity)) {
         return false;
      } else {
         PlayerEntity var4 = (PlayerEntity)var3;
         return var4.method3090().method32107() == Class8514.field38065 || var4.method3091().method32107() == Class8514.field38065;
      }
   }

   @Override
   public boolean method4266(Class1662 var1) {
      return var1.method7050(this);
   }

   @Nullable
   @Override
   public Entity method3407() {
      return !this.method3408().isEmpty() ? this.method3408().get(0) : null;
   }

   @Override
   public Vector3d method3420(Class880 var1) {
      Vector3d[] var4 = new Vector3d[]{
         method3419((double)this.method3429(), (double)var1.method3429(), var1.field5031),
         method3419((double)this.method3429(), (double)var1.method3429(), var1.field5031 - 22.5F),
         method3419((double)this.method3429(), (double)var1.method3429(), var1.field5031 + 22.5F),
         method3419((double)this.method3429(), (double)var1.method3429(), var1.field5031 - 45.0F),
         method3419((double)this.method3429(), (double)var1.method3429(), var1.field5031 + 45.0F)
      };
      LinkedHashSet<BlockPos> var5 = Sets.newLinkedHashSet();
      double var6 = this.method3389().field28453;
      double var8 = this.method3389().field28450 - 0.5;
      Mutable var10 = new Mutable();

      for (Vector3d var14 : var4) {
         var10.method8373(this.getPosX() + var14.field18048, var6, this.getPosZ() + var14.field18050);

         for (double var15 = var6; var15 > var8; var15--) {
            var5.add(var10.method8353());
            var10.method8379(Direction.field672);
         }
      }

      for (BlockPos var24 : var5) {
         if (!this.field5024.method6739(var24).method23486(Class8953.field40470)) {
            double var17 = this.field5024.method7039(var24);
            if (Class4527.method14423(var17)) {
               Vector3d var19 = Vector3d.method11331(var24, var17);
               UnmodifiableIterator var20 = var1.method2982().iterator();

               while (var20.hasNext()) {
                  Class2090 var21 = (Class2090)var20.next();
                  Class6488 var22 = var1.method3172(var21);
                  if (Class4527.method14424(this.field5024, var1, var22.method19669(var19))) {
                     var1.method3211(var21);
                     return var19;
                  }
               }
            }
         }
      }

      return new Vector3d(this.getPosX(), this.method3389().field28453, this.getPosZ());
   }

   @Override
   public void method2915(Vector3d var1) {
      this.method3113(this.method4979());
      this.method4988(this, this.field5908, var1);
   }

   public float method4979() {
      return (float)this.method3086(Class9173.field42108) * (!this.method4978() ? 1.0F : 0.66F);
   }

   @Override
   public float method4980() {
      return (float)this.method3086(Class9173.field42108) * (!this.method4978() ? 0.55F : 0.23F);
   }

   @Override
   public void method4981(Vector3d var1) {
      super.method2915(var1);
   }

   @Override
   public float method3238() {
      return this.field5044 + 0.6F;
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
      this.method2863(!this.method3264() ? Class6067.field27098 : Class6067.field27099, 1.0F, 1.0F);
   }

   @Override
   public boolean method4982() {
      return this.field5908.method19690(this.method3013());
   }

   @Override
   public void method2761(double var1, boolean var3, Class7380 var4, BlockPos var5) {
      this.method3240();
      if (!this.method3264()) {
         super.method2761(var1, var3, var4, var5);
      } else {
         this.field5045 = 0.0F;
      }
   }

   @Override
   public void tick() {
      if (this.method4984() && this.field5054.nextInt(140) == 0) {
         this.method2863(Class6067.field27094, 1.0F, this.method3100());
      } else if (this.method4983() && this.field5054.nextInt(60) == 0) {
         this.method2863(Class6067.field27095, 1.0F, this.method3100());
      }

      Class7380 var3 = this.field5024.method6738(this.method3432());
      Class7380 var4 = this.method3260();
      boolean var5 = var3.method23446(Class7645.field32808) || var4.method23446(Class7645.field32808) || this.method3427(Class8953.field40470) > 0.0;
      this.method4977(!var5);
      super.tick();
      this.method4985();
      this.method3240();
   }

   private boolean method4983() {
      return this.field5910 != null && this.field5910.method10956();
   }

   private boolean method4984() {
      return this.field5909 != null && this.field5909.method10900();
   }

   @Override
   public boolean method4222() {
      return true;
   }

   private void method4985() {
      if (this.method3264()) {
         Class4832 var3 = Class4832.method14948(this);
         if (var3.method14950(Class3404.field19082, this.method3432(), true)
            && !this.field5024.method6739(this.method3432().method8311()).method23486(Class8953.field40470)) {
            this.field5036 = true;
         } else {
            this.method3434(this.method3433().method11344(0.5).method11339(0.0, 0.05, 0.0));
         }
      }
   }

   public static Class7037 method4986() {
      return Class1006.method4220().method21849(Class9173.field42108, 0.175F).method21849(Class9173.field42106, 16.0);
   }

   @Override
   public Class9455 method4241() {
      return !this.method4983() && !this.method4984() ? Class6067.field27093 : null;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field27097;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field27096;
   }

   @Override
   public boolean method3318(Entity var1) {
      return this.method3408().isEmpty() && !this.method3263(Class8953.field40470);
   }

   @Override
   public boolean method3124() {
      return true;
   }

   @Override
   public boolean method3327() {
      return false;
   }

   @Override
   public Class6990 method4221(Class1655 var1) {
      return new Class6994(this, var1);
   }

   @Override
   public float method4339(BlockPos var1, Class1662 var2) {
      if (!var2.method6738(var1).method23449().method23486(Class8953.field40470)) {
         return !this.method3264() ? 0.0F : Float.NEGATIVE_INFINITY;
      } else {
         return 10.0F;
      }
   }

   public Class1070 method4389(Class1657 var1, Class1045 var2) {
      return Class8992.field41088.method33215(var1);
   }

   @Override
   public boolean method4381(Class8848 var1) {
      return field5903.test(var1);
   }

   @Override
   public void method2877() {
      super.method2877();
      if (this.method4943()) {
         this.method3300(Class8514.field37886);
      }
   }

   @Override
   public Class2274 method4285(PlayerEntity var1, Class79 var2) {
      boolean var5 = this.method4381(var1.method3094(var2));
      if (!var5 && this.method4943() && !this.method3329() && !var1.method2851()) {
         if (!this.field5024.field9020) {
            var1.method3311(this);
         }

         return Class2274.method9002(this.field5024.field9020);
      } else {
         Class2274 var6 = super.method4285(var1, var2);
         if (var6.method9000()) {
            if (var5 && !this.method3245()) {
               this.field5024
                  .method6743(
                     (PlayerEntity)null,
                     this.getPosX(),
                     this.getPosY(),
                     this.getPosZ(),
                     Class6067.field27100,
                     this.method2864(),
                     1.0F,
                     1.0F + (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F
                  );
            }

            return var6;
         } else {
            Class8848 var7 = var1.method3094(var2);
            return var7.method32107() != Class8514.field37886 ? Class2274.field14820 : var7.method32125(var1, this, var2);
         }
      }
   }

   @Override
   public Vector3d method3394() {
      return new Vector3d(0.0, (double)(0.6F * this.method3393()), (double)(this.method3429() * 0.4F));
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      if (!this.method3005()) {
         Object var8;
         if (this.field5054.nextInt(30) != 0) {
            if (this.field5054.nextInt(10) != 0) {
               var8 = new Class5097(0.5F);
            } else {
               Class1045 var9 = Class8992.field41088.method33215(var1.method6970());
               var9.method4770(-24000);
               var8 = this.method4987(var1, var2, var9, (Class5093)null);
            }
         } else {
            Class1006 var10 = Class8992.field41110.method33215(var1.method6970());
            var8 = this.method4987(var1, var2, var10, new Class5096(Class1038.method4661(this.field5054), false));
            var10.method2944(Class2106.field13731, new Class8848(Class8514.field38065));
            this.method4942((Class2266)null);
         }

         return super.method4276(var1, var2, var3, (Class5093)var8, var5);
      } else {
         return super.method4276(var1, var2, var3, var4, var5);
      }
   }

   private Class5093 method4987(Class1659 var1, Class9755 var2, Class1006 var3, Class5093 var4) {
      var3.method3273(this.getPosX(), this.getPosY(), this.getPosZ(), this.field5031, 0.0F);
      var3.method4276(var1, var2, Class2202.field14397, var4, (Class39)null);
      var3.method2758(this, true);
      return new Class5097(0.0F);
   }
}
