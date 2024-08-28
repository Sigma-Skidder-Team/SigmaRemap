package mapped;

public class Class3341 extends Class3257 {
   private static String[] field18847;

   public Class3341(Class5643 var1) {
      super(var1);
   }

   @Override
   public ActionResultType method11707(Class5911 var1) {
      World var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      Class7380 var6 = var4.method6738(var5);
      if (!var6.method23448(Blocks.field36650) || var6.<Boolean>method23463(Class3400.field19054)) {
         return ActionResultType.field14820;
      } else if (var4.field9020) {
         return ActionResultType.field14818;
      } else {
         Class7380 var7 = var6.method23465(Class3400.field19054, Boolean.valueOf(true));
         Block.method11538(var6, var7, var4, var5);
         var4.method6725(var5, var7, 2);
         var4.method6806(var5, Blocks.field36650);
         var1.method18357().method32182(1);
         var4.method6999(1503, var5, 0);
         Class9086 var8 = Class3400.method12029().method38656(var4, var5);
         if (var8 != null) {
            BlockPos var9 = var8.method33878().method8336(-3, 0, -3);

            for (int var10 = 0; var10 < 3; var10++) {
               for (int var11 = 0; var11 < 3; var11++) {
                  var4.method6725(var9.method8336(var10, 0, var11), Blocks.field36649.method11579(), 2);
               }
            }

            var4.method6801(1038, var9.method8336(1, 0, 1), 0);
         }

         return ActionResultType.field14819;
      }
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      Class8711 var7 = method11735(var1, var2, Class1985.field12962);
      if (var7.method31417() == Class2100.field13690 && var1.method6738(var7.method31423()).method23448(Blocks.field36650)) {
         return Class6794.<ItemStack>method20698(var6);
      } else {
         var2.method3154(var3);
         if (var1 instanceof ServerWorld) {
            BlockPos var8 = ((ServerWorld)var1).method6883().method7370().method17820((ServerWorld)var1, Structure.field18067, var2.method3432(), 100, false);
            if (var8 != null) {
               Class897 var9 = new Class897(var1, var2.getPosX(), var2.method3440(0.5), var2.getPosZ());
               var9.method3522(var6);
               var9.method3524(var8);
               var1.method6916(var9);
               if (var2 instanceof ServerPlayerEntity) {
                  CriteriaTriggers.field44477.method15065((ServerPlayerEntity)var2, var8);
               }

               var1.method6743(
                  (PlayerEntity)null,
                  var2.getPosX(),
                  var2.getPosY(),
                  var2.getPosZ(),
                  Class6067.field26544,
                  Class2266.field14734,
                  0.5F,
                  0.4F / (field18735.nextFloat() * 0.4F + 0.8F)
               );
               var1.method6869((PlayerEntity)null, 1003, var2.method3432(), 0);
               if (!var2.field4919.field29609) {
                  var6.method32182(1);
               }

               var2.method2913(Class8876.field40098.method172(this));
               var2.swing(var3, true);
               return Class6794.<ItemStack>method20696(var6);
            }
         }

         return Class6794.<ItemStack>method20697(var6);
      }
   }
}
