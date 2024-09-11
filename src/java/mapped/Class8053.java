package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.potion.EffectInstance;

public class Class8053 {
   private final Class8840 field34583;
   private final Class8840 field34584;
   private final Boolean field34585;
   private final Boolean field34586;

   public Class8053(Class8840 var1, Class8840 var2, Boolean var3, Boolean var4) {
      this.field34583 = var1;
      this.field34584 = var2;
      this.field34585 = var3;
      this.field34586 = var4;
   }

   public Class8053() {
      this(Class8840.field39936, Class8840.field39936, (Boolean)null, (Boolean)null);
   }

   public boolean method27657(EffectInstance var1) {
      if (var1 != null) {
         if (!this.field34583.method32015(var1.method8629())) {
            return false;
         } else if (this.field34584.method32015(var1.method8628())) {
            return this.field34585 != null && this.field34585 != var1.isAmbient() ? false : this.field34586 == null || this.field34586 == var1.method8631();
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public JsonElement method27658() {
      JsonObject var3 = new JsonObject();
      var3.add("amplifier", this.field34583.method32005());
      var3.add("duration", this.field34584.method32005());
      var3.addProperty("ambient", this.field34585);
      var3.addProperty("visible", this.field34586);
      return var3;
   }

   public static Class8053 method27659(JsonObject var0) {
      Class8840 var3 = Class8840.method32016(var0.get("amplifier"));
      Class8840 var4 = Class8840.method32016(var0.get("duration"));
      Boolean var5 = !var0.has("ambient") ? null : JSONUtils.method32768(var0, "ambient");
      Boolean var6 = !var0.has("visible") ? null : JSONUtils.method32768(var0, "visible");
      return new Class8053(var3, var4, var5, var6);
   }
}
