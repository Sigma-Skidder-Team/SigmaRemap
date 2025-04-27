// 
// Decompiled by Procyon v0.6.0
// 

package io.socket.parser;

public interface Decoder {
    void add(final String p0);

    void add(final byte[] p0);

    void destroy();

    void onDecoded(final Callback p0);

    interface Callback {
        void call(final Packet p0);
    }
}
