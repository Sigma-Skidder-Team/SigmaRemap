package net.minecraft.block;

import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class WoodButtonBlock extends AbstractButtonBlock {
   public WoodButtonBlock(Properties var1) {
      super(true, var1);
   }

   @Override
   public SoundEvent getSoundEvent(boolean isOn) {
      return isOn ? SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON : SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF;
   }
}
