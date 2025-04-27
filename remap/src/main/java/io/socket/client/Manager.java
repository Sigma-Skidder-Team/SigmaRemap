// 
// Decompiled by Procyon v0.6.0
// 

package io.socket.client;

import io.socket.emitter.Emitter;
import io.socket.parser.Decoder;
import io.socket.parser.Encoder;
import io.socket.parser.Packet;
import mapped.*;
import okhttp3.Call;
import okhttp3.WebSocket;

import java.util.*;
import java.util.logging.Level;
import java.util.concurrent.ConcurrentHashMap;
import java.net.URI;
import java.util.logging.Logger;

public class Manager extends Emitter
{
    private static final Logger logger;
    public static final String EVENT_OPEN = "open";
    public static final String EVENT_CLOSE = "close";
    public static final String EVENT_PACKET = "packet";
    public static final String EVENT_ERROR = "error";
    public static final String field21346 = "connect_error";
    public static final String field21347 = "connect_timeout";
    public static final String EVENT_RECONNECT = "reconnect";
    public static final String EVENT_RECONNECT_ERROR = "reconnect_error";
    public static final String EVENT_RECONNECT_FAILED = "reconnect_failed";
    public static final String EVENT_RECONNECT_ATTEMPT = "reconnect_attempt";
    public static final String field21352 = "reconnecting";
    public static final String field21353 = "ping";
    public static final String field21354 = "pong";
    public static final String EVENT_TRANSPORT = "transport";
    public static WebSocket.Factory defaultWebSocketFactory;
    public static Call.Factory defaultCallFactory;
    public ReadyState readyState;
    private boolean _reconnection;
    private boolean skipReconnect;
    private boolean reconnecting;
    private boolean encoding;
    private int _reconnectionAttempts;
    private long _reconnectionDelay;
    private long _reconnectionDelayMax;
    private double _randomizationFactor;
    private final Backoff backoff;
    private long _timeout;
    private final URI uri;
    private final List<Packet> packetBuffer = new ArrayList<>();
    private final Queue<Handle> subs = new LinkedList<>();;
    private final Options opts;
    public io.socket.engineio.client.Socket engine;
    private final Encoder encoder;
    private final Decoder decoder;
    /**
     * This HashMap can be accessed from outside of EventThread.
     */
    /*package*/ final Map<String, Socket> nsps = new ConcurrentHashMap<>();

    public Manager() {
        this(null, null);
    }

    public Manager(URI uri) {
        this(uri, null);
    }

    public Manager(Options opts) {
        this(null, opts);
    }
    
    public Manager(final URI uri, Options opts) {
        if (opts == null) {
            opts = new Options();
        }
        if (opts.path == null) {
            opts.path = "/socket.io";
        }
        if (opts.webSocketFactory == null) {
            opts.webSocketFactory = Manager.defaultWebSocketFactory;
        }
        if (opts.callFactory == null) {
            opts.callFactory = Manager.defaultCallFactory;
        }
        this.opts = opts;
        this.method15042(opts.reconnection);
        this.method15044((opts.reconnectionAttempts == 0) ? Integer.MAX_VALUE : opts.reconnectionAttempts);
        this.method15046((opts.reconnectionDelay == 0L) ? 1000L : opts.reconnectionDelay);
        this.method15050((opts.reconnectionDelayMax == 0L) ? 5000L : opts.reconnectionDelayMax);
        this.method15048((opts.randomizationFactor == 0.0) ? 0.5 : opts.randomizationFactor);
        this.backoff = new Backoff().method26360(this.method15045()).method26361(this.method15049()).method26363(this.method15047());
        this.method15052(opts.timeout);
        this.readyState = ReadyState.CLOSED;
        this.uri = uri;
        this.encoding = false;
        this.encoder = ((opts.encoder == null) ? new Class7615() : opts.encoder);
        this.decoder = ((opts.decoder == null) ? new Class6746() : opts.decoder);
    }
    
