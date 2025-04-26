// 
// Decompiled by Procyon v0.6.0
// 

package org.java_websocket.exceptions;

import org.java_websocket.framing.CloseFrame;

public class InvalidHandshakeException extends InvalidDataException
{
    private static final long serialVersionUID = -1426533877490484964L;

    public InvalidHandshakeException() {
        super(CloseFrame.PROTOCOL_ERROR);
    }

    public InvalidHandshakeException(String s, Throwable t) {
        super(CloseFrame.PROTOCOL_ERROR, s, t);
    }

    public InvalidHandshakeException(String s) {
        super(CloseFrame.PROTOCOL_ERROR, s);
    }

    public InvalidHandshakeException(Throwable t) {
        super(CloseFrame.PROTOCOL_ERROR, t);
    }
}
