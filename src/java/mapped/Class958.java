// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.InetSocketAddress;
import org.java_websocket.exceptions.InvalidHandshakeException;
import java.util.Collections;
import java.util.Collection;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.ArrayList;
import java.util.List;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;

public class Class958 implements Class957
{
    public static final int field5077 = 80;
    public static final int field5078 = 443;
    public static final int field5079 = 16384;
    public final BlockingQueue<ByteBuffer> field5080;
    public final BlockingQueue<ByteBuffer> field5081;
    private final Class962 field5082;
    private SelectionKey field5083;
    private ByteChannel field5084;
    private Class899 field5085;
    private boolean field5086;
    private volatile Class2154 field5087;
    private List<Class9122> field5088;
    private Class9122 field5089;
    private Class2091 field5090;
    private ByteBuffer field5091;
    private Class6083 field5092;
    private String field5093;
    private Integer field5094;
    private Boolean field5095;
    private String field5096;
    private long field5097;
    private final Object field5098;
    private Class2773 field5099;
    private Object field5100;
    public static final /* synthetic */ boolean field5101;
    
    public Class958(final Class962 class962, final List<Class9122> field5088) {
        this(class962, (Class9122)null);
        this.field5090 = Class2091.field12096;
        if (field5088 != null && !field5088.isEmpty()) {
            this.field5088 = field5088;
        }
        else {
            (this.field5088 = new ArrayList<Class9122>()).add(new Class9121());
        }
    }
    
    public Class958(final Class962 field5082, final Class9122 class9122) {
        this.field5086 = false;
        this.field5087 = Class2154.field12795;
        this.field5089 = null;
        this.field5091 = ByteBuffer.allocate(0);
        this.field5092 = null;
        this.field5093 = null;
        this.field5094 = null;
        this.field5095 = null;
        this.field5096 = null;
        this.field5097 = System.nanoTime();
        this.field5098 = new Object();
        if (field5082 != null && (class9122 != null || this.field5090 != Class2091.field12096)) {
            this.field5080 = new LinkedBlockingQueue<ByteBuffer>();
            this.field5081 = new LinkedBlockingQueue<ByteBuffer>();
            this.field5082 = field5082;
            this.field5090 = Class2091.field12095;
            if (class9122 != null) {
                this.field5089 = class9122.method33032();
            }
            return;
        }
        throw new IllegalArgumentException("parameters must not be null");
    }
    
    public void method5509(final ByteBuffer byteBuffer) {
        if (!Class958.field5101 && !byteBuffer.hasRemaining()) {
            throw new AssertionError();
        }
        if (this.field5087 == Class2154.field12795) {
            if (this.method5510(byteBuffer)) {
                if (!this.method5492()) {
                    if (!this.method5491()) {
                        if (!Class958.field5101) {
                            if (this.field5091.hasRemaining() == byteBuffer.hasRemaining()) {
                                if (byteBuffer.hasRemaining()) {
                                    throw new AssertionError();
                                }
                            }
                        }
                        if (!byteBuffer.hasRemaining()) {
                            if (this.field5091.hasRemaining()) {
                                this.method5511(this.field5091);
                            }
                        }
                        else {
                            this.method5511(byteBuffer);
                        }
                    }
                }
            }
        }
        else if (this.field5087 == Class2154.field12796) {
            this.method5511(byteBuffer);
        }
    }
    
