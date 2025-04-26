// 
// Decompiled by Procyon v0.6.0
// 

package org.java_websocket.server;

import org.java_websocket.WebSocketImpl;
import org.java_websocket.WebSocketServerFactory;
import org.java_websocket.WebSocketAdapter;
import org.java_websocket.drafts.Draft;

import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;

public class DefaultWebSocketServerFactory implements WebSocketServerFactory
{

    @Override
    public WebSocketImpl createWebSocket(final WebSocketAdapter webSocketAdapter, final Draft class962) {
        return new WebSocketImpl(webSocketAdapter, class962);
    }
    
    @Override
    public WebSocketImpl createWebSocket(final WebSocketAdapter webSocketAdapter, final List<Draft> list) {
        return new WebSocketImpl(webSocketAdapter, list);
    }
    
    public SocketChannel wrapChannel(final SocketChannel socketChannel, final SelectionKey selectionKey) {
        return socketChannel;
    }
    
    @Override
    public void close() {
    }
}
