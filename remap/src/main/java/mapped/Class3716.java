// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3716 extends Class3703
{
    private Class5775 field17081;
    private Class5775[] field17082;
    
    public Class3716() {
        super("IPMP Control Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17081 = Class5775.method17219(class9131);
        final int method33135 = class9131.method33135();
        this.field17082 = new Class5775[method33135];
        for (int i = 0; i < method33135; ++i) {
            this.field17082[i] = Class5775.method17219(class9131);
        }
    }
    
    public Class5775 method11436() {
        return this.field17081;
    }
    
    public Class5775[] method11437() {
        return this.field17082;
    }
}
