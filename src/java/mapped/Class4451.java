package mapped;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public class Class4451 implements Class4442 {
   private static final Logger field21627 = LogManager.getLogger();
   private static final Gson field21628 = new GsonBuilder().setPrettyPrinting().create();
   private final Class9068 field21629;

   public Class4451(Class9068 var1) {
      this.field21629 = var1;
   }

   @Override
   public void method14013(Class8297 var1) {
      Path var4 = this.field21629.method33776();

      for (Entry var6 : Class6714.field29430.method9191()) {
         Path var7 = method14085(var4, ((RegistryKey)var6.getKey()).getLocation());
         Biome var8 = (Biome)var6.getValue();
         Function<Supplier<Biome>, DataResult<JsonElement>> var9 = JsonOps.INSTANCE.withEncoder(Biome.field40309);

         try {
            Optional var10 = ((DataResult)var9.apply(() -> var8)).result();
            if (var10.isPresent()) {
               Class4442.method14020(field21628, var1, (JsonElement)var10.get(), var7);
            } else {
               field21627.error("Couldn't serialize biome {}", var7);
            }
         } catch (IOException var11) {
            field21627.error("Couldn't save biome {}", var7, var11);
         }
      }
   }

   private static Path method14085(Path var0, ResourceLocation var1) {
      return var0.resolve("reports/biomes/" + var1.getPath() + ".json");
   }

   @Override
   public String method14012() {
      return "Biomes";
   }
}
