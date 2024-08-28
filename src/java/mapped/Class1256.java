package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.Set;

public class Class1256 extends Class1255 {
   private static final ITextComponent field6655 = new TranslationTextComponent("gui.recipebook.toggleRecipes.blastable");

   @Override
   public ITextComponent method5848() {
      return field6655;
   }

   @Override
   public Set<Class3257> method5866() {
      return Class924.method3640().keySet();
   }
}
