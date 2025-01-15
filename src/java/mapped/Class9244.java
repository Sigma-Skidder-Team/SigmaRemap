// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class9244
{
    private static String[] field39642;
    public final Class512 field39643;
    private boolean field39644;
    private int field39645;
    private int field39646;
    private int field39647;
    private int field39648;
    private int field39649;
    public int field39650;
    public final /* synthetic */ Class6356 field39651;
    
    public Class9244(final Class6356 field39651, final Class512 field39652) {
        this.field39651 = field39651;
        this.field39644 = true;
        this.field39647 = 127;
        this.field39648 = 127;
        this.field39643 = field39652;
    }
    
    @Nullable
    public Class4252<?> method34084(final Class8321 class8321) {
        if (!this.field39644) {
            return (this.field39649++ % 5 != 0) ? null : new Class4333(Class4094.method12329(class8321), this.field39651.field25425, this.field39651.field25423, this.field39651.field25427, this.field39651.field25431.values(), this.field39651.field25426, 0, 0, 0, 0);
        }
        this.field39644 = false;
        return new Class4333(Class4094.method12329(class8321), this.field39651.field25425, this.field39651.field25423, this.field39651.field25427, this.field39651.field25431.values(), this.field39651.field25426, this.field39645, this.field39646, this.field39647 + 1 - this.field39645, this.field39648 + 1 - this.field39646);
    }
    
    public void method34085(final int n, final int n2) {
        if (!this.field39644) {
            this.field39644 = true;
            this.field39645 = n;
            this.field39646 = n2;
            this.field39647 = n;
            this.field39648 = n2;
        }
        else {
            this.field39645 = Math.min(this.field39645, n);
            this.field39646 = Math.min(this.field39646, n2);
            this.field39647 = Math.max(this.field39647, n);
            this.field39648 = Math.max(this.field39648, n2);
        }
    }
}