    private boolean method5510(final ByteBuffer byteBuffer) {
        ByteBuffer field5091;
        if (this.field5091.capacity() == 0) {
            field5091 = byteBuffer;
        }
        else {
            if (this.field5091.remaining() < byteBuffer.remaining()) {
                final ByteBuffer allocate = ByteBuffer.allocate(this.field5091.capacity() + byteBuffer.remaining());
                this.field5091.flip();
                allocate.put(this.field5091);
                this.field5091 = allocate;
            }
            this.field5091.put(byteBuffer);
            this.field5091.flip();
            field5091 = this.field5091;
        }
        field5091.mark();
        try {
            try {
                if (this.field5090 == Class2091.field12096) {
                    if (this.field5089 == null) {
                        final Iterator<Class9122> iterator = this.field5088.iterator();
                        while (iterator.hasNext()) {
                            final Class9122 method33032 = iterator.next().method33032();
                            try {
                                method33032.method33078(this.field5090);
                                field5091.reset();
                                final Class6090 method33033 = method33032.method33075(field5091);
                                if (!(method33033 instanceof Class6083)) {
                                    this.method5512(new Class2319(1002, "wrong http function"));
                                    return false;
                                }
                                final Class6083 class6083 = (Class6083)method33033;
                                if (method33032.method33022(class6083) == Class223.field783) {
                                    this.field5096 = class6083.method18142();
                                    Class6088 method33034;
                                    try {
                                        method33034 = this.field5082.method5549(this, method33032, class6083);
                                    }
                                    catch (final Class2319 class6084) {
                                        this.method5512(class6084);
                                        return false;
                                    }
                                    catch (final RuntimeException ex) {
                                        this.field5082.method5471(this, ex);
                                        this.method5513(ex);
                                        return false;
                                    }
                                    this.method5525(method33032.method33072(method33032.method33031(class6083, method33034)));
                                    this.field5089 = method33032;
                                    this.method5526(class6083);
                                    return true;
                                }
                                continue;
                            }
                            catch (final Class2321 class6085) {}
                        }
                        if (this.field5089 == null) {
                            this.method5512(new Class2319(1002, "no draft matches"));
                        }
                        return false;
                    }
                    final Class6090 method33035 = this.field5089.method33075(field5091);
                    if (!(method33035 instanceof Class6083)) {
                        this.method5519(1002, "wrong http function", false);
                        return false;
                    }
                    final Class6083 class6086 = (Class6083)method33035;
                    if (this.field5089.method33022(class6086) == Class223.field783) {
                        this.method5526(class6086);
                        return true;
                    }
                    this.method5495(1002, "the handshake did finally not match");
                    return false;
                }
                else if (this.field5090 == Class2091.field12095) {
                    this.field5089.method33078(this.field5090);
                    final Class6090 method33036 = this.field5089.method33075(field5091);
                    if (!(method33036 instanceof Class6089)) {
                        this.method5519(1002, "wrong http function", false);
                        return false;
                    }
                    final Class6089 class6087 = (Class6089)method33036;
                    if (this.field5089.method33024(this.field5092, class6087) == Class223.field783) {
                        try {
                            this.field5082.method5550(this, this.field5092, class6087);
                        }
                        catch (final Class2319 class6088) {
                            this.method5519(class6088.method9447(), class6088.getMessage(), false);
                            return false;
                        }
                        catch (final RuntimeException ex2) {
                            this.field5082.method5471(this, ex2);
                            this.method5519(-1, ex2.getMessage(), false);
                            return false;
                        }
                        this.method5526(class6087);
                        return true;
                    }
                    this.method5495(1002, "draft " + this.field5089 + " refuses handshake");
                }
            }
            catch (final Class2321 class6089) {
                this.method5521(class6089);
            }
        }
        catch (final Class2372 class6090) {
            if (this.field5091.capacity() == 0) {
                field5091.reset();
                int method33037 = class6090.method9502();
                if (method33037 == 0) {
                    method33037 = field5091.capacity() + 16;
                }
                else if (!Class958.field5101 && class6090.method9502() < field5091.remaining()) {
                    throw new AssertionError();
                }
                (this.field5091 = ByteBuffer.allocate(method33037)).put(byteBuffer);
            }
            else {
                this.field5091.position();
                this.field5091.limit();
            }
        }
        return false;
    }
    
    private void method5511(final ByteBuffer byteBuffer) {
        try {
            final Iterator<Class2776> iterator = this.field5089.method33041(byteBuffer).iterator();
            while (iterator.hasNext()) {
                this.field5089.method33050(this, iterator.next());
            }
        }
        catch (final Class2320 class2320) {
            if (class2320.method9448() == Integer.MAX_VALUE) {
                this.field5082.method5471(this, class2320);
            }
            this.method5521(class2320);
        }
        catch (final Class2319 class2321) {
            this.field5082.method5471(this, class2321);
            this.method5521(class2321);
        }
    }
    
    private void method5512(final Class2319 class2319) {
        this.method5524(this.method5514(404));
        this.method5519(class2319.method9447(), class2319.getMessage(), false);
    }
    
    private void method5513(final RuntimeException ex) {
        this.method5524(this.method5514(500));
        this.method5519(-1, ex.getMessage(), false);
    }
    
