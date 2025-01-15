// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.schemas.Schema;
import java.util.function.Function;

public final class Class8469 extends Class8470
{
    private static String[] field34752;
    public final /* synthetic */ Function field34753;
    
    public Class8469(final Schema schema, final String s, final Function field34753) {
        this.field34753 = field34753;
        super(schema, s);
    }
    
    @Override
    public String method28272(final String s) {
        return this.field34753.apply(s);
    }
}
