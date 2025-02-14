package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;

import java.util.Random;
import java.util.stream.Stream;

public abstract class Class6273<DC extends Class4716> extends Class6272<DC> {
   public Class6273(Codec<DC> var1) {
      super(var1);
   }

   @Override
   public final Stream<BlockPos> method19240(Class9010 var1, Random var2, DC var3, BlockPos var4) {
      return this.method19247(var2, (DC)var3, var4);
   }

   public abstract Stream<BlockPos> method19247(Random var1, DC var2, BlockPos var3);
}
