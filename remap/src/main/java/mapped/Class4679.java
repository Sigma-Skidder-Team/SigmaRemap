// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mojang.authlib.exceptions.AuthenticationException;
import totalcross.json.JSONObject;

public class Class4679 implements Class4659
{
    public final /* synthetic */ CombatTracker field20217;
    
    public Class4679(final CombatTracker field20217) {
        this.field20217 = field20217;
    }
    
    @Override
    public void method13945(final Object... array) {
        final JSONObject x = (JSONObject)array[0];
        System.out.println(x);
        if (CombatTracker.method33667(this.field20217).field4642 == null || CombatTracker.method33667(this.field20217).field4642.method33694() == null) {
            return;
        }
        try {
            CombatTracker.method33668(this.field20217, CombatTracker.method33667(this.field20217).field4642.method33694(), x.getString("serverHash"));
            System.out.println("s");
            final JSONObject JSONObject = new JSONObject();
            JSONObject.put("username", CombatTracker.method33667(this.field20217).field4642.method33692());
            CombatTracker.method33666(this.field20217).method14942("server-auth", JSONObject);
        }
        catch (final JSONException | AuthenticationException | IOException ex) {
            ((Throwable)ex).printStackTrace();
        }
        Client.getInstance().getNotificationManager().send(new Notification("Jello connect", "Connected!", ClientAssets.gingerbread));
    }
}
