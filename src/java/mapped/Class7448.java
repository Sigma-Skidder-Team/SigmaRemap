// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class7448
{
    private static String[] field28741;
    private final int field28742;
    private final int field28743;
    private final int field28744;
    private final int field28745;
    private Class7448 field28746;
    private Class7448 field28747;
    private boolean field28748;
    
    private Class7448(final int field28742, final int field28743, final int field28744, final int field28745) {
        this.field28742 = field28742;
        this.field28743 = field28743;
        this.field28744 = field28744;
        this.field28745 = field28745;
    }
    
    @Nullable
    public Class7448 method22910(final Class2022 class2022) {
        if (this.field28746 != null && this.field28747 != null) {
            Class7448 class2023 = this.field28746.method22910(class2022);
            if (class2023 == null) {
                class2023 = this.field28747.method22910(class2022);
            }
            return class2023;
        }
        if (this.field28748) {
            return null;
        }
        final int method8068 = class2022.method8068();
        final int method8069 = class2022.method8069();
        if (method8068 > this.field28744 || method8069 > this.field28745) {
            return null;
        }
        if (method8068 == this.field28744 && method8069 == this.field28745) {
            this.field28748 = true;
            return this;
        }
        if (this.field28744 - method8068 <= this.field28745 - method8069) {
            this.field28746 = new Class7448(this.field28742, this.field28743, this.field28744, method8069);
            this.field28747 = new Class7448(this.field28742, this.field28743 + method8069 + 1, this.field28744, this.field28745 - method8069 - 1);
        }
        else {
            this.field28746 = new Class7448(this.field28742, this.field28743, method8068, this.field28745);
            this.field28747 = new Class7448(this.field28742 + method8068 + 1, this.field28743, this.field28744 - method8068 - 1, this.field28745);
        }
        return this.field28746.method22910(class2022);
    }
}
