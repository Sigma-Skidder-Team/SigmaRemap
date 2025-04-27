// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.net.IDN;
import java.util.concurrent.ThreadFactory;
import java.io.InterruptedIOException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.Closeable;
import java.util.regex.Pattern;
import java.nio.charset.Charset;

public final class Class7690
{
    public static final byte[] field30540;
    public static final String[] field30541;
    public static final Class1760 field30542;
    public static final Class7173 field30543;
    private static final Class1929 field30544;
    private static final Class1929 field30545;
    private static final Class1929 field30546;
    private static final Class1929 field30547;
    private static final Class1929 field30548;
    public static final Charset field30549;
    private static final Charset field30550;
    private static final Charset field30551;
    private static final Charset field30552;
    private static final Charset field30553;
    public static final TimeZone field30554;
    public static final Comparator<String> field30555;
    private static final Pattern field30556;
    
    private Class7690() {
    }
    
    public static void method24430(final long n, final long n2, final long n3) {
        if ((n2 | n3) >= 0L) {
            if (n2 <= n) {
                if (n - n2 >= n3) {
                    return;
                }
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public static boolean method24431(final Object o, final Object obj) {
        return Objects.equals(o, obj);
    }
    
    public static void method24432(final Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            }
            catch (final RuntimeException ex) {
                throw ex;
            }
            catch (final Exception ex2) {}
        }
    }
    
    public static void method24433(final Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            }
            catch (final AssertionError assertionError) {
                if (!method24444(assertionError)) {
                    throw assertionError;
                }
                goto Label_0023;
            }
            catch (final RuntimeException ex) {
                throw ex;
            }
            catch (final Exception ex2) {}
        }
    }
    
    public static void method24434(final ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            }
            catch (final RuntimeException ex) {
                throw ex;
            }
            catch (final Exception ex2) {}
        }
    }
    
    public static boolean method24435(final Class1682 class1682, final int n, final TimeUnit timeUnit) {
        try {
            return method24436(class1682, n, timeUnit);
        }
        catch (final IOException ex) {
            return false;
        }
    }
    
    public static boolean method24436(final Class1682 class1682, final int n, final TimeUnit timeUnit) throws IOException {
        final long nanoTime = System.nanoTime();
        final long a = class1682.method5921().method26299() ? (class1682.method5921().method26300() - nanoTime) : Long.MAX_VALUE;
        class1682.method5921().method26301(nanoTime + Math.min(a, timeUnit.toNanos(n)));
        try {
            final Class1680 class1683 = new Class1680();
            while (class1682.method6014(class1683, 8192L) != -1L) {
                class1683.method5994();
            }
            return true;
        }
        catch (final InterruptedIOException ex) {
            return false;
        }
        finally {
            if (a == Long.MAX_VALUE) {
                class1682.method5921().method26304();
            }
            else {
                class1682.method5921().method26301(nanoTime + a);
            }
        }
    }
    
    public static <T> List<T> method24437(final List<T> c) {
        return Collections.unmodifiableList(new ArrayList<T>(c));
    }
    
    public static <T> List<T> method24438(final T... array) {
        return Collections.unmodifiableList(Arrays.asList(array.clone()));
    }
    
    public static ThreadFactory method24439(final String s, final boolean b) {
        return new Class7368(s, b);
    }
    
    public static String[] method24440(final Comparator<? super String> comparator, final String[] array, final String[] array2) {
        final ArrayList list = new ArrayList();
        for (final String s : array) {
            for (int length2 = array2.length, j = 0; j < length2; ++j) {
                if (comparator.compare(s, array2[j]) == 0) {
                    list.add(s);
                    break;
                }
            }
        }
        return (String[])list.toArray(new String[list.size()]);
    }
    
    public static boolean method24441(final Comparator<String> comparator, final String[] array, final String[] array2) {
        if (array != null) {
            if (array2 != null) {
                if (array.length != 0) {
                    if (array2.length != 0) {
                        for (final String s : array) {
                            for (int length2 = array2.length, j = 0; j < length2; ++j) {
                                if (comparator.compare(s, array2[j]) == 0) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }
            }
        }
        return false;
    }
    
    public static String method24442(final Class8846 class8846, final boolean b) {
        final String str = class8846.method30936().contains(":") ? ("[" + class8846.method30936() + "]") : class8846.method30936();
        return (!b && class8846.method30937() == Class8846.method30938(class8846.method30930())) ? str : (str + ":" + class8846.method30937());
    }
    
    public static String method24443(final String s) {
        int codePoint;
        for (int i = 0, length = s.length(); i < length; i += Character.charCount(codePoint)) {
            codePoint = s.codePointAt(i);
            if (codePoint <= 31 || codePoint >= 127) {
                final Class1680 class1680 = new Class1680();
                class1680.method5998(s, 0, i);
                int codePoint2;
                for (int j = i; j < length; j += Character.charCount(codePoint2)) {
                    codePoint2 = s.codePointAt(j);
                    class1680.method5999((codePoint2 > 31 && codePoint2 < 127) ? codePoint2 : 63);
                }
                return class1680.method5980();
            }
        }
        return s;
    }
    
    public static boolean method24444(final AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            if (assertionError.getMessage() != null) {
                return assertionError.getMessage().contains("getsockname failed");
            }
        }
        return false;
    }
    
    public static int method24445(final Comparator<String> comparator, final String[] array, final String s) {
        for (int i = 0; i < array.length; ++i) {
            if (comparator.compare(array[i], s) == 0) {
                return i;
            }
        }
        return -1;
    }
    
    public static String[] method24446(final String[] array, final String s) {
        final String[] array2 = new String[array.length + 1];
        System.arraycopy(array, 0, array2, 0, array.length);
        array2[array2.length - 1] = s;
        return array2;
    }
    
    public static int method24447(final String s, final int n, final int n2) {
        int i = n;
        while (i < n2) {
            switch (s.charAt(i)) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ': {
                    ++i;
                    continue;
                }
                default: {
                    return i;
                }
            }
        }
        return n2;
    }
    
    public static int method24448(final String s, final int n, final int n2) {
        int i = n2 - 1;
        while (i >= n) {
            switch (s.charAt(i)) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ': {
                    --i;
                    continue;
                }
                default: {
                    return i + 1;
                }
            }
        }
        return n;
    }
    
    public static String method24449(final String s, final int n, final int n2) {
        final int method24447 = method24447(s, n, n2);
        return s.substring(method24447, method24448(s, method24447, n2));
    }
    
    public static int method24450(final String s, final int n, final int n2, final String s2) {
        for (int i = n; i < n2; ++i) {
            if (s2.indexOf(s.charAt(i)) != -1) {
                return i;
            }
        }
        return n2;
    }
    
    public static int method24451(final String s, final int n, final int n2, final char c) {
        for (int i = n; i < n2; ++i) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
        return n2;
    }
    
    public static String method24452(final String input) {
        try {
            final String lowerCase = IDN.toASCII(input).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (method24453(lowerCase)) {
                return null;
            }
            return lowerCase;
        }
        catch (final IllegalArgumentException ex) {
            return null;
        }
    }
    
    private static boolean method24453(final String s) {
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 <= '\u001f' || char1 >= '\u007f') {
                return true;
            }
            if (" #%/:?@[\\]".indexOf(char1) != -1) {
                return true;
            }
        }
        return false;
    }
    
    public static int method24454(final String s) {
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 <= '\u001f' || char1 >= '\u007f') {
                return i;
            }
        }
        return -1;
    }
    
    public static boolean method24455(final String input) {
        return Class7690.field30556.matcher(input).matches();
    }
    
    public static String method24456(final String format, final Object... args) {
        return String.format(Locale.US, format, args);
    }
    
    public static Charset method24457(final Class1681 class1681, final Charset charset) throws IOException {
        if (class1681.method6022(0L, Class7690.field30544)) {
            class1681.method5995(Class7690.field30544.method7766());
            return Class7690.field30549;
        }
        if (class1681.method6022(0L, Class7690.field30545)) {
            class1681.method5995(Class7690.field30545.method7766());
            return Class7690.field30550;
        }
        if (class1681.method6022(0L, Class7690.field30546)) {
            class1681.method5995(Class7690.field30546.method7766());
            return Class7690.field30551;
        }
        if (class1681.method6022(0L, Class7690.field30547)) {
            class1681.method5995(Class7690.field30547.method7766());
            return Class7690.field30552;
        }
        if (!class1681.method6022(0L, Class7690.field30548)) {
            return charset;
        }
        class1681.method5995(Class7690.field30548.method7766());
        return Class7690.field30553;
    }
    
    static {
        field30540 = new byte[0];
        field30541 = new String[0];
        field30542 = Class1760.method6291(null, Class7690.field30540);
        field30543 = Class7173.method21945(null, Class7690.field30540);
        field30544 = Class1929.method7758("efbbbf");
        field30545 = Class1929.method7758("feff");
        field30546 = Class1929.method7758("fffe");
        field30547 = Class1929.method7758("0000ffff");
        field30548 = Class1929.method7758("ffff0000");
        field30549 = StandardCharsets.UTF_8;
        field30550 = StandardCharsets.UTF_16BE;
        field30551 = StandardCharsets.UTF_16LE;
        field30552 = Charset.forName("UTF-32BE");
        field30553 = Charset.forName("UTF-32LE");
        field30554 = TimeZone.getTimeZone("GMT");
        field30555 = new Class4461();
        field30556 = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }
}
