package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public abstract class Class2930 extends Class2898<Class4727> {
   public Class2930(Codec<Class4727> var1) {
      super(var1);
   }

   public void method11265(Class1660 var1, Random var2, BlockPos var3, Class4727 var4, int var5, BlockPos.Mutable var6) {
      for (int var9 = 0; var9 < var5; var9++) {
         var6.method8374(var3).method8380(Direction.field673, var9);
         if (!var1.getBlockState(var6).method23409(var1, var6)) {
            this.method11217(var1, var6, var4.field22396.method20424(var2, var3));
         }
      }
   }

   public int method11266(Random var1) {
      int var4 = var1.nextInt(3) + 4;
      if (var1.nextInt(12) == 0) {
         var4 *= 2;
      }

      return var4;
   }

   public boolean method11267(Class1660 var1, BlockPos var2, int var3, BlockPos.Mutable var4, Class4727 var5) {
      int var8 = var2.getY();
      if (var8 >= 1 && var8 + var3 + 1 < 256) {
         Block var9 = var1.getBlockState(var2.down()).getBlock();
         if (!method11219(var9) && !var9.isIn(BlockTags.field32814)) {
            return false;
         } else {
            for (int var10 = 0; var10 <= var3; var10++) {
               int var11 = this.method11268(-1, -1, var5.field22397, var10);

               for (int var12 = -var11; var12 <= var11; var12++) {
                  for (int var13 = -var11; var13 <= var11; var13++) {
                     BlockState var14 = var1.getBlockState(var4.method8378(var2, var12, var10, var13));
                     if (!var14.isAir() && !var14.method23446(BlockTags.field32767)) {
                        return false;
                     }
                  }
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4727 var5) {
      int var8 = this.method11266(var3);
      BlockPos.Mutable var9 = new BlockPos.Mutable();
      if (this.method11267(var1, var4, var8, var9, var5)) {
         this.method11269(var1, var3, var4, var8, var9, var5);
         this.method11265(var1, var3, var4, var5, var8, var9);
         return true;
      } else {
         return false;
      }
   }

   public abstract int method11268(int var1, int var2, int var3, int var4);

   public abstract void method11269(Class1660 var1, Random var2, BlockPos var3, int var4, BlockPos.Mutable var5, Class4727 var6);
}
