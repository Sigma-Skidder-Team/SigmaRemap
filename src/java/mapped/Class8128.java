// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.HashMap;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import io.socket.utf8.UTF8Exception;
import java.util.Map;

public class Class8128
{
    private static final int field33481;
    public static final int field33482 = 3;
    private static final Map<String, Integer> field33483;
    private static final Map<Integer, String> field33484;
    private static Class8437<String> field33485;
    private static Class8169 field33486;
    
    private Class8128() {
    }
    
    public static void method26773(final Class8437 class8437, final Class7284 class8438) throws UTF8Exception {
        method26774(class8437, false, class8438);
    }
    
    public static void method26774(final Class8437 class8437, final boolean b, final Class7284 class8438) throws UTF8Exception {
        if (!(class8437.field34679 instanceof byte[])) {
            String str = String.valueOf(Class8128.field33483.get(class8437.field34678));
            if (null != class8437.field34679) {
                str += (b ? Class7457.method22961(String.valueOf(class8437.field34679), Class8128.field33486) : String.valueOf(class8437.field34679));
            }
            class8438.method22343(str);
            return;
        }
        method26775(class8437, class8438);
    }
    
    private static void method26775(final Class8437<byte[]> class8437, final Class7284<byte[]> class8438) {
        final byte[] array = class8437.field34679;
        final byte[] array2 = new byte[1 + array.length];
        array2[0] = Class8128.field33483.get(class8437.field34678).byteValue();
        System.arraycopy(array, 0, array2, 1, array.length);
        class8438.method22343(array2);
    }
    
    public static Class8437<String> method26776(final String s) {
        return method26777(s, false);
    }
    
    public static Class8437<String> method26777(String method22963, final boolean b) {
        if (method22963 == null) {
            return Class8128.field33485;
        }
        int numericValue;
        try {
            numericValue = Character.getNumericValue(method22963.charAt(0));
        }
        catch (final IndexOutOfBoundsException ex) {
            numericValue = -1;
        }
        if (b) {
            try {
                method22963 = Class7457.method22963(method22963, Class8128.field33486);
            }
            catch (final Class2354 class2354) {
                return Class8128.field33485;
            }
        }
        if (numericValue < 0 || numericValue >= Class8128.field33484.size()) {
            return Class8128.field33485;
        }
        if (method22963.length() > 1) {
            return new Class8437<String>(Class8128.field33484.get(numericValue), method22963.substring(1));
        }
        return new Class8437<String>(Class8128.field33484.get(numericValue));
    }
    
    public static Class8437<byte[]> method26778(final byte[] array) {
        final byte i = array[0];
        final byte[] array2 = new byte[array.length - 1];
        System.arraycopy(array, 1, array2, 0, array2.length);
        return new Class8437<byte[]>(Class8128.field33484.get((int)i), array2);
    }
    
