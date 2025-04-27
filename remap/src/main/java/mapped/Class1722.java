// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.OutputStream;

public class Class1722 extends Class1721
{
    public Class1722(final String s, final OutputStream outputStream) {
        super(s, outputStream);
    }
    
    @Override
    public void method6071(final String s) {
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final StackTraceElement stackTraceElement = stackTrace[Math.min(3, stackTrace.length)];
        Class1722.field9637.info("[{}]@.({}:{}): {}", this.field9638, stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), s);
    }
}
