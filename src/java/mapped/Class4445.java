package mapped;

import com.google.common.collect.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.datafixers.util.Pair;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Class4445 implements Class4442 {
   private static final Logger field21609 = LogManager.getLogger();
   private static final Gson field21610 = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final Class9068 field21611;
   private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Class5888>>>, Class7538>> field21612 = ImmutableList.of(
      Pair.of(Class2834::new, Class8524.field38285),
      Pair.of(Class2840::new, Class8524.field38282),
      Pair.of(Class2832::new, Class8524.field38286),
      Pair.of(Class2838::new, Class8524.field38292),
      Pair.of(Class2836::new, Class8524.field38288),
      Pair.of(Class2837::new, Class8524.field38287)
   );

   public Class4445(Class9068 var1) {
      this.field21611 = var1;
   }

   @Override
   public void method14013(Class8297 var1) {
      Path var4 = this.field21611.method33776();
      Map<ResourceLocation, Class7318> var5 = Maps.newHashMap();
      this.field21612.forEach(var1x -> var1x.getFirst().get().accept((var2, var3) -> {
            if (var5.put(var2, var3.method18321(var1x.getSecond()).method18322()) != null) {
               throw new IllegalStateException("Duplicate loot table " + var2);
            }
         }));
      Class8478 var6 = new Class8478(Class8524.field38291, var0 -> null, var5::get);

       for (ResourceLocation var8 : Sets.difference(Class8793.method31732(), var5.keySet())) {
           var6.method29955("Missing built-in table: " + var8);
       }

      var5.forEach((var1x, var2) -> Class284.method1059(var6, var1x, var2));
      Multimap<String, String> var9 = var6.method29961();
      if (var9.isEmpty()) {
         var5.forEach((var2, var3) -> {
            Path var6x = method14030(var4, var2);

            try {
               Class4442.method14020(field21610, var1, Class284.method1060(var3), var6x);
            } catch (IOException var8x) {
               field21609.error("Couldn't save loot table {}", var6x, var8x);
            }
         });
      } else {
         var9.forEach((var0, var1x) -> field21609.warn("Found validation problem in " + var0 + ": " + var1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      }
   }

   private static Path method14030(Path var0, ResourceLocation var1) {
      return var0.resolve("data/" + var1.getNamespace() + "/loot_tables/" + var1.getPath() + ".json");
   }

   @Override
   public String method14012() {
      return "LootTables";
   }
}
