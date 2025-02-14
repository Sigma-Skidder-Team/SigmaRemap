package net.minecraft.command;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import mapped.DynamicRegistries;
import mapped.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

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

public interface ISuggestionProvider {
   Collection<String> getPlayerNames();

   default Collection<String> getTargetEntity() {
      return Collections.<String>emptyList();
   }

   Collection<String> getTeamNames();

   Collection<ResourceLocation> getSoundResourceLocations();

   Stream<ResourceLocation> getRecipeResourceLocations();

   CompletableFuture<Suggestions> getSuggestionsFromServer(CommandContext<ISuggestionProvider> context, SuggestionsBuilder suggestionsBuilder);

   default Collection<ISuggestionProvider.Coordinates> defaultLocal() {
      return Collections.singleton(Coordinates.DEFAULT_LOCAL);
   }

   default Collection<Coordinates> defaultGlobal() {
      return Collections.<Coordinates>singleton(Coordinates.DEFAULT_GLOBAL);
   }

   Set<RegistryKey<World>> method20135();

   DynamicRegistries method20136();

   boolean method20129(int var1);

   static <T> void method20138(Iterable<T> var0, String var1, Function<T, ResourceLocation> var2, Consumer<T> var3) {
      boolean var6 = var1.indexOf(58) > -1;

      for (T var8 : var0) {
         ResourceLocation var9 = (ResourceLocation)var2.apply(var8);
         if (!var6) {
            if (method20150(var1, var9.getNamespace()) || var9.getNamespace().equals("minecraft") && method20150(var1, var9.getPath())) {
               var3.accept(var8);
            }
         } else {
            String var10 = var9.toString();
            if (method20150(var1, var10)) {
               var3.accept(var8);
            }
         }
      }
   }

   static <T> void method20139(Iterable<T> var0, String var1, String var2, Function<T, ResourceLocation> var3, Consumer<T> var4) {
      if (!var1.isEmpty()) {
         String var7 = Strings.commonPrefix(var1, var2);
         if (!var7.isEmpty()) {
            String var8 = var1.substring(var7.length());
            method20138(var0, var8, var3, var4);
         }
      } else {
         var0.forEach(var4);
      }
   }

   static CompletableFuture<Suggestions> suggestIterable(Iterable<ResourceLocation> var0, SuggestionsBuilder var1, String var2) {
      String var5 = var1.getRemaining().toLowerCase(Locale.ROOT);
      method20139(var0, var5, var2, var0x -> var0x, var2x -> var1.suggest(var2 + var2x));
      return var1.buildFuture();
   }

   static CompletableFuture<Suggestions> suggestIterable(Iterable<ResourceLocation> var0, SuggestionsBuilder var1) {
      String var4 = var1.getRemaining().toLowerCase(Locale.ROOT);
      method20138(var0, var4, var0x -> var0x, var1x -> var1.suggest(var1x.toString()));
      return var1.buildFuture();
   }

   static <T> CompletableFuture<Suggestions> method20142(Iterable<T> var0, SuggestionsBuilder var1, Function<T, ResourceLocation> var2, Function<T, Message> var3) {
      String var6 = var1.getRemaining().toLowerCase(Locale.ROOT);
      method20138(var0, var6, var2, var3x -> var1.suggest(((ResourceLocation)var2.apply(var3x)).toString(), (Message)var3.apply(var3x)));
      return var1.buildFuture();
   }

   static CompletableFuture<Suggestions> method20143(Stream<ResourceLocation> var0, SuggestionsBuilder var1) {
      return suggestIterable(var0::iterator, var1);
   }

   static <T> CompletableFuture<Suggestions> method20144(Stream<T> var0, SuggestionsBuilder var1, Function<T, ResourceLocation> var2, Function<T, Message> var3) {
      return method20142(var0::iterator, var1, var2, var3);
   }

   static CompletableFuture<Suggestions> method20145(String var0, Collection<Coordinates> var1, SuggestionsBuilder var2, Predicate<String> var3) {
      ArrayList var6 = Lists.newArrayList();
      if (!Strings.isNullOrEmpty(var0)) {
         String[] var7 = var0.split(" ");
         if (var7.length != 1) {
            if (var7.length == 2) {
               for (Coordinates var9 : var1) {
                  String var10 = var7[0] + " " + var7[1] + " " + var9.z;
                  if (var3.test(var10)) {
                     var6.add(var10);
                  }
               }
            }
         } else {
            for (Coordinates var14 : var1) {
               String var16 = var7[0] + " " + var14.y + " " + var14.z;
               if (var3.test(var16)) {
                  var6.add(var7[0] + " " + var14.y);
                  var6.add(var16);
               }
            }
         }
      } else {
         for (Coordinates var13 : var1) {
            String var15 = var13.x + " " + var13.y + " " + var13.z;
            if (var3.test(var15)) {
               var6.add(var13.x);
               var6.add(var13.x + " " + var13.y);
               var6.add(var15);
            }
         }
      }

      return suggest(var6, var2);
   }

   static CompletableFuture<Suggestions> func_211269_a(String var0, Collection<Coordinates> var1, SuggestionsBuilder var2, Predicate<String> var3) {
      ArrayList var6 = Lists.newArrayList();
      if (!Strings.isNullOrEmpty(var0)) {
         String[] var7 = var0.split(" ");
         if (var7.length == 1) {
            for (Coordinates var9 : var1) {
               String var10 = var7[0] + " " + var9.z;
               if (var3.test(var10)) {
                  var6.add(var10);
               }
            }
         }
      } else {
         for (Coordinates var12 : var1) {
            String var13 = var12.x + " " + var12.z;
            if (var3.test(var13)) {
               var6.add(var12.x);
               var6.add(var13);
            }
         }
      }

      return suggest(var6, var2);
   }

   static CompletableFuture<Suggestions> suggest(Iterable<String> var0, SuggestionsBuilder var1) {
      String var4 = var1.getRemaining().toLowerCase(Locale.ROOT);

      for (String var6 : var0) {
         if (method20150(var4, var6.toLowerCase(Locale.ROOT))) {
            var1.suggest(var6);
         }
      }

      return var1.buildFuture();
   }

   static CompletableFuture<Suggestions> suggest(Stream<String> var0, SuggestionsBuilder var1) {
      String var4 = var1.getRemaining().toLowerCase(Locale.ROOT);
      var0.filter(var1x -> method20150(var4, var1x.toLowerCase(Locale.ROOT))).forEach(var1::suggest);
      return var1.buildFuture();
   }

   static CompletableFuture<Suggestions> suggest(String[] var0, SuggestionsBuilder var1) {
      String var4 = var1.getRemaining().toLowerCase(Locale.ROOT);

      for (String var8 : var0) {
         if (method20150(var4, var8.toLowerCase(Locale.ROOT))) {
            var1.suggest(var8);
         }
      }

      return var1.buildFuture();
   }

   static boolean method20150(String var0, String var1) {
      for (int var5 = 0; !var1.startsWith(var0, var5); var5++) {
         var5 = var1.indexOf(95, var5);
         if (var5 < 0) {
            return false;
         }
      }

      return true;
   }

   class Coordinates {
      public static final ISuggestionProvider.Coordinates DEFAULT_LOCAL = new ISuggestionProvider.Coordinates("^", "^", "^");
      public static final ISuggestionProvider.Coordinates DEFAULT_GLOBAL = new ISuggestionProvider.Coordinates("~", "~", "~");
      public final String x;
      public final String y;
      public final String z;

      public Coordinates(String xIn, String yIn, String zIn)
      {
         this.x = xIn;
         this.y = yIn;
         this.z = zIn;
      }
   }
}
