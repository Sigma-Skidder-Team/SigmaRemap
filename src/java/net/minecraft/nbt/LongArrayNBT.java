package net.minecraft.nbt;

import it.unimi.dsi.fastutil.longs.LongSet;
import mapped.*;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.lang3.ArrayUtils;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class LongArrayNBT extends CollectionNBT<LongNBT> {
   public static final INBTType<LongArrayNBT> TYPE = new Class7061();
   private long[] field92;

   public LongArrayNBT(long[] var1) {
      this.field92 = var1;
   }

   public LongArrayNBT(LongSet var1) {
      this.field92 = var1.toLongArray();
   }

   public LongArrayNBT(List<Long> var1) {
      this(toArray(var1));
   }

   private static long[] toArray(List<Long> var0) {
      long[] var3 = new long[var0.size()];

      for (int var4 = 0; var4 < var0.size(); var4++) {
         Long var5 = (Long)var0.get(var4);
         var3[var4] = var5 != null ? var5 : 0L;
      }

      return var3;
   }

   @Override
   public void write(DataOutput var1) throws IOException {
      var1.writeInt(this.field92.length);

      for (long var7 : this.field92) {
         var1.writeLong(var7);
      }
   }

   @Override
   public byte getID() {
      return 12;
   }

   @Override
   public INBTType<LongArrayNBT> getType() {
      return TYPE;
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder("[L;");

      for (int var4 = 0; var4 < this.field92.length; var4++) {
         if (var4 != 0) {
            var3.append(',');
         }

         var3.append(this.field92[var4]).append('L');
      }

      return var3.append(']').toString();
   }

   public LongArrayNBT copy() {
      long[] var3 = new long[this.field92.length];
      System.arraycopy(this.field92, 0, var3, 0, this.field92.length);
      return new LongArrayNBT(var3);
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof LongArrayNBT && Arrays.equals(this.field92, ((LongArrayNBT)var1).field92);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.field92);
   }

   @Override
   public ITextComponent toFormattedComponent(String indentation, int indentDepth) {
      IFormattableTextComponent var5 = new StringTextComponent("L").mergeStyle(SYNTAX_HIGHLIGHTING_NUMBER_TYPE);
      IFormattableTextComponent var6 = new StringTextComponent("[").append(var5).appendString(";");

      for (int var7 = 0; var7 < this.field92.length; var7++) {
         IFormattableTextComponent var8 = new StringTextComponent(String.valueOf(this.field92[var7])).mergeStyle(SYNTAX_HIGHLIGHTING_NUMBER);
         var6.appendString(" ").append(var8).append(var5);
         if (var7 != this.field92.length - 1) {
            var6.appendString(",");
         }
      }

      var6.appendString("]");
      return var6;
   }

   public long[] getLongArray() {
      return this.field92;
   }

   @Override
   public int size() {
      return this.field92.length;
   }

   public LongNBT get(int var1) {
      return LongNBT.valueOf(this.field92[var1]);
   }

   public LongNBT set(int var1, LongNBT var2) {
      long var5 = this.field92[var1];
      this.field92[var1] = var2.getLong();
      return LongNBT.valueOf(var5);
   }

   public void add(int var1, LongNBT var2) {
      this.field92 = ArrayUtils.add(this.field92, var1, var2.getLong());
   }

   @Override
   public boolean setNBTByIndex(int var1, INBT var2) {
      if (!(var2 instanceof NumberNBT)) {
         return false;
      } else {
         this.field92[var1] = ((NumberNBT)var2).getLong();
         return true;
      }
   }

   @Override
   public boolean addNBTByIndex(int var1, INBT var2) {
      if (!(var2 instanceof NumberNBT)) {
         return false;
      } else {
         this.field92 = ArrayUtils.add(this.field92, var1, ((NumberNBT)var2).getLong());
         return true;
      }
   }

   public LongNBT remove(int var1) {
      long var4 = this.field92[var1];
      this.field92 = ArrayUtils.remove(this.field92, var1);
      return LongNBT.valueOf(var4);
   }

   @Override
   public byte getTagType() {
      return 4;
   }

   @Override
   public void clear() {
      this.field92 = new long[0];
   }
}
