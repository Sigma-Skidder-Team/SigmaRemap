package mapped;

import com.google.gson.JsonObject;
import net.minecraft.util.math.vector.Vector3d;

public class Class4463 extends Class4457 {
   private final Class8884 field21645;
   private final Class8840 field21646;

   public Class4463(Class9587 var1, Class8884 var2, Class8840 var3) {
      super(Class4893.method15120(), var1);
      this.field21645 = var2;
      this.field21646 = var3;
   }

   public static Class4463 method14108(Class8884 var0) {
      return new Class4463(Class9587.field44822, var0, Class8840.field39936);
   }

   public boolean method14109(ServerPlayerEntity var1, Vector3d var2, int var3) {
      return this.field21645.method32328(var2.x, var2.y, var2.z, var1.getPosX(), var1.getPosY(), var1.getPosZ())
         ? this.field21646.method32015(var3)
         : false;
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("distance", this.field21645.method32330());
      var4.add("duration", this.field21646.method32005());
      return var4;
   }
}
