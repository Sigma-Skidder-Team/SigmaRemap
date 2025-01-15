// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8438
{
    private static String[] field34680;
    private long field34681;
    private Class4252<?> field34682;
    public final /* synthetic */ Class3320 field34683;
    
    public Class8438(final Class3320 field34683, final Class4252<?> field34684, final long n) {
        this.field34683 = field34683;
        this.field34682 = field34684;
        this.field34681 = System.currentTimeMillis() + n;
    }
    
    public boolean method28168() {
        return this.field34681 - System.currentTimeMillis() < 0L;
    }
    
    public Class4252<?> method28169() {
        return this.field34682;
    }
}
