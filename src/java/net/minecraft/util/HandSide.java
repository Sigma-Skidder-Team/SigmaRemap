package net.minecraft.util;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum HandSide {
   LEFT(new TranslationTextComponent("options.mainHand.left")),
   RIGHT(new TranslationTextComponent("options.mainHand.right"));

   private final ITextComponent field14419;
   private static final HandSide[] field14420 = new HandSide[]{LEFT, RIGHT};

   private HandSide(ITextComponent var3) {
      this.field14419 = var3;
   }

   public HandSide opposite() {
      return this != LEFT ? LEFT : RIGHT;
   }

   @Override
   public String toString() {
      return this.field14419.getString();
   }

   public ITextComponent method8921() {
      return this.field14419;
   }
}
