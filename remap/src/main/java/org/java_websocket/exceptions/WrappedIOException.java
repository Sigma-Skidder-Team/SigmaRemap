package org.java_websocket.exceptions;

import org.java_websocket.WebSocket;

import java.io.IOException;

public class WrappedIOException extends Exception {
    private final transient WebSocket connection;
    private final IOException ioException;

    public WrappedIOException(WebSocket connection, IOException ioException) {
        this.connection = connection;
        this.ioException = ioException;
    }

    /**
     * The websocket where the IOException happened
     *
     * @return the websocket for the wrapped IOException
     */
    public WebSocket getConnection() {
        return connection;
    }

    /**
     * The wrapped IOException
     *
     * @return IOException which is wrapped
     */
    public IOException getIOException() {
        return ioException;
    }
}
