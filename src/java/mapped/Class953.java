package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.util.text.ITextComponent;

public final class Class953 implements Class949 {
   private static String[] field5353;
   private final ITextComponent field5354;
   private final Class951 field5355;

   public Class953(Class951 var1, ITextComponent var2) {
      this.field5355 = var1;
      this.field5354 = var2;
   }

   @Override
   public ITextComponent method2954() {
      return this.field5354;
   }

   @Override
   public Container method3627(int var1, PlayerInventory var2, PlayerEntity var3) {
      return this.field5355.method3627(var1, var2, var3);
   }
}
