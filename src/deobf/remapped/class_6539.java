package remapped;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class class_6539 {
   private static final Gson field_33253 = new GsonBuilder().create();

   public static boolean method_29793(JsonObject var0, String var1) {
      return method_29785(var0, var1) ? var0.getAsJsonPrimitive(var1).isString() : false;
   }

   public static boolean method_29792(JsonElement var0) {
      return var0.isJsonPrimitive() ? var0.getAsJsonPrimitive().isString() : false;
   }

   public static boolean method_29769(JsonElement var0) {
      return var0.isJsonPrimitive() ? var0.getAsJsonPrimitive().isNumber() : false;
   }

   public static boolean method_29794(JsonObject var0, String var1) {
      return method_29785(var0, var1) ? var0.getAsJsonPrimitive(var1).isBoolean() : false;
   }

   public static boolean method_29763(JsonObject var0, String var1) {
      return method_29776(var0, var1) ? var0.get(var1).isJsonArray() : false;
   }

   public static boolean method_29785(JsonObject var0, String var1) {
      return method_29776(var0, var1) ? var0.get(var1).isJsonPrimitive() : false;
   }

   public static boolean method_29776(JsonObject var0, String var1) {
      return var0 != null ? var0.get(var1) != null : false;
   }

   public static String method_29795(JsonElement var0, String var1) {
      if (!var0.isJsonPrimitive()) {
         throw new JsonSyntaxException("Expected " + var1 + " to be a string, was " + toString(var0));
      } else {
         return var0.getAsString();
      }
   }

   public static String method_29796(JsonObject var0, String var1) {
      if (!var0.has(var1)) {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a string");
      } else {
         return method_29795(var0.get(var1), var1);
      }
   }

   public static String method_29797(JsonObject var0, String var1, String var2) {
      return !var0.has(var1) ? var2 : method_29795(var0.get(var1), var1);
   }

   public static class_2451 method_29780(JsonElement var0, String var1) {
      if (!var0.isJsonPrimitive()) {
         throw new JsonSyntaxException("Expected " + var1 + " to be an item, was " + toString(var0));
      } else {
         String var4 = var0.getAsString();
         return class_8669.field_44382
            .method_39794(new class_4639(var4))
            .orElseThrow(() -> new JsonSyntaxException("Expected " + var1 + " to be an item, was unknown string '" + var4 + "'"));
      }
   }

   public static class_2451 method_29781(JsonObject var0, String var1) {
      if (!var0.has(var1)) {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find an item");
      } else {
         return method_29780(var0.get(var1), var1);
      }
   }

   public static boolean method_29770(JsonElement var0, String var1) {
      if (!var0.isJsonPrimitive()) {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Boolean, was " + toString(var0));
      } else {
         return var0.getAsBoolean();
      }
   }

   public static boolean method_29771(JsonObject var0, String var1) {
      if (!var0.has(var1)) {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Boolean");
      } else {
         return method_29770(var0.get(var1), var1);
      }
   }

   public static boolean method_29772(JsonObject var0, String var1, boolean var2) {
      return !var0.has(var1) ? var2 : method_29770(var0.get(var1), var1);
   }

   public static float method_29773(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsFloat();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Float, was " + toString(var0));
      }
   }

   public static float method_29774(JsonObject var0, String var1) {
      if (!var0.has(var1)) {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Float");
      } else {
         return method_29773(var0.get(var1), var1);
      }
   }

   public static float method_29775(JsonObject var0, String var1, float var2) {
      return !var0.has(var1) ? var2 : method_29773(var0.get(var1), var1);
   }

   public static long method_29789(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsLong();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Long, was " + toString(var0));
      }
   }

   public static long method_29790(JsonObject var0, String var1) {
      if (!var0.has(var1)) {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Long");
      } else {
         return method_29789(var0.get(var1), var1);
      }
   }

   public static long method_29791(JsonObject var0, String var1, long var2) {
      return !var0.has(var1) ? var2 : method_29789(var0.get(var1), var1);
   }

   public static int method_29766(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsInt();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Int, was " + toString(var0));
      }
   }

   public static int method_29767(JsonObject var0, String var1) {
      if (!var0.has(var1)) {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Int");
      } else {
         return method_29766(var0.get(var1), var1);
      }
   }

   public static int method_29768(JsonObject var0, String var1, int var2) {
      return !var0.has(var1) ? var2 : method_29766(var0.get(var1), var1);
   }

   public static byte method_29761(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsByte();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Byte, was " + toString(var0));
      }
   }

   public static byte method_29762(JsonObject var0, String var1, byte var2) {
      return !var0.has(var1) ? var2 : method_29761(var0.get(var1), var1);
   }

   public static JsonObject method_29782(JsonElement var0, String var1) {
      if (!var0.isJsonObject()) {
         throw new JsonSyntaxException("Expected " + var1 + " to be a JsonObject, was " + toString(var0));
      } else {
         return var0.getAsJsonObject();
      }
   }

   public static JsonObject method_29783(JsonObject var0, String var1) {
      if (!var0.has(var1)) {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a JsonObject");
      } else {
         return method_29782(var0.get(var1), var1);
      }
   }

   public static JsonObject method_29784(JsonObject var0, String var1, JsonObject var2) {
      return !var0.has(var1) ? var2 : method_29782(var0.get(var1), var1);
   }

   public static JsonArray method_29786(JsonElement var0, String var1) {
      if (!var0.isJsonArray()) {
         throw new JsonSyntaxException("Expected " + var1 + " to be a JsonArray, was " + toString(var0));
      } else {
         return var0.getAsJsonArray();
      }
   }

   public static JsonArray method_29787(JsonObject var0, String var1) {
      if (!var0.has(var1)) {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a JsonArray");
      } else {
         return method_29786(var0.get(var1), var1);
      }
   }

   @Nullable
   public static JsonArray method_29788(JsonObject var0, String var1, JsonArray var2) {
      return !var0.has(var1) ? var2 : method_29786(var0.get(var1), var1);
   }

   public static <T> T method_29777(JsonElement var0, String var1, JsonDeserializationContext var2, Class<? extends T> var3) {
      if (var0 == null) {
         throw new JsonSyntaxException("Missing " + var1);
      } else {
         return (T)var2.deserialize(var0, var3);
      }
   }

   public static <T> T method_29778(JsonObject var0, String var1, JsonDeserializationContext var2, Class<? extends T> var3) {
      if (!var0.has(var1)) {
         throw new JsonSyntaxException("Missing " + var1);
      } else {
         return method_29777(var0.get(var1), var1, var2, var3);
      }
   }

   public static <T> T method_29779(JsonObject var0, String var1, T var2, JsonDeserializationContext var3, Class<? extends T> var4) {
      return (T)(!var0.has(var1) ? var2 : method_29777(var0.get(var1), var1, var3, var4));
   }

   public static String toString(JsonElement var0) {
      String var3 = StringUtils.abbreviateMiddle(String.valueOf(var0), "...", 10);
      if (var0 != null) {
         if (!var0.isJsonNull()) {
            if (!var0.isJsonArray()) {
               if (!var0.isJsonObject()) {
                  if (var0.isJsonPrimitive()) {
                     JsonPrimitive var4 = var0.getAsJsonPrimitive();
                     if (var4.isNumber()) {
                        return "a number (" + var3 + ")";
                     }

                     if (var4.isBoolean()) {
                        return "a boolean (" + var3 + ")";
                     }
                  }

                  return var3;
               } else {
                  return "an object (" + var3 + ")";
               }
            } else {
               return "an array (" + var3 + ")";
            }
         } else {
            return "null (json)";
         }
      } else {
         return "null (missing)";
      }
   }

   @Nullable
   public static <T> T method_29802(Gson var0, Reader var1, Class<T> var2, boolean var3) {
      try {
         JsonReader var6 = new JsonReader(var1);
         var6.setLenient(var3);
         return (T)var0.getAdapter(var2).read(var6);
      } catch (IOException var7) {
         throw new JsonParseException(var7);
      }
   }

   @Nullable
   public static <T> T method_29799(Gson var0, Reader var1, TypeToken<T> var2, boolean var3) {
      try {
         JsonReader var6 = new JsonReader(var1);
         var6.setLenient(var3);
         return (T)var0.getAdapter(var2).read(var6);
      } catch (IOException var7) {
         throw new JsonParseException(var7);
      }
   }

   @Nullable
   public static <T> T method_29800(Gson var0, String var1, TypeToken<T> var2, boolean var3) {
      return method_29799(var0, new StringReader(var1), var2, var3);
   }

   @Nullable
   public static <T> T method_29804(Gson var0, String var1, Class<T> var2, boolean var3) {
      return method_29802(var0, new StringReader(var1), var2, var3);
   }

   @Nullable
   public static <T> T method_29764(Gson var0, Reader var1, TypeToken<T> var2) {
      return method_29799(var0, var1, var2, false);
   }

   @Nullable
   public static <T> T method_29765(Gson var0, String var1, TypeToken<T> var2) {
      return method_29800(var0, var1, var2, false);
   }

   @Nullable
   public static <T> T method_29801(Gson var0, Reader var1, Class<T> var2) {
      return method_29802(var0, var1, var2, false);
   }

   @Nullable
   public static <T> T method_29803(Gson var0, String var1, Class<T> var2) {
      return method_29804(var0, var1, var2, false);
   }

   public static JsonObject method_29808(String var0, boolean var1) {
      return method_29806(new StringReader(var0), var1);
   }

   public static JsonObject method_29806(Reader var0, boolean var1) {
      return method_29802(field_33253, var0, JsonObject.class, var1);
   }

   public static JsonObject method_29807(String var0) {
      return method_29808(var0, false);
   }

   public static JsonObject method_29805(Reader var0) {
      return method_29806(var0, false);
   }
}
