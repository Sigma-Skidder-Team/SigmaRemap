package mapped;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;

import java.util.function.Predicate;

public class Class169 implements Predicate<ItemStack> {
   private static String[] field544;
   private final Item field545;
   private final CompoundNBT field546;

   public Class169(Item var1, CompoundNBT var2) {
      this.field545 = var1;
      this.field546 = var2;
   }

   public boolean test(ItemStack var1) {
      return var1.getItem() == this.field545 && NBTUtil.areNBTEquals(this.field546, var1.getTag(), true);
   }
}
