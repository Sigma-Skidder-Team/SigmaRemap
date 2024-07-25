package remapped;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.lang3.ArrayUtils;

public class class_5064 extends class_6850<class_5284> {
   public static final class_3265<class_5064> field_26180 = new class_1717();
   private byte[] field_26178;

   public class_5064(byte[] var1) {
      this.field_26178 = var1;
   }

   public class_5064(List<Byte> var1) {
      this(toArray(var1));
   }

   private static byte[] toArray(List<Byte> var0) {
      byte[] var3 = new byte[var0.size()];

      for (int var4 = 0; var4 < var0.size(); var4++) {
         Byte var5 = (Byte)var0.get(var4);
         var3[var4] = var5 != null ? var5 : 0;
      }

      return var3;
   }

   @Override
   public void method_38707(DataOutput var1) throws IOException {
      var1.writeInt(this.field_26178.length);
      var1.write(this.field_26178);
   }

   @Override
   public byte method_38706() {
      return 7;
   }

   @Override
   public class_3265<class_5064> method_38709() {
      return field_26180;
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder("[B;");

      for (int var4 = 0; var4 < this.field_26178.length; var4++) {
         if (var4 != 0) {
            var3.append(',');
         }

         var3.append(this.field_26178[var4]).append('B');
      }

      return var3.append(']').toString();
   }

   @Override
   public class_8406 method_38708() {
      byte[] var3 = new byte[this.field_26178.length];
      System.arraycopy(this.field_26178, 0, var3, 0, this.field_26178.length);
      return new class_5064(var3);
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class_5064 && Arrays.equals(this.field_26178, ((class_5064)var1).field_26178);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.field_26178);
   }

   @Override
   public ITextComponent method_38712(String var1, int var2) {
      IFormattableTextComponent var5 = new StringTextComponent("B").mergeStyle(field_43007);
      IFormattableTextComponent var6 = new StringTextComponent("[").append(var5).appendString(";");

      for (int var7 = 0; var7 < this.field_26178.length; var7++) {
         IFormattableTextComponent var8 = new StringTextComponent(String.valueOf(this.field_26178[var7])).mergeStyle(field_43005);
         var6.appendString(" ").append(var8).append(var5);
         if (var7 != this.field_26178.length - 1) {
            var6.appendString(",");
         }
      }

      var6.appendString("]");
      return var6;
   }

   public byte[] method_23327() {
      return this.field_26178;
   }

   @Override
   public int size() {
      return this.field_26178.length;
   }

   public class_5284 get(int var1) {
      return class_5284.method_24120(this.field_26178[var1]);
   }

   public class_5284 set(int var1, class_5284 var2) {
      byte var5 = this.field_26178[var1];
      this.field_26178[var1] = var2.method_26641();
      return class_5284.method_24120(var5);
   }

   public void add(int var1, class_5284 var2) {
      this.field_26178 = ArrayUtils.add(this.field_26178, var1, var2.method_26641());
   }

   @Override
   public boolean method_31429(int var1, class_8406 var2) {
      if (!(var2 instanceof class_5841)) {
         return false;
      } else {
         this.field_26178[var1] = ((class_5841)var2).method_26641();
         return true;
      }
   }

   @Override
   public boolean method_31426(int var1, class_8406 var2) {
      if (!(var2 instanceof class_5841)) {
         return false;
      } else {
         this.field_26178 = ArrayUtils.add(this.field_26178, var1, ((class_5841)var2).method_26641());
         return true;
      }
   }

   public class_5284 remove(int var1) {
      byte var4 = this.field_26178[var1];
      this.field_26178 = ArrayUtils.remove(this.field_26178, var1);
      return class_5284.method_24120(var4);
   }

   @Override
   public byte method_31428() {
      return 1;
   }

   @Override
   public void clear() {
      this.field_26178 = new byte[0];
   }
}
