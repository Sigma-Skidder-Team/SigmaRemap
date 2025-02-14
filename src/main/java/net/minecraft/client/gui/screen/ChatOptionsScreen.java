package net.minecraft.client.gui.screen;

import mapped.Class1140;
import mapped.Class7548;
import mapped.Class9046;
import net.minecraft.client.AbstractOption;
import net.minecraft.client.GameSettings;
import net.minecraft.util.text.TranslationTextComponent;

public class ChatOptionsScreen extends Class1140 {
   private static final AbstractOption[] field6206 = new AbstractOption[]{
      AbstractOption.field25339,
      AbstractOption.field25354,
      AbstractOption.field25355,
      AbstractOption.field25356,
      AbstractOption.field25318,
      AbstractOption.field25336,
      AbstractOption.field25319,
      AbstractOption.field25321,
      AbstractOption.field25322,
      AbstractOption.field25320,
      AbstractOption.field25316,
      AbstractOption.field25317,
      AbstractOption.field25444,
      AbstractOption.field25445,
      AbstractOption.field25346,
      AbstractOption.field25352,
      AbstractOption.field25353,
      AbstractOption.field25363
   };
   private Class9046 field6207 = new Class9046(this, new Class7548());

   public ChatOptionsScreen(Screen var1, GameSettings var2) {
      super(var1, var2, new TranslationTextComponent("options.chat.title"), field6206);
   }
}
