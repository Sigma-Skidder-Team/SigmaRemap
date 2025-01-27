// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mojang.authlib.exceptions.AuthenticationException;

public class Class4679 implements Class4659
{
    public final /* synthetic */ Class9198 field20217;
    
    public Class4679(final Class9198 field20217) {
        this.field20217 = field20217;
    }
    
    @Override
    public void method13945(final Object... array) {
        final JSONObject x = (JSONObject)array[0];
        System.out.println(x);
        if (Class9198.method33667(this.field20217).field4642 == null || Class9198.method33667(this.field20217).field4642.method33694() == null) {
            return;
        }
        try {
            Class9198.method33668(this.field20217, Class9198.method33667(this.field20217).field4642.method33694(), x.getString("serverHash"));
            System.out.println("s");
            final JSONObject JSONObject = new JSONObject();
            JSONObject.method13301("username", Class9198.method33667(this.field20217).field4642.method33692());
            Class9198.method33666(this.field20217).method14942("server-auth", JSONObject);
        }
        catch (final JSONException | AuthenticationException | IOException ex) {
            ((Throwable)ex).printStackTrace();
        }
        Client.method35173().method35197().method25776(new Class6224("Jello connect", "Connected!", ClientAssets.gingerbread));
    }
}
