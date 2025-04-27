// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import totalcross.json.JSONObject;

public class EventWriter implements IEvent
{
    private static String[] field23301;
    private final JSONObject field23302;
    
    public EventWriter(final JSONObject field23302) {
        this.field23302 = field23302;
    }
    
    public JSONObject method17022() {
        return this.field23302;
    }
}
