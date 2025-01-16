// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

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
import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;

public class PacketBuffer extends ByteBuf
{
    private final ByteBuf buf;
    private Map<String, Object> customData;
    
    public PacketBuffer(final ByteBuf field36328) {
        this.buf = field36328;
    }
    
    public PacketBuffer(final ByteBuf field36328, final Map<String, Object> field36329) {
        this.buf = field36328;
        this.customData = field36329;
    }
    
    public static int method29484(final int n) {
        for (int i = 1; i < 5; ++i) {
            if ((n & -1 << i * 7) == 0x0) {
                return i;
            }
        }
        return 5;
    }
    
    public PacketBuffer method29485(final byte[] array) {
        this.writeVarInt(array.length);
        this.writeBytes(array);
        return this;
    }
    
    public byte[] method29486() {
        return this.method29487(this.readableBytes());
    }
    
    public byte[] method29487(final int i) {
        final int method29501 = this.readVarInt();
        if (method29501 <= i) {
            final byte[] array = new byte[method29501];
            this.readBytes(array);
            return array;
        }
        throw new DecoderException("ByteArray with size " + method29501 + " is bigger than allowed " + i);
    }
    
    public PacketBuffer method29488(final int[] array) {
        this.writeVarInt(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.writeVarInt(array[i]);
        }
        return this;
    }
    
    public int[] method29489() {
        return this.method29490(this.readableBytes());
    }
    
    public int[] method29490(final int i) {
        final int method29501 = this.readVarInt();
        if (method29501 <= i) {
            final int[] array = new int[method29501];
            for (int j = 0; j < array.length; ++j) {
                array[j] = this.readVarInt();
            }
            return array;
        }
        throw new DecoderException("VarIntArray with size " + method29501 + " is bigger than allowed " + i);
    }
    
    public PacketBuffer method29491(final long[] array) {
        this.writeVarInt(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.writeLong(array[i]);
        }
        return this;
    }
    
    public long[] method29492(final long[] array) {
        return this.method29493(array, this.readableBytes() / 8);
    }
    
