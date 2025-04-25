// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.json.JSONException;
import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

public class Class7987
{
    public String field32879;
    public String[] field32880;
    public long field32881;
    public long field32882;
    
    public Class7987(final String s) throws JSONException {
        this(new JSONObject(s));
    }
    
    public Class7987(final JSONObject JSONObject) throws JSONException {
        final JSONArray method13263 = JSONObject.getJSONArray("upgrades");
        final int method13264 = method13263.length();
        final String[] field32880 = new String[method13264];
        for (int i = 0; i < method13264; ++i) {
            field32880[i] = method13263.getString(i);
        }
        this.field32879 = JSONObject.getString("sid");
        this.field32880 = field32880;
        this.field32881 = JSONObject.getLong("pingInterval");
        this.field32882 = JSONObject.getLong("pingTimeout");
    }
}
