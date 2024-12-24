package mapped;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.tags.ITag;

import java.util.function.Predicate;

public class Class175 implements Predicate<ItemStack> {
   private static String[] field559;
   private final ITag<Item> field560;
   private final CompoundNBT field561;

   public Class175(ITag<Item> var1, CompoundNBT var2) {
      this.field560 = var1;
      this.field561 = var2;
   }

   public boolean test(ItemStack var1) {
      return this.field560.contains(var1.getItem()) && NBTUtil.areNBTEquals(this.field561, var1.getTag(), true);
   }
}
