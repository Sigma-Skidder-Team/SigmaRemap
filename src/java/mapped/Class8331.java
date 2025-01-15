// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8331 implements Class8332
{
    public final /* synthetic */ Class1368 field34213;
    
    public Class8331(final Class1368 field34213) {
        this.field34213 = field34213;
    }
    
    @Override
    public void method27770(final Exception ex) {
        if (ex == null) {
            Class4967.method15073().fine("reconnect success");
            Class4967.method15098(this.field34213.field7513.field9048);
        }
        else {
            Class4967.method15073().fine("reconnect attempt error");
            Class4967.method15096(this.field34213.field7513.field9048, false);
            Class4967.method15097(this.field34213.field7513.field9048);
            Class4967.method15079(this.field34213.field7513.field9048, "reconnect_error", new Object[] { ex });
        }
    }
}
