// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.io.OutputStream;
import org.apache.logging.log4j.Logger;
import java.io.PrintStream;

public class Class1721 extends PrintStream
{
    public static final Logger field9637;
    public final String field9638;
    
    public Class1721(final String field9638, final OutputStream out) {
        super(out);
        this.field9638 = field9638;
    }
    
    @Override
    public void println(final String s) {
        this.method6071(s);
    }
    
    @Override
    public void println(final Object obj) {
        this.method6071(String.valueOf(obj));
    }
    
    public void method6071(final String s) {
        Class1721.field9637.info("[{}]: {}", this.field9638, s);
    }
    
    static {
        field9637 = LogManager.getLogger();
    }
}
