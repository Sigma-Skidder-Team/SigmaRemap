// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Module;
import totalcross.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;

public class Class8784
{
    public static List<String> field36931;
    public Class9464 field36932;
    
    public Class8784(final Class9464 field36932) {
        this.field36932 = field36932;
        new Thread(() -> {
            if (Class8784.field36931 == null) {
                Class8784.field36931 = this.method30567();
            }
            class9464.method35213(Class8784.field36931);
        }).start();
    }
    
    public List<String> method30567() {
        return Collections.EMPTY_LIST;
    }
    
    public String method30568(final String s) {
        try {
            return URLEncoder.encode(s, "UTF-8");
        }
        catch (final UnsupportedEncodingException ex) {
            return s;
        }
    }
    
    public JSONObject method30569(final String string1) {
        System.out.println("Changelog");
        return new JSONObject();
    }
    
    public Class8241 method30570(final Class8241 class8241, final String string1) {
        final Class8241 class8242 = new Class8241(string1, class8241);
        class8242.method27292();
        final Class8241 class8243 = new Class8241("settings", this.method30569(string1).getJSONObject("modConfig"));
        for (final Module class8244 : Client.getInstance().moduleManager().getModuleMap().values()) {
            final JSONObject method27294 = class8243.method27294(class8244);
            if (method27294 == null) {
                continue;
            }
            class8242.method27293(method27294, class8244);
        }
        return class8242;
    }
}
