// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;

public final class Class6291 extends Class6287
{
    private static String[] field25158;
    private final boolean field25159;
    private final Class2206 field25160;
    private final Map<String, String> field25161;
    
    public Class6291(final Class2314 class2314, final Class2314 class2315, final boolean field25159, final Class2206 field25160, final Map<String, String> field25161) {
        super(class2314, class2315);
        this.field25159 = field25159;
        this.field25160 = field25160;
        this.field25161 = field25161;
    }
    
    public boolean method18618() {
        return this.field25159;
    }
    
    public Class2206 method18619() {
        return this.field25160;
    }
    
    public Map<String, String> method18620() {
        return this.field25161;
    }
    
    @Override
    public boolean method18614(final Class2211 class2211) {
        return Class2211.field13474 == class2211;
    }
}
