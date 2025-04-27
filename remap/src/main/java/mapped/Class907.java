// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.InetAddress;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import java.math.BigInteger;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class Class907 extends Thread
{
    public final /* synthetic */ Class5803 field4862;
    
    public Class907(final Class5803 field4862, final String name) {
        this.field4862 = field4862;
        super(name);
    }
    
    @Override
    public void run() {
        final GameProfile method17397 = Class5803.method17397(this.field4862);
        Label_0294: {
            try {
                Class5803.method17400(this.field4862, Class5803.method17398(this.field4862).method1554().hasJoinedServer(new GameProfile(null, method17397.getName()), new BigInteger(Class9359.method34699("", Class5803.method17398(this.field4862).method1495().getPublic(), Class5803.method17399(this.field4862))).toString(16), this.method5408()));
                if (Class5803.method17397(this.field4862) != null) {
                    Class5803.method17401().info("UUID of player {} is {}", (Object)Class5803.method17397(this.field4862).getName(), (Object)Class5803.method17397(this.field4862).getId());
                    Class5803.method17402(this.field4862, Class2055.field11730);
                }
                else if (Class5803.method17398(this.field4862).method1500()) {
                    Class5803.method17401().warn("Failed to verify username but will let them in anyway!");
                    Class5803.method17400(this.field4862, this.field4862.method17395(method17397));
                    Class5803.method17402(this.field4862, Class2055.field11730);
                }
                else {
                    this.field4862.method17392(new Class2259("multiplayer.disconnect.unverified_username"));
                    Class5803.method17401().error("Username '{}' tried to join with an invalid session", (Object)method17397.getName());
                }
            }
            catch (final AuthenticationUnavailableException ex) {
                if (!Class5803.method17398(this.field4862).method1500()) {
                    break Label_0294;
                }
                Class5803.method17401().warn("Authentication servers are down but will let them in anyway!");
                Class5803.method17400(this.field4862, this.field4862.method17395(method17397));
                Class5803.method17402(this.field4862, Class2055.field11730);
            }
            return;
        }
        this.field4862.method17392(new Class2259("multiplayer.disconnect.authservers_down"));
        Class5803.method17401().error("Couldn't verify username because servers are unavailable");
    }
    
    @Nullable
    private InetAddress method5408() {
        final SocketAddress method11180 = this.field4862.field23826.method11180();
        return (Class5803.method17398(this.field4862).method1520() && method11180 instanceof InetSocketAddress) ? ((InetSocketAddress)method11180).getAddress() : null;
    }
}
