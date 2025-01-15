// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.charset.CodingErrorAction;
import java.nio.charset.Charset;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.CharacterCodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;

public abstract class Class9354
{
    private static final CharsetDecoder field40131;
    private static final String field40132 = "-_.!~*'()@:$&,;=[]/";
    private static final Class7507 field40133;
    
    public static String method34669(final String s) {
        return Class9354.field40133.method23416(s);
    }
    
    public static String method34670(final ByteBuffer in) throws CharacterCodingException {
        return Class9354.field40131.decode(in).toString();
    }
    
    public static String method34671(final String s) {
        try {
            return URLDecoder.decode(s, "UTF-8");
        }
        catch (final UnsupportedEncodingException ex) {
            throw new Class2386(ex);
        }
    }
    
    static {
        field40131 = Charset.forName("UTF-8").newDecoder().onMalformedInput(CodingErrorAction.REPORT);
        field40133 = new Class7505("-_.!~*'()@:$&,;=[]/", false);
    }
}
