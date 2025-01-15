// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class Class6764 extends Class6765
{
    private Class51 field26555;
    
    public Class6764(final Class1655 class1655) {
        super(class1655, 8);
        this.method20622(10);
    }
    
    @Override
    public void method20572(final Class513 class513) {
        if (class513.method1841().getString().equals(this.method20574().method1498())) {
            this.field26555 = class513.method1756(new Class51());
        }
        super.method20572(class513);
    }
    
    @Override
    public Class2250 method20573(final SocketAddress socketAddress, final GameProfile gameProfile) {
        return (gameProfile.getName().equalsIgnoreCase(this.method20574().method1498()) && this.method20598(gameProfile.getName()) != null) ? new Class2259("multiplayer.disconnect.name_taken", new Object[0]) : super.method20573(socketAddress, gameProfile);
    }
    
    public Class1655 method20574() {
        return (Class1655)super.method20576();
    }
    
    @Override
    public Class51 method20575() {
        return this.field26555;
    }
}
