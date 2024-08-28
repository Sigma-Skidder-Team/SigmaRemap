package mapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Class9415 {
   public static final Class9415 field43676 = new Class9415(Collections.<Class7144, Class8053>emptyMap());
   private final Map<Class7144, Class8053> field43677;

   public Class9415(Map<Class7144, Class8053> var1) {
      this.field43677 = var1;
   }

   public static Class9415 method36119() {
      return new Class9415(Maps.newLinkedHashMap());
   }

   public Class9415 method36120(Class7144 var1) {
      this.field43677.put(var1, new Class8053());
      return this;
   }

   public boolean method36121(Entity var1) {
      if (this != field43676) {
         return !(var1 instanceof Class880) ? false : this.method36123(((Class880)var1).method3032());
      } else {
         return true;
      }
   }

   public boolean method36122(Class880 var1) {
      return this != field43676 ? this.method36123(var1.method3032()) : true;
   }

   public boolean method36123(Map<Class7144, Class2023> var1) {
      if (this == field43676) {
         return true;
      } else {
         for (Entry var5 : this.field43677.entrySet()) {
            Class2023 var6 = (Class2023)var1.get(var5.getKey());
            if (!((Class8053)var5.getValue()).method27657(var6)) {
               return false;
            }
         }

         return true;
      }
   }

   public static Class9415 method36124(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = Class8963.method32781(var0, "effects");
         LinkedHashMap var4 = Maps.newLinkedHashMap();

         for (Entry var6 : var3.entrySet()) {
            ResourceLocation var7 = new ResourceLocation((String)var6.getKey());
            Class7144 var8 = Class2348.field16071.method9187(var7).orElseThrow(() -> new JsonSyntaxException("Unknown effect '" + var7 + "'"));
            Class8053 var9 = Class8053.method27659(Class8963.method32781((JsonElement)var6.getValue(), (String)var6.getKey()));
            var4.put(var8, var9);
         }

         return new Class9415(var4);
      } else {
         return field43676;
      }
   }

   public JsonElement method36125() {
      if (this == field43676) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var3 = new JsonObject();

         for (Entry var5 : this.field43677.entrySet()) {
            var3.add(Class2348.field16071.method9181((Class7144)var5.getKey()).toString(), ((Class8053)var5.getValue()).method27658());
         }

         return var3;
      }
   }
}
