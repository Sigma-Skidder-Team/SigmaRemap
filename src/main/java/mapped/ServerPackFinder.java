package mapped;

import net.minecraft.resources.IPackFinder;
import net.minecraft.resources.ResourcePackInfo;
import net.minecraft.resources.VanillaPack;

import java.util.function.Consumer;

public class ServerPackFinder implements IPackFinder {
   private final VanillaPack field32836 = new VanillaPack("minecraft");

   @Override
   public void findPacks(Consumer<ResourcePackInfo> var1, Class9325 var2) {
      ResourcePackInfo var5 = ResourcePackInfo.createResourcePack("vanilla", false, () -> this.field32836, var2, ResourcePackInfo.Priority.field12830, IPackNameDecorator.field33171);
      if (var5 != null) {
         var1.accept(var5);
      }
   }
}
