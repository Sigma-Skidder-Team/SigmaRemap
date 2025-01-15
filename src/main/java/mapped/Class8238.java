// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8238 implements UncaughtExceptionHandler
{
    private static String[] field33831;
    public final /* synthetic */ Class963 field33832;
    public final /* synthetic */ Class899 field33833;
    
    public Class8238(final Class899 field33833, final Class963 field33834) {
        this.field33833 = field33833;
        this.field33832 = field33834;
    }
    
    @Override
    public void uncaughtException(final Thread thread, final Throwable t) {
        t.printStackTrace();
    }
}
