// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2345 extends Class2338 implements Class2343
{
    private int field14127;
    
    public Class2345(final String s, final Throwable t) {
        super(s, t);
        this.field14127 = 512;
    }
    
    public Class2345(final int field14127, final Throwable t) {
        this(method9490(field14127), t);
        this.field14127 = field14127;
    }
    
    public int method9489() {
        return this.field14127;
    }
    
    public static String method9490(final int i) {
        return "Decoder errorcode " + Integer.toHexString(i);
    }
}
