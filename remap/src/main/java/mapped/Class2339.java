// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2339 extends Class2338 implements Class2340
{
    private int field14083;
    
    public Class2339(final String s, final Throwable t) {
        super(s, t);
        this.field14083 = 256;
    }
    
    public Class2339(final int field14083, final Throwable t) {
        this(method9454(field14083), t);
        this.field14083 = field14083;
    }
    
    public int method9453() {
        return this.field14083;
    }
    
    public static String method9454(final int i) {
        return "Bitstream errorcode " + Integer.toHexString(i);
    }
}
