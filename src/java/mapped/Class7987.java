// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.json.JSONException;

public class Class7987
{
    public String field32879;
    public String[] field32880;
    public long field32881;
    public long field32882;
    
    public Class7987(final String s) throws JSONException {
        this(new Class4405(s));
    }
    
    public Class7987(final Class4405 class4405) throws JSONException {
        final Class88 method13263 = class4405.method13263("upgrades");
        final int method13264 = method13263.method462();
        final String[] field32880 = new String[method13264];
        for (int i = 0; i < method13264; ++i) {
            field32880[i] = method13263.method459(i);
        }
        this.field32879 = class4405.method13268("sid");
        this.field32880 = field32880;
        this.field32881 = class4405.method13265("pingInterval");
        this.field32882 = class4405.method13265("pingTimeout");
    }
}
