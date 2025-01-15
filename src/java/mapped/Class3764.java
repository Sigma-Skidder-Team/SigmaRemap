// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Class3764 extends Class3736
{
    private final Map<String, String> field17210;
    
    public Class3764() {
        super("Nero Metadata Tags Box");
        this.field17210 = new HashMap<String, String>();
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        class9131.method33144(12L);
        while (this.method11491(class9131) > 0L && class9131.method33135() == 128) {
            class9131.method33144(2L);
            final String method33140 = class9131.method33140((int)this.method11491(class9131), "UTF-8");
            class9131.method33144(4L);
            this.field17210.put(method33140, class9131.method33139(class9131.method33135()));
        }
    }
    
    public Map<String, String> method11568() {
        return this.field17210;
    }
}