    public static void method26779(final Class8437[] array, final Class7284 class7284) throws UTF8Exception {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i].field34679 instanceof byte[]) {
                method26781(array, class7284);
                return;
            }
        }
        if (array.length != 0) {
            final StringBuilder sb = new StringBuilder();
            for (int length2 = array.length, j = 0; j < length2; ++j) {
                method26774(array[j], false, new Class7288(sb));
            }
            class7284.method22343(sb.toString());
            return;
        }
        class7284.method22343("0:");
    }
    
    private static String method26780(final String str) {
        return str.length() + ":" + str;
    }
    
    private static void method26781(final Class8437[] array, final Class7284<byte[]> class7284) throws UTF8Exception {
        if (array.length != 0) {
            final ArrayList list = new ArrayList(array.length);
            for (int length = array.length, i = 0; i < length; ++i) {
                method26782(array[i], new Class7286(list));
            }
            class7284.method22343(Class7839.method25324(list.toArray(new byte[list.size()][])));
            return;
        }
        class7284.method22343(new byte[0]);
    }
    
    private static void method26782(final Class8437 class8437, final Class7284<byte[]> class8438) throws UTF8Exception {
        method26774(class8437, true, new Class7287(class8438));
    }
    
    public static void method26783(final String s, final Class8138<String> class8138) {
        if (s == null || s.length() == 0) {
            class8138.method26817(Class8128.field33485, 0, 1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0, length = s.length(); i < length; ++i) {
            final char char1 = s.charAt(i);
            if (':' != char1) {
                sb.append(char1);
            }
            else {
                int int1;
                try {
                    int1 = Integer.parseInt(sb.toString());
                }
                catch (final NumberFormatException ex) {
                    class8138.method26817(Class8128.field33485, 0, 1);
                    return;
                }
                String substring;
                try {
                    substring = s.substring(i + 1, i + 1 + int1);
                }
                catch (final IndexOutOfBoundsException ex2) {
                    class8138.method26817(Class8128.field33485, 0, 1);
                    return;
                }
                if (substring.length() != 0) {
                    final Class8437<String> method26777 = method26777(substring, false);
                    if (Class8128.field33485.field34678.equals(method26777.field34678) && Class8128.field33485.field34679.equals(method26777.field34679)) {
                        class8138.method26817(Class8128.field33485, 0, 1);
                        return;
                    }
                    if (!class8138.method26817(method26777, i + int1, length)) {
                        return;
                    }
                }
                i += int1;
                sb = new StringBuilder();
            }
        }
        if (sb.length() > 0) {
            class8138.method26817(Class8128.field33485, 0, 1);
        }
    }
    
    public static void method26784(final byte[] array, final Class8138 class8138) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(array);
        final ArrayList list = new ArrayList();
        while (byteBuffer.capacity() > 0) {
            final StringBuilder sb = new StringBuilder();
            final boolean b = (byteBuffer.get(0) & 0xFF) == 0x0;
            int n = 1;
            while (true) {
                final int i = byteBuffer.get(n) & 0xFF;
                if (i == 255) {
                    byteBuffer.position();
                    final ByteBuffer slice = byteBuffer.slice();
                    final int int1 = Integer.parseInt(sb.toString());
                    slice.position();
                    slice.limit();
                    final byte[] dst = new byte[slice.remaining()];
                    slice.get(dst);
                    if (!b) {
                        list.add(dst);
                    }
                    else {
                        list.add(method26785(dst));
                    }
                    slice.clear();
                    slice.position();
                    byteBuffer = slice.slice();
                    break;
                }
                if (sb.length() > Class8128.field33481) {
                    class8138.method26817(Class8128.field33485, 0, 1);
                    return;
                }
                sb.append(i);
                ++n;
            }
        }
        for (int size = list.size(), j = 0; j < size; ++j) {
            final Object value = list.get(j);
            if (!(value instanceof String)) {
                if (value instanceof byte[]) {
                    class8138.method26817(method26778((byte[])value), j, size);
                }
            }
            else {
                class8138.method26817(method26777((String)value, true), j, size);
            }
        }
    }
    
    private static String method26785(final byte[] array) {
        final StringBuilder sb = new StringBuilder();
        for (int length = array.length, i = 0; i < length; ++i) {
            sb.appendCodePoint(array[i] & 0xFF);
        }
        return sb.toString();
    }
    
    private static byte[] method26786(final String seq) {
        final int length = seq.length();
        final byte[] array = new byte[length];
        for (int i = 0; i < length; ++i) {
            array[i] = (byte)Character.codePointAt(seq, i);
        }
        return array;
    }
    
    static {
        field33481 = String.valueOf(Integer.MAX_VALUE).length();
        field33483 = new Class31();
        field33484 = new HashMap<Integer, String>();
        for (final Map.Entry<K, Integer> entry : Class8128.field33483.entrySet()) {
            Class8128.field33484.put(entry.getValue(), (String)entry.getKey());
        }
        Class8128.field33485 = new Class8437<String>("error", "parser error");
        Class8128.field33486 = new Class8169();
        Class8128.field33486.field33652 = false;
    }
}
