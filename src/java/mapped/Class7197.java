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
         Class8487.field36388,
         Class8487.field36389,
         Class8487.field36391,
         Class8487.field36393,
         Class8487.field36396,
         Class8487.field36397,
         new Class3209[]{
            Class8487.field36398,
            Class8487.field36395,
            Class8487.field36794,
            Class8487.field36730,
            Class8487.field36731,
            Class8487.field36732,
            Class8487.field36733,
            Class8487.field36734,
            Class8487.field36735,
            Class8487.field36736,
            Class8487.field36737,
            Class8487.field36738,
            Class8487.field36739,
            Class8487.field36740,
            Class8487.field36741,
            Class8487.field36742,
            Class8487.field36743,
            Class8487.field36744,
            Class8487.field36745,
            Class8487.field36458,
            Class8487.field36835,
            Class8487.field36640,
            Class8487.field36571,
            Class8487.field36415,
            Class8487.field36417,
            Class8487.field36413,
            Class8487.field36414,
            Class8487.field36527,
            Class8487.field36387,
            Class8487.field37012
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
