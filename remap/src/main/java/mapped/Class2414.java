// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2414 implements Serializable
{
    private static String[] field14285;
    private final int field14286;
    private final int field14287;
    public final /* synthetic */ Class2411 field14288;
    
    public Class2414(final Class2411 field14288, final int field14289, final int field14290) {
        this.field14288 = field14288;
        this.field14286 = field14289;
        this.field14287 = field14290;
    }
    
    public int method9668() {
        return this.field14286;
    }
    
    public int method9669() {
        return this.field14287;
    }
    
    @Override
    public int hashCode() {
        return this.field14286 * this.field14287;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Class2414)) {
            return false;
        }
        final Class2414 class2414 = (Class2414)o;
        return class2414.field14286 == this.field14286 && class2414.field14287 == this.field14287;
    }
}
