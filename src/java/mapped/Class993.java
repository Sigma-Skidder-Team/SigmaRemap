// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class993 implements Runnable
{
    private static String[] field5293;
    private long field5294;
    private final long field5295;
    private final long field5296;
    
    public Class993(final long field5294, final long field5295, final long field5296) {
        this.field5294 = field5294;
        this.field5295 = field5295;
        this.field5296 = field5296;
    }
    
    @Override
    public void run() {
        if (this.field5294 != 0L) {
            Class8601.field36113.freeMemory(this.field5294);
            this.field5294 = 0L;
            Class7579.method23861(this.field5295 * this.field5296);
        }
    }
}
