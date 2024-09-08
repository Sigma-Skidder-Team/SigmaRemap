package mapped;

import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class Class3203 extends Class3202 {
   private static String[] field18499;

   public Class3203(AbstractBlock var1) {
      super(false, var1);
   }

   @Override
   public SoundEvent method11521(boolean var1) {
      return !var1 ? SoundEvents.STONE_BUTTON_CLICK_OFF : SoundEvents.STONE_BUTTON_CLICK_ON;
   }
}
