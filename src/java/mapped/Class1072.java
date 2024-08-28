package mapped;

import com.google.common.collect.UnmodifiableIterator;

import javax.annotation.Nullable;

public class Class1072 extends Class1018 implements Class1071, Class1069 {
   private static String[] field5911;
   private static final Class9289<Boolean> field5912 = Class9361.<Boolean>method35441(Class1072.class, Class7784.field33398);
   private static final Class9289<Integer> field5913 = Class9361.<Integer>method35441(Class1072.class, Class7784.field33391);
   private static final Class120 field5914 = Class120.method339(Class8514.field38052, Class8514.field38053, Class8514.field38111);
   private final Class6500 field5915 = new Class6500(this.field5063, field5913, field5912);

   public Class1072(Class8992<? extends Class1072> var1, Class1655 var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      this.field5600.method20002(0, new Class2603(this));
      this.field5600.method20002(1, new Class2747(this, 1.25));
      this.field5600.method20002(3, new Class2785(this, 1.0));
      this.field5600.method20002(4, new Class2680(this, 1.2, Class120.method339(Class8514.field38064), false));
      this.field5600.method20002(4, new Class2680(this, 1.2, false, field5914));
      this.field5600.method20002(5, new Class2764(this, 1.1));
      this.field5600.method20002(6, new Class2737(this, 1.0));
      this.field5600.method20002(7, new Class2612(this, PlayerEntity.class, 6.0F));
      this.field5600.method20002(8, new Class2668(this));
   }

   public static Class7037 method4989() {
      return Class1006.method4220().method21849(Class9173.field42105, 10.0).method21849(Class9173.field42108, 0.25);
   }

   @Nullable
   @Override
   public Entity method3407() {
      return !this.method3408().isEmpty() ? this.method3408().get(0) : null;
   }

   @Override
   public boolean method4277() {
      Entity var3 = this.method3407();
      if (!(var3 instanceof PlayerEntity)) {
         return false;
      } else {
         PlayerEntity var4 = (PlayerEntity)var3;
         return var4.method3090().method32107() == Class8514.field38064 || var4.method3091().method32107() == Class8514.field38064;
      }
   }

   @Override
   public void method3155(Class9289<?> var1) {
      if (field5913.equals(var1) && this.field5024.field9020) {
         this.field5915.method19689();
      }

      super.method3155(var1);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5912, false);
      this.field5063.method35442(field5913, 0);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      this.field5915.method19691(var1);
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.field5915.method19692(var1);
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field26924;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26926;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field26925;
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
      this.method2863(Class6067.field26928, 0.15F, 1.0F);
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
            return var6;
         } else {
            Class8848 var7 = var1.method3094(var2);
            return var7.method32107() != Class8514.field37886 ? Class2274.field14820 : var7.method32125(var1, this, var2);
         }
      }
   }

   @Override
   public boolean method4901() {
      return this.method3066() && !this.method3005();
   }

   @Override
   public void method2877() {
      super.method2877();
      if (this.method4943()) {
         this.method3300(Class8514.field37886);
      }
   }

   @Override
   public boolean method4943() {
      return this.field5915.method19694();
   }

   @Override
   public void method4942(Class2266 var1) {
      this.field5915.method19693(true);
      if (var1 != null) {
         this.field5024.method6744((PlayerEntity)null, this, Class6067.field26927, var1, 0.5F, 1.0F);
      }
   }

   @Override
   public Vector3d method3420(Class880 var1) {
      Direction var4 = this.method3387();
      if (var4.method544() == Class113.field414) {
         return super.method3420(var1);
      } else {
         int[][] var5 = Class4527.method14422(var4);
         BlockPos var6 = this.method3432();
         Mutable var7 = new Mutable();
         UnmodifiableIterator var8 = var1.method2982().iterator();

         while (var8.hasNext()) {
            Class2090 var9 = (Class2090)var8.next();
            Class6488 var10 = var1.method3172(var9);

            for (int[] var14 : var5) {
               var7.method8372(var6.method8304() + var14[0], var6.getY(), var6.method8306() + var14[1]);
               double var15 = this.field5024.method7039(var7);
               if (Class4527.method14423(var15)) {
                  Vector3d var17 = Vector3d.method11331(var7, var15);
                  if (Class4527.method14424(this.field5024, var1, var10.method19669(var17))) {
                     var1.method3211(var9);
                     return var17;
                  }
               }
            }
         }

         return super.method3420(var1);
      }
   }

   @Override
   public void method3353(Class1657 var1, Class906 var2) {
      if (var1.method6997() == Class2197.field14351) {
         super.method3353(var1, var2);
      } else {
         Class1063 var5 = Class8992.field41110.method33215(var1);
         var5.method2944(Class2106.field13731, new Class8848(Class8514.field37815));
         var5.method3273(this.getPosX(), this.getPosY(), this.getPosZ(), this.field5031, this.field5032);
         var5.method4302(this.method4305());
         var5.method4308(this.method3005());
         if (this.method3381()) {
            var5.method3379(this.method3380());
            var5.method3382(this.method3383());
         }

         var5.method4278();
         var1.method6916(var5);
         this.method2904();
      }
   }

   @Override
   public void method2915(Vector3d var1) {
      this.method4988(this, this.field5915, var1);
   }

   @Override
   public float method4980() {
      return (float)this.method3086(Class9173.field42108) * 0.225F;
   }

   @Override
   public void method4981(Vector3d var1) {
      super.method2915(var1);
   }

   @Override
   public boolean method4982() {
      return this.field5915.method19690(this.method3013());
   }

   public Class1072 method4389(Class1657 var1, Class1045 var2) {
      return Class8992.field41064.method33215(var1);
   }

   @Override
   public boolean method4381(Class8848 var1) {
      return field5914.test(var1);
   }

   @Override
   public Vector3d method3394() {
      return new Vector3d(0.0, (double)(0.6F * this.method3393()), (double)(this.method3429() * 0.4F));
   }
}
