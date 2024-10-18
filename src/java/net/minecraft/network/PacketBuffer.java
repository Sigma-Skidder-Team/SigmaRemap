package net.minecraft.network;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
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

import mapped.*;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.NBTSizeTracker;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.SectionPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.optifine.reflect.ReflectorForge;

public class PacketBuffer extends ByteBuf {
   private final ByteBuf buf;
   private Map<String, Object> customData;

   public PacketBuffer(ByteBuf wrapped)
   {
      this.buf = wrapped;
   }

   public PacketBuffer(ByteBuf p_i242105_1_, Map<String, Object> p_i242105_2_)
   {
      this.buf = p_i242105_1_;
      this.customData = p_i242105_2_;
   }

   /**
    * Calculates the number of bytes required to fit the supplied int (0-5) if it were to be read/written using
    * readVarIntFromBuffer or writeVarIntToBuffer
    */
   public static int getVarIntSize(int input)
   {
      for (int i = 1; i < 5; ++i)
      {
         if ((input & -1 << i * 7) == 0)
         {
            return i;
         }
      }

      return 5;
   }

   public <T> T func_240628_a_(Codec<T> p_240628_1_) throws IOException {
      CompoundNBT compoundnbt = this.func_244273_m();
      DataResult<T> dataresult = p_240628_1_.parse(NBTDynamicOps.INSTANCE, compoundnbt);

      if (dataresult.error().isPresent())
      {
         throw new IOException("Failed to decode: " + dataresult.error().get().message() + " " + compoundnbt);
      }
      else
      {
         return dataresult.result().get();
      }
   }

   public <T> void func_240629_a_(Codec<T> p_240629_1_, T p_240629_2_) throws IOException {
      DataResult<INBT> dataresult = p_240629_1_.encodeStart(NBTDynamicOps.INSTANCE, p_240629_2_);

      if (dataresult.error().isPresent())
      {
         throw new IOException("Failed to encode: " + dataresult.error().get().message() + " " + p_240629_2_);
      }
      else
      {
         this.writeCompoundTag((CompoundNBT)dataresult.result().get());
      }
   }

   public PacketBuffer writeByteArray(byte[] array)
   {
      this.writeVarInt(array.length);
      this.writeBytes(array);
      return this;
   }

   public byte[] readByteArray() {
      return this.readByteArray(this.readableBytes());
   }

   public byte[] readByteArray(int maxLength) {
      int i = this.readVarInt();

      if (i > maxLength)
      {
         throw new DecoderException("ByteArray with size " + i + " is bigger than allowed " + maxLength);
      }
      else
      {
         byte[] abyte = new byte[i];
         this.readBytes(abyte);
         return abyte;
      }
   }

   public PacketBuffer writeVarIntArray(int[] array) {
      this.writeVarInt(array.length);

      for (int i : array)
      {
         this.writeVarInt(i);
      }

      return this;
   }

   public int[] readVarIntArray() {
      return this.readVarIntArray(this.readableBytes());
   }

   public int[] readVarIntArray(int maxLength) {
      int i = this.readVarInt();

      if (i > maxLength)
      {
         throw new DecoderException("VarIntArray with size " + i + " is bigger than allowed " + maxLength);
      }
      else
      {
         int[] aint = new int[i];

         for (int j = 0; j < aint.length; ++j)
         {
            aint[j] = this.readVarInt();
         }

         return aint;
      }
   }

   public PacketBuffer writeLongArray(long[] array) {
      this.writeVarInt(array.length);

      for (long i : array)
      {
         this.writeLong(i);
      }

      return this;
   }

   /**
    * Reads a length-prefixed array of longs from the buffer.
    */
   public long[] readLongArray(@Nullable long[] array)
   {
      return this.readLongArray(array, this.readableBytes() / 8);
   }

   public long[] readLongArray(@Nullable long[] array, int maxLength) {
      int i = this.readVarInt();

      if (array == null || array.length != i)
      {
         if (i > maxLength)
         {
            throw new DecoderException("LongArray with size " + i + " is bigger than allowed " + maxLength);
         }

         array = new long[i];
      }

      for (int j = 0; j < array.length; ++j)
      {
         array[j] = this.readLong();
      }

      return array;
   }

