package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public interface Class7725 {
   Class7725 field33170 = method25545();
   Class7725 field33171 = method25546("pack.source.builtin");
   Class7725 field33172 = method25546("pack.source.world");
   Class7725 field33173 = method25546("pack.source.server");

   ITextComponent method25544(ITextComponent var1);

   static Class7725 method25545() {
      return var0 -> var0;
   }

   static Class7725 method25546(String var0) {
      TranslationTextComponent var3 = new TranslationTextComponent(var0);
      return var1 -> new TranslationTextComponent("pack.nameAndSource", var1, var3).mergeStyle(TextFormatting.GRAY);
   }
}
