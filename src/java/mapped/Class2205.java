package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum Class2205 {
   field14417(new TranslationTextComponent("options.mainHand.left")),
   field14418(new TranslationTextComponent("options.mainHand.right"));

   private final ITextComponent field14419;
   private static final Class2205[] field14420 = new Class2205[]{field14417, field14418};

   private Class2205(ITextComponent var3) {
      this.field14419 = var3;
   }

   public Class2205 method8920() {
      return this != field14417 ? field14417 : field14418;
   }

   @Override
   public String toString() {
      return this.field14419.getString();
   }

   public ITextComponent method8921() {
      return this.field14419;
   }
}
