// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Level;

public class Class4688 implements Class4659
{
    public final /* synthetic */ Class4963[] field20238;
    public final /* synthetic */ Class4659 field20239;
    public final /* synthetic */ Class4968 field20240;
    
    public Class4688(final Class4968 field20240, final Class4963[] field20241, final Class4659 field20242) {
        this.field20240 = field20240;
        this.field20238 = field20241;
        this.field20239 = field20242;
    }
    
    @Override
    public void method13945(final Object... array) {
        final Class4963 class4963 = (Class4963)array[0];
        if (this.field20238[0] != null) {
            if (!class4963.field21319.equals(this.field20238[0].field21319)) {
                if (Class4968.method15143().isLoggable(Level.FINE)) {
                    Class4968.method15143().fine(String.format("'%s' works - aborting '%s'", class4963.field21319, this.field20238[0].field21319));
                }
                this.field20239.method13945(new Object[0]);
            }
        }
    }
}