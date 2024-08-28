package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.OptionalInt;

public final class Class4384 implements Class4383 {
   public final Class191 field21395;

   public Class4384(Class191 var1) {
      this.field21395 = var1;
   }

   @Override
   public Collection<ResourceLocation> method13746(Class8705<? extends Class2348<?>> var1) {
      return this.field21395.method583(var1.method31399().method8292(), var0 -> var0.endsWith(".json"));
   }

   @Override
   public <E> DataResult<Pair<E, OptionalInt>> method13747(
      DynamicOps<JsonElement> var1, Class8705<? extends Class2348<E>> var2, Class8705<E> var3, Decoder<E> var4
   ) {
      ResourceLocation var7 = var3.method31399();
      ResourceLocation var8 = new ResourceLocation(var7.method8293(), var2.method31399().method8292() + "/" + var7.method8292() + ".json");

      try (
         Class1783 var9 = this.field21395.method580(var8);
         InputStreamReader var11 = new InputStreamReader(var9.method7763(), StandardCharsets.UTF_8);
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
