// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.List;

public final class BridgeInterceptor implements Class6814
{
    private final Class7536 field26757;
    
    public BridgeInterceptor(final Class7536 field26757) {
        this.field26757 = field26757;
    }
    
    @Override
    public Response method20856(final Class8711 class8711) throws IOException {
        final Request method29905 = class8711.method29905();
        final Class8896 method29906 = method29905.method29116();
        final Class7173 method29907 = method29905.method29114();
        if (method29907 != null) {
            final Class8991 method29908 = method29907.method21939();
            if (method29908 != null) {
                method29906.method31312("Content-Type", method29908.toString());
            }
            final long method29909 = method29907.method21940();
            if (method29909 == -1L) {
                method29906.method31312("Transfer-Encoding", "chunked");
                method29906.method31314("Content-Length");
            }
            else {
                method29906.method31312("Content-Length", Long.toString(method29909));
                method29906.method31314("Transfer-Encoding");
            }
        }
        if (method29905.method29112("Host") == null) {
            method29906.method31312("Host", Class7690.method24442(method29905.url(), false));
        }
        if (method29905.method29112("Connection") == null) {
            method29906.method31312("Connection", "Keep-Alive");
        }
        int n = 0;
        if (method29905.method29112("Accept-Encoding") == null) {
            if (method29905.method29112("Range") == null) {
                n = 1;
                method29906.method31312("Accept-Encoding", "gzip");
            }
        }
        final List<Class8713> method29910 = this.field26757.method23617(method29905.url());
        if (!method29910.isEmpty()) {
            method29906.method31312("Cookie", this.method20857(method29910));
        }
        if (method29905.method29112("User-Agent") == null) {
            method29906.method31312("User-Agent", Class8286.method27533());
        }
        final Response method29911 = class8711.proceed(method29906.method31326());
        Class9558.method35762(this.field26757, method29905.url(), method29911.method6195());
        final Class9189 method29912 = method29911.method6198().method33595(method29905);
        if (n != 0) {
            if ("gzip".equalsIgnoreCase(method29911.method6193("Content-Encoding"))) {
                if (Class9558.method35763(method29911)) {
                    final Class1684 class8712 = new Class1684(method29911.method6197().method6285());
                    final Class6957 method29913 = method29911.method6195().method21366().method29380("Content-Encoding").method29380("Content-Length").method29384();
                    method29912.method33603(method29913);
                    method29912.method33604(new Class1761(method29913, Class8753.method30275(class8712)));
                }
            }
        }
        return method29912.method33612();
    }
    
    private String method20857(final List<Class8713> list) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); ++i) {
            if (i > 0) {
                sb.append("; ");
            }
            final Class8713 class8713 = list.get(i);
            sb.append(class8713.method29911()).append('=').append(class8713.method29912());
        }
        return sb.toString();
    }
}
