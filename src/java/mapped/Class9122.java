// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collections;
import org.java_websocket.exceptions.InvalidDataException;
import java.util.List;
import java.util.Locale;
import org.java_websocket.exceptions.InvalidHandshakeException;
import java.nio.ByteBuffer;

public abstract class Class9122
{
    public Class2091 field38659;
    public Class2058 field38660;
    
    public Class9122() {
        this.field38659 = null;
        this.field38660 = null;
    }
    
    public static ByteBuffer method33064(final ByteBuffer byteBuffer) {
        final ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte value = 48;
        while (byteBuffer.hasRemaining()) {
            final byte b = value;
            value = byteBuffer.get();
            allocate.put(value);
            if (b != 13) {
                continue;
            }
            if (value != 10) {
                continue;
            }
            allocate.limit();
            allocate.position();
            return allocate;
        }
        byteBuffer.position();
        return null;
    }
    
    public static String method33065(final ByteBuffer byteBuffer) {
        final ByteBuffer method33064 = method33064(byteBuffer);
        return (method33064 != null) ? Class8142.method26837(method33064.array(), 0, method33064.limit()) : null;
    }
    
    public static Class6091 method33066(final ByteBuffer byteBuffer, final Class2091 class2091) throws InvalidHandshakeException {
        final String method33065 = method33065(byteBuffer);
        if (method33065 == null) {
            throw new Class2372(byteBuffer.capacity() + 128);
        }
        final String[] split = method33065.split(" ", 3);
        if (split.length != 3) {
            throw new Class2321();
        }
        Class6091 class2092;
        if (class2091 != Class2091.field12095) {
            class2092 = method33067(split, method33065);
        }
        else {
            class2092 = method33068(split, method33065);
        }
        String s;
        for (s = method33065(byteBuffer); s != null && s.length() > 0; s = method33065(byteBuffer)) {
            final String[] split2 = s.split(":", 2);
            if (split2.length != 2) {
                throw new Class2321("not an http header");
            }
            if (!class2092.method18149(split2[0])) {
                class2092.method18148(split2[0], split2[1].replaceFirst("^ +", ""));
            }
            else {
                class2092.method18148(split2[0], class2092.method18145(split2[0]) + "; " + split2[1].replaceFirst("^ +", ""));
            }
        }
        if (s != null) {
            return class2092;
        }
        throw new Class2372();
    }
    
    private static Class6091 method33067(final String[] array, final String s) throws InvalidHandshakeException {
        if (!"GET".equalsIgnoreCase(array[0])) {
            throw new Class2321(String.format("Invalid request method received: %s Status line: %s", array[0], s));
        }
        if ("HTTP/1.1".equalsIgnoreCase(array[2])) {
            final Class6085 class6085 = new Class6085();
            class6085.method18143(array[1]);
            return class6085;
        }
        throw new Class2321(String.format("Invalid status line received: %s Status line: %s", array[2], s));
    }
    
    private static Class6091 method33068(final String[] array, final String s) throws InvalidHandshakeException {
        if (!"101".equals(array[1])) {
            throw new Class2321(String.format("Invalid status code received: %s Status line: %s", array[1], s));
        }
        if ("HTTP/1.1".equalsIgnoreCase(array[0])) {
            final Class6087 class6087 = new Class6087();
            final Class6088 class6088 = class6087;
            class6088.method18153(Short.parseShort(array[1]));
            class6088.method18152(array[2]);
            return class6087;
        }
        throw new Class2321(String.format("Invalid status line received: %s Status line: %s", array[0], s));
    }
    
    public abstract Class223 method33024(final Class6083 p0, final Class6089 p1) throws InvalidHandshakeException;
    
    public abstract Class223 method33022(final Class6083 p0) throws InvalidHandshakeException;
    
    public boolean method33069(final Class6090 class6090) {
        return class6090.method18145("Upgrade").equalsIgnoreCase("websocket") && class6090.method18145("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade");
    }
    
    public abstract ByteBuffer method33033(final Class2776 p0);
    
