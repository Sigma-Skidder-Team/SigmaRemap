package remapped;

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

public final class class_9410 implements class_3940 {
   public class_9410(class_7832 var1) {
      this.field_48125 = var1;
   }

   @Override
   public Collection<Identifier> method_18209(class_5621<? extends class_8669<?>> var1) {
      return this.field_48125.method_35460(var1.method_25499().method_21456(), var0 -> var0.endsWith(".json"));
   }

   @Override
   public <E> DataResult<Pair<E, OptionalInt>> method_18208(
      DynamicOps<JsonElement> var1, class_5621<? extends class_8669<E>> var2, class_5621<E> var3, Decoder<E> var4
   ) {
      Identifier var7 = var3.method_25499();
      Identifier var8 = new Identifier(var7.method_21461(), var2.method_25499().method_21456() + "/" + var7.method_21456() + ".json");

      try (
         class_4038 var9 = this.field_48125.method_35458(var8);
         InputStreamReader var11 = new InputStreamReader(var9.method_18576(), StandardCharsets.UTF_8);
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
      return "ResourceAccess[" + this.field_48125 + "]";
   }
}
