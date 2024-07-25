package remapped;

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
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;

public class class_8248 extends ByteBuf {
   private final ByteBuf field_42337;
   private Map<String, Object> field_42338;

   public class_8248(ByteBuf var1) {
      this.field_42337 = var1;
   }

   public class_8248(ByteBuf var1, Map<String, Object> var2) {
      this.field_42337 = var1;
      this.field_42338 = var2;
   }

   public static int method_37766(int var0) {
      for (int var3 = 1; var3 < 5; var3++) {
         if ((var0 & -1 << var3 * 7) == 0) {
            return var3;
         }
      }

      return 5;
   }

   public <T> T method_37771(Codec<T> var1) throws IOException {
      class_5734 var4 = this.method_37742();
      DataResult var5 = var1.parse(class_3504.field_17178, var4);
      if (!var5.error().isPresent()) {
         return (T)var5.result().get();
      } else {
         throw new IOException("Failed to decode: " + ((PartialResult)var5.error().get()).message() + " " + var4);
      }
   }

   public <T> void method_37786(Codec<T> var1, T var2) throws IOException {
      DataResult var5 = var1.encodeStart(class_3504.field_17178, var2);
      if (!var5.error().isPresent()) {
         this.method_37749((class_5734)var5.result().get());
      } else {
         throw new IOException("Failed to encode: " + ((PartialResult)var5.error().get()).message() + " " + var2);
      }
   }

   public class_8248 method_37767(byte[] var1) {
      this.method_37743(var1.length);
      this.writeBytes(var1);
      return this;
   }

   public byte[] method_37757() {
      return this.method_37758(this.readableBytes());
   }

   public byte[] method_37758(int var1) {
      int var4 = this.method_37778();
      if (var4 <= var1) {
         byte[] var5 = new byte[var4];
         this.readBytes(var5);
         return var5;
      } else {
         throw new DecoderException("ByteArray with size " + var4 + " is bigger than allowed " + var1);
      }
   }

   public class_8248 method_37777(int[] var1) {
      this.method_37743(var1.length);

      for (int var7 : var1) {
         this.method_37743(var7);
      }

      return this;
   }

   public int[] method_37762() {
      return this.method_37763(this.readableBytes());
   }

   public int[] method_37763(int var1) {
      int var4 = this.method_37778();
      if (var4 > var1) {
         throw new DecoderException("VarIntArray with size " + var4 + " is bigger than allowed " + var1);
      } else {
         int[] var5 = new int[var4];

         for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6] = this.method_37778();
         }

