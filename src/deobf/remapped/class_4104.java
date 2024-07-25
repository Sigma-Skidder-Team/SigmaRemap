package remapped;

import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import javax.annotation.Nullable;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4104 {
   public static final SimpleCommandExceptionType field_19995 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.block.tag.disallowed"));
   public static final DynamicCommandExceptionType field_19982 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.block.id.invalid", var0)
   );
   public static final Dynamic2CommandExceptionType field_19985 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.block.property.unknown", var0, var1)
   );
   public static final Dynamic2CommandExceptionType field_19986 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.block.property.duplicate", var1, var0)
   );
   public static final Dynamic3CommandExceptionType field_19979 = new Dynamic3CommandExceptionType(
      (var0, var1, var2) -> new TranslationTextComponent("argument.block.property.invalid", var0, var2, var1)
   );
   public static final Dynamic2CommandExceptionType field_19994 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.block.property.novalue", var0, var1)
   );
   public static final SimpleCommandExceptionType field_19977 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.block.property.unclosed"));
   private static final BiFunction<SuggestionsBuilder, class_9349<class_6414>, CompletableFuture<Suggestions>> field_19987 = (var0, var1) -> var0.buildFuture();
   private final StringReader field_19992;
   private final boolean field_19984;
   private final Map<class_5019<?>, Comparable<?>> field_19989 = Maps.newHashMap();
   private final Map<String, String> field_19981 = Maps.newHashMap();
   private Identifier field_19980 = new Identifier("");
   private class_8021<class_6414, class_2522> field_19978;
   private class_2522 field_19988;
   private class_5734 field_19983;
   private Identifier field_19976 = new Identifier("");
   private int field_19991;
   private BiFunction<SuggestionsBuilder, class_9349<class_6414>, CompletableFuture<Suggestions>> field_19990 = field_19987;

   public class_4104(StringReader var1, boolean var2) {
      this.field_19992 = var1;
      this.field_19984 = var2;
   }

   public Map<class_5019<?>, Comparable<?>> method_18985() {
      return this.field_19989;
   }

   @Nullable
   public class_2522 method_18967() {
      return this.field_19988;
   }

   @Nullable
   public class_5734 method_18958() {
      return this.field_19983;
   }

   @Nullable
   public Identifier method_18971() {
      return this.field_19976;
   }

   public class_4104 method_18973(boolean var1) throws CommandSyntaxException {
      this.field_19990 = this::method_18960;
      if (this.field_19992.canRead() && this.field_19992.peek() == '#') {
         this.method_18975();
         this.field_19990 = this::method_18964;
         if (this.field_19992.canRead() && this.field_19992.peek() == '[') {
            this.method_18961();
            this.field_19990 = this::method_18968;
         }
      } else {
         this.method_18979();
         this.field_19990 = this::method_18965;
         if (this.field_19992.canRead() && this.field_19992.peek() == '[') {
            this.method_18983();
            this.field_19990 = this::method_18968;
         }
      }

      if (var1 && this.field_19992.canRead() && this.field_19992.peek() == '{') {
         this.field_19990 = field_19987;
         this.method_18963();
      }

      return this;
   }

   private CompletableFuture<Suggestions> method_18957(SuggestionsBuilder var1, class_9349<class_6414> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf(']'));
      }

      return this.method_18970(var1, var2);
   }

   private CompletableFuture<Suggestions> method_18977(SuggestionsBuilder var1, class_9349<class_6414> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf(']'));
      }

      return this.method_18962(var1, var2);
   }

   private CompletableFuture<Suggestions> method_18970(SuggestionsBuilder var1, class_9349<class_6414> var2) {
      String var5 = var1.getRemaining().toLowerCase(Locale.ROOT);

      for (class_5019 var7 : this.field_19988.method_10310()) {
         if (!this.field_19989.containsKey(var7) && var7.method_23109().startsWith(var5)) {
            var1.suggest(var7.method_23109() + '=');
         }
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method_18962(SuggestionsBuilder var1, class_9349<class_6414> var2) {
      String var5 = var1.getRemaining().toLowerCase(Locale.ROOT);
      if (this.field_19976 != null && !this.field_19976.method_21456().isEmpty()) {
         class_2307 var6 = var2.method_43140(this.field_19976);
         if (var6 != null) {
            for (class_6414 var8 : var6.method_10608()) {
               for (class_5019 var10 : var8.method_29306().method_36444()) {
                  if (!this.field_19981.containsKey(var10.method_23109()) && var10.method_23109().startsWith(var5)) {
                     var1.suggest(var10.method_23109() + '=');
                  }
               }
            }
         }
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method_18968(SuggestionsBuilder var1, class_9349<class_6414> var2) {
      if (var1.getRemaining().isEmpty() && this.method_18980(var2)) {
         var1.suggest(String.valueOf('{'));
      }

      return var1.buildFuture();
   }

   private boolean method_18980(class_9349<class_6414> var1) {
      if (this.field_19988 != null) {
         return this.field_19988.method_8360().method_10802();
      } else {
         if (this.field_19976 != null) {
            class_2307 var4 = var1.method_43140(this.field_19976);
            if (var4 != null) {
               for (class_6414 var6 : var4.method_10608()) {
                  if (var6.method_10802()) {
                     return true;
                  }
               }
            }
         }

         return false;
      }
   }

   private CompletableFuture<Suggestions> method_18981(SuggestionsBuilder var1, class_9349<class_6414> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf('='));
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method_18982(SuggestionsBuilder var1, class_9349<class_6414> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf(']'));
      }

      if (var1.getRemaining().isEmpty() && this.field_19989.size() < this.field_19988.method_10310().size()) {
         var1.suggest(String.valueOf(','));
      }

      return var1.buildFuture();
   }

   private static <T extends Comparable<T>> SuggestionsBuilder method_18972(SuggestionsBuilder var0, class_5019<T> var1) {
      for (Comparable var5 : var1.method_23105()) {
         if (!(var5 instanceof Integer)) {
            var0.suggest(var1.method_23110((T)var5));
         } else {
            var0.suggest((Integer)var5);
         }
      }

      return var0;
   }

   private CompletableFuture<Suggestions> method_18966(SuggestionsBuilder var1, class_9349<class_6414> var2, String var3) {
      boolean var6 = false;
      if (this.field_19976 != null && !this.field_19976.method_21456().isEmpty()) {
         class_2307 var7 = var2.method_43140(this.field_19976);
         if (var7 != null) {
            for (class_6414 var9 : var7.method_10608()) {
               class_5019 var10 = var9.method_29306().method_36440(var3);
               if (var10 != null) {
                  method_18972(var1, var10);
               }

               if (!var6) {
                  for (class_5019 var12 : var9.method_29306().method_36444()) {
                     if (!this.field_19981.containsKey(var12.method_23109())) {
                        var6 = true;
                        break;
                     }
                  }
               }
            }
         }
      }

      if (var6) {
         var1.suggest(String.valueOf(','));
      }

      var1.suggest(String.valueOf(']'));
      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method_18964(SuggestionsBuilder var1, class_9349<class_6414> var2) {
      if (var1.getRemaining().isEmpty()) {
         class_2307 var5 = var2.method_43140(this.field_19976);
         if (var5 != null) {
            boolean var6 = false;
            boolean var7 = false;

            for (class_6414 var9 : var5.method_10608()) {
               var6 |= !var9.method_29306().method_36444().isEmpty();
               var7 |= var9.method_10802();
               if (var6 && var7) {
                  break;
               }
            }

            if (var6) {
               var1.suggest(String.valueOf('['));
            }

            if (var7) {
               var1.suggest(String.valueOf('{'));
            }
         }
      }

      return this.method_18976(var1, var2);
   }

   private CompletableFuture<Suggestions> method_18965(SuggestionsBuilder var1, class_9349<class_6414> var2) {
      if (var1.getRemaining().isEmpty()) {
         if (!this.field_19988.method_8360().method_29306().method_36444().isEmpty()) {
            var1.suggest(String.valueOf('['));
         }

         if (this.field_19988.method_8360().method_10802()) {
            var1.suggest(String.valueOf('{'));
         }
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method_18976(SuggestionsBuilder var1, class_9349<class_6414> var2) {
      return class_8773.method_40324(var2.method_43141(), var1.createOffset(this.field_19991).add(var1));
   }

   private CompletableFuture<Suggestions> method_18960(SuggestionsBuilder var1, class_9349<class_6414> var2) {
      if (this.field_19984) {
         class_8773.method_40325(var2.method_43141(), var1, String.valueOf('#'));
      }

      class_8773.method_40324(class_8669.field_44462.method_39805(), var1);
      return var1.buildFuture();
   }

   public void method_18979() throws CommandSyntaxException {
      int var3 = this.field_19992.getCursor();
      this.field_19980 = Identifier.method_21464(this.field_19992);
      class_6414 var4 = class_8669.field_44462.method_39794(this.field_19980).orElseThrow(() -> {
         this.field_19992.setCursor(var3);
         return field_19982.createWithContext(this.field_19992, this.field_19980.toString());
      });
      this.field_19978 = var4.method_29306();
      this.field_19988 = var4.method_29260();
   }

   public void method_18975() throws CommandSyntaxException {
      if (this.field_19984) {
         this.field_19990 = this::method_18976;
         this.field_19992.expect('#');
         this.field_19991 = this.field_19992.getCursor();
         this.field_19976 = Identifier.method_21464(this.field_19992);
      } else {
         throw field_19995.create();
      }
   }

   public void method_18983() throws CommandSyntaxException {
      this.field_19992.skip();
      this.field_19990 = this::method_18957;
      this.field_19992.skipWhitespace();

      while (this.field_19992.canRead() && this.field_19992.peek() != ']') {
         this.field_19992.skipWhitespace();
         int var3 = this.field_19992.getCursor();
         String var4 = this.field_19992.readString();
         class_5019 var5 = this.field_19978.method_36440(var4);
         if (var5 == null) {
            this.field_19992.setCursor(var3);
            throw field_19985.createWithContext(this.field_19992, this.field_19980.toString(), var4);
         }

         if (this.field_19989.containsKey(var5)) {
            this.field_19992.setCursor(var3);
            throw field_19986.createWithContext(this.field_19992, this.field_19980.toString(), var4);
         }

         this.field_19992.skipWhitespace();
         this.field_19990 = this::method_18981;
         if (!this.field_19992.canRead() || this.field_19992.peek() != '=') {
            throw field_19994.createWithContext(this.field_19992, this.field_19980.toString(), var4);
         }

         this.field_19992.skip();
         this.field_19992.skipWhitespace();
         this.field_19990 = (var1, var2) -> method_18972(var1, var5).buildFuture();
         int var6 = this.field_19992.getCursor();
         this.method_18978(var5, this.field_19992.readString(), var6);
         this.field_19990 = this::method_18982;
         this.field_19992.skipWhitespace();
         if (this.field_19992.canRead()) {
            if (this.field_19992.peek() != ',') {
               if (this.field_19992.peek() != ']') {
                  throw field_19977.createWithContext(this.field_19992);
               }
               break;
            }

            this.field_19992.skip();
            this.field_19990 = this::method_18970;
         }
      }

      if (!this.field_19992.canRead()) {
         throw field_19977.createWithContext(this.field_19992);
      } else {
         this.field_19992.skip();
      }
   }

   public void method_18961() throws CommandSyntaxException {
      this.field_19992.skip();
      this.field_19990 = this::method_18977;
      int var3 = -1;
      this.field_19992.skipWhitespace();

      while (this.field_19992.canRead() && this.field_19992.peek() != ']') {
         this.field_19992.skipWhitespace();
         int var4 = this.field_19992.getCursor();
         String var5 = this.field_19992.readString();
         if (this.field_19981.containsKey(var5)) {
            this.field_19992.setCursor(var4);
            throw field_19986.createWithContext(this.field_19992, this.field_19980.toString(), var5);
         }

         this.field_19992.skipWhitespace();
         if (!this.field_19992.canRead() || this.field_19992.peek() != '=') {
            this.field_19992.setCursor(var4);
            throw field_19994.createWithContext(this.field_19992, this.field_19980.toString(), var5);
         }

         this.field_19992.skip();
         this.field_19992.skipWhitespace();
         this.field_19990 = (var2, var3x) -> this.method_18966(var2, var3x, var5);
         var3 = this.field_19992.getCursor();
         String var6 = this.field_19992.readString();
         this.field_19981.put(var5, var6);
         this.field_19992.skipWhitespace();
         if (this.field_19992.canRead()) {
            var3 = -1;
            if (this.field_19992.peek() != ',') {
               if (this.field_19992.peek() != ']') {
                  throw field_19977.createWithContext(this.field_19992);
               }
               break;
            }

            this.field_19992.skip();
            this.field_19990 = this::method_18962;
         }
      }

      if (!this.field_19992.canRead()) {
         if (var3 >= 0) {
            this.field_19992.setCursor(var3);
         }

         throw field_19977.createWithContext(this.field_19992);
      } else {
         this.field_19992.skip();
      }
   }

   public void method_18963() throws CommandSyntaxException {
      this.field_19983 = new class_2392(this.field_19992).method_10905();
   }

   private <T extends Comparable<T>> void method_18978(class_5019<T> var1, String var2, int var3) throws CommandSyntaxException {
      Optional var6 = var1.method_23108(var2);
      if (!var6.isPresent()) {
         this.field_19992.setCursor(var3);
         throw field_19979.createWithContext(this.field_19992, this.field_19980.toString(), var1.method_23109(), var2);
      } else {
         this.field_19988 = this.field_19988.method_10308(var1, (Comparable)var6.get());
         this.field_19989.put(var1, (Comparable<?>)var6.get());
      }
   }

   public static String toString(class_2522 var0) {
      StringBuilder var3 = new StringBuilder(class_8669.field_44462.method_39797(var0.method_8360()).toString());
      if (!var0.method_10310().isEmpty()) {
         var3.append('[');
         boolean var4 = false;

         for (UnmodifiableIterator var5 = var0.method_10316().entrySet().iterator(); var5.hasNext(); var4 = true) {
            Entry var6 = (Entry)var5.next();
            if (var4) {
               var3.append(',');
            }

            method_18984(var3, (class_5019)var6.getKey(), (Comparable<?>)var6.getValue());
         }

         var3.append(']');
      }

      return var3.toString();
   }

   private static <T extends Comparable<T>> void method_18984(StringBuilder var0, class_5019<T> var1, Comparable<?> var2) {
      var0.append(var1.method_23109());
      var0.append('=');
      var0.append(var1.method_23110((T)var2));
   }

   public CompletableFuture<Suggestions> method_18969(SuggestionsBuilder var1, class_9349<class_6414> var2) {
      return this.field_19990.apply(var1.createOffset(this.field_19992.getCursor()), var2);
   }

   public Map<String, String> method_18974() {
      return this.field_19981;
   }
}
