// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;

public class Class7433 extends Class7422
{
    private final String field28666;
    private final int field28667;
    
    public Class7433(final String field28666, final int field28667) {
        this.field28666 = field28666;
        this.field28667 = field28667;
    }
    
    public int method22867() {
        return this.field28667;
    }
    
    @Override
    public String toString() {
        return String.format(Locale.ROOT, "%s --> %.2f ms", this.field28666, Float.valueOf(this.field28667));
    }
}
