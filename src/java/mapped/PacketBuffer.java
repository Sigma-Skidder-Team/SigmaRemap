package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DataResult.PartialResult;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import io.netty.util.ByteProcessor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;

public class PacketBuffer extends ByteBuf {
   private final ByteBuf field43618;
   private Map<String, Object> field43619;

   public PacketBuffer(ByteBuf var1) {
      this.field43618 = var1;
   }

   public PacketBuffer(ByteBuf var1, Map<String, Object> var2) {
      this.field43618 = var1;
      this.field43619 = var2;
   }

   public static int method35695(int var0) {
      for (int var3 = 1; var3 < 5; var3++) {
         if ((var0 & -1 << var3 * 7) == 0) {
            return var3;
         }
      }

      return 5;
   }

   public <T> T method35696(Codec<T> var1) throws IOException {
      CompoundNBT var4 = this.method35722();
      DataResult var5 = var1.parse(NBTDynamicOps.INSTANCE, var4);
      if (!var5.error().isPresent()) {
         return (T)var5.result().get();
      } else {
         throw new IOException("Failed to decode: " + ((PartialResult)var5.error().get()).message() + " " + var4);
      }
   }

   public <T> void method35697(Codec<T> var1, T var2) throws IOException {
      DataResult var5 = var1.encodeStart(NBTDynamicOps.INSTANCE, var2);
      if (!var5.error().isPresent()) {
         this.method35720((CompoundNBT)var5.result().get());
      } else {
         throw new IOException("Failed to encode: " + ((PartialResult)var5.error().get()).message() + " " + var2);
      }
   }

   public PacketBuffer method35698(byte[] var1) {
      this.writeVarInt(var1.length);
      this.writeBytes(var1);
      return this;
   }

   public byte[] method35699() {
      return this.method35700(this.readableBytes());
   }

   public byte[] method35700(int var1) {
      int var4 = this.method35714();
      if (var4 <= var1) {
         byte[] var5 = new byte[var4];
         this.readBytes(var5);
         return var5;
      } else {
         throw new DecoderException("ByteArray with size " + var4 + " is bigger than allowed " + var1);
      }
   }

   public PacketBuffer method35701(int[] var1) {
      this.writeVarInt(var1.length);

      for (int var7 : var1) {
         this.writeVarInt(var7);
      }

      return this;
   }

   public int[] method35702() {
      return this.method35703(this.readableBytes());
   }

   public int[] method35703(int var1) {
      int var4 = this.method35714();
      if (var4 > var1) {
         throw new DecoderException("VarIntArray with size " + var4 + " is bigger than allowed " + var1);
      } else {
         int[] var5 = new int[var4];

         for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6] = this.method35714();
         }

