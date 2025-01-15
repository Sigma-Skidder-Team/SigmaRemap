// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;

public class Class1747 extends Class1744
{
    private static String[] field9723;
    private final Class8847 field9724;
    private final Class4206 field9725;
    private final Class9157 field9726;
    private AudioFormat field9727;
    private byte[] field9728;
    
    public Class1747(final InputStream inputStream, final AudioFormat audioFormat, final long n) throws IOException {
        super(inputStream, audioFormat, n);
        this.field9727 = null;
        this.field9724 = new Class8847(inputStream);
        this.field9725 = new Class4206(this.field9724.method30974());
        this.field9726 = new Class9157();
    }
    
    @Override
    public AudioFormat getFormat() {
        if (this.field9727 == null) {
            try {
                this.field9725.method12669(this.field9724.method30975(), this.field9726);
                this.field9727 = new AudioFormat((float)this.field9726.method33418(), this.field9726.method33420(), this.field9726.method33419(), true, true);
                this.field9728 = this.field9726.method33417();
            }
            catch (final IOException ex) {
                return null;
            }
        }
        return this.field9727;
    }
    
    @Override
    public void method6177() {
        try {
            if (this.field9728 == null) {
                this.field9725.method12669(this.field9724.method30975(), this.field9726);
                this.field9717.method24896(this.field9726.method33417());
            }
            else {
                this.field9717.method24896(this.field9728);
                this.field9728 = null;
            }
        }
        catch (final IOException ex) {
            this.field9717.method24888();
        }
    }
}
