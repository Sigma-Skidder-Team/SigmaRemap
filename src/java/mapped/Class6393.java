// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.net.ProtocolException;
import java.io.Closeable;

public class Class6393 implements Class6394
{
    public final /* synthetic */ Class8596 field25508;
    public final /* synthetic */ int field25509;
    public final /* synthetic */ Class7479 field25510;
    
    public Class6393(final Class7479 field25510, final Class8596 field25511, final int field25512) {
        this.field25510 = field25510;
        this.field25508 = field25511;
        this.field25509 = field25512;
    }
    
    @Override
    public void method19085(final Class2305 class2305, final Class1753 class2306) {
        try {
            this.field25510.method23113(class2306);
        }
        catch (final ProtocolException ex) {
            this.field25510.method23135(ex, class2306);
            Class7690.method24432(class2306);
            return;
        }
        final Class8904 method32276 = Class9013.field38043.method32276(class2305);
        method32276.method31373();
        final Class1669 method32277 = method32276.method31371().method15344(method32276);
        try {
            this.field25510.field28882.method34634(this.field25510, class2306);
            this.field25510.method23114("OkHttp WebSocket " + this.field25508.method29109().method30956(), this.field25509, method32277);
            method32276.method31371().method15330().setSoTimeout(0);
            this.field25510.method23115();
        }
        catch (final Exception ex2) {
            this.field25510.method23135(ex2, null);
        }
    }
    
    @Override
    public void method19086(final Class2305 class2305, final IOException ex) {
        this.field25510.method23135(ex, null);
    }
}
