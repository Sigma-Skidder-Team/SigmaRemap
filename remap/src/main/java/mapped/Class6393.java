// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import okhttp3.Call;

import java.io.IOException;
import java.net.ProtocolException;

public class Class6393 implements Callback
{
    public final /* synthetic */ Request field25508;
    public final /* synthetic */ int field25509;
    public final /* synthetic */ Class7479 field25510;
    
    public Class6393(final Class7479 field25510, final Request field25511, final int field25512) {
        this.field25510 = field25510;
        this.field25508 = field25511;
        this.field25509 = field25512;
    }
    
    @Override
    public void method19085(final Call call, final Response class2306) {
        try {
            this.field25510.method23113(class2306);
        }
        catch (final ProtocolException ex) {
            this.field25510.method23135(ex, class2306);
            Class7690.method24432(class2306);
            return;
        }
        final StreamAllocation method32276 = Class9013.field38043.method32276(call);
        method32276.method31373();
        final Class1669 method32277 = method32276.method31371().method15344(method32276);
        try {
            this.field25510.field28882.method34634(this.field25510, class2306);
            this.field25510.method23114("OkHttp WebSocket " + this.field25508.url().redact(), this.field25509, method32277);
            method32276.method31371().method15330().setSoTimeout(0);
            this.field25510.method23115();
        }
        catch (final Exception ex2) {
            this.field25510.method23135(ex2, null);
        }
    }
    
    @Override
    public void method19086(final Call call, final IOException ex) {
        this.field25510.method23135(ex, null);
    }
}
