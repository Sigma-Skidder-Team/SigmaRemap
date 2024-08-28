package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7228 implements Class7226 {
   private static final ITextComponent field31067 = new TranslationTextComponent("spectatorMenu.root.prompt");
   private final List<Class7222> field31068 = Lists.newArrayList();

   public Class7228() {
      this.field31068.add(new Class7225());
      this.field31068.add(new Class7227());
   }

   @Override
   public List<Class7222> method22701() {
      return this.field31068;
   }

   @Override
   public ITextComponent method22702() {
      return field31067;
   }
}
