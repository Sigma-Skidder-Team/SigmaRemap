package mapped;

import com.google.gson.JsonObject;
import net.minecraft.util.DamageSource;

public class Class4469 extends Class4457 {
   private final Class9404 field21657;
   private final Class9587 field21658;

   public Class4469(Class9587 var1, Class9404 var2, Class9587 var3) {
      super(Class4885.method15095(), var1);
      this.field21657 = var2;
      this.field21658 = var3;
   }

   public static Class4469 method14120(Class9024 var0) {
      return new Class4469(Class9587.field44822, var0.method33413(), Class9587.field44822);
   }

   public boolean method14121(ServerPlayerEntity var1, LootContext var2, DamageSource var3, float var4, float var5, boolean var6) {
      return this.field21657.method35779(var1, var3, var4, var5, var6) ? this.field21658.method37227(var2) : false;
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("damage", this.field21657.method35781());
      var4.add("entity", this.field21658.method37228(var1));
      return var4;
   }
}
