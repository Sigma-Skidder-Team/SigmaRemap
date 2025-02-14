package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum Class2168 {
   field14234("enabled"),
   field14235("disabled"),
   field14236("prompt");

   private final ITextComponent field14237;
   private static final Class2168[] field14238 = new Class2168[]{field14234, field14235, field14236};

   private Class2168(String var3) {
      this.field14237 = new TranslationTextComponent("addServer.resourcePack." + var3);
   }

   public ITextComponent method8891() {
      return this.field14237;
   }
}
