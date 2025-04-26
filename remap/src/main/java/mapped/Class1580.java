// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1580 extends NamedRunnable
{
    private static String[] field8833;
    public final /* synthetic */ boolean field8834;
    public final /* synthetic */ int field8835;
    public final /* synthetic */ int field8836;
    public final /* synthetic */ Class9116 field8837;
    public final /* synthetic */ Class1758 field8838;
    
    public Class1580(final Class1758 field8838, final String s, final Object[] array, final boolean field8839, final int field8840, final int field8841, final Class9116 field8842) {
        this.field8838 = field8838;
        this.field8834 = field8839;
        this.field8835 = field8840;
        this.field8836 = field8841;
        this.field8837 = field8842;
        super(s, array);
    }
    
    @Override
    public void execute() {
        try {
            this.field8838.method6250(this.field8834, this.field8835, this.field8836, this.field8837);
        }
        catch (final IOException ex) {}
    }
}
