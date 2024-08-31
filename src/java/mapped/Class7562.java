package mapped;

import net.minecraft.block.BlockState;

import java.util.function.Predicate;

@FunctionalInterface
public interface Class7562 {
   Class7562 field32488 = var0 -> var0x -> true;
   Class7562 field32489 = var0 -> var0x -> false;

   Predicate<BlockState> method24750(Class9348<Block, BlockState> var1);
}
