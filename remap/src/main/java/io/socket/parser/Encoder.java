// 
// Decompiled by Procyon v0.6.0
// 

package io.socket.parser;

public interface Encoder {
    void encode(final Packet p0, final Callback p1);

    interface Callback {
        void call(final Object[] p0);
    }
}
