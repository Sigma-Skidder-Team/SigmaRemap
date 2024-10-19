package net.minecraft.nbt;

import mapped.Class7062;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Objects;

public class StringNBT implements INBT {
   public static final INBTType<StringNBT> field84 = new Class7062();
   private static final StringNBT field85 = new StringNBT("");
   private final String field86;

   public StringNBT(String var1) {
      Objects.<String>requireNonNull(var1, "Null string not allowed");
      this.field86 = var1;
   }

   public static StringNBT valueOf(String var0) {
      return !var0.isEmpty() ? new StringNBT(var0) : field85;
   }

   @Override
   public void write(DataOutput var1) throws IOException {
      var1.writeUTF(this.field86);
   }

   @Override
   public byte getID() {
      return 8;
   }

   @Override
   public INBTType<StringNBT> getType() {
      return field84;
   }

   @Override
   public String toString() {
      return quoteAndEscape(this.field86);
   }

   public StringNBT copy() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof StringNBT && Objects.equals(this.field86, ((StringNBT)var1).field86);
   }

   @Override
   public int hashCode() {
      return this.field86.hashCode();
   }

   @Override
   public String getString() {
      return this.field86;
   }

   @Override
   public ITextComponent toFormattedComponent(String indentation, int indentDepth) {
      String var5 = quoteAndEscape(this.field86);
      String var6 = var5.substring(0, 1);
      IFormattableTextComponent var7 = new StringTextComponent(var5.substring(1, var5.length() - 1)).mergeStyle(SYNTAX_HIGHLIGHTING_STRING);
      return new StringTextComponent(var6).append(var7).appendString(var6);
   }

   public static String quoteAndEscape(String var0) {
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
