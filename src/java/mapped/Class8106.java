package mapped;

import com.mojang.brigadier.exceptions.BuiltInExceptionProvider;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8106 implements BuiltInExceptionProvider {
   private static final Dynamic2CommandExceptionType field34833 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.double.low", var1, var0)
   );
   private static final Dynamic2CommandExceptionType field34834 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.double.big", var1, var0)
   );
   private static final Dynamic2CommandExceptionType field34835 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.float.low", var1, var0)
   );
   private static final Dynamic2CommandExceptionType field34836 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.float.big", var1, var0)
   );
   private static final Dynamic2CommandExceptionType field34837 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.integer.low", var1, var0)
   );
   private static final Dynamic2CommandExceptionType field34838 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.integer.big", var1, var0)
   );
   private static final Dynamic2CommandExceptionType field34839 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.long.low", var1, var0)
   );
   private static final Dynamic2CommandExceptionType field34840 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.long.big", var1, var0)
   );
   private static final DynamicCommandExceptionType field34841 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.literal.incorrect", var0)
   );
   private static final SimpleCommandExceptionType field34842 = new SimpleCommandExceptionType(new TranslationTextComponent("parsing.quote.expected.start"));
   private static final SimpleCommandExceptionType field34843 = new SimpleCommandExceptionType(new TranslationTextComponent("parsing.quote.expected.end"));
   private static final DynamicCommandExceptionType field34844 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("parsing.quote.escape", var0)
   );
   private static final DynamicCommandExceptionType field34845 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("parsing.bool.invalid", var0)
   );
   private static final DynamicCommandExceptionType field34846 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("parsing.int.invalid", var0)
   );
   private static final SimpleCommandExceptionType field34847 = new SimpleCommandExceptionType(new TranslationTextComponent("parsing.int.expected"));
   private static final DynamicCommandExceptionType field34848 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("parsing.long.invalid", var0)
   );
   private static final SimpleCommandExceptionType field34849 = new SimpleCommandExceptionType(new TranslationTextComponent("parsing.long.expected"));
   private static final DynamicCommandExceptionType field34850 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("parsing.double.invalid", var0)
   );
   private static final SimpleCommandExceptionType field34851 = new SimpleCommandExceptionType(new TranslationTextComponent("parsing.double.expected"));
   private static final DynamicCommandExceptionType field34852 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("parsing.float.invalid", var0)
   );
   private static final SimpleCommandExceptionType field34853 = new SimpleCommandExceptionType(new TranslationTextComponent("parsing.float.expected"));
   private static final SimpleCommandExceptionType field34854 = new SimpleCommandExceptionType(new TranslationTextComponent("parsing.bool.expected"));
   private static final DynamicCommandExceptionType field34855 = new DynamicCommandExceptionType(var0 -> new TranslationTextComponent("parsing.expected", var0));
   private static final SimpleCommandExceptionType field34856 = new SimpleCommandExceptionType(new TranslationTextComponent("command.unknown.command"));
   private static final SimpleCommandExceptionType field34857 = new SimpleCommandExceptionType(new TranslationTextComponent("command.unknown.argument"));
   private static final SimpleCommandExceptionType field34858 = new SimpleCommandExceptionType(new TranslationTextComponent("command.expected.separator"));
   private static final DynamicCommandExceptionType field34859 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("command.exception", var0)
   );

   public Dynamic2CommandExceptionType doubleTooLow() {
      return field34833;
   }

   public Dynamic2CommandExceptionType doubleTooHigh() {
      return field34834;
   }

   public Dynamic2CommandExceptionType floatTooLow() {
      return field34835;
   }

   public Dynamic2CommandExceptionType floatTooHigh() {
      return field34836;
   }

   public Dynamic2CommandExceptionType integerTooLow() {
      return field34837;
   }

   public Dynamic2CommandExceptionType integerTooHigh() {
      return field34838;
   }

   public Dynamic2CommandExceptionType longTooLow() {
      return field34839;
   }

   public Dynamic2CommandExceptionType longTooHigh() {
      return field34840;
   }

   public DynamicCommandExceptionType literalIncorrect() {
      return field34841;
   }

   public SimpleCommandExceptionType readerExpectedStartOfQuote() {
      return field34842;
   }

   public SimpleCommandExceptionType readerExpectedEndOfQuote() {
      return field34843;
   }

   public DynamicCommandExceptionType readerInvalidEscape() {
      return field34844;
   }

   public DynamicCommandExceptionType readerInvalidBool() {
      return field34845;
   }

   public DynamicCommandExceptionType readerInvalidInt() {
      return field34846;
   }

   public SimpleCommandExceptionType readerExpectedInt() {
      return field34847;
   }

   public DynamicCommandExceptionType readerInvalidLong() {
      return field34848;
   }

   public SimpleCommandExceptionType readerExpectedLong() {
      return field34849;
   }

   public DynamicCommandExceptionType readerInvalidDouble() {
      return field34850;
   }

   public SimpleCommandExceptionType readerExpectedDouble() {
      return field34851;
   }

   public DynamicCommandExceptionType readerInvalidFloat() {
      return field34852;
   }

   public SimpleCommandExceptionType readerExpectedFloat() {
      return field34853;
   }

   public SimpleCommandExceptionType readerExpectedBool() {
      return field34854;
   }

   public DynamicCommandExceptionType readerExpectedSymbol() {
      return field34855;
   }

   public SimpleCommandExceptionType dispatcherUnknownCommand() {
      return field34856;
   }

   public SimpleCommandExceptionType dispatcherUnknownArgument() {
      return field34857;
   }

   public SimpleCommandExceptionType dispatcherExpectedArgumentSeparator() {
      return field34858;
   }

   public DynamicCommandExceptionType dispatcherParseException() {
      return field34859;
   }
}
