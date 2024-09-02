package mapped;

import net.minecraft.tileentity.CommandBlockTileEntity;

// $VF: synthetic class
public class Class8046 {
   private static String[] field34561;
   public static final int[] field34562 = new int[CommandBlockTileEntity.Mode.values().length];

   static {
      try {
         field34562[CommandBlockTileEntity.Mode.field13323.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field34562[CommandBlockTileEntity.Mode.field13324.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field34562[CommandBlockTileEntity.Mode.field13325.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
