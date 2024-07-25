package remapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_1402 {
   public static final ITextComponent field_7634 = new TranslationTextComponent("options.on");
   public static final ITextComponent field_7629 = new TranslationTextComponent("options.off");
   public static final ITextComponent field_7625 = new TranslationTextComponent("gui.done");
   public static final ITextComponent field_7633 = new TranslationTextComponent("gui.cancel");
   public static final ITextComponent field_7626 = new TranslationTextComponent("gui.yes");
   public static final ITextComponent field_7628 = new TranslationTextComponent("gui.no");
   public static final ITextComponent field_7631 = new TranslationTextComponent("gui.proceed");
   public static final ITextComponent field_7632 = new TranslationTextComponent("gui.back");
   public static final ITextComponent field_7627 = new TranslationTextComponent("connect.failed");

   public static ITextComponent method_6479(boolean var0) {
      return !var0 ? field_7629 : field_7634;
   }

   public static IFormattableTextComponent method_6480(ITextComponent var0, boolean var1) {
      return new TranslationTextComponent(!var1 ? "options.off.composed" : "options.on.composed", var0);
   }
}
