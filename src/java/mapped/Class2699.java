// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Class2699 extends Class2466
{
    private static String[] field14855;
    public final /* synthetic */ Class2851 field14856;
    
    public Class2699(final Class2851 field14856) {
        this.field14856 = field14856;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        if (!Class8563.method28792().method23290()) {
            return;
        }
        try {
            final JsonElement parse = new JsonParser().parse((String)class8699.method29818(Class5260.field22308, 0));
            if (!Class8397.method28000(parse, class8699.method29841())) {
                class8699.method29839();
                return;
            }
            Class8451.method28197(parse, class8699.method29841());
            class8699.method29821(Class5260.field22308, 0, parse.toString());
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
}
