package mapped;

import com.google.gson.JsonObject;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;

public class Class4485 extends Class4457 {
   private final ResourceLocation field21681;

   public Class4485(Class9587 var1, ResourceLocation var2) {
      super(Class4897.method15133(), var1);
      this.field21681 = var2;
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.addProperty("recipe", this.field21681.toString());
      return var4;
   }

   public boolean method14151(IRecipe<?> var1) {
      return this.field21681.equals(var1.getId());
   }
}
