package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Streams;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Class9253 {
   private final Optional<ResourceLocation> field42558;
   private final Set<Class9588> field42559;
   private Optional<String> field42560;

   public Class9253(Optional<ResourceLocation> var1, Optional<String> var2, Class9588... var3) {
      this.field42558 = var1;
      this.field42560 = var2;
      this.field42559 = ImmutableSet.copyOf(var3);
   }

   public ResourceLocation method34805(Block var1, Class7287 var2, BiConsumer<ResourceLocation, Supplier<JsonElement>> var3) {
      return this.method34808(Class9060.method33722(var1, this.field42560.orElse("")), var2, var3);
   }

   public ResourceLocation method34806(Block var1, String var2, Class7287 var3, BiConsumer<ResourceLocation, Supplier<JsonElement>> var4) {
      return this.method34808(Class9060.method33722(var1, var2 + this.field42560.orElse("")), var3, var4);
   }

   public ResourceLocation method34807(Block var1, String var2, Class7287 var3, BiConsumer<ResourceLocation, Supplier<JsonElement>> var4) {
      return this.method34808(Class9060.method33722(var1, var2), var3, var4);
   }

   public ResourceLocation method34808(ResourceLocation var1, Class7287 var2, BiConsumer<ResourceLocation, Supplier<JsonElement>> var3) {
      Map<Class9588, ResourceLocation> var6 = this.method34809(var2);
      var3.accept(var1, () -> {
         JsonObject var4 = new JsonObject();
         this.field42558.ifPresent(var1xx -> var4.addProperty("parent", var1xx.toString()));
         if (!var6.isEmpty()) {
            JsonObject var5 = new JsonObject();
            var6.forEach((var1xx, var2x) -> var5.addProperty(var1xx.method37232(), var2x.toString()));
            var4.add("textures", var5);
         }

         return var4;
      });
      return var1;
   }

   private Map<Class9588, ResourceLocation> method34809(Class7287 var1) {
      return Streams.concat(this.field42559.stream(), var1.method22992())
         .collect(ImmutableMap.toImmutableMap(Function.identity(), var1::method22994));
   }
}
