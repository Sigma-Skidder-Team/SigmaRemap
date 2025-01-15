// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import io.netty.channel.ChannelInitializer;
import java.lang.reflect.Method;

public class Class8751 implements Class8750
{
    public static Method field36733;
    
    private ChannelInitializer method30255() throws Exception {
        return null;
    }
    
    @Override
    public void method30249() throws Exception {
    }
    
    @Override
    public void method30250() {
    }
    
    @Override
    public int method30251() throws Exception {
        return method30256();
    }
    
    public static int method30256() {
        return Class9367.method34762();
    }
    
    @Override
    public String method30252() {
        return "via-encoder";
    }
    
    @Override
    public String method30253() {
        return "via-decoder";
    }
    
    @Override
    public JsonObject method30254() {
        final JsonObject jsonObject = new JsonObject();
        try {
            jsonObject.addProperty("currentInitializer", this.method30255().getClass().getName());
        }
        catch (final Exception ex) {}
        return jsonObject;
    }
}
