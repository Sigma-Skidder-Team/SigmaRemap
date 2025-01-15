// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.util.ReferenceCounted;
import io.netty.util.ByteProcessor;
import java.nio.channels.ScatteringByteChannel;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import io.netty.buffer.ByteBufAllocator;
import java.util.Date;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import java.io.DataInput;
import io.netty.buffer.ByteBufInputStream;
import java.io.IOException;
import io.netty.handler.codec.EncoderException;
import java.io.DataOutput;
import io.netty.buffer.ByteBufOutputStream;
import java.util.UUID;
import io.netty.handler.codec.DecoderException;
import java.util.Map;
import io.netty.buffer.ByteBuf;

public class Class8654 extends ByteBuf
{
    private final ByteBuf field36328;
    private Map<String, Object> field36329;
    
    public Class8654(final ByteBuf field36328) {
        this.field36328 = field36328;
    }
    
    public Class8654(final ByteBuf field36328, final Map<String, Object> field36329) {
        this.field36328 = field36328;
        this.field36329 = field36329;
    }
    
    public static int method29484(final int n) {
        for (int i = 1; i < 5; ++i) {
            if ((n & -1 << i * 7) == 0x0) {
                return i;
            }
        }
        return 5;
    }
    
    public Class8654 method29485(final byte[] array) {
        this.method29505(array.length);
        this.writeBytes(array);
        return this;
    }
    
    public byte[] method29486() {
        return this.method29487(this.readableBytes());
    }
    
    public byte[] method29487(final int i) {
        final int method29501 = this.method29501();
        if (method29501 <= i) {
            final byte[] array = new byte[method29501];
            this.readBytes(array);
            return array;
        }
        throw new DecoderException("ByteArray with size " + method29501 + " is bigger than allowed " + i);
    }
    
    public Class8654 method29488(final int[] array) {
        this.method29505(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.method29505(array[i]);
        }
        return this;
    }
    
    public int[] method29489() {
        return this.method29490(this.readableBytes());
    }
    
    public int[] method29490(final int i) {
        final int method29501 = this.method29501();
        if (method29501 <= i) {
            final int[] array = new int[method29501];
            for (int j = 0; j < array.length; ++j) {
                array[j] = this.method29501();
            }
            return array;
        }
        throw new DecoderException("VarIntArray with size " + method29501 + " is bigger than allowed " + i);
    }
    
    public Class8654 method29491(final long[] array) {
        this.method29505(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.writeLong(array[i]);
        }
        return this;
    }
    
    public long[] method29492(final long[] array) {
        return this.method29493(array, this.readableBytes() / 8);
    }
    
    public long[] method29493(long[] array, final int i) {
        final int method29501 = this.method29501();
        if (array == null || array.length != method29501) {
            if (method29501 > i) {
                throw new DecoderException("LongArray with size " + method29501 + " is bigger than allowed " + i);
            }
            array = new long[method29501];
        }
        for (int j = 0; j < array.length; ++j) {
            array[j] = this.readLong();
        }
        return array;
    }
    
    public Class354 method29494() {
        return Class354.method1129(this.readLong());
    }
    
    public Class8654 method29495(final Class354 class354) {
        this.writeLong(class354.method1132());
        return this;
    }
    
    public Class353 method29496() {
        return Class353.method1092(this.readLong());
    }
    
    public Class2250 method29497() {
        return Class5953.method17871(this.method29513(262144));
    }
    
    public Class8654 method29498(final Class2250 class2250) {
        return this.method29515(Class5953.method17869(class2250), 262144);
    }
    
    public <T extends Enum<T>> T method29499(final Class<T> clazz) {
        return clazz.getEnumConstants()[this.method29501()];
    }
    
    public Class8654 method29500(final Enum<?> enum1) {
        return this.method29505(enum1.ordinal());
    }
    
    public int method29501() {
        int n = 0;
        int n2 = 0;
        while (true) {
            final byte byte1 = this.readByte();
            n |= (byte1 & 0x7F) << n2++ * 7;
            if (n2 > 5) {
                throw new RuntimeException("VarInt too big");
            }
            if ((byte1 & 0x80) == 0x80) {
                continue;
            }
            return n;
        }
    }
    
