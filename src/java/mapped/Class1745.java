// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;

public class Class1745 extends Class1744
{
    private final Class6890 field9718;
    private final Class4206 field9719;
    private final Class9157 field9720;
    private AudioFormat field9721;
    private byte[] field9722;
    
    public Class1745(final InputStream inputStream, final AudioFormat audioFormat, final long n) throws IOException {
        super(inputStream, audioFormat, n);
        final List<Class6889> method19493 = new Class7828(inputStream).method25294().method19493(Class2236.field13747);
        if (!method19493.isEmpty()) {
            this.field9718 = (Class6890)method19493.get(0);
            this.field9719 = new Class4206(this.field9718.method21178());
            this.field9720 = new Class9157();
            return;
        }
        throw new IOException("movie does not contain any AAC track");
    }
    
    @Override
    public AudioFormat getFormat() {
        if (this.field9721 == null) {
            this.method6178();
            this.field9721 = new AudioFormat((float)this.field9720.method33418(), this.field9720.method33420(), this.field9720.method33419(), true, true);
            this.field9722 = this.field9720.method33417();
        }
        return this.field9721;
    }
    
    @Override
    public void method6177() {
        if (this.field9722 != null) {
            this.field9717.method24896(this.field9722);
            this.field9722 = null;
        }
        else {
            this.method6178();
            if (this.field9717.method24889()) {
                this.field9717.method24896(this.field9720.method33417());
            }
        }
    }
    
    private void method6178() {
        if (!this.field9718.method21181()) {
            this.field9717.method24888();
            return;
        }
        try {
            final Class1950 method21182 = this.field9718.method21182();
            if (method21182 == null) {
                this.field9717.method24888();
                return;
            }
            this.field9719.method12669(method21182.method7931(), this.field9720);
        }
        catch (final IOException ex) {
            this.field9717.method24888();
        }
    }
}
