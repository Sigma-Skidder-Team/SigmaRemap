package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public abstract class Class6698 {
   public static final Codec<Class6698> field29330 = Registry.field16129.dispatch(Class6698::method20423, Class9654::method37704);

   public abstract Class9654<?> method20423();

   public abstract BlockState method20424(Random var1, BlockPos var2);
}