    public abstract List<Class2776> method33042(final ByteBuffer p0, final boolean p1);
    
    public abstract List<Class2776> method33043(final String p0, final boolean p1);
    
    public abstract void method33050(final Class958 p0, final Class2776 p1) throws InvalidDataException;
    
    public List<Class2776> method33070(final Class2058 class2058, final ByteBuffer byteBuffer, final boolean b) {
        if (class2058 != Class2058.field11746 && class2058 != Class2058.field11745) {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
        Class2770 o = null;
        if (this.field38660 != null) {
            o = new Class2769();
        }
        else if ((this.field38660 = class2058) == Class2058.field11746) {
            o = new Class2778();
        }
        else if (class2058 == Class2058.field11745) {
            o = new Class2777();
        }
        o.method9813(byteBuffer);
        o.method9814(b);
        try {
            o.method9804();
        }
        catch (final Class2319 cause) {
            throw new IllegalArgumentException(cause);
        }
        if (b) {
            this.field38660 = null;
        }
        else {
            this.field38660 = class2058;
        }
        return (List<Class2776>)Collections.singletonList(o);
    }
    
    public abstract void method33044();
    
    @Deprecated
    public List<ByteBuffer> method33071(final Class6090 class6090, final Class2091 class6091) {
        return this.method33072(class6090);
    }
    
    public List<ByteBuffer> method33072(final Class6090 class6090) {
        return this.method33074(class6090, true);
    }
    
    @Deprecated
    public List<ByteBuffer> method33073(final Class6090 class6090, final Class2091 class6091, final boolean b) {
        return this.method33074(class6090, b);
    }
    
    public List<ByteBuffer> method33074(final Class6090 class6090, final boolean b) {
        final StringBuilder sb = new StringBuilder(100);
        if (!(class6090 instanceof Class6083)) {
            if (!(class6090 instanceof Class6089)) {
                throw new IllegalArgumentException("unknown role");
            }
            sb.append("HTTP/1.1 101 ").append(((Class6089)class6090).method18150());
        }
        else {
            sb.append("GET ").append(((Class6083)class6090).method18142()).append(" HTTP/1.1");
        }
        sb.append("\r\n");
        final Iterator<String> method18144 = class6090.method18144();
        while (method18144.hasNext()) {
            final String str = method18144.next();
            final String method18145 = class6090.method18145(str);
            sb.append(str);
            sb.append(": ");
            sb.append(method18145);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        final byte[] method18146 = Class8142.method26835(sb.toString());
        final byte[] src = (byte[])(b ? class6090.method18146() : null);
        final ByteBuffer allocate = ByteBuffer.allocate(((src != null) ? src.length : 0) + method18146.length);
        allocate.put(method18146);
        if (src != null) {
            allocate.put(src);
        }
        allocate.flip();
        return Collections.singletonList(allocate);
    }
    
    public abstract Class6084 method33030(final Class6084 p0) throws InvalidHandshakeException;
    
    public abstract Class6091 method33031(final Class6083 p0, final Class6088 p1) throws InvalidHandshakeException;
    
    public abstract List<Class2776> method33041(final ByteBuffer p0) throws InvalidDataException;
    
    public abstract Class1979 method33061();
    
    public abstract Class9122 method33032();
    
    public Class6090 method33075(final ByteBuffer byteBuffer) throws InvalidHandshakeException {
        return method33066(byteBuffer, this.field38659);
    }
    
    public int method33076(final int n) throws InvalidDataException {
        if (n >= 0) {
            return n;
        }
        throw new Class2319(1002, "Negative count");
    }
    
    public int method33077(final Class6090 class6090) {
        final String method18145 = class6090.method18145("Sec-WebSocket-Version");
        if (method18145.length() > 0) {
            try {
                return new Integer(method18145.trim());
            }
            catch (final NumberFormatException ex) {
                return -1;
            }
        }
        return -1;
    }
    
    public void method33078(final Class2091 field38659) {
        this.field38659 = field38659;
    }
    
    public Class2091 method33079() {
        return this.field38659;
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
