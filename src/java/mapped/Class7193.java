package mapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class Class7193 extends Class7194 {
   public Class7193(Codec<Class4728> var1) {
      super(var1, 128);
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
            Blocks.NETHERRACK,
            Blocks.SOUL_SAND,
            Blocks.SOUL_SOIL,
            Blocks.field37083,
            Blocks.field37074,
            Blocks.field36891,
            Blocks.field37076,
            Blocks.BASALT,
            Blocks.field37130
         }
      );
      this.field30898 = ImmutableSet.of(Class9479.field44068, Class9479.field44066);
   }

   @Override
   public int method22592() {
      return 10;
   }

   @Override
   public float method22593(Random var1) {
      return (var1.nextFloat() * 2.0F + var1.nextFloat()) * 2.0F;
   }

   @Override
   public double method22594() {
      return 5.0;
   }

   @Override
   public int method22595(Random var1) {
      return var1.nextInt(this.field30900);
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
      int var19 = var13 | var15 << 4 | var14 << 8;
      if (!var3.get(var19)) {
         var3.set(var19);
         var5.method8372(var11, var14, var12);
         if (!this.method22609(var1.method6738(var5))) {
            return false;
         } else {
            Class7380 var20;
            if (var14 > 31) {
               var20 = field30894;
            } else {
               var20 = field30896.method23484();
            }

            var1.method7061(var5, var20, false);
            return true;
         }
      } else {
         return false;
      }
   }
}
