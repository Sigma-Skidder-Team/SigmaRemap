package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class Class7139 {
   public static final Codec<Class7139> field30696 = Registry.field16133.dispatch(Class7139::method22268, Class9542::method36924);

   public abstract Class9542<?> method22268();

   public abstract void method22269(Class1658 var1, Random var2, List<BlockPos> var3, List<BlockPos> var4, Set<BlockPos> var5, Class9764 var6);

   public void method22273(Class1681 var1, BlockPos var2, Class8551 var3, Set<BlockPos> var4, Class9764 var5) {
      this.method22274(var1, var2, Blocks.VINE.method11579().method23465(var3, Boolean.valueOf(true)), var4, var5);
   }

   public void method22274(Class1681 var1, BlockPos var2, BlockState var3, Set<BlockPos> var4, Class9764 var5) {
      var1.setBlockState(var2, var3, 19);
      var4.add(var2);
      var5.method38392(new Class9764(var2, var2));
   }
}
