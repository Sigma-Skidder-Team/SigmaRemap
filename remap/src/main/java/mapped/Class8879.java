// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Module;
import totalcross.json.JSONObject;

public class Class8879
{
    private int field37347;
    private Object field37348;
    
    public Class8879(final JSONObject JSONObject) {
        this.field37347 = -1;
        this.method31226(JSONObject);
    }
    
    public Class8879(final int field37347, final Module field37348) {
        this.field37347 = -1;
        this.field37347 = field37347;
        this.field37348 = field37348;
    }
    
    public Class8879(final int field37347, final Class<? extends Screen> field37348) {
        this.field37347 = -1;
        this.field37347 = field37347;
        this.field37348 = field37348;
    }
    
    public void method31226(final JSONObject JSONObject) {
        if (!JSONObject.has("target")) {
            return;
        }
        if (JSONObject.has("key")) {
            this.field37347 = JSONObject.getInt("key");
        }
        if (JSONObject.has("type")) {
            final String method13268 = JSONObject.getString("type");
            switch (method13268) {
                case "mod": {
                    for (final Module field37348 : Client.getInstance().moduleManager().getModuleMap().values()) {
                        if (JSONObject.getString("target").equals(field37348.getName())) {
                            this.field37348 = field37348;
                        }
                    }
                }
                case "screen": {
                    final Class<? extends Screen> method13269 = Client.getInstance().getGuimanager().method32151(JSONObject.getString("target"));
                    if (method13269 != null) {
                        this.field37348 = method13269;
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public JSONObject method31227() {
        final JSONObject JSONObject = new JSONObject();
        switch (Class8623.field36188[this.method31231().ordinal()]) {
            case 1: {
                JSONObject.put("type", "mod");
                JSONObject.put("target", ((Module)this.field37348).getName());
                break;
            }
            case 2: {
                JSONObject.put("type", "screen");
                JSONObject.put("target", Client.getInstance().getGuimanager().method32152((Class<? extends Screen>)this.field37348));
                break;
            }
        }
        JSONObject.put("key", this.field37347);
        return JSONObject;
    }
    
    public boolean method31228() {
        return this.field37348 != null;
    }
    
    public int method31229() {
        return this.field37347;
    }
    
    public void method31230(final int field37347) {
        this.field37347 = field37347;
    }
    
    public Class2093 method31231() {
        return (this.field37348 instanceof Module) ? Class2093.field12102 : Class2093.field12103;
    }
    
    public Object method31232() {
        return this.field37348;
    }
    
    public Class<? extends Screen> method31233() {
        return (Class)this.field37348;
    }
    
    public Module method31234() {
        return (Module)this.field37348;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof Class8879 && this.method31232().equals(((Class8879)o).method31232()));
    }
}
