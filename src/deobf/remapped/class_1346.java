package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import com.mojang.datafixers.util.Pair;
import java.lang.reflect.Type;
import java.util.function.Function;

public class class_1346<E, T extends class_2491<E>> implements JsonDeserializer<E>, JsonSerializer<E> {
   private final class_8669<T> field_7351;
   private final String field_7347;
   private final String field_7348;
   private final Function<E, T> field_7346;
   private final Pair<T, class_4367<? extends E>> field_7349;

   private class_1346(class_8669<T> var1, String var2, String var3, Function<E, T> var4, Pair<T, class_4367<? extends E>> var5) {
      this.field_7351 = var1;
      this.field_7347 = var2;
      this.field_7348 = var3;
      this.field_7346 = var4;
      this.field_7349 = var5;
   }

   public E deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      if (!var1.isJsonObject()) {
         if (this.field_7349 != null) {
            return (E)((class_4367)this.field_7349.getSecond()).method_20248(var1, var3);
         } else {
            throw new UnsupportedOperationException("Object " + var1 + " can't be deserialized");
         }
      } else {
         JsonObject var6 = class_6539.method_29782(var1, this.field_7347);
         class_4639 var7 = new class_4639(class_6539.method_29796(var6, this.field_7348));
         class_2491 var8 = this.field_7351.method_39806(var7);
         if (var8 != null) {
            return (E)var8.method_11400().method_29492(var6, var3);
         } else {
            throw new JsonSyntaxException("Unknown type '" + var7 + "'");
         }
      }
   }

   public JsonElement serialize(E var1, Type var2, JsonSerializationContext var3) {
      class_2491 var6 = this.field_7346.apply((E)var1);
      if (this.field_7349 != null && this.field_7349.getFirst() == var6) {
         return ((class_4367)this.field_7349.getSecond()).method_20247(var1, var3);
      } else if (var6 != null) {
         JsonObject var7 = new JsonObject();
         var7.addProperty(this.field_7348, this.field_7351.method_39797((T)var6).toString());
         var6.method_11400().method_29491(var7, var1, var3);
         return var7;
      } else {
         throw new JsonSyntaxException("Unknown type: " + var1);
      }
   }
}
