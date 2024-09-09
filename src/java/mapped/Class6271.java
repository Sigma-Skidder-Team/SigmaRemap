package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;

import java.util.BitSet;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Class6271 extends Class6272<Class4724> {
   public Class6271(Codec<Class4724> var1) {
      super(var1);
   }

   public Stream<BlockPos> method19240(Class9010 var1, Random var2, Class4724 var3, BlockPos var4) {
      ChunkPos var7 = new ChunkPos(var4);
      BitSet var8 = var1.method33299(var7, var3.field22386);
      return IntStream.range(0, var8.length()).filter(var3x -> var8.get(var3x) && var2.nextFloat() < var3.field22387).<BlockPos>mapToObj(var1x -> {
         int var4x = var1x & 15;
         int var5 = var1x >> 4 & 15;
         int var6 = var1x >> 8;
         return new BlockPos(var7.method24356() + var4x, var6, var7.method24357() + var5);
      });
   }
}
