// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.java_websocket.exceptions.InvalidDataException;

public class InvalidFrameException extends InvalidDataException
{
    private static String[] field14060;
    private static final long field14061 = -9016496369828887591L;
    
    public InvalidFrameException() {
        super(1002);
    }
    
    public InvalidFrameException(final String s) {
        super(1002, s);
    }
    
    public InvalidFrameException(final Throwable t) {
        super(1002, t);
    }
    
    public InvalidFrameException(final String s, final Throwable t) {
        super(1002, s, t);
    }
}
