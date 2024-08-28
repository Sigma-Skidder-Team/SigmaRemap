package mapped;

import java.util.List;
import java.util.function.Predicate;

public class Class896 extends Class890 implements Class889 {
   public static final Predicate<Class880> field5131 = Class880::method3124;

   public Class896(Class8992<? extends Class896> var1, World var2) {
      super(var1, var2);
   }

   public Class896(World var1, Class880 var2) {
      super(Class8992.field41092, var2, var1);
   }

   public Class896(World var1, double var2, double var4, double var6) {
      super(Class8992.field41092, var2, var4, var6, var1);
   }

   @Override
   public Class3257 method3512() {
      return Class8514.field38115;
   }

   @Override
   public float method3515() {
      return 0.05F;
   }

   @Override
   public void method3466(Class8711 var1) {
      super.method3466(var1);
      if (!this.field5024.field9020) {
         ItemStack var4 = this.method3509();
         Class8812 var5 = Class9741.method38185(var4);
         List var6 = Class9741.method38176(var4);
         boolean var7 = var5 == Class8137.field34977 && var6.isEmpty();
         Direction var8 = var1.method31424();
         BlockPos var9 = var1.method31423();
         BlockPos var10 = var9.method8349(var8);
         if (var7) {
            this.method3521(var10, var8);
            this.method3521(var10.method8349(var8.method536()), var8);

            for (Direction var12 : Class76.field161) {
               this.method3521(var10.method8349(var12), var12);
            }
         }
      }
   }

   @Override
   public void method3464(Class8710 var1) {
      super.method3464(var1);
      if (!this.field5024.field9020) {
         ItemStack var4 = this.method3509();
         Class8812 var5 = Class9741.method38185(var4);
         List var6 = Class9741.method38176(var4);
         boolean var7 = var5 == Class8137.field34977 && var6.isEmpty();
         if (!var7) {
            if (!var6.isEmpty()) {
               if (!this.method3520()) {
                  this.method3518(var6, var1.method31417() != Class2100.field13691 ? null : ((Class8709)var1).method31416());
               } else {
                  this.method3519(var4, var5);
               }
            }
         } else {
            this.method3517();
         }

         int var8 = !var5.method31817() ? 2002 : 2007;
         this.field5024.method6999(var8, this.method3432(), Class9741.method38182(var4));
         this.method2904();
      }
   }

   private void method3517() {
      Class6488 var3 = this.method3389().method19663(4.0, 2.0, 4.0);
      List<Class880> var4 = this.field5024.method6772(Class880.class, var3, field5131);
      if (!var4.isEmpty()) {
         for (Class880 var6 : var4) {
            double var7 = this.getDistanceSq(var6);
            if (var7 < 16.0 && var6.method3124()) {
               var6.method2741(Class8654.method31124(var6, this.method3460()), 1.0F);
            }
         }
      }
   }

   private void method3518(List<Class2023> var1, Entity var2) {
      Class6488 var5 = this.method3389().method19663(4.0, 2.0, 4.0);
      List<Class880> var6 = this.field5024.method7182(Class880.class, var5);
      if (!var6.isEmpty()) {
         for (Class880 var8 : var6) {
            if (var8.method3169()) {
               double var9 = this.getDistanceSq(var8);
               if (var9 < 16.0) {
                  double var11 = 1.0 - Math.sqrt(var9) / 4.0;
                  if (var8 == var2) {
                     var11 = 1.0;
                  }

                  for (Class2023 var14 : var1) {
                     Class7144 var15 = var14.method8627();
                     if (!var15.method22292()) {
                        int var16 = (int)(var11 * (double)var14.method8628() + 0.5);
                        if (var16 > 20) {
                           var8.method3035(new Class2023(var15, var16, var14.method8629(), var14.method8630(), var14.method8631()));
                        }
                     } else {
                        var15.method22290(this, this.method3460(), var8, var14.method8629(), var11);
                     }
                  }
               }
            }
         }
      }
   }

   private void method3519(ItemStack var1, Class8812 var2) {
      Class999 var5 = new Class999(this.field5024, this.getPosX(), this.getPosY(), this.getPosZ());
      Entity var6 = this.method3460();
      if (var6 instanceof Class880) {
         var5.method4113((Class880)var6);
      }

      var5.method4097(3.0F);
      var5.method4110(-0.5F);
      var5.method4112(10);
      var5.method4111(-var5.method4098() / (float)var5.method4108());
      var5.method4099(var2);

      for (Class2023 var8 : Class9741.method38179(var1)) {
         var5.method4101(new Class2023(var8));
      }

      Class39 var9 = var1.method32142();
      if (var9 != null && var9.method119("CustomPotionColor", 99)) {
         var5.method4103(var9.method122("CustomPotionColor"));
      }

      this.field5024.method6916(var5);
   }

   private boolean method3520() {
      return this.method3509().method32107() == Class8514.field38118;
   }

   private void method3521(BlockPos var1, Direction var2) {
      Class7380 var5 = this.field5024.method6738(var1);
      if (!var5.method23446(Class7645.field32798)) {
         if (Class3244.method11655(var5)) {
            this.field5024.method6869((PlayerEntity)null, 1009, var1, 0);
            Class3244.method11652(this.field5024, var1, var5);
            this.field5024.method6730(var1, var5.method23465(Class3244.field18698, Boolean.valueOf(false)));
         }
      } else {
         this.field5024.method6728(var1, false);
      }
   }
}
