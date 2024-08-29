package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2911 extends Class2898<Class4697> {
   public Class2911(Codec<Class4697> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4697 var5) {
      if (var5.field22289.contains(var1.getBlockState(var4.up()).getBlock())) {
         if (var5.field22286 && !var5.field22289.contains(var1.getBlockState(var4.down()).getBlock())) {
            return false;
         } else {
            BlockState var8 = var1.getBlockState(var4);
            if (!var8.isAir() && !var5.field22289.contains(var8.getBlock())) {
               return false;
            } else {
               int var9 = 0;
               int var10 = 0;
               if (var5.field22289.contains(var1.getBlockState(var4.west()).getBlock())) {
                  var10++;
               }

               if (var5.field22289.contains(var1.getBlockState(var4.east()).getBlock())) {
                  var10++;
               }

               if (var5.field22289.contains(var1.getBlockState(var4.north()).getBlock())) {
                  var10++;
               }

               if (var5.field22289.contains(var1.getBlockState(var4.south()).getBlock())) {
                  var10++;
               }

               if (var5.field22289.contains(var1.getBlockState(var4.down()).getBlock())) {
                  var10++;
               }

               int var11 = 0;
               if (var1.method7007(var4.west())) {
                  var11++;
               }

               if (var1.method7007(var4.east())) {
                  var11++;
               }

               if (var1.method7007(var4.north())) {
                  var11++;
               }

               if (var1.method7007(var4.south())) {
                  var11++;
               }

               if (var1.method7007(var4.down())) {
                  var11++;
               }

               if (var10 == var5.field22287 && var11 == var5.field22288) {
                  var1.setBlockState(var4, var5.field22285.getBlockState(), 2);
                  var1.method6861().method20726(var4, var5.field22285.method23472(), 0);
                  var9++;
               }

               return var9 > 0;
            }
         }
      } else {
         return false;
      }
   }
}
