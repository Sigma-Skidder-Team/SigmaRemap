package remapped;

import java.util.Set;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7045 extends class_3840 {
   private static final ITextComponent field_36384 = new TranslationTextComponent("gui.recipebook.toggleRecipes.smokable");

   @Override
   public ITextComponent method_36319() {
      return field_36384;
   }

   @Override
   public Set<class_2451> method_17831() {
      return class_7933.method_35878().keySet();
   }
}
