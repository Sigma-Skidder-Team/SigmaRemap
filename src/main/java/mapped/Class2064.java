package mapped;

import net.minecraft.util.SharedConstants;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public enum Class2064 {
   field13454("old"),
   field13455("new"),
   field13456("compatible");

   private final ITextComponent field13457;
   private final ITextComponent field13458;
   private static final Class2064[] field13459 = new Class2064[]{field13454, field13455, field13456};

   private Class2064(String var3) {
      this.field13457 = new TranslationTextComponent("pack.incompatible." + var3).mergeStyle(TextFormatting.GRAY);
      this.field13458 = new TranslationTextComponent("pack.incompatible.confirm." + var3);
   }

   public boolean isCompatible() {
      return this == field13456;
   }

   public static Class2064 method8721(int var0) {
      if (var0 >= SharedConstants.getVersion().getPackVersion()) {
         return var0 <= SharedConstants.getVersion().getPackVersion() ? field13456 : field13455;
      } else {
         return field13454;
      }
   }

   public ITextComponent method8722() {
      return this.field13457;
   }

   public ITextComponent method8723() {
      return this.field13458;
   }
}