    public long[] method29493(long[] array, final int i) {
        final int method29501 = this.readVarInt();
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
    
    public BlockPos method29494() {
        return BlockPos.fromLong(this.readLong());
    }
    
    public PacketBuffer method29495(final BlockPos class354) {
        this.writeLong(class354.toLong());
        return this;
    }
    
    public Class353 method29496() {
        return Class353.method1092(this.readLong());
    }
    
    public ITextComponent method29497() {
        return Class5953.method17871(this.method29513(262144));
    }
    
    public PacketBuffer method29498(final ITextComponent class2250) {
        return this.method29515(Class5953.method17869(class2250), 262144);
    }
    
    public <T extends Enum<T>> T method29499(final Class<T> clazz) {
        return clazz.getEnumConstants()[this.readVarInt()];
    }
    
    public PacketBuffer method29500(final Enum<?> enum1) {
        return this.writeVarInt(enum1.ordinal());
    }
    
    public int readVarInt() {
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
    
    public PacketBuffer method29503(final UUID uuid) {
        this.writeLong(uuid.getMostSignificantBits());
        this.writeLong(uuid.getLeastSignificantBits());
        return this;
    }
    
    public UUID method29504() {
        return new UUID(this.readLong(), this.readLong());
    }
    
    public PacketBuffer writeVarInt(final int n) {
        this.writeByte(n);
        return this;
    }
    
    public PacketBuffer method29506(long n) {
        while ((n & 0xFFFFFFFFFFFFFF80L) != 0x0L) {
            this.writeByte((int)(n & 0x7FL) | 0x80);
            n >>>= 7;
        }
        this.writeByte((int)n);
        return this;
    }
    
    public PacketBuffer method29507(final Class51 class51) {
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
            return Class8097.method26596((DataInput)new ByteBufInputStream((ByteBuf)this), new NBTSizeTracker(2097152L));
        }
        catch (final IOException ex) {
            throw new EncoderException((Throwable)ex);
        }
    }
    
    public PacketBuffer method29509(final ItemStack class8321) {
        return this.method29510(class8321, true);
    }
    
    public PacketBuffer method29510(final ItemStack class8321, final boolean b) {
        if (!class8321.method27620()) {
            this.writeBoolean(true);
            final Item method27622 = class8321.getItem();
            this.writeVarInt(Item.method11696(method27622));
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
    
    public ItemStack method29511() {
        if (this.readBoolean()) {
            final ItemStack class8321 = new ItemStack(Item.method11697(this.readVarInt()), this.readByte());
            if (!Class9570.field41338.method22605()) {
                class8321.method27663(this.method29508());
            }
            else {
                Class9570.method35826(class8321, Class9570.field41338, this.method29508());
            }
            return class8321;
        }
        return ItemStack.field34174;
    }
    
    public String method29512() {
        return this.method29513(32767);
    }
    
    public String method29513(final int i) {
        final int method29501 = this.readVarInt();
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
    
    public PacketBuffer method29514(final String s) {
        return this.method29515(s, 32767);
    }
    
    public PacketBuffer method29515(final String s, final int i) {
        final byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        if (bytes.length <= i) {
            this.writeVarInt(bytes.length);
            this.writeBytes(bytes);
            return this;
        }
        throw new EncoderException("String too big (was " + bytes.length + " bytes encoded, max " + i + ")");
    }
    
    public ResourceLocation method29516() {
        return new ResourceLocation(this.method29513(32767));
    }
    
    public PacketBuffer method29517(final ResourceLocation class1932) {
        this.method29514(class1932.toString());
        return this;
    }
    
    public Date method29518() {
        return new Date(this.readLong());
    }
    
    public PacketBuffer method29519(final Date date) {
        this.writeLong(date.getTime());
        return this;
    }
    
    public BlockRayTraceResult method29520() {
        final BlockPos method29494 = this.method29494();
        return new BlockRayTraceResult(new Vec3d(method29494.getX() + this.readFloat(), method29494.getY() + this.readFloat(), method29494.getZ() + this.readFloat()), this.method29499(Direction.class), method29494, this.readBoolean());
    }
    
    public void method29521(final BlockRayTraceResult blockRayTraceResult) {
        final BlockPos method21447 = blockRayTraceResult.getPos();
        this.method29495(method21447);
        this.method29500(blockRayTraceResult.getFace());
        final Vec3d method21448 = blockRayTraceResult.getHitVec();
        this.writeFloat((float)(method21448.x - method21447.getX()));
        this.writeFloat((float)(method21448.y - method21447.getY()));
        this.writeFloat((float)(method21448.z - method21447.getZ()));
        this.writeBoolean(blockRayTraceResult.isInside());
    }
    
    public int capacity() {
        return this.buf.capacity();
    }
    
    public ByteBuf capacity(final int n) {
        return this.buf.capacity(n);
    }
    
    public int maxCapacity() {
        return this.buf.maxCapacity();
    }
    
    public ByteBufAllocator alloc() {
        return this.buf.alloc();
    }
    
    public ByteOrder order() {
        return this.buf.order();
    }
    
    public ByteBuf order(final ByteOrder byteOrder) {
        return this.buf.order(byteOrder);
    }
    
    public ByteBuf unwrap() {
        return this.buf.unwrap();
    }
    
    public boolean isDirect() {
        return this.buf.isDirect();
    }
    
    public boolean isReadOnly() {
        return this.buf.isReadOnly();
    }
    
    public ByteBuf asReadOnly() {
        return this.buf.asReadOnly();
    }
    
    public int readerIndex() {
        return this.buf.readerIndex();
    }
    
    public ByteBuf readerIndex(final int n) {
        return this.buf.readerIndex(n);
    }
    
    public int writerIndex() {
        return this.buf.writerIndex();
    }
    
    public ByteBuf writerIndex(final int n) {
        return this.buf.writerIndex(n);
    }
    
    public ByteBuf setIndex(final int n, final int n2) {
        return this.buf.setIndex(n, n2);
    }
    
    public int readableBytes() {
        return this.buf.readableBytes();
    }
    
    public int writableBytes() {
        return this.buf.writableBytes();
    }
    
    public int maxWritableBytes() {
        return this.buf.maxWritableBytes();
    }
    
    public boolean isReadable() {
        return this.buf.isReadable();
    }
    
    public boolean isReadable(final int n) {
        return this.buf.isReadable(n);
    }
    
    public boolean isWritable() {
        return this.buf.isWritable();
    }
    
    public boolean isWritable(final int n) {
        return this.buf.isWritable(n);
    }
    
    public ByteBuf clear() {
        return this.buf.clear();
    }
    
    public ByteBuf markReaderIndex() {
        return this.buf.markReaderIndex();
    }
    
    public ByteBuf resetReaderIndex() {
        return this.buf.resetReaderIndex();
    }
    
    public ByteBuf markWriterIndex() {
        return this.buf.markWriterIndex();
    }
    
    public ByteBuf resetWriterIndex() {
        return this.buf.resetWriterIndex();
    }
    
    public ByteBuf discardReadBytes() {
        return this.buf.discardReadBytes();
    }
    
    public ByteBuf discardSomeReadBytes() {
        return this.buf.discardSomeReadBytes();
    }
    
    public ByteBuf ensureWritable(final int n) {
        return this.buf.ensureWritable(n);
    }
    
    public int ensureWritable(final int n, final boolean b) {
        return this.buf.ensureWritable(n, b);
    }
    
    public boolean getBoolean(final int n) {
        return this.buf.getBoolean(n);
    }
    
    public byte getByte(final int n) {
        return this.buf.getByte(n);
    }
    
    public short getUnsignedByte(final int n) {
        return this.buf.getUnsignedByte(n);
    }
    
    public short getShort(final int n) {
        return this.buf.getShort(n);
    }
    
    public short getShortLE(final int n) {
        return this.buf.getShortLE(n);
    }
    
    public int getUnsignedShort(final int n) {
        return this.buf.getUnsignedShort(n);
    }
    
    public int getUnsignedShortLE(final int n) {
        return this.buf.getUnsignedShortLE(n);
    }
    
    public int getMedium(final int n) {
        return this.buf.getMedium(n);
    }
    
    public int getMediumLE(final int n) {
        return this.buf.getMediumLE(n);
    }
    
    public int getUnsignedMedium(final int n) {
        return this.buf.getUnsignedMedium(n);
    }
    
    public int getUnsignedMediumLE(final int n) {
        return this.buf.getUnsignedMediumLE(n);
    }
    
    public int getInt(final int n) {
        return this.buf.getInt(n);
    }
    
    public int getIntLE(final int n) {
        return this.buf.getIntLE(n);
    }
    
    public long getUnsignedInt(final int n) {
        return this.buf.getUnsignedInt(n);
    }
    
    public long getUnsignedIntLE(final int n) {
        return this.buf.getUnsignedIntLE(n);
    }
    
    public long getLong(final int n) {
        return this.buf.getLong(n);
    }
    
    public long getLongLE(final int n) {
        return this.buf.getLongLE(n);
    }
    
    public char getChar(final int n) {
        return this.buf.getChar(n);
    }
    
    public float getFloat(final int n) {
        return this.buf.getFloat(n);
    }
    
    public double getDouble(final int n) {
        return this.buf.getDouble(n);
    }
    
    public ByteBuf getBytes(final int n, final ByteBuf byteBuf) {
        return this.buf.getBytes(n, byteBuf);
    }
    
    public ByteBuf getBytes(final int n, final ByteBuf byteBuf, final int n2) {
        return this.buf.getBytes(n, byteBuf, n2);
    }
    
    public ByteBuf getBytes(final int n, final ByteBuf byteBuf, final int n2, final int n3) {
        return this.buf.getBytes(n, byteBuf, n2, n3);
    }
    
    public ByteBuf getBytes(final int n, final byte[] array) {
        return this.buf.getBytes(n, array);
    }
    
    public ByteBuf getBytes(final int n, final byte[] array, final int n2, final int n3) {
        return this.buf.getBytes(n, array, n2, n3);
    }
    
    public ByteBuf getBytes(final int n, final ByteBuffer byteBuffer) {
        return this.buf.getBytes(n, byteBuffer);
    }
    
    public ByteBuf getBytes(final int n, final OutputStream outputStream, final int n2) throws IOException {
        return this.buf.getBytes(n, outputStream, n2);
    }
    
    public int getBytes(final int n, final GatheringByteChannel gatheringByteChannel, final int n2) throws IOException {
        return this.buf.getBytes(n, gatheringByteChannel, n2);
    }
    
    public int getBytes(final int n, final FileChannel fileChannel, final long n2, final int n3) throws IOException {
        return this.buf.getBytes(n, fileChannel, n2, n3);
    }
    
    public CharSequence getCharSequence(final int n, final int n2, final Charset charset) {
        return this.buf.getCharSequence(n, n2, charset);
    }
    
    public ByteBuf setBoolean(final int n, final boolean b) {
        return this.buf.setBoolean(n, b);
    }
    
    public ByteBuf setByte(final int n, final int n2) {
        return this.buf.setByte(n, n2);
    }
    
    public ByteBuf setShort(final int n, final int n2) {
        return this.buf.setShort(n, n2);
    }
    
    public ByteBuf setShortLE(final int n, final int n2) {
        return this.buf.setShortLE(n, n2);
    }
    
    public ByteBuf setMedium(final int n, final int n2) {
        return this.buf.setMedium(n, n2);
    }
    
    public ByteBuf setMediumLE(final int n, final int n2) {
        return this.buf.setMediumLE(n, n2);
    }
    
    public ByteBuf setInt(final int n, final int n2) {
        return this.buf.setInt(n, n2);
    }
    
    public ByteBuf setIntLE(final int n, final int n2) {
        return this.buf.setIntLE(n, n2);
    }
    
    public ByteBuf setLong(final int n, final long n2) {
        return this.buf.setLong(n, n2);
    }
    
    public ByteBuf setLongLE(final int n, final long n2) {
        return this.buf.setLongLE(n, n2);
    }
    
    public ByteBuf setChar(final int n, final int n2) {
        return this.buf.setChar(n, n2);
    }
    
    public ByteBuf setFloat(final int n, final float n2) {
        return this.buf.setFloat(n, n2);
    }
    
    public ByteBuf setDouble(final int n, final double n2) {
        return this.buf.setDouble(n, n2);
    }
    
    public ByteBuf setBytes(final int n, final ByteBuf byteBuf) {
        return this.buf.setBytes(n, byteBuf);
    }
    
    public ByteBuf setBytes(final int n, final ByteBuf byteBuf, final int n2) {
        return this.buf.setBytes(n, byteBuf, n2);
    }
    
    public ByteBuf setBytes(final int n, final ByteBuf byteBuf, final int n2, final int n3) {
        return this.buf.setBytes(n, byteBuf, n2, n3);
    }
    
    public ByteBuf setBytes(final int n, final byte[] array) {
        return this.buf.setBytes(n, array);
    }
    
    public ByteBuf setBytes(final int n, final byte[] array, final int n2, final int n3) {
        return this.buf.setBytes(n, array, n2, n3);
    }
    
    public ByteBuf setBytes(final int n, final ByteBuffer byteBuffer) {
        return this.buf.setBytes(n, byteBuffer);
    }
    
    public int setBytes(final int n, final InputStream inputStream, final int n2) throws IOException {
        return this.buf.setBytes(n, inputStream, n2);
    }
    
    public int setBytes(final int n, final ScatteringByteChannel scatteringByteChannel, final int n2) throws IOException {
        return this.buf.setBytes(n, scatteringByteChannel, n2);
    }
    
    public int setBytes(final int n, final FileChannel fileChannel, final long n2, final int n3) throws IOException {
        return this.buf.setBytes(n, fileChannel, n2, n3);
    }
    
    public ByteBuf setZero(final int n, final int n2) {
        return this.buf.setZero(n, n2);
    }
    
    public int setCharSequence(final int n, final CharSequence charSequence, final Charset charset) {
        return this.buf.setCharSequence(n, charSequence, charset);
    }
    
    public boolean readBoolean() {
        return this.buf.readBoolean();
    }
    
    public byte readByte() {
        return this.buf.readByte();
    }
    
    public short readUnsignedByte() {
        return this.buf.readUnsignedByte();
    }
    
    public short readShort() {
        return this.buf.readShort();
    }
    
    public short readShortLE() {
        return this.buf.readShortLE();
    }
    
    public int readUnsignedShort() {
        return this.buf.readUnsignedShort();
    }
    
    public int readUnsignedShortLE() {
        return this.buf.readUnsignedShortLE();
    }
    
    public int readMedium() {
        return this.buf.readMedium();
    }
    
    public int readMediumLE() {
        return this.buf.readMediumLE();
    }
    
    public int readUnsignedMedium() {
        return this.buf.readUnsignedMedium();
    }
    
    public int readUnsignedMediumLE() {
        return this.buf.readUnsignedMediumLE();
    }
    
    public int readInt() {
        return this.buf.readInt();
    }
    
    public int readIntLE() {
        return this.buf.readIntLE();
    }
    
    public long readUnsignedInt() {
        return this.buf.readUnsignedInt();
    }
    
    public long readUnsignedIntLE() {
        return this.buf.readUnsignedIntLE();
    }
    
    public long readLong() {
        return this.buf.readLong();
    }
    
    public long readLongLE() {
        return this.buf.readLongLE();
    }
    
    public char readChar() {
        return this.buf.readChar();
    }
    
    public float readFloat() {
        return this.buf.readFloat();
    }
    
    public double readDouble() {
        return this.buf.readDouble();
    }
    
    public ByteBuf readBytes(final int n) {
        return this.buf.readBytes(n);
    }
    
    public ByteBuf readSlice(final int n) {
        return this.buf.readSlice(n);
    }
    
    public ByteBuf readRetainedSlice(final int n) {
        return this.buf.readRetainedSlice(n);
    }
    
    public ByteBuf readBytes(final ByteBuf byteBuf) {
        return this.buf.readBytes(byteBuf);
    }
    
    public ByteBuf readBytes(final ByteBuf byteBuf, final int n) {
        return this.buf.readBytes(byteBuf, n);
    }
    
    public ByteBuf readBytes(final ByteBuf byteBuf, final int n, final int n2) {
        return this.buf.readBytes(byteBuf, n, n2);
    }
    
    public ByteBuf readBytes(final byte[] array) {
        return this.buf.readBytes(array);
    }
    
    public ByteBuf readBytes(final byte[] array, final int n, final int n2) {
        return this.buf.readBytes(array, n, n2);
    }
    
    public ByteBuf readBytes(final ByteBuffer byteBuffer) {
        return this.buf.readBytes(byteBuffer);
    }
    
    public ByteBuf readBytes(final OutputStream outputStream, final int n) throws IOException {
        return this.buf.readBytes(outputStream, n);
    }
    
    public int readBytes(final GatheringByteChannel gatheringByteChannel, final int n) throws IOException {
        return this.buf.readBytes(gatheringByteChannel, n);
    }
    
    public CharSequence readCharSequence(final int n, final Charset charset) {
        return this.buf.readCharSequence(n, charset);
    }
    
    public int readBytes(final FileChannel fileChannel, final long n, final int n2) throws IOException {
        return this.buf.readBytes(fileChannel, n, n2);
    }
    
    public ByteBuf skipBytes(final int n) {
        return this.buf.skipBytes(n);
    }
    
    public ByteBuf writeBoolean(final boolean b) {
        return this.buf.writeBoolean(b);
    }
    
    public ByteBuf writeByte(final int n) {
        return this.buf.writeByte(n);
    }
    
    public ByteBuf writeShort(final int n) {
        return this.buf.writeShort(n);
    }
    
    public ByteBuf writeShortLE(final int n) {
        return this.buf.writeShortLE(n);
    }
    
    public ByteBuf writeMedium(final int n) {
        return this.buf.writeMedium(n);
    }
    
    public ByteBuf writeMediumLE(final int n) {
        return this.buf.writeMediumLE(n);
    }
    
    public ByteBuf writeInt(final int n) {
        return this.buf.writeInt(n);
    }
    
    public ByteBuf writeIntLE(final int n) {
        return this.buf.writeIntLE(n);
    }
    
    public ByteBuf writeLong(final long n) {
        return this.buf.writeLong(n);
    }
    
    public ByteBuf writeLongLE(final long n) {
        return this.buf.writeLongLE(n);
    }
    
    public ByteBuf writeChar(final int n) {
        return this.buf.writeChar(n);
    }
    
    public ByteBuf writeFloat(final float n) {
        return this.buf.writeFloat(n);
    }
    
    public ByteBuf writeDouble(final double n) {
        return this.buf.writeDouble(n);
    }
    
    public ByteBuf writeBytes(final ByteBuf byteBuf) {
        return this.buf.writeBytes(byteBuf);
    }
    
    public ByteBuf writeBytes(final ByteBuf byteBuf, final int n) {
        return this.buf.writeBytes(byteBuf, n);
    }
    
    public ByteBuf writeBytes(final ByteBuf byteBuf, final int n, final int n2) {
        return this.buf.writeBytes(byteBuf, n, n2);
    }
    
    public ByteBuf writeBytes(final byte[] array) {
        return this.buf.writeBytes(array);
    }
    
    public ByteBuf writeBytes(final byte[] array, final int n, final int n2) {
        return this.buf.writeBytes(array, n, n2);
    }
    
    public ByteBuf writeBytes(final ByteBuffer byteBuffer) {
        return this.buf.writeBytes(byteBuffer);
    }
    
    public int writeBytes(final InputStream inputStream, final int n) throws IOException {
        return this.buf.writeBytes(inputStream, n);
    }
    
    public int writeBytes(final ScatteringByteChannel scatteringByteChannel, final int n) throws IOException {
        return this.buf.writeBytes(scatteringByteChannel, n);
    }
    
    public int writeBytes(final FileChannel fileChannel, final long n, final int n2) throws IOException {
        return this.buf.writeBytes(fileChannel, n, n2);
    }
    
    public ByteBuf writeZero(final int n) {
        return this.buf.writeZero(n);
    }
    
    public int writeCharSequence(final CharSequence charSequence, final Charset charset) {
        return this.buf.writeCharSequence(charSequence, charset);
    }
    
    public int indexOf(final int n, final int n2, final byte b) {
        return this.buf.indexOf(n, n2, b);
    }
    
    public int bytesBefore(final byte b) {
        return this.buf.bytesBefore(b);
    }
    
    public int bytesBefore(final int n, final byte b) {
        return this.buf.bytesBefore(n, b);
    }
    
    public int bytesBefore(final int n, final int n2, final byte b) {
        return this.buf.bytesBefore(n, n2, b);
    }
    
    public int forEachByte(final ByteProcessor byteProcessor) {
        return this.buf.forEachByte(byteProcessor);
    }
    
    public int forEachByte(final int n, final int n2, final ByteProcessor byteProcessor) {
        return this.buf.forEachByte(n, n2, byteProcessor);
    }
    
    public int forEachByteDesc(final ByteProcessor byteProcessor) {
        return this.buf.forEachByteDesc(byteProcessor);
    }
    
    public int forEachByteDesc(final int n, final int n2, final ByteProcessor byteProcessor) {
        return this.buf.forEachByteDesc(n, n2, byteProcessor);
    }
    
    public ByteBuf copy() {
        return this.buf.copy();
    }
    
    public ByteBuf copy(final int n, final int n2) {
        return this.buf.copy(n, n2);
    }
    
    public ByteBuf slice() {
        return this.buf.slice();
    }
    
    public ByteBuf retainedSlice() {
        return this.buf.retainedSlice();
    }
    
    public ByteBuf slice(final int n, final int n2) {
        return this.buf.slice(n, n2);
    }
    
    public ByteBuf retainedSlice(final int n, final int n2) {
        return this.buf.retainedSlice(n, n2);
    }
    
    public ByteBuf duplicate() {
        return this.buf.duplicate();
    }
    
    public ByteBuf retainedDuplicate() {
        return this.buf.retainedDuplicate();
    }
    
    public int nioBufferCount() {
        return this.buf.nioBufferCount();
    }
    
    public ByteBuffer nioBuffer() {
        return this.buf.nioBuffer();
    }
    
    public ByteBuffer nioBuffer(final int n, final int n2) {
        return this.buf.nioBuffer(n, n2);
    }
    
    public ByteBuffer internalNioBuffer(final int n, final int n2) {
        return this.buf.internalNioBuffer(n, n2);
    }
    
    public ByteBuffer[] nioBuffers() {
        return this.buf.nioBuffers();
    }
    
    public ByteBuffer[] nioBuffers(final int n, final int n2) {
        return this.buf.nioBuffers(n, n2);
    }
    
    public boolean hasArray() {
        return this.buf.hasArray();
    }
    
    public byte[] array() {
        return this.buf.array();
    }
    
    public int arrayOffset() {
        return this.buf.arrayOffset();
    }
    
    public boolean hasMemoryAddress() {
        return this.buf.hasMemoryAddress();
    }
    
    public long memoryAddress() {
        return this.buf.memoryAddress();
    }
    
    public String toString(final Charset charset) {
        return this.buf.toString(charset);
    }
    
    public String toString(final int n, final int n2, final Charset charset) {
        return this.buf.toString(n, n2, charset);
    }
    
    public int hashCode() {
        return this.buf.hashCode();
    }
    
    public boolean equals(final Object o) {
        return this.buf.equals(o);
    }
    
    public int compareTo(final ByteBuf byteBuf) {
        return this.buf.compareTo(byteBuf);
    }
    
    public String toString() {
        return this.buf.toString();
    }
    
    public ByteBuf retain(final int n) {
        return this.buf.retain(n);
    }
    
    public ByteBuf retain() {
        return this.buf.retain();
    }
    
    public ByteBuf touch() {
        return this.buf.touch();
    }
    
    public ByteBuf touch(final Object o) {
        return this.buf.touch(o);
    }
    
    public int refCnt() {
        return this.buf.refCnt();
    }
    
    public boolean release() {
        return this.buf.release();
    }
    
    public boolean release(final int n) {
        return this.buf.release(n);
    }
    
    public Map<String, Object> method29522() {
        return this.customData;
    }
    
    public Object method29523(final String s) {
        return (this.customData != null) ? this.customData.get(s) : null;
    }
    
    public void method29524(final Map<String, Object> field36329) {
        this.customData = field36329;
    }
}
