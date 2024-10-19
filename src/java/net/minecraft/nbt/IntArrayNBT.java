package net.minecraft.nbt;

import mapped.*;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.lang3.ArrayUtils;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class IntArrayNBT extends CollectionNBT<IntNBT> {
   public static final INBTType<IntArrayNBT> TYPE = new Class7053();
   private int[] field53;

   public IntArrayNBT(int[] var1) {
      this.field53 = var1;
   }

   public IntArrayNBT(List<Integer> var1) {
      this(toArray(var1));
   }

   private static int[] toArray(List<Integer> var0) {
      int[] var3 = new int[var0.size()];

      for (int var4 = 0; var4 < var0.size(); var4++) {
         Integer var5 = (Integer)var0.get(var4);
         var3[var4] = var5 != null ? var5 : 0;
      }

      return var3;
   }

   @Override
   public void write(DataOutput var1) throws IOException {
      var1.writeInt(this.field53.length);

      for (int var7 : this.field53) {
         var1.writeInt(var7);
      }
   }

   @Override
   public byte getID() {
      return 11;
   }

   @Override
   public INBTType<IntArrayNBT> getType() {
      return TYPE;
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder("[I;");

      for (int var4 = 0; var4 < this.field53.length; var4++) {
         if (var4 != 0) {
            var3.append(',');
         }

         var3.append(this.field53[var4]);
      }

      return var3.append(']').toString();
   }

   public IntArrayNBT copy() {
      int[] var3 = new int[this.field53.length];
      System.arraycopy(this.field53, 0, var3, 0, this.field53.length);
      return new IntArrayNBT(var3);
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof IntArrayNBT && Arrays.equals(this.field53, ((IntArrayNBT)var1).field53);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.field53);
   }

   public int[] getIntArray() {
      return this.field53;
   }

   @Override
   public ITextComponent toFormattedComponent(String indentation, int indentDepth) {
      IFormattableTextComponent var5 = new StringTextComponent("I").mergeStyle(SYNTAX_HIGHLIGHTING_NUMBER_TYPE);
      IFormattableTextComponent var6 = new StringTextComponent("[").append(var5).appendString(";");

      for (int var7 = 0; var7 < this.field53.length; var7++) {
         var6.appendString(" ").append(new StringTextComponent(String.valueOf(this.field53[var7])).mergeStyle(SYNTAX_HIGHLIGHTING_NUMBER));
         if (var7 != this.field53.length - 1) {
            var6.appendString(",");
         }
      }

      var6.appendString("]");
      return var6;
   }

   @Override
   public int size() {
      return this.field53.length;
   }

   public IntNBT get(int var1) {
      return IntNBT.valueOf(this.field53[var1]);
   }

   public IntNBT set(int var1, IntNBT var2) {
      int var5 = this.field53[var1];
      this.field53[var1] = var2.getInt();
      return IntNBT.valueOf(var5);
   }

   public void add(int var1, IntNBT var2) {
      this.field53 = ArrayUtils.add(this.field53, var1, var2.getInt());
   }

   @Override
   public boolean setNBTByIndex(int var1, INBT var2) {
      if (!(var2 instanceof NumberNBT)) {
         return false;
      } else {
         this.field53[var1] = ((NumberNBT)var2).getInt();
         return true;
      }
   }

   @Override
   public boolean addNBTByIndex(int var1, INBT var2) {
      if (!(var2 instanceof NumberNBT)) {
         return false;
      } else {
         this.field53 = ArrayUtils.add(this.field53, var1, ((NumberNBT)var2).getInt());
         return true;
      }
   }

   public IntNBT remove(int var1) {
      int var4 = this.field53[var1];
      this.field53 = ArrayUtils.remove(this.field53, var1);
      return IntNBT.valueOf(var4);
   }

   @Override
   public byte getTagType() {
      return 3;
   }

   @Override
   public void clear() {
      this.field53 = new int[0];
   }
}
