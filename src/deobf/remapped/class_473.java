package remapped;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Objects;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_473 implements class_8406 {
   public static final class_3265<class_473> field_2955 = new class_7994();
   private static final class_473 field_2956 = new class_473("");
   private final String field_2954;

   public class_473(String var1) {
      Objects.<String>requireNonNull(var1, "Null string not allowed");
      this.field_2954 = var1;
   }

   public static class_473 method_2261(String var0) {
      return !var0.isEmpty() ? new class_473(var0) : field_2956;
   }

   @Override
   public void method_38707(DataOutput var1) throws IOException {
      var1.writeUTF(this.field_2954);
   }

   @Override
   public byte method_38706() {
      return 8;
   }

   @Override
   public class_3265<class_473> method_38709() {
      return field_2955;
   }

   @Override
   public String toString() {
      return method_2260(this.field_2954);
   }

   public class_473 method_2259() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class_473 && Objects.equals(this.field_2954, ((class_473)var1).field_2954);
   }

   @Override
   public int hashCode() {
      return this.field_2954.hashCode();
   }

   @Override
   public String method_38710() {
      return this.field_2954;
   }

   @Override
   public ITextComponent method_38712(String var1, int var2) {
      String var5 = method_2260(this.field_2954);
      String var6 = var5.substring(0, 1);
      IFormattableTextComponent var7 = new StringTextComponent(var5.substring(1, var5.length() - 1)).mergeStyle(field_43006);
      return new StringTextComponent(var6).append(var7).appendString(var6);
   }

   public static String method_2260(String var0) {
      StringBuilder var3 = new StringBuilder(" ");
      char var4 = 0;

      for (int var5 = 0; var5 < var0.length(); var5++) {
         char var6 = var0.charAt(var5);
         if (var6 != '\\') {
            if (var6 == '"' || var6 == '\'') {
               if (var4 == 0) {
                  var4 = (char)(var6 != '"' ? 34 : 39);
               }

               if (var4 == var6) {
                  var3.append('\\');
               }
            }
         } else {
            var3.append('\\');
         }

         var3.append(var6);
      }

      if (var4 == 0) {
         var4 = '"';
      }

      var3.setCharAt(0, var4);
      var3.append(var4);
      return var3.toString();
   }
}
