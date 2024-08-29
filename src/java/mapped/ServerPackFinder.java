package mapped;

import java.util.function.Consumer;

public class ServerPackFinder implements Class7651 {
   private final Class306 field32836 = new Class306("minecraft");

   @Override
   public void method25140(Consumer<ResourcePackInfo> var1, Class9325 var2) {
      ResourcePackInfo var5 = ResourcePackInfo.method7945("vanilla", false, () -> this.field32836, var2, ResourcePackInfo.Priority.field12830, IPackNameDecorator.field33171);
      if (var5 != null) {
         var1.accept(var5);
      }
   }
}
