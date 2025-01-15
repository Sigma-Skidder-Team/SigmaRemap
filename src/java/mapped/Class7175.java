// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import javax.annotation.Nullable;

public final class Class7175 extends Class7173
{
    private static String[] field27827;
    public final /* synthetic */ Class8991 field27828;
    public final /* synthetic */ Class1929 field27829;
    
    public Class7175(final Class8991 field27828, final Class1929 field27829) {
        this.field27828 = field27828;
        this.field27829 = field27829;
    }
    
    @Nullable
    @Override
    public Class8991 method21939() {
        return this.field27828;
    }
    
    @Override
    public long method21940() throws IOException {
        return this.field27829.method7766();
    }
    
    @Override
    public void method21941(final Class1679 class1679) throws IOException {
        class1679.method5927(this.field27829);
    }
}
