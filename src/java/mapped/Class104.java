package mapped;

import net.minecraft.util.IStringSerializable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum Class104 implements IStringSerializable {
   field318("save"),
   field319("load"),
   field320("corner"),
   field321("data");

   private final String field322;
   private final ITextComponent field323;
   private static final Class104[] field324 = new Class104[]{field318, field319, field320, field321};

   private Class104(String var3) {
      this.field322 = var3;
      this.field323 = new TranslationTextComponent("structure_block.mode_info." + var3);
   }

   @Override
   public String getString() {
      return this.field322;
   }

   public ITextComponent method295() {
      return this.field323;
   }
}
