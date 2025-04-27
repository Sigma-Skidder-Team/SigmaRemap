// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class1505 implements Runnable
{
    public final /* synthetic */ Class4968 field8375;
    public final /* synthetic */ Emitter.Listener[] field8376;
    public final /* synthetic */ Class1001 field8377;
    
    public Class1505(final Class1001 field8377, final Class4968 field8378, final Emitter.Listener[] field8379) {
        this.field8377 = field8377;
        this.field8375 = field8378;
        this.field8376 = field8379;
    }
    
    @Override
    public void run() {
        this.field8375.method14977("upgrade", this.field8376[0]);
        this.field8375.method14977("upgradeError", this.field8376[0]);
    }
}
