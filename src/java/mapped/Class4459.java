package mapped;

import com.google.gson.JsonObject;
import net.minecraft.entity.player.ServerPlayerEntity;

public class Class4459 extends Class4457 {
   private final Class9415 field21638;

   public Class4459(Class9587 var1, Class9415 var2) {
      super(Class4882.method15085(), var1);
      this.field21638 = var2;
   }

   public static Class4459 method14097(Class9415 var0) {
      return new Class4459(Class9587.field44822, var0);
   }

   public boolean method14098(ServerPlayerEntity var1) {
      return this.field21638.method36122(var1);
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("effects", this.field21638.method36125());
      return var4;
   }
}
