package remapped;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5441 implements class_5998 {
   private static final Logger field_27710 = LogManager.getLogger();
   private static final Gson field_27708 = new GsonBuilder().setPrettyPrinting().create();
   private final class_6901 field_27707;

   public class_5441(class_6901 var1) {
      this.field_27707 = var1;
   }

   @Override
   public void method_27389(class_4162 var1) {
      Path var4 = this.field_27707.method_31600();

      for (Entry var6 : class_889.field_4582.method_39808()) {
         Path var7 = method_24779(var4, ((class_5621)var6.getKey()).method_25499());
         class_6325 var8 = (class_6325)var6.getValue();
         Function var9 = JsonOps.INSTANCE.withEncoder(class_6325.field_32303);

         try {
            Optional var10 = ((DataResult)var9.apply(() -> var8)).result();
            if (var10.isPresent()) {
               class_5998.method_27388(field_27708, var1, (JsonElement)var10.get(), var7);
            } else {
               field_27710.error("Couldn't serialize biome {}", var7);
            }
         } catch (IOException var11) {
            field_27710.error("Couldn't save biome {}", var7, var11);
         }
      }
   }

   private static Path method_24779(Path var0, Identifier var1) {
      return var0.resolve("reports/biomes/" + var1.method_21456() + ".json");
   }

   @Override
   public String method_27387() {
      return "Biomes";
   }
}
