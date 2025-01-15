// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Calendar;
import java.util.LinkedList;
import org.java_websocket.exceptions.LimitExceededException;
import org.java_websocket.exceptions.InvalidFrameException;
import java.math.BigInteger;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.IncompleteException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.nio.ByteBuffer;
import java.util.List;

public class Class9121 extends Class9122
{
    private static final String field38643 = "Sec-WebSocket-Key";
    private static final String field38644 = "Sec-WebSocket-Protocol";
    private static final String field38645 = "Sec-WebSocket-Extensions";
    private static final String field38646 = "Sec-WebSocket-Accept";
    private static final String field38647 = "Upgrade";
    private static final String field38648 = "Connection";
    private Class6054 field38649;
    private List<Class6054> field38650;
    private Class8038 field38651;
    private List<Class8038> field38652;
    private Class2776 field38653;
    private final List<ByteBuffer> field38654;
    private ByteBuffer field38655;
    private final Random field38656;
    private int field38657;
    public static final /* synthetic */ boolean field38658;
    
    public Class9121() {
        this(Collections.emptyList());
    }
    
    public Class9121(final Class6054 o) {
        this(Collections.singletonList(o));
    }
    
    public Class9121(final List<Class6054> list) {
        this(list, (List<Class8038>)Collections.singletonList(new Class8037("")));
    }
    
    public Class9121(final List<Class6054> list, final List<Class8038> list2) {
        this(list, list2, Integer.MAX_VALUE);
    }
    
    public Class9121(final List<Class6054> list, final int n) {
        this(list, (List<Class8038>)Collections.singletonList(new Class8037("")), n);
    }
    
