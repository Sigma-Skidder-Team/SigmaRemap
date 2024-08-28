package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Locale;

public class Class4965 extends Class4928<Class141> {
   public void method15246(JsonObject var1, Class141 var2, JsonSerializationContext var3) {
      super.method15246(var1, var2, var3);
      if (!Class141.method424(var2).equals(Class141.field472)) {
         var1.add("destination", var3.serialize(Class141.method424(var2).method11373()));
      }

      if (Class141.method425(var2) != Class141.field473) {
         var1.add("decoration", var3.serialize(Class141.method425(var2).toString().toLowerCase(Locale.ROOT)));
      }

      if (Class141.method426(var2) != 2) {
         var1.addProperty("zoom", Class141.method426(var2));
      }

      if (Class141.method427(var2) != 50) {
         var1.addProperty("search_radius", Class141.method427(var2));
      }

      if (!Class141.method428(var2)) {
         var1.addProperty("skip_existing_chunks", Class141.method428(var2));
      }
   }

   public Class141 method15244(JsonObject var1, JsonDeserializationContext var2, Class122[] var3) {
      Class2961 var6 = method15256(var1);
      String var7 = var1.has("decoration") ? Class8963.method32763(var1, "decoration") : "mansion";
      Class2223 var8 = Class141.field473;

      try {
         var8 = Class2223.valueOf(var7.toUpperCase(Locale.ROOT));
      } catch (IllegalArgumentException var12) {
         Class141.method429().error("Error while parsing loot table decoration entry. Found {}. Defaulting to " + Class141.field473, var7);
      }

      byte var9 = Class8963.method32780(var1, "zoom", (byte)2);
      int var10 = Class8963.method32778(var1, "search_radius", 50);
      boolean var11 = Class8963.method32769(var1, "skip_existing_chunks", true);
      return new Class141(var3, var6, var8, var9, var10, var11);
   }

   private static Class2961<?> method15256(JsonObject var0) {
      if (var0.has("destination")) {
         String var3 = Class8963.method32763(var0, "destination");
         Class2961 var4 = (Class2961)Class2961.field18055.get(var3.toLowerCase(Locale.ROOT));
         if (var4 != null) {
            return var4;
         }
      }

      return Class141.field472;
   }
}
