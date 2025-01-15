// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1110 implements Runnable
{
    public final /* synthetic */ Class4968 field5987;
    public final /* synthetic */ Class1001 field5988;
    
    public Class1110(final Class1001 field5988, final Class4968 field5989) {
        this.field5988 = field5988;
        this.field5987 = field5989;
    }
    
    @Override
    public void run() {
        Class4968.method15139(this.field5987, "forced close");
        Class4968.method15143().fine("socket closing - telling transport to close");
        this.field5987.field21422.method14998();
    }
}
