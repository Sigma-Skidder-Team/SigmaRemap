// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1542 implements Runnable
{
    public final /* synthetic */ Class1565 field8617;
    
    public Class1542(final Class1565 field8617) {
        this.field8617 = field8617;
    }
    
    @Override
    public void run() {
        if (Class4968.method15146(this.field8617.field8761) != Class224.field789) {
            Class4968.method15139(this.field8617.field8761, "ping timeout");
        }
    }
}
