// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9344 extends Class9345
{
    private static String[] field40117;
    public final /* synthetic */ Class4964 field40118;
    public final /* synthetic */ Class4964 field40119;
    
    public Class9344(final Class4964 field40119, final Class4964 field40120) {
        this.field40119 = field40119;
        this.field40118 = field40120;
    }
    
    @Override
    public void method34634(final Class7481 class7481, final Response class7482) {
        EventThread.exec(new Class981(this, class7482.method6195().method21367()));
    }
    
    @Override
    public void method34635(final Class7481 class7481, final String s) {
        if (s != null) {
            EventThread.exec(new Class1215(this, s));
        }
    }
    
    @Override
    public void method34636(final Class7481 class7481, final Class1929 class7482) {
        if (class7482 != null) {
            EventThread.exec(new Class1278(this, class7482));
        }
    }
    
    @Override
    public void method34637(final Class7481 class7481, final int n, final String s) {
        EventThread.exec(new Class1468(this));
    }
    
    @Override
    public void method34638(final Class7481 class7481, final Throwable t, final Response class7482) {
        if (t instanceof Exception) {
            EventThread.exec(new Class1031(this, t));
        }
    }
}
