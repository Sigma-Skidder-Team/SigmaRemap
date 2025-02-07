// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;

public class Class8241
{
    private JSONObject field33837;
    public JSONObject field33838;
    public String field33839;
    
    public Class8241() {
    }
    
    public Class8241(final String field33839, final JSONObject field33840) {
        this.field33839 = field33839;
        this.field33838 = field33840;
    }
    
    public Class8241(final String field33839, final Class8241 class8241) {
        this.field33839 = field33839;
        this.field33838 = class8241.field33838;
    }
    
    public Class8241 method27288(final JSONObject JSONObject) throws org.json.JSONException {
        this.field33838 = JSONObject.method13264("modConfig");
        this.field33839 = JSONObject.getString("name");
        return this;
    }
    
    public JSONObject method27289(final JSONObject JSONObject) {
        JSONObject.put("modConfig", this.field33838);
        JSONObject.put("name", this.field33839);
        return JSONObject;
    }
    
    public JSONObject method27290() {
        return this.field33837;
    }
    
    public Class8241 method27291(final String s) {
        return new Class8241(s, this.field33838);
    }
    
    public void method27292() {
        JSONArray method26638 = null;
        try {
            method26638 = CJsonUtils.getJSONArrayOrNull(this.field33838, "mods");
        }
        catch (final JSONException JSONException) {}
        if (method26638 != null) {
            for (int i = 0; i < method26638.length(); ++i) {
                final JSONObject method26639 = method26638.getJSONObject(i);
                Object method26640 = null;
                try {
                    method26640 = CJsonUtils.method26636(method26639, "name", null);
                }
                catch (final JSONException class2382) {
                    Client.getInstance().getLogger().warn("Invalid name in mod list config");
                }
                for (final Module class2383 : Client.getInstance().method35189().getModuleMap().values()) {
                    if (class2383.getName().equals(method26640) && class2383.getCategoryBasedOnMode() != Category.GUI && class2383.getCategoryBasedOnMode() != Category.RENDER) {
                        method26639.put("enabled", "false");
                    }
                }
            }
        }
    }
    
    public void method27293(final JSONObject JSONObject, final Module class4406) {
        JSONArray method26638 = null;
        try {
            method26638 = CJsonUtils.getJSONArrayOrNull(this.field33838, "mods");
        }
        catch (final JSONException class4407) {}
        boolean b = false;
        if (method26638 != null) {
            for (int i = 0; i < method26638.length(); ++i) {
                final JSONObject method26639 = method26638.getJSONObject(i);
                Object method26640 = null;
                try {
                    method26640 = CJsonUtils.method26636(method26639, "name", null);
                }
                catch (final JSONException class4408) {
                    Client.getInstance().getLogger().warn("Invalid name in mod list config");
                }
                if (class4406.getName().equals(method26640)) {
                    if (class4406.getCategoryBasedOnMode() != Category.GUI && class4406.getCategoryBasedOnMode() != Category.RENDER) {
                        method26638.method493(i, JSONObject);
                    }
                    b = true;
                }
            }
        }
        if (!b) {
            method26638.method486(JSONObject);
        }
    }
    
    public JSONObject method27294(final Module class3167) {
        JSONArray method26638 = null;
        try {
            method26638 = CJsonUtils.getJSONArrayOrNull(this.field33838, "mods");
        }
        catch (final JSONException class3168) {}
        if (method26638 != null) {
            for (int i = 0; i < method26638.length(); ++i) {
                final JSONObject method26639 = method26638.getJSONObject(i);
                Object method26640 = null;
                try {
                    method26640 = CJsonUtils.method26636(method26639, "name", null);
                }
                catch (final JSONException class3169) {
                    Client.getInstance().getLogger().warn("Invalid name in mod list config");
                }
                if (class3167.getName().equals(method26640)) {
                    return method26639;
                }
            }
        }
        return null;
    }
}
