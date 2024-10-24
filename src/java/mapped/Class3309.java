package mapped;

import java.util.List;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraft.util.NonNullList;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class Class3309 extends Class3308 {
   public Class3309(Properties var1) {
      super(var1);
   }

   @Override
   public ItemStack getDefaultInstance() {
      return PotionUtils.addPotionToItemStack(super.getDefaultInstance(), Potions.field35005);
   }

   @Override
   public void fillItemGroup(ItemGroup var1, NonNullList<ItemStack> var2) {
      if (this.method11738(var1)) {
         for (Class8812 var6 : Registry.field16076) {
            if (!var6.method31816().isEmpty()) {
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
      return PotionUtils.method38185(var1).method31815(this.getTranslationKey() + ".effect.");
   }
}
