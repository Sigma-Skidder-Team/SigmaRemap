// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import javax.annotation.Nullable;

public final class Class7176 extends Class7173
{
    private static String[] field27830;
    public final /* synthetic */ Class8991 field27831;
    public final /* synthetic */ int field27832;
    public final /* synthetic */ byte[] field27833;
    public final /* synthetic */ int field27834;
    
    public Class7176(final Class8991 field27831, final int field27832, final byte[] field27833, final int field27834) {
        this.field27831 = field27831;
        this.field27832 = field27832;
        this.field27833 = field27833;
        this.field27834 = field27834;
    }
    
    @Nullable
    @Override
    public Class8991 method21939() {
        return this.field27831;
    }
    
    @Override
    public long method21940() {
        return this.field27832;
    }
    
    @Override
    public void method21941(final Class1679 class1679) throws IOException {
        class1679.method5929(this.field27833, this.field27834, this.field27832);
    }
}
