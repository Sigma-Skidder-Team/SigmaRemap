package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4645 implements class_4439 {
   private static final ITextComponent field_22673 = new TranslationTextComponent("spectatorMenu.root.prompt");
   private final List<class_7912> field_22674 = Lists.newArrayList();

   public class_4645() {
      this.field_22674.add(new class_7817());
      this.field_22674.add(new class_9586());
   }

   @Override
   public List<class_7912> method_20603() {
      return this.field_22674;
   }

   @Override
   public ITextComponent method_20602() {
      return field_22673;
   }
}
