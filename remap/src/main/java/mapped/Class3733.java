// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Class3733 extends Class3703
{
    private String field17128;
    private String field17129;
    
    public Class3733() {
        super("Genre Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        if (this.field17139.method11492() != 1969517665L) {
            this.method11502(class9131);
        }
        else {
            super.method11381(class9131);
            this.field17128 = Class8805.method30719(class9131.method33137(2));
            this.field17129 = new String(class9131.method33142((int)this.method11491(class9131), 0), StandardCharsets.UTF_8);
        }
    }
    
    public String method11483() {
        return this.field17128;
    }
    
    public String method11484() {
        return this.field17129;
    }
}
