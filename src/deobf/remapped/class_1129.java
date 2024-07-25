package remapped;

import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.lang3.ArrayUtils;

public class class_1129 extends class_6850<class_3388> {
   public static final class_3265<class_1129> field_6440 = new class_6632();
   private long[] field_6439;

   public class_1129(long[] var1) {
      this.field_6439 = var1;
   }

   public class_1129(LongSet var1) {
      this.field_6439 = var1.toLongArray();
   }

   public class_1129(List<Long> var1) {
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
   public void method_38707(DataOutput var1) throws IOException {
      var1.writeInt(this.field_6439.length);

      for (long var7 : this.field_6439) {
         var1.writeLong(var7);
      }
   }

   @Override
   public byte method_38706() {
      return 12;
   }

   @Override
   public class_3265<class_1129> method_38709() {
      return field_6440;
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder("[L;");

      for (int var4 = 0; var4 < this.field_6439.length; var4++) {
         if (var4 != 0) {
            var3.append(',');
         }

         var3.append(this.field_6439[var4]).append('L');
      }

      return var3.append(']').toString();
   }

   public class_1129 method_4958() {
      long[] var3 = new long[this.field_6439.length];
      System.arraycopy(this.field_6439, 0, var3, 0, this.field_6439.length);
      return new class_1129(var3);
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class_1129 && Arrays.equals(this.field_6439, ((class_1129)var1).field_6439);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.field_6439);
   }

   @Override
   public ITextComponent method_38712(String var1, int var2) {
      IFormattableTextComponent var5 = new StringTextComponent("L").mergeStyle(field_43007);
      IFormattableTextComponent var6 = new StringTextComponent("[").append(var5).appendString(";");

      for (int var7 = 0; var7 < this.field_6439.length; var7++) {
         IFormattableTextComponent var8 = new StringTextComponent(String.valueOf(this.field_6439[var7])).mergeStyle(field_43005);
         var6.appendString(" ").append(var8).append(var5);
         if (var7 != this.field_6439.length - 1) {
            var6.appendString(",");
         }
      }

      var6.appendString("]");
      return var6;
   }

   public long[] method_4959() {
      return this.field_6439;
   }

   @Override
   public int size() {
      return this.field_6439.length;
   }

   public class_3388 get(int var1) {
      return class_3388.method_15658(this.field_6439[var1]);
   }

   public class_3388 set(int var1, class_3388 var2) {
      long var5 = this.field_6439[var1];
      this.field_6439[var1] = var2.method_26635();
      return class_3388.method_15658(var5);
   }

   public void add(int var1, class_3388 var2) {
      this.field_6439 = ArrayUtils.add(this.field_6439, var1, var2.method_26635());
   }

   @Override
   public boolean method_31429(int var1, class_8406 var2) {
      if (!(var2 instanceof class_5841)) {
         return false;
      } else {
         this.field_6439[var1] = ((class_5841)var2).method_26635();
         return true;
      }
   }

   @Override
   public boolean method_31426(int var1, class_8406 var2) {
      if (!(var2 instanceof class_5841)) {
         return false;
      } else {
         this.field_6439 = ArrayUtils.add(this.field_6439, var1, ((class_5841)var2).method_26635());
         return true;
      }
   }

   public class_3388 remove(int var1) {
      long var4 = this.field_6439[var1];
      this.field_6439 = ArrayUtils.remove(this.field_6439, var1);
      return class_3388.method_15658(var4);
   }

   @Override
   public byte method_31428() {
      return 4;
   }

   @Override
   public void clear() {
      this.field_6439 = new long[0];
   }
}
