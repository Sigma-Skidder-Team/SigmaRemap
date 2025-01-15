// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.GsonBuilder;
import java.io.StringReader;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import java.io.Reader;
import com.google.gson.JsonPrimitive;
import org.apache.commons.lang3.StringUtils;
import java.lang.reflect.Type;
import com.google.gson.JsonDeserializationContext;
import javax.annotation.Nullable;
import com.google.gson.JsonArray;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.Gson;

public class Class9583
{
    private static final Gson field41786;
    
    public static boolean method35887(final JsonObject jsonObject, final String s) {
        return method35892(jsonObject, s) && jsonObject.getAsJsonPrimitive(s).isString();
    }
    
    public static boolean method35888(final JsonElement jsonElement) {
        return jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isString();
    }
    
    public static boolean method35889(final JsonElement jsonElement) {
        return jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber();
    }
    
    public static boolean method35890(final JsonObject jsonObject, final String s) {
        return method35892(jsonObject, s) && jsonObject.getAsJsonPrimitive(s).isBoolean();
    }
    
    public static boolean method35891(final JsonObject jsonObject, final String s) {
        return method35893(jsonObject, s) && jsonObject.get(s).isJsonArray();
    }
    
    public static boolean method35892(final JsonObject jsonObject, final String s) {
        return method35893(jsonObject, s) && jsonObject.get(s).isJsonPrimitive();
    }
    
    public static boolean method35893(final JsonObject jsonObject, final String s) {
        return jsonObject != null && jsonObject.get(s) != null;
    }
    
    public static String method35894(final JsonElement jsonElement, final String str) {
        if (!jsonElement.isJsonPrimitive()) {
            throw new JsonSyntaxException("Expected " + str + " to be a string, was " + toString(jsonElement));
        }
        return jsonElement.getAsString();
    }
    
    public static String method35895(final JsonObject jsonObject, final String str) {
        if (!jsonObject.has(str)) {
            throw new JsonSyntaxException("Missing " + str + ", expected to find a string");
        }
        return method35894(jsonObject.get(str), str);
    }
    
    public static String method35896(final JsonObject jsonObject, final String s, final String s2) {
        return jsonObject.has(s) ? method35894(jsonObject.get(s), s) : s2;
    }
    
    public static Item method35897(final JsonElement jsonElement, final String str) {
        if (!jsonElement.isJsonPrimitive()) {
            throw new JsonSyntaxException("Expected " + str + " to be an item, was " + toString(jsonElement));
        }
        return Class90.field211.method506(new Class1932(jsonElement.getAsString())).orElseThrow(() -> {
            new JsonSyntaxException("Expected " + str2 + " to be an item, was unknown string '" + str3 + "'");
            return;
        });
    }
    
    public static Item method35898(final JsonObject jsonObject, final String str) {
        if (!jsonObject.has(str)) {
            throw new JsonSyntaxException("Missing " + str + ", expected to find an item");
        }
        return method35897(jsonObject.get(str), str);
    }
    
    public static boolean method35899(final JsonElement jsonElement, final String str) {
        if (!jsonElement.isJsonPrimitive()) {
            throw new JsonSyntaxException("Expected " + str + " to be a Boolean, was " + toString(jsonElement));
        }
        return jsonElement.getAsBoolean();
    }
    
    public static boolean method35900(final JsonObject jsonObject, final String str) {
        if (!jsonObject.has(str)) {
            throw new JsonSyntaxException("Missing " + str + ", expected to find a Boolean");
        }
        return method35899(jsonObject.get(str), str);
    }
    
    public static boolean method35901(final JsonObject jsonObject, final String s, final boolean b) {
        return jsonObject.has(s) ? method35899(jsonObject.get(s), s) : b;
    }
    
