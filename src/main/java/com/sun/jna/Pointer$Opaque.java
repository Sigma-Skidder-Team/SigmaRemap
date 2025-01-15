// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.nio.ByteBuffer;

public class Pointer$Opaque extends Pointer
{
    private final String MSG;
    
    private Pointer$Opaque(final long peer) {
        super(peer);
        this.MSG = "This pointer is opaque: " + this;
    }
    
    @Override
    public Pointer share(final long offset, final long size) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void clear(final long size) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public long indexOf(final long offset, final byte value) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void read(final long bOff, final byte[] buf, final int index, final int length) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void read(final long bOff, final char[] buf, final int index, final int length) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void read(final long bOff, final short[] buf, final int index, final int length) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void read(final long bOff, final int[] buf, final int index, final int length) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void read(final long bOff, final long[] buf, final int index, final int length) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void read(final long bOff, final float[] buf, final int index, final int length) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void read(final long bOff, final double[] buf, final int index, final int length) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void read(final long bOff, final Pointer[] buf, final int index, final int length) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void write(final long bOff, final byte[] buf, final int index, final int length) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void write(final long bOff, final char[] buf, final int index, final int length) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void write(final long bOff, final short[] buf, final int index, final int length) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void write(final long bOff, final int[] buf, final int index, final int length) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void write(final long bOff, final long[] buf, final int index, final int length) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void write(final long bOff, final float[] buf, final int index, final int length) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void write(final long bOff, final double[] buf, final int index, final int length) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void write(final long bOff, final Pointer[] buf, final int index, final int length) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public ByteBuffer getByteBuffer(final long offset, final long length) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public byte getByte(final long bOff) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public char getChar(final long bOff) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public short getShort(final long bOff) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public int getInt(final long bOff) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public long getLong(final long bOff) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public float getFloat(final long bOff) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public double getDouble(final long bOff) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public Pointer getPointer(final long bOff) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public String getString(final long bOff, final String encoding) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public String getWideString(final long bOff) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void setByte(final long bOff, final byte value) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void setChar(final long bOff, final char value) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void setShort(final long bOff, final short value) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void setInt(final long bOff, final int value) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void setLong(final long bOff, final long value) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void setFloat(final long bOff, final float value) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void setDouble(final long bOff, final double value) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void setPointer(final long offset, final Pointer value) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void setString(final long offset, final String value, final String encoding) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void setWideString(final long offset, final String value) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public void setMemory(final long offset, final long size, final byte value) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public String dump(final long offset, final int size) {
        throw new UnsupportedOperationException(this.MSG);
    }
    
    @Override
    public String toString() {
        return "const@0x" + Long.toHexString(this.peer);
    }
}
