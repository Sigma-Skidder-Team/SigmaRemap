// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import org.java_websocket.exceptions.InvalidDataException;
import java.nio.ByteBuffer;
import java.io.UnsupportedEncodingException;
import java.nio.charset.CodingErrorAction;

public class Class8142
{
    private static final CodingErrorAction field33544;
    private static final int[] field33545;
    
    private Class8142() {
    }
    
    public static byte[] method26834(final String s) {
        try {
            return s.getBytes("UTF8");
        }
        catch (final UnsupportedEncodingException ex) {
            throw new Class2364(ex);
        }
    }
    
    public static byte[] method26835(final String s) {
        try {
            return s.getBytes("ASCII");
        }
        catch (final UnsupportedEncodingException ex) {
            throw new Class2364(ex);
        }
    }
    
    public static String method26836(final byte[] array) {
        return method26837(array, 0, array.length);
    }
    
    public static String method26837(final byte[] bytes, final int offset, final int length) {
        try {
            return new String(bytes, offset, length, "ASCII");
        }
        catch (final UnsupportedEncodingException ex) {
            throw new Class2364(ex);
        }
    }
    
    public static String method26838(final byte[] array) throws InvalidDataException {
        return method26839(ByteBuffer.wrap(array));
    }
    
    public static String method26839(final ByteBuffer in) throws InvalidDataException {
        final CharsetDecoder decoder = Charset.forName("UTF8").newDecoder();
        decoder.onMalformedInput(Class8142.field33544);
        decoder.onUnmappableCharacter(Class8142.field33544);
        String string;
        try {
            in.mark();
            string = decoder.decode(in).toString();
            in.reset();
        }
        catch (final CharacterCodingException ex) {
            throw new Class2319(1007, ex);
        }
        return string;
    }
    
    public static boolean method26840(final ByteBuffer byteBuffer, final int n) {
        final int remaining = byteBuffer.remaining();
        if (remaining >= n) {
            int n2 = 0;
            for (int i = n; i < remaining; ++i) {
                n2 = Class8142.field33545[256 + (n2 << 4) + Class8142.field33545[0xFF & byteBuffer.get(i)]];
                if (n2 == 1) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static boolean method26841(final ByteBuffer byteBuffer) {
        return method26840(byteBuffer, 0);
    }
    
    static {
        field33544 = CodingErrorAction.REPORT;
        field33545 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 11, 6, 6, 6, 5, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 0, 1, 2, 3, 5, 8, 7, 1, 1, 1, 4, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    }
}
