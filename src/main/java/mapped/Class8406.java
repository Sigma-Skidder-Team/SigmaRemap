package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.util.Util;

public final class Class8406 implements Class8405 {
   private static String[] field36063;

   @Override
   public void method29524(Class8262 var1) {
      Class7440.method24050(var1, Blocks.LIGHT_GRAY_STAINED_GLASS);
   }

   @Override
   public void method29525(Class8262 var1) {
      Class7440.method24050(var1, !var1.method28818() ? Blocks.ORANGE_STAINED_GLASS : Blocks.RED_STAINED_GLASS);
      Class7440.method24051(var1, Util.getMessage(var1.method28815()));
      Class7440.method24052(var1);
   }
}
