package remapped;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface class_8773 {
   Collection<String> method_40307();

   default Collection<String> method_40313() {
      return Collections.<String>emptyList();
   }

   Collection<String> method_40330();

   Collection<class_4639> method_40309();

   Stream<class_4639> method_40326();

   CompletableFuture<Suggestions> method_40316(CommandContext<class_8773> var1, SuggestionsBuilder var2);

   default Collection<class_7461> method_40322() {
      return Collections.<class_7461>singleton(class_7461.field_38013);
   }

   default Collection<class_7461> method_40323() {
      return Collections.<class_7461>singleton(class_7461.field_38013);
   }

   Set<class_5621<class_6486>> method_40317();

   class_6322 method_40327();

   boolean method_40314(int var1);

   static <T> void method_40308(Iterable<T> var0, String var1, Function<T, class_4639> var2, Consumer<T> var3) {
      boolean var6 = var1.indexOf(58) > -1;

      for (Object var8 : var0) {
         class_4639 var9 = (class_4639)var2.apply(var8);
         if (!var6) {
            if (method_40329(var1, var9.method_21461()) || var9.method_21461().equals("minecraft") && method_40329(var1, var9.method_21456())) {
               var3.accept(var8);
            }
         } else {
            String var10 = var9.toString();
            if (method_40329(var1, var10)) {
               var3.accept(var8);
            }
         }
      }
   }

   static <T> void method_40312(Iterable<T> var0, String var1, String var2, Function<T, class_4639> var3, Consumer<T> var4) {
      if (!var1.isEmpty()) {
         String var7 = Strings.commonPrefix(var1, var2);
         if (!var7.isEmpty()) {
            String var8 = var1.substring(var7.length());
            method_40308(var0, var8, var3, var4);
         }
      } else {
         var0.forEach(var4);
      }
   }

   static CompletableFuture<Suggestions> method_40325(Iterable<class_4639> var0, SuggestionsBuilder var1, String var2) {
      String var5 = var1.getRemaining().toLowerCase(Locale.ROOT);
      method_40312(var0, var5, var2, var0x -> var0x, var2x -> var1.suggest(var2 + var2x));
      return var1.buildFuture();
   }

   static CompletableFuture<Suggestions> method_40324(Iterable<class_4639> var0, SuggestionsBuilder var1) {
      String var4 = var1.getRemaining().toLowerCase(Locale.ROOT);
      method_40308(var0, var4, var0x -> var0x, var1x -> var1.suggest(var1x.toString()));
      return var1.buildFuture();
   }

   static <T> CompletableFuture<Suggestions> method_40315(Iterable<T> var0, SuggestionsBuilder var1, Function<T, class_4639> var2, Function<T, Message> var3) {
      String var6 = var1.getRemaining().toLowerCase(Locale.ROOT);
      method_40308(var0, var6, var2, var3x -> var1.suggest(((class_4639)var2.apply(var3x)).toString(), (Message)var3.apply(var3x)));
      return var1.buildFuture();
   }

   static CompletableFuture<Suggestions> method_40310(Stream<class_4639> var0, SuggestionsBuilder var1) {
      return method_40324(var0::iterator, var1);
   }

   static <T> CompletableFuture<Suggestions> method_40318(Stream<T> var0, SuggestionsBuilder var1, Function<T, class_4639> var2, Function<T, Message> var3) {
      return method_40315(var0::iterator, var1, var2, var3);
   }

   static CompletableFuture<Suggestions> method_40328(String var0, Collection<class_7461> var1, SuggestionsBuilder var2, Predicate<String> var3) {
      ArrayList var6 = Lists.newArrayList();
      if (!Strings.isNullOrEmpty(var0)) {
         String[] var7 = var0.split(" ");
         if (var7.length != 1) {
            if (var7.length == 2) {
               for (class_7461 var9 : var1) {
                  String var10 = var7[0] + " " + var7[1] + " " + var9.field_38011;
                  if (var3.test(var10)) {
                     var6.add(var10);
                  }
               }
            }
         } else {
            for (class_7461 var14 : var1) {
               String var16 = var7[0] + " " + var14.field_38012 + " " + var14.field_38011;
               if (var3.test(var16)) {
                  var6.add(var7[0] + " " + var14.field_38012);
                  var6.add(var16);
               }
            }
         }
      } else {
         for (class_7461 var13 : var1) {
            String var15 = var13.field_38016 + " " + var13.field_38012 + " " + var13.field_38011;
            if (var3.test(var15)) {
               var6.add(var13.field_38016);
               var6.add(var13.field_38016 + " " + var13.field_38012);
               var6.add(var15);
            }
         }
      }

      return method_40319(var6, var2);
   }

   static CompletableFuture<Suggestions> method_40311(String var0, Collection<class_7461> var1, SuggestionsBuilder var2, Predicate<String> var3) {
      ArrayList var6 = Lists.newArrayList();
      if (!Strings.isNullOrEmpty(var0)) {
         String[] var7 = var0.split(" ");
         if (var7.length == 1) {
            for (class_7461 var9 : var1) {
               String var10 = var7[0] + " " + var9.field_38011;
               if (var3.test(var10)) {
                  var6.add(var10);
               }
            }
         }
      } else {
         for (class_7461 var12 : var1) {
            String var13 = var12.field_38016 + " " + var12.field_38011;
            if (var3.test(var13)) {
               var6.add(var12.field_38016);
               var6.add(var13);
            }
         }
      }

      return method_40319(var6, var2);
   }

   static CompletableFuture<Suggestions> method_40319(Iterable<String> var0, SuggestionsBuilder var1) {
      String var4 = var1.getRemaining().toLowerCase(Locale.ROOT);

      for (String var6 : var0) {
         if (method_40329(var4, var6.toLowerCase(Locale.ROOT))) {
            var1.suggest(var6);
         }
      }

      return var1.buildFuture();
   }

   static CompletableFuture<Suggestions> method_40320(Stream<String> var0, SuggestionsBuilder var1) {
      String var4 = var1.getRemaining().toLowerCase(Locale.ROOT);
      var0.filter(var1x -> method_40329(var4, var1x.toLowerCase(Locale.ROOT))).forEach(var1::suggest);
      return var1.buildFuture();
   }

   static CompletableFuture<Suggestions> method_40321(String[] var0, SuggestionsBuilder var1) {
      String var4 = var1.getRemaining().toLowerCase(Locale.ROOT);

      for (String var8 : var0) {
         if (method_40329(var4, var8.toLowerCase(Locale.ROOT))) {
            var1.suggest(var8);
         }
      }

      return var1.buildFuture();
   }

   static boolean method_40329(String var0, String var1) {
      for (int var5 = 0; !var1.startsWith(var0, var5); var5++) {
         var5 = var1.indexOf(95, var5);
         if (var5 < 0) {
            return false;
         }
      }

      return true;
   }
}
