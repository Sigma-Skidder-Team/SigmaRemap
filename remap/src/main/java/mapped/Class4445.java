// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;

public final class Class4445 implements Comparator<String>
{
    private static String[] field19784;
    
    @Override
    public int compare(final String s, final String s2) {
        for (int i = 4; i < Math.min(s.length(), s2.length()); ++i) {
            final char char1 = s.charAt(i);
            final char char2 = s2.charAt(i);
            if (char1 != char2) {
                return (char1 >= char2) ? 1 : -1;
            }
        }
        final int length = s.length();
        final int length2 = s2.length();
        if (length == length2) {
            return 0;
        }
        return (length >= length2) ? 1 : -1;
    }
}
