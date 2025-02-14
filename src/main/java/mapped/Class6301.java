package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;

import java.util.Random;
import java.util.stream.Stream;

public class Class6301 extends Class6272<Class4720> {
   public Class6301(Codec<Class4720> var1) {
      super(var1);
   }

   public Stream<BlockPos> method19240(Class9010 var1, Random var2, Class4720 var3, BlockPos var4) {
      return var3.method14817().method26507(var1, var2, var4).<BlockPos>flatMap(var3x -> var3.method14818().method26507(var1, var2, var3x));
   }
}
