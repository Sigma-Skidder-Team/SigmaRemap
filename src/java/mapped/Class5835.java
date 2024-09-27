package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.Container;

public final class Class5835 extends Container {
   private static String[] field25559;

   public Class5835(ContainerType var1, int var2) {
      super(var1, var2);
   }

   @Override
   public boolean canInteractWith(PlayerEntity var1) {
      return false;
   }
}
