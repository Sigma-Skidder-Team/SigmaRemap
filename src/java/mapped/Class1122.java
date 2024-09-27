package mapped;

import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.IContainerListener;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class Class1122 implements IContainerListener {
   private static String[] field6154;
   public final Class5821 field6155;
   public final Class872 field6156;

   public Class1122(Class872 var1, Class5821 var2) {
      this.field6156 = var1;
      this.field6155 = var2;
   }

   @Override
   public void sendAllContents(Container var1, NonNullList<ItemStack> var2) {
   }

   @Override
   public void sendSlotContents(Container var1, int var2, ItemStack var3) {
   }

   @Override
   public void sendWindowProperty(Container var1, int var2, int var3) {
      Class872.method2701(this.field6156, this.field6155.method18179());
      Class872.method2702(this.field6156, this.field6155.method18180());
      Class872.method2703(this.field6156, true);
   }
}
