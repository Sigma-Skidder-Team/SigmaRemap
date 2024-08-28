package mapped;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;

public class Class1086 extends Class1087 implements Class1020 {
   private static final Class9289<String> field5951 = Class9361.<String>method35441(Class1086.class, Class7784.field33393);
   private Class7144 field5952;
   private int field5953;
   private UUID field5954;

   public Class1086(Class8992<? extends Class1086> var1, Class1655 var2) {
      super(var1, var2);
   }

   @Override
   public float method4339(BlockPos var1, Class1662 var2) {
      return !var2.method6738(var1.method8313()).method23448(Blocks.MYCELIUM) ? var2.method7009(var1) - 0.5F : 10.0F;
   }

   public static boolean method5034(Class8992<Class1086> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      return var1.method6738(var3.method8313()).method23448(Blocks.MYCELIUM) && var1.method7021(var3, 0) > 8;
   }

   @Override
   public void method3353(Class1657 var1, Class906 var2) {
      UUID var5 = var2.method3375();
      if (!var5.equals(this.field5954)) {
         this.method5036(this.method5037() != Class2210.field14452 ? Class2210.field14452 : Class2210.field14453);
         this.field5954 = var5;
         this.method2863(Class6067.field26765, 2.0F, 1.0F);
      }
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5951, Class2210.method8936(Class2210.field14452));
   }

   @Override
   public Class2274 method4285(PlayerEntity var1, Class79 var2) {
      Class8848 var5 = var1.method3094(var2);
      if (var5.method32107() == Class8514.field37836 && !this.method3005()) {
         boolean var11 = false;
         Class8848 var12;
         if (this.field5952 == null) {
            var12 = new Class8848(Class8514.field37837);
         } else {
            var11 = true;
            var12 = new Class8848(Class8514.field38149);
            Class3284.method11816(var12, this.field5952, this.field5953);
            this.field5952 = null;
            this.field5953 = 0;
         }

         Class8848 var13 = Class8482.method29978(var5, var1, var12, false);
         var1.method3095(var2, var13);
         Class9455 var9;
         if (!var11) {
            var9 = Class6067.field26767;
         } else {
            var9 = Class6067.field26768;
         }

         this.method2863(var9, 1.0F, 1.0F);
         return Class2274.method9002(this.field5024.field9020);
      } else if (var5.method32107() == Class8514.field37956 && this.method4516()) {
         this.method4515(Class2266.field14735);
         if (!this.field5024.field9020) {
            var5.method32121(1, var1, var1x -> var1x.method3185(var2));
         }

         return Class2274.method9002(this.field5024.field9020);
      } else if (this.method5037() == Class2210.field14453 && var5.method32107().method11743(Class5985.field26103)) {
         if (this.field5952 == null) {
            Optional var6 = this.method5035(var5);
            if (!var6.isPresent()) {
               return Class2274.field14820;
            }

            Pair var7 = (Pair)var6.get();
            if (!var1.field4919.field29609) {
               var5.method32182(1);
            }

            for (int var8 = 0; var8 < 4; var8++) {
               this.field5024
                  .method6746(
                     Class7940.field34063,
                     this.getPosX() + this.field5054.nextDouble() / 2.0,
                     this.method3440(0.5),
                     this.getPosZ() + this.field5054.nextDouble() / 2.0,
                     0.0,
                     this.field5054.nextDouble() / 5.0,
                     0.0
                  );
            }

            this.field5952 = (Class7144)var7.getLeft();
            this.field5953 = (Integer)var7.getRight();
            this.method2863(Class6067.field26766, 2.0F, 1.0F);
         } else {
            for (int var10 = 0; var10 < 2; var10++) {
               this.field5024
                  .method6746(
                     Class7940.field34092,
                     this.getPosX() + this.field5054.nextDouble() / 2.0,
                     this.method3440(0.5),
                     this.getPosZ() + this.field5054.nextDouble() / 2.0,
                     0.0,
                     this.field5054.nextDouble() / 5.0,
                     0.0
                  );
            }
         }

         return Class2274.method9002(this.field5024.field9020);
      } else {
         return super.method4285(var1, var2);
      }
   }

   @Override
   public void method4515(Class2266 var1) {
      this.field5024.method6744((PlayerEntity)null, this, Class6067.field26769, var1, 1.0F, 1.0F);
      if (!this.field5024.method6714()) {
         ((Class1657)this.field5024).method6939(Class7940.field34070, this.getPosX(), this.method3440(0.5), this.getPosZ(), 1, 0.0, 0.0, 0.0, 0.0);
         this.method2904();
         Class1087 var4 = Class8992.field41016.method33215(this.field5024);
         var4.method3273(this.getPosX(), this.getPosY(), this.getPosZ(), this.field5031, this.field5032);
         var4.method3043(this.method3042());
         var4.field4965 = this.field4965;
         if (this.method3381()) {
            var4.method3379(this.method3380());
            var4.method3382(this.method3383());
         }

         if (this.method4282()) {
            var4.method4278();
         }

         var4.method3363(this.method3362());
         this.field5024.method6916(var4);

         for (int var5 = 0; var5 < 5; var5++) {
            this.field5024
               .method6916(
                  new Class1000(
                     this.field5024,
                     this.getPosX(),
                     this.method3440(1.0),
                     this.getPosZ(),
                     new Class8848(Class2210.method8937(this.method5037()).method23383())
                  )
               );
         }
      }
   }

   @Override
   public boolean method4516() {
      return this.method3066() && !this.method3005();
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method109("Type", Class2210.method8936(this.method5037()));
      if (this.field5952 != null) {
         var1.method100("EffectId", (byte)Class7144.method22288(this.field5952));
         var1.method102("EffectDuration", this.field5953);
      }
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.method5036(Class2210.method8938(var1.method126("Type")));
      if (var1.method119("EffectId", 1)) {
         this.field5952 = Class7144.method22287(var1.method120("EffectId"));
      }

      if (var1.method119("EffectDuration", 3)) {
         this.field5953 = var1.method122("EffectDuration");
      }
   }

   private Optional<Pair<Class7144, Integer>> method5035(Class8848 var1) {
      Class3257 var4 = var1.method32107();
      if (var4 instanceof Class3292) {
         Block var5 = ((Class3292)var4).method11845();
         if (var5 instanceof Class3490) {
            Class3490 var6 = (Class3490)var5;
            return Optional.<Pair<Class7144, Integer>>of(Pair.of(var6.method12186(), var6.method12187()));
         }
      }

      return Optional.<Pair<Class7144, Integer>>empty();
   }

   private void method5036(Class2210 var1) {
      this.field5063.method35446(field5951, Class2210.method8936(var1));
   }

   public Class2210 method5037() {
      return Class2210.method8938(this.field5063.<String>method35445(field5951));
   }

   public Class1086 method4389(Class1657 var1, Class1045 var2) {
      Class1086 var5 = Class8992.field41058.method33215(var1);
      var5.method5036(this.method5038((Class1086)var2));
      return var5;
   }

   private Class2210 method5038(Class1086 var1) {
      Class2210 var4 = this.method5037();
      Class2210 var5 = var1.method5037();
      Class2210 var6;
      if (var4 == var5 && this.field5054.nextInt(1024) == 0) {
         var6 = var4 != Class2210.field14453 ? Class2210.field14453 : Class2210.field14452;
      } else {
         var6 = !this.field5054.nextBoolean() ? var5 : var4;
      }

      return var6;
   }
}
