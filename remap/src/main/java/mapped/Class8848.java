// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import totalcross.json.JSONObject;

import java.util.Calendar;
import java.util.Date;

public class Class8848
{
    private final String field37203;
    private final Date field37204;
    
    public Class8848(final String field37203, final Date field37204) {
        this.field37203 = field37203;
        this.field37204 = field37204;
    }
    
    public Class8848(final JSONObject JSONObject) {
        final Calendar instance = Calendar.getInstance();
        long timeInMillis;
        if (!(JSONObject.get("until") instanceof Integer)) {
            timeInMillis = (long) JSONObject.get("until");
        }
        else {
            timeInMillis = (long) JSONObject.get("until");
        }
        if (timeInMillis == 1L) {
            timeInMillis = 9223372036854775806L;
        }
        instance.setTimeInMillis(timeInMillis);
        this.field37203 = JSONObject.getString("server");
        this.field37204 = instance.getTime();
    }
    
    public JSONObject method30979() {
        final JSONObject JSONObject = new JSONObject();
        JSONObject.put("server", this.field37203);
        JSONObject.put("until", this.field37204.getTime());
        return JSONObject;
    }
    
    public String method30980() {
        return this.field37203;
    }
    
    public Date method30981() {
        return this.field37204;
    }
    
    public ServerData method30982() {
        final Class9295 class9295 = new Class9295(Minecraft.getInstance());
        class9295.method34331();
        for (int method34336 = class9295.method34336(), i = 0; i < method34336; ++i) {
            final ServerData method34337 = class9295.method34333(i);
            if (method34337.field41613.equals(this.field37203)) {
                return method34337;
            }
        }
        return null;
    }
}