   public BlockPos readBlockPos() {
      return BlockPos.fromLong(this.readLong());
   }

   public PacketBuffer writeBlockPos(BlockPos pos)
   {
      this.writeLong(pos.toLong());
      return this;
   }

   public SectionPos readSectionPos() {
      return SectionPos.from(this.readLong());
   }

   public ITextComponent readTextComponent() {
      return ITextComponent$Serializer.getComponentFromJson(this.readString(262144));
   }

   public PacketBuffer writeTextComponent(ITextComponent component) {
      return this.writeString(ITextComponent$Serializer.toJson(component), 262144);
   }

   public <T extends Enum<T>> T readEnumValue(Class<T> enumClass)
   {
      return (enumClass.getEnumConstants())[this.readVarInt()];
   }

   public PacketBuffer writeEnumValue(Enum<?> value)
   {
      return this.writeVarInt(value.ordinal());
   }

   /**
    * Reads a compressed int from the buffer. To do so it maximally reads 5 byte-sized chunks whose most significant
    * bit dictates whether another byte should be read.
    */
   public int readVarInt()
   {
      int i = 0;
      int j = 0;
      byte b0;

      do
      {
         b0 = this.readByte();
         i |= (b0 & 127) << j++ * 7;

         if (j > 5)
         {
            throw new RuntimeException("VarInt too big");
         }
      }
      while ((b0 & 128) == 128);

      return i;
   }

   public long readVarLong()
   {
      long i = 0L;
      int j = 0;
      byte b0;

      do
      {
         b0 = this.readByte();
         i |= (long)(b0 & 127) << j++ * 7;

         if (j > 10)
         {
            throw new RuntimeException("VarLong too big");
         }
      }
      while ((b0 & 128) == 128);

      return i;
   }

   public PacketBuffer writeUniqueId(UUID uuid)
   {
      this.writeLong(uuid.getMostSignificantBits());
      this.writeLong(uuid.getLeastSignificantBits());
      return this;
   }

   public UUID readUniqueId()
   {
      return new UUID(this.readLong(), this.readLong());
   }

   /**
    * Writes a compressed int to the buffer. The smallest number of bytes to fit the passed int will be written. Of
    * each such byte only 7 bits will be used to describe the actual value since its most significant bit dictates
    * whether the next byte is part of that same int. Micro-optimization for int values that are expected to have
    * values below 128.
    */
   public PacketBuffer writeVarInt(int input)
   {
      while ((input & -128) != 0)
      {
         this.writeByte(input & 127 | 128);
         input >>>= 7;
      }

      this.writeByte(input);
      return this;
   }

   public PacketBuffer writeVarLong(long value)
   {
      while ((value & -128L) != 0L)
      {
         this.writeByte((int)(value & 127L) | 128);
         value >>>= 7;
      }

      this.writeByte((int)value);
      return this;
   }

   /**
    * Writes a compressed NBTTagCompound to this buffer
    */
   public PacketBuffer writeCompoundTag(@Nullable CompoundNBT nbt)
   {
      if (nbt == null)
      {
         this.writeByte(0);
      }
      else
      {
         try
         {
            CompressedStreamTools.write(nbt, new ByteBufOutputStream(this));
         }
         catch (IOException ioexception)
         {
            throw new EncoderException(ioexception);
         }
      }

      return this;
   }

   @Nullable

   public CompoundNBT readCompoundTag()
   {
      return this.func_244272_a(new NBTSizeTracker(2097152L));
   }

   @Nullable
   public CompoundNBT func_244273_m()
   {
      return this.func_244272_a(NBTSizeTracker.INFINITE);
   }