    private ByteBuffer method5514(final int n) {
        String s = null;
        switch (n) {
            case 404: {
                s = "404 WebSocket Upgrade Failure";
                break;
            }
            default: {
                s = "500 Internal Server Error";
                break;
            }
        }
        return ByteBuffer.wrap(Class8142.method26835("HTTP/1.1 " + s + "\r\nContent-Type: text/html\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (48 + s.length()) + "\r\n\r\n<html><head></head><body><h1>" + s + "</h1></body></html>"));
    }
    
    public synchronized void method5515(final int n, final String s, final boolean b) {
        if (this.field5087 != Class2154.field12797 && this.field5087 != Class2154.field12798) {
            if (this.field5087 == Class2154.field12796) {
                if (n == 1006) {
                    if (!Class958.field5101 && b) {
                        throw new AssertionError();
                    }
                    this.field5087 = Class2154.field12797;
                    this.method5519(n, s, false);
                    return;
                }
                else {
                    if (this.field5089.method33061() != Class1979.field10968) {
                        try {
                            if (!b) {
                                try {
                                    this.field5082.method5473(this, n, s);
                                }
                                catch (final RuntimeException ex) {
                                    this.field5082.method5471(this, ex);
                                }
                            }
                            if (this.method5489()) {
                                final Class2775 class2775 = new Class2775();
                                class2775.method9821(s);
                                class2775.method9820(n);
                                class2775.method9804();
                                this.method5498(class2775);
                            }
                        }
                        catch (final Class2319 class2776) {
                            this.field5082.method5471(this, class2776);
                            this.method5519(1006, "generated frame is invalid", false);
                        }
                    }
                    this.method5519(n, s, b);
                }
            }
            else if (n == -3) {
                if (!Class958.field5101 && !b) {
                    throw new AssertionError();
                }
                this.method5519(-3, s, true);
            }
            else if (n == 1002) {
                this.method5519(n, s, b);
            }
            else {
                this.method5519(-1, s, false);
            }
            this.field5087 = Class2154.field12797;
            this.field5091 = null;
        }
    }
    
    @Override
    public void method5495(final int n, final String s) {
        this.method5515(n, s, false);
    }
    
    public synchronized void method5516(final int n, final String s, final boolean b) {
        if (this.field5087 == Class2154.field12798) {
            return;
        }
        if (this.field5087 == Class2154.field12796 && n == 1006) {
            this.field5087 = Class2154.field12797;
        }
        if (this.field5083 != null) {
            this.field5083.cancel();
        }
        Label_0102: {
            if (this.field5084 != null) {
                Label_0090: {
                    try {
                        this.field5084.close();
                    }
                    catch (final IOException ex) {
                        if (!ex.getMessage().equals("Broken pipe")) {
                            break Label_0090;
                        }
                    }
                    break Label_0102;
                }
                final IOException ex;
                this.field5082.method5471(this, ex);
            }
            try {
                this.field5082.method5470(this, n, s, b);
            }
            catch (final RuntimeException ex2) {
                this.field5082.method5471(this, ex2);
            }
        }
        if (this.field5089 != null) {
            this.field5089.method33044();
        }
        this.field5092 = null;
        this.field5087 = Class2154.field12798;
    }
    
    public void method5517(final int n, final boolean b) {
        this.method5516(n, "", b);
    }
    
    public void method5518() {
        if (this.field5095 != null) {
            this.method5516(this.field5094, this.field5093, this.field5095);
            return;
        }
        throw new IllegalStateException("this method must be used in conjunction with flushAndClose");
    }
    
    @Override
    public void method5496(final int n, final String s) {
        this.method5516(n, s, false);
    }
    
    public synchronized void method5519(final int i, final String field5093, final boolean b) {
        if (this.field5086) {
            return;
        }
        this.field5094 = i;
        this.field5093 = field5093;
        this.field5095 = b;
        this.field5086 = true;
        this.field5082.method5472(this);
        try {
            this.field5082.method5474(this, i, field5093, b);
        }
        catch (final RuntimeException ex) {
            this.field5082.method5471(this, ex);
        }
        if (this.field5089 != null) {
            this.field5089.method33044();
        }
        this.field5092 = null;
    }
    
    public void method5520() {
        if (this.field5087 != Class2154.field12795) {
            if (!this.field5086) {
                if (this.field5089.method33061() != Class1979.field10968) {
                    if (this.field5089.method33061() != Class1979.field10969) {
                        this.method5517(1006, true);
                    }
                    else if (this.field5090 != Class2091.field12096) {
                        this.method5517(1000, true);
                    }
                    else {
                        this.method5517(1006, true);
                    }
                }
                else {
                    this.method5517(1000, true);
                }
            }
            else {
                this.method5516(this.field5094, this.field5093, this.field5095);
            }
        }
        else {
            this.method5517(-1, true);
        }
    }
    
    @Override
    public void method5494(final int n) {
        this.method5515(n, "", false);
    }
    
    public void method5521(final Class2319 class2319) {
        this.method5515(class2319.method9447(), class2319.getMessage(), false);
    }
    
    @Override
    public void method5458(final String s) {
        if (s != null) {
            this.method5522(this.field5089.method33043(s, this.field5090 == Class2091.field12095));
            return;
        }
        throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
    }
    
    @Override
    public void method5497(final ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            this.method5522(this.field5089.method33042(byteBuffer, this.field5090 == Class2091.field12095));
            return;
        }
        throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
    }
    
    @Override
    public void method5459(final byte[] array) {
        this.method5497(ByteBuffer.wrap(array));
    }
    
    private void method5522(final Collection<Class2776> collection) {
        if (!this.method5489()) {
            throw new Class2369();
        }
        if (collection != null) {
            final ArrayList list = new ArrayList();
            final Iterator<Class2776> iterator = collection.iterator();
            while (iterator.hasNext()) {
                list.add(this.field5089.method33033(iterator.next()));
            }
            this.method5525(list);
            return;
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public void method5488(final Class2058 class2058, final ByteBuffer byteBuffer, final boolean b) {
        this.method5522(this.field5089.method33070(class2058, byteBuffer, b));
    }
    
    @Override
    public void method5499(final Collection<Class2776> collection) {
        this.method5522(collection);
    }
    
    @Override
    public void method5498(final Class2776 o) {
        this.method5522(Collections.singletonList(o));
    }
    
    @Override
    public void method5463() {
        if (this.field5099 == null) {
            this.field5099 = new Class2773();
        }
        this.method5498(this.field5099);
    }
    
    @Override
    public boolean method5493() {
        return !this.field5080.isEmpty();
    }
    
    public void method5523(final Class6084 class6084) throws InvalidHandshakeException {
        this.field5092 = this.field5089.method33030(class6084);
        this.field5096 = class6084.method18142();
        if (!Class958.field5101 && this.field5096 == null) {
            throw new AssertionError();
        }
        try {
            this.field5082.method5551(this, this.field5092);
        }
        catch (final Class2319 class6085) {
            throw new Class2321("Handshake data rejected by client.");
        }
        catch (final RuntimeException obj) {
            this.field5082.method5471(this, obj);
            throw new Class2321("rejected because of " + obj);
        }
        this.method5525(this.field5089.method33072(this.field5092));
    }
    
    private void method5524(final ByteBuffer byteBuffer) {
        this.field5080.add(byteBuffer);
        this.field5082.method5472(this);
    }
    
    private void method5525(final List<ByteBuffer> list) {
        synchronized (this.field5098) {
            final Iterator<ByteBuffer> iterator = list.iterator();
            while (iterator.hasNext()) {
                this.method5524(iterator.next());
            }
        }
    }
    
    private void method5526(final Class6090 class6090) {
        this.field5087 = Class2154.field12796;
        try {
            this.field5082.method5469(this, class6090);
        }
        catch (final RuntimeException ex) {
            this.field5082.method5471(this, ex);
        }
    }
    
    @Override
    public boolean method5489() {
        return this.field5087 == Class2154.field12796;
    }
    
    @Override
    public boolean method5492() {
        return this.field5087 == Class2154.field12797;
    }
    
    @Override
    public boolean method5490() {
        return this.field5086;
    }
    
    @Override
    public boolean method5491() {
        return this.field5087 == Class2154.field12798;
    }
    
    @Override
    public Class2154 method5466() {
        return this.field5087;
    }
    
    public void method5527(final SelectionKey field5083) {
        this.field5083 = field5083;
    }
    
    public SelectionKey method5528() {
        return this.field5083;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public InetSocketAddress method5501() {
        return this.field5082.method5479(this);
    }
    
    @Override
    public InetSocketAddress method5500() {
        return this.field5082.method5478(this);
    }
    
    @Override
    public Class9122 method5445() {
        return this.field5089;
    }
    
    @Override
    public void method5456() {
        this.method5494(1000);
    }
    
    @Override
    public String method5502() {
        return this.field5096;
    }
    
    public long method5529() {
        return this.field5097;
    }
    
    public void method5530() {
        this.field5097 = System.nanoTime();
    }
    
    public Class962 method5531() {
        return this.field5082;
    }
    
    @Override
    public <T> T method5460() {
        return (T)this.field5100;
    }
    
    @Override
    public <T> void method5461(final T field5100) {
        this.field5100 = field5100;
    }
    
    public ByteChannel method5532() {
        return this.field5084;
    }
    
    public void method5533(final ByteChannel field5084) {
        this.field5084 = field5084;
    }
    
    public Class899 method5534() {
        return this.field5085;
    }
    
    public void method5535(final Class899 field5085) {
        this.field5085 = field5085;
    }
    
    static {
        field5101 = !Class958.class.desiredAssertionStatus();
    }
}
