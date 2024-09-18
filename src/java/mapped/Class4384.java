package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.OptionalInt;

public final class Class4384 implements Class4383 {
   public final IResourceManager field21395;

   public Class4384(IResourceManager var1) {
      this.field21395 = var1;
   }

   @Override
   public Collection<ResourceLocation> method13746(RegistryKey<? extends Registry<?>> var1) {
      return this.field21395.method583(var1.getLocation().getPath(), var0 -> var0.endsWith(".json"));
   }

   @Override
   public <E> DataResult<Pair<E, OptionalInt>> method13747(
           DynamicOps<JsonElement> var1, RegistryKey<? extends Registry<E>> var2, RegistryKey<E> var3, Decoder<E> var4
   ) {
      ResourceLocation var7 = var3.getLocation();
      ResourceLocation var8 = new ResourceLocation(var7.getNamespace(), var2.getLocation().getPath() + "/" + var7.getPath() + ".json");

      try (
              JSonShader var9 = this.field21395.getShader(var8);
              InputStreamReader var11 = new InputStreamReader(var9.getFile(), StandardCharsets.UTF_8);
      ) {
         JsonParser var13 = new JsonParser();
         JsonElement var14 = var13.parse(var11);
         return var4.parse(var1, var14).map(var0 -> Pair.of(var0, OptionalInt.empty()));
      } catch (JsonSyntaxException | IOException | JsonIOException var44) {
         return DataResult.error("Failed to parse " + var8 + " file: " + var44.getMessage());
      }
   }

   @Override
   public String toString() {
      return "ResourceAccess[" + this.field21395 + "]";
   }
}
