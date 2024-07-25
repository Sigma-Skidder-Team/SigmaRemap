package remapped;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.lang3.ArrayUtils;

public class class_6222 extends class_6850<class_9413> {
   public static final class_3265<class_6222> field_31787 = new class_8952();
   private int[] field_31789;

   public class_6222(int[] var1) {
      this.field_31789 = var1;
   }

   public class_6222(List<Integer> var1) {
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
   public void method_38707(DataOutput var1) throws IOException {
      var1.writeInt(this.field_31789.length);

      for (int var7 : this.field_31789) {
         var1.writeInt(var7);
      }
   }

   @Override
   public byte method_38706() {
      return 11;
   }

   @Override
   public class_3265<class_6222> method_38709() {
      return field_31787;
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder("[I;");

      for (int var4 = 0; var4 < this.field_31789.length; var4++) {
         if (var4 != 0) {
            var3.append(',');
         }

         var3.append(this.field_31789[var4]);
      }

      return var3.append(']').toString();
   }

   public class_6222 method_28447() {
      int[] var3 = new int[this.field_31789.length];
      System.arraycopy(this.field_31789, 0, var3, 0, this.field_31789.length);
      return new class_6222(var3);
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class_6222 && Arrays.equals(this.field_31789, ((class_6222)var1).field_31789);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.field_31789);
   }

   public int[] method_28446() {
      return this.field_31789;
   }

   @Override
   public ITextComponent method_38712(String var1, int var2) {
      IFormattableTextComponent var5 = new StringTextComponent("I").mergeStyle(field_43007);
      IFormattableTextComponent var6 = new StringTextComponent("[").append(var5).appendString(";");

      for (int var7 = 0; var7 < this.field_31789.length; var7++) {
         var6.appendString(" ").append(new StringTextComponent(String.valueOf(this.field_31789[var7])).mergeStyle(field_43005));
         if (var7 != this.field_31789.length - 1) {
            var6.appendString(",");
         }
      }

      var6.appendString("]");
      return var6;
   }

   @Override
   public int size() {
      return this.field_31789.length;
   }

   public class_9413 get(int var1) {
      return class_9413.method_43597(this.field_31789[var1]);
   }

   public class_9413 set(int var1, class_9413 var2) {
      int var5 = this.field_31789[var1];
      this.field_31789[var1] = var2.method_26636();
      return class_9413.method_43597(var5);
   }

   public void add(int var1, class_9413 var2) {
      this.field_31789 = ArrayUtils.add(this.field_31789, var1, var2.method_26636());
   }

   @Override
   public boolean method_31429(int var1, class_8406 var2) {
      if (!(var2 instanceof class_5841)) {
         return false;
      } else {
         this.field_31789[var1] = ((class_5841)var2).method_26636();
         return true;
      }
   }

   @Override
   public boolean method_31426(int var1, class_8406 var2) {
      if (!(var2 instanceof class_5841)) {
         return false;
      } else {
         this.field_31789 = ArrayUtils.add(this.field_31789, var1, ((class_5841)var2).method_26636());
         return true;
      }
   }

   public class_9413 remove(int var1) {
      int var4 = this.field_31789[var1];
      this.field_31789 = ArrayUtils.remove(this.field_31789, var1);
      return class_9413.method_43597(var4);
   }

   @Override
   public byte method_31428() {
      return 3;
   }

   @Override
   public void clear() {
      this.field_31789 = new int[0];
   }
}
