package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;

import java.util.Random;

public class Class2901 extends Class2899 {
   public Class2901(Codec<Class4699> var1) {
      super(var1);
   }

   @Override
   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4699 var5) {
      return var1.getFluidState(var4).method23486(FluidTags.field40469) ? super.method11213(var1, var2, var3, var4, var5) : false;
   }
}
