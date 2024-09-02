package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public class Class2940 extends Class2898<Class4705> {
   public Class2940(Codec<Class4705> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4705 var5) {
      while (var4.getY() > 3) {
         if (!var1.method7007(var4.down())) {
            Block var8 = var1.getBlockState(var4.down()).getBlock();
            if (method11219(var8) || method11218(var8)) {
               break;
            }
         }

         var4 = var4.down();
      }

      if (var4.getY() <= 3) {
         return false;
      } else {
         for (int var15 = 0; var15 < 3; var15++) {
            int var9 = var3.nextInt(2);
            int var10 = var3.nextInt(2);
            int var11 = var3.nextInt(2);
            float var12 = (float)(var9 + var10 + var11) * 0.333F + 0.5F;

            for (BlockPos var14 : BlockPos.method8359(var4.method8336(-var9, -var10, -var11), var4.method8336(var9, var10, var11))) {
               if (var14.method8318(var4) <= (double)(var12 * var12)) {
                  var1.setBlockState(var14, var5.field22322, 4);
               }
            }

            var4 = var4.method8336(-1 + var3.nextInt(2), -var3.nextInt(2), -1 + var3.nextInt(2));
         }

         return true;
      }
   }
}
