package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class LongNBT extends NumberNBT
{
   public static final INBTType<LongNBT> TYPE = new INBTType<LongNBT>()
   {
      public LongNBT readNBT(DataInput input, int depth, NBTSizeTracker accounter) throws IOException
      {
         accounter.read(128L);
         return LongNBT.valueOf(input.readLong());
      }
      public String getName()
      {
         return "LONG";
      }
      public String getTagName()
      {
         return "TAG_Long";
      }
      public boolean isPrimitive()
      {
         return true;
      }
   };
   private final long data;

   private LongNBT(long data)
   {
      this.data = data;
   }

   public static LongNBT valueOf(long value)
   {
      return value >= -128L && value <= 1024L ? LongNBT.Cache.CACHE[(int)value + 128] : new LongNBT(value);
   }

   /**
    * Write the actual data contents of the tag, implemented in NBT extension classes
    */
   public void write(DataOutput output) throws IOException
   {
      output.writeLong(this.data);
   }

   /**
    * Gets the type byte for the tag.
    */
   public byte getID()
   {
      return 4;
   }

   public INBTType<LongNBT> getType()
   {
      return TYPE;
   }

   public String toString()
   {
      return this.data + "L";
   }

   /**
    * Creates a clone of the tag.
    */
   public LongNBT copy()
   {
      return this;
   }

   public boolean equals(Object p_equals_1_)
   {
      if (this == p_equals_1_)
      {
         return true;
      }
      else
      {
         return p_equals_1_ instanceof LongNBT && this.data == ((LongNBT)p_equals_1_).data;
      }
   }

   public int hashCode()
   {
      return (int)(this.data ^ this.data >>> 32);
   }

   public ITextComponent toFormattedComponent(String indentation, int indentDepth)
   {
      ITextComponent itextcomponent = (new StringTextComponent("L")).mergeStyle(SYNTAX_HIGHLIGHTING_NUMBER_TYPE);
      return (new StringTextComponent(String.valueOf(this.data))).append(itextcomponent).mergeStyle(SYNTAX_HIGHLIGHTING_NUMBER);
   }

   public long getLong()
   {
      return this.data;
   }

   public int getInt()
   {
      return (int)(this.data & -1L);
   }

   public short getShort()
   {
      return (short)((int)(this.data & 65535L));
   }

   public byte getByte()
   {
      return (byte)((int)(this.data & 255L));
   }

   public double getDouble()
   {
      return (double)this.data;
   }

   public float getFloat()
   {
      return (float)this.data;
   }

   public Number getAsNumber()
   {
      return this.data;
   }

   static class Cache
   {
      static final LongNBT[] CACHE = new LongNBT[1153];

      static
      {
         for (int i = 0; i < CACHE.length; ++i)
         {
            CACHE[i] = new LongNBT((long)(-128 + i));
         }
      }
   }
}