package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

import javax.annotation.Nullable;

public class Class7096 extends Class7092 {
   private static String[] field30530;
   public static final Codec<Class7096> field30531 = Codec.unit(() -> Class7096.field30532);
   public static final Class7096 field30532 = new Class7096();

   @Nullable
   @Override
   public Class8266 method22068(IWorldReader var1, BlockPos var2, BlockPos var3, Class8266 var4, Class8266 var5, Class9463 var6) {
      BlockPos var9 = var5.field35530;
      boolean var10 = var1.getBlockState(var9).isIn(Blocks.LAVA);
      return var10 && !Block.method11550(var5.field35531.method23412(var1, var9))
         ? new Class8266(var9, Blocks.LAVA.method11579(), var5.field35532)
         : var5;
   }

   @Override
   public Class7525<?> method22069() {
      return Class7525.field32302;
   }
}