    public Class9121(final List<Class6054> list, final List<Class8038> list2, final int field38657) {
        this.field38649 = new Class6052();
        this.field38656 = new Random();
        if (list != null) {
            if (list2 != null) {
                if (field38657 >= 1) {
                    this.field38650 = new ArrayList<Class6054>(list.size());
                    this.field38652 = new ArrayList<Class8038>(list2.size());
                    int n = 0;
                    this.field38654 = new ArrayList<ByteBuffer>();
                    final Iterator<Class6054> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        if (!iterator.next().getClass().equals(Class6052.class)) {
                            continue;
                        }
                        n = 1;
                    }
                    this.field38650.addAll(list);
                    if (n == 0) {
                        this.field38650.add(this.field38650.size(), this.field38649);
                    }
                    this.field38652.addAll(list2);
                    this.field38657 = field38657;
                    return;
                }
            }
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public Class223 method33022(final Class6083 class6083) throws InvalidHandshakeException {
        if (this.method33077(class6083) != 13) {
            return Class223.field784;
        }
        Class223 class6084 = Class223.field784;
        final String method18145 = class6083.method18145("Sec-WebSocket-Extensions");
        for (final Class6054 field38649 : this.field38650) {
            if (!field38649.method17983(method18145)) {
                continue;
            }
            this.field38649 = field38649;
            class6084 = Class223.field783;
            break;
        }
        if (this.method33023(class6083.method18145("Sec-WebSocket-Protocol")) == Class223.field783 && class6084 == Class223.field783) {
            return Class223.field783;
        }
        return Class223.field784;
    }
    
    private Class223 method33023(final String s) {
        for (final Class8038 field38651 : this.field38652) {
            if (!field38651.method26367(s)) {
                continue;
            }
            this.field38651 = field38651;
            return Class223.field783;
        }
        return Class223.field784;
    }
    
    @Override
    public Class223 method33024(final Class6083 class6083, final Class6089 class6084) throws InvalidHandshakeException {
        if (!this.method33069(class6084)) {
            return Class223.field784;
        }
        if (!class6083.method18149("Sec-WebSocket-Key") || !class6084.method18149("Sec-WebSocket-Accept")) {
            return Class223.field784;
        }
        if (!this.method33046(class6083.method18145("Sec-WebSocket-Key")).equals(class6084.method18145("Sec-WebSocket-Accept"))) {
            return Class223.field784;
        }
        Class223 class6085 = Class223.field784;
        final String method18145 = class6084.method18145("Sec-WebSocket-Extensions");
        for (final Class6054 field38649 : this.field38650) {
            if (!field38649.method17984(method18145)) {
                continue;
            }
            this.field38649 = field38649;
            class6085 = Class223.field783;
            break;
        }
        if (this.method33023(class6084.method18145("Sec-WebSocket-Protocol")) == Class223.field783 && class6085 == Class223.field783) {
            return Class223.field783;
        }
        return Class223.field784;
    }
    
    public Class6054 method33025() {
        return this.field38649;
    }
    
    public List<Class6054> method33026() {
        return this.field38650;
    }
    
    public Class8038 method33027() {
        return this.field38651;
    }
    
    public int method33028() {
        return this.field38657;
    }
    
    public List<Class8038> method33029() {
        return this.field38652;
    }
    
    @Override
    public Class6084 method33030(final Class6084 class6084) {
        class6084.method18148("Upgrade", "websocket");
        class6084.method18148("Connection", "Upgrade");
        final byte[] bytes = new byte[16];
        this.field38656.nextBytes(bytes);
        class6084.method18148("Sec-WebSocket-Key", Class7447.method22903(bytes));
        class6084.method18148("Sec-WebSocket-Version", "13");
        final StringBuilder sb = new StringBuilder();
        for (final Class6054 class6085 : this.field38650) {
            if (class6085.method17986() == null) {
                continue;
            }
            if (class6085.method17986().length() == 0) {
                continue;
            }
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(class6085.method17986());
        }
        if (sb.length() != 0) {
            class6084.method18148("Sec-WebSocket-Extensions", sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder();
        for (final Class8038 class6086 : this.field38652) {
            if (class6086.method26368().length() == 0) {
                continue;
            }
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(class6086.method26368());
        }
        if (sb2.length() != 0) {
            class6084.method18148("Sec-WebSocket-Protocol", sb2.toString());
        }
        return class6084;
    }
    
    @Override
    public Class6091 method33031(final Class6083 class6083, final Class6088 class6084) throws InvalidHandshakeException {
        class6084.method18148("Upgrade", "websocket");
        class6084.method18148("Connection", class6083.method18145("Connection"));
        final String method18145 = class6083.method18145("Sec-WebSocket-Key");
        if (method18145 != null) {
            class6084.method18148("Sec-WebSocket-Accept", this.method33046(method18145));
            if (this.method33025().method17987().length() != 0) {
                class6084.method18148("Sec-WebSocket-Extensions", this.method33025().method17987());
            }
            if (this.method33027() != null) {
                if (this.method33027().method26368().length() != 0) {
                    class6084.method18148("Sec-WebSocket-Protocol", this.method33027().method26368());
                }
            }
            class6084.method18152("Web Socket Protocol Handshake");
            class6084.method18148("Server", "TooTallNate Java-WebSocket");
            class6084.method18148("Date", this.method33045());
            return class6084;
        }
        throw new Class2321("missing Sec-WebSocket-Key");
    }
    
    @Override
    public Class9122 method33032() {
        final ArrayList list = new ArrayList();
        final Iterator<Class6054> iterator = this.method33026().iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().method17988());
        }
        final ArrayList<Class8038> list2 = new ArrayList<Class8038>();
        final Iterator<Class8038> iterator2 = this.method33029().iterator();
        while (iterator2.hasNext()) {
            list2.add(iterator2.next().method26369());
        }
        return new Class9121(list, list2, this.field38657);
    }
    
    @Override
    public ByteBuffer method33033(final Class2776 class2776) {
        this.method33025().method17982(class2776);
        return this.method33034(class2776);
    }
    
    private ByteBuffer method33034(final Class2776 class2776) {
        final ByteBuffer method9811 = class2776.method9811();
        final boolean b = this.field38659 == Class2091.field12095;
        final int method9812 = this.method33040(method9811);
        final ByteBuffer allocate = ByteBuffer.allocate(1 + ((method9812 <= 1) ? method9812 : (method9812 + 1)) + (b ? 4 : 0) + method9811.remaining());
        allocate.put((byte)((byte)(class2776.method9808() ? -128 : 0) | this.method33048(class2776.method9809())));
        final byte[] method9813 = this.method33047(method9811.remaining(), method9812);
        if (!Class9121.field38658 && method9813.length != method9812) {
            throw new AssertionError();
        }
        if (method9812 != 1) {
            if (method9812 != 2) {
                if (method9812 != 8) {
                    throw new IllegalStateException("Size representation not supported/specified");
                }
                allocate.put((byte)(0x7F | this.method33039(b)));
                allocate.put(method9813);
            }
            else {
                allocate.put((byte)(0x7E | this.method33039(b)));
                allocate.put(method9813);
            }
        }
        else {
            allocate.put((byte)(method9813[0] | this.method33039(b)));
        }
        if (!b) {
            allocate.put(method9811);
            method9811.flip();
        }
        else {
            final ByteBuffer allocate2 = ByteBuffer.allocate(4);
            allocate2.putInt(this.field38656.nextInt());
            allocate.put(allocate2.array());
            int n = 0;
            while (method9811.hasRemaining()) {
                allocate.put((byte)(method9811.get() ^ allocate2.get(n % 4)));
                ++n;
            }
        }
        if (!Class9121.field38658 && allocate.remaining() != 0) {
            throw new AssertionError(allocate.remaining());
        }
        allocate.flip();
        return allocate;
    }
    
    private Class2776 method33035(final ByteBuffer byteBuffer) throws IncompleteException, InvalidDataException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        }
        final int remaining = byteBuffer.remaining();
        int method29802 = 2;
        this.method33038(remaining, method29802);
        final byte value = byteBuffer.get();
        final boolean b = value >> 8 != 0;
        final boolean b2 = false;
        final boolean b3 = false;
        final boolean b4 = false;
        final byte value2 = byteBuffer.get();
        final boolean b5 = (value2 & 0xFFFFFF80) != 0x0;
        int method29803 = (byte)(value2 & 0x7F);
        final Class2058 method29804 = this.method33049((byte)(value & 0xF));
        while (true) {
            final int n;
            Label_0170: {
                if (method29803 >= 0) {
                    if (method29803 <= 125) {
                        break Label_0170;
                    }
                }
                if ((n & Integer.MAX_VALUE) != 0x0) {
                    final Class8692 method29805 = this.method33036(byteBuffer, method29804, method29803, remaining, method29802);
                    method29803 = Class8692.method29801(method29805);
                    method29802 = Class8692.method29802(method29805);
                }
            }
            if ((n & 0x2) != 0x0) {
                this.method33037(method29803);
                this.method33038(remaining, method29802 + (b5 ? 4 : 0) + method29803);
                final ByteBuffer allocate = ByteBuffer.allocate(this.method33076(method29803));
                if (!b5) {
                    allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
                    byteBuffer.position();
                }
                else {
                    final byte[] dst = new byte[4];
                    byteBuffer.get(dst);
                    for (int i = 0; i < method29803; ++i) {
                        allocate.put((byte)(byteBuffer.get() ^ dst[i % 4]));
                    }
                }
                final Class2771 method29806 = Class2771.method9819(method29804);
                method29806.method9814(b);
                method29806.method9815(b2);
                method29806.method9816(b3);
                method29806.method9817(b4);
                allocate.flip();
                method29806.method9813(allocate);
                this.method33025().method17985(method29806);
                this.method33025().method17981(method29806);
                method29806.method9804();
                return method29806;
            }
            continue;
        }
    }
    
    private Class8692 method33036(final ByteBuffer byteBuffer, final Class2058 class2058, final int n, final int n2, final int n3) throws InvalidFrameException, IncompleteException, LimitExceededException {
        int n4 = n3;
        if (class2058 != Class2058.field11747) {
            if (class2058 != Class2058.field11748) {
                if (class2058 != Class2058.field11749) {
                    int intValue;
                    if (n != 126) {
                        n4 += 8;
                        this.method33038(n2, n4);
                        final byte[] val = new byte[8];
                        for (int i = 0; i < 8; ++i) {
                            val[i] = byteBuffer.get();
                        }
                        final long longValue = new BigInteger(val).longValue();
                        this.method33037(longValue);
                        intValue = (int)longValue;
                    }
                    else {
                        n4 += 2;
                        this.method33038(n2, n4);
                        intValue = new BigInteger(new byte[] { 0, byteBuffer.get(), byteBuffer.get() }).intValue();
                    }
                    return new Class8692(this, intValue, n4);
                }
            }
        }
        throw new Class2322("more than 125 octets");
    }
    
    private void method33037(final long n) throws LimitExceededException {
        if (n > 2147483647L) {
            throw new Class2320("Payloadsize is to big...");
        }
        if (n > this.field38657) {
            throw new Class2320("Payload limit reached.", this.field38657);
        }
        if (n >= 0L) {
            return;
        }
        throw new Class2320("Payloadsize is to little...");
    }
    
    private void method33038(final int n, final int n2) throws IncompleteException {
        if (n >= n2) {
            return;
        }
        throw new Class2398(n2);
    }
    
    private byte method33039(final boolean b) {
        return (byte)(b ? -128 : 0);
    }
    
    private int method33040(final ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 125) {
            return 1;
        }
        if (byteBuffer.remaining() > 65535) {
            return 8;
        }
        return 2;
    }
    
    @Override
    public List<Class2776> method33041(final ByteBuffer src) throws InvalidDataException {
        LinkedList list;
        while (true) {
            list = new LinkedList();
            if (this.field38655 == null) {
                break;
            }
            ByteBuffer allocate;
            try {
                src.mark();
                final int remaining = src.remaining();
                final int remaining2 = this.field38655.remaining();
                if (remaining2 > remaining) {
                    this.field38655.put(src.array(), src.position(), remaining);
                    src.position();
                    return Collections.emptyList();
                }
                this.field38655.put(src.array(), src.position(), remaining2);
                src.position();
                list.add(this.method33035((ByteBuffer)this.field38655.duplicate().position()));
                this.field38655 = null;
                break;
            }
            catch (final Class2398 class2398) {
                allocate = ByteBuffer.allocate(this.method33076(class2398.method9517()));
                if (!Class9121.field38658 && allocate.limit() <= this.field38655.limit()) {
                    throw new AssertionError();
                }
            }
            this.field38655.rewind();
            allocate.put(this.field38655);
            this.field38655 = allocate;
        }
        while (src.hasRemaining()) {
            src.mark();
            try {
                list.add(this.method33035(src));
                continue;
            }
            catch (final Class2398 class2399) {
                src.reset();
                (this.field38655 = ByteBuffer.allocate(this.method33076(class2399.method9517()))).put(src);
            }
            break;
        }
        return list;
    }
    
    @Override
    public List<Class2776> method33042(final ByteBuffer byteBuffer, final boolean b) {
        final Class2778 o = new Class2778();
        o.method9813(byteBuffer);
        o.method9818(b);
        try {
            o.method9804();
        }
        catch (final Class2319 class2319) {
            throw new Class2385(class2319);
        }
        return (List<Class2776>)Collections.singletonList(o);
    }
    
    @Override
    public List<Class2776> method33043(final String s, final boolean b) {
        final Class2777 o = new Class2777();
        o.method9813(ByteBuffer.wrap(Class8142.method26834(s)));
        o.method9818(b);
        try {
            o.method9804();
        }
        catch (final Class2319 class2319) {
            throw new Class2385(class2319);
        }
        return (List<Class2776>)Collections.singletonList(o);
    }
    
    @Override
    public void method33044() {
        this.field38655 = null;
        if (this.field38649 != null) {
            this.field38649.method17989();
        }
        this.field38649 = new Class6052();
        this.field38651 = null;
    }
    
    private String method33045() {
        final Calendar instance = Calendar.getInstance();
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(instance.getTime());
    }
    
    private String method33046(final String s) {
        final String string = s.trim() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
        MessageDigest instance;
        try {
            instance = MessageDigest.getInstance("SHA1");
        }
        catch (final NoSuchAlgorithmException cause) {
            throw new IllegalStateException(cause);
        }
        return Class7447.method22903(instance.digest(string.getBytes()));
    }
    
    private byte[] method33047(final long n, final int n2) {
        final byte[] array = new byte[n2];
        final int n3 = 8 * n2 - 8;
        for (int i = 0; i < n2; ++i) {
            array[i] = (byte)(n >>> n3 - 8 * i);
        }
        return array;
    }
    
    private byte method33048(final Class2058 class2058) {
        if (class2058 == Class2058.field11744) {
            return 0;
        }
        if (class2058 == Class2058.field11745) {
            return 1;
        }
        if (class2058 == Class2058.field11746) {
            return 2;
        }
        if (class2058 == Class2058.field11749) {
            return 8;
        }
        if (class2058 == Class2058.field11747) {
            return 9;
        }
        if (class2058 != Class2058.field11748) {
            throw new IllegalArgumentException("Don't know how to handle " + class2058.toString());
        }
        return 10;
    }
    
    private Class2058 method33049(final byte b) throws InvalidFrameException {
        switch (b) {
            case 0: {
                return Class2058.field11744;
            }
            case 1: {
                return Class2058.field11745;
            }
            case 2: {
                return Class2058.field11746;
            }
            case 8: {
                return Class2058.field11749;
            }
            case 9: {
                return Class2058.field11747;
            }
            case 10: {
                return Class2058.field11748;
            }
            default: {
                throw new Class2322("Unknown opcode " + b);
            }
        }
    }
    
    @Override
    public void method33050(final Class958 class958, final Class2776 class959) throws InvalidDataException {
        final Class2058 method9809 = class959.method9809();
        if (method9809 != Class2058.field11749) {
            if (method9809 != Class2058.field11747) {
                if (method9809 != Class2058.field11748) {
                    if (class959.method9808() && method9809 != Class2058.field11744) {
                        if (this.field38653 != null) {
                            throw new Class2319(1002, "Continuous frame sequence not completed.");
                        }
                        if (method9809 != Class2058.field11745) {
                            if (method9809 != Class2058.field11746) {
                                throw new Class2319(1002, "non control or continious frame expected");
                            }
                            this.method33052(class958, class959);
                        }
                        else {
                            this.method33054(class958, class959);
                        }
                    }
                    else {
                        this.method33051(class958, class959, method9809);
                    }
                }
                else {
                    class958.method5530();
                    class958.method5531().method5553(class958, class959);
                }
            }
            else {
                class958.method5531().method5552(class958, class959);
            }
        }
        else {
            this.method33057(class958, class959);
        }
    }
    
    private void method33051(final Class958 class958, final Class2776 class959, final Class2058 class960) throws InvalidDataException {
        if (class960 == Class2058.field11744) {
            if (!class959.method9808()) {
                if (this.field38653 == null) {
                    throw new Class2319(1002, "Continuous frame sequence was not started.");
                }
            }
            else {
                this.method33055(class958, class959);
            }
        }
        else {
            this.method33056(class959);
        }
        if (class960 == Class2058.field11745 && !Class8142.method26841(class959.method9811())) {
            throw new Class2319(1007);
        }
        if (class960 == Class2058.field11744) {
            if (this.field38653 != null) {
                this.method33059(class959.method9811());
            }
        }
    }
    
    private void method33052(final Class958 class958, final Class2776 class959) {
        try {
            class958.method5531().method5468(class958, class959.method9811());
        }
        catch (final RuntimeException ex) {
            this.method33053(class958, ex);
        }
    }
    
    private void method33053(final Class958 class958, final RuntimeException ex) {
        class958.method5531().method5471(class958, ex);
    }
    
    private void method33054(final Class958 class958, final Class2776 class959) throws InvalidDataException {
        try {
            class958.method5531().method5467(class958, Class8142.method26839(class959.method9811()));
        }
        catch (final RuntimeException ex) {
            this.method33053(class958, ex);
        }
    }
    
    private void method33055(final Class958 class958, final Class2776 class959) throws InvalidDataException {
        if (this.field38653 == null) {
            throw new Class2319(1002, "Continuous frame sequence was not started.");
        }
        this.method33059(class959.method9811());
        this.method33060();
        if (this.field38653.method9809() == Class2058.field11745) {
            ((Class2771)this.field38653).method9813(this.method33062());
            ((Class2771)this.field38653).method9804();
            try {
                class958.method5531().method5467(class958, Class8142.method26839(this.field38653.method9811()));
            }
            catch (final RuntimeException ex) {
                this.method33053(class958, ex);
            }
        }
        else if (this.field38653.method9809() == Class2058.field11746) {
            ((Class2771)this.field38653).method9813(this.method33062());
            ((Class2771)this.field38653).method9804();
            try {
                class958.method5531().method5468(class958, this.field38653.method9811());
            }
            catch (final RuntimeException ex2) {
                this.method33053(class958, ex2);
            }
        }
        this.field38653 = null;
        this.method33058();
    }
    
    private void method33056(final Class2776 field38653) throws InvalidDataException {
        if (this.field38653 == null) {
            this.field38653 = field38653;
            this.method33059(field38653.method9811());
            this.method33060();
            return;
        }
        throw new Class2319(1002, "Previous continuous frame sequence not completed.");
    }
    
    private void method33057(final Class958 class958, final Class2776 class959) {
        int method9822 = 1005;
        String method9823 = "";
        if (class959 instanceof Class2775) {
            final Class2775 class960 = (Class2775)class959;
            method9822 = class960.method9822();
            method9823 = class960.method9823();
        }
        if (class958.method5466() != Class2154.field12797) {
            if (this.method33061() != Class1979.field10970) {
                class958.method5519(method9822, method9823, false);
            }
            else {
                class958.method5515(method9822, method9823, true);
            }
        }
        else {
            class958.method5516(method9822, method9823, true);
        }
    }
    
    private void method33058() {
        synchronized (this.field38654) {
            this.field38654.clear();
        }
    }
    
    private void method33059(final ByteBuffer byteBuffer) {
        synchronized (this.field38654) {
            this.field38654.add(byteBuffer);
        }
    }
    
    private void method33060() throws LimitExceededException {
        if (this.method33063() <= this.field38657) {
            return;
        }
        this.method33058();
        throw new Class2320(this.field38657);
    }
    
    @Override
    public Class1979 method33061() {
        return Class1979.field10970;
    }
    
    @Override
    public String toString() {
        String str = super.toString();
        if (this.method33025() != null) {
            str = str + " extension: " + this.method33025().toString();
        }
        if (this.method33027() != null) {
            str = str + " protocol: " + this.method33027().toString();
        }
        return str + " max frame size: " + this.field38657;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final Class9121 class9121 = (Class9121)o;
        if (this.field38657 == class9121.method33028()) {
            if (this.field38649 == null) {
                if (class9121.method33025() != null) {
                    return false;
                }
            }
            else if (!this.field38649.equals(class9121.method33025())) {
                return false;
            }
            return (this.field38651 == null) ? (class9121.method33027() == null) : this.field38651.equals(class9121.method33027());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * ((this.field38649 == null) ? 0 : this.field38649.hashCode()) + ((this.field38651 == null) ? 0 : this.field38651.hashCode())) + (this.field38657 ^ this.field38657 >>> 32);
    }
    
    private ByteBuffer method33062() throws LimitExceededException {
        long n = 0L;
        final ByteBuffer allocate;
        synchronized (this.field38654) {
            final Iterator<ByteBuffer> iterator = this.field38654.iterator();
            while (iterator.hasNext()) {
                n += iterator.next().limit();
            }
            this.method33060();
            allocate = ByteBuffer.allocate((int)n);
            final Iterator<ByteBuffer> iterator2 = this.field38654.iterator();
            while (iterator2.hasNext()) {
                allocate.put(iterator2.next());
            }
        }
        allocate.flip();
        return allocate;
    }
    
    private long method33063() {
        long n = 0L;
        synchronized (this.field38654) {
            final Iterator<ByteBuffer> iterator = this.field38654.iterator();
            while (iterator.hasNext()) {
                n += iterator.next().limit();
            }
        }
        return n;
    }
    
    static {
        field38658 = !Class9121.class.desiredAssertionStatus();
    }
}
