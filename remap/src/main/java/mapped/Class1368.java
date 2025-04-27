// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1368 implements Runnable
{
    public final /* synthetic */ Class1620 field7513;
    
    public Class1368(final Class1620 field7513) {
        this.field7513 = field7513;
    }
    
    @Override
    public void run() {
        if (Manager.method15094(this.field7513.field9048)) {
            return;
        }
        Manager.method15073().fine("attempting reconnect");
        final int method26364 = Manager.method15095(this.field7513.field9048).method26364();
        Manager.method15079(this.field7513.field9048, "reconnect_attempt", new Object[] { method26364 });
        Manager.method15079(this.field7513.field9048, "reconnecting", new Object[] { method26364 });
        if (!Manager.method15094(this.field7513.field9048)) {
            this.field7513.field9048.method15055(new Class8331(this));
        }
    }
}
