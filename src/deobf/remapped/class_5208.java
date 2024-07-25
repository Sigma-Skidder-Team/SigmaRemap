package remapped;

import java.util.Set;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5208 extends class_3840 {
   private static final ITextComponent field_26762 = new TranslationTextComponent("gui.recipebook.toggleRecipes.smeltable");

   @Override
   public ITextComponent method_36319() {
      return field_26762;
   }

   @Override
   public Set<class_2451> method_17831() {
      return class_7933.method_35878().keySet();
   }
}
