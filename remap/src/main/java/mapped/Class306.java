// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.File;
import java.net.URI;
import java.net.URL;

public enum Class306
{
    field1831, 
    field1832, 
    field1833,
    field1834,
    field1835;
    
    public void method976(final URL url) {

    }
    
    public void method977(final URI uri) {

    }
    
    public void method978(final File file) {

    }
    
    public String[] method979(final URL url) {
        String s = url.toString();
        if ("file".equals(url.getProtocol())) {
            s = s.replace("file:", "file://");
        }
        return new String[] { "xdg-open", s };
    }
    
    public void method980(final String str) {

    }
}
