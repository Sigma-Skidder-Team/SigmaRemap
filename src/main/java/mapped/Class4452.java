package mapped;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.io.IOException;
import java.nio.file.Path;

public class Class4452 implements Class4442 {
   private static final Gson field21630 = new GsonBuilder().setPrettyPrinting().create();
   private final Class9068 field21631;

   public Class4452(Class9068 var1) {
      this.field21631 = var1;
   }

   @Override
   public void method14013(Class8297 var1) throws IOException {
      JsonObject var4 = new JsonObject();
      Registry.field16035.keySet().forEach(var1x -> var4.add(var1x.toString(), method14087((Registry<?>) Registry.field16035.getOrDefault(var1x))));
      Path var5 = this.field21631.method33776().resolve("reports/registries.json");
      Class4442.method14020(field21630, var1, var4, var5);
   }

   private static <T> JsonElement method14087(Registry<T> var0) {
      JsonObject var3 = new JsonObject();
      if (var0 instanceof Class2351) {
         ResourceLocation var4 = ((Class2351)var0).method9267();
         var3.addProperty("default", var4.toString());
      }

      int var11 = ((Registry) Registry.field16035).getId(var0);
      var3.addProperty("protocol_id", var11);
      JsonObject var5 = new JsonObject();

      for (ResourceLocation var7 : var0.keySet()) {
         T var8 = var0.getOrDefault(var7);
         int var9 = var0.getId(var8);
         JsonObject var10 = new JsonObject();
         var10.addProperty("protocol_id", var9);
         var5.add(var7.toString(), var10);
      }

      var3.add("entries", var5);
      return var3;
   }

   @Override
   public String method14012() {
      return "Registry Dump";
   }
}
