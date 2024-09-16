package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public class Class2913 extends Class2898<Class4712> {
   public Class2913(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4712 var5) {
      float var8 = (float)(var3.nextInt(3) + 4);

      for (int var9 = 0; var8 > 0.5F; var9--) {
         for (int var10 = MathHelper.method37767(-var8); var10 <= MathHelper.ceil(var8); var10++) {
            for (int var11 = MathHelper.method37767(-var8); var11 <= MathHelper.ceil(var8); var11++) {
               if ((float)(var10 * var10 + var11 * var11) <= (var8 + 1.0F) * (var8 + 1.0F)) {
                  this.method11217(var1, var4.method8336(var10, var9, var11), Blocks.field36651.method11579());
               }
            }
         }

         var8 = (float)((double)var8 - ((double)var3.nextInt(2) + 0.5));
      }

      return true;
   }
}
