// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;

public final class Class7500 extends Class7501<Class7500>
{
    private static String[] field29070;
    private final int field29071;
    private final Long2IntOpenHashMap field29072;
    
    public Class7500(final Long2ObjectOpenHashMap<Class7281> long2ObjectOpenHashMap, final Long2IntOpenHashMap field29072, final int field29073) {
        super(long2ObjectOpenHashMap);
        (this.field29072 = field29072).defaultReturnValue(field29073);
        this.field29071 = field29073;
    }
    
    public Class7500 method23389() {
        return new Class7500(this.field29076.clone(), this.field29072.clone(), this.field29071);
    }
}
