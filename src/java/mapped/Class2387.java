// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2387 extends Class2386
{
    private static final long field14190 = 8710781187529689083L;
    private final String field14191;
    private final int field14192;
    private final int field14193;
    
    public Class2387(final String field14191, final int field14192, final int field14193, final String s) {
        super(s);
        this.field14191 = field14191;
        this.field14192 = field14193;
        this.field14193 = field14192;
    }
    
    public String method9510() {
        return this.field14191;
    }
    
    public int method9511() {
        return this.field14192;
    }
    
    public int method9512() {
        return this.field14193;
    }
    
    @Override
    public String toString() {
        return "unacceptable code point '" + new String(Character.toChars(this.field14192)) + "' (0x" + Integer.toHexString(this.field14192).toUpperCase() + ") " + this.getMessage() + "\nin \"" + this.field14191 + "\", position " + this.field14193;
    }
}