   @Nullable
   public CompoundNBT func_244272_a(NBTSizeTracker p_244272_1_)
   {
      int i = this.readerIndex();
      byte b0 = this.readByte();

      if (b0 == 0)
      {
         return null;
      }
      else
      {
         this.readerIndex(i);

         try
         {
            return CompressedStreamTools.read(new ByteBufInputStream(this), p_244272_1_);
         }
         catch (IOException ioexception)
         {
            throw new EncoderException(ioexception);
         }
      }
   }

   /**
    * Writes the ItemStack's ID (short), then size (byte), then damage. (short)
    */
   public PacketBuffer writeItemStack(ItemStack stack)
   {
      return this.writeItemStack(stack, true);
   }

   public PacketBuffer writeItemStack(ItemStack p_writeItemStack_1_, boolean p_writeItemStack_2_)
   {
      if (p_writeItemStack_1_.isEmpty())
      {
         this.writeBoolean(false);
      }
      else
      {
         this.writeBoolean(true);
         Item item = p_writeItemStack_1_.getItem();
         this.writeVarInt(Item.getIdFromItem(item));
         this.writeByte(p_writeItemStack_1_.getCount());
         CompoundNBT compoundnbt = null;

         if (ReflectorForge.isDamageable(item, p_writeItemStack_1_) || item.shouldSyncTag())
         {
            if (p_writeItemStack_2_ && Reflector.IForgeItemStack_getShareTag.exists())
            {
               compoundnbt = (CompoundNBT)Reflector.call(p_writeItemStack_1_, Reflector.IForgeItemStack_getShareTag);
            }
            else
            {
               compoundnbt = p_writeItemStack_1_.getTag();
            }
         }

         this.writeCompoundTag(compoundnbt);
      }

      return this;
   }

   /**
    * Reads an ItemStack from this buffer
    */
   public ItemStack readItemStack()
   {
      if (!this.readBoolean())
      {
         return ItemStack.EMPTY;
      }
      else
      {
         int i = this.readVarInt();
         int j = this.readByte();
         ItemStack itemstack = new ItemStack(Item.getItemById(i), j);

         if (Reflector.IForgeItemStack_readShareTag.exists())
         {
            Reflector.call(itemstack, Reflector.IForgeItemStack_readShareTag, this.readCompoundTag());
         }
         else
         {
            itemstack.setTag(this.readCompoundTag());
         }

         return itemstack;
      }
   }

   public String readString() {
      return this.readString(32767);
   }

