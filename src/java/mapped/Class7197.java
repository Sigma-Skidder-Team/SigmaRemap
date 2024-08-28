package mapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class Class7197 extends Class7196 {
   public Class7197(Codec<Class4728> var1) {
      super(var1);
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
            Blocks.field37012
         }
      );
   }

   @Override
   public boolean method22611(Class1670 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      return false;
   }

   @Override
   public boolean method22596(
      Class1670 var1,
      Function<BlockPos, Class8907> var2,
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
      return Class7198.method22615(this, var1, var3, var4, var5, var8, var9, var10, var11, var12, var13, var14, var15);
   }
}
