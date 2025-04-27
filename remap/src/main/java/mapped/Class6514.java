// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonParseException;
import com.google.gson.JsonElement;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import com.google.gson.JsonArray;
import java.awt.Dimension;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraft.util.math.MathHelper;

public class Class6514
{
    private static JsonParser field25891;
    public static final String field25892 = "type";
    public static final String field25893 = "textureSize";
    public static final String field25894 = "usePlayerTexture";
    public static final String field25895 = "models";
    public static final String field25896 = "id";
    public static final String field25897 = "baseId";
    public static final String field25898 = "type";
    public static final String field25899 = "texture";
    public static final String field25900 = "textureSize";
    public static final String field25901 = "attachTo";
    public static final String field25902 = "invertAxis";
    public static final String field25903 = "mirrorTexture";
    public static final String field25904 = "translate";
    public static final String field25905 = "rotate";
    public static final String field25906 = "scale";
    public static final String field25907 = "boxes";
    public static final String field25908 = "sprites";
    public static final String field25909 = "submodel";
    public static final String field25910 = "submodels";
    public static final String field25911 = "textureOffset";
    public static final String field25912 = "coordinates";
    public static final String field25913 = "sizeAdd";
    public static final String field25914 = "uvDown";
    public static final String field25915 = "uvUp";
    public static final String field25916 = "uvNorth";
    public static final String field25917 = "uvSouth";
    public static final String field25918 = "uvWest";
    public static final String field25919 = "uvEast";
    public static final String field25920 = "uvFront";
    public static final String field25921 = "uvBack";
    public static final String field25922 = "uvLeft";
    public static final String field25923 = "uvRight";
    public static final String field25924 = "PlayerItem";
    public static final String field25925 = "ModelBox";
    
    private Class6514() {
    }
    
    public static Class7771 method19604(final JsonObject jsonObject) {
        final String method22663 = Class7382.method22663(jsonObject, "type");
        if (Config.equals(method22663, "PlayerItem")) {
            final int[] method22664 = Class7382.method22667(jsonObject.get("textureSize"), 2);
            method19605(method22664, "Missing texture size");
            final Dimension dimension = new Dimension(method22664[0], method22664[1]);
            final boolean method22665 = Class7382.method22662(jsonObject, "usePlayerTexture", false);
            final JsonArray jsonArray = (JsonArray)jsonObject.get("models");
            method19605(jsonArray, "Missing elements");
            final HashMap hashMap = new HashMap();
            final ArrayList list = new ArrayList();
            new ArrayList();
            for (int i = 0; i < jsonArray.size(); ++i) {
                final JsonObject jsonObject2 = (JsonObject)jsonArray.get(i);
                final String method22666 = Class7382.method22663(jsonObject2, "baseId");
                if (method22666 != null) {
                    final JsonObject jsonObject3 = (JsonObject)hashMap.get(method22666);
                    if (jsonObject3 == null) {
                        Config.warn("BaseID not found: " + method22666);
                        continue;
                    }
                    for (final Map.Entry<String, V> entry : jsonObject3.entrySet()) {
                        if (jsonObject2.has(entry.getKey())) {
                            continue;
                        }
                        jsonObject2.add(entry.getKey(), (JsonElement)entry.getValue());
                    }
                }
                final String method22667 = Class7382.method22663(jsonObject2, "id");
                if (method22667 != null) {
                    if (hashMap.containsKey(method22667)) {
                        Config.warn("Duplicate model ID: " + method22667);
                    }
                    else {
                        hashMap.put(method22667, jsonObject2);
                    }
                }
                final Class8882 method22668 = method19608(jsonObject2, dimension);
                if (method22668 != null) {
                    list.add(method22668);
                }
            }
            return new Class7771(dimension, method22665, (Class8882[])list.toArray(new Class8882[list.size()]));
        }
        throw new JsonParseException("Unknown model type: " + method22663);
    }
    
    private static void method19605(final Object o, final String s) {
        if (o != null) {
            return;
        }
        throw new JsonParseException(s);
    }
    
    private static ResourceLocation method19606(final String s) {
        final int index = s.indexOf(58);
        if (index >= 0) {
            return new ResourceLocation(s.substring(0, index), s.substring(index + 1));
        }
        return new ResourceLocation(s);
    }
    
