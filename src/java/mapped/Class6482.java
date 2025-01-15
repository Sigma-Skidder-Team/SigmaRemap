// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;
import com.google.common.base.Optional;

public class Class6482 implements Class6477
{
    private static String[] field25840;
    
    public void method19509(final Class6108 class6108, final Class8322 class6109, final Class74 class6110) throws Exception {
        this.method19514(class6108);
        if (this.method19515()) {
            this.method19512(class6108).method20197(class6109, class6110);
        }
    }
    
    public Optional<Class74> method19510(final Class6108 class6108, final Class8322 class6109) throws Exception {
        this.method19514(class6108);
        if (!this.method19515()) {
            return (Optional<Class74>)Optional.absent();
        }
        return this.method19512(class6108).method20199(class6109);
    }
    
    public void method19511(final Class6108 class6108, final int n, final int n2) throws Exception {
        this.method19514(class6108);
        if (this.method19515()) {
            this.method19512(class6108).method20196(n, n2);
        }
    }
    
    private Class6648 method19512(final Class6108 class6108) {
        return class6108.method18207(Class6648.class);
    }
    
    public void method19513(final Class6108 class6108) throws Exception {
        if (this.method19515()) {
            final Class8699 class6109 = new Class8699(27, null, class6108);
            class6109.method29823(Class5260.field22296, class6108.method18207(Class6634.class).method20098());
            class6109.method29823(Class5260.field22289, (Byte)26);
            class6109.method29833(Class5224.class);
            class6108.method18207(Class6648.class).method20201(true);
        }
    }
    
    private void method19514(final Class6108 class6108) throws Exception {
        if (this.method19515()) {
            if (!this.method19512(class6108).method20202()) {
                this.method19513(class6108);
            }
        }
    }
    
    public boolean method19515() {
        return true;
    }
    
    public void method19516(final Class6108 class6108) {
        if (this.method19515()) {
            this.method19512(class6108).method20200();
        }
    }
}
