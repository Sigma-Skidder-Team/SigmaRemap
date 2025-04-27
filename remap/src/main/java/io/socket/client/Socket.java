// 
// Decompiled by Procyon v0.6.0
// 

package io.socket.client;

import io.socket.emitter.Emitter;
import io.socket.parser.Packet;
import mapped.*;
import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Socket extends Emitter {
    private static final Logger logger;
    public static final String EVENT_CONNECT = "connect";
    public static final String EVENT_CONNECTING = "connecting";
    public static final String EVENT_DISCONNECT = "disconnect";
    public static final String EVENT_ERROR = "error";
    static final String EVENT_MESSAGE = "message";
    public static final String EVENT_CONNECT_ERROR = "connect_error";
    public static final String EVENT_CONNECT_TIMEOUT = "connect_timeout";
    public static final String EVENT_RECONNECT = "reconnect";
    public static final String EVENT_RECONNECT_ERROR = "reconnect_error";
    public static final String EVENT_RECONNECT_FAILED = "reconnect_failed";
    public static final String EVENT_RECONNECT_ATTEMPT = "reconnect_attempt";
    public static final String EVENT_RECONNECTING = "reconnecting";
    public static final String EVENT_PING = "ping";
    public static final String EVENT_PONG = "pong";
    public static Map<String, Integer> RESERVED_EVENTS;
    String id;
    private volatile boolean connected;
    private int ids;
    private final String nsp;
    private final Manager io;
    private String auth;
    private final Map<Integer, Ack> acks = new ConcurrentHashMap<>();
    private Queue<Handle> subs;
    private final Queue<List<Object>> receiveBuffer = new ConcurrentLinkedQueue<>();
    private final Queue<Packet<JSONArray>> sendBuffer = new ConcurrentLinkedQueue<>();

    public Socket(final Manager io, final String nsp, final Manager.Options options) {
        this.io = io;
        this.nsp = nsp;
        if (options != null) {
            this.auth = options.auth;
        }
    }

    private void subEvents() {
        if (this.subs != null) return;

        final Manager io = Socket.this.io;
        Socket.this.subs = new LinkedList<Handle>() {{
            add(On.on(io, Manager.EVENT_OPEN, new Listener() {
                @Override
                public void call(Object... args) {
                    Socket.this.onopen();
                }
            }));
            add(On.on(io, Manager.EVENT_PACKET, new Listener() {
                @Override
                public void call(Object... args) {
                    Socket.this.onpacket((Packet<?>) args[0]);
                }
            }));
            add(On.on(io, Manager.EVENT_ERROR, new Listener() {
                @Override
                public void call(Object... args) {
                    if (!Socket.this.connected) {
                        Socket.super.emit(EVENT_CONNECT_ERROR, args[0]);
                    }
                }
            }));
            add(On.on(io, Manager.EVENT_CLOSE, new Listener() {
                @Override
                public void call(Object... args) {
                    Socket.this.onclose(args.length > 0 ? (String) args[0] : null);
                }
            }));
        }};
    }

    public Socket open() {
        EventThread.exec(new Runnable() {
            @Override
            public void run() {
                if (Socket.this.connected || Socket.this.io.isReconnecting()) return;

                Socket.this.subEvents();
                Socket.this.io.open(); // ensure open
                if (Manager.ReadyState.OPEN == Socket.this.io.readyState) Socket.this.onopen();
            }
        });
        return this;
    }

    public Socket connect() {
        return this.open();
    }

    public Socket send(final Object... args) {
        EventThread.exec(new Class1230(this, args));
        return this;
    }

    @Override
    public Emitter emit(final String s, final Object... args) {
        EventThread.exec(new Class1247(this, s, args));
        return this;
    }

    public Emitter emit(final String s, final Object[] args, final Ack ack) {
        EventThread.exec(new Class952(this, s, args, ack));
        return this;
    }

    private void packet(final Packet packet) {
        packet.nsp = this.nsp;
        this.io.packet(packet);
    }

    private void onopen() {
        Socket.logger.fine("transport is open - connecting");
        if (!"/".equals(this.nsp)) {
            if (this.auth != null && !this.auth.isEmpty()) {
                final Packet packet = new Packet(0);
                packet.field38268 = this.auth;
                this.packet(packet);
            } else {
                this.packet(new Packet(0));
            }
        }
    }

    private void method14946(final String s) {
        if (Socket.logger.isLoggable(Level.FINE)) {
            Socket.logger.fine(String.format("close (%s)", s));
        }
        this.connected = false;
        this.id = null;
        this.emit("disconnect", s);
    }

    private void method14947(final Packet<?> packet) {
        if (!this.nsp.equals(packet.nsp)) {
            return;
        }
        switch (packet.type) {
            case 0: {
                this.method14951();
                break;
            }
            case 2: {
                this.method14948((Packet<JSONArray>) packet);
                break;
            }
            case 5: {
                this.method14948((Packet<JSONArray>) packet);
                break;
            }
            case 3: {
                this.method14950((Packet<JSONArray>) packet);
                break;
            }
            case 6: {
                this.method14950((Packet<JSONArray>) packet);
                break;
            }
            case 1: {
                this.method14953();
                break;
            }
            case 4: {
                this.emit("error", packet.data);
                break;
            }
        }
    }

    private void method14948(final Packet<JSONArray> packet) {
        final ArrayList list = new ArrayList(Arrays.asList(method14960(packet.data)));
        if (Socket.logger.isLoggable(Level.FINE)) {
            Socket.logger.fine(String.format("emitting event %s", list));
        }
        if (packet.id >= 0) {
            Socket.logger.fine("attaching ack callback to event");
            list.add(this.method14949(packet.id));
        }
        if (!this.connected) {
            this.receiveBuffer.add(list);
        } else {
            if (list.isEmpty()) {
                return;
            }
            super.emit(list.remove(0).toString(), list.toArray());
        }
    }

    private Ack method14949(final int n) {
        return new Class7874(this, new boolean[]{false}, n, this);
    }

    private void method14950(final Packet<JSONArray> packet) {
        final Ack class9042 = this.acks.remove(packet.id);
        if (class9042 == null) {
            if (Socket.logger.isLoggable(Level.FINE)) {
                Socket.logger.fine(String.format("bad ack %s", packet.id));
            }
        } else {
            if (Socket.logger.isLoggable(Level.FINE)) {
                Socket.logger.fine(String.format("calling ack %s with %s", packet.id, packet.data));
            }
            class9042.method25497(method14960(packet.data));
        }
    }

    private void method14951() {
        this.connected = true;
        this.emit("connect");
        this.method14952();
    }

    private void method14952() {
        List list;
        while ((list = this.receiveBuffer.poll()) != null) {
            super.emit((String) list.get(0), list.toArray());
        }
        this.receiveBuffer.clear();
        Packet packet;
        while ((packet = this.sendBuffer.poll()) != null) {
            this.packet(packet);
        }
        this.sendBuffer.clear();
    }

    private void method14953() {
        if (Socket.logger.isLoggable(Level.FINE)) {
            Socket.logger.fine(String.format("server disconnect (%s)", this.nsp));
        }
        this.method14954();
        this.method14946("io server disconnect");
    }

    private void method14954() {
        if (this.subs != null) {
            final Iterator<Object> iterator = this.subs.iterator();
            while (iterator.hasNext()) {
                iterator.next().method12753();
            }
            this.subs = null;
        }
        this.io.method15065(this);
    }

    public Socket method14955() {
        EventThread.exec(new Class1144(this));
        return this;
    }

    public Socket method14956() {
        return this.method14955();
    }

    public Manager method14957() {
        return this.io;
    }

    public boolean method14958() {
        return this.connected;
    }

    public String method14959() {
        return this.id;
    }

    private static Object[] method14960(final JSONArray JSONArray) {
        final int method462 = JSONArray.length();
        final Object[] array = new Object[method462];
        for (int i = 0; i < method462; ++i) {
            Object method463;
            try {
                method463 = JSONArray.get(i);
            } catch (final JSONException thrown) {
                Socket.logger.log(Level.WARNING, "An error occured while retrieving data from JSONArray", thrown);
                method463 = null;
            }
            array[i] = (JSONObject.NULL.equals(method463) ? null : method463);
        }
        return array;
    }

    static {
        logger = Logger.getLogger(Socket.class.getName());
        Socket.RESERVED_EVENTS = new Class30();
    }
}
