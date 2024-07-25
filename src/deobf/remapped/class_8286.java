package remapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class class_8286 {
   public static final class_8286 field_42476 = new class_8286(Collections.<class_1425, class_3479>emptyMap());
   private final Map<class_1425, class_3479> field_42475;

   public class_8286(Map<class_1425, class_3479> var1) {
      this.field_42475 = var1;
   }

   public static class_8286 method_38242() {
      return new class_8286(Maps.newLinkedHashMap());
   }

   public class_8286 method_38238(class_1425 var1) {
      this.field_42475.put(var1, new class_3479());
      return this;
   }

   public boolean method_38241(class_8145 var1) {
      if (this != field_42476) {
         return !(var1 instanceof class_5834) ? false : this.method_38239(((class_5834)var1).method_26491());
      } else {
         return true;
      }
   }

   public boolean method_38240(class_5834 var1) {
      return this != field_42476 ? this.method_38239(var1.method_26491()) : true;
   }

   public boolean method_38239(Map<class_1425, class_2250> var1) {
      if (this == field_42476) {
         return true;
      } else {
         for (Entry var5 : this.field_42475.entrySet()) {
            class_2250 var6 = (class_2250)var1.get(var5.getKey());
            if (!((class_3479)var5.getValue()).method_15972(var6)) {
               return false;
            }
         }

         return true;
      }
   }

   public static class_8286 method_38243(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = class_6539.method_29782(var0, "effects");
         LinkedHashMap var4 = Maps.newLinkedHashMap();

         for (Entry var6 : var3.entrySet()) {
            Identifier var7 = new Identifier((String)var6.getKey());
            class_1425 var8 = class_8669.field_44436.method_39794(var7).orElseThrow(() -> new JsonSyntaxException("Unknown effect '" + var7 + "'"));
            class_3479 var9 = class_3479.method_15974(class_6539.method_29782((JsonElement)var6.getValue(), (String)var6.getKey()));
            var4.put(var8, var9);
         }

         return new class_8286(var4);
      } else {
         return field_42476;
      }
   }

   public JsonElement method_38236() {
      if (this == field_42476) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var3 = new JsonObject();

         for (Entry var5 : this.field_42475.entrySet()) {
            var3.add(class_8669.field_44436.method_39797((class_1425)var5.getKey()).toString(), ((class_3479)var5.getValue()).method_15973());
         }

         return var3;
      }
   }
}
