// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import com.google.common.collect.ImmutableSet;

public class Class1872 extends Class1868
{
    private static String[] field10204;
    private final Biome[] field10205;
    private final int field10206;
    
    public Class1872(final Class5472 class5472) {
        super((Set<Biome>)ImmutableSet.copyOf((Object[])class5472.method16713()));
        this.field10205 = class5472.method16713();
        this.field10206 = class5472.method16714() + 2;
    }
    
    @Override
    public Biome method6960(final int n, final int n2, final int n3) {
        return this.field10205[Math.abs(((n >> this.field10206) + (n3 >> this.field10206)) % this.field10205.length)];
    }
}
