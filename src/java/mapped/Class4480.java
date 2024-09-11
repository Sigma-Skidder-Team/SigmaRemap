package mapped;

import com.google.gson.JsonObject;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.DamageSource;

public class Class4480 extends Class4457 {
   private final Class9404 field21672;

   public Class4480(Class9587 var1, Class9404 var2) {
      super(Class4909.method15167(), var1);
      this.field21672 = var2;
   }

   public static Class4480 method14141(Class9024 var0) {
      return new Class4480(Class9587.field44822, var0.method33413());
   }

   public boolean method14142(ServerPlayerEntity var1, DamageSource var2, float var3, float var4, boolean var5) {
      return this.field21672.method35779(var1, var2, var3, var4, var5);
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("damage", this.field21672.method35781());
      return var4;
   }
}
