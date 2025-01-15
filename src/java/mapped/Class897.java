// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Class897 extends Thread
{
    public final /* synthetic */ Class395 field4844;
    
    public Class897(final Class395 field4844, final String name) {
        this.field4844 = field4844;
        super(name);
    }
    
    @Override
    public void run() {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        try {
            String line;
            while (!this.field4844.method1536() && this.field4844.method1455() && (line = bufferedReader.readLine()) != null) {
                this.field4844.method1616(line, this.field4844.method1574());
            }
        }
        catch (final IOException ex) {
            Class395.method1613().error("Exception handling console input", (Throwable)ex);
        }
    }
}
