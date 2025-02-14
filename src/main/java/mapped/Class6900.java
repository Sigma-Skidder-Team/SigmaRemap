package mapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.MutableBoundingBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Class6900 extends Class6899 {
   private static String[] field29894;
   public static final Codec<Class6900> field29895 = RecordCodecBuilder.create(var0 -> method21063(var0).apply(var0, Class6900::new));

   public Class6900(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class9107<?> method21064() {
      return Class9107.field41834;
   }

   @Override
   public List<Class9359> method21065(IWorldGenerationReader var1, Random var2, int var3, BlockPos var4, Set<BlockPos> var5, MutableBoundingBox var6, Class4733 var7) {
      ArrayList var10 = Lists.newArrayList();
      var10.addAll(super.method21065(var1, var2, var3, var4, var5, var6, var7));

      for (int var11 = var3 - 2 - var2.nextInt(4); var11 > var3 / 2; var11 -= 2 + var2.nextInt(4)) {
         float var12 = var2.nextFloat() * (float) (Math.PI * 2);
         int var13 = 0;
         int var14 = 0;

         for (int var15 = 0; var15 < 5; var15++) {
            var13 = (int)(1.5F + MathHelper.cos(var12) * (float)var15);
            var14 = (int)(1.5F + MathHelper.sin(var12) * (float)var15);
            BlockPos var16 = var4.add(var13, var11 - 3 + var15 / 2, var14);
            method21070(var1, var2, var16, var5, var6, var7);
         }

         var10.add(new Class9359(var4.add(var13, var11, var14), -2, false));
      }

      return var10;
   }
}
