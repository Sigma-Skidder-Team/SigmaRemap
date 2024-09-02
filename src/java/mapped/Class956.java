package mapped;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;

public class Class956 extends TileEntity {
   private static String[] field5370;

   public Class956(TileEntityType<?> var1) {
      super(var1);
   }

   public Class956() {
      this(TileEntityType.field21433);
   }

   public boolean method3870(Direction var1) {
      return var1 == Direction.field673;
   }
}