    public static float method35902(final JsonElement jsonElement, final String str) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsFloat();
        }
        throw new JsonSyntaxException("Expected " + str + " to be a Float, was " + toString(jsonElement));
    }
    
    public static float method35903(final JsonObject jsonObject, final String str) {
        if (!jsonObject.has(str)) {
            throw new JsonSyntaxException("Missing " + str + ", expected to find a Float");
        }
        return method35902(jsonObject.get(str), str);
    }
    
    public static float method35904(final JsonObject jsonObject, final String s, final float n) {
        return jsonObject.has(s) ? method35902(jsonObject.get(s), s) : n;
    }
    
    public static long method35905(final JsonElement jsonElement, final String str) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsLong();
        }
        throw new JsonSyntaxException("Expected " + str + " to be a Long, was " + toString(jsonElement));
    }
    
    public static long method35906(final JsonObject jsonObject, final String str) {
        if (!jsonObject.has(str)) {
            throw new JsonSyntaxException("Missing " + str + ", expected to find a Long");
        }
        return method35905(jsonObject.get(str), str);
    }
    
    public static long method35907(final JsonObject jsonObject, final String s, final long n) {
        return jsonObject.has(s) ? method35905(jsonObject.get(s), s) : n;
    }
    
    public static int method35908(final JsonElement jsonElement, final String str) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsInt();
        }
        throw new JsonSyntaxException("Expected " + str + " to be a Int, was " + toString(jsonElement));
    }
    
    public static int method35909(final JsonObject jsonObject, final String str) {
        if (!jsonObject.has(str)) {
            throw new JsonSyntaxException("Missing " + str + ", expected to find a Int");
        }
        return method35908(jsonObject.get(str), str);
    }
    
    public static int method35910(final JsonObject jsonObject, final String s, final int n) {
        return jsonObject.has(s) ? method35908(jsonObject.get(s), s) : n;
    }
    
    public static byte method35911(final JsonElement jsonElement, final String str) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsByte();
        }
        throw new JsonSyntaxException("Expected " + str + " to be a Byte, was " + toString(jsonElement));
    }
    
    public static byte method35912(final JsonObject jsonObject, final String s, final byte b) {
        return jsonObject.has(s) ? method35911(jsonObject.get(s), s) : b;
    }
    
    public static JsonObject method35913(final JsonElement jsonElement, final String str) {
        if (!jsonElement.isJsonObject()) {
            throw new JsonSyntaxException("Expected " + str + " to be a JsonObject, was " + toString(jsonElement));
        }
        return jsonElement.getAsJsonObject();
    }
    
    public static JsonObject method35914(final JsonObject jsonObject, final String str) {
        if (!jsonObject.has(str)) {
            throw new JsonSyntaxException("Missing " + str + ", expected to find a JsonObject");
        }
        return method35913(jsonObject.get(str), str);
    }
    
    public static JsonObject method35915(final JsonObject jsonObject, final String s, final JsonObject jsonObject2) {
        return jsonObject.has(s) ? method35913(jsonObject.get(s), s) : jsonObject2;
    }
    
    public static JsonArray method35916(final JsonElement jsonElement, final String str) {
        if (!jsonElement.isJsonArray()) {
            throw new JsonSyntaxException("Expected " + str + " to be a JsonArray, was " + toString(jsonElement));
        }
        return jsonElement.getAsJsonArray();
    }
    
    public static JsonArray method35917(final JsonObject jsonObject, final String str) {
        if (!jsonObject.has(str)) {
            throw new JsonSyntaxException("Missing " + str + ", expected to find a JsonArray");
        }
        return method35916(jsonObject.get(str), str);
    }
    
    @Nullable
    public static JsonArray method35918(final JsonObject jsonObject, final String s, final JsonArray jsonArray) {
        return jsonObject.has(s) ? method35916(jsonObject.get(s), s) : jsonArray;
    }
    
    public static <T> T method35919(final JsonElement jsonElement, final String str, final JsonDeserializationContext jsonDeserializationContext, final Class<? extends T> clazz) {
        if (jsonElement == null) {
            throw new JsonSyntaxException("Missing " + str);
        }
        return (T)jsonDeserializationContext.deserialize(jsonElement, (Type)clazz);
    }
    
    public static <T> T method35920(final JsonObject jsonObject, final String str, final JsonDeserializationContext jsonDeserializationContext, final Class<? extends T> clazz) {
        if (!jsonObject.has(str)) {
            throw new JsonSyntaxException("Missing " + str);
        }
        return method35919(jsonObject.get(str), str, jsonDeserializationContext, clazz);
    }
    
    public static <T> T method35921(final JsonObject jsonObject, final String s, final T t, final JsonDeserializationContext jsonDeserializationContext, final Class<? extends T> clazz) {
        return jsonObject.has(s) ? method35919(jsonObject.get(s), s, jsonDeserializationContext, clazz) : t;
    }
    
    public static String toString(final JsonElement obj) {
        final String abbreviateMiddle = StringUtils.abbreviateMiddle(String.valueOf(obj), "...", 10);
        if (obj == null) {
            return "null (missing)";
        }
        if (obj.isJsonNull()) {
            return "null (json)";
        }
        if (obj.isJsonArray()) {
            return "an array (" + abbreviateMiddle + ")";
        }
        if (!obj.isJsonObject()) {
            if (obj.isJsonPrimitive()) {
                final JsonPrimitive asJsonPrimitive = obj.getAsJsonPrimitive();
                if (asJsonPrimitive.isNumber()) {
                    return "a number (" + abbreviateMiddle + ")";
                }
                if (asJsonPrimitive.isBoolean()) {
                    return "a boolean (" + abbreviateMiddle + ")";
                }
            }
            return abbreviateMiddle;
        }
        return "an object (" + abbreviateMiddle + ")";
    }
    
    @Nullable
    public static <T> T method35922(final Gson gson, final Reader reader, final Class<T> clazz, final boolean lenient) {
        try {
            final JsonReader jsonReader = new JsonReader(reader);
            jsonReader.setLenient(lenient);
            return (T)gson.getAdapter((Class)clazz).read(jsonReader);
        }
        catch (final IOException ex) {
            throw new JsonParseException((Throwable)ex);
        }
    }
    
    @Nullable
    public static <T> T method35923(final Gson gson, final Reader reader, final Type type, final boolean lenient) {
        try {
            final JsonReader jsonReader = new JsonReader(reader);
            jsonReader.setLenient(lenient);
            return (T)gson.getAdapter(TypeToken.get(type)).read(jsonReader);
        }
        catch (final IOException ex) {
            throw new JsonParseException((Throwable)ex);
        }
    }
    
    @Nullable
    public static <T> T method35924(final Gson gson, final String s, final Type type, final boolean b) {
        return method35923(gson, new StringReader(s), type, b);
    }
    
    @Nullable
    public static <T> T method35925(final Gson gson, final String s, final Class<T> clazz, final boolean b) {
        return method35922(gson, new StringReader(s), clazz, b);
    }
    
    @Nullable
    public static <T> T method35926(final Gson gson, final Reader reader, final Type type) {
        return method35923(gson, reader, type, false);
    }
    
    @Nullable
    public static <T> T method35927(final Gson gson, final String s, final Type type) {
        return method35924(gson, s, type, false);
    }
    
    @Nullable
    public static <T> T method35928(final Gson gson, final Reader reader, final Class<T> clazz) {
        return method35922(gson, reader, clazz, false);
    }
    
    @Nullable
    public static <T> T method35929(final Gson gson, final String s, final Class<T> clazz) {
        return method35925(gson, s, clazz, false);
    }
    
    public static JsonObject method35930(final String s, final boolean b) {
        return method35931(new StringReader(s), b);
    }
    
    public static JsonObject method35931(final Reader reader, final boolean b) {
        return method35922(Class9583.field41786, reader, JsonObject.class, b);
    }
    
    public static JsonObject method35932(final String s) {
        return method35930(s, false);
    }
    
    public static JsonObject method35933(final Reader reader) {
        return method35931(reader, false);
    }
    
    static {
        field41786 = new GsonBuilder().create();
    }
}
