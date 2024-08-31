package mapped;

import com.google.gson.JsonObject;
import net.minecraft.util.ResourceLocation;

public class Class4474 extends Class4457 {
   private final Class8576 field21664;

   public Class4474(ResourceLocation var1, Class9587 var2, Class8576 var3) {
      super(var1, var2);
      this.field21664 = var3;
   }

   public static Class4474 method14130(Class8576 var0) {
      return new Class4474(Class4876.method15064(CriteriaTriggers.field44480), Class9587.field44822, var0);
   }

   public static Class4474 method14131() {
      return new Class4474(Class4876.method15064(CriteriaTriggers.field44481), Class9587.field44822, Class8576.field38559);
   }

   public static Class4474 method14132() {
      return new Class4474(Class4876.method15064(CriteriaTriggers.field44498), Class9587.field44822, Class8576.field38559);
   }

   public boolean method14133(ServerWorld var1, double var2, double var4, double var6) {
      return this.field21664.method30650(var1, var2, var4, var6);
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("location", this.field21664.method30652());
      return var4;
   }
}