         return var5;
      }
   }

   public class_8248 method_37759(long[] var1) {
      this.method_37743(var1.length);

      for (long var7 : var1) {
         this.writeLong(var7);
      }

      return this;
   }

   public long[] method_37773(long[] var1) {
      return this.method_37774(var1, this.readableBytes() / 8);
   }

   public long[] method_37774(long[] var1, int var2) {
      int var5 = this.method_37778();
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

   public class_1331 method_37748() {
      return class_1331.method_6088(this.readLong());
   }

   public class_8248 method_37770(class_1331 var1) {
      this.writeLong(var1.method_6077());
      return this;
   }

   public class_6979 method_37769() {
      return class_6979.method_31920(this.readLong());
   }

   public ITextComponent method_37776() {
      return ITextComponent$class_40.func_240643_a_(this.method_37784(262144));
   }

   public class_8248 method_37779(ITextComponent var1) {
      return this.method_37761(ITextComponent$class_40.toJson(var1), 262144);
   }

   public <T extends Enum<T>> T method_37787(Class<T> var1) {
      return (T)var1.getEnumConstants()[this.method_37778()];
   }

   public class_8248 method_37750(Enum<?> var1) {
      return this.method_37743(var1.ordinal());
   }

   public int method_37778() {
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

   public long method_37781() {
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

   public class_8248 method_37746(UUID var1) {
      this.writeLong(var1.getMostSignificantBits());
      this.writeLong(var1.getLeastSignificantBits());
      return this;
   }

   public UUID method_37753() {
      return new UUID(this.readLong(), this.readLong());
   }

   public class_8248 method_37743(int var1) {
      this.writeByte(var1);
      return this;
   }

   public class_8248 method_37752(long var1) {
      while ((var1 & -128L) != 0L) {
         this.writeByte((int)(var1 & 127L) | 128);
         var1 >>>= 7;
      }

      this.writeByte((int)var1);
      return this;
   }

   public class_8248 method_37749(class_5734 var1) {
      if (var1 == null) {
         this.writeByte(0);
      } else {
         try {
            class_5957.method_27224(var1, new ByteBufOutputStream(this));
         } catch (IOException var5) {
            throw new EncoderException(var5);
         }
      }

      return this;
   }

   @Nullable
   public class_5734 method_37775() {
      return this.method_37756(new class_4694(2097152L));
   }

   @Nullable
   public class_5734 method_37742() {
      return this.method_37756(class_4694.field_22844);
   }

   @Nullable
   public class_5734 method_37756(class_4694 var1) {
      int var4 = this.readerIndex();
      byte var5 = this.readByte();
      if (var5 == 0) {
         return null;
      } else {
         this.readerIndex(var4);

         try {
            return class_5957.method_27222(new ByteBufInputStream(this), var1);
         } catch (IOException var7) {
            throw new EncoderException(var7);
         }
      }
   }

   public class_8248 method_37764(class_6098 var1) {
      return this.method_37765(var1, true);
   }

   public class_8248 method_37765(class_6098 var1, boolean var2) {
      if (!var1.method_28022()) {
         this.writeBoolean(true);
         class_2451 var5 = var1.method_27960();
         this.method_37743(class_2451.method_11244(var5));
         this.writeByte(var1.method_27997());
         class_5734 var6 = null;
         if (class_8835.method_40644(var5, var1) || var5.method_11251()) {
            if (var2 && class_7860.field_40139.method_3596()) {
               var6 = (class_5734)class_7860.method_35555(var1, class_7860.field_40139);
            } else {
               var6 = var1.method_27990();
            }
         }

         this.method_37749(var6);
      } else {
         this.writeBoolean(false);
      }

      return this;
   }

   public class_6098 method_37755() {
      if (this.readBoolean()) {
         int var3 = this.method_37778();
         byte var4 = this.readByte();
         class_6098 var5 = new class_6098(class_2451.method_11220(var3), var4);
         if (!class_7860.field_40052.method_3596()) {
            var5.method_27965(this.method_37775());
         } else {
            class_7860.method_35555(var5, class_7860.field_40052, this.method_37775());
         }

         return var5;
      } else {
         return class_6098.field_31203;
      }
   }

   public String method_37783() {
      return this.method_37784(32767);
   }

   public String method_37784(int var1) {
      int var4 = this.method_37778();
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

   public class_8248 method_37760(String var1) {
      return this.method_37761(var1, 32767);
   }

   public class_8248 method_37761(String var1, int var2) {
      byte[] var5 = var1.getBytes(StandardCharsets.UTF_8);
      if (var5.length <= var2) {
         this.method_37743(var5.length);
         this.writeBytes(var5);
         return this;
      } else {
         throw new EncoderException("String too big (was " + var5.length + " bytes encoded, max " + var2 + ")");
      }
   }

   public Identifier method_37768() {
      return new Identifier(this.method_37784(32767));
   }

   public class_8248 method_37780(Identifier var1) {
      this.method_37760(var1.toString());
      return this;
   }

   public Date method_37772() {
      return new Date(this.readLong());
   }

   public class_8248 method_37751(Date var1) {
      this.writeLong(var1.getTime());
      return this;
   }

   public class_9529 method_37782() {
      class_1331 var3 = this.method_37748();
      class_240 var4 = this.<class_240>method_37787(class_240.class);
      float var5 = this.readFloat();
      float var6 = this.readFloat();
      float var7 = this.readFloat();
      boolean var8 = this.readBoolean();
      return new class_9529(
         new class_1343((double)var3.method_12173() + (double)var5, (double)var3.method_12165() + (double)var6, (double)var3.method_12185() + (double)var7),
         var4,
         var3,
         var8
      );
   }

   public void method_37747(class_9529 var1) {
      class_1331 var4 = var1.method_43955();
      this.method_37770(var4);
      this.method_37750(var1.method_43956());
      class_1343 var5 = var1.method_33993();
      this.writeFloat((float)(var5.field_7336 - (double)var4.method_12173()));
      this.writeFloat((float)(var5.field_7333 - (double)var4.method_12165()));
      this.writeFloat((float)(var5.field_7334 - (double)var4.method_12185()));
      this.writeBoolean(var1.method_43953());
   }

   public int capacity() {
      return this.field_42337.capacity();
   }

   public ByteBuf capacity(int var1) {
      return this.field_42337.capacity(var1);
   }

   public int maxCapacity() {
      return this.field_42337.maxCapacity();
   }

   public ByteBufAllocator alloc() {
      return this.field_42337.alloc();
   }

   public ByteOrder order() {
      return this.field_42337.order();
   }

   public ByteBuf order(ByteOrder var1) {
      return this.field_42337.order(var1);
   }

   public ByteBuf unwrap() {
      return this.field_42337.unwrap();
   }

   public boolean isDirect() {
      return this.field_42337.isDirect();
   }

   public boolean isReadOnly() {
      return this.field_42337.isReadOnly();
   }

   public ByteBuf asReadOnly() {
      return this.field_42337.asReadOnly();
   }

   public int readerIndex() {
      return this.field_42337.readerIndex();
   }

   public ByteBuf readerIndex(int var1) {
      return this.field_42337.readerIndex(var1);
   }

   public int writerIndex() {
      return this.field_42337.writerIndex();
   }

   public ByteBuf writerIndex(int var1) {
      return this.field_42337.writerIndex(var1);
   }

   public ByteBuf setIndex(int var1, int var2) {
      return this.field_42337.setIndex(var1, var2);
   }

   public int readableBytes() {
      return this.field_42337.readableBytes();
   }

   public int writableBytes() {
      return this.field_42337.writableBytes();
   }

   public int maxWritableBytes() {
      return this.field_42337.maxWritableBytes();
   }

   public boolean isReadable() {
      return this.field_42337.isReadable();
   }

   public boolean isReadable(int var1) {
      return this.field_42337.isReadable(var1);
   }

   public boolean isWritable() {
      return this.field_42337.isWritable();
   }

   public boolean isWritable(int var1) {
      return this.field_42337.isWritable(var1);
   }

   public ByteBuf clear() {
      return this.field_42337.clear();
   }

   public ByteBuf markReaderIndex() {
      return this.field_42337.markReaderIndex();
   }

   public ByteBuf resetReaderIndex() {
      return this.field_42337.resetReaderIndex();
   }

   public ByteBuf markWriterIndex() {
      return this.field_42337.markWriterIndex();
   }

   public ByteBuf resetWriterIndex() {
      return this.field_42337.resetWriterIndex();
   }

   public ByteBuf discardReadBytes() {
      return this.field_42337.discardReadBytes();
   }

   public ByteBuf discardSomeReadBytes() {
      return this.field_42337.discardSomeReadBytes();
   }

   public ByteBuf ensureWritable(int var1) {
      return this.field_42337.ensureWritable(var1);
   }

   public int ensureWritable(int var1, boolean var2) {
      return this.field_42337.ensureWritable(var1, var2);
   }

   public boolean getBoolean(int var1) {
      return this.field_42337.getBoolean(var1);
   }

   public byte getByte(int var1) {
      return this.field_42337.getByte(var1);
   }

   public short getUnsignedByte(int var1) {
      return this.field_42337.getUnsignedByte(var1);
   }

   public short getShort(int var1) {
      return this.field_42337.getShort(var1);
   }

   public short getShortLE(int var1) {
      return this.field_42337.getShortLE(var1);
   }

   public int getUnsignedShort(int var1) {
      return this.field_42337.getUnsignedShort(var1);
   }

   public int getUnsignedShortLE(int var1) {
      return this.field_42337.getUnsignedShortLE(var1);
   }

   public int getMedium(int var1) {
      return this.field_42337.getMedium(var1);
   }

   public int getMediumLE(int var1) {
      return this.field_42337.getMediumLE(var1);
   }

   public int getUnsignedMedium(int var1) {
      return this.field_42337.getUnsignedMedium(var1);
   }

   public int getUnsignedMediumLE(int var1) {
      return this.field_42337.getUnsignedMediumLE(var1);
   }

   public int getInt(int var1) {
      return this.field_42337.getInt(var1);
   }

   public int getIntLE(int var1) {
      return this.field_42337.getIntLE(var1);
   }

   public long getUnsignedInt(int var1) {
      return this.field_42337.getUnsignedInt(var1);
   }

   public long getUnsignedIntLE(int var1) {
      return this.field_42337.getUnsignedIntLE(var1);
   }

   public long getLong(int var1) {
      return this.field_42337.getLong(var1);
   }

   public long getLongLE(int var1) {
      return this.field_42337.getLongLE(var1);
   }

   public char getChar(int var1) {
      return this.field_42337.getChar(var1);
   }

   public float getFloat(int var1) {
      return this.field_42337.getFloat(var1);
   }

   public double getDouble(int var1) {
      return this.field_42337.getDouble(var1);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2) {
      return this.field_42337.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3) {
      return this.field_42337.getBytes(var1, var2, var3);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.field_42337.getBytes(var1, var2, var3, var4);
   }

   public ByteBuf getBytes(int var1, byte[] var2) {
      return this.field_42337.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, byte[] var2, int var3, int var4) {
      return this.field_42337.getBytes(var1, var2, var3, var4);
   }

   public ByteBuf getBytes(int var1, ByteBuffer var2) {
      return this.field_42337.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, OutputStream var2, int var3) throws IOException {
      return this.field_42337.getBytes(var1, var2, var3);
   }

   public int getBytes(int var1, GatheringByteChannel var2, int var3) throws IOException {
      return this.field_42337.getBytes(var1, var2, var3);
   }

   public int getBytes(int var1, FileChannel var2, long var3, int var5) throws IOException {
      return this.field_42337.getBytes(var1, var2, var3, var5);
   }

   public CharSequence getCharSequence(int var1, int var2, Charset var3) {
      return this.field_42337.getCharSequence(var1, var2, var3);
   }

   public ByteBuf setBoolean(int var1, boolean var2) {
      return this.field_42337.setBoolean(var1, var2);
   }

   public ByteBuf setByte(int var1, int var2) {
      return this.field_42337.setByte(var1, var2);
   }

   public ByteBuf setShort(int var1, int var2) {
      return this.field_42337.setShort(var1, var2);
   }

   public ByteBuf setShortLE(int var1, int var2) {
      return this.field_42337.setShortLE(var1, var2);
   }

   public ByteBuf setMedium(int var1, int var2) {
      return this.field_42337.setMedium(var1, var2);
   }

   public ByteBuf setMediumLE(int var1, int var2) {
      return this.field_42337.setMediumLE(var1, var2);
   }

   public ByteBuf setInt(int var1, int var2) {
      return this.field_42337.setInt(var1, var2);
   }

   public ByteBuf setIntLE(int var1, int var2) {
      return this.field_42337.setIntLE(var1, var2);
   }

   public ByteBuf setLong(int var1, long var2) {
      return this.field_42337.setLong(var1, var2);
   }

   public ByteBuf setLongLE(int var1, long var2) {
      return this.field_42337.setLongLE(var1, var2);
   }

   public ByteBuf setChar(int var1, int var2) {
      return this.field_42337.setChar(var1, var2);
   }

   public ByteBuf setFloat(int var1, float var2) {
      return this.field_42337.setFloat(var1, var2);
   }

   public ByteBuf setDouble(int var1, double var2) {
      return this.field_42337.setDouble(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2) {
      return this.field_42337.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3) {
      return this.field_42337.setBytes(var1, var2, var3);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.field_42337.setBytes(var1, var2, var3, var4);
   }

   public ByteBuf setBytes(int var1, byte[] var2) {
      return this.field_42337.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, byte[] var2, int var3, int var4) {
      return this.field_42337.setBytes(var1, var2, var3, var4);
   }

   public ByteBuf setBytes(int var1, ByteBuffer var2) {
      return this.field_42337.setBytes(var1, var2);
   }

   public int setBytes(int var1, InputStream var2, int var3) throws IOException {
      return this.field_42337.setBytes(var1, var2, var3);
   }

   public int setBytes(int var1, ScatteringByteChannel var2, int var3) throws IOException {
      return this.field_42337.setBytes(var1, var2, var3);
   }

   public int setBytes(int var1, FileChannel var2, long var3, int var5) throws IOException {
      return this.field_42337.setBytes(var1, var2, var3, var5);
   }

   public ByteBuf setZero(int var1, int var2) {
      return this.field_42337.setZero(var1, var2);
   }

   public int setCharSequence(int var1, CharSequence var2, Charset var3) {
      return this.field_42337.setCharSequence(var1, var2, var3);
   }

   public boolean readBoolean() {
      return this.field_42337.readBoolean();
   }

   public byte readByte() {
      return this.field_42337.readByte();
   }

   public short readUnsignedByte() {
      return this.field_42337.readUnsignedByte();
   }

   public short readShort() {
      return this.field_42337.readShort();
   }

   public short readShortLE() {
      return this.field_42337.readShortLE();
   }

   public int readUnsignedShort() {
      return this.field_42337.readUnsignedShort();
   }

   public int readUnsignedShortLE() {
      return this.field_42337.readUnsignedShortLE();
   }

   public int readMedium() {
      return this.field_42337.readMedium();
   }

   public int readMediumLE() {
      return this.field_42337.readMediumLE();
   }

   public int readUnsignedMedium() {
      return this.field_42337.readUnsignedMedium();
   }

   public int readUnsignedMediumLE() {
      return this.field_42337.readUnsignedMediumLE();
   }

   public int readInt() {
      return this.field_42337.readInt();
   }

   public int readIntLE() {
      return this.field_42337.readIntLE();
   }

   public long readUnsignedInt() {
      return this.field_42337.readUnsignedInt();
   }

   public long readUnsignedIntLE() {
      return this.field_42337.readUnsignedIntLE();
   }

   public long readLong() {
      return this.field_42337.readLong();
   }

   public long readLongLE() {
      return this.field_42337.readLongLE();
   }

   public char readChar() {
      return this.field_42337.readChar();
   }

   public float readFloat() {
      return this.field_42337.readFloat();
   }

   public double readDouble() {
      return this.field_42337.readDouble();
   }

   public ByteBuf readBytes(int var1) {
      return this.field_42337.readBytes(var1);
   }

   public ByteBuf readSlice(int var1) {
      return this.field_42337.readSlice(var1);
   }

   public ByteBuf readRetainedSlice(int var1) {
      return this.field_42337.readRetainedSlice(var1);
   }

   public ByteBuf readBytes(ByteBuf var1) {
      return this.field_42337.readBytes(var1);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2) {
      return this.field_42337.readBytes(var1, var2);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2, int var3) {
      return this.field_42337.readBytes(var1, var2, var3);
   }

   public ByteBuf readBytes(byte[] var1) {
      return this.field_42337.readBytes(var1);
   }

   public ByteBuf readBytes(byte[] var1, int var2, int var3) {
      return this.field_42337.readBytes(var1, var2, var3);
   }

   public ByteBuf readBytes(ByteBuffer var1) {
      return this.field_42337.readBytes(var1);
   }

   public ByteBuf readBytes(OutputStream var1, int var2) throws IOException {
      return this.field_42337.readBytes(var1, var2);
   }

   public int readBytes(GatheringByteChannel var1, int var2) throws IOException {
      return this.field_42337.readBytes(var1, var2);
   }

   public CharSequence readCharSequence(int var1, Charset var2) {
      return this.field_42337.readCharSequence(var1, var2);
   }

   public int readBytes(FileChannel var1, long var2, int var4) throws IOException {
      return this.field_42337.readBytes(var1, var2, var4);
   }

   public ByteBuf skipBytes(int var1) {
      return this.field_42337.skipBytes(var1);
   }

   public ByteBuf writeBoolean(boolean var1) {
      return this.field_42337.writeBoolean(var1);
   }

   public ByteBuf writeByte(int var1) {
      return this.field_42337.writeByte(var1);
   }

   public ByteBuf writeShort(int var1) {
      return this.field_42337.writeShort(var1);
   }

   public ByteBuf writeShortLE(int var1) {
      return this.field_42337.writeShortLE(var1);
   }

   public ByteBuf writeMedium(int var1) {
      return this.field_42337.writeMedium(var1);
   }

   public ByteBuf writeMediumLE(int var1) {
      return this.field_42337.writeMediumLE(var1);
   }

   public ByteBuf writeInt(int var1) {
      return this.field_42337.writeInt(var1);
   }

   public ByteBuf writeIntLE(int var1) {
      return this.field_42337.writeIntLE(var1);
   }

   public ByteBuf writeLong(long var1) {
      return this.field_42337.writeLong(var1);
   }

   public ByteBuf writeLongLE(long var1) {
      return this.field_42337.writeLongLE(var1);
   }

   public ByteBuf writeChar(int var1) {
      return this.field_42337.writeChar(var1);
   }

   public ByteBuf writeFloat(float var1) {
      return this.field_42337.writeFloat(var1);
   }

   public ByteBuf writeDouble(double var1) {
      return this.field_42337.writeDouble(var1);
   }

   public ByteBuf writeBytes(ByteBuf var1) {
      return this.field_42337.writeBytes(var1);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2) {
      return this.field_42337.writeBytes(var1, var2);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2, int var3) {
      return this.field_42337.writeBytes(var1, var2, var3);
   }

   public ByteBuf writeBytes(byte[] var1) {
      return this.field_42337.writeBytes(var1);
   }

   public ByteBuf writeBytes(byte[] var1, int var2, int var3) {
      return this.field_42337.writeBytes(var1, var2, var3);
   }

   public ByteBuf writeBytes(ByteBuffer var1) {
      return this.field_42337.writeBytes(var1);
   }

   public int writeBytes(InputStream var1, int var2) throws IOException {
      return this.field_42337.writeBytes(var1, var2);
   }

   public int writeBytes(ScatteringByteChannel var1, int var2) throws IOException {
      return this.field_42337.writeBytes(var1, var2);
   }

   public int writeBytes(FileChannel var1, long var2, int var4) throws IOException {
      return this.field_42337.writeBytes(var1, var2, var4);
   }

   public ByteBuf writeZero(int var1) {
      return this.field_42337.writeZero(var1);
   }

   public int writeCharSequence(CharSequence var1, Charset var2) {
      return this.field_42337.writeCharSequence(var1, var2);
   }

   public int indexOf(int var1, int var2, byte var3) {
      return this.field_42337.indexOf(var1, var2, var3);
   }

   public int bytesBefore(byte var1) {
      return this.field_42337.bytesBefore(var1);
   }

   public int bytesBefore(int var1, byte var2) {
      return this.field_42337.bytesBefore(var1, var2);
   }

   public int bytesBefore(int var1, int var2, byte var3) {
      return this.field_42337.bytesBefore(var1, var2, var3);
   }

   public int forEachByte(ByteProcessor var1) {
      return this.field_42337.forEachByte(var1);
   }

   public int forEachByte(int var1, int var2, ByteProcessor var3) {
      return this.field_42337.forEachByte(var1, var2, var3);
   }

   public int forEachByteDesc(ByteProcessor var1) {
      return this.field_42337.forEachByteDesc(var1);
   }

   public int forEachByteDesc(int var1, int var2, ByteProcessor var3) {
      return this.field_42337.forEachByteDesc(var1, var2, var3);
   }

   public ByteBuf copy() {
      return this.field_42337.copy();
   }

   public ByteBuf copy(int var1, int var2) {
      return this.field_42337.copy(var1, var2);
   }

   public ByteBuf slice() {
      return this.field_42337.slice();
   }

   public ByteBuf retainedSlice() {
      return this.field_42337.retainedSlice();
   }

   public ByteBuf slice(int var1, int var2) {
      return this.field_42337.slice(var1, var2);
   }

   public ByteBuf retainedSlice(int var1, int var2) {
      return this.field_42337.retainedSlice(var1, var2);
   }

   public ByteBuf duplicate() {
      return this.field_42337.duplicate();
   }

   public ByteBuf retainedDuplicate() {
      return this.field_42337.retainedDuplicate();
   }

   public int nioBufferCount() {
      return this.field_42337.nioBufferCount();
   }

   public ByteBuffer nioBuffer() {
      return this.field_42337.nioBuffer();
   }

   public ByteBuffer nioBuffer(int var1, int var2) {
      return this.field_42337.nioBuffer(var1, var2);
   }

   public ByteBuffer internalNioBuffer(int var1, int var2) {
      return this.field_42337.internalNioBuffer(var1, var2);
   }

   public ByteBuffer[] nioBuffers() {
      return this.field_42337.nioBuffers();
   }

   public ByteBuffer[] nioBuffers(int var1, int var2) {
      return this.field_42337.nioBuffers(var1, var2);
   }

   public boolean hasArray() {
      return this.field_42337.hasArray();
   }

   public byte[] array() {
      return this.field_42337.array();
   }

   public int arrayOffset() {
      return this.field_42337.arrayOffset();
   }

   public boolean hasMemoryAddress() {
      return this.field_42337.hasMemoryAddress();
   }

   public long memoryAddress() {
      return this.field_42337.memoryAddress();
   }

   public String toString(Charset var1) {
      return this.field_42337.toString(var1);
   }

   public String toString(int var1, int var2, Charset var3) {
      return this.field_42337.toString(var1, var2, var3);
   }

   public int hashCode() {
      return this.field_42337.hashCode();
   }

   public boolean equals(Object var1) {
      return this.field_42337.equals(var1);
   }

   public int compareTo(ByteBuf var1) {
      return this.field_42337.compareTo(var1);
   }

   public String toString() {
      return this.field_42337.toString();
   }

   public ByteBuf retain(int var1) {
      return this.field_42337.retain(var1);
   }

   public ByteBuf retain() {
      return this.field_42337.retain();
   }

   public ByteBuf touch() {
      return this.field_42337.touch();
   }

   public ByteBuf touch(Object var1) {
      return this.field_42337.touch(var1);
   }

   public int refCnt() {
      return this.field_42337.refCnt();
   }

   public boolean release() {
      return this.field_42337.release();
   }

   public boolean release(int var1) {
      return this.field_42337.release(var1);
   }

   public Map<String, Object> method_37744() {
      return this.field_42338;
   }

   public Object method_37745(String var1) {
      return this.field_42338 != null ? this.field_42338.get(var1) : null;
   }

   public void method_37785(Map<String, Object> var1) {
      this.field_42338 = var1;
   }
}
