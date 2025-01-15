// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1634 implements Runnable
{
    private static String[] field9133;
    private final int field9134;
    private final Runnable field9135;
    
    public Class1634(final int field9134, final Runnable field9135) {
        this.field9134 = field9134;
        this.field9135 = field9135;
    }
    
    public int method5679() {
        return this.field9134;
    }
    
    @Override
    public void run() {
        this.field9135.run();
    }
}
