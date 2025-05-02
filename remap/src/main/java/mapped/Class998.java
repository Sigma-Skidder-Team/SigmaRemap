// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

public class Class998 implements Runnable
{
    public final /* synthetic */ JSONArray field5328;
    public final /* synthetic */ Class4812 field5329;
    
    public Class998(final Class4812 field5329, final JSONArray field5330) {
        this.field5329 = field5329;
        this.field5328 = field5330;
    }
    
    @Override
    public void run() {
        int n = 75;
        for (int i = 0; i < this.field5328.length(); ++i) {
            final JSONObject method457 = this.field5328.getJSONObject(i);
            if (method457.has("url")) {
                Util.getOS().method980(method457.getString("url"));
            }
            final Class4805 class4805;
            this.field5329.field20582.method14396().method14242(class4805 = new Class4805(this.field5329.field20582, "changelog" + i, method457));
            class4805.method14275(n);
            n += class4805.method14278();
        }
    }
}
