package mapped;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.Multimap;
import net.minecraft.util.math.BlockPos;

public class Class3272 extends Item implements Class3260 {
   private final Multimap<Class4869, Class9689> field18772;

   public Class3272(Class5643 var1) {
      super(var1);
      Builder var4 = ImmutableMultimap.builder();
      var4.put(Class9173.field42110, new Class9689(field18733, "Tool modifier", 8.0, Class2045.field13352));
      var4.put(Class9173.field42112, new Class9689(field18734, "Tool modifier", -2.9F, Class2045.field13352));
      this.field18772 = var4.build();
   }

   @Override
   public boolean method11706(BlockState var1, World var2, BlockPos var3, PlayerEntity var4) {
      return !var4.isCreative();
   }

   @Override
   public Class2103 method11727(ItemStack var1) {
      return Class2103.field13711;
   }

   @Override
   public int method11728(ItemStack var1) {
      return 72000;
   }

   @Override
   public void method11729(ItemStack var1, World var2, Class880 var3, int var4) {
      if (var3 instanceof PlayerEntity) {
         PlayerEntity var7 = (PlayerEntity)var3;
         int var8 = this.method11728(var1) - var4;
         if (var8 >= 10) {
            int var9 = Class7858.method26337(var1);
            if (var9 <= 0 || var7.method3253()) {
               if (!var2.isRemote) {
                  var1.method32121(1, var7, var1x -> var1x.method3185(var3.method3149()));
                  if (var9 == 0) {
                     Class886 var10 = new Class886(var2, var7, var1);
                     var10.method3463(var7, var7.rotationPitch, var7.rotationYaw, 0.0F, 2.5F + (float)var9 * 0.5F, 1.0F);
                     if (var7.abilities.isCreativeMode) {
                        var10.field5102 = Class2192.field14333;
                     }

                     var2.method6916(var10);
                     var2.method6744((PlayerEntity)null, var10, Sounds.field27154, Class2266.field14735, 1.0F, 1.0F);
                     if (!var7.abilities.isCreativeMode) {
                        var7.inventory.method4048(var1);
                     }
                  }
               }

               var7.method2913(Class8876.field40098.method172(this));
               if (var9 > 0) {
                  float var18 = var7.rotationYaw;
                  float var11 = var7.rotationPitch;
                  float var12 = -MathHelper.sin(var18 * (float) (Math.PI / 180.0)) * MathHelper.cos(var11 * (float) (Math.PI / 180.0));
                  float var13 = -MathHelper.sin(var11 * (float) (Math.PI / 180.0));
                  float var14 = MathHelper.cos(var18 * (float) (Math.PI / 180.0)) * MathHelper.cos(var11 * (float) (Math.PI / 180.0));
                  float var15 = MathHelper.method37765(var12 * var12 + var13 * var13 + var14 * var14);
                  float var16 = 3.0F * ((1.0F + (float)var9) / 4.0F);
                  var12 *= var16 / var15;
                  var13 *= var16 / var15;
                  var14 *= var16 / var15;
                  var7.method3280((double)var12, (double)var13, (double)var14);
                  var7.method3129(20);
                  if (var7.method3226()) {
                     float var17 = 1.1999999F;
                     var7.move(Class2107.field13742, new Vector3d(0.0, 1.1999999F, 0.0));
                  }

                  Class9455 var22;
                  if (var9 < 3) {
                     if (var9 != 2) {
                        var22 = Sounds.field27151;
                     } else {
                        var22 = Sounds.field27152;
                     }
                  } else {
                     var22 = Sounds.field27153;
                  }

                  var2.method6744((PlayerEntity)null, var7, var22, Class2266.field14735, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      if (var6.method32117() < var6.method32119() - 1) {
         if (Class7858.method26337(var6) > 0 && !var2.method3253()) {
            return Class6794.<ItemStack>method20699(var6);
         } else {
            var2.method3154(var3);
            return Class6794.<ItemStack>method20697(var6);
         }
      } else {
         return Class6794.<ItemStack>method20699(var6);
      }
   }

   @Override
   public boolean method11713(ItemStack var1, Class880 var2, Class880 var3) {
      var1.method32121(1, var3, var0 -> var0.method3184(Class2106.field13731));
      return true;
   }

   @Override
   public boolean method11714(ItemStack var1, World var2, BlockState var3, BlockPos var4, Class880 var5) {
      if ((double)var3.method23405(var2, var4) != 0.0) {
         var1.method32121(2, var5, var0 -> var0.method3184(Class2106.field13731));
      }

      return true;
   }

   @Override
   public Multimap<Class4869, Class9689> method11740(Class2106 var1) {
      return var1 != Class2106.field13731 ? super.method11740(var1) : this.field18772;
   }

   @Override
   public int method11736() {
      return 1;
   }
}
