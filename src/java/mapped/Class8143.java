// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Class8143 extends Logger
{
    private final Logger field33546;
    
    public Class8143(final Logger field33546) {
        super("logger", null);
        this.field33546 = field33546;
    }
    
    @Override
    public void log(final LogRecord logRecord) {
        this.log(logRecord.getLevel(), logRecord.getMessage());
    }
    
    @Override
    public void log(final Level level, final String s) {
    }
    
    @Override
    public void log(final Level level, final String s, final Object o) {
    }
    
    @Override
    public void log(final Level level, final String s, final Object[] arguments) {
        this.log(level, MessageFormat.format(s.replaceAll("ViaVersion", "Jello Portal"), arguments));
    }
    
    @Override
    public void log(final Level level, final String s, final Throwable t) {
    }
}
