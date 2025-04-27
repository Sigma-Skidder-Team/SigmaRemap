// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import totalcross.json.JSONArray;

import java.util.logging.Level;

public class Class1109 implements Runnable
{
    public final /* synthetic */ Object[] field5985;
    public final /* synthetic */ Class7874 field5986;
    
    public Class1109(final Class7874 field5986, final Object[] field5987) {
        this.field5986 = field5986;
        this.field5985 = field5987;
    }
    
    @Override
    public void run() {
        if (!this.field5986.field32319[0]) {
            this.field5986.field32319[0] = true;
            if (Class4960.method14969().isLoggable(Level.FINE)) {
                Class4960.method14969().fine(String.format("sending ack %s", (this.field5985.length == 0) ? null : this.field5985));
            }
            final JSONArray JSONArray = new JSONArray();
            final Object[] field5985 = this.field5985;
            for (int length = field5985.length, i = 0; i < length; ++i) {
                JSONArray.put(field5985[i]);
            }
            final Class9041 class89 = new Class9041(3, JSONArray);
            class89.field38264 = this.field5986.field32320;
            Class4960.method14972(this.field5986.field32321, class89);
        }
    }
}
