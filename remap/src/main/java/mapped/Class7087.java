// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7087 implements Class7088
{
    private static String[] field27599;
    public final /* synthetic */ Manager field27600;
    public final /* synthetic */ Manager field27601;
    
    public Class7087(final Manager field27601, final Manager field27602) {
        this.field27601 = field27601;
        this.field27600 = field27602;
    }
    
    @Override
    public void method21669(final Object[] array) {
        for (final Object o : array) {
            if (!(o instanceof String)) {
                if (o instanceof byte[]) {
                    this.field27600.field21375.method15115((byte[])o);
                }
            }
            else {
                this.field27600.field21375.method15113((String)o);
            }
        }
        Manager.method15092(this.field27600, false);
        Manager.method15093(this.field27600);
    }
}
