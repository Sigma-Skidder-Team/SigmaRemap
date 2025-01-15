// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6222 extends Class6221
{
    private static String[] field25079;
    private int field25080;
    private boolean field25081;
    
    public Class6222(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(n, n2, n3, n4, n5, n6);
        this.field25080 = -1;
        this.field25081 = false;
    }
    
    public boolean method18518(final Class8902 class8902, final int field25080) {
        if (this.field25080 != field25080) {
            this.field25081 = class8902.method31351(this.field25073, this.field25074, this.field25075, this.field25076, this.field25077, this.field25078);
            this.field25080 = field25080;
        }
        return this.field25081;
    }
}
