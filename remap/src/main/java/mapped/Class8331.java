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
            Manager.method15073().fine("reconnect success");
            Manager.method15098(this.field34213.field7513.field9048);
        }
        else {
            Manager.method15073().fine("reconnect attempt error");
            Manager.method15096(this.field34213.field7513.field9048, false);
            Manager.method15097(this.field34213.field7513.field9048);
            Manager.method15079(this.field34213.field7513.field9048, "reconnect_error", new Object[] { ex });
        }
    }
}
