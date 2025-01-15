// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class123 implements Class122
{
    private static String[] field380;
    private final Long field381;
    private final Class5772 field382;
    
    private Class123(final Long field381, final Class5772 field382) {
        this.field381 = field381;
        this.field382 = field382;
    }
    
    @Override
    public boolean test(final Class7529 class7529) {
        long method6755 = class7529.method23588().method6755();
        if (this.field381 != null) {
            method6755 %= this.field381;
        }
        return this.field382.method17170((int)method6755);
    }
}
