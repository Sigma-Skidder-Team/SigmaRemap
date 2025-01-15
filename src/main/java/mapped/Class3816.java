// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3816 extends Class3703
{
    private Class5775 field17351;
    
    public Class3816() {
        super("Object Descriptor Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17351 = Class5775.method17219(class9131);
    }
    
    public Class5775 method11690() {
        return this.field17351;
    }
}
