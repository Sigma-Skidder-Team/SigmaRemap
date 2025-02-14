package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public interface IPackNameDecorator {
   IPackNameDecorator PLAIN = method25545();
   IPackNameDecorator field33171 = method25546("pack.source.builtin");
   IPackNameDecorator WORLD = method25546("pack.source.world");
   IPackNameDecorator field33173 = method25546("pack.source.server");

   ITextComponent method25544(ITextComponent var1);

   static IPackNameDecorator method25545() {
      return var0 -> var0;
   }

   static IPackNameDecorator method25546(String var0) {
      TranslationTextComponent var3 = new TranslationTextComponent(var0);
      return var1 -> new TranslationTextComponent("pack.nameAndSource", var1, var3).mergeStyle(TextFormatting.GRAY);
   }
}
