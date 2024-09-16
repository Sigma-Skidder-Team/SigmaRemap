package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.nio.file.Path;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Class4446 implements Class4442 {
   private static final Logger field21613 = LogManager.getLogger();
   private static final Gson field21614 = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final Class9068 field21615;

   public Class4446(Class9068 var1) {
      this.field21615 = var1;
   }

   @Override
   public void method14013(Class8297 var1) {
      Path var4 = this.field21615.method33776();
      HashMap<Block, Class5146> var5 = Maps.newHashMap();
      Consumer<Class5146> var6 = var1x -> {
         Block var4x = var1x.method15931();
         Class5146 var5x = var5.put(var4x, var1x);
         if (var5x != null) {
            throw new IllegalStateException("Duplicate blockstate definition for " + var4x);
         }
      };

      Map<ResourceLocation, Supplier<JsonElement>> var7 = Maps.newHashMap();
      Set<Object> var8 = Sets.newHashSet();
      BiConsumer<ResourceLocation, Supplier<JsonElement>> var9 = (var1x, var2) -> {
         Object var5x = var7.put(var1x, var2);
         if (var5x != null) {
            throw new IllegalStateException("Duplicate model definition for " + var1x);
         }
      };
      Consumer<Item> var10 = var8::add;
      new Class9407(var6, var9, var10).method35961();
      new Class7810(var9).method26077();
      List<Block> var11 = Registry.BLOCK.method9192().filter(var1x -> !var5.containsKey(var1x)).collect(Collectors.toList());
      if (var11.isEmpty()) {
         Registry.BLOCK.forEach(var2 -> {
            Item var5x = Item.field18732.get(var2);
            if (var5x != null) {
               if (var8.contains(var5x)) {
                  return;
               }

               ResourceLocation var6x = Class9060.method33724(var5x);
               if (!var7.containsKey(var6x)) {
                  var7.put(var6x, new Class5149(Class9060.method33723(var2)));
               }
            }
         });
         this.method14037(var1, var4, var5, Class4446::method14038);
         this.method14037(var1, var4, var7, Class4446::method14039);
      } else {
         throw new IllegalStateException("Missing blockstate definitions for: " + var11);
      }
   }

   private <T> void method14037(Class8297 var1, Path var2, Map<T, ? extends Supplier<JsonElement>> var3, BiFunction<Path, T, Path> var4) {
      var3.forEach((var3x, var4x) -> {
         Path var7 = (Path)var4.apply(var2, var3x);

         try {
            Class4442.method14020(field21614, var1, (JsonElement)var4x.get(), var7);
         } catch (Exception var9) {
            field21613.error("Couldn't save {}", var7, var9);
         }
      });
   }

   private static Path method14038(Path var0, Block var1) {
      ResourceLocation var4 = Registry.BLOCK.getKey(var1);
      return var0.resolve("assets/" + var4.getNamespace() + "/blockstates/" + var4.getPath() + ".json");
   }

   private static Path method14039(Path var0, ResourceLocation var1) {
      return var0.resolve("assets/" + var1.getNamespace() + "/models/" + var1.getPath() + ".json");
   }

   @Override
   public String method14012() {
      return "Block State Definitions";
   }
}
