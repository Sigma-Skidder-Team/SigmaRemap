package mapped;

import java.util.function.Predicate;

public class Class3263 extends Class3262 implements Class3260 {
   private static String[] field18750;

   public Class3263(Class5643 var1) {
      super(var1);
   }

   @Override
   public void method11729(ItemStack var1, World var2, Class880 var3, int var4) {
      if (var3 instanceof PlayerEntity) {
         PlayerEntity var7 = (PlayerEntity)var3;
         boolean var8 = var7.field4919.field29609 || Class7858.method26311(Class8122.field34922, var1) > 0;
         ItemStack var9 = var7.method2983(var1);
         if (!var9.method32105() || var8) {
            if (var9.method32105()) {
               var9 = new ItemStack(Class8514.field37797);
            }

            int var10 = this.method11728(var1) - var4;
            float var11 = method11777(var10);
            if (!((double)var11 < 0.1)) {
               boolean var12 = var8 && var9.method32107() == Class8514.field37797;
               if (!var2.field9020) {
                  Class3308 var13 = (Class3308)(!(var9.method32107() instanceof Class3308) ? Class8514.field37797 : var9.method32107());
                  AbstractArrowEntity var14 = var13.method11850(var2, var9, var7);
                  var14.method3463(var7, var7.field5032, var7.field5031, 0.0F, var11 * 3.0F, 1.0F);
                  if (var11 == 1.0F) {
                     var14.method3484(true);
                  }

                  int var15 = Class7858.method26311(Class8122.field34919, var1);
                  if (var15 > 0) {
                     var14.method3481(var14.method3482() + (double)var15 * 0.5 + 0.5);
                  }

                  int var16 = Class7858.method26311(Class8122.field34920, var1);
                  if (var16 > 0) {
                     var14.method3483(var16);
                  }

                  if (Class7858.method26311(Class8122.field34921, var1) > 0) {
                     var14.method3221(100);
                  }

                  var1.method32121(1, var7, var1x -> var1x.method3185(var7.method3149()));
                  if (var12 || var7.field4919.field29609 && (var9.method32107() == Class8514.field38116 || var9.method32107() == Class8514.field38117)) {
                     var14.field5102 = Class2192.field14333;
                  }

                  var2.method6916(var14);
               }

               var2.method6743(
                  (PlayerEntity)null,
                  var7.getPosX(),
                  var7.getPosY(),
                  var7.getPosZ(),
                  Class6067.field26363,
                  Class2266.field14735,
                  1.0F,
                  1.0F / (field18735.nextFloat() * 0.4F + 1.2F) + var11 * 0.5F
               );
               if (!var12 && !var7.field4919.field29609) {
                  var9.method32182(1);
                  if (var9.method32105()) {
                     var7.field4902.method4048(var9);
                  }
               }

               var7.method2913(Class8876.field40098.method172(this));
            }
         }
      }
   }

   public static float method11777(int var0) {
      float var3 = (float)var0 / 20.0F;
      var3 = (var3 * var3 + var3 * 2.0F) / 3.0F;
      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      return var3;
   }

   @Override
   public int method11728(ItemStack var1) {
      return 72000;
   }

   @Override
   public Class2103 method11727(ItemStack var1) {
      return Class2103.field13710;
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      boolean var7 = !var2.method2983(var6).method32105();
      if (!var2.field4919.field29609 && !var7) {
         return Class6794.<ItemStack>method20699(var6);
      } else {
         var2.method3154(var3);
         return Class6794.<ItemStack>method20697(var6);
      }
   }

   @Override
   public Predicate<ItemStack> method11752() {
      return field18748;
   }

   @Override
   public int method11771() {
      return 15;
   }
}
