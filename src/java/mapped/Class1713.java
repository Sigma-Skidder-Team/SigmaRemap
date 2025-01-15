// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.OutputStream;

public final class Class1713 implements Class1676
{
    public final /* synthetic */ Class8020 field9614;
    public final /* synthetic */ OutputStream field9615;
    
    public Class1713(final Class8020 field9614, final OutputStream field9615) {
        this.field9614 = field9614;
        this.field9615 = field9615;
    }
    
    @Override
    public void method5920(final Class1680 class1680, long a) throws IOException {
        Class9476.method35277(class1680.field9512, 0L, a);
        while (a > 0L) {
            this.field9614.method26305();
            final Class9258 field9511 = class1680.field9511;
            final int len = (int)Math.min(a, field9511.field39715 - field9511.field39714);
            this.field9615.write(field9511.field39713, field9511.field39714, len);
            final Class9258 class1681 = field9511;
            class1681.field39714 += len;
            a -= len;
            class1680.field9512 -= len;
            if (field9511.field39714 != field9511.field39715) {
                continue;
            }
            class1680.field9511 = field9511.method34162();
            Class9141.method33335(field9511);
        }
    }
    
    @Override
    public void flush() throws IOException {
        this.field9615.flush();
    }
    
    @Override
    public void close() throws IOException {
        this.field9615.close();
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9614;
    }
    
    @Override
    public String toString() {
        return "sink(" + this.field9615 + ")";
    }
}
