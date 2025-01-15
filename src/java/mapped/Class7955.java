// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class7955 implements Class7954
{
    private static String[] field32680;
    private final Class3820 field32681;
    private final int field32682;
    private final int field32683;
    private final int field32684;
    private final float field32685;
    
    public Class7955(final Class3832 class3832, final int field32682, final int field32683, final int field32684) {
        this.field32681 = class3832.method11704();
        this.field32682 = field32682;
        this.field32683 = field32683;
        this.field32684 = field32684;
        this.field32685 = 0.05f;
    }
    
    @Override
    public Class9017 method25804(final Class399 class399, final Random random) {
        return new Class9017(new Class8321(this.field32681, this.field32682), new Class8321(Class7739.field31514), this.field32683, this.field32684, this.field32685);
    }
}
