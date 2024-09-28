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

public class Class6902 extends Class6896 {
   private static String[] field29898;
   public static final Codec<Class6902> field29899 = RecordCodecBuilder.create(var0 -> method21063(var0).apply(var0, Class6902::new));

   public Class6902(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class9107<?> method21064() {
      return Class9107.field41832;
   }

   @Override
   public List<Class9359> method21065(Class1679 var1, Random var2, int var3, BlockPos var4, Set<BlockPos> var5, Class9764 var6, Class4733 var7) {
      method21069(var1, var4.down());
      ArrayList var10 = Lists.newArrayList();
      Direction var11 = Direction.Plane.HORIZONTAL.method247(var2);
      int var12 = var3 - var2.nextInt(4) - 1;
      int var13 = 3 - var2.nextInt(3);
      BlockPos.Mutable var14 = new BlockPos.Mutable();
      int var15 = var4.getX();
      int var16 = var4.getZ();
      int var17 = 0;

      for (int var18 = 0; var18 < var3; var18++) {
         int var19 = var4.getY() + var18;
         if (var18 >= var12 && var13 > 0) {
            var15 += var11.getXOffset();
            var16 += var11.getZOffset();
            var13--;
         }

         if (method21070(var1, var2, var14.method8372(var15, var19, var16), var5, var6, var7)) {
            var17 = var19 + 1;
         }
      }

      var10.add(new Class9359(new BlockPos(var15, var17, var16), 1, false));
      var15 = var4.getX();
      var16 = var4.getZ();
      Direction var26 = Direction.Plane.HORIZONTAL.method247(var2);
      if (var26 != var11) {
         int var27 = var12 - var2.nextInt(2) - 1;
         int var20 = 1 + var2.nextInt(3);
         var17 = 0;

         for (int var21 = var27; var21 < var3 && var20 > 0; var20--) {
            if (var21 >= 1) {
               int var22 = var4.getY() + var21;
               var15 += var26.getXOffset();
               var16 += var26.getZOffset();
               if (method21070(var1, var2, var14.method8372(var15, var22, var16), var5, var6, var7)) {
                  var17 = var22 + 1;
               }
            }

            var21++;
         }

         if (var17 > 1) {
            var10.add(new Class9359(new BlockPos(var15, var17, var16), 0, false));
         }
      }

      return var10;
   }
}
