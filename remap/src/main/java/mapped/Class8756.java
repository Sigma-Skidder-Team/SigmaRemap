// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class8756
{
    private Class8756() {
    }
    
    public static long method30315(final String s) {
        return method30316(s, 0, s.length());
    }
    
    public static long method30316(final String s, final int n, final int n2) {
        if (s == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (n < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + n);
        }
        if (n2 < n) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + n2 + " < " + n);
        }
        if (n2 <= s.length()) {
            long n3 = 0L;
            int i = n;
            while (i < n2) {
                final char char1 = s.charAt(i);
                if (char1 >= '\u0080') {
                    if (char1 >= '\u0800') {
                        if (char1 >= '\ud800' && char1 <= '\udfff') {
                            final char c = (i + 1 >= n2) ? '\0' : s.charAt(i + 1);
                            if (char1 <= '\udbff') {
                                if (c >= '\udc00') {
                                    if (c <= '\udfff') {
                                        n3 += 4L;
                                        i += 2;
                                        continue;
                                    }
                                }
                            }
                            ++n3;
                            ++i;
                        }
                        else {
                            n3 += 3L;
                            ++i;
                        }
                    }
                    else {
                        n3 += 2L;
                        ++i;
                    }
                }
                else {
                    ++n3;
                    ++i;
                }
            }
            return n3;
        }
        throw new IllegalArgumentException("endIndex > string.length: " + n2 + " > " + s.length());
    }
}
