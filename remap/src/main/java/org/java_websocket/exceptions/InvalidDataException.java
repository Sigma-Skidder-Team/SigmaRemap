// 
// Decompiled by Procyon v0.6.0
// 

package org.java_websocket.exceptions;

public class InvalidDataException extends Exception
{
    private static final long serialVersionUID = 3731842424390998726L;
    private final int closecode;
    
    public InvalidDataException(final int closecode) {
        this.closecode = closecode;
    }
    
    public InvalidDataException(final int closecode, final String message) {
        super(message);
        this.closecode = closecode;
    }
    
    public InvalidDataException(final int closecode, final Throwable cause) {
        super(cause);
        this.closecode = closecode;
    }
    
    public InvalidDataException(final int closecode, final String message, final Throwable cause) {
        super(message, cause);
        this.closecode = closecode;
    }
    
    public int getCloseCode() {
        return this.closecode;
    }
}
