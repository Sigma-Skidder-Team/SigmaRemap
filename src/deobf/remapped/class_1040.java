package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1040 extends class_7648 {
   private static final Logger field_5742 = LogManager.getLogger();
   private static final Gson field_5741 = class_5746.method_25999().create();
   private Map<Identifier, class_1758> field_5740 = ImmutableMap.of();
   private final class_264 field_5738;

   public class_1040(class_264 var1) {
      super(field_5741, "loot_tables");
      this.field_5738 = var1;
   }

   public class_1758 method_4604(Identifier var1) {
      return this.field_5740.getOrDefault(var1, class_1758.field_9032);
   }

   public void method_4607(Map<Identifier, JsonElement> var1, class_7832 var2, class_3492 var3) {
      Builder var6 = ImmutableMap.builder();
      JsonElement var7 = (JsonElement)var1.remove(class_5931.field_30157);
      if (var7 != null) {
         field_5742.warn("Datapack tried to redefine {} loot table, ignoring", class_5931.field_30157);
      }

      var1.forEach((var1x, var2x) -> {
         try {
            class_1758 var5 = (class_1758)field_5741.fromJson(var2x, class_1758.class);
            var6.put(var1x, var5);
         } catch (Exception var6x) {
            field_5742.error("Couldn't parse loot table {}", var1x, var6x);
         }
      });
      var6.put(class_5931.field_30157, class_1758.field_9032);
      ImmutableMap var8 = var6.build();
      class_4737 var9 = new class_4737(class_4933.field_25571, this.field_5738::method_1146, var8::get);
      var8.forEach((var1x, var2x) -> method_4605(var9, var1x, var2x));
      var9.method_21883().forEach((var0, var1x) -> field_5742.warn("Found validation problem in " + var0 + ": " + var1x));
      this.field_5740 = var8;
   }

   public static void method_4605(class_4737 var0, Identifier var1, class_1758 var2) {
      var2.method_7867(var0.method_21891(var2.method_7860()).method_21894("{" + var1 + "}", var1));
   }

   public static JsonElement method_4608(class_1758 var0) {
      return field_5741.toJsonTree(var0);
   }

   public Set<Identifier> method_4606() {
      return this.field_5740.keySet();
   }
}
