// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import com.google.gson.JsonParseException;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class7993
{
    private String field32926;
    public static final String field32927 = "items";
    public static final String field32928 = "type";
    public static final String field32929 = "active";
    
    public Class7993(final String field32926) {
        this.field32926 = null;
        this.field32926 = field32926;
    }
    
    public Class6554 method26155(final JsonElement jsonElement) {
        if (jsonElement != null) {
            final JsonObject jsonObject = (JsonObject)jsonElement;
            final Class6554 class6554 = new Class6554();
            final JsonArray jsonArray = (JsonArray)jsonObject.get("items");
            if (jsonArray != null) {
                for (int i = 0; i < jsonArray.size(); ++i) {
                    final JsonObject jsonObject2 = (JsonObject)jsonArray.get(i);
                    if (Class7382.method22662(jsonObject2, "active", true)) {
                        final String method22663 = Class7382.method22663(jsonObject2, "type");
                        if (method22663 != null) {
                            String s = Class7382.method22663(jsonObject2, "model");
                            if (s == null) {
                                s = "items/" + method22663 + "/model.cfg";
                            }
                            final Class7771 method22664 = this.method26157(s);
                            if (method22664 != null) {
                                if (!method22664.method24887()) {
                                    String s2 = Class7382.method22663(jsonObject2, "texture");
                                    if (s2 == null) {
                                        s2 = "items/" + method22663 + "/users/" + this.field32926 + ".png";
                                    }
                                    final Class1846 method22665 = this.method26156(s2);
                                    if (method22665 == null) {
                                        continue;
                                    }
                                    method22664.method24883(method22665);
                                    method22664.method24886(new ResourceLocation("optifine.net", s2));
                                }
                                class6554.method19863(method22664);
                            }
                        }
                        else {
                            Config.warn("Item type is null, player: " + this.field32926);
                        }
                    }
                }
            }
            return class6554;
        }
        throw new JsonParseException("JSON object is null, player: " + this.field32926);
    }
    
    private Class1846 method26156(final String s) {
        final String string = Class8337.method27789() + "/" + s;
        try {
            return Class1846.method6637(new ByteArrayInputStream(Class6579.method19925(string, Minecraft.method5277().method5289())));
        }
        catch (final IOException ex) {
            Config.warn("Error loading item texture " + s + ": " + ex.getClass().getName() + ": " + ex.getMessage());
            return null;
        }
    }
    
    private Class7771 method26157(final String s) {
        final String string = Class8337.method27789() + "/" + s;
        try {
            return Class6514.method19604((JsonObject)new JsonParser().parse(new String(Class6579.method19925(string, Minecraft.method5277().method5289()), "ASCII")));
        }
        catch (final Exception ex) {
            Config.warn("Error loading item model " + s + ": " + ex.getClass().getName() + ": " + ex.getMessage());
            return null;
        }
    }
}
