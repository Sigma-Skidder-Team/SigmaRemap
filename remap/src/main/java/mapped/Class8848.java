// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Calendar;
import java.util.Date;

public class Class8848
{
    private String field37203;
    private Date field37204;
    
    public Class8848(final String field37203, final Date field37204) {
        this.field37203 = field37203;
        this.field37204 = field37204;
    }
    
    public Class8848(final Class4405 class4405) {
        final Calendar instance = Calendar.getInstance();
        long timeInMillis;
        if (!(class4405.method13257("until") instanceof Integer)) {
            timeInMillis = (long)class4405.method13257("until");
        }
        else {
            timeInMillis = (long)class4405.method13257("until");
        }
        if (timeInMillis == 1L) {
            timeInMillis = 9223372036854775806L;
        }
        instance.setTimeInMillis(timeInMillis);
        this.field37203 = class4405.method13268("server");
        this.field37204 = instance.getTime();
    }
    
    public Class4405 method30979() {
        final Class4405 class4405 = new Class4405();
        class4405.method13301("server", this.field37203);
        class4405.method13299("until", this.field37204.getTime());
        return class4405;
    }
    
    public String method30980() {
        return this.field37203;
    }
    
    public Date method30981() {
        return this.field37204;
    }
    
    public Class9575 method30982() {
        final Class9295 class9295 = new Class9295(Class869.method5277());
        class9295.method34331();
        for (int method34336 = class9295.method34336(), i = 0; i < method34336; ++i) {
            final Class9575 method34337 = class9295.method34333(i);
            if (method34337.field41613.equals(this.field37203)) {
                return method34337;
            }
        }
        return null;
    }
}
