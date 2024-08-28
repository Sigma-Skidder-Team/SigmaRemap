package mapped;

import com.google.common.base.Joiner;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;

public abstract class Class8924 {
   public static final Class8924 field40401 = new Class8925();
   private static final Joiner field40402 = Joiner.on(", ");

   public abstract boolean method32624(Class8992<?> var1);

   public abstract JsonElement method32625();

   public static Class8924 method32626(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         String var3 = JSONUtils.method32762(var0, "type");
         if (!var3.startsWith("#")) {
            ResourceLocation var6 = new ResourceLocation(var3);
            Class8992 var5 = Registry.field16074
               .method9187(var6)
               .orElseThrow(
                  () -> new JsonSyntaxException("Unknown entity type '" + var6 + "', valid types are: " + field40402.join(Registry.field16074.method9190()))
               );
            return new Class8927(var5);
         } else {
            ResourceLocation var4 = new ResourceLocation(var3.substring(1));
            return new Class8926(Class9443.method36296().method32660().method27132(var4));
         }
      } else {
         return field40401;
      }
   }

   public static Class8924 method32627(Class8992<?> var0) {
      return new Class8927(var0);
   }

   public static Class8924 method32628(Class7608<Class8992<?>> var0) {
      return new Class8926(var0);
   }
}
