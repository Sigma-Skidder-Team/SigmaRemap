// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.text.NumberFormat;

public class Class7090 implements Class7089
{
    private int field27602;
    
    public Class7090(final int field27602) {
        this.field27602 = 0;
        this.field27602 = field27602;
    }
    
    @Override
    public String method21670(final Class7576 class7576) {
        ++this.field27602;
        final NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumIntegerDigits(3);
        numberInstance.setMaximumFractionDigits(0);
        numberInstance.setGroupingUsed(false);
        return "id" + numberInstance.format(this.field27602);
    }
}
