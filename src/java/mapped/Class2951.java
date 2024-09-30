package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.properties.BambooLeaves;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public class Class2951 extends Class2898<Class4728> {
   private static final BlockState field18027 = Blocks.field37009
      .getDefaultState()
      .with(Class3418.field19125, Integer.valueOf(1))
      .with(Class3418.field19126, BambooLeaves.field642)
      .with(Class3418.field19127, Integer.valueOf(0));
   private static final BlockState field18028 = field18027.with(Class3418.field19126, BambooLeaves.field644)
      .with(Class3418.field19127, Integer.valueOf(1));
   private static final BlockState field18029 = field18027.with(Class3418.field19126, BambooLeaves.field644);
   private static final BlockState field18030 = field18027.with(Class3418.field19126, BambooLeaves.field643);

   public Class2951(Codec<Class4728> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4728 var5) {
      int var8 = 0;
      BlockPos.Mutable var9 = var4.method8354();
      BlockPos.Mutable var10 = var4.method8354();
      if (var1.method7007(var9)) {
         if (Blocks.field37009.getDefaultState().isValidPosition(var1, var9)) {
            int var11 = var3.nextInt(12) + 5;
            if (var3.nextFloat() < var5.field22399) {
               int var12 = var3.nextInt(4) + 1;

               for (int var13 = var4.getX() - var12; var13 <= var4.getX() + var12; var13++) {
                  for (int var14 = var4.getZ() - var12; var14 <= var4.getZ() + var12; var14++) {
                     int var15 = var13 - var4.getX();
                     int var16 = var14 - var4.getZ();
                     if (var15 * var15 + var16 * var16 <= var12 * var12) {
                        var10.setPos(var13, var1.method6736(Heightmap.Type.WORLD_SURFACE, var13, var14) - 1, var14);
                        if (method11219(var1.getBlockState(var10).getBlock())) {
                           var1.setBlockState(var10, Blocks.PODZOL.getDefaultState(), 2);
                        }
                     }
                  }
               }
            }

            for (int var17 = 0; var17 < var11 && var1.method7007(var9); var17++) {
               var1.setBlockState(var9, field18027, 2);
               var9.method8380(Direction.UP, 1);
            }

            if (var9.getY() - var4.getY() >= 3) {
               var1.setBlockState(var9, field18028, 2);
               var1.setBlockState(var9.method8380(Direction.DOWN, 1), field18029, 2);
               var1.setBlockState(var9.method8380(Direction.DOWN, 1), field18030, 2);
            }
         }

         var8++;
      }

      return var8 > 0;
   }
}