    private static int method19607(final String str) {
        if (str == null) {
            return 0;
        }
        if (str.equals("body")) {
            return 0;
        }
        if (str.equals("head")) {
            return 1;
        }
        if (str.equals("leftArm")) {
            return 2;
        }
        if (str.equals("rightArm")) {
            return 3;
        }
        if (str.equals("leftLeg")) {
            return 4;
        }
        if (str.equals("rightLeg")) {
            return 5;
        }
        if (!str.equals("cape")) {
            Config.warn("Unknown attachModel: " + str);
            return 0;
        }
        return 6;
    }
    
    public static Class8882 method19608(final JsonObject jsonObject, final Dimension dimension) {
        final String method22663 = Class7382.method22663(jsonObject, "type");
        if (Config.equals(method22663, "ModelBox")) {
            final int method22664 = method19607(Class7382.method22663(jsonObject, "attachTo"));
            final Class5903 class5903 = new Class5903(Class6332::method18770);
            class5903.field24269 = dimension.width;
            class5903.field24270 = dimension.height;
            return new Class8882(method22664, method19609(jsonObject, class5903, null, null));
        }
        Config.warn("Unknown model type: " + method22663);
        return null;
    }
    
    public static Class6300 method19609(final JsonObject jsonObject, final Class5901 class5901, final int[] array, final String s) {
        final Class6300 class5902 = new Class6300(class5901);
        class5902.method18653(Class7382.method22663(jsonObject, "id"));
        final float method22661 = Class7382.method22661(jsonObject, "scale", 1.0f);
        class5902.field25192 = method22661;
        class5902.field25193 = method22661;
        class5902.field25194 = method22661;
        final String method22662 = Class7382.method22663(jsonObject, "texture");
        if (method22662 != null) {
            class5902.method18651(Class6904.method21255(s, method22662, ".png"));
        }
        int[] method22663 = Class7382.method22667(jsonObject.get("textureSize"), 2);
        if (method22663 == null) {
            method22663 = array;
        }
        if (method22663 != null) {
            class5902.method18647(method22663[0], method22663[1]);
        }
        final String lowerCase = Class7382.method22664(jsonObject, "invertAxis", "").toLowerCase();
        final boolean contains = lowerCase.contains("x");
        final boolean contains2 = lowerCase.contains("y");
        final boolean contains3 = lowerCase.contains("z");
        final float[] method22664 = Class7382.method22666(jsonObject.get("translate"), 3, new float[3]);
        if (contains) {
            method22664[0] = -method22664[0];
        }
        if (contains2) {
            method22664[1] = -method22664[1];
        }
        if (contains3) {
            method22664[2] = -method22664[2];
        }
        final float[] method22665 = Class7382.method22666(jsonObject.get("rotate"), 3, new float[3]);
        for (int i = 0; i < method22665.length; ++i) {
            method22665[i] = method22665[i] / 180.0f * MathHelper.field41099;
        }
        if (contains) {
            method22665[0] = -method22665[0];
        }
        if (contains2) {
            method22665[1] = -method22665[1];
        }
        if (contains3) {
            method22665[2] = -method22665[2];
        }
        class5902.method18642(method22664[0], method22664[1], method22664[2]);
        class5902.field25183 = method22665[0];
        class5902.field25184 = method22665[1];
        class5902.field25185 = method22665[2];
        final String lowerCase2 = Class7382.method22664(jsonObject, "mirrorTexture", "").toLowerCase();
        final boolean contains4 = lowerCase2.contains("u");
        final boolean contains5 = lowerCase2.contains("v");
        if (contains4) {
            class5902.field25186 = true;
        }
        if (contains5) {
            class5902.field25191 = true;
        }
        final JsonArray asJsonArray = jsonObject.getAsJsonArray("boxes");
        if (asJsonArray != null) {
            for (int j = 0; j < asJsonArray.size(); ++j) {
                final JsonObject asJsonObject = asJsonArray.get(j).getAsJsonObject();
                final int[] method22666 = Class7382.method22667(asJsonObject.get("textureOffset"), 2);
                final int[][] method22667 = method19610(asJsonObject);
                if (method22666 == null && method22667 == null) {
                    throw new JsonParseException("Texture offset not specified");
                }
                final float[] method22668 = Class7382.method22665(asJsonObject.get("coordinates"), 6);
                if (method22668 == null) {
                    throw new JsonParseException("Coordinates not specified");
                }
                if (contains) {
                    method22668[0] = -method22668[0] - method22668[3];
                }
                if (contains2) {
                    method22668[1] = -method22668[1] - method22668[4];
                }
                if (contains3) {
                    method22668[2] = -method22668[2] - method22668[5];
                }
                final float method22669 = Class7382.method22661(asJsonObject, "sizeAdd", 0.0f);
                if (method22667 == null) {
                    class5902.method18634(method22666[0], method22666[1]);
                    class5902.method18638(method22668[0], method22668[1], method22668[2], (float)(int)method22668[3], (float)(int)method22668[4], (float)(int)method22668[5], method22669);
                }
                else {
                    class5902.method18654(method22667, method22668[0], method22668[1], method22668[2], method22668[3], method22668[4], method22668[5], method22669);
                }
            }
        }
        final JsonArray asJsonArray2 = jsonObject.getAsJsonArray("sprites");
        if (asJsonArray2 != null) {
            for (int k = 0; k < asJsonArray2.size(); ++k) {
                final JsonObject asJsonObject2 = asJsonArray2.get(k).getAsJsonObject();
                final int[] method22670 = Class7382.method22667(asJsonObject2.get("textureOffset"), 2);
                if (method22670 == null) {
                    throw new JsonParseException("Texture offset not specified");
                }
                final float[] method22671 = Class7382.method22665(asJsonObject2.get("coordinates"), 6);
                if (method22671 == null) {
                    throw new JsonParseException("Coordinates not specified");
                }
                if (contains) {
                    method22671[0] = -method22671[0] - method22671[3];
                }
                if (contains2) {
                    method22671[1] = -method22671[1] - method22671[4];
                }
                if (contains3) {
                    method22671[2] = -method22671[2] - method22671[5];
                }
                final float method22672 = Class7382.method22661(asJsonObject2, "sizeAdd", 0.0f);
                class5902.method18634(method22670[0], method22670[1]);
                class5902.method18649(method22671[0], method22671[1], method22671[2], (int)method22671[3], (int)method22671[4], (int)method22671[5], method22672);
            }
        }
        final JsonObject jsonObject2 = (JsonObject)jsonObject.get("submodel");
        if (jsonObject2 != null) {
            class5902.method18633(method19609(jsonObject2, class5901, method22663, s));
        }
        final JsonArray jsonArray = (JsonArray)jsonObject.get("submodels");
        if (jsonArray != null) {
            for (int l = 0; l < jsonArray.size(); ++l) {
                final Class6300 method22673 = method19609((JsonObject)jsonArray.get(l), class5901, method22663, s);
                if (method22673.method18652() != null) {
                    if (class5902.method18656(method22673.method18652()) != null) {
                        Config.warn("Duplicate model ID: " + method22673.method18652());
                    }
                }
                class5902.method18633(method22673);
            }
        }
        return class5902;
    }
    
    private static int[][] method19610(final JsonObject jsonObject) {
        final int[][] array = { Class7382.method22667(jsonObject.get("uvDown"), 4), Class7382.method22667(jsonObject.get("uvUp"), 4), Class7382.method22667(jsonObject.get("uvNorth"), 4), Class7382.method22667(jsonObject.get("uvSouth"), 4), Class7382.method22667(jsonObject.get("uvWest"), 4), Class7382.method22667(jsonObject.get("uvEast"), 4) };
        if (array[2] == null) {
            array[2] = Class7382.method22667(jsonObject.get("uvFront"), 4);
        }
        if (array[3] == null) {
            array[3] = Class7382.method22667(jsonObject.get("uvBack"), 4);
        }
        if (array[4] == null) {
            array[4] = Class7382.method22667(jsonObject.get("uvLeft"), 4);
        }
        if (array[5] == null) {
            array[5] = Class7382.method22667(jsonObject.get("uvRight"), 4);
        }
        boolean b = false;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] != null) {
                b = true;
                break;
            }
        }
        return b ? array : null;
    }
    
    static {
        Class6514.field25891 = new JsonParser();
    }
}
