// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Level;

public class Class4666 implements Class4659
{
    public final /* synthetic */ boolean[] field20183;
    public final /* synthetic */ String field20184;
    public final /* synthetic */ Class4963[] field20185;
    public final /* synthetic */ Class4968 field20186;
    public final /* synthetic */ Runnable[] field20187;
    public final /* synthetic */ Class4968 field20188;
    
    public Class4666(final Class4968 field20188, final boolean[] field20189, final String field20190, final Class4963[] field20191, final Class4968 field20192, final Runnable[] field20193) {
        this.field20188 = field20188;
        this.field20183 = field20189;
        this.field20184 = field20190;
        this.field20185 = field20191;
        this.field20186 = field20192;
        this.field20187 = field20193;
    }
    
    @Override
    public void method13945(final Object... array) {
        if (!this.field20183[0]) {
            if (Class4968.method15143().isLoggable(Level.FINE)) {
                Class4968.method15143().fine(String.format("probe transport '%s' opened", this.field20184));
            }
            this.field20185[0].method14999(new Class8437[] { new Class8437("ping", (T)"probe") });
            this.field20185[0].method14977("packet", new Class4671(this));
        }
    }
}
