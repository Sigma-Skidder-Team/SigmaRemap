package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class Class283 extends Class281 {
   private static final Logger field1078 = LogManager.getLogger();
   private static final Gson field1079 = Class8746.method31555().create();
   private Map<ResourceLocation, ILootCondition> field1080 = ImmutableMap.of();

   public Class283() {
      super(field1079, "predicates");
   }

   @Nullable
   public ILootCondition method1052(ResourceLocation var1) {
      return this.field1080.get(var1);
   }

   public void method971(Map<ResourceLocation, JsonElement> var1, Class191 var2, Class7165 var3) {
      Builder<ResourceLocation, ILootCondition> var6 = ImmutableMap.builder();
      var1.forEach((var1x, var2x) -> {
         try {
            if (var2x.isJsonArray()) {
               ILootCondition[] var5 = field1079.fromJson(var2x, ILootCondition[].class);
               var6.put(var1x, new Class125(var5));
            } else {
               ILootCondition var7x = field1079.fromJson(var2x, ILootCondition.class);
               var6.put(var1x, var7x);
            }
         } catch (Exception var6x) {
            field1078.error("Couldn't parse loot table {}", var1x, var6x);
         }
      });
      ImmutableMap<ResourceLocation, ILootCondition> var7 = var6.build();
      Class8478 var8 = new Class8478(Class8524.field38291, var7::get, var0 -> null);
      var7.forEach((var1x, var2x) -> var2x.method367(var8.method29958("{" + var1x + "}", var1x)));
      var8.method29961().forEach((var0, var1x) -> field1078.warn("Found validation problem in " + var0 + ": " + var1x));
      this.field1080 = var7;
   }

   public Set<ResourceLocation> method1053() {
      return Collections.<ResourceLocation>unmodifiableSet(this.field1080.keySet());
   }
}
