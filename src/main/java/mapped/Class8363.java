package mapped;

import net.minecraft.world.server.ServerWorld;

import java.util.Collection;
import java.util.function.Consumer;

public class Class8363 {
   private final String field35914;
   private final Collection<Class4871> field35915;
   private final Consumer<ServerWorld> field35916;

   public Class8363(String var1, Collection<Class4871> var2, Consumer<ServerWorld> var3) {
      if (!var2.isEmpty()) {
         this.field35914 = var1;
         this.field35915 = var2;
         this.field35916 = var3;
      } else {
         throw new IllegalArgumentException("A GameTestBatch must include at least one TestFunction!");
      }
   }

   public String method29301() {
      return this.field35914;
   }

   public Collection<Class4871> method29302() {
      return this.field35915;
   }

   public void method29303(ServerWorld var1) {
      if (this.field35916 != null) {
         this.field35916.accept(var1);
      }
   }
}
