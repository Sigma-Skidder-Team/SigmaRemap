// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.File;

public class Class7040 implements Class7038
{
    public File field27413;
    
    public Class7040(final String s, final File field27413) {
        this.field27413 = field27413;
    }
    
    @Override
    public void method21533() {
    }
    
    @Override
    public InputStream method21531(final String s) {
        try {
            final File file = new File(this.field27413, Class9518.method35527(s, "/", "/"));
            InputStream inputStream;
            if (!file.exists()) {
                inputStream = null;
            }
            else {
                final FileInputStream in;
                inputStream = new BufferedInputStream(in);
                in = new FileInputStream(file);
            }
            return inputStream;
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    @Override
    public boolean method21532(final String s) {
        final File file = new File(this.field27413, s.substring(1));
        return file.exists() && file.isDirectory();
    }
    
    @Override
    public String method21530() {
        return this.field27413.getName();
    }
}
