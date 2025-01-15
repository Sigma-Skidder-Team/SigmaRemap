// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Class7382
{
    public static float method22661(final JsonObject jsonObject, final String s, final float n) {
        final JsonElement value = jsonObject.get(s);
        return (value != null) ? value.getAsFloat() : n;
    }
    
    public static boolean method22662(final JsonObject jsonObject, final String s, final boolean b) {
        final JsonElement value = jsonObject.get(s);
        return (value != null) ? value.getAsBoolean() : b;
    }
    
    public static String method22663(final JsonObject jsonObject, final String s) {
        return method22664(jsonObject, s, null);
    }
    
    public static String method22664(final JsonObject jsonObject, final String s, final String s2) {
        final JsonElement value = jsonObject.get(s);
        return (value != null) ? value.getAsString() : s2;
    }
    
    public static float[] method22665(final JsonElement jsonElement, final int n) {
        return method22666(jsonElement, n, null);
    }
    
    public static float[] method22666(final JsonElement jsonElement, final int i, final float[] array) {
        if (jsonElement == null) {
            return array;
        }
        final JsonArray asJsonArray = jsonElement.getAsJsonArray();
        if (asJsonArray.size() == i) {
            final float[] array2 = new float[asJsonArray.size()];
            for (int j = 0; j < array2.length; ++j) {
                array2[j] = asJsonArray.get(j).getAsFloat();
            }
            return array2;
        }
        throw new JsonParseException("Wrong array length: " + asJsonArray.size() + ", should be: " + i + ", array: " + asJsonArray);
    }
    
    public static int[] method22667(final JsonElement jsonElement, final int n) {
        return method22668(jsonElement, n, null);
    }
    
    public static int[] method22668(final JsonElement jsonElement, final int i, final int[] array) {
        if (jsonElement == null) {
            return array;
        }
        final JsonArray asJsonArray = jsonElement.getAsJsonArray();
        if (asJsonArray.size() == i) {
            final int[] array2 = new int[asJsonArray.size()];
            for (int j = 0; j < array2.length; ++j) {
                array2[j] = asJsonArray.get(j).getAsInt();
            }
            return array2;
        }
        throw new JsonParseException("Wrong array length: " + asJsonArray.size() + ", should be: " + i + ", array: " + asJsonArray);
    }
}
