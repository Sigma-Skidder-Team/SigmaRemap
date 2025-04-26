// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import okhttp3.OkHttpClient;

import java.io.IOException;

public final class ConnectInterceptor implements Class6814
{
    public final OkHttpClient field26766;
    
    public ConnectInterceptor(final OkHttpClient field26766) {
        this.field26766 = field26766;
    }
    
    @Override
    public Response method20856(final Class8711 class8711) throws IOException {
        final RealInterceptorChain realInterceptorChain = (RealInterceptorChain)class8711;
        final Request method29905 = realInterceptorChain.method29905();
        final StreamAllocation method29906 = realInterceptorChain.method29908();
        return realInterceptorChain.method29910(method29905, method29906, method29906.method31365(this.field26766, !method29905.method29110().equals("GET")), method29906.method31371());
    }
}