   /**
    * Reads a string from this buffer. Expected parameter is maximum allowed string length. Will throw IOException if
    * string length exceeds this value!
    */
   public String readString(int maxLength)
   {
      int i = this.readVarInt();

      if (i > maxLength * 4)
      {
         throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + i + " > " + maxLength * 4 + ")");
      }
      else if (i < 0)
      {
         throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
      }
      else
      {
         String s = this.toString(this.readerIndex(), i, StandardCharsets.UTF_8);
         this.readerIndex(this.readerIndex() + i);

         if (s.length() > maxLength)
         {
            throw new DecoderException("The received string length is longer than maximum allowed (" + i + " > " + maxLength + ")");
         }
         else
         {
            return s;
         }
      }
   }

   public PacketBuffer writeString(String string)
   {
      return this.writeString(string, 32767);
   }

   public PacketBuffer writeString(String string, int maxLength)
   {
      byte[] abyte = string.getBytes(StandardCharsets.UTF_8);

      if (abyte.length > maxLength)
      {
         throw new EncoderException("String too big (was " + abyte.length + " bytes encoded, max " + maxLength + ")");
      }
      else
      {
         this.writeVarInt(abyte.length);
         this.writeBytes(abyte);
         return this;
      }
   }

   public ResourceLocation readResourceLocation() {
      return new ResourceLocation(this.readString(32767));
   }

   public PacketBuffer writeResourceLocation(ResourceLocation resourceLocationIn)
   {
      this.writeString(resourceLocationIn.toString());
      return this;
   }

   public Date readTime()
   {
      return new Date(this.readLong());
   }

   public PacketBuffer writeTime(Date time)
   {
      this.writeLong(time.getTime());
      return this;
   }

   public BlockRayTraceResult readBlockRay()
   {
      BlockPos blockpos = this.readBlockPos();
      Direction direction = this.readEnumValue(Direction.class);
      float f = this.readFloat();
      float f1 = this.readFloat();
      float f2 = this.readFloat();
      boolean flag = this.readBoolean();
      return new BlockRayTraceResult(new Vector3d((double)blockpos.getX() + (double)f, (double)blockpos.getY() + (double)f1, (double)blockpos.getZ() + (double)f2), direction, blockpos, flag);
   }

   public void writeBlockRay(BlockRayTraceResult resultIn)
   {
      BlockPos blockpos = resultIn.getPos();
      this.writeBlockPos(blockpos);
      this.writeEnumValue(resultIn.getFace());
      Vector3d vector3d = resultIn.getHitVec();
      this.writeFloat((float)(vector3d.x - (double)blockpos.getX()));
      this.writeFloat((float)(vector3d.y - (double)blockpos.getY()));
      this.writeFloat((float)(vector3d.z - (double)blockpos.getZ()));
      this.writeBoolean(resultIn.isInside());
   }

   public int capacity()
   {
      return this.buf.capacity();
   }

   public ByteBuf capacity(int p_capacity_1_)
   {
      return this.buf.capacity(p_capacity_1_);
   }

   public int maxCapacity()
   {
      return this.buf.maxCapacity();
   }

   public ByteBufAllocator alloc()
   {
      return this.buf.alloc();
   }

   public ByteOrder order()
   {
      return this.buf.order();
   }

   public ByteBuf order(ByteOrder p_order_1_)
   {
      return this.buf.order(p_order_1_);
   }

   public ByteBuf unwrap()
   {
      return this.buf.unwrap();
   }

   public boolean isDirect()
   {
      return this.buf.isDirect();
   }

   public boolean isReadOnly()
   {
      return this.buf.isReadOnly();
   }

   public ByteBuf asReadOnly()
   {
      return this.buf.asReadOnly();
   }

   public int readerIndex()
   {
      return this.buf.readerIndex();
   }

   public ByteBuf readerIndex(int p_readerIndex_1_)
   {
      return this.buf.readerIndex(p_readerIndex_1_);
   }

   public int writerIndex()
   {
      return this.buf.writerIndex();
   }

   public ByteBuf writerIndex(int var1) {
      return this.buf.writerIndex(var1);
   }

   public ByteBuf setIndex(int var1, int var2) {
      return this.buf.setIndex(var1, var2);
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

   public boolean isReadable(int var1) {
      return this.buf.isReadable(var1);
   }

   public boolean isWritable() {
      return this.buf.isWritable();
   }

   public boolean isWritable(int var1) {
      return this.buf.isWritable(var1);
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

   public ByteBuf ensureWritable(int var1) {
      return this.buf.ensureWritable(var1);
   }

   public int ensureWritable(int var1, boolean var2) {
      return this.buf.ensureWritable(var1, var2);
   }

   public boolean getBoolean(int var1) {
      return this.buf.getBoolean(var1);
   }

   public byte getByte(int var1) {
      return this.buf.getByte(var1);
   }

   public short getUnsignedByte(int var1) {
      return this.buf.getUnsignedByte(var1);
   }

   public short getShort(int var1) {
      return this.buf.getShort(var1);
   }

   public short getShortLE(int var1) {
      return this.buf.getShortLE(var1);
   }

   public int getUnsignedShort(int var1) {
      return this.buf.getUnsignedShort(var1);
   }

   public int getUnsignedShortLE(int var1) {
      return this.buf.getUnsignedShortLE(var1);
   }

   public int getMedium(int var1) {
      return this.buf.getMedium(var1);
   }

   public int getMediumLE(int var1) {
      return this.buf.getMediumLE(var1);
   }

   public int getUnsignedMedium(int var1) {
      return this.buf.getUnsignedMedium(var1);
   }

   public int getUnsignedMediumLE(int var1) {
      return this.buf.getUnsignedMediumLE(var1);
   }

   public int getInt(int var1) {
      return this.buf.getInt(var1);
   }

   public int getIntLE(int var1) {
      return this.buf.getIntLE(var1);
   }

   public long getUnsignedInt(int var1) {
      return this.buf.getUnsignedInt(var1);
   }

   public long getUnsignedIntLE(int var1) {
      return this.buf.getUnsignedIntLE(var1);
   }

   public long getLong(int var1) {
      return this.buf.getLong(var1);
   }

   public long getLongLE(int var1) {
      return this.buf.getLongLE(var1);
   }

   public char getChar(int var1) {
      return this.buf.getChar(var1);
   }

   public float getFloat(int var1) {
      return this.buf.getFloat(var1);
   }

   public double getDouble(int var1) {
      return this.buf.getDouble(var1);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2) {
      return this.buf.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3) {
      return this.buf.getBytes(var1, var2, var3);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.buf.getBytes(var1, var2, var3, var4);
   }

   public ByteBuf getBytes(int var1, byte[] var2) {
      return this.buf.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, byte[] var2, int var3, int var4) {
      return this.buf.getBytes(var1, var2, var3, var4);
   }

   public ByteBuf getBytes(int var1, ByteBuffer var2) {
      return this.buf.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, OutputStream var2, int var3) throws IOException {
      return this.buf.getBytes(var1, var2, var3);
   }

   public int getBytes(int var1, GatheringByteChannel var2, int var3) throws IOException {
      return this.buf.getBytes(var1, var2, var3);
   }

   public int getBytes(int var1, FileChannel var2, long var3, int var5) throws IOException {
      return this.buf.getBytes(var1, var2, var3, var5);
   }

   public CharSequence getCharSequence(int var1, int var2, Charset var3) {
      return this.buf.getCharSequence(var1, var2, var3);
   }

   public ByteBuf setBoolean(int var1, boolean var2) {
      return this.buf.setBoolean(var1, var2);
   }

   public ByteBuf setByte(int var1, int var2) {
      return this.buf.setByte(var1, var2);
   }

   public ByteBuf setShort(int var1, int var2) {
      return this.buf.setShort(var1, var2);
   }

   public ByteBuf setShortLE(int var1, int var2) {
      return this.buf.setShortLE(var1, var2);
   }

   public ByteBuf setMedium(int var1, int var2) {
      return this.buf.setMedium(var1, var2);
   }

   public ByteBuf setMediumLE(int var1, int var2) {
      return this.buf.setMediumLE(var1, var2);
   }

   public ByteBuf setInt(int var1, int var2) {
      return this.buf.setInt(var1, var2);
   }

   public ByteBuf setIntLE(int var1, int var2) {
      return this.buf.setIntLE(var1, var2);
   }

   public ByteBuf setLong(int var1, long var2) {
      return this.buf.setLong(var1, var2);
   }

   public ByteBuf setLongLE(int var1, long var2) {
      return this.buf.setLongLE(var1, var2);
   }

   public ByteBuf setChar(int var1, int var2) {
      return this.buf.setChar(var1, var2);
   }

   public ByteBuf setFloat(int var1, float var2) {
      return this.buf.setFloat(var1, var2);
   }

   public ByteBuf setDouble(int var1, double var2) {
      return this.buf.setDouble(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2) {
      return this.buf.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3) {
      return this.buf.setBytes(var1, var2, var3);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.buf.setBytes(var1, var2, var3, var4);
   }

   public ByteBuf setBytes(int var1, byte[] var2) {
      return this.buf.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, byte[] var2, int var3, int var4) {
      return this.buf.setBytes(var1, var2, var3, var4);
   }

   public ByteBuf setBytes(int var1, ByteBuffer var2) {
      return this.buf.setBytes(var1, var2);
   }

   public int setBytes(int var1, InputStream var2, int var3) throws IOException {
      return this.buf.setBytes(var1, var2, var3);
   }

   public int setBytes(int var1, ScatteringByteChannel var2, int var3) throws IOException {
      return this.buf.setBytes(var1, var2, var3);
   }

   public int setBytes(int var1, FileChannel var2, long var3, int var5) throws IOException {
      return this.buf.setBytes(var1, var2, var3, var5);
   }

   public ByteBuf setZero(int var1, int var2) {
      return this.buf.setZero(var1, var2);
   }

   public int setCharSequence(int var1, CharSequence var2, Charset var3) {
      return this.buf.setCharSequence(var1, var2, var3);
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

   public ByteBuf readBytes(int var1) {
      return this.buf.readBytes(var1);
   }

   public ByteBuf readSlice(int var1) {
      return this.buf.readSlice(var1);
   }

   public ByteBuf readRetainedSlice(int var1) {
      return this.buf.readRetainedSlice(var1);
   }

   public ByteBuf readBytes(ByteBuf var1) {
      return this.buf.readBytes(var1);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2) {
      return this.buf.readBytes(var1, var2);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2, int var3) {
      return this.buf.readBytes(var1, var2, var3);
   }

   public ByteBuf readBytes(byte[] var1) {
      return this.buf.readBytes(var1);
   }

   public ByteBuf readBytes(byte[] var1, int var2, int var3) {
      return this.buf.readBytes(var1, var2, var3);
   }

   public ByteBuf readBytes(ByteBuffer var1) {
      return this.buf.readBytes(var1);
   }

   public ByteBuf readBytes(OutputStream var1, int var2) throws IOException {
      return this.buf.readBytes(var1, var2);
   }

   public int readBytes(GatheringByteChannel var1, int var2) throws IOException {
      return this.buf.readBytes(var1, var2);
   }

   public CharSequence readCharSequence(int var1, Charset var2) {
      return this.buf.readCharSequence(var1, var2);
   }

   public int readBytes(FileChannel var1, long var2, int var4) throws IOException {
      return this.buf.readBytes(var1, var2, var4);
   }

   public ByteBuf skipBytes(int var1) {
      return this.buf.skipBytes(var1);
   }

   public ByteBuf writeBoolean(boolean var1) {
      return this.buf.writeBoolean(var1);
   }

   public ByteBuf writeByte(int var1) {
      return this.buf.writeByte(var1);
   }

   public ByteBuf writeShort(int var1) {
      return this.buf.writeShort(var1);
   }

   public ByteBuf writeShortLE(int var1) {
      return this.buf.writeShortLE(var1);
   }

   public ByteBuf writeMedium(int var1) {
      return this.buf.writeMedium(var1);
   }

   public ByteBuf writeMediumLE(int var1) {
      return this.buf.writeMediumLE(var1);
   }

   public ByteBuf writeInt(int var1) {
      return this.buf.writeInt(var1);
   }

   public ByteBuf writeIntLE(int var1) {
      return this.buf.writeIntLE(var1);
   }

   public ByteBuf writeLong(long var1) {
      return this.buf.writeLong(var1);
   }

   public ByteBuf writeLongLE(long var1) {
      return this.buf.writeLongLE(var1);
   }

   public ByteBuf writeChar(int var1) {
      return this.buf.writeChar(var1);
   }

   public ByteBuf writeFloat(float var1) {
      return this.buf.writeFloat(var1);
   }

   public ByteBuf writeDouble(double var1) {
      return this.buf.writeDouble(var1);
   }

   public ByteBuf writeBytes(ByteBuf var1) {
      return this.buf.writeBytes(var1);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2) {
      return this.buf.writeBytes(var1, var2);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2, int var3) {
      return this.buf.writeBytes(var1, var2, var3);
   }

   public ByteBuf writeBytes(byte[] var1) {
      return this.buf.writeBytes(var1);
   }

   public ByteBuf writeBytes(byte[] var1, int var2, int var3) {
      return this.buf.writeBytes(var1, var2, var3);
   }

   public ByteBuf writeBytes(ByteBuffer var1) {
      return this.buf.writeBytes(var1);
   }

   public int writeBytes(InputStream var1, int var2) throws IOException {
      return this.buf.writeBytes(var1, var2);
   }

   public int writeBytes(ScatteringByteChannel var1, int var2) throws IOException {
      return this.buf.writeBytes(var1, var2);
   }

   public int writeBytes(FileChannel var1, long var2, int var4) throws IOException {
      return this.buf.writeBytes(var1, var2, var4);
   }

   public ByteBuf writeZero(int var1) {
      return this.buf.writeZero(var1);
   }

   public int writeCharSequence(CharSequence var1, Charset var2) {
      return this.buf.writeCharSequence(var1, var2);
   }

   public int indexOf(int var1, int var2, byte var3) {
      return this.buf.indexOf(var1, var2, var3);
   }

   public int bytesBefore(byte var1) {
      return this.buf.bytesBefore(var1);
   }

   public int bytesBefore(int var1, byte var2) {
      return this.buf.bytesBefore(var1, var2);
   }

   public int bytesBefore(int var1, int var2, byte var3) {
      return this.buf.bytesBefore(var1, var2, var3);
   }

   public int forEachByte(ByteProcessor var1) {
      return this.buf.forEachByte(var1);
   }

   public int forEachByte(int var1, int var2, ByteProcessor var3) {
      return this.buf.forEachByte(var1, var2, var3);
   }

   public int forEachByteDesc(ByteProcessor var1) {
      return this.buf.forEachByteDesc(var1);
   }

   public int forEachByteDesc(int var1, int var2, ByteProcessor var3) {
      return this.buf.forEachByteDesc(var1, var2, var3);
   }

   public ByteBuf copy() {
      return this.buf.copy();
   }

   public ByteBuf copy(int var1, int var2) {
      return this.buf.copy(var1, var2);
   }

   public ByteBuf slice() {
      return this.buf.slice();
   }

   public ByteBuf retainedSlice() {
      return this.buf.retainedSlice();
   }

   public ByteBuf slice(int var1, int var2) {
      return this.buf.slice(var1, var2);
   }

   public ByteBuf retainedSlice(int var1, int var2) {
      return this.buf.retainedSlice(var1, var2);
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

   public ByteBuffer nioBuffer(int var1, int var2) {
      return this.buf.nioBuffer(var1, var2);
   }

   public ByteBuffer internalNioBuffer(int var1, int var2) {
      return this.buf.internalNioBuffer(var1, var2);
   }

   public ByteBuffer[] nioBuffers() {
      return this.buf.nioBuffers();
   }

   public ByteBuffer[] nioBuffers(int var1, int var2) {
      return this.buf.nioBuffers(var1, var2);
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

   public String toString(Charset var1) {
      return this.buf.toString(var1);
   }

   public String toString(int var1, int var2, Charset var3) {
      return this.buf.toString(var1, var2, var3);
   }

   public int hashCode() {
      return this.buf.hashCode();
   }

   public boolean equals(Object var1) {
      return this.buf.equals(var1);
   }

   public int compareTo(ByteBuf var1) {
      return this.buf.compareTo(var1);
   }

   public String toString() {
      return this.buf.toString();
   }

   public ByteBuf retain(int var1) {
      return this.buf.retain(var1);
   }

   public ByteBuf retain() {
      return this.buf.retain();
   }

   public ByteBuf touch() {
      return this.buf.touch();
   }

   public ByteBuf touch(Object var1) {
      return this.buf.touch(var1);
   }

   public int refCnt() {
      return this.buf.refCnt();
   }

   public boolean release() {
      return this.buf.release();
   }

   public boolean release(int var1) {
      return this.buf.release(var1);
   }

   public Map<String, Object> getCustomData() {
      return this.customData;
   }

   public Object getCustomData(String p_getCustomData_1_)
   {
      return this.customData == null ? null : this.customData.get(p_getCustomData_1_);
   }

   public void setCustomData(Map<String, Object> p_setCustomData_1_)
   {
      this.customData = p_setCustomData_1_;
   }
}
