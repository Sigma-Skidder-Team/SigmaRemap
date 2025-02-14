package mapped;

import java.util.List;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraft.util.NonNullList;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class Class3309 extends ArrowItem {
   public Class3309(Properties var1) {
      super(var1);
   }

   @Override
   public ItemStack method11742() {
      return PotionUtils.addPotionToItemStack(super.method11742(), Potions.POISON);
   }

   @Override
   public void fillItemGroup(ItemGroup var1, NonNullList<ItemStack> var2) {
      if (this.method11738(var1)) {
         for (Potion var6 : Registry.POTION) {
            if (!var6.getEffects().isEmpty()) {
               var2.add(PotionUtils.addPotionToItemStack(new ItemStack(this), var6));
            }
         }
      }
   }

   @Override
   public void method11730(ItemStack var1, World var2, List<ITextComponent> var3, Class2216 var4) {
      PotionUtils.method38189(var1, var3, 0.125F);
   }

   @Override
   public String method11720(ItemStack var1) {
      return PotionUtils.getPotionFromItem(var1).method31815(this.getTranslationKey() + ".effect.");
   }
}
