package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.blockplacer.BlockPlacerType;

import java.util.Random;

public abstract class BlockPlacer {
   public static final Codec<BlockPlacer> field27591 = Registry.field16130.dispatch(BlockPlacer::method19062, BlockPlacerType::getCodec);

   public abstract void method19061(IWorld var1, BlockPos var2, BlockState var3, Random var4);

   public abstract BlockPlacerType<?> method19062();
}
