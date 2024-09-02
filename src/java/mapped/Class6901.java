package mapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Class6901 extends Class6896 {
   private static String[] field29896;
   public static final Codec<Class6901> field29897 = RecordCodecBuilder.create(var0 -> method21063(var0).apply(var0, Class6901::new));

   public Class6901(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class9107<?> method21064() {
      return Class9107.field41835;
   }

   @Override
   public List<Class9359> method21065(Class1679 var1, Random var2, int var3, BlockPos var4, Set<BlockPos> var5, Class9764 var6, Class4733 var7) {
      ArrayList var10 = Lists.newArrayList();
      BlockPos var11 = var4.down();
      method21069(var1, var11);
      method21069(var1, var11.east());
      method21069(var1, var11.south());
      method21069(var1, var11.south().east());
      Direction var12 = Class76.field161.method247(var2);
      int var13 = var3 - var2.nextInt(4);
      int var14 = 2 - var2.nextInt(3);
      int var15 = var4.getX();
      int var16 = var4.getY();
      int var17 = var4.getZ();
      int var18 = var15;
      int var19 = var17;
      int var20 = var16 + var3 - 1;

      for (int var21 = 0; var21 < var3; var21++) {
         if (var21 >= var13 && var14 > 0) {
            var18 += var12.method539();
            var19 += var12.method541();
            var14--;
         }

         int var22 = var16 + var21;
         BlockPos var23 = new BlockPos(var18, var22, var19);
         if (Class2903.method11229(var1, var23)) {
            method21070(var1, var2, var23, var5, var6, var7);
            method21070(var1, var2, var23.east(), var5, var6, var7);
            method21070(var1, var2, var23.south(), var5, var6, var7);
            method21070(var1, var2, var23.east().south(), var5, var6, var7);
         }
      }

      var10.add(new Class9359(new BlockPos(var18, var20, var19), 0, true));

      for (int var25 = -1; var25 <= 2; var25++) {
         for (int var26 = -1; var26 <= 2; var26++) {
            if ((var25 < 0 || var25 > 1 || var26 < 0 || var26 > 1) && var2.nextInt(3) <= 0) {
               int var27 = var2.nextInt(3) + 2;

               for (int var24 = 0; var24 < var27; var24++) {
                  method21070(var1, var2, new BlockPos(var15 + var25, var20 - var24 - 1, var17 + var26), var5, var6, var7);
               }

               var10.add(new Class9359(new BlockPos(var18 + var25, var20, var19 + var26), 0, false));
            }
         }
      }

      return var10;
   }
}
