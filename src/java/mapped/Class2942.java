package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class2942 extends Class2898<Class4702> {
   public Class2942(Codec<Class4702> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4702 var5) {
      boolean var8 = var3.nextBoolean();
      return !var8 ? var5.field22304.get().method26521(var1, var2, var3, var4) : var5.field22303.get().method26521(var1, var2, var3, var4);
   }
}
