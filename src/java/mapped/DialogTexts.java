package mapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class DialogTexts {
   public static final ITextComponent field30656 = new TranslationTextComponent("options.on");
   public static final ITextComponent field30657 = new TranslationTextComponent("options.off");
   public static final ITextComponent field30658 = new TranslationTextComponent("gui.done");
   public static final ITextComponent GUI_CANCEL = new TranslationTextComponent("gui.cancel");
   public static final ITextComponent field30660 = new TranslationTextComponent("gui.yes");
   public static final ITextComponent field30661 = new TranslationTextComponent("gui.no");
   public static final ITextComponent GUI_PROCEED = new TranslationTextComponent("gui.proceed");
   public static final ITextComponent field30663 = new TranslationTextComponent("gui.back");
   public static final ITextComponent field30664 = new TranslationTextComponent("connect.failed");

   public static ITextComponent method22237(boolean var0) {
      return !var0 ? field30657 : field30656;
   }

   public static IFormattableTextComponent method22238(ITextComponent var0, boolean var1) {
      return new TranslationTextComponent(!var1 ? "options.off.composed" : "options.on.composed", var0);
   }
}
