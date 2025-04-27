// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Class6904
{
    public static final String field27055 = "entity";
    public static final String field27056 = "texture";
    public static final String field27057 = "shadowSize";
    public static final String field27058 = "type";
    public static final String field27059 = "textureSize";
    public static final String field27060 = "usePlayerTexture";
    public static final String field27061 = "models";
    public static final String field27062 = "animations";
    public static final String field27063 = "id";
    public static final String field27064 = "baseId";
    public static final String field27065 = "model";
    public static final String field27066 = "type";
    public static final String field27067 = "part";
    public static final String field27068 = "attach";
    public static final String field27069 = "invertAxis";
    public static final String field27070 = "mirrorTexture";
    public static final String field27071 = "translate";
    public static final String field27072 = "rotate";
    public static final String field27073 = "scale";
    public static final String field27074 = "boxes";
    public static final String field27075 = "sprites";
    public static final String field27076 = "submodel";
    public static final String field27077 = "submodels";
    public static final String field27078 = "textureOffset";
    public static final String field27079 = "coordinates";
    public static final String field27080 = "sizeAdd";
    public static final String field27081 = "EntityModel";
    public static final String field27082 = "EntityModelPart";
    
    public static Class9208 method21251(final JsonObject jsonObject, final String s) {
        final Class8652 class8652 = new Class8652("CustomEntityModels");
        final String method29440 = class8652.method29440(s);
        final String method29441 = class8652.method29441(s);
        final String method29442 = Class7382.method22663(jsonObject, "texture");
        final int[] method29443 = Class7382.method22667(jsonObject.get("textureSize"), 2);
        final float method29444 = Class7382.method22661(jsonObject, "shadowSize", -1.0f);
        final JsonArray jsonArray = (JsonArray)jsonObject.get("models");
        method21258(jsonArray, "Missing models");
        final HashMap hashMap = new HashMap();
        final ArrayList list = new ArrayList();
        for (int i = 0; i < jsonArray.size(); ++i) {
            final JsonObject jsonObject2 = (JsonObject)jsonArray.get(i);
            method21252(jsonObject2, hashMap);
            method21253(jsonObject2, hashMap, method29441);
            method21256(jsonObject2, hashMap);
            final Class7856 method29445 = method21257(jsonObject2, method29443, method29441);
            if (method29445 != null) {
                list.add(method29445);
            }
        }
        final Class7856[] array = (Class7856[])list.toArray(new Class7856[list.size()]);
        ResourceLocation method29446 = null;
        if (method29442 != null) {
            method29446 = method21255(method29441, method29442, ".png");
        }
        return new Class9208(method29440, method29441, method29446, array, method29444);
    }
    
    private static void method21252(final JsonObject jsonObject, final Map map) {
        final String method22663 = Class7382.method22663(jsonObject, "baseId");
        if (method22663 != null) {
            final JsonObject jsonObject2 = map.get(method22663);
            if (jsonObject2 != null) {
                method21254(jsonObject2, jsonObject);
            }
            else {
                Config.warn("BaseID not found: " + method22663);
            }
        }
    }
    
    private static void method21253(final JsonObject jsonObject, final Map map, final String s) {
        final String method22663 = Class7382.method22663(jsonObject, "model");
        if (method22663 != null) {
            final ResourceLocation method22664 = method21255(s, method22663, ".jpm");
            try {
                final JsonObject method22665 = method21259(method22664);
                if (method22665 == null) {
                    Config.warn("Model not found: " + method22664);
                    return;
                }
                method21254(method22665, jsonObject);
            }
            catch (final IOException ex) {
                Config.method28850(ex.getClass().getName() + ": " + ex.getMessage());
            }
            catch (final JsonParseException ex2) {
                Config.method28850(ex2.getClass().getName() + ": " + ex2.getMessage());
            }
            catch (final Exception ex3) {
                ex3.printStackTrace();
            }
        }
    }
    
    private static void method21254(final JsonObject jsonObject, final JsonObject jsonObject2) {
        for (final Map.Entry<String, V> entry : jsonObject.entrySet()) {
            if (entry.getKey().equals("id")) {
                continue;
            }
            if (jsonObject2.has(entry.getKey())) {
                continue;
            }
            jsonObject2.add(entry.getKey(), (JsonElement)entry.getValue());
        }
    }
    
    public static ResourceLocation method21255(final String s, String s2, final String s3) {
        if (!s2.endsWith(s3)) {
            s2 += s3;
        }
        if (s2.contains("/")) {
            if (!s2.startsWith("./")) {
                if (s2.startsWith("~/")) {
                    s2 = "optifine/" + s2.substring(2);
                }
            }
            else {
                s2 = s + "/" + s2.substring(2);
            }
        }
        else {
            s2 = s + "/" + s2;
        }
        return new ResourceLocation(s2);
    }
    
    private static void method21256(final JsonObject jsonObject, final Map map) {
        final String method22663 = Class7382.method22663(jsonObject, "id");
        if (method22663 != null) {
            if (method22663.length() >= 1) {
                if (!map.containsKey(method22663)) {
                    map.put(method22663, jsonObject);
                }
                else {
                    Config.warn("Duplicate model ID: " + method22663);
                }
            }
            else {
                Config.warn("Empty model ID: " + method22663);
            }
        }
    }
    
    public static Class7856 method21257(final JsonObject jsonObject, final int[] array, final String s) {
        final String method22663 = Class7382.method22663(jsonObject, "part");
        method21258(method22663, "Model part not specified, missing \"replace\" or \"attachTo\".");
        final boolean method22664 = Class7382.method22662(jsonObject, "attach", false);
        final Class5916 class5916 = new Class5916(Class6332::method18770);
        if (array != null) {
            class5916.field24269 = array[0];
            class5916.field24270 = array[1];
        }
        Class8473 class5917 = null;
        final JsonArray jsonArray = (JsonArray)jsonObject.get("animations");
        if (jsonArray != null) {
            final ArrayList list = new ArrayList();
            for (int i = 0; i < jsonArray.size(); ++i) {
                for (final Map.Entry<String, V> entry : ((JsonObject)jsonArray.get(i)).entrySet()) {
                    list.add(new Class9241(entry.getKey(), ((JsonElement)entry.getValue()).getAsString()));
                }
            }
            if (list.size() > 0) {
                class5917 = new Class8473((Class9241[])list.toArray(new Class9241[list.size()]));
            }
        }
        return new Class7856(method22663, method22664, Class6514.method19609(jsonObject, class5916, array, s), class5917);
    }
    
    private static void method21258(final Object o, final String s) {
        if (o != null) {
            return;
        }
        throw new JsonParseException(s);
    }
    
    public static JsonObject method21259(final ResourceLocation class1932) throws IOException, JsonParseException {
        final InputStream method28897 = Config.method28897(class1932);
        if (method28897 != null) {
            final String method28898 = Config.method28960(method28897, "ASCII");
            method28897.close();
            return (JsonObject)new JsonParser().parse(method28898);
        }
        return null;
    }
}
