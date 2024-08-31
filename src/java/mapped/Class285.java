package mapped;

import com.google.common.collect.Maps;
import com.google.gson.*;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Class285 extends Class281 {
   private static final Logger field1084 = LogManager.getLogger();
   private static final Gson field1085 = new GsonBuilder().create();
   private Class8220 field1086 = new Class8220();
   private final Class283 field1087;

   public Class285(Class283 var1) {
      super(field1085, "advancements");
      this.field1087 = var1;
   }

   public void method971(Map<ResourceLocation, JsonElement> var1, IResourceManager var2, IProfiler var3) {
      HashMap var6 = Maps.newHashMap();
      var1.forEach((var2x, var3x) -> {
         try {
            JsonObject var6x = JSONUtils.method32781(var3x, "advancement");
            Class7999 var7x = Class7999.method27320(var6x, new Class9366(var2x, this.field1087));
            var6.put(var2x, var7x);
         } catch (JsonParseException | IllegalArgumentException var8) {
            field1084.error("Parsing error loading custom advancement {}: {}", var2x, var8.getMessage());
         }
      });
      Class8220 var7 = new Class8220();
      var7.method28595(var6);

      for (Class7952 var9 : var7.method28597()) {
         if (var9.method27027() != null) {
            Class8874.method32293(var9);
         }
      }

      this.field1086 = var7;
   }

   @Nullable
   public Class7952 method1065(ResourceLocation var1) {
      return this.field1086.method28599(var1);
   }

   public Collection<Class7952> method1066() {
      return this.field1086.method28598();
   }
}
