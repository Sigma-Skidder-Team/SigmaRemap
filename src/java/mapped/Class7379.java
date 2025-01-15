// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.net.URL;
import java.io.File;

public class Class7379 implements Class7378
{
    private static String[] field28433;
    private File field28434;
    
    public Class7379(final File field28434) {
        this.field28434 = field28434;
    }
    
    @Override
    public URL method22652(final String s) {
        try {
            File file = new File(this.field28434, s);
            if (!file.exists()) {
                file = new File(s);
            }
            if (!file.exists()) {
                return null;
            }
            return file.toURI().toURL();
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    @Override
    public InputStream method22653(final String s) {
        try {
            File file = new File(this.field28434, s);
            if (!file.exists()) {
                file = new File(s);
            }
            return new FileInputStream(file);
        }
        catch (final IOException ex) {
            return null;
        }
    }
}
