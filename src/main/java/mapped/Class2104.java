package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public enum Class2104 {
   field13714,
   field13715(new TranslationTextComponent("block.minecraft.bed.no_sleep")),
   field13716(new TranslationTextComponent("block.minecraft.bed.too_far_away")),
   field13717(new TranslationTextComponent("block.minecraft.bed.obstructed")),
   field13718,
   field13719(new TranslationTextComponent("block.minecraft.bed.not_safe"));

   private final ITextComponent field13720;
   private static final Class2104[] field13721 = new Class2104[]{field13714, field13715, field13716, field13717, field13718, field13719};

   private Class2104() {
      this.field13720 = null;
   }

   private Class2104(ITextComponent var3) {
      this.field13720 = var3;
   }

   @Nullable
   public ITextComponent method8769() {
      return this.field13720;
   }
}
