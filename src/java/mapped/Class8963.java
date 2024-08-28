package mapped;

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

public class Class8963 {
   private static final Gson field40486 = new GsonBuilder().create();

   public static boolean method32755(JsonObject var0, String var1) {
      return method32760(var0, var1) ? var0.getAsJsonPrimitive(var1).isString() : false;
   }

   public static boolean method32756(JsonElement var0) {
      return var0.isJsonPrimitive() ? var0.getAsJsonPrimitive().isString() : false;
   }

   public static boolean method32757(JsonElement var0) {
      return var0.isJsonPrimitive() ? var0.getAsJsonPrimitive().isNumber() : false;
   }

   public static boolean method32758(JsonObject var0, String var1) {
      return method32760(var0, var1) ? var0.getAsJsonPrimitive(var1).isBoolean() : false;
   }

   public static boolean method32759(JsonObject var0, String var1) {
      return method32761(var0, var1) ? var0.get(var1).isJsonArray() : false;
   }

   public static boolean method32760(JsonObject var0, String var1) {
      return method32761(var0, var1) ? var0.get(var1).isJsonPrimitive() : false;
   }

   public static boolean method32761(JsonObject var0, String var1) {
      return var0 != null ? var0.get(var1) != null : false;
   }

   public static String method32762(JsonElement var0, String var1) {
      if (!var0.isJsonPrimitive()) {
         throw new JsonSyntaxException("Expected " + var1 + " to be a string, was " + toString(var0));
      } else {
         return var0.getAsString();
      }
   }

   public static String method32763(JsonObject var0, String var1) {
      if (!var0.has(var1)) {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a string");
      } else {
         return method32762(var0.get(var1), var1);
      }
   }

   public static String method32764(JsonObject var0, String var1, String var2) {
      return !var0.has(var1) ? var2 : method32762(var0.get(var1), var1);
   }

   public static Class3257 method32765(JsonElement var0, String var1) {
      if (!var0.isJsonPrimitive()) {
         throw new JsonSyntaxException("Expected " + var1 + " to be an item, was " + toString(var0));
      } else {
         String var4 = var0.getAsString();
         return Registry.field16075
            .method9187(new ResourceLocation(var4))
            .orElseThrow(() -> new JsonSyntaxException("Expected " + var1 + " to be an item, was unknown string '" + var4 + "'"));
      }
   }

   public static Class3257 method32766(JsonObject var0, String var1) {
      if (!var0.has(var1)) {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find an item");
      } else {
         return method32765(var0.get(var1), var1);
      }
   }

   public static boolean method32767(JsonElement var0, String var1) {
      if (!var0.isJsonPrimitive()) {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Boolean, was " + toString(var0));
      } else {
         return var0.getAsBoolean();
      }
   }

   public static boolean method32768(JsonObject var0, String var1) {
      if (!var0.has(var1)) {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Boolean");
      } else {
         return method32767(var0.get(var1), var1);
      }
   }

   public static boolean method32769(JsonObject var0, String var1, boolean var2) {
      return !var0.has(var1) ? var2 : method32767(var0.get(var1), var1);
   }

