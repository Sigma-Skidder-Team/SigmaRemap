// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import totalcross.json.JSONObject;

import java.net.URISyntaxException;
import java.net.URI;
import java.util.HashMap;

public class Class959 extends Class956
{
    private Class5837 field5102;
    
    public Class959(final Class5837 field5102, final String str, final HashMap<String, String> hashMap) throws URISyntaxException {
        super(new URI(str), hashMap);
        this.field5102 = field5102;
    }
    
    @Override
    public void method5480(final Class6089 class6089) {
        this.field5102.method17550();
    }
    
    @Override
    public void method5481(final String s) {
        final JSONObject JSONObject = new JSONObject(s);
        if (JSONObject.has("action")) {
            switch (JSONObject.getInt("action")) {
                case 1: {
                    this.field5102.method17552(Class7679.method24379(String.valueOf(JSONObject.getBoolean("variation"))));
                    break;
                }
                case 2: {
                    this.field5102.method17553();
                    break;
                }
            }
        }
    }
    
    @Override
    public void method5482(final int n, final String s, final boolean b) {
        this.field5102.method17551();
    }
    
    @Override
    public void method5483(final Exception ex) {
        ex.printStackTrace();
        this.field5102.method17551();
    }
}
