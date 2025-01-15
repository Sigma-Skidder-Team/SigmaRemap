// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;

public class Class7435 extends Class7422
{
    public String field28669;
    public long field28670;
    public long field28671;
    
    public static Class7435 method22869(final JsonObject jsonObject) {
        final Class7435 class7435 = new Class7435();
        try {
            class7435.field28669 = Class7610.method23907("profileUuid", jsonObject, null);
            class7435.field28670 = Class7610.method23909("joinTime", jsonObject, Long.MIN_VALUE);
            class7435.field28671 = Class7610.method23909("leaveTime", jsonObject, Long.MIN_VALUE);
        }
        catch (final Exception ex) {}
        return class7435;
    }
}
