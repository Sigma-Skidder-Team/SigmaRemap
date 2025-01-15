// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7505 extends Class7506
{
    public static final String field29094 = "-_.*";
    public static final String field29095 = "-_.!~*'()@:$&,;=";
    public static final String field29096 = "-_.!~*'()@:$,;/?:";
    private static final char[] field29097;
    private static final char[] field29098;
    private final boolean field29099;
    private final boolean[] field29100;
    
    public Class7505(final String s, final boolean field29099) {
        if (s.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        if (field29099 && s.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        if (!s.contains("%")) {
            this.field29099 = field29099;
            this.field29100 = method23414(s);
            return;
        }
        throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
    }
    
    private static boolean[] method23414(final String s) {
        int max = 122;
        final char[] charArray;
        final char[] array = charArray = s.toCharArray();
        for (int length = charArray.length, i = 0; i < length; ++i) {
            max = Math.max(charArray[i], max);
        }
        final boolean[] array2 = new boolean[max + 1];
        for (int j = 48; j <= 57; ++j) {
            array2[j] = true;
        }
        for (int k = 65; k <= 90; ++k) {
            array2[k] = true;
        }
        for (int l = 97; l <= 122; ++l) {
            array2[l] = true;
        }
        final char[] array3 = array;
        for (int length2 = array3.length, n = 0; n < length2; ++n) {
            array2[array3[n]] = true;
        }
        return array2;
    }
    
    @Override
    public int method23415(final CharSequence charSequence, int i, final int n) {
        while (i < n) {
            final char char1 = charSequence.charAt(i);
            if (char1 >= this.field29100.length) {
                break;
            }
            if (!this.field29100[char1]) {
                break;
            }
            ++i;
        }
        return i;
    }
    
    @Override
    public String method23416(final String s) {
        for (int length = s.length(), i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (char1 >= this.field29100.length || !this.field29100[char1]) {
                return this.method23418(s, i);
            }
        }
        return s;
    }
    
    @Override
    public char[] method23417(int i) {
        if (i < this.field29100.length && this.field29100[i]) {
            return null;
        }
        if (i == 32 && this.field29099) {
            return Class7505.field29097;
        }
        if (i <= 127) {
            return new char[] { '%', Class7505.field29098[i >>> 4], Class7505.field29098[i & 0xF] };
        }
        if (i <= 2047) {
            final char[] array = { '%', '\0', '\0', '%', '\0', Class7505.field29098[i & 0xF] };
            i >>>= 4;
            array[4] = Class7505.field29098[0x8 | (i & 0x3)];
            i >>>= 2;
            array[2] = Class7505.field29098[i & 0xF];
            i >>>= 4;
            array[1] = Class7505.field29098[0xC | i];
            return array;
        }
        if (i <= 65535) {
            final char[] array2 = { '%', 'E', '\0', '%', '\0', '\0', '%', '\0', Class7505.field29098[i & 0xF] };
            i >>>= 4;
            array2[7] = Class7505.field29098[0x8 | (i & 0x3)];
            i >>>= 2;
            array2[5] = Class7505.field29098[i & 0xF];
            i >>>= 4;
            array2[4] = Class7505.field29098[0x8 | (i & 0x3)];
            i >>>= 2;
            array2[2] = Class7505.field29098[i];
            return array2;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Invalid unicode character value " + i);
        }
        final char[] array3 = { '%', 'F', '\0', '%', '\0', '\0', '%', '\0', '\0', '%', '\0', Class7505.field29098[i & 0xF] };
        i >>>= 4;
        array3[10] = Class7505.field29098[0x8 | (i & 0x3)];
        i >>>= 2;
        array3[8] = Class7505.field29098[i & 0xF];
        i >>>= 4;
        array3[7] = Class7505.field29098[0x8 | (i & 0x3)];
        i >>>= 2;
        array3[5] = Class7505.field29098[i & 0xF];
        i >>>= 4;
        array3[4] = Class7505.field29098[0x8 | (i & 0x3)];
        i >>>= 2;
        array3[2] = Class7505.field29098[i & 0x7];
        return array3;
    }
    
    static {
        field29097 = new char[] { '+' };
        field29098 = "0123456789ABCDEF".toCharArray();
    }
}
