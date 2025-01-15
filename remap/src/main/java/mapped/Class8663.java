// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.dimension.DimensionType;
import org.apache.logging.log4j.LogManager;
import net.minecraft.network.ThreadQuickExitException;
import org.apache.logging.log4j.Logger;

public class Class8663
{
    private static final Logger field36392;
    public static DimensionType field36393;
    
    public static <T extends INetHandler> void method29631(final IPacket<T> class4252, final T t, final Class1849 class4253) throws ThreadQuickExitException {
        method29632(class4252, t, class4253.getServer());
    }
    
    public static <T extends INetHandler> void method29632(final IPacket<T> class4252, final T t, final Class872<?> class4253) throws ThreadQuickExitException {
        if (class4253.method5374()) {
            method29633(class4252);
            return;
        }
        class4253.execute(() -> {
            method29633(obj);
            if (!class4254.method17369().method11187()) {
                Class8663.field36392.debug("Ignoring packet due to disconnection: " + obj);
            }
            else {
                obj.method12762(class4254);
            }
            return;
        });
        throw Class2382.field14183;
    }
    
    public static void method29633(final IPacket class4252) {
        if (class4252 instanceof Class4328) {
            Class869.method5277().field4636.method5765();
        }
        if (!(class4252 instanceof Class4359)) {
            if (!(class4252 instanceof Class4383)) {
                Class8663.field36393 = null;
            }
            else {
                Class8663.field36393 = ((Class4383)class4252).method13180();
            }
        }
        else {
            Class8663.field36393 = ((Class4359)class4252).method13097();
        }
    }
    
    static {
        field36392 = LogManager.getLogger();
        Class8663.field36393 = null;
    }
}
