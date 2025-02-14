package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;

public class Class4705 implements Class4698 {
   public static final Codec<Class4705> field22321 = BlockState.field31585.fieldOf("state").xmap(Class4705::new, var0 -> var0.field22322).codec();
   public final BlockState field22322;

   public Class4705(BlockState var1) {
      this.field22322 = var1;
   }
}
