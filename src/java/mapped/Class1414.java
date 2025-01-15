// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1414 implements Runnable
{
    private static String[] field7820;
    private final int field7821;
    private final Runnable field7822;
    
    public Class1414(final int field7821, final Runnable field7822) {
        this.field7821 = field7821;
        this.field7822 = field7822;
    }
    
    @Override
    public void run() {
        this.field7822.run();
    }
    
    public int method5658() {
        return this.field7821;
    }
}
