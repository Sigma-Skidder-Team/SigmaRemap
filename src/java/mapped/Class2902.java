package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;

import java.util.Random;

public class Class2902 extends Class2898<Class4701> {
   public Class2902(Codec<Class4701> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4701 var5) {
      for (BlockPos var9 : BlockPos.method8359(var4.add(-1, -2, -1), var4.add(1, 2, 1))) {
         boolean var10 = var9.getX() == var4.getX();
         boolean var11 = var9.getY() == var4.getY();
         boolean var12 = var9.getZ() == var4.getZ();
         boolean var13 = Math.abs(var9.getY() - var4.getY()) == 2;
         if (var10 && var11 && var12) {
            BlockPos var14 = var9.toImmutable();
            this.method11217(var1, var14, Blocks.END_GATEWAY.getDefaultState());
            var5.method14747().ifPresent(var3x -> {
               TileEntity var6 = var1.getTileEntity(var14);
               if (var6 instanceof Class957) {
                  Class957 var7 = (Class957)var6;
                  var7.method3885(var3x, var5.method14748());
                  var6.markDirty();
               }
            });
         } else if (!var11) {
            if (var13 && var10 && var12) {
               this.method11217(var1, var9, Blocks.BEDROCK.getDefaultState());
            } else if ((var10 || var12) && !var13) {
               this.method11217(var1, var9, Blocks.BEDROCK.getDefaultState());
            } else {
               this.method11217(var1, var9, Blocks.AIR.getDefaultState());
            }
         } else {
            this.method11217(var1, var9, Blocks.AIR.getDefaultState());
         }
      }

      return true;
   }
}