   public static float method32770(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsFloat();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Float, was " + toString(var0));
      }
   }

   public static float method32771(JsonObject var0, String var1) {
      if (!var0.has(var1)) {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Float");
      } else {
         return method32770(var0.get(var1), var1);
      }
   }

   public static float method32772(JsonObject var0, String var1, float var2) {
      return !var0.has(var1) ? var2 : method32770(var0.get(var1), var1);
   }

   public static long method32773(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsLong();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Long, was " + toString(var0));
      }
   }

   public static long method32774(JsonObject var0, String var1) {
      if (!var0.has(var1)) {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Long");
      } else {
         return method32773(var0.get(var1), var1);
      }
   }

   public static long method32775(JsonObject var0, String var1, long var2) {
      return !var0.has(var1) ? var2 : method32773(var0.get(var1), var1);
   }

   public static int method32776(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsInt();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Int, was " + toString(var0));
      }
   }

   public static int method32777(JsonObject var0, String var1) {
      if (!var0.has(var1)) {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Int");
      } else {
         return method32776(var0.get(var1), var1);
      }
   }

   public static int method32778(JsonObject var0, String var1, int var2) {
      return !var0.has(var1) ? var2 : method32776(var0.get(var1), var1);
   }

   public static byte method32779(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsByte();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Byte, was " + toString(var0));
      }
   }

   public static byte method32780(JsonObject var0, String var1, byte var2) {
      return !var0.has(var1) ? var2 : method32779(var0.get(var1), var1);
   }

   public static JsonObject method32781(JsonElement var0, String var1) {
      if (!var0.isJsonObject()) {
         throw new JsonSyntaxException("Expected " + var1 + " to be a JsonObject, was " + toString(var0));
      } else {
         return var0.getAsJsonObject();
      }
   }

   public static JsonObject method32782(JsonObject var0, String var1) {
      if (!var0.has(var1)) {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a JsonObject");
      } else {
         return method32781(var0.get(var1), var1);
      }
   }

   public static JsonObject method32783(JsonObject var0, String var1, JsonObject var2) {
      return !var0.has(var1) ? var2 : method32781(var0.get(var1), var1);
   }

   public static JsonArray method32784(JsonElement var0, String var1) {
      if (!var0.isJsonArray()) {
         throw new JsonSyntaxException("Expected " + var1 + " to be a JsonArray, was " + toString(var0));
      } else {
         return var0.getAsJsonArray();
      }
   }

   public static JsonArray method32785(JsonObject var0, String var1) {
      if (!var0.has(var1)) {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a JsonArray");
      } else {
         return method32784(var0.get(var1), var1);
      }
   }

   @Nullable
   public static JsonArray method32786(JsonObject var0, String var1, JsonArray var2) {
      return !var0.has(var1) ? var2 : method32784(var0.get(var1), var1);
   }

   public static <T> T method32787(JsonElement var0, String var1, JsonDeserializationContext var2, Class<? extends T> var3) {
      if (var0 == null) {
         throw new JsonSyntaxException("Missing " + var1);
      } else {
         return (T)var2.deserialize(var0, var3);
      }
   }

   public static <T> T method32788(JsonObject var0, String var1, JsonDeserializationContext var2, Class<? extends T> var3) {
      if (!var0.has(var1)) {
         throw new JsonSyntaxException("Missing " + var1);
      } else {
         return method32787(var0.get(var1), var1, var2, var3);
      }
   }

   public static <T> T method32789(JsonObject var0, String var1, T var2, JsonDeserializationContext var3, Class<? extends T> var4) {
      return (T)(!var0.has(var1) ? var2 : method32787(var0.get(var1), var1, var3, var4));
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
   public static <T> T method32790(Gson var0, Reader var1, Class<T> var2, boolean var3) {
      try {
         JsonReader var6 = new JsonReader(var1);
         var6.setLenient(var3);
         return (T)var0.getAdapter(var2).read(var6);
      } catch (IOException var7) {
         throw new JsonParseException(var7);
      }
   }

   @Nullable
   public static <T> T method32791(Gson var0, Reader var1, TypeToken<T> var2, boolean var3) {
      try {
         JsonReader var6 = new JsonReader(var1);
         var6.setLenient(var3);
         return (T)var0.getAdapter(var2).read(var6);
      } catch (IOException var7) {
         throw new JsonParseException(var7);
      }
   }

   @Nullable
   public static <T> T method32792(Gson var0, String var1, TypeToken<T> var2, boolean var3) {
      return method32791(var0, new StringReader(var1), var2, var3);
   }

   @Nullable
   public static <T> T method32793(Gson var0, String var1, Class<T> var2, boolean var3) {
      return method32790(var0, new StringReader(var1), var2, var3);
   }

   @Nullable
   public static <T> T method32794(Gson var0, Reader var1, TypeToken<T> var2) {
      return method32791(var0, var1, var2, false);
   }

   @Nullable
   public static <T> T method32795(Gson var0, String var1, TypeToken<T> var2) {
      return method32792(var0, var1, var2, false);
   }

   @Nullable
   public static <T> T method32796(Gson var0, Reader var1, Class<T> var2) {
      return method32790(var0, var1, var2, false);
   }

   @Nullable
   public static <T> T method32797(Gson var0, String var1, Class<T> var2) {
      return method32793(var0, var1, var2, false);
   }

   public static JsonObject method32798(String var0, boolean var1) {
      return method32799(new StringReader(var0), var1);
   }

   public static JsonObject method32799(Reader var0, boolean var1) {
      return method32790(field40486, var0, JsonObject.class, var1);
   }

   public static JsonObject method32800(String var0) {
      return method32798(var0, false);
   }

   public static JsonObject method32801(Reader var0) {
      return method32799(var0, false);
   }
}
