package net.minecraft.nbt;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import net.minecraft.util.text.TranslationTextComponent;

public class JSONToNBT {
   public static final SimpleCommandExceptionType field32863 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.nbt.trailing"));
   public static final SimpleCommandExceptionType field32864 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.nbt.expected.key"));
   public static final SimpleCommandExceptionType field32865 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.nbt.expected.value"));
   public static final Dynamic2CommandExceptionType field32866 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.nbt.list.mixed", var0, var1)
   );
   public static final Dynamic2CommandExceptionType field32867 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.nbt.array.mixed", var0, var1)
   );
   public static final DynamicCommandExceptionType field32868 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.nbt.array.invalid", var0)
   );
   private static final Pattern field32869 = Pattern.compile("[-+]?(?:[0-9]+[.]|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?", 2);
   private static final Pattern field32870 = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?d", 2);
   private static final Pattern field32871 = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?f", 2);
   private static final Pattern field32872 = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)b", 2);
   private static final Pattern field32873 = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)l", 2);
   private static final Pattern field32874 = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)s", 2);
   private static final Pattern field32875 = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)");
   private final StringReader field32876;

   public static CompoundNBT method25188(String var0) throws CommandSyntaxException {
      return new JSONToNBT(new StringReader(var0)).method25189();
   }

   @VisibleForTesting
   public CompoundNBT method25189() throws CommandSyntaxException {
      CompoundNBT var3 = this.method25195();
      this.field32876.skipWhitespace();
      if (!this.field32876.canRead()) {
         return var3;
      } else {
         throw field32863.createWithContext(this.field32876);
      }
   }

   public JSONToNBT(StringReader var1) {
      this.field32876 = var1;
   }

   public String method25190() throws CommandSyntaxException {
      this.field32876.skipWhitespace();
      if (this.field32876.canRead()) {
         return this.field32876.readString();
      } else {
         throw field32864.createWithContext(this.field32876);
      }
   }

   public INBT method25191() throws CommandSyntaxException {
      this.field32876.skipWhitespace();
      int var3 = this.field32876.getCursor();
      if (!StringReader.isQuotedStringStart(this.field32876.peek())) {
         String var4 = this.field32876.readUnquotedString();
         if (!var4.isEmpty()) {
            return this.method25192(var4);
         } else {
            this.field32876.setCursor(var3);
            throw field32865.createWithContext(this.field32876);
         }
      } else {
         return StringNBT.valueOf(this.field32876.readQuotedString());
      }
   }

   private INBT method25192(String var1) {
      try {
         if (field32871.matcher(var1).matches()) {
            return FloatNBT.valueOf(Float.parseFloat(var1.substring(0, var1.length() - 1)));
         }

         if (field32872.matcher(var1).matches()) {
            return ByteNBT.valueOf(Byte.parseByte(var1.substring(0, var1.length() - 1)));
         }

         if (field32873.matcher(var1).matches()) {
            return LongNBT.valueOf(Long.parseLong(var1.substring(0, var1.length() - 1)));
         }

         if (field32874.matcher(var1).matches()) {
            return ShortNBT.valueOf(Short.parseShort(var1.substring(0, var1.length() - 1)));
         }

         if (field32875.matcher(var1).matches()) {
            return IntNBT.valueOf(Integer.parseInt(var1));
         }

         if (field32870.matcher(var1).matches()) {
            return DoubleNBT.valueOf(Double.parseDouble(var1.substring(0, var1.length() - 1)));
         }

         if (field32869.matcher(var1).matches()) {
            return DoubleNBT.valueOf(Double.parseDouble(var1));
         }

         if ("true".equalsIgnoreCase(var1)) {
            return ByteNBT.ONE;
         }

         if ("false".equalsIgnoreCase(var1)) {
            return ByteNBT.ZERO;
         }
      } catch (NumberFormatException var5) {
      }

      return StringNBT.valueOf(var1);
   }

   public INBT method25193() throws CommandSyntaxException {
      this.field32876.skipWhitespace();
      if (this.field32876.canRead()) {
         char var3 = this.field32876.peek();
         if (var3 != '{') {
            return var3 != '[' ? this.method25191() : this.method25194();
         } else {
            return this.method25195();
         }
      } else {
         throw field32865.createWithContext(this.field32876);
      }
   }

   public INBT method25194() throws CommandSyntaxException {
      return this.field32876.canRead(3) && !StringReader.isQuotedStringStart(this.field32876.peek(1)) && this.field32876.peek(2) == ';'
         ? this.method25197()
         : this.method25196();
   }

   public CompoundNBT method25195() throws CommandSyntaxException {
      this.method25200('{');
      CompoundNBT var3 = new CompoundNBT();
      this.field32876.skipWhitespace();

      while (this.field32876.canRead() && this.field32876.peek() != '}') {
         int var4 = this.field32876.getCursor();
         String var5 = this.method25190();
         if (var5.isEmpty()) {
            this.field32876.setCursor(var4);
            throw field32864.createWithContext(this.field32876);
         }

         this.method25200(':');
         var3.put(var5, this.method25193());
         if (!this.method25199()) {
            break;
         }

         if (!this.field32876.canRead()) {
            throw field32864.createWithContext(this.field32876);
         }
      }

      this.method25200('}');
      return var3;
   }

   private INBT method25196() throws CommandSyntaxException {
      this.method25200('[');
      this.field32876.skipWhitespace();
      if (!this.field32876.canRead()) {
         throw field32865.createWithContext(this.field32876);
      } else {
         ListNBT var3 = new ListNBT();
         INBTType var4 = null;

         while (this.field32876.peek() != ']') {
            int var5 = this.field32876.getCursor();
            INBT var6 = this.method25193();
            INBTType var7 = var6.getType();
            if (var4 != null) {
               if (var7 != var4) {
                  this.field32876.setCursor(var5);
                  throw field32866.createWithContext(this.field32876, var7.getTagName(), var4.getTagName());
               }
            } else {
               var4 = var7;
            }

            var3.add(var6);
            if (!this.method25199()) {
               break;
            }

            if (!this.field32876.canRead()) {
               throw field32865.createWithContext(this.field32876);
            }
         }

         this.method25200(']');
         return var3;
      }
   }

   private INBT method25197() throws CommandSyntaxException {
      this.method25200('[');
      int var3 = this.field32876.getCursor();
      char var4 = this.field32876.read();
      this.field32876.read();
      this.field32876.skipWhitespace();
      if (this.field32876.canRead()) {
         if (var4 != 'B') {
            if (var4 != 'L') {
               if (var4 != 'I') {
                  this.field32876.setCursor(var3);
                  throw field32868.createWithContext(this.field32876, String.valueOf(var4));
               } else {
                  return new IntArrayNBT(this.<Integer>method25198(IntArrayNBT.TYPE, IntNBT.TYPE));
               }
            } else {
               return new LongArrayNBT(this.<Long>method25198(LongArrayNBT.TYPE, LongNBT.TYPE));
            }
         } else {
            return new ByteArrayNBT(this.<Byte>method25198(ByteArrayNBT.TYPE, ByteNBT.TYPE));
         }
      } else {
         throw field32865.createWithContext(this.field32876);
      }
   }

   private <T extends Number> List<T> method25198(INBTType<?> var1, INBTType<?> var2) throws CommandSyntaxException {
      ArrayList var5 = Lists.newArrayList();

      while (this.field32876.peek() != ']') {
         int var6 = this.field32876.getCursor();
         INBT var7 = this.method25193();
         INBTType var8 = var7.getType();
         if (var8 != var2) {
            this.field32876.setCursor(var6);
            throw field32867.createWithContext(this.field32876, var8.getTagName(), var1.getTagName());
         }

         if (var2 != ByteNBT.TYPE) {
            if (var2 != LongNBT.TYPE) {
               var5.add(((NumberNBT)var7).getInt());
            } else {
               var5.add(((NumberNBT)var7).getLong());
            }
         } else {
            var5.add(((NumberNBT)var7).getByte());
         }

         if (!this.method25199()) {
            break;
         }

         if (!this.field32876.canRead()) {
            throw field32865.createWithContext(this.field32876);
         }
      }

      this.method25200(']');
      return var5;
   }

   private boolean method25199() {
      this.field32876.skipWhitespace();
      if (this.field32876.canRead() && this.field32876.peek() == ',') {
         this.field32876.skip();
         this.field32876.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   private void method25200(char var1) throws CommandSyntaxException {
      this.field32876.skipWhitespace();
      this.field32876.expect(var1);
   }
}
