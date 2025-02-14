package mapped;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class Class3286 extends Item {
   private final Class2154 field18796;

   public Class3286(Class2154 var1, Properties var2) {
      super(var2);
      this.field18796 = var1;
   }

   public Class2154 method11821() {
      return this.field18796;
   }

   @Override
   public void method11730(ItemStack var1, World var2, List<ITextComponent> var3, Class2216 var4) {
      var3.add(this.method11822().mergeStyle(TextFormatting.GRAY));
   }

   public IFormattableTextComponent method11822() {
      return new TranslationTextComponent(this.getTranslationKey() + ".desc");
   }
}
