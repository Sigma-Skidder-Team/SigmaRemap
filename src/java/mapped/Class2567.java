package mapped;

import com.google.gson.*;
import com.mojang.datafixers.util.Pair;

import java.lang.reflect.Type;
import java.util.function.Function;

public class Class2567<E, T extends Class7129<E>> implements JsonDeserializer<E>, JsonSerializer<E> {
   private final Registry<T> field16790;
   private final String field16791;
   private final String field16792;
   private final Function<E, T> field16793;
   private final Pair<T, Class8367<? extends E>> field16794;

   public Class2567(Registry<T> var1, String var2, String var3, Function<E, T> var4, Pair<T, Class8367<? extends E>> var5) {
      this.field16790 = var1;
      this.field16791 = var2;
      this.field16792 = var3;
      this.field16793 = var4;
      this.field16794 = var5;
   }

   public E deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      if (!var1.isJsonObject()) {
         if (this.field16794 != null) {
            return (E)((Class8367)this.field16794.getSecond()).method29307(var1, var3);
         } else {
            throw new UnsupportedOperationException("Object " + var1 + " can't be deserialized");
         }
      } else {
         JsonObject var6 = JSONUtils.method32781(var1, this.field16791);
         ResourceLocation var7 = new ResourceLocation(JSONUtils.method32763(var6, this.field16792));
         Class7129 var8 = this.field16790.method9184(var7);
         if (var8 != null) {
            return (E)var8.method22239().method15248(var6, var3);
         } else {
            throw new JsonSyntaxException("Unknown type '" + var7 + "'");
         }
      }
   }

   public JsonElement serialize(E var1, Type var2, JsonSerializationContext var3) {
      Class7129 var6 = this.field16793.apply((E)var1);
      if (this.field16794 != null && this.field16794.getFirst() == var6) {
         return ((Class8367)this.field16794.getSecond()).method29306(var1, var3);
      } else if (var6 != null) {
         JsonObject var7 = new JsonObject();
         var7.addProperty(this.field16792, this.field16790.method9181((T)var6).toString());
         var6.method22239().serialize(var7, var1, var3);
         return var7;
      } else {
         throw new JsonSyntaxException("Unknown type: " + var1);
      }
   }
}
