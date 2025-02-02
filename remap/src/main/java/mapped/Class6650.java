// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;
import java.util.List;

public class Class6650 extends Class6635
{
    private ClientPlayerEntity field26285;
    private String field26286;
    private List<UUID> field26287;
    private static Method field26288;
    private static Class<?> field26289;
    private static Method field26290;
    
    public Class6650(final Class6108 class6108, final ClientPlayerEntity field26285) {
        super(class6108);
        this.field26285 = field26285;
        this.field26286 = "";
    }
    
    public List<UUID> method20205() {
        if (this.field26287 == null) {
            if (Class6650.field26289 == null) {
                return null;
            }
            if (Class6650.field26288 == null) {
                return null;
            }
            if (Class6650.field26290 == null) {
                return null;
            }
            try {
                final Object method29120 = Class8597.method29120(Class6650.field26290.invoke(this.field26285, new Object[0]), "getSessionHandler");
                if (Class6650.field26289.isInstance(method29120)) {
                    this.field26287 = (List)Class6650.field26288.invoke(method29120, new Object[0]);
                }
            }
            catch (final NoSuchMethodException | InvocationTargetException | IllegalAccessException ex) {
                ((Throwable)ex).printStackTrace();
            }
        }
        return this.field26287;
    }
    
    static {
        try {
            Class6650.field26289 = Class.forName("com.velocitypowered.proxy.connection.client.ClientPlaySessionHandler");
            Class6650.field26288 = Class6650.field26289.getDeclaredMethod("getServerBossBars", (Class<?>[])new Class[0]);
            Class6650.field26290 = Class.forName("com.velocitypowered.proxy.connection.client.ConnectedPlayer").getDeclaredMethod("getMinecraftConnection", (Class<?>[])new Class[0]);
        }
        catch (final NoSuchMethodException | ClassNotFoundException ex) {
            ((Throwable)ex).printStackTrace();
        }
    }
}
