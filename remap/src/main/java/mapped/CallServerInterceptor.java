// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.net.ProtocolException;

public final class CallServerInterceptor implements Class6814
{
    private final boolean field26759;
    
    public CallServerInterceptor(final boolean field26759) {
        this.field26759 = field26759;
    }
    
    @Override
    public Response method20856(final Class8711 class8711) throws IOException {
        final RealInterceptorChain realInterceptorChain = (RealInterceptorChain)class8711;
        final Class7811 method29909 = realInterceptorChain.method29909();
        final StreamAllocation method29910 = realInterceptorChain.method29908();
        final Class5040 class8713 = (Class5040) realInterceptorChain.method29907();
        final Request method29911 = realInterceptorChain.method29905();
        final long currentTimeMillis = System.currentTimeMillis();
        method29909.method25221(method29911);
        Class9189 class8714 = null;
        if (Class8196.method27144(method29911.method29110())) {
            if (method29911.method29114() != null) {
                if ("100-continue".equalsIgnoreCase(method29911.method29112("Expect"))) {
                    method29909.method25222();
                    class8714 = method29909.method25224(true);
                }
                if (class8714 != null) {
                    if (!class8713.method15349()) {
                        method29910.method31373();
                    }
                }
                else {
                    final Class1679 method29912 = Class8753.method30276(method29909.method25220(method29911, method29911.method29114().method21940()));
                    method29911.method29114().method21941(method29912);
                    method29912.close();
                }
            }
        }
        method29909.method25223();
        if (class8714 == null) {
            class8714 = method29909.method25224(false);
        }
        final Response method29913 = class8714.method33595(method29911).method33599(method29910.method31371().method15331()).method33610(currentTimeMillis).method33611(System.currentTimeMillis()).method33612();
        final int method29914 = method29913.method6188();
        Response class8715;
        if (this.field26759 && method29914 == 101) {
            class8715 = method29913.method6198().method33604(Class7690.field30542).method33612();
        }
        else {
            class8715 = method29913.method6198().method33604(method29909.method25227(method29913)).method33612();
        }
        if ("close".equalsIgnoreCase(class8715.method6186().method29112("Connection")) || "close".equalsIgnoreCase(class8715.method6193("Connection"))) {
            method29910.method31373();
        }
        if (method29914 == 204 || method29914 == 205) {
            if (class8715.method6197().method6283() > 0L) {
                throw new ProtocolException("HTTP " + method29914 + " had non-zero Content-Length: " + class8715.method6197().method6283());
            }
        }
        return class8715;
    }
}
