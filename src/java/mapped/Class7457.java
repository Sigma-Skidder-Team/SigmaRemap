// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.ArrayList;
import io.socket.utf8.UTF8Exception;

public final class Class7457
{
    private static final String field28762 = "Invalid continuation byte";
    private static int[] field28763;
    private static int field28764;
    private static int field28765;
    
    private Class7457() {
    }
    
    public static String method22960(final String s) throws UTF8Exception {
        return method22961(s, new Class8169());
    }
    
    public static String method22961(final String s, final Class8169 class8169) throws UTF8Exception {
        final boolean field33652 = class8169.field33652;
        final int[] method22964 = method22964(s);
        final int length = method22964.length;
        int n = -1;
        final StringBuilder sb = new StringBuilder();
        while (++n < length) {
            sb.append(method22965(method22964[n], field33652));
        }
        return sb.toString();
    }
    
    public static String method22962(final String s) throws UTF8Exception {
        return method22963(s, new Class8169());
    }
    
    public static String method22963(final String s, final Class8169 class8169) throws UTF8Exception {
        final boolean field33652 = class8169.field33652;
        Class7457.field28763 = method22964(s);
        Class7457.field28764 = Class7457.field28763.length;
        Class7457.field28765 = 0;
        final ArrayList list = new ArrayList();
        int method22967;
        while ((method22967 = method22967(field33652)) != -1) {
            list.add(method22967);
        }
        return method22969(method22971(list));
    }
    
    private static int[] method22964(final String s) {
        final int length = s.length();
        final int[] array = new int[s.codePointCount(0, length)];
        int n = 0;
        int codePoint;
        for (int i = 0; i < length; i += Character.charCount(codePoint)) {
            codePoint = s.codePointAt(i);
            array[n++] = codePoint;
        }
        return array;
    }
    
    private static String method22965(final int codePoint, final boolean b) throws UTF8Exception {
        return new StringBuilder().append(Character.toChars(codePoint)).toString();
    }
    
    private static char[] method22966(final int n, final int n2) {
        return Character.toChars((n >> n2 & 0x3F) | 0x80);
    }
    
    private static int method22967(final boolean b) throws UTF8Exception {
        if (Class7457.field28765 > Class7457.field28764) {
            throw new Class2354("Invalid byte index");
        }
        if (Class7457.field28765 == Class7457.field28764) {
            return -1;
        }
        final int n = Class7457.field28763[Class7457.field28765] & 0xFF;
        ++Class7457.field28765;
        if ((n & 0x80) == 0x0) {
            return n;
        }
        if ((n & 0xE0) != 0xC0) {
            if ((n & 0xF0) != 0xE0) {
                if ((n & 0xF8) == 0xF0) {
                    final int n2 = (n & 0xF) << 18 | method22968() << 12 | method22968() << 6 | method22968();
                    if (n2 >= 65536) {
                        if (n2 <= 1114111) {
                            return n2;
                        }
                    }
                }
                throw new Class2354("Invalid continuation byte");
            }
            final int n3 = (n & 0xF) << 12 | method22968() << 6 | method22968();
            if (n3 < 2048) {
                throw new Class2354("Invalid continuation byte");
            }
            return method22970(n3, b) ? n3 : 65533;
        }
        else {
            final int n4 = (n & 0x1F) << 6 | method22968();
            if (n4 < 128) {
                throw new Class2354("Invalid continuation byte");
            }
            return n4;
        }
    }
    
    private static int method22968() throws UTF8Exception {
        if (Class7457.field28765 >= Class7457.field28764) {
            throw new Class2354("Invalid byte index");
        }
        final int n = Class7457.field28763[Class7457.field28765] & 0xFF;
        ++Class7457.field28765;
        if ((n & 0xC0) != 0x80) {
            throw new Class2354("Invalid continuation byte");
        }
        return n & 0x3F;
    }
    
    private static String method22969(final int[] array) {
        final StringBuilder sb = new StringBuilder();
        for (int length = array.length, i = 0; i < length; ++i) {
            sb.appendCodePoint(array[i]);
        }
        return sb.toString();
    }
    
    private static boolean method22970(final int i, final boolean b) throws UTF8Exception {
        if (i < 55296 || i > 57343) {
            return true;
        }
        if (!b) {
            return false;
        }
        throw new Class2354("Lone surrogate U+" + Integer.toHexString(i).toUpperCase() + " is not a scalar value");
    }
    
    private static int[] method22971(final List<Integer> list) {
        final int size = list.size();
        final int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = (int)list.get(i);
        }
        return array;
    }
}
