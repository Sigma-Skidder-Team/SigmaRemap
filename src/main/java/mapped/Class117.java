package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;

public final class Class117 extends Class116 {
   public Class117(Material var1) {
      super(var1, null);
   }

   @Override
   public boolean test(BlockState var1) {
      return var1 != null && var1.isAir();
   }
}
