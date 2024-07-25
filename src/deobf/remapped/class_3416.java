package remapped;

import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.bytes.ByteOpenHashSet;
import it.unimi.dsi.fastutil.bytes.ByteSet;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_3416 extends class_6850<class_8406> {
   public static final class_3265<class_3416> field_16815 = new class_7555();
   private static final ByteSet field_16816 = new ByteOpenHashSet(Arrays.<Byte>asList((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6));
   private final List<class_8406> field_16814;
   private byte field_16818;

   private class_3416(List<class_8406> var1, byte var2) {
      this.field_16814 = var1;
      this.field_16818 = var2;
   }

   public class_3416() {
      this(Lists.newArrayList(), (byte)0);
   }

   @Override
   public void method_38707(DataOutput var1) throws IOException {
      if (!this.field_16814.isEmpty()) {
         this.field_16818 = this.field_16814.get(0).method_38706();
      } else {
         this.field_16818 = 0;
      }

      var1.writeByte(this.field_16818);
      var1.writeInt(this.field_16814.size());

      for (class_8406 var5 : this.field_16814) {
         var5.method_38707(var1);
      }
   }

   @Override
   public byte method_38706() {
      return 9;
   }

   @Override
   public class_3265<class_3416> method_38709() {
      return field_16815;
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder("[");

      for (int var4 = 0; var4 < this.field_16814.size(); var4++) {
         if (var4 != 0) {
            var3.append(',');
         }

         var3.append(this.field_16814.get(var4));
      }

      return var3.append(']').toString();
   }

   private void method_15766() {
      if (this.field_16814.isEmpty()) {
         this.field_16818 = 0;
      }
   }

   @Override
   public class_8406 remove(int var1) {
      class_8406 var4 = this.field_16814.remove(var1);
      this.method_15766();
      return var4;
   }

   @Override
   public boolean isEmpty() {
      return this.field_16814.isEmpty();
   }

   public class_5734 method_15764(int var1) {
      if (var1 >= 0 && var1 < this.field_16814.size()) {
         class_8406 var4 = this.field_16814.get(var1);
         if (var4.method_38706() == 10) {
            return (class_5734)var4;
         }
      }

      return new class_5734();
   }

   public class_3416 method_15760(int var1) {
      if (var1 >= 0 && var1 < this.field_16814.size()) {
         class_8406 var4 = this.field_16814.get(var1);
         if (var4.method_38706() == 9) {
            return (class_3416)var4;
         }
      }

      return new class_3416();
   }

   public short method_15765(int var1) {
      if (var1 >= 0 && var1 < this.field_16814.size()) {
         class_8406 var4 = this.field_16814.get(var1);
         if (var4.method_38706() == 2) {
            return ((class_7745)var4).method_26640();
         }
      }

      return 0;
   }

   public int method_15762(int var1) {
      if (var1 >= 0 && var1 < this.field_16814.size()) {
         class_8406 var4 = this.field_16814.get(var1);
         if (var4.method_38706() == 3) {
            return ((class_9413)var4).method_26636();
         }
      }

      return 0;
   }

   public int[] method_15767(int var1) {
      if (var1 >= 0 && var1 < this.field_16814.size()) {
         class_8406 var4 = this.field_16814.get(var1);
         if (var4.method_38706() == 11) {
            return ((class_6222)var4).method_28446();
         }
      }

      return new int[0];
   }

   public double method_15763(int var1) {
      if (var1 >= 0 && var1 < this.field_16814.size()) {
         class_8406 var4 = this.field_16814.get(var1);
         if (var4.method_38706() == 6) {
            return ((class_9708)var4).method_26642();
         }
      }

      return 0.0;
   }

   public float method_15769(int var1) {
      if (var1 >= 0 && var1 < this.field_16814.size()) {
         class_8406 var4 = this.field_16814.get(var1);
         if (var4.method_38706() == 5) {
            return ((class_5718)var4).method_26639();
         }
      }

      return 0.0F;
   }

   public String method_15770(int var1) {
      if (var1 >= 0 && var1 < this.field_16814.size()) {
         class_8406 var4 = this.field_16814.get(var1);
         return var4.method_38706() != 8 ? var4.toString() : var4.method_38710();
      } else {
         return "";
      }
   }

   @Override
   public int size() {
      return this.field_16814.size();
   }

   public class_8406 get(int var1) {
      return this.field_16814.get(var1);
   }

   @Override
   public class_8406 set(int var1, class_8406 var2) {
      class_8406 var5 = this.get(var1);
      if (this.method_31429(var1, var2)) {
         return var5;
      } else {
         throw new UnsupportedOperationException(String.format("Trying to add tag of type %d to list of %d", var2.method_38706(), this.field_16818));
      }
   }

   @Override
   public void add(int var1, class_8406 var2) {
      if (!this.method_31426(var1, var2)) {
         throw new UnsupportedOperationException(String.format("Trying to add tag of type %d to list of %d", var2.method_38706(), this.field_16818));
      }
   }

   @Override
   public boolean method_31429(int var1, class_8406 var2) {
      if (!this.method_15761(var2)) {
         return false;
      } else {
         this.field_16814.set(var1, var2);
         return true;
      }
   }

   @Override
   public boolean method_31426(int var1, class_8406 var2) {
      if (!this.method_15761(var2)) {
         return false;
      } else {
         this.field_16814.add(var1, var2);
         return true;
      }
   }

   private boolean method_15761(class_8406 var1) {
      if (var1.method_38706() != 0) {
         if (this.field_16818 != 0) {
            return this.field_16818 == var1.method_38706();
         } else {
            this.field_16818 = var1.method_38706();
            return true;
         }
      } else {
         return false;
      }
   }

   public class_3416 method_15768() {
      Object var3 = !class_81.method_172(this.field_16818).method_14889() ? Iterables.transform(this.field_16814, class_8406::method_38708) : this.field_16814;
      ArrayList var4 = Lists.newArrayList((Iterable)var3);
      return new class_3416(var4, this.field_16818);
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class_3416 && Objects.equals(this.field_16814, ((class_3416)var1).field_16814);
   }

   @Override
   public int hashCode() {
      return this.field_16814.hashCode();
   }

   @Override
   public ITextComponent method_38712(String var1, int var2) {
      if (!this.isEmpty()) {
         if (field_16816.contains(this.field_16818) && this.size() <= 8) {
            String var9 = ", ";
            StringTextComponent var10 = new StringTextComponent("[");

            for (int var11 = 0; var11 < this.field_16814.size(); var11++) {
               if (var11 != 0) {
                  var10.appendString(", ");
               }

               var10.append(this.field_16814.get(var11).method_38711());
            }

            var10.appendString("]");
            return var10;
         } else {
            StringTextComponent var5 = new StringTextComponent("[");
            if (!var1.isEmpty()) {
               var5.appendString("\n");
            }

            String var6 = String.valueOf(',');

            for (int var7 = 0; var7 < this.field_16814.size(); var7++) {
               StringTextComponent var8 = new StringTextComponent(Strings.repeat(var1, var2 + 1));
               var8.append(this.field_16814.get(var7).method_38712(var1, var2 + 1));
               if (var7 != this.field_16814.size() - 1) {
                  var8.appendString(var6).appendString(!var1.isEmpty() ? "\n" : " ");
               }

               var5.append(var8);
            }

            if (!var1.isEmpty()) {
               var5.appendString("\n").appendString(Strings.repeat(var1, var2));
            }

            var5.appendString("]");
            return var5;
         }
      } else {
         return new StringTextComponent("[]");
      }
   }

   @Override
   public byte method_31428() {
      return this.field_16818;
   }

   @Override
   public void clear() {
      this.field_16814.clear();
      this.field_16818 = 0;
   }
}
