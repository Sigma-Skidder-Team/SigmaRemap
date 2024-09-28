package mapped;

import net.minecraft.block.AbstractButtonBlock;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class StoneButtonBlock extends AbstractButtonBlock {
   public StoneButtonBlock(Properties var1) {
      super(false, var1);
   }

   @Override
   public SoundEvent getSoundEvent(boolean var1) {
      return !var1 ? SoundEvents.STONE_BUTTON_CLICK_OFF : SoundEvents.STONE_BUTTON_CLICK_ON;
   }
}
