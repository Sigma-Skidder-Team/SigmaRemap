package mapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.function.Function;

import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class Class7198 extends Class7194 {
   public Class7198(Codec<Class4728> var1) {
      super(var1, 256);
      this.field30897 = ImmutableSet.of(
         Blocks.STONE,
         Blocks.GRANITE,
         Blocks.DIORITE,
         Blocks.ANDESITE,
         Blocks.field36396,
         Blocks.field36397,
         new Block[]{
            Blocks.field36398,
            Blocks.field36395,
            Blocks.field36794,
            Blocks.field36730,
            Blocks.field36731,
            Blocks.field36732,
            Blocks.field36733,
            Blocks.field36734,
            Blocks.field36735,
            Blocks.field36736,
            Blocks.field36737,
            Blocks.field36738,
            Blocks.field36739,
            Blocks.field36740,
            Blocks.field36741,
            Blocks.field36742,
            Blocks.field36743,
            Blocks.field36744,
            Blocks.field36745,
            Blocks.SANDSTONE,
            Blocks.field36835,
            Blocks.MYCELIUM,
            Blocks.SNOW,
            Blocks.SAND,
            Blocks.GRAVEL,
            Blocks.WATER,
            Blocks.LAVA,
            Blocks.field36527,
            Blocks.AIR,
            Blocks.field37012,
            Blocks.PACKED_ICE
         }
      );
   }

   @Override
   public boolean method22611(IChunk var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      return false;
   }

   @Override
   public boolean method22596(
      IChunk var1,
      Function<BlockPos, Biome> var2,
      BitSet var3,
      Random var4,
      Mutable var5,
      Mutable var6,
      Mutable var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      MutableBoolean var16
   ) {
      return method22615(this, var1, var3, var4, var5, var8, var9, var10, var11, var12, var13, var14, var15);
   }

   public static boolean method22615(
      Class7195<?> var0,
      IChunk var1,
      BitSet var2,
      Random var3,
      Mutable var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12
   ) {
      if (var11 >= var5) {
         return false;
      } else {
         int var15 = var10 | var12 << 4 | var11 << 8;
         if (var2.get(var15)) {
            return false;
         } else {
            var2.set(var15);
            var4.method8372(var8, var11, var9);
            BlockState var16 = var1.getBlockState(var4);
            if (!var0.method22609(var16)) {
               return false;
            } else if (var11 == 10) {
               float var22 = var3.nextFloat();
               if (!((double)var22 < 0.25)) {
                  var1.setBlockState(var4, Blocks.field36527.method11579(), false);
               } else {
                  var1.setBlockState(var4, Blocks.field36890.method11579(), false);
                  var1.method7089().method20726(var4, Blocks.field36890, 0);
               }

               return true;
            } else if (var11 < 10) {
               var1.setBlockState(var4, Blocks.LAVA.method11579(), false);
               return false;
            } else {
               boolean var17 = false;

               for (Direction var19 : Class76.field161) {
                  int var20 = var8 + var19.method539();
                  int var21 = var9 + var19.method541();
                  if (var20 >> 4 != var6 || var21 >> 4 != var7 || var1.getBlockState(var4.method8372(var20, var11, var21)).isAir()) {
                     var1.setBlockState(var4, field30895.getBlockState(), false);
                     var1.method7090().method20726(var4, field30895.method23472(), 0);
                     var17 = true;
                     break;
                  }
               }

               var4.method8372(var8, var11, var9);
               if (var17) {
                  return true;
               } else {
                  var1.setBlockState(var4, field30895.getBlockState(), false);
                  return true;
               }
            }
         }
      }
   }
}
