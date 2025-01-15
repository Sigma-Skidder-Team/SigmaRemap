// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6653 extends Class6635
{
    private static String[] field26301;
    private static final long field26302 = 50L;
    private static final long field26303 = 20L;
    private long field26304;
    private boolean field26305;
    
    public Class6653(final Class6108 class6108) {
        super(class6108);
        this.field26304 = 0L;
        this.field26305 = true;
    }
    
    public void method20223() {
        this.field26304 = Math.max(this.field26304 + 50L, System.currentTimeMillis() - 1000L);
    }
    
    public long method20224() {
        return this.field26304;
    }
    
    public boolean method20225() {
        return this.field26305;
    }
    
    public void method20226(final boolean field26305) {
        this.field26305 = field26305;
    }
}
