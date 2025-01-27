// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class JSONException extends RuntimeException
{
    private static String[] field14180;
    private static final long field14181 = 0L;
    
    public JSONException(final String message) {
        super(message);
    }
    
    public JSONException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public JSONException(final Throwable cause) {
        super(cause.getMessage(), cause);
    }
}
