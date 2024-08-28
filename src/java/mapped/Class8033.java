package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class Class8033 {
   public static final Codec<Class8033> field34519 = Registry.field16083.dispatch("predicate_type", Class8033::method27554, Class8989::method33193);

   public abstract boolean method27553(BlockPos var1, BlockPos var2, BlockPos var3, Random var4);

   public abstract Class8989<?> method27554();
}