    public long method29502() {
        long n = 0L;
        int n2 = 0;
        while (true) {
            final byte byte1 = this.readByte();
            n |= (long)(byte1 & 0x7F) << n2++ * 7;
            if (n2 > 10) {
                throw new RuntimeException("VarLong too big");
            }
            if ((byte1 & 0x80) == 0x80) {
                continue;
            }
            return n;
        }
    }
    
    public Class8654 method29503(final UUID uuid) {
        this.writeLong(uuid.getMostSignificantBits());
        this.writeLong(uuid.getLeastSignificantBits());
        return this;
    }
    
    public UUID method29504() {
        return new UUID(this.readLong(), this.readLong());
    }
    
    public Class8654 method29505(final int n) {
        this.writeByte(n);
        return this;
    }
    
    public Class8654 method29506(long n) {
        while ((n & 0xFFFFFFFFFFFFFF80L) != 0x0L) {
            this.writeByte((int)(n & 0x7FL) | 0x80);
            n >>>= 7;
        }
        this.writeByte((int)n);
        return this;
    }
    
    public Class8654 method29507(final Class51 class51) {
        if (class51 == null) {
            this.writeByte(0);
        }
        else {
            try {
                Class8097.method26597(class51, (DataOutput)new ByteBufOutputStream((ByteBuf)this));
            }
            catch (final IOException ex) {
                throw new EncoderException((Throwable)ex);
            }
        }
        return this;
    }
    
    @Nullable
    public Class51 method29508() {
        final int readerIndex = this.readerIndex();
        if (this.readByte() == 0) {
            return null;
        }
        this.readerIndex(readerIndex);
        try {
            return Class8097.method26596((DataInput)new ByteBufInputStream((ByteBuf)this), new Class7553(2097152L));
        }
        catch (final IOException ex) {
            throw new EncoderException((Throwable)ex);
        }
    }
    
    public Class8654 method29509(final Class8321 class8321) {
        return this.method29510(class8321, true);
    }
    
    public Class8654 method29510(final Class8321 class8321, final boolean b) {
        if (!class8321.method27620()) {
            this.writeBoolean(true);
            final Class3820 method27622 = class8321.method27622();
            this.method29505(Class3820.method11696(method27622));
            this.writeByte(class8321.method27690());
            Class51 method27623 = null;
            if (method27622.method11710() || method27622.method11719()) {
                if (b && Class9570.field41335.method22605()) {
                    method27623 = (Class51)Class9570.method35826(class8321, Class9570.field41335, new Object[0]);
                }
                else {
                    method27623 = class8321.method27657();
                }
            }
            this.method29507(method27623);
        }
        else {
            this.writeBoolean(false);
        }
        return this;
    }
    
    public Class8321 method29511() {
        if (this.readBoolean()) {
            final Class8321 class8321 = new Class8321(Class3820.method11697(this.method29501()), this.readByte());
            if (!Class9570.field41338.method22605()) {
                class8321.method27663(this.method29508());
            }
            else {
                Class9570.method35826(class8321, Class9570.field41338, this.method29508());
            }
            return class8321;
        }
        return Class8321.field34174;
    }
    
    public String method29512() {
        return this.method29513(32767);
    }
    
