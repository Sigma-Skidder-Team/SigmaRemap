// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.Closeable;
import javax.annotation.Nullable;
import java.io.File;

public final class Class7174 extends Class7173
{
    private static String[] field27824;
    public final /* synthetic */ Class8991 field27825;
    public final /* synthetic */ File field27826;
    
    public Class7174(final Class8991 field27825, final File field27826) {
        this.field27825 = field27825;
        this.field27826 = field27826;
    }
    
    @Nullable
    @Override
    public Class8991 method21939() {
        return this.field27825;
    }
    
    @Override
    public long method21940() {
        return this.field27826.length();
    }
    
    @Override
    public void method21941(final Class1679 class1679) throws IOException {
        Class1682 method30282 = null;
        try {
            method30282 = Class8753.method30282(this.field27826);
            class1679.method5930(method30282);
        }
        finally {
            Class7690.method24432(method30282);
        }
    }
}
