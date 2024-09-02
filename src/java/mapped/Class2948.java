package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public class Class2948 extends Class2898<Class4736> {
   public Class2948(Codec<Class4736> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4736 var5) {
      for (Class7758 var9 : var5.field22429) {
         if (var3.nextFloat() < var9.field33330) {
            return var9.method25722(var1, var2, var3, var4);
         }
      }

      return var5.field22430.get().method26521(var1, var2, var3, var4);
   }
}
