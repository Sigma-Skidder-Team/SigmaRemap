package mapped;

import net.minecraft.client.gui.screen.inventory.LecternScreen;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.IContainerListener;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class Class1121 implements IContainerListener {
   private static String[] field6152;
   public final LecternScreen field6153;

   public Class1121(LecternScreen var1) {
      this.field6153 = var1;
   }

   @Override
   public void sendAllContents(Container var1, NonNullList<ItemStack> var2) {
      LecternScreen.method2688(this.field6153);
   }

   @Override
   public void sendSlotContents(Container var1, int var2, ItemStack var3) {
      LecternScreen.method2688(this.field6153);
   }

   @Override
   public void sendWindowProperty(Container var1, int var2, int var3) {
      if (var2 == 0) {
         LecternScreen.method2689(this.field6153);
      }
   }
}
