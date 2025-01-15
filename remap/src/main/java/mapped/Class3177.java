// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;

public class Class3177 extends Class3167
{
    private ArrayList<IPacket<?>> field15553;
    private Class7617 field15554;
    private boolean field15555;
    
    public Class3177() {
        super(Class8013.field32987, "FakeLag", "Other players will see you lagging !");
        this.field15553 = new ArrayList<IPacket<?>>();
        this.field15554 = new Class7617();
        this.method9881(new Class4996("Lag duration", "The lags duration", 0.3f, Float.class, 0.1f, 2.0f, 0.01f));
        this.method9881(new Class4996("Delay", "The lags cooldown", 0.4f, Float.class, 0.1f, 2.0f, 0.01f));
        this.method9881(new Class4999("Combat", "Delay combat packets", true));
        this.method9881(new Class4999("Blocks", "Delay blocks packets", true));
        this.method9881(new Class4999("Ping", "Delay ping packets", true));
        this.field15554.method23932();
    }
    
    @Override
    public void method9879() {
        this.field15553.clear();
        this.field15555 = false;
        this.field15554.method23934();
    }
    
    @Override
    public void method9897() {
        final Iterator<IPacket<?>> iterator = this.field15553.iterator();
        while (iterator.hasNext()) {
            Class3177.field15514.method5269().getNetworkManager().method11176(iterator.next());
        }
    }
    
    @Class6753
    private void method9970(final Class5732 class5732) {
        if (this.method9906()) {
            this.field15553.clear();
            this.field15555 = false;
            this.field15554.method23934();
        }
    }
    
    @Class6753
    private void method9971(final Class5721 class5721) {
        if (this.method9906() && Class3177.field15514.method5269() != null) {
            if (!this.field15555) {
                if (this.field15554.method23935() > this.method9886("Delay") * 1000.0f) {
                    this.field15555 = true;
                    this.field15554.method23934();
                }
            }
            else if (this.field15554.method23935() <= this.method9886("Lag duration") * 1000.0f) {
                if (!(class5721.method16990() instanceof Class4353)) {
                    if (!(class5721.method16990() instanceof Class4303) && !(class5721.method16990() instanceof Class4255)) {
                        if (!(class5721.method16990() instanceof Class4381) && !(class5721.method16990() instanceof Class4380)) {
                            if (!(class5721.method16990() instanceof Class4307)) {
                                if (!(class5721.method16990() instanceof Class4399)) {
                                    if (!(class5721.method16990() instanceof Class4329)) {
                                        return;
                                    }
                                }
                            }
                            if (!this.method9883("Blocks")) {
                                return;
                            }
                        }
                        else if (!this.method9883("Combat")) {
                            return;
                        }
                    }
                    else if (!this.method9883("Ping")) {
                        return;
                    }
                }
                this.field15553.add(class5721.method16990());
                class5721.method16961(true);
            }
            else {
                this.field15555 = false;
                this.field15554.method23934();
                final Iterator<IPacket<?>> iterator = this.field15553.iterator();
                while (iterator.hasNext()) {
                    Class3177.field15514.method5269().getNetworkManager().method11176(iterator.next());
                }
                this.field15553.clear();
            }
        }
    }
}
