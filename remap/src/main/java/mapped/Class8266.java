// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public final class Class8266
{
    private static String[] field33940;
    private final Class7096 field33941;
    private final Class7096 field33942;
    private final Direction field33943;
    
    public Class8266(final Class7096 field33941, final Class7096 field33942, final Direction field33943) {
        this.field33941 = field33941;
        this.field33942 = field33942;
        this.field33943 = field33943;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class8266) {
            final Class8266 class8266 = (Class8266)o;
            if (this.field33941 == class8266.field33941) {
                if (this.field33942 == class8266.field33942) {
                    if (this.field33943 == class8266.field33943) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * this.field33941.hashCode() + this.field33942.hashCode()) + this.field33943.hashCode();
    }
}
