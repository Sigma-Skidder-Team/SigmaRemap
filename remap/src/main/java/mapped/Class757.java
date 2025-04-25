// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import net.minecraft.util.math.Vec3d;

import java.util.UUID;

public class Class757 extends ClientPlayerEntity
{
    private static UUID field4105;
    
    public Class757(final Minecraft class869, final ClientWorld class870, final Class5799 class871, final Class7474 class872, final Class6520 class873) {
        super(class869, class870, class871, class872, class873);
    }
    
    @Override
    public void method4113() {
        final Class5747 class5747 = new Class5747();
        Client.getInstance().getEventBus().method21097(class5747);
        if (!class5747.isCancelled()) {
            super.method4113();
        }
    }
    
    @Override
    public void method1671(final Class2160 class2160, final Vec3d class2161) {
        final Class5717 class2162 = new Class5717(class2161);
        Client.getInstance().getEventBus().method21097(class2162);
        if (!class2162.isCancelled()) {
            super.method1671(class2160, new Vec3d(class2162.method16972(), class2162.method16974(), class2162.method16976()));
        }
    }
    
    @Override
    public void pushOutOfBlocks(final double n, final double n2, final double n3) {
        final Class5713 class5713 = new Class5713();
        Client.getInstance().getEventBus().method21097(class5713);
        if (!class5713.isCancelled()) {
            super.pushOutOfBlocks(n, n2, n3);
        }
    }
    
    @Override
    public void method1659() {
        final Class5743 class5743 = new Class5743();
        if (ModuleSettingInitializr.field8977) {
            try {
                if (this.ticksExisted % 150 == 0) {
                    Thread.sleep((long)(1800.0 + 7000.0 * Math.random()));
                }
                else if (this.ticksExisted % 42 == 0 && Math.random() > 0.20000000298023224) {
                    Thread.sleep((long)(200.0 + 300.0 * Math.random()));
                }
            }
            catch (final InterruptedException ex) {}
        }
        Client.getInstance().getEventBus().method21097(class5743);
        if (class5743.isCancelled()) {
            return;
        }
        super.method1659();
    }
    
    @Override
    public void method2738() {
        super.method2738();
        Client.getInstance().getEventBus().method21097(new Class5742());
    }
    
    @Override
    public boolean isSpectator() {
        return false;
    }
    
    @Override
    public boolean method2889() {
        return false;
    }
    
    static {
        Class757.field4105 = UUID.fromString("8667ba71-b85a-4004-af54-457a9734eed7");
    }
}
