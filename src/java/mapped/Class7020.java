package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class7020 implements Class7016 {
   private static String[] field30327;
   private int field30328;

   @Override
   public int method21742(ServerWorld var1, boolean var2, boolean var3) {
      if (!var2) {
         return 0;
      } else if (!var1.method6789().method17135(Class5462.field24247)) {
         return 0;
      } else {
         Random var6 = var1.rand;
         this.field30328--;
         if (this.field30328 > 0) {
            return 0;
         } else {
            this.field30328 = this.field30328 + (60 + var6.nextInt(60)) * 20;
            if (var1.method6808() < 5 && var1.method6812().hasSkyLight()) {
               return 0;
            } else {
               int var7 = 0;

               for (PlayerEntity var9 : var1.method6870()) {
                  if (!var9.isSpectator()) {
                     BlockPos var10 = var9.getPosition();
                     if (!var1.method6812().hasSkyLight() || var10.getY() >= var1.method6776() && var1.method7022(var10)) {
                        Class9755 var11 = var1.method6807(var10);
                        if (var11.method38329(var6.nextFloat() * 3.0F)) {
                           Class8287 var12 = ((ServerPlayerEntity)var9).method2809();
                           int var13 = MathHelper.method37775(var12.method28961(Class8876.field40104.method172(Class8876.field40108)), 1, Integer.MAX_VALUE);
                           short var14 = 24000;
                           if (var6.nextInt(var13) >= 72000) {
                              BlockPos var15 = var10.method8339(20 + var6.nextInt(15)).method8348(-10 + var6.nextInt(21)).method8344(-10 + var6.nextInt(21));
                              BlockState var16 = var1.getBlockState(var15);
                              FluidState var17 = var1.getFluidState(var15);
                              if (Class8170.method28428(var1, var15, var16, var17, EntityType.field41063)) {
                                 Class5093 var18 = null;
                                 int var19 = 1 + var6.nextInt(var11.method38327().getId() + 1);

                                 for (int var20 = 0; var20 < var19; var20++) {
                                    Class1110 var21 = EntityType.field41063.method33215(var1);
                                    var21.method3272(var15, 0.0F, 0.0F);
                                    var18 = var21.method4276(var1, var11, Class2202.field14391, var18, (CompoundNBT)null);
                                    var1.method6995(var21);
                                 }

                                 var7 += var19;
                              }
                           }
                        }
                     }
                  }
               }

               return var7;
            }
         }
      }
   }
}
