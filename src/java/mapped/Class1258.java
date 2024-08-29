package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.Set;

public class Class1258 extends Class1255 {
   private static final ITextComponent field6657 = new TranslationTextComponent("gui.recipebook.toggleRecipes.smeltable");

   @Override
   public ITextComponent method5848() {
      return field6657;
   }

   @Override
   public Set<Item> method5866() {
      return Class924.method3640().keySet();
   }
}
