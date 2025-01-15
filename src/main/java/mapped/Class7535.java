// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.schemas.Schema;
import java.util.function.Function;

public final class Class7535 extends Class7534
{
    private static String[] field29916;
    public final /* synthetic */ Function field29917;
    
    public Class7535(final Schema schema, final String s, final Function field29917) {
        this.field29917 = field29917;
        super(schema, s);
    }
    
    @Override
    public String method23612(final String s) {
        return this.field29917.apply(s);
    }
}
