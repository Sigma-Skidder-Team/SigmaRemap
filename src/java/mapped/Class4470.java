package mapped;

import com.google.gson.JsonObject;
import net.minecraft.potion.Potion;
import net.minecraft.util.registry.Registry;

public class Class4470 extends Class4457 {
   private final Potion field21659;

   public Class4470(Class9587 var1, Potion var2) {
      super(Class4879.method15074(), var1);
      this.field21659 = var2;
   }

   public static Class4470 method14122() {
      return new Class4470(Class9587.field44822, (Potion)null);
   }

   public boolean method14123(Potion var1) {
      return this.field21659 == null || this.field21659 == var1;
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      if (this.field21659 != null) {
         var4.addProperty("potion", Registry.POTION.getKey(this.field21659).toString());
      }

      return var4;
   }
}
