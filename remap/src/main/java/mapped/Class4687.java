// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import io.socket.emitter.Emitter;

public class Class4687 implements Emitter.Listener
{
    public final /* synthetic */ IRCManager field20237;
    
    public Class4687(final IRCManager field20237) {
        this.field20237 = field20237;
    }
    
    @Override
    public void call(final Object... array) {
        System.out.println("disconnect");
        Client.getInstance().getNotificationManager().send(new Notification("Jello connect", "Connexion Failed. Try relogging.", ClientAssets.gingerbread));
    }
}
