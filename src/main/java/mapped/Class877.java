package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.IContainerListener;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class Class877 implements IContainerListener {
   private static String[] field4852;
   private final Minecraft field4853;

   public Class877(Minecraft var1) {
      this.field4853 = var1;
   }

   @Override
   public void sendAllContents(Container var1, NonNullList<ItemStack> var2) {
   }

   @Override
   public void sendSlotContents(Container var1, int var2, ItemStack var3) {
      this.field4853.playerController.sendSlotPacket(var3, var2);
   }

   @Override
   public void sendWindowProperty(Container var1, int var2, int var3) {
   }
}
