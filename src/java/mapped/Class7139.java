package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.ISeedReader;

import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class Class7139 {
   public static final Codec<Class7139> field30696 = Registry.field16133.dispatch(Class7139::method22268, Class9542::method36924);

   public abstract Class9542<?> method22268();

   public abstract void method22269(ISeedReader var1, Random var2, List<BlockPos> var3, List<BlockPos> var4, Set<BlockPos> var5, MutableBoundingBox var6);

   public void method22273(Class1681 var1, BlockPos var2, BooleanProperty var3, Set<BlockPos> var4, MutableBoundingBox var5) {
      this.method22274(var1, var2, Blocks.VINE.getDefaultState().with(var3, Boolean.valueOf(true)), var4, var5);
   }

   public void method22274(Class1681 var1, BlockPos var2, BlockState var3, Set<BlockPos> var4, MutableBoundingBox var5) {
      var1.setBlockState(var2, var3, 19);
      var4.add(var2);
      var5.method38392(new MutableBoundingBox(var2, var2));
   }
}
