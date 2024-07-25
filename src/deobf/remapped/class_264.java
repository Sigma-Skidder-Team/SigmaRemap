package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_264 extends class_7648 {
   private static final Logger field_935 = LogManager.getLogger();
   private static final Gson field_937 = class_5746.method_26000().create();
   private Map<Identifier, class_7279> field_936 = ImmutableMap.of();

   public class_264() {
      super(field_937, "predicates");
   }

   @Nullable
   public class_7279 method_1146(Identifier var1) {
      return this.field_936.get(var1);
   }

   public void method_1147(Map<Identifier, JsonElement> var1, class_7832 var2, class_3492 var3) {
      Builder var6 = ImmutableMap.builder();
      var1.forEach((var1x, var2x) -> {
         try {
            if (var2x.isJsonArray()) {
               class_7279[] var5 = (class_7279[])field_937.fromJson(var2x, class_7279[].class);
               var6.put(var1x, new class_2801(var5, null));
            } else {
               class_7279 var7x = (class_7279)field_937.fromJson(var2x, class_7279.class);
               var6.put(var1x, var7x);
            }
         } catch (Exception var6x) {
            field_935.error("Couldn't parse loot table {}", var1x, var6x);
         }
      });
      ImmutableMap var7 = var6.build();
      class_4737 var8 = new class_4737(class_4933.field_25571, var7::get, var0 -> null);
      var7.forEach((var1x, var2x) -> var2x.method_12680(var8.method_21887("{" + var1x + "}", var1x)));
      var8.method_21883().forEach((var0, var1x) -> field_935.warn("Found validation problem in " + var0 + ": " + var1x));
      this.field_936 = var7;
   }

   public Set<Identifier> method_1145() {
      return Collections.<Identifier>unmodifiableSet(this.field_936.keySet());
   }
}
