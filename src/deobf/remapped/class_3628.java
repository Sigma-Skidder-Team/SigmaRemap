package remapped;

import com.mojang.brigadier.exceptions.BuiltInExceptionProvider;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3628 implements BuiltInExceptionProvider {
   private static final Dynamic2CommandExceptionType field_17700 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.double.low", var1, var0)
   );
   private static final Dynamic2CommandExceptionType field_17710 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.double.big", var1, var0)
   );
   private static final Dynamic2CommandExceptionType field_17696 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.float.low", var1, var0)
   );
   private static final Dynamic2CommandExceptionType field_17704 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.float.big", var1, var0)
   );
   private static final Dynamic2CommandExceptionType field_17717 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.integer.low", var1, var0)
   );
   private static final Dynamic2CommandExceptionType field_17714 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.integer.big", var1, var0)
   );
   private static final Dynamic2CommandExceptionType field_17707 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.long.low", var1, var0)
   );
   private static final Dynamic2CommandExceptionType field_17708 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.long.big", var1, var0)
   );
   private static final DynamicCommandExceptionType field_17695 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.literal.incorrect", var0)
   );
   private static final SimpleCommandExceptionType field_17693 = new SimpleCommandExceptionType(new TranslationTextComponent("parsing.quote.expected.start"));
   private static final SimpleCommandExceptionType field_17718 = new SimpleCommandExceptionType(new TranslationTextComponent("parsing.quote.expected.end"));
   private static final DynamicCommandExceptionType field_17698 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("parsing.quote.escape", var0)
   );
   private static final DynamicCommandExceptionType field_17694 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("parsing.bool.invalid", var0)
   );
   private static final DynamicCommandExceptionType field_17703 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("parsing.int.invalid", var0)
   );
   private static final SimpleCommandExceptionType field_17706 = new SimpleCommandExceptionType(new TranslationTextComponent("parsing.int.expected"));
   private static final DynamicCommandExceptionType field_17702 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("parsing.long.invalid", var0)
   );
   private static final SimpleCommandExceptionType field_17712 = new SimpleCommandExceptionType(new TranslationTextComponent("parsing.long.expected"));
   private static final DynamicCommandExceptionType field_17713 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("parsing.double.invalid", var0)
   );
   private static final SimpleCommandExceptionType field_17697 = new SimpleCommandExceptionType(new TranslationTextComponent("parsing.double.expected"));
   private static final DynamicCommandExceptionType field_17701 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("parsing.float.invalid", var0)
   );
   private static final SimpleCommandExceptionType field_17715 = new SimpleCommandExceptionType(new TranslationTextComponent("parsing.float.expected"));
   private static final SimpleCommandExceptionType field_17705 = new SimpleCommandExceptionType(new TranslationTextComponent("parsing.bool.expected"));
   private static final DynamicCommandExceptionType field_17699 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("parsing.expected", var0)
   );
   private static final SimpleCommandExceptionType field_17711 = new SimpleCommandExceptionType(new TranslationTextComponent("command.unknown.command"));
   private static final SimpleCommandExceptionType field_17716 = new SimpleCommandExceptionType(new TranslationTextComponent("command.unknown.argument"));
   private static final SimpleCommandExceptionType field_17709 = new SimpleCommandExceptionType(new TranslationTextComponent("command.expected.separator"));
   private static final DynamicCommandExceptionType field_17692 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("command.exception", var0)
   );

   public Dynamic2CommandExceptionType doubleTooLow() {
      return field_17700;
   }

   public Dynamic2CommandExceptionType doubleTooHigh() {
      return field_17710;
   }

   public Dynamic2CommandExceptionType floatTooLow() {
      return field_17696;
   }

   public Dynamic2CommandExceptionType floatTooHigh() {
      return field_17704;
   }

   public Dynamic2CommandExceptionType integerTooLow() {
      return field_17717;
   }

   public Dynamic2CommandExceptionType integerTooHigh() {
      return field_17714;
   }

   public Dynamic2CommandExceptionType longTooLow() {
      return field_17707;
   }

   public Dynamic2CommandExceptionType longTooHigh() {
      return field_17708;
   }

   public DynamicCommandExceptionType literalIncorrect() {
      return field_17695;
   }

   public SimpleCommandExceptionType readerExpectedStartOfQuote() {
      return field_17693;
   }

   public SimpleCommandExceptionType readerExpectedEndOfQuote() {
      return field_17718;
   }

   public DynamicCommandExceptionType readerInvalidEscape() {
      return field_17698;
   }

   public DynamicCommandExceptionType readerInvalidBool() {
      return field_17694;
   }

   public DynamicCommandExceptionType readerInvalidInt() {
      return field_17703;
   }

   public SimpleCommandExceptionType readerExpectedInt() {
      return field_17706;
   }

   public DynamicCommandExceptionType readerInvalidLong() {
      return field_17702;
   }

   public SimpleCommandExceptionType readerExpectedLong() {
      return field_17712;
   }

   public DynamicCommandExceptionType readerInvalidDouble() {
      return field_17713;
   }

   public SimpleCommandExceptionType readerExpectedDouble() {
      return field_17697;
   }

   public DynamicCommandExceptionType readerInvalidFloat() {
      return field_17701;
   }

   public SimpleCommandExceptionType readerExpectedFloat() {
      return field_17715;
   }

   public SimpleCommandExceptionType readerExpectedBool() {
      return field_17705;
   }

   public DynamicCommandExceptionType readerExpectedSymbol() {
      return field_17699;
   }

   public SimpleCommandExceptionType dispatcherUnknownCommand() {
      return field_17711;
   }

   public SimpleCommandExceptionType dispatcherUnknownArgument() {
      return field_17716;
   }

   public SimpleCommandExceptionType dispatcherExpectedArgumentSeparator() {
      return field_17709;
   }

   public DynamicCommandExceptionType dispatcherParseException() {
      return field_17692;
   }
}
