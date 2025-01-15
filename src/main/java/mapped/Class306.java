// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.URISyntaxException;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.Iterator;
import java.io.IOException;
import java.security.PrivilegedActionException;
import org.apache.commons.io.IOUtils;
import java.security.AccessController;
import java.net.URL;

public enum Class306
{
    field1831, 
    field1832, 
    field1833("WINDOWS", 2) {
        public Class307(final String s, final int n) {
        }
        
        @Override
        public String[] method979(final URL url) {
            return new String[] { "rundll32", "url.dll,FileProtocolHandler", url.toString() };
        }
    }, 
    field1834("OSX", 3) {
        public Class308(final String s, final int n) {
        }
        
        @Override
        public String[] method979(final URL url) {
            return new String[] { "open", url.toString() };
        }
    }, 
    field1835;
    
    public void method976(final URL url) {
        try {
            final Process process = AccessController.doPrivileged(() -> Runtime.getRuntime().exec(this.method979(url2)));
            final Iterator iterator = IOUtils.readLines(process.getErrorStream()).iterator();
            while (iterator.hasNext()) {
                Class8349.method27871().error((String)iterator.next());
            }
            process.getInputStream().close();
            process.getErrorStream().close();
            process.getOutputStream().close();
        }
        catch (final PrivilegedActionException | IOException ex) {
            Class8349.method27871().error("Couldn't open url '{}'", (Object)url, (Object)ex);
            Class8349.method27872((Exception)ex);
        }
    }
    
    public void method977(final URI uri) {
        try {
            this.method976(uri.toURL());
        }
        catch (final MalformedURLException ex) {
            Class8349.method27871().error("Couldn't open uri '{}'", (Object)uri, (Object)ex);
        }
    }
    
    public void method978(final File file) {
        try {
            this.method976(file.toURI().toURL());
        }
        catch (final MalformedURLException ex) {
            Class8349.method27871().error("Couldn't open file '{}'", (Object)file, (Object)ex);
        }
    }
    
    public String[] method979(final URL url) {
        String s = url.toString();
        if ("file".equals(url.getProtocol())) {
            s = s.replace("file:", "file://");
        }
        return new String[] { "xdg-open", s };
    }
    
    public void method980(final String str) {
        try {
            this.method976(new URI(str).toURL());
        }
        catch (final IllegalArgumentException | URISyntaxException | MalformedURLException ex) {
            Class8349.method27871().error("Couldn't open uri '{}'", (Object)str, (Object)ex);
        }
    }
}