    public String method29513(final int i) {
        final int method29501 = this.method29501();
        if (method29501 > i * 4) {
            throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + method29501 + " > " + i * 4 + ")");
        }
        if (method29501 < 0) {
            throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
        }
        final String string = this.toString(this.readerIndex(), method29501, StandardCharsets.UTF_8);
        this.readerIndex(this.readerIndex() + method29501);
        if (string.length() <= i) {
            return string;
        }
        throw new DecoderException("The received string length is longer than maximum allowed (" + method29501 + " > " + i + ")");
    }
    
    public Class8654 method29514(final String s) {
        return this.method29515(s, 32767);
    }
    
    public Class8654 method29515(final String s, final int i) {
        final byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        if (bytes.length <= i) {
            this.method29505(bytes.length);
            this.writeBytes(bytes);
            return this;
        }
        throw new EncoderException("String too big (was " + bytes.length + " bytes encoded, max " + i + ")");
    }
    
    public Class1932 method29516() {
        return new Class1932(this.method29513(32767));
    }
    
    public Class8654 method29517(final Class1932 class1932) {
        this.method29514(class1932.toString());
        return this;
    }
    
    public Date method29518() {
        return new Date(this.readLong());
    }
    
    public Class8654 method29519(final Date date) {
        this.writeLong(date.getTime());
        return this;
    }
    
    public Class7005 method29520() {
        final Class354 method29494 = this.method29494();
        return new Class7005(new Class5487(method29494.method1074() + this.readFloat(), method29494.method1075() + this.readFloat(), method29494.method1076() + this.readFloat()), this.method29499(Class179.class), method29494, this.readBoolean());
    }
    
    public void method29521(final Class7005 class7005) {
        final Class354 method21447 = class7005.method21447();
        this.method29495(method21447);
        this.method29500(class7005.method21448());
        final Class5487 method21448 = class7005.method21451();
        this.writeFloat((float)(method21448.field22770 - method21447.method1074()));
        this.writeFloat((float)(method21448.field22771 - method21447.method1075()));
        this.writeFloat((float)(method21448.field22772 - method21447.method1076()));
        this.writeBoolean(class7005.method21450());
    }
    
    public int capacity() {
        return this.field36328.capacity();
    }
    
    public ByteBuf capacity(final int n) {
        return this.field36328.capacity(n);
    }
    
    public int maxCapacity() {
        return this.field36328.maxCapacity();
    }
    
    public ByteBufAllocator alloc() {
        return this.field36328.alloc();
    }
    
    public ByteOrder order() {
        return this.field36328.order();
    }
    
    public ByteBuf order(final ByteOrder byteOrder) {
        return this.field36328.order(byteOrder);
    }
    
    public ByteBuf unwrap() {
        return this.field36328.unwrap();
    }
    
    public boolean isDirect() {
        return this.field36328.isDirect();
    }
    
    public boolean isReadOnly() {
        return this.field36328.isReadOnly();
    }
    
    public ByteBuf asReadOnly() {
        return this.field36328.asReadOnly();
    }
    
    public int readerIndex() {
        return this.field36328.readerIndex();
    }
    
    public ByteBuf readerIndex(final int n) {
        return this.field36328.readerIndex(n);
    }
    
    public int writerIndex() {
        return this.field36328.writerIndex();
    }
    
    public ByteBuf writerIndex(final int n) {
        return this.field36328.writerIndex(n);
    }
    
    public ByteBuf setIndex(final int n, final int n2) {
        return this.field36328.setIndex(n, n2);
    }
    
    public int readableBytes() {
        return this.field36328.readableBytes();
    }
    
    public int writableBytes() {
        return this.field36328.writableBytes();
    }
    
    public int maxWritableBytes() {
        return this.field36328.maxWritableBytes();
    }
    
    public boolean isReadable() {
        return this.field36328.isReadable();
    }
    
    public boolean isReadable(final int n) {
        return this.field36328.isReadable(n);
    }
    
    public boolean isWritable() {
        return this.field36328.isWritable();
    }
    
    public boolean isWritable(final int n) {
        return this.field36328.isWritable(n);
    }
    
    public ByteBuf clear() {
        return this.field36328.clear();
    }
    
    public ByteBuf markReaderIndex() {
        return this.field36328.markReaderIndex();
    }
    
    public ByteBuf resetReaderIndex() {
        return this.field36328.resetReaderIndex();
    }
    
    public ByteBuf markWriterIndex() {
        return this.field36328.markWriterIndex();
    }
    
    public ByteBuf resetWriterIndex() {
        return this.field36328.resetWriterIndex();
    }
    
    public ByteBuf discardReadBytes() {
        return this.field36328.discardReadBytes();
    }
    
    public ByteBuf discardSomeReadBytes() {
        return this.field36328.discardSomeReadBytes();
    }
    
    public ByteBuf ensureWritable(final int n) {
        return this.field36328.ensureWritable(n);
    }
    
    public int ensureWritable(final int n, final boolean b) {
        return this.field36328.ensureWritable(n, b);
    }
    
    public boolean getBoolean(final int n) {
        return this.field36328.getBoolean(n);
    }
    
    public byte getByte(final int n) {
        return this.field36328.getByte(n);
    }
    
    public short getUnsignedByte(final int n) {
        return this.field36328.getUnsignedByte(n);
    }
    
    public short getShort(final int n) {
        return this.field36328.getShort(n);
    }
    
    public short getShortLE(final int n) {
        return this.field36328.getShortLE(n);
    }
    
    public int getUnsignedShort(final int n) {
        return this.field36328.getUnsignedShort(n);
    }
    
    public int getUnsignedShortLE(final int n) {
        return this.field36328.getUnsignedShortLE(n);
    }
    
    public int getMedium(final int n) {
        return this.field36328.getMedium(n);
    }
    
    public int getMediumLE(final int n) {
        return this.field36328.getMediumLE(n);
    }
    
    public int getUnsignedMedium(final int n) {
        return this.field36328.getUnsignedMedium(n);
    }
    
    public int getUnsignedMediumLE(final int n) {
        return this.field36328.getUnsignedMediumLE(n);
    }
    
    public int getInt(final int n) {
        return this.field36328.getInt(n);
    }
    
    public int getIntLE(final int n) {
        return this.field36328.getIntLE(n);
    }
    
    public long getUnsignedInt(final int n) {
        return this.field36328.getUnsignedInt(n);
    }
    
    public long getUnsignedIntLE(final int n) {
        return this.field36328.getUnsignedIntLE(n);
    }
    
    public long getLong(final int n) {
        return this.field36328.getLong(n);
    }
    
    public long getLongLE(final int n) {
        return this.field36328.getLongLE(n);
    }
    
    public char getChar(final int n) {
        return this.field36328.getChar(n);
    }
    
    public float getFloat(final int n) {
        return this.field36328.getFloat(n);
    }
    
    public double getDouble(final int n) {
        return this.field36328.getDouble(n);
    }
    
    public ByteBuf getBytes(final int n, final ByteBuf byteBuf) {
        return this.field36328.getBytes(n, byteBuf);
    }
    
    public ByteBuf getBytes(final int n, final ByteBuf byteBuf, final int n2) {
        return this.field36328.getBytes(n, byteBuf, n2);
    }
    
    public ByteBuf getBytes(final int n, final ByteBuf byteBuf, final int n2, final int n3) {
        return this.field36328.getBytes(n, byteBuf, n2, n3);
    }
    
    public ByteBuf getBytes(final int n, final byte[] array) {
        return this.field36328.getBytes(n, array);
    }
    
    public ByteBuf getBytes(final int n, final byte[] array, final int n2, final int n3) {
        return this.field36328.getBytes(n, array, n2, n3);
    }
    
    public ByteBuf getBytes(final int n, final ByteBuffer byteBuffer) {
        return this.field36328.getBytes(n, byteBuffer);
    }
    
    public ByteBuf getBytes(final int n, final OutputStream outputStream, final int n2) throws IOException {
        return this.field36328.getBytes(n, outputStream, n2);
    }
    
    public int getBytes(final int n, final GatheringByteChannel gatheringByteChannel, final int n2) throws IOException {
        return this.field36328.getBytes(n, gatheringByteChannel, n2);
    }
    
    public int getBytes(final int n, final FileChannel fileChannel, final long n2, final int n3) throws IOException {
        return this.field36328.getBytes(n, fileChannel, n2, n3);
    }
    
    public CharSequence getCharSequence(final int n, final int n2, final Charset charset) {
        return this.field36328.getCharSequence(n, n2, charset);
    }
    
    public ByteBuf setBoolean(final int n, final boolean b) {
        return this.field36328.setBoolean(n, b);
    }
    
    public ByteBuf setByte(final int n, final int n2) {
        return this.field36328.setByte(n, n2);
    }
    
    public ByteBuf setShort(final int n, final int n2) {
        return this.field36328.setShort(n, n2);
    }
    
    public ByteBuf setShortLE(final int n, final int n2) {
        return this.field36328.setShortLE(n, n2);
    }
    
    public ByteBuf setMedium(final int n, final int n2) {
        return this.field36328.setMedium(n, n2);
    }
    
    public ByteBuf setMediumLE(final int n, final int n2) {
        return this.field36328.setMediumLE(n, n2);
    }
    
    public ByteBuf setInt(final int n, final int n2) {
        return this.field36328.setInt(n, n2);
    }
    
    public ByteBuf setIntLE(final int n, final int n2) {
        return this.field36328.setIntLE(n, n2);
    }
    
    public ByteBuf setLong(final int n, final long n2) {
        return this.field36328.setLong(n, n2);
    }
    
    public ByteBuf setLongLE(final int n, final long n2) {
        return this.field36328.setLongLE(n, n2);
    }
    
    public ByteBuf setChar(final int n, final int n2) {
        return this.field36328.setChar(n, n2);
    }
    
    public ByteBuf setFloat(final int n, final float n2) {
        return this.field36328.setFloat(n, n2);
    }
    
    public ByteBuf setDouble(final int n, final double n2) {
        return this.field36328.setDouble(n, n2);
    }
    
    public ByteBuf setBytes(final int n, final ByteBuf byteBuf) {
        return this.field36328.setBytes(n, byteBuf);
    }
    
    public ByteBuf setBytes(final int n, final ByteBuf byteBuf, final int n2) {
        return this.field36328.setBytes(n, byteBuf, n2);
    }
    
    public ByteBuf setBytes(final int n, final ByteBuf byteBuf, final int n2, final int n3) {
        return this.field36328.setBytes(n, byteBuf, n2, n3);
    }
    
    public ByteBuf setBytes(final int n, final byte[] array) {
        return this.field36328.setBytes(n, array);
    }
    
    public ByteBuf setBytes(final int n, final byte[] array, final int n2, final int n3) {
        return this.field36328.setBytes(n, array, n2, n3);
    }
    
    public ByteBuf setBytes(final int n, final ByteBuffer byteBuffer) {
        return this.field36328.setBytes(n, byteBuffer);
    }
    
    public int setBytes(final int n, final InputStream inputStream, final int n2) throws IOException {
        return this.field36328.setBytes(n, inputStream, n2);
    }
    
    public int setBytes(final int n, final ScatteringByteChannel scatteringByteChannel, final int n2) throws IOException {
        return this.field36328.setBytes(n, scatteringByteChannel, n2);
    }
    
    public int setBytes(final int n, final FileChannel fileChannel, final long n2, final int n3) throws IOException {
        return this.field36328.setBytes(n, fileChannel, n2, n3);
    }
    
    public ByteBuf setZero(final int n, final int n2) {
        return this.field36328.setZero(n, n2);
    }
    
    public int setCharSequence(final int n, final CharSequence charSequence, final Charset charset) {
        return this.field36328.setCharSequence(n, charSequence, charset);
    }
    
    public boolean readBoolean() {
        return this.field36328.readBoolean();
    }
    
    public byte readByte() {
        return this.field36328.readByte();
    }
    
    public short readUnsignedByte() {
        return this.field36328.readUnsignedByte();
    }
    
    public short readShort() {
        return this.field36328.readShort();
    }
    
    public short readShortLE() {
        return this.field36328.readShortLE();
    }
    
    public int readUnsignedShort() {
        return this.field36328.readUnsignedShort();
    }
    
    public int readUnsignedShortLE() {
        return this.field36328.readUnsignedShortLE();
    }
    
    public int readMedium() {
        return this.field36328.readMedium();
    }
    
    public int readMediumLE() {
        return this.field36328.readMediumLE();
    }
    
    public int readUnsignedMedium() {
        return this.field36328.readUnsignedMedium();
    }
    
    public int readUnsignedMediumLE() {
        return this.field36328.readUnsignedMediumLE();
    }
    
    public int readInt() {
        return this.field36328.readInt();
    }
    
    public int readIntLE() {
        return this.field36328.readIntLE();
    }
    
    public long readUnsignedInt() {
        return this.field36328.readUnsignedInt();
    }
    
    public long readUnsignedIntLE() {
        return this.field36328.readUnsignedIntLE();
    }
    
    public long readLong() {
        return this.field36328.readLong();
    }
    
    public long readLongLE() {
        return this.field36328.readLongLE();
    }
    
    public char readChar() {
        return this.field36328.readChar();
    }
    
    public float readFloat() {
        return this.field36328.readFloat();
    }
    
    public double readDouble() {
        return this.field36328.readDouble();
    }
    
    public ByteBuf readBytes(final int n) {
        return this.field36328.readBytes(n);
    }
    
    public ByteBuf readSlice(final int n) {
        return this.field36328.readSlice(n);
    }
    
    public ByteBuf readRetainedSlice(final int n) {
        return this.field36328.readRetainedSlice(n);
    }
    
    public ByteBuf readBytes(final ByteBuf byteBuf) {
        return this.field36328.readBytes(byteBuf);
    }
    
    public ByteBuf readBytes(final ByteBuf byteBuf, final int n) {
        return this.field36328.readBytes(byteBuf, n);
    }
    
    public ByteBuf readBytes(final ByteBuf byteBuf, final int n, final int n2) {
        return this.field36328.readBytes(byteBuf, n, n2);
    }
    
    public ByteBuf readBytes(final byte[] array) {
        return this.field36328.readBytes(array);
    }
    
    public ByteBuf readBytes(final byte[] array, final int n, final int n2) {
        return this.field36328.readBytes(array, n, n2);
    }
    
    public ByteBuf readBytes(final ByteBuffer byteBuffer) {
        return this.field36328.readBytes(byteBuffer);
    }
    
    public ByteBuf readBytes(final OutputStream outputStream, final int n) throws IOException {
        return this.field36328.readBytes(outputStream, n);
    }
    
    public int readBytes(final GatheringByteChannel gatheringByteChannel, final int n) throws IOException {
        return this.field36328.readBytes(gatheringByteChannel, n);
    }
    
    public CharSequence readCharSequence(final int n, final Charset charset) {
        return this.field36328.readCharSequence(n, charset);
    }
    
    public int readBytes(final FileChannel fileChannel, final long n, final int n2) throws IOException {
        return this.field36328.readBytes(fileChannel, n, n2);
    }
    
    public ByteBuf skipBytes(final int n) {
        return this.field36328.skipBytes(n);
    }
    
    public ByteBuf writeBoolean(final boolean b) {
        return this.field36328.writeBoolean(b);
    }
    
    public ByteBuf writeByte(final int n) {
        return this.field36328.writeByte(n);
    }
    
    public ByteBuf writeShort(final int n) {
        return this.field36328.writeShort(n);
    }
    
    public ByteBuf writeShortLE(final int n) {
        return this.field36328.writeShortLE(n);
    }
    
    public ByteBuf writeMedium(final int n) {
        return this.field36328.writeMedium(n);
    }
    
    public ByteBuf writeMediumLE(final int n) {
        return this.field36328.writeMediumLE(n);
    }
    
    public ByteBuf writeInt(final int n) {
        return this.field36328.writeInt(n);
    }
    
    public ByteBuf writeIntLE(final int n) {
        return this.field36328.writeIntLE(n);
    }
    
    public ByteBuf writeLong(final long n) {
        return this.field36328.writeLong(n);
    }
    
    public ByteBuf writeLongLE(final long n) {
        return this.field36328.writeLongLE(n);
    }
    
    public ByteBuf writeChar(final int n) {
        return this.field36328.writeChar(n);
    }
    
    public ByteBuf writeFloat(final float n) {
        return this.field36328.writeFloat(n);
    }
    
    public ByteBuf writeDouble(final double n) {
        return this.field36328.writeDouble(n);
    }
    
    public ByteBuf writeBytes(final ByteBuf byteBuf) {
        return this.field36328.writeBytes(byteBuf);
    }
    
    public ByteBuf writeBytes(final ByteBuf byteBuf, final int n) {
        return this.field36328.writeBytes(byteBuf, n);
    }
    
    public ByteBuf writeBytes(final ByteBuf byteBuf, final int n, final int n2) {
        return this.field36328.writeBytes(byteBuf, n, n2);
    }
    
    public ByteBuf writeBytes(final byte[] array) {
        return this.field36328.writeBytes(array);
    }
    
    public ByteBuf writeBytes(final byte[] array, final int n, final int n2) {
        return this.field36328.writeBytes(array, n, n2);
    }
    
    public ByteBuf writeBytes(final ByteBuffer byteBuffer) {
        return this.field36328.writeBytes(byteBuffer);
    }
    
    public int writeBytes(final InputStream inputStream, final int n) throws IOException {
        return this.field36328.writeBytes(inputStream, n);
    }
    
    public int writeBytes(final ScatteringByteChannel scatteringByteChannel, final int n) throws IOException {
        return this.field36328.writeBytes(scatteringByteChannel, n);
    }
    
    public int writeBytes(final FileChannel fileChannel, final long n, final int n2) throws IOException {
        return this.field36328.writeBytes(fileChannel, n, n2);
    }
    
    public ByteBuf writeZero(final int n) {
        return this.field36328.writeZero(n);
    }
    
    public int writeCharSequence(final CharSequence charSequence, final Charset charset) {
        return this.field36328.writeCharSequence(charSequence, charset);
    }
    
    public int indexOf(final int n, final int n2, final byte b) {
        return this.field36328.indexOf(n, n2, b);
    }
    
    public int bytesBefore(final byte b) {
        return this.field36328.bytesBefore(b);
    }
    
    public int bytesBefore(final int n, final byte b) {
        return this.field36328.bytesBefore(n, b);
    }
    
    public int bytesBefore(final int n, final int n2, final byte b) {
        return this.field36328.bytesBefore(n, n2, b);
    }
    
    public int forEachByte(final ByteProcessor byteProcessor) {
        return this.field36328.forEachByte(byteProcessor);
    }
    
    public int forEachByte(final int n, final int n2, final ByteProcessor byteProcessor) {
        return this.field36328.forEachByte(n, n2, byteProcessor);
    }
    
    public int forEachByteDesc(final ByteProcessor byteProcessor) {
        return this.field36328.forEachByteDesc(byteProcessor);
    }
    
    public int forEachByteDesc(final int n, final int n2, final ByteProcessor byteProcessor) {
        return this.field36328.forEachByteDesc(n, n2, byteProcessor);
    }
    
    public ByteBuf copy() {
        return this.field36328.copy();
    }
    
    public ByteBuf copy(final int n, final int n2) {
        return this.field36328.copy(n, n2);
    }
    
    public ByteBuf slice() {
        return this.field36328.slice();
    }
    
    public ByteBuf retainedSlice() {
        return this.field36328.retainedSlice();
    }
    
    public ByteBuf slice(final int n, final int n2) {
        return this.field36328.slice(n, n2);
    }
    
    public ByteBuf retainedSlice(final int n, final int n2) {
        return this.field36328.retainedSlice(n, n2);
    }
    
    public ByteBuf duplicate() {
        return this.field36328.duplicate();
    }
    
    public ByteBuf retainedDuplicate() {
        return this.field36328.retainedDuplicate();
    }
    
    public int nioBufferCount() {
        return this.field36328.nioBufferCount();
    }
    
    public ByteBuffer nioBuffer() {
        return this.field36328.nioBuffer();
    }
    
    public ByteBuffer nioBuffer(final int n, final int n2) {
        return this.field36328.nioBuffer(n, n2);
    }
    
    public ByteBuffer internalNioBuffer(final int n, final int n2) {
        return this.field36328.internalNioBuffer(n, n2);
    }
    
    public ByteBuffer[] nioBuffers() {
        return this.field36328.nioBuffers();
    }
    
    public ByteBuffer[] nioBuffers(final int n, final int n2) {
        return this.field36328.nioBuffers(n, n2);
    }
    
    public boolean hasArray() {
        return this.field36328.hasArray();
    }
    
    public byte[] array() {
        return this.field36328.array();
    }
    
    public int arrayOffset() {
        return this.field36328.arrayOffset();
    }
    
    public boolean hasMemoryAddress() {
        return this.field36328.hasMemoryAddress();
    }
    
    public long memoryAddress() {
        return this.field36328.memoryAddress();
    }
    
    public String toString(final Charset charset) {
        return this.field36328.toString(charset);
    }
    
    public String toString(final int n, final int n2, final Charset charset) {
        return this.field36328.toString(n, n2, charset);
    }
    
    public int hashCode() {
        return this.field36328.hashCode();
    }
    
    public boolean equals(final Object o) {
        return this.field36328.equals(o);
    }
    
    public int compareTo(final ByteBuf byteBuf) {
        return this.field36328.compareTo(byteBuf);
    }
    
    public String toString() {
        return this.field36328.toString();
    }
    
    public ByteBuf retain(final int n) {
        return this.field36328.retain(n);
    }
    
    public ByteBuf retain() {
        return this.field36328.retain();
    }
    
    public ByteBuf touch() {
        return this.field36328.touch();
    }
    
    public ByteBuf touch(final Object o) {
        return this.field36328.touch(o);
    }
    
    public int refCnt() {
        return this.field36328.refCnt();
    }
    
    public boolean release() {
        return this.field36328.release();
    }
    
    public boolean release(final int n) {
        return this.field36328.release(n);
    }
    
    public Map<String, Object> method29522() {
        return this.field36329;
    }
    
    public Object method29523(final String s) {
        return (this.field36329 != null) ? this.field36329.get(s) : null;
    }
    
    public void method29524(final Map<String, Object> field36329) {
        this.field36329 = field36329;
    }
}