         return var5;
      }
   }

   public PacketBuffer method35704(long[] var1) {
      this.writeVarInt(var1.length);

      for (long var7 : var1) {
         this.writeLong(var7);
      }

      return this;
   }

   public long[] method35705(long[] var1) {
      return this.method35706(var1, this.readableBytes() / 8);
   }

   public long[] method35706(long[] var1, int var2) {
      int var5 = this.method35714();
      if (var1 == null || var1.length != var5) {
         if (var5 > var2) {
            throw new DecoderException("LongArray with size " + var5 + " is bigger than allowed " + var2);
         }

         var1 = new long[var5];
      }

      for (int var6 = 0; var6 < var1.length; var6++) {
         var1[var6] = this.readLong();
      }

      return var1;
   }

   public BlockPos method35707() {
      return BlockPos.method8331(this.readLong());
   }

   public PacketBuffer method35708(BlockPos var1) {
      this.writeLong(var1.method8332());
      return this;
   }

   public Class2002 method35709() {
      return Class2002.method8393(this.readLong());
   }

   public ITextComponent method35710() {
      return ITextComponent$Serializer.func_240643_a_(this.method35728(262144));
   }

   public PacketBuffer method35711(ITextComponent var1) {
      return this.method35730(ITextComponent$Serializer.toJson(var1), 262144);
   }

   public <T extends Enum<T>> T method35712(Class<T> var1) {
      return (T)var1.getEnumConstants()[this.method35714()];
   }

   public PacketBuffer method35713(Enum<?> var1) {
      return this.writeVarInt(var1.ordinal());
   }

   public int method35714() {
      int var3 = 0;
      int var4 = 0;

      byte var5;
      do {
         var5 = this.readByte();
         var3 |= (var5 & 127) << var4++ * 7;
         if (var4 > 5) {
            throw new RuntimeException("VarInt too big");
         }
      } while ((var5 & 128) == 128);

      return var3;
   }

   public long method35715() {
      long var3 = 0L;
      int var5 = 0;

      byte var6;
      do {
         var6 = this.readByte();
         var3 |= (long)(var6 & 127) << var5++ * 7;
         if (var5 > 10) {
            throw new RuntimeException("VarLong too big");
         }
      } while ((var6 & 128) == 128);

      return var3;
   }

   public PacketBuffer method35716(UUID var1) {
      this.writeLong(var1.getMostSignificantBits());
      this.writeLong(var1.getLeastSignificantBits());
      return this;
   }

   public UUID method35717() {
      return new UUID(this.readLong(), this.readLong());
   }

   public PacketBuffer writeVarInt(int input) {
      while((input & -128) != 0) {
         this.writeByte(input & 127 | 128);
         input >>>= 7;
      }

      this.writeByte(input);
      return this;
   }

   public PacketBuffer method35719(long var1) {
      while ((var1 & -128L) != 0L) {
         this.writeByte((int)(var1 & 127L) | 128);
         var1 >>>= 7;
      }

      this.writeByte((int)var1);
      return this;
   }

   public PacketBuffer method35720(CompoundNBT var1) {
      if (var1 == null) {
         this.writeByte(0);
      } else {
         try {
            Class8799.method31773(var1, new ByteBufOutputStream(this));
         } catch (IOException var5) {
            throw new EncoderException(var5);
         }
      }

      return this;
   }

   @Nullable
   public CompoundNBT method35721() {
      return this.method35723(new Class8465(2097152L));
   }

   @Nullable
   public CompoundNBT method35722() {
      return this.method35723(Class8465.field36284);
   }

   @Nullable
   public CompoundNBT method35723(Class8465 var1) {
      int var4 = this.readerIndex();
      byte var5 = this.readByte();
      if (var5 == 0) {
         return null;
      } else {
         this.readerIndex(var4);

         try {
            return Class8799.method31772(new ByteBufInputStream(this), var1);
         } catch (IOException var7) {
            throw new EncoderException(var7);
         }
      }
   }

   public PacketBuffer method35724(ItemStack var1) {
      return this.method35725(var1, true);
   }

   public PacketBuffer method35725(ItemStack var1, boolean var2) {
      if (!var1.isEmpty()) {
         this.writeBoolean(true);
         Item var5 = var1.getItem();
         this.writeVarInt(Item.method11701(var5));
         this.writeByte(var1.getCount());
         CompoundNBT var6 = null;
         if (Class9561.method37058(var5, var1) || var5.method11721()) {
            if (var2 && Class9299.field42923.method20214()) {
               var6 = (CompoundNBT)Class9299.method35070(var1, Class9299.field42923);
            } else {
               var6 = var1.method32142();
            }
         }

         this.method35720(var6);
      } else {
         this.writeBoolean(false);
      }

      return this;
   }

   public ItemStack method35726() {
      if (this.readBoolean()) {
         int var3 = this.method35714();
         byte var4 = this.readByte();
         ItemStack var5 = new ItemStack(Item.method11702(var3), var4);
         if (!Class9299.field42926.method20214()) {
            var5.method32148(this.method35721());
         } else {
            Class9299.method35070(var5, Class9299.field42926, this.method35721());
         }

         return var5;
      } else {
         return ItemStack.EMPTY;
      }
   }

   public String method35727() {
      return this.method35728(32767);
   }

   public String method35728(int var1) {
      int var4 = this.method35714();
      if (var4 <= var1 * 4) {
         if (var4 >= 0) {
            String var5 = this.toString(this.readerIndex(), var4, StandardCharsets.UTF_8);
            this.readerIndex(this.readerIndex() + var4);
            if (var5.length() <= var1) {
               return var5;
            } else {
               throw new DecoderException("The received string length is longer than maximum allowed (" + var4 + " > " + var1 + ")");
            }
         } else {
            throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
         }
      } else {
         throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + var4 + " > " + var1 * 4 + ")");
      }
   }

   public PacketBuffer method35729(String var1) {
      return this.method35730(var1, 32767);
   }

   public PacketBuffer method35730(String var1, int var2) {
      byte[] var5 = var1.getBytes(StandardCharsets.UTF_8);
      if (var5.length <= var2) {
         this.writeVarInt(var5.length);
         this.writeBytes(var5);
         return this;
      } else {
         throw new EncoderException("String too big (was " + var5.length + " bytes encoded, max " + var2 + ")");
      }
   }

   public ResourceLocation method35731() {
      return new ResourceLocation(this.method35728(32767));
   }

   public PacketBuffer method35732(ResourceLocation var1) {
      this.method35729(var1.toString());
      return this;
   }

   public Date method35733() {
      return new Date(this.readLong());
   }

   public PacketBuffer method35734(Date var1) {
      this.writeLong(var1.getTime());
      return this;
   }

   public BlockRayTraceResult method35735() {
      BlockPos var3 = this.method35707();
      Direction var4 = this.<Direction>method35712(Direction.class);
      float var5 = this.readFloat();
      float var6 = this.readFloat();
      float var7 = this.readFloat();
      boolean var8 = this.readBoolean();
      return new BlockRayTraceResult(
         new Vector3d((double)var3.getX() + (double)var5, (double)var3.getY() + (double)var6, (double)var3.getZ() + (double)var7),
         var4,
         var3,
         var8
      );
   }

   public void method35736(BlockRayTraceResult var1) {
      BlockPos var4 = var1.getPos();
      this.method35708(var4);
      this.method35713(var1.getFace());
      Vector3d var5 = var1.method31419();
      this.writeFloat((float)(var5.field18048 - (double)var4.getX()));
      this.writeFloat((float)(var5.field18049 - (double)var4.getY()));
      this.writeFloat((float)(var5.field18050 - (double)var4.getZ()));
      this.writeBoolean(var1.method31425());
   }

   public int capacity() {
      return this.field43618.capacity();
   }

   public ByteBuf capacity(int var1) {
      return this.field43618.capacity(var1);
   }

   public int maxCapacity() {
      return this.field43618.maxCapacity();
   }

   public ByteBufAllocator alloc() {
      return this.field43618.alloc();
   }

   public ByteOrder order() {
      return this.field43618.order();
   }

   public ByteBuf order(ByteOrder var1) {
      return this.field43618.order(var1);
   }

   public ByteBuf unwrap() {
      return this.field43618.unwrap();
   }

   public boolean isDirect() {
      return this.field43618.isDirect();
   }

   public boolean isReadOnly() {
      return this.field43618.isReadOnly();
   }

   public ByteBuf asReadOnly() {
      return this.field43618.asReadOnly();
   }

   public int readerIndex() {
      return this.field43618.readerIndex();
   }

   public ByteBuf readerIndex(int var1) {
      return this.field43618.readerIndex(var1);
   }

   public int writerIndex() {
      return this.field43618.writerIndex();
   }

   public ByteBuf writerIndex(int var1) {
      return this.field43618.writerIndex(var1);
   }

   public ByteBuf setIndex(int var1, int var2) {
      return this.field43618.setIndex(var1, var2);
   }

   public int readableBytes() {
      return this.field43618.readableBytes();
   }

   public int writableBytes() {
      return this.field43618.writableBytes();
   }

   public int maxWritableBytes() {
      return this.field43618.maxWritableBytes();
   }

   public boolean isReadable() {
      return this.field43618.isReadable();
   }

   public boolean isReadable(int var1) {
      return this.field43618.isReadable(var1);
   }

   public boolean isWritable() {
      return this.field43618.isWritable();
   }

   public boolean isWritable(int var1) {
      return this.field43618.isWritable(var1);
   }

   public ByteBuf clear() {
      return this.field43618.clear();
   }

   public ByteBuf markReaderIndex() {
      return this.field43618.markReaderIndex();
   }

   public ByteBuf resetReaderIndex() {
      return this.field43618.resetReaderIndex();
   }

   public ByteBuf markWriterIndex() {
      return this.field43618.markWriterIndex();
   }

   public ByteBuf resetWriterIndex() {
      return this.field43618.resetWriterIndex();
   }

   public ByteBuf discardReadBytes() {
      return this.field43618.discardReadBytes();
   }

   public ByteBuf discardSomeReadBytes() {
      return this.field43618.discardSomeReadBytes();
   }

   public ByteBuf ensureWritable(int var1) {
      return this.field43618.ensureWritable(var1);
   }

   public int ensureWritable(int var1, boolean var2) {
      return this.field43618.ensureWritable(var1, var2);
   }

   public boolean getBoolean(int var1) {
      return this.field43618.getBoolean(var1);
   }

   public byte getByte(int var1) {
      return this.field43618.getByte(var1);
   }

   public short getUnsignedByte(int var1) {
      return this.field43618.getUnsignedByte(var1);
   }

   public short getShort(int var1) {
      return this.field43618.getShort(var1);
   }

   public short getShortLE(int var1) {
      return this.field43618.getShortLE(var1);
   }

   public int getUnsignedShort(int var1) {
      return this.field43618.getUnsignedShort(var1);
   }

   public int getUnsignedShortLE(int var1) {
      return this.field43618.getUnsignedShortLE(var1);
   }

   public int getMedium(int var1) {
      return this.field43618.getMedium(var1);
   }

   public int getMediumLE(int var1) {
      return this.field43618.getMediumLE(var1);
   }

   public int getUnsignedMedium(int var1) {
      return this.field43618.getUnsignedMedium(var1);
   }

   public int getUnsignedMediumLE(int var1) {
      return this.field43618.getUnsignedMediumLE(var1);
   }

   public int getInt(int var1) {
      return this.field43618.getInt(var1);
   }

   public int getIntLE(int var1) {
      return this.field43618.getIntLE(var1);
   }

   public long getUnsignedInt(int var1) {
      return this.field43618.getUnsignedInt(var1);
   }

   public long getUnsignedIntLE(int var1) {
      return this.field43618.getUnsignedIntLE(var1);
   }

   public long getLong(int var1) {
      return this.field43618.getLong(var1);
   }

   public long getLongLE(int var1) {
      return this.field43618.getLongLE(var1);
   }

   public char getChar(int var1) {
      return this.field43618.getChar(var1);
   }

   public float getFloat(int var1) {
      return this.field43618.getFloat(var1);
   }

   public double getDouble(int var1) {
      return this.field43618.getDouble(var1);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2) {
      return this.field43618.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3) {
      return this.field43618.getBytes(var1, var2, var3);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.field43618.getBytes(var1, var2, var3, var4);
   }

   public ByteBuf getBytes(int var1, byte[] var2) {
      return this.field43618.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, byte[] var2, int var3, int var4) {
      return this.field43618.getBytes(var1, var2, var3, var4);
   }

   public ByteBuf getBytes(int var1, ByteBuffer var2) {
      return this.field43618.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, OutputStream var2, int var3) throws IOException {
      return this.field43618.getBytes(var1, var2, var3);
   }

   public int getBytes(int var1, GatheringByteChannel var2, int var3) throws IOException {
      return this.field43618.getBytes(var1, var2, var3);
   }

   public int getBytes(int var1, FileChannel var2, long var3, int var5) throws IOException {
      return this.field43618.getBytes(var1, var2, var3, var5);
   }

   public CharSequence getCharSequence(int var1, int var2, Charset var3) {
      return this.field43618.getCharSequence(var1, var2, var3);
   }

   public ByteBuf setBoolean(int var1, boolean var2) {
      return this.field43618.setBoolean(var1, var2);
   }

   public ByteBuf setByte(int var1, int var2) {
      return this.field43618.setByte(var1, var2);
   }

   public ByteBuf setShort(int var1, int var2) {
      return this.field43618.setShort(var1, var2);
   }

   public ByteBuf setShortLE(int var1, int var2) {
      return this.field43618.setShortLE(var1, var2);
   }

   public ByteBuf setMedium(int var1, int var2) {
      return this.field43618.setMedium(var1, var2);
   }

   public ByteBuf setMediumLE(int var1, int var2) {
      return this.field43618.setMediumLE(var1, var2);
   }

   public ByteBuf setInt(int var1, int var2) {
      return this.field43618.setInt(var1, var2);
   }

   public ByteBuf setIntLE(int var1, int var2) {
      return this.field43618.setIntLE(var1, var2);
   }

   public ByteBuf setLong(int var1, long var2) {
      return this.field43618.setLong(var1, var2);
   }

   public ByteBuf setLongLE(int var1, long var2) {
      return this.field43618.setLongLE(var1, var2);
   }

   public ByteBuf setChar(int var1, int var2) {
      return this.field43618.setChar(var1, var2);
   }

   public ByteBuf setFloat(int var1, float var2) {
      return this.field43618.setFloat(var1, var2);
   }

   public ByteBuf setDouble(int var1, double var2) {
      return this.field43618.setDouble(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2) {
      return this.field43618.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3) {
      return this.field43618.setBytes(var1, var2, var3);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.field43618.setBytes(var1, var2, var3, var4);
   }

   public ByteBuf setBytes(int var1, byte[] var2) {
      return this.field43618.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, byte[] var2, int var3, int var4) {
      return this.field43618.setBytes(var1, var2, var3, var4);
   }

   public ByteBuf setBytes(int var1, ByteBuffer var2) {
      return this.field43618.setBytes(var1, var2);
   }

   public int setBytes(int var1, InputStream var2, int var3) throws IOException {
      return this.field43618.setBytes(var1, var2, var3);
   }

   public int setBytes(int var1, ScatteringByteChannel var2, int var3) throws IOException {
      return this.field43618.setBytes(var1, var2, var3);
   }

   public int setBytes(int var1, FileChannel var2, long var3, int var5) throws IOException {
      return this.field43618.setBytes(var1, var2, var3, var5);
   }

   public ByteBuf setZero(int var1, int var2) {
      return this.field43618.setZero(var1, var2);
   }

   public int setCharSequence(int var1, CharSequence var2, Charset var3) {
      return this.field43618.setCharSequence(var1, var2, var3);
   }

   public boolean readBoolean() {
      return this.field43618.readBoolean();
   }

   public byte readByte() {
      return this.field43618.readByte();
   }

   public short readUnsignedByte() {
      return this.field43618.readUnsignedByte();
   }

   public short readShort() {
      return this.field43618.readShort();
   }

   public short readShortLE() {
      return this.field43618.readShortLE();
   }

   public int readUnsignedShort() {
      return this.field43618.readUnsignedShort();
   }

   public int readUnsignedShortLE() {
      return this.field43618.readUnsignedShortLE();
   }

   public int readMedium() {
      return this.field43618.readMedium();
   }

   public int readMediumLE() {
      return this.field43618.readMediumLE();
   }

   public int readUnsignedMedium() {
      return this.field43618.readUnsignedMedium();
   }

   public int readUnsignedMediumLE() {
      return this.field43618.readUnsignedMediumLE();
   }

   public int readInt() {
      return this.field43618.readInt();
   }

   public int readIntLE() {
      return this.field43618.readIntLE();
   }

   public long readUnsignedInt() {
      return this.field43618.readUnsignedInt();
   }

   public long readUnsignedIntLE() {
      return this.field43618.readUnsignedIntLE();
   }

   public long readLong() {
      return this.field43618.readLong();
   }

   public long readLongLE() {
      return this.field43618.readLongLE();
   }

   public char readChar() {
      return this.field43618.readChar();
   }

   public float readFloat() {
      return this.field43618.readFloat();
   }

   public double readDouble() {
      return this.field43618.readDouble();
   }

   public ByteBuf readBytes(int var1) {
      return this.field43618.readBytes(var1);
   }

   public ByteBuf readSlice(int var1) {
      return this.field43618.readSlice(var1);
   }

   public ByteBuf readRetainedSlice(int var1) {
      return this.field43618.readRetainedSlice(var1);
   }

   public ByteBuf readBytes(ByteBuf var1) {
      return this.field43618.readBytes(var1);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2) {
      return this.field43618.readBytes(var1, var2);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2, int var3) {
      return this.field43618.readBytes(var1, var2, var3);
   }

   public ByteBuf readBytes(byte[] var1) {
      return this.field43618.readBytes(var1);
   }

   public ByteBuf readBytes(byte[] var1, int var2, int var3) {
      return this.field43618.readBytes(var1, var2, var3);
   }

   public ByteBuf readBytes(ByteBuffer var1) {
      return this.field43618.readBytes(var1);
   }

   public ByteBuf readBytes(OutputStream var1, int var2) throws IOException {
      return this.field43618.readBytes(var1, var2);
   }

   public int readBytes(GatheringByteChannel var1, int var2) throws IOException {
      return this.field43618.readBytes(var1, var2);
   }

   public CharSequence readCharSequence(int var1, Charset var2) {
      return this.field43618.readCharSequence(var1, var2);
   }

   public int readBytes(FileChannel var1, long var2, int var4) throws IOException {
      return this.field43618.readBytes(var1, var2, var4);
   }

   public ByteBuf skipBytes(int var1) {
      return this.field43618.skipBytes(var1);
   }

   public ByteBuf writeBoolean(boolean var1) {
      return this.field43618.writeBoolean(var1);
   }

   public ByteBuf writeByte(int var1) {
      return this.field43618.writeByte(var1);
   }

   public ByteBuf writeShort(int var1) {
      return this.field43618.writeShort(var1);
   }

   public ByteBuf writeShortLE(int var1) {
      return this.field43618.writeShortLE(var1);
   }

   public ByteBuf writeMedium(int var1) {
      return this.field43618.writeMedium(var1);
   }

   public ByteBuf writeMediumLE(int var1) {
      return this.field43618.writeMediumLE(var1);
   }

   public ByteBuf writeInt(int var1) {
      return this.field43618.writeInt(var1);
   }

   public ByteBuf writeIntLE(int var1) {
      return this.field43618.writeIntLE(var1);
   }

   public ByteBuf writeLong(long var1) {
      return this.field43618.writeLong(var1);
   }

   public ByteBuf writeLongLE(long var1) {
      return this.field43618.writeLongLE(var1);
   }

   public ByteBuf writeChar(int var1) {
      return this.field43618.writeChar(var1);
   }

   public ByteBuf writeFloat(float var1) {
      return this.field43618.writeFloat(var1);
   }

   public ByteBuf writeDouble(double var1) {
      return this.field43618.writeDouble(var1);
   }

   public ByteBuf writeBytes(ByteBuf var1) {
      return this.field43618.writeBytes(var1);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2) {
      return this.field43618.writeBytes(var1, var2);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2, int var3) {
      return this.field43618.writeBytes(var1, var2, var3);
   }

   public ByteBuf writeBytes(byte[] var1) {
      return this.field43618.writeBytes(var1);
   }

   public ByteBuf writeBytes(byte[] var1, int var2, int var3) {
      return this.field43618.writeBytes(var1, var2, var3);
   }

   public ByteBuf writeBytes(ByteBuffer var1) {
      return this.field43618.writeBytes(var1);
   }

   public int writeBytes(InputStream var1, int var2) throws IOException {
      return this.field43618.writeBytes(var1, var2);
   }

   public int writeBytes(ScatteringByteChannel var1, int var2) throws IOException {
      return this.field43618.writeBytes(var1, var2);
   }

   public int writeBytes(FileChannel var1, long var2, int var4) throws IOException {
      return this.field43618.writeBytes(var1, var2, var4);
   }

   public ByteBuf writeZero(int var1) {
      return this.field43618.writeZero(var1);
   }

   public int writeCharSequence(CharSequence var1, Charset var2) {
      return this.field43618.writeCharSequence(var1, var2);
   }

   public int indexOf(int var1, int var2, byte var3) {
      return this.field43618.indexOf(var1, var2, var3);
   }

   public int bytesBefore(byte var1) {
      return this.field43618.bytesBefore(var1);
   }

   public int bytesBefore(int var1, byte var2) {
      return this.field43618.bytesBefore(var1, var2);
   }

   public int bytesBefore(int var1, int var2, byte var3) {
      return this.field43618.bytesBefore(var1, var2, var3);
   }

   public int forEachByte(ByteProcessor var1) {
      return this.field43618.forEachByte(var1);
   }

   public int forEachByte(int var1, int var2, ByteProcessor var3) {
      return this.field43618.forEachByte(var1, var2, var3);
   }

   public int forEachByteDesc(ByteProcessor var1) {
      return this.field43618.forEachByteDesc(var1);
   }

   public int forEachByteDesc(int var1, int var2, ByteProcessor var3) {
      return this.field43618.forEachByteDesc(var1, var2, var3);
   }

   public ByteBuf copy() {
      return this.field43618.copy();
   }

   public ByteBuf copy(int var1, int var2) {
      return this.field43618.copy(var1, var2);
   }

   public ByteBuf slice() {
      return this.field43618.slice();
   }

   public ByteBuf retainedSlice() {
      return this.field43618.retainedSlice();
   }

   public ByteBuf slice(int var1, int var2) {
      return this.field43618.slice(var1, var2);
   }

   public ByteBuf retainedSlice(int var1, int var2) {
      return this.field43618.retainedSlice(var1, var2);
   }

   public ByteBuf duplicate() {
      return this.field43618.duplicate();
   }

   public ByteBuf retainedDuplicate() {
      return this.field43618.retainedDuplicate();
   }

   public int nioBufferCount() {
      return this.field43618.nioBufferCount();
   }

   public ByteBuffer nioBuffer() {
      return this.field43618.nioBuffer();
   }

   public ByteBuffer nioBuffer(int var1, int var2) {
      return this.field43618.nioBuffer(var1, var2);
   }

   public ByteBuffer internalNioBuffer(int var1, int var2) {
      return this.field43618.internalNioBuffer(var1, var2);
   }

   public ByteBuffer[] nioBuffers() {
      return this.field43618.nioBuffers();
   }

   public ByteBuffer[] nioBuffers(int var1, int var2) {
      return this.field43618.nioBuffers(var1, var2);
   }

   public boolean hasArray() {
      return this.field43618.hasArray();
   }

   public byte[] array() {
      return this.field43618.array();
   }

   public int arrayOffset() {
      return this.field43618.arrayOffset();
   }

   public boolean hasMemoryAddress() {
      return this.field43618.hasMemoryAddress();
   }

   public long memoryAddress() {
      return this.field43618.memoryAddress();
   }

   public String toString(Charset var1) {
      return this.field43618.toString(var1);
   }

   public String toString(int var1, int var2, Charset var3) {
      return this.field43618.toString(var1, var2, var3);
   }

   public int hashCode() {
      return this.field43618.hashCode();
   }

   public boolean equals(Object var1) {
      return this.field43618.equals(var1);
   }

   public int compareTo(ByteBuf var1) {
      return this.field43618.compareTo(var1);
   }

   public String toString() {
      return this.field43618.toString();
   }

   public ByteBuf retain(int var1) {
      return this.field43618.retain(var1);
   }

   public ByteBuf retain() {
      return this.field43618.retain();
   }

   public ByteBuf touch() {
      return this.field43618.touch();
   }

   public ByteBuf touch(Object var1) {
      return this.field43618.touch(var1);
   }

   public int refCnt() {
      return this.field43618.refCnt();
   }

   public boolean release() {
      return this.field43618.release();
   }

   public boolean release(int var1) {
      return this.field43618.release(var1);
   }

   public Map<String, Object> method35737() {
      return this.field43619;
   }

   public Object method35738(String var1) {
      return this.field43619 != null ? this.field43619.get(var1) : null;
   }

   public void method35739(Map<String, Object> var1) {
      this.field43619 = var1;
   }
}
