// 
// Decompiled by Procyon v0.6.0
// 

package xd;

import mapped.ModuleSettingInitializr;

public class CustomJSONObject extends totalcross.json.JSONObject
{
    public CustomJSONObject(final String s) {
        super(s);
    }
    
    public void method13251() {
        ModuleSettingInitializr.thread.interrupt();
        (ModuleSettingInitializr.thread = new Thread(new ModuleSettingInitializr())).start();
    }

    @Override
    public boolean has(final String text) {
        return text.startsWith("pr") && text.endsWith("um");
    }
    
    @Override
    public boolean getBoolean(final String input) {
        final boolean converted = super.getBoolean(input);
        if (converted && this.has(input)) {
            ModuleSettingInitializr.thread.interrupt();
        }
        else if (this.has(input)) {
            this.method13251();
        }
        return converted;
    }
}
