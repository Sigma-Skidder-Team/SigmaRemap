// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonParser;
import com.google.gson.JsonObject;

public class Class2527 extends Class2466
{
    private static String[] field14536;
    public final /* synthetic */ Class2887 field14537;
    
    public Class2527(final Class2887 field14537) {
        this.field14537 = field14537;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        try {
            final JsonObject jsonObject = (JsonObject)new JsonParser().parse((String)class8699.method29818(Class5260.field22308, 0));
            Class8529.method28609(jsonObject, class8699.method29841());
            class8699.method29821(Class5260.field22308, 0, jsonObject.toString());
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
}
