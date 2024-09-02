package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;

public class Class877 implements Class876 {
   private static String[] field4852;
   private final Minecraft field4853;

   public Class877(Minecraft var1) {
      this.field4853 = var1;
   }

   @Override
   public void method2718(Class5812 var1, NonNullList<ItemStack> var2) {
   }

   @Override
   public void method2720(Class5812 var1, int var2, ItemStack var3) {
      this.field4853.playerController.sendSlotPacket(var3, var2);
   }

   @Override
   public void method2719(Class5812 var1, int var2, int var3) {
   }
}
