// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class952 implements Runnable
{
    public final /* synthetic */ String field5039;
    public final /* synthetic */ Object[] field5040;
    public final /* synthetic */ Class7873 field5041;
    public final /* synthetic */ Class4960 field5042;
    
    public Class952(final Class4960 field5042, final String field5043, final Object[] field5044, final Class7873 field5045) {
        this.field5042 = field5042;
        this.field5039 = field5043;
        this.field5040 = field5044;
        this.field5041 = field5045;
    }
    
    @Override
    public void run() {
        final JSONArray JSONArray = new JSONArray();
        JSONArray.method486(this.field5039);
        if (this.field5040 != null) {
            final Object[] field5040 = this.field5040;
            for (int length = field5040.length, i = 0; i < length; ++i) {
                JSONArray.method486(field5040[i]);
            }
        }
        final Class9041 class89 = new Class9041(2, JSONArray);
        if (this.field5041 != null) {
            Class4960.method14969().fine(String.format("emitting packet with ack id %d", Class4960.method14968(this.field5042)));
            Class4960.method14970(this.field5042).put(Class4960.method14968(this.field5042), this.field5041);
            class89.field38264 = Class4960.method14971(this.field5042);
        }
        if (!Class4960.method14964(this.field5042)) {
            Class4960.method14973(this.field5042).add(class89);
        }
        else {
            Class4960.method14972(this.field5042, class89);
        }
    }
}
