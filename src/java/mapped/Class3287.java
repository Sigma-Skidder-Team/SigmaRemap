package mapped;

public class Class3287 extends Item {
   private static String[] field18797;
   private final Class7631 field18798;

   public Class3287(Class7631 var1, Class5643 var2) {
      super(var2);
      this.field18798 = var1;
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      BlockRayTraceResult var7 = method11735(var1, var2, this.field18798 != Class9479.field44064 ? Class1985.field12962 : Class1985.field12963);
      if (var7.getType() != RayTraceResult.Type.MISS) {
         if (var7.getType() != RayTraceResult.Type.BLOCK) {
            return Class6794.<ItemStack>method20698(var6);
         } else {
            BlockRayTraceResult var8 = var7;
            BlockPos var9 = var8.getPos();
            Direction var10 = var8.getFace();
            BlockPos var11 = var9.method8349(var10);
            if (!var1.method6785(var2, var9) || !var2.method2936(var11, var10, var6)) {
               return Class6794.<ItemStack>method20699(var6);
            } else if (this.field18798 == Class9479.field44064) {
               BlockState var15 = var1.getBlockState(var9);
               if (var15.getBlock() instanceof Class3405) {
                  Class7631 var16 = ((Class3405)var15.getBlock()).method11533(var1, var9, var15);
                  if (var16 != Class9479.field44064) {
                     var2.method2913(Class8876.field40098.method172(this));
                     var2.method2863(!var16.method25067(Class8953.field40470) ? Sounds.field26429 : Sounds.field26431, 1.0F, 1.0F);
                     ItemStack var14 = Class8482.method29979(var6, var2, new ItemStack(var16.method25050()));
                     if (!var1.field9020) {
                        CriteriaTriggers.field44474.method15152((ServerPlayerEntity)var2, new ItemStack(var16.method25050()));
                     }

                     return Class6794.<ItemStack>method20700(var14, var1.method6714());
                  }
               }

               return Class6794.<ItemStack>method20699(var6);
            } else {
               BlockState var12 = var1.getBlockState(var9);
               BlockPos var13 = var12.getBlock() instanceof Class3449 && this.field18798 == Class9479.field44066 ? var9 : var11;
               if (!this.method11825(var2, var1, var13, var8)) {
                  return Class6794.<ItemStack>method20699(var6);
               } else {
                  this.method11824(var1, var6, var13);
                  if (var2 instanceof ServerPlayerEntity) {
                     CriteriaTriggers.field44489.method15138((ServerPlayerEntity)var2, var13, var6);
                  }

                  var2.method2913(Class8876.field40098.method172(this));
                  return Class6794.<ItemStack>method20700(this.method11823(var6, var2), var1.method6714());
               }
            }
         }
      } else {
         return Class6794.<ItemStack>method20698(var6);
      }
   }

   public ItemStack method11823(ItemStack var1, PlayerEntity var2) {
      return var2.abilities.isCreativeMode ? var1 : new ItemStack(Items.field37882);
   }

   public void method11824(World var1, ItemStack var2, BlockPos var3) {
   }

   public boolean method11825(PlayerEntity var1, World var2, BlockPos var3, BlockRayTraceResult var4) {
      if (!(this.field18798 instanceof Class7633)) {
         return false;
      } else {
         BlockState var7 = var2.getBlockState(var3);
         Block var8 = var7.getBlock();
         Class8649 var9 = var7.method23384();
         boolean var10 = var7.method23442(this.field18798);
         boolean var11 = var7.isAir() || var10 || var8 instanceof Class3449 && ((Class3449)var8).method11531(var2, var3, var7, this.field18798);
         if (var11) {
            if (var2.method6812().method36877() && this.field18798.method25067(Class8953.field40469)) {
               int var12 = var3.getX();
               int var13 = var3.getY();
               int var14 = var3.getZ();
               var2.method6742(
                  var1, var3, Sounds.field26582, Class2266.field14732, 0.5F, 2.6F + (var2.field9016.nextFloat() - var2.field9016.nextFloat()) * 0.8F
               );

               for (int var15 = 0; var15 < 8; var15++) {
                  var2.method6746(
                     Class7940.field34085, (double)var12 + Math.random(), (double)var13 + Math.random(), (double)var14 + Math.random(), 0.0, 0.0, 0.0
                  );
               }

               return true;
            } else if (var8 instanceof Class3449 && this.field18798 == Class9479.field44066) {
               ((Class3449)var8).method11532(var2, var3, var7, ((Class7633)this.field18798).method25078(false));
               this.method11826(var1, var2, var3);
               return true;
            } else {
               if (!var2.field9020 && var10 && !var9.method31085()) {
                  var2.method7179(var3, true);
               }

               if (!var2.method6725(var3, this.field18798.method25049().method23484(), 11) && !var7.method23449().method23473()) {
                  return false;
               } else {
                  this.method11826(var1, var2, var3);
                  return true;
               }
            }
         } else {
            return var4 != null && this.method11825(var1, var2, var4.getPos().method8349(var4.getFace()), (BlockRayTraceResult)null);
         }
      }
   }

   public void method11826(PlayerEntity var1, Class1660 var2, BlockPos var3) {
      Class9455 var6 = !this.field18798.method25067(Class8953.field40470) ? Sounds.field26426 : Sounds.field26428;
      var2.method6742(var1, var3, var6, Class2266.field14732, 1.0F, 1.0F);
   }
}
