// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import totalcross.json.JSONObject;

public class Class4660 implements Class4659
{
    public final /* synthetic */ IRCManager field20166;
    
    public Class4660(final IRCManager field20166) {
        this.field20166 = field20166;
    }
    
    @Override
    public void method13945(final Object... array) {
        final JSONObject JSONObject = (JSONObject)array[0];
        if (JSONObject.has("messageId")) {
            final JSONObject class4406 = new JSONObject();
            class4406.put("messageId", JSONObject.getString("messageId"));
            IRCManager.method33666(this.field20166).method14942("message-received", class4406);
            this.field20166.field38990.method33644(JSONObject.getString("senderId"), JSONObject.getString("message"), JSONObject.getLong("timestamp"));
        }
    }
}
