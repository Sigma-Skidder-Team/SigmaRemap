package remapped;

import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import javax.annotation.Nullable;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9599 {
   public static final SimpleCommandExceptionType field_48931 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.item.tag.disallowed"));
   public static final DynamicCommandExceptionType field_48939 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.item.id.invalid", var0)
   );
   private static final BiFunction<SuggestionsBuilder, ITagCollection<class_2451>, CompletableFuture<Suggestions>> field_48941 = (var0, var1) -> var0.buildFuture();
   private final StringReader field_48936;
   private final boolean field_48933;
   private final Map<class_5019<?>, Comparable<?>> field_48932 = Maps.newHashMap();
   private class_2451 field_48935;
   private CompoundNBT field_48938;
   private Identifier field_48930 = new Identifier("");
   private int field_48940;
   private BiFunction<SuggestionsBuilder, ITagCollection<class_2451>, CompletableFuture<Suggestions>> field_48937 = field_48941;

   public class_9599(StringReader var1, boolean var2) {
      this.field_48936 = var1;
      this.field_48933 = var2;
   }

   public class_2451 method_44342() {
      return this.field_48935;
   }

   @Nullable
   public CompoundNBT method_44338() {
      return this.field_48938;
   }

   public Identifier method_44334() {
      return this.field_48930;
   }

   public void method_44337() throws CommandSyntaxException {
      int var3 = this.field_48936.getCursor();
      Identifier var4 = Identifier.method_21464(this.field_48936);
      this.field_48935 = class_8669.field_44382.method_39794(var4).orElseThrow(() -> {
         this.field_48936.setCursor(var3);
         return field_48939.createWithContext(this.field_48936, var4.toString());
      });
   }

   public void method_44343() throws CommandSyntaxException {
      if (this.field_48933) {
         this.field_48937 = this::method_44340;
         this.field_48936.expect('#');
         this.field_48940 = this.field_48936.getCursor();
         this.field_48930 = Identifier.method_21464(this.field_48936);
      } else {
         throw field_48931.create();
      }
   }

   public void method_44345() throws CommandSyntaxException {
      this.field_48938 = new class_2392(this.field_48936).method_10905();
   }

   public class_9599 method_44335() throws CommandSyntaxException {
      this.field_48937 = this::method_44344;
      if (this.field_48936.canRead() && this.field_48936.peek() == '#') {
         this.method_44343();
      } else {
         this.method_44337();
         this.field_48937 = this::method_44341;
      }

      if (this.field_48936.canRead() && this.field_48936.peek() == '{') {
         this.field_48937 = field_48941;
         this.method_44345();
      }

      return this;
   }

   private CompletableFuture<Suggestions> method_44341(SuggestionsBuilder var1, ITagCollection<class_2451> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf('{'));
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method_44340(SuggestionsBuilder var1, ITagCollection<class_2451> var2) {
      return class_8773.method_40324(var2.method_43141(), var1.createOffset(this.field_48940));
   }

   private CompletableFuture<Suggestions> method_44344(SuggestionsBuilder var1, ITagCollection<class_2451> var2) {
      if (this.field_48933) {
         class_8773.method_40325(var2.method_43141(), var1, String.valueOf('#'));
      }

      return class_8773.method_40324(class_8669.field_44382.method_39805(), var1);
   }

   public CompletableFuture<Suggestions> method_44336(SuggestionsBuilder var1, ITagCollection<class_2451> var2) {
      return this.field_48937.apply(var1.createOffset(this.field_48936.getCursor()), var2);
   }
}
