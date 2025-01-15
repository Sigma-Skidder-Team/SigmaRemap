// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class7506 implements Class7507
{
    private static final int field29101 = 32;
    private static final ThreadLocal<char[]> field29102;
    public static final /* synthetic */ boolean field29103;
    
    public abstract char[] method23417(final int p0);
    
    public int method23415(final CharSequence charSequence, final int n, final int n2) {
        int i;
        int method23420;
        for (i = n; i < n2; i += (Character.isSupplementaryCodePoint(method23420) ? 2 : 1)) {
            method23420 = method23420(charSequence, i, n2);
            if (method23420 < 0) {
                break;
            }
            if (this.method23417(method23420) != null) {
                break;
            }
        }
        return i;
    }
    
    @Override
    public String method23416(final String s) {
        final int length = s.length();
        final int method23415 = this.method23415(s, 0, length);
        return (method23415 != length) ? this.method23418(s, method23415) : s;
    }
    
    public final String method23418(final String s, int i) {
        final int length = s.length();
        char[] value = Class7506.field29102.get();
        int count = 0;
        int n;
        for (n = 0; i < length; i = this.method23415(s, n, length)) {
            final int method23420 = method23420(s, i, length);
            if (method23420 < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            final char[] method23421 = this.method23417(method23420);
            if (method23421 != null) {
                final int n2 = i - n;
                final int n3 = count + n2 + method23421.length;
                if (value.length < n3) {
                    value = method23421(value, count, n3 + (length - i) + 32);
                }
                if (n2 > 0) {
                    s.getChars(n, i, value, count);
                    count += n2;
                }
                if (method23421.length > 0) {
                    System.arraycopy(method23421, 0, value, count, method23421.length);
                    count += method23421.length;
                }
            }
            n = i + (Character.isSupplementaryCodePoint(method23420) ? 2 : 1);
        }
        final int n4 = length - n;
        if (n4 > 0) {
            final int n5 = count + n4;
            if (value.length < n5) {
                value = method23421(value, count, n5);
            }
            s.getChars(n, length, value, count);
            count = n5;
        }
        return new String(value, 0, count);
    }
    
    @Override
    public Appendable method23419(final Appendable appendable) {
        if (!Class7506.field29103 && appendable == null) {
            throw new AssertionError();
        }
        return new Class1723(this, appendable);
    }
    
    public static final int method23420(final CharSequence charSequence, int i, final int n) {
        if (i >= n) {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
        final char char1 = charSequence.charAt(i++);
        if (char1 < '\ud800' || char1 > '\udfff') {
            return char1;
        }
        if (char1 > '\udbff') {
            throw new IllegalArgumentException("Unexpected low surrogate character '" + char1 + "' with value " + (int)char1 + " at index " + (i - 1));
        }
        if (i == n) {
            return -char1;
        }
        final char char2 = charSequence.charAt(i);
        if (!Character.isLowSurrogate(char2)) {
            throw new IllegalArgumentException("Expected low surrogate but got char '" + char2 + "' with value " + (int)char2 + " at index " + i);
        }
        return Character.toCodePoint(char1, char2);
    }
    
    private static final char[] method23421(final char[] array, final int n, final int n2) {
        final char[] array2 = new char[n2];
        if (n > 0) {
            System.arraycopy(array, 0, array2, 0, n);
        }
        return array2;
    }
    
    static {
        field29103 = !Class7506.class.desiredAssertionStatus();
        field29102 = new Class2434();
    }
}
