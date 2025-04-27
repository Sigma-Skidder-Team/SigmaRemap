// 
// Decompiled by Procyon v0.6.0
// 

package io.socket.emitter;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;

public class Emitter {
    private ConcurrentMap<String, ConcurrentLinkedQueue<Listener>> callbacks
            = new ConcurrentHashMap<String, ConcurrentLinkedQueue<Listener>>();

    public Emitter on(String event, Listener fn) {
        ConcurrentLinkedQueue<Listener> callbacks = this.callbacks.get(event);
        if (callbacks == null) {
            callbacks = new ConcurrentLinkedQueue <Listener>();
            ConcurrentLinkedQueue<Listener> tempCallbacks = this.callbacks.putIfAbsent(event, callbacks);
            if (tempCallbacks != null) {
                callbacks = tempCallbacks;
            }
        }
        callbacks.add(fn);
        return this;
    }

    public Emitter once(final String event, final Listener fn) {
        this.on(event, new OnceListener(event, fn));
        return this;
    }

    public Emitter off() {
        this.callbacks.clear();
        return this;
    }

    public Emitter off(String event) {
        this.callbacks.remove(event);
        return this;
    }

    public Emitter off(String event, Listener fn) {
        ConcurrentLinkedQueue<Listener> callbacks = this.callbacks.get(event);
        if (callbacks != null) {
            Iterator<Listener> it = callbacks.iterator();
            while (it.hasNext()) {
                Listener internal = it.next();
                if (Emitter.sameAs(fn, internal)) {
                    it.remove();
                    break;
                }
            }
        }
        return this;
    }

    private static boolean sameAs(Listener fn, Listener internal) {
        if (fn.equals(internal)) {
            return true;
        } else if (internal instanceof OnceListener) {
            return fn.equals(((OnceListener) internal).fn);
        } else {
            return false;
        }
    }

    public Emitter emit(String event, Object... args) {
        ConcurrentLinkedQueue<Listener> callbacks = this.callbacks.get(event);
        if (callbacks != null) {
            for (Listener fn : callbacks) {
                fn.call(args);
            }
        }
        return this;
    }

    public List<Listener> listeners(String event) {
        ConcurrentLinkedQueue<Listener> callbacks = this.callbacks.get(event);
        return callbacks != null ?
                new ArrayList<Listener>(callbacks) : new ArrayList<Listener>(0);
    }

    public boolean hasListeners(String event) {
        ConcurrentLinkedQueue<Listener> callbacks = this.callbacks.get(event);
        return callbacks != null && !callbacks.isEmpty();
    }

    public static interface Listener {
        void call(final Object... p0);
    }

    private class OnceListener implements Listener
    {
        public final String event;
        public final Listener fn;

        public OnceListener(String event, Listener fn) {
            this.event = event;
            this.fn = fn;
        }

        @Override
        public void call(Object... args) {
            Emitter.this.off(this.event, this);
            this.fn.call(args);
        }
    }
}
