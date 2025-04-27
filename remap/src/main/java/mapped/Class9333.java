// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Type;
import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

public final class Class9333
{
    private static String[] field40057;
    public final Gson field40058;
    private StateContainer<Block, BlockState> field40059;
    
    public Class9333() {
        this.field40058 = new GsonBuilder().registerTypeAdapter(Class5593.class, new Class5976()).registerTypeAdapter(Class2124.class, new Class5984()).registerTypeAdapter(Class7683.class, new Class5987()).registerTypeAdapter(Class7686.class, new Class5966(this)).registerTypeAdapter(Class8997.class, new Class5973()).create();
    }
    
    public StateContainer<Block, BlockState> method34573() {
        return this.field40059;
    }
    
    public void method34574(final StateContainer<Block, BlockState> field40059) {
        this.field40059 = field40059;
    }
}