    private void emit(final String s, final Object... array) {
        this.emit(s, array);
        final Iterator<Socket> iterator = this.nsps.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().emit(s, array);
        }
    }
    
    private void method15039() {
        for (final Map.Entry entry : this.nsps.entrySet()) {
            ((Socket)entry.getValue()).id = this.method15040((String)entry.getKey());
        }
    }
    
    private String method15040(final String s) {
        return ("/".equals(s) ? "" : (s + "#")) + this.engine.method15130();
    }
    
    public boolean method15041() {
        return this._reconnection;
    }
    
    public Manager method15042(final boolean field21359) {
        this._reconnection = field21359;
        return this;
    }
    
    public int method15043() {
        return this._reconnectionAttempts;
    }
    
    public Manager method15044(final int field21363) {
        this._reconnectionAttempts = field21363;
        return this;
    }
    
    public final long method15045() {
        return this._reconnectionDelay;
    }
    
    public Manager method15046(final long field21364) {
        this._reconnectionDelay = field21364;
        if (this.backoff != null) {
            this.backoff.method26360(field21364);
        }
        return this;
    }
    
    public final double method15047() {
        return this._randomizationFactor;
    }
    
    public Manager method15048(final double field21366) {
        this._randomizationFactor = field21366;
        if (this.backoff != null) {
            this.backoff.method26363(field21366);
        }
        return this;
    }
    
    public final long method15049() {
        return this._reconnectionDelayMax;
    }
    
    public Manager method15050(final long field21365) {
        this._reconnectionDelayMax = field21365;
        if (this.backoff != null) {
            this.backoff.method26361(field21365);
        }
        return this;
    }
    
    public long method15051() {
        return this._timeout;
    }
    
    public Manager method15052(final long field21368) {
        this._timeout = field21368;
        return this;
    }
    
    private void method15053() {
        if (!this.reconnecting) {
            if (this._reconnection) {
                if (this.backoff.getAttempts() == 0) {
                    this.reconnect();
                }
            }
        }
    }
    
    public Manager method15054() {
        return this.method15055(null);
    }
    
    public Manager method15055(final Class8332 class8332) {
        EventThread.exec(new Class1040(this, class8332));
        return this;
    }
    
    private void method15056() {
        Manager.logger.fine("open");
        this.cleanup();
        this.readyState = ReadyState.OPEN;
        this.emit("open");
        final Class4968 field21375 = this.engine;
        this.subs.add(Class8415.method28106(field21375, "data", new Class4675(this)));
        this.subs.add(Class8415.method28106(field21375, "ping", new Class4692(this)));
        this.subs.add(Class8415.method28106(field21375, "pong", new Class4678(this)));
        this.subs.add(Class8415.method28106(field21375, "error", new Class4668(this)));
        this.subs.add(Class8415.method28106(field21375, "close", new Class4694(this)));
        this.decoder.onDecoded(new Class7551(this));
    }
    
    private void method15057() {
        this.date = new Date();
        this.emit("ping");
    }
    
    private void method15058() {
        this.method15038("pong", (null == this.date) ? 0L : (new Date().getTime() - this.date.getTime()));
    }
    
    private void method15059(final String s) {
        this.decoder.add(s);
    }
    
    private void method15060(final byte[] array) {
        this.decoder.add(array);
    }
    
    private void method15061(final Packet packet) {
        this.emit("packet", packet);
    }
    
    private void method15062(final Exception thrown) {
        Manager.logger.log(Level.FINE, "error", thrown);
        this.emit("error", thrown);
    }
    
    public Socket method15063(final String s, final Options options) {
        Socket value = this.nsps.get(s);
        if (value == null) {
            value = new Socket(this, s, options);
            final Socket class7661 = this.nsps.putIfAbsent(s, value);
            if (class7661 == null) {
                final Socket class7662 = value;
                value.on("connecting", new Class4658(this, this, class7662));
                value.on("connect", new Class4661(this, class7662, this, s));
            }
            else {
                value = class7661;
            }
        }
        return value;
    }
    
    public Socket method15064(final String s) {
        return this.method15063(s, null);
    }
    
    public void method15065(final Socket socket) {
        this.field21369.remove(socket);
        if (this.field21369.isEmpty()) {
            this.close();
        }
    }
    
    public void packet(final Packet packet) {
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(String.format("writing packet %s", packet));
        }
        final Manager self = this;

        if (!self.encoding) {
            self.encoding = true;
            this.encoder.encode(packet, new Encoder.Callback() {
                @Override
                public void call(Object[] encodedPackets) {
                    for (Object packet : encodedPackets) {
                        if (packet instanceof String) {
                            self.engine.write((String)packet);
                        } else if (packet instanceof byte[]) {
                            self.engine.write((byte[])packet);
                        }
                    }
                    self.encoding = false;
                    self.processPacketQueue();
                }
            });
        } else {
            self.packetBuffer.add(packet);
        }
    }

    private void processPacketQueue() {
        if (!this.packetBuffer.isEmpty() && !this.encoding) {
            Packet pack = this.packetBuffer.remove(0);
            this.packet(pack);
        }
    }
    
    private void cleanup() {
        logger.fine("cleanup");

        Handle sub;
        while ((sub = this.subs.poll()) != null) sub.destroy();
        this.decoder.onDecoded(null);

        this.packetBuffer.clear();
        this.encoding = false;

        this.decoder.destroy();
    }
    
    public void close() {
        logger.fine("disconnect");
        this.skipReconnect = true;
        this.reconnecting = false;
        if (this.readyState != ReadyState.OPEN) {
            // `onclose` will not fire because
            // an open event never happened
            this.cleanup();
        }
        this.backoff.reset();
        this.readyState = ReadyState.CLOSED;
        if (this.engine != null) {
            this.engine.close();
        }
    }
    
    private void onclose(final String reason) {
        logger.fine("onclose");
        this.cleanup();
        this.backoff.reset();
        this.readyState = ReadyState.CLOSED;
        this.emit(EVENT_CLOSE, reason);

        if (this._reconnection && !this.skipReconnect) {
            this.reconnect();
        }
    }

    private void reconnect() {
        if (this.reconnecting || this.skipReconnect) return;

        final Manager self = this;

        if (this.backoff.getAttempts() >= this._reconnectionAttempts) {
            logger.fine("reconnect failed");
            this.backoff.reset();
            this.emit(EVENT_RECONNECT_FAILED);
            this.reconnecting = false;
        } else {
            long delay = this.backoff.duration();
            logger.fine(String.format("will wait %dms before reconnect attempt", delay));

            this.reconnecting = true;
            final Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    EventThread.exec(new Runnable() {
                        @Override
                        public void run() {
                            if (self.skipReconnect) return;

                            logger.fine("attempting reconnect");
                            int attempts = self.backoff.getAttempts();
                            self.emit(EVENT_RECONNECT_ATTEMPT, attempts);

                            // check again for the case socket closed in above events
                            if (self.skipReconnect) return;

                            self.open(new OpenCallback() {
                                @Override
                                public void call(Exception err) {
                                    if (err != null) {
                                        logger.fine("reconnect attempt error");
                                        self.reconnecting = false;
                                        self.reconnect();
                                        self.emit(EVENT_RECONNECT_ERROR, err);
                                    } else {
                                        logger.fine("reconnect success");
                                        self.onreconnect();
                                    }
                                }
                            });
                        }
                    });
                }
            }, delay);

            this.subs.add(new On.Handle() {
                @Override
                public void destroy() {
                    timer.cancel();
                }
            });
        }
    }
    
    private void onreconnect() {
        final int attempts = this.backoff.getAttempts();
        this.reconnecting = false;
        this.backoff.reset();
        this.emit("reconnect", attempts);
    }

    public static class Options extends Class7659
    {
        public boolean reconnection = true;
        public int reconnectionAttempts;
        public long reconnectionDelay;
        public long reconnectionDelayMax;
        public double randomizationFactor;
        public Encoder encoder;
        public Decoder decoder;
        public Map<String, String> auth;

        /**
         * Connection timeout (ms). Set -1 to disable.
         */
        public long timeout = 20000;
    }

    public enum ReadyState
    {
        CLOSED,
        OPENING,
        OPEN
    }
}
