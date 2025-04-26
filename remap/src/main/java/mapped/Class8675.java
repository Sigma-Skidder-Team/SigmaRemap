// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class8675 implements Class8674
{
    private static String[] field36475;
    public final /* synthetic */ Class1726 field36476;
    
    public Class8675(final Class1726 field36476) {
        this.field36476 = field36476;
    }
    
    @Override
    public Response method29705(final Request request) throws IOException {
        return this.field36476.method6075(request);
    }
    
    @Override
    public Class6050 method29706(final Response class1753) throws IOException {
        return this.field36476.method6076(class1753);
    }
    
    @Override
    public void method29707(final Request request) throws IOException {
        this.field36476.method6077(request);
    }
    
    @Override
    public void method29708(final Response class1753, final Response class1754) {
        this.field36476.method6078(class1753, class1754);
    }
    
    @Override
    public void method29709() {
        this.field36476.method6091();
    }
    
    @Override
    public void method29710(final Class8016 class8016) {
        this.field36476.method6090(class8016);
    }
}
