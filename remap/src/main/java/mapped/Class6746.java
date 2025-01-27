// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Level;

public final class Class6746 implements Class6747
{
    public Class8572 field26539;
    private Class7550 field26540;
    
    public Class6746() {
        this.field26539 = null;
    }
    
    @Override
    public void method20534(final String s) {
        final Class9041 method20536 = method20536(s);
        if (5 != method20536.field38263 && 6 != method20536.field38263) {
            if (this.field26540 != null) {
                this.field26540.method23715(method20536);
            }
        }
        else {
            this.field26539 = new Class8572(method20536);
            if (this.field26539.field36045.field38267 == 0) {
                if (this.field26540 != null) {
                    this.field26540.method23715(method20536);
                }
            }
        }
    }
    
    @Override
    public void method20535(final byte[] array) {
        if (this.field26539 != null) {
            final Class9041 method29022 = this.field26539.method29022(array);
            if (method29022 != null) {
                this.field26539 = null;
                if (this.field26540 != null) {
                    this.field26540.method23715(method29022);
                }
            }
            return;
        }
        throw new RuntimeException("got binary data when not reconstructing a packet");
    }
    
    private static Class9041 method20536(final String s) {
        int n = 0;
        final int length = s.length();
        final Class9041 class9041 = new Class9041(Character.getNumericValue(s.charAt(0)));
        if (class9041.field38263 < 0 || class9041.field38263 > Class8170.field33661.length - 1) {
            return Class8171.method27014();
        }
        if (5 == class9041.field38263 || 6 == class9041.field38263) {
            if (!s.contains("-") || length <= n + 1) {
                return Class8171.method27014();
            }
            final StringBuilder sb = new StringBuilder();
            while (s.charAt(++n) != '-') {
                sb.append(s.charAt(n));
            }
            class9041.field38267 = Integer.parseInt(sb.toString());
        }
        if (length > n + 1 && '/' == s.charAt(n + 1)) {
            final StringBuilder sb2 = new StringBuilder();
            do {
                ++n;
                final char char1 = s.charAt(n);
                if (',' == char1) {
                    break;
                }
                sb2.append(char1);
            } while (n + 1 != length);
            class9041.field38265 = sb2.toString();
        }
        else {
            class9041.field38265 = "/";
        }
        if (length > n + 1 && Character.getNumericValue(s.charAt(n + 1)) > -1) {
            final StringBuilder sb3 = new StringBuilder();
            do {
                ++n;
                final char char2 = s.charAt(n);
                if (Character.getNumericValue(char2) < 0) {
                    --n;
                    break;
                }
                sb3.append(char2);
            } while (n + 1 != length);
            try {
                class9041.field38264 = Integer.parseInt(sb3.toString());
            }
            catch (final NumberFormatException ex) {
                return Class8171.method27014();
            }
        }
        if (length > n + 1) {
            try {
                s.charAt(++n);
                class9041.field38266 = (T)new JSONTokener(s.substring(n)).nextValue();
            }
            catch (final JSONException thrown) {
                Class8171.method27013().log(Level.WARNING, "An error occured while retrieving data from JSONTokener", thrown);
                return Class8171.method27014();
            }
        }
        if (Class8171.method27013().isLoggable(Level.FINE)) {
            Class8171.method27013().fine(String.format("decoded %s as %s", s, class9041));
        }
        return class9041;
    }
    
    @Override
    public void method20537() {
        if (this.field26539 != null) {
            this.field26539.method29023();
        }
        this.field26540 = null;
    }
    
    @Override
    public void method20538(final Class7550 field26540) {
        this.field26540 = field26540;
    }
}
