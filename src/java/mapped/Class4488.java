package mapped;

import com.google.gson.JsonObject;
import net.minecraft.world.World;

public class Class4488 extends Class4457 {
   private final RegistryKey<World> field21689;
   private final RegistryKey<World> field21690;

   public Class4488(Class9587 var1, RegistryKey<World> var2, RegistryKey<World> var3) {
      super(Class4901.method15148(), var1);
      this.field21689 = var2;
      this.field21690 = var3;
   }

   public static Class4488 method14156(RegistryKey<World> var0) {
      return new Class4488(Class9587.field44822, (RegistryKey<World>)null, var0);
   }

   public boolean method14157(RegistryKey<World> var1, RegistryKey<World> var2) {
      return this.field21689 != null && this.field21689 != var1 ? false : this.field21690 == null || this.field21690 == var2;
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      if (this.field21689 != null) {
         var4.addProperty("from", this.field21689.getLocation().toString());
      }

      if (this.field21690 != null) {
         var4.addProperty("to", this.field21690.getLocation().toString());
      }

      return var4;
   }
}
