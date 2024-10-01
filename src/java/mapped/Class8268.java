package mapped;

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

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8268 {
   public static final SimpleCommandExceptionType field35535 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.block.tag.disallowed"));
   public static final DynamicCommandExceptionType field35536 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.block.id.invalid", var0)
   );
   public static final Dynamic2CommandExceptionType field35537 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.block.property.unknown", var0, var1)
   );
   public static final Dynamic2CommandExceptionType field35538 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.block.property.duplicate", var1, var0)
   );
   public static final Dynamic3CommandExceptionType field35539 = new Dynamic3CommandExceptionType(
      (var0, var1, var2) -> new TranslationTextComponent("argument.block.property.invalid", var0, var2, var1)
   );
   public static final Dynamic2CommandExceptionType field35540 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.block.property.novalue", var0, var1)
   );
   public static final SimpleCommandExceptionType field35541 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.block.property.unclosed"));
   private static final BiFunction<SuggestionsBuilder, Class7984<Block>, CompletableFuture<Suggestions>> field35542 = (var0, var1) -> var0.buildFuture();
   private final StringReader field35543;
   private final boolean field35544;
   private final Map<Property<?>, Comparable<?>> field35545 = Maps.newHashMap();
   private final Map<String, String> field35546 = Maps.newHashMap();
   private ResourceLocation field35547 = new ResourceLocation("");
   private StateContainer<Block, BlockState> field35548;
   private BlockState field35549;
   private CompoundNBT field35550;
   private ResourceLocation field35551 = new ResourceLocation("");
   private int field35552;
   private BiFunction<SuggestionsBuilder, Class7984<Block>, CompletableFuture<Suggestions>> field35553 = field35542;

   public Class8268(StringReader var1, boolean var2) {
      this.field35543 = var1;
      this.field35544 = var2;
   }

   public Map<Property<?>, Comparable<?>> method28836() {
      return this.field35545;
   }

   @Nullable
   public BlockState method28837() {
      return this.field35549;
   }

   @Nullable
   public CompoundNBT method28838() {
      return this.field35550;
   }

   @Nullable
   public ResourceLocation method28839() {
      return this.field35551;
   }

   public Class8268 method28840(boolean var1) throws CommandSyntaxException {
      this.field35553 = this::method28854;
      if (this.field35543.canRead() && this.field35543.peek() == '#') {
         this.method28856();
         this.field35553 = this::method28851;
         if (this.field35543.canRead() && this.field35543.peek() == '[') {
            this.method28858();
            this.field35553 = this::method28845;
         }
      } else {
         this.method28855();
         this.field35553 = this::method28852;
         if (this.field35543.canRead() && this.field35543.peek() == '[') {
            this.method28857();
            this.field35553 = this::method28845;
         }
      }

      if (var1 && this.field35543.canRead() && this.field35543.peek() == '{') {
         this.field35553 = field35542;
         this.method28859();
      }

      return this;
   }

   private CompletableFuture<Suggestions> method28841(SuggestionsBuilder var1, Class7984<Block> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf(']'));
      }

      return this.method28843(var1, var2);
   }

   private CompletableFuture<Suggestions> method28842(SuggestionsBuilder var1, Class7984<Block> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf(']'));
      }

      return this.method28844(var1, var2);
   }

   private CompletableFuture<Suggestions> method28843(SuggestionsBuilder var1, Class7984<Block> var2) {
      String var5 = var1.getRemaining().toLowerCase(Locale.ROOT);

      for (Property var7 : this.field35549.method23461()) {
         if (!this.field35545.containsKey(var7) && var7.method30472().startsWith(var5)) {
            var1.suggest(var7.method30472() + '=');
         }
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method28844(SuggestionsBuilder var1, Class7984<Block> var2) {
      String var5 = var1.getRemaining().toLowerCase(Locale.ROOT);
      if (this.field35551 != null && !this.field35551.getPath().isEmpty()) {
         ITag<Block> var6 = var2.get(this.field35551);
         if (var6 != null) {
            for (Block var8 : var6.getAllElements()) {
               for (Property var10 : var8.getStateContainer().method35395()) {
                  if (!this.field35546.containsKey(var10.method30472()) && var10.method30472().startsWith(var5)) {
                     var1.suggest(var10.method30472() + '=');
                  }
               }
            }
         }
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method28845(SuggestionsBuilder var1, Class7984<Block> var2) {
      if (var1.getRemaining().isEmpty() && this.method28846(var2)) {
         var1.suggest(String.valueOf('{'));
      }

      return var1.buildFuture();
   }

   private boolean method28846(Class7984<Block> var1) {
      if (this.field35549 != null) {
         return this.field35549.getBlock().isTileEntityProvider();
      } else {
         if (this.field35551 != null) {
            ITag<Block> var4 = var1.get(this.field35551);
            if (var4 != null) {
               for (Block var6 : var4.getAllElements()) {
                  if (var6.isTileEntityProvider()) {
                     return true;
                  }
               }
            }
         }

         return false;
      }
   }

   private CompletableFuture<Suggestions> method28847(SuggestionsBuilder var1, Class7984<Block> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf('='));
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method28848(SuggestionsBuilder var1, Class7984<Block> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf(']'));
      }

      if (var1.getRemaining().isEmpty() && this.field35545.size() < this.field35549.method23461().size()) {
         var1.suggest(String.valueOf(','));
      }

      return var1.buildFuture();
   }

   private static <T extends Comparable<T>> SuggestionsBuilder method28849(SuggestionsBuilder var0, Property<T> var1) {
      for (Comparable var5 : var1.method30474()) {
         if (!(var5 instanceof Integer)) {
            var0.suggest(var1.method30475((T)var5));
         } else {
            var0.suggest((Integer)var5);
         }
      }

      return var0;
   }

   private CompletableFuture<Suggestions> method28850(SuggestionsBuilder var1, Class7984<Block> var2, String var3) {
      boolean var6 = false;
      if (this.field35551 != null && !this.field35551.getPath().isEmpty()) {
         ITag<Block> var7 = var2.get(this.field35551);
         if (var7 != null) {
            for (Block var9 : var7.getAllElements()) {
               Property var10 = var9.getStateContainer().method35396(var3);
               if (var10 != null) {
                  method28849(var1, var10);
               }

               if (!var6) {
                  for (Property var12 : var9.getStateContainer().method35395()) {
                     if (!this.field35546.containsKey(var12.method30472())) {
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

   private CompletableFuture<Suggestions> method28851(SuggestionsBuilder var1, Class7984<Block> var2) {
      if (var1.getRemaining().isEmpty()) {
         ITag<Block> var5 = var2.get(this.field35551);
         if (var5 != null) {
            boolean var6 = false;
            boolean var7 = false;

            for (Block var9 : var5.getAllElements()) {
               var6 |= !var9.getStateContainer().method35395().isEmpty();
               var7 |= var9.isTileEntityProvider();
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

      return this.method28853(var1, var2);
   }

   private CompletableFuture<Suggestions> method28852(SuggestionsBuilder var1, Class7984<Block> var2) {
      if (var1.getRemaining().isEmpty()) {
         if (!this.field35549.getBlock().getStateContainer().method35395().isEmpty()) {
            var1.suggest(String.valueOf('['));
         }

         if (this.field35549.getBlock().isTileEntityProvider()) {
            var1.suggest(String.valueOf('{'));
         }
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method28853(SuggestionsBuilder var1, Class7984<Block> var2) {
      return Class6618.method20141(var2.method27137(), var1.createOffset(this.field35552).add(var1));
   }

   private CompletableFuture<Suggestions> method28854(SuggestionsBuilder var1, Class7984<Block> var2) {
      if (this.field35544) {
         Class6618.method20140(var2.method27137(), var1, String.valueOf('#'));
      }

      Class6618.method20141(Registry.BLOCK.method9190(), var1);
      return var1.buildFuture();
   }

   public void method28855() throws CommandSyntaxException {
      int var3 = this.field35543.getCursor();
      this.field35547 = ResourceLocation.method8294(this.field35543);
      Block var4 = Registry.BLOCK.method9187(this.field35547).orElseThrow(() -> {
         this.field35543.setCursor(var3);
         return field35536.createWithContext(this.field35543, this.field35547.toString());
      });
      this.field35548 = var4.getStateContainer();
      this.field35549 = var4.getDefaultState();
   }

   public void method28856() throws CommandSyntaxException {
      if (this.field35544) {
         this.field35553 = this::method28853;
         this.field35543.expect('#');
         this.field35552 = this.field35543.getCursor();
         this.field35551 = ResourceLocation.method8294(this.field35543);
      } else {
         throw field35535.create();
      }
   }

   public void method28857() throws CommandSyntaxException {
      this.field35543.skip();
      this.field35553 = this::method28841;
      this.field35543.skipWhitespace();

      while (this.field35543.canRead() && this.field35543.peek() != ']') {
         this.field35543.skipWhitespace();
         int var3 = this.field35543.getCursor();
         String var4 = this.field35543.readString();
         Property var5 = this.field35548.method35396(var4);
         if (var5 == null) {
            this.field35543.setCursor(var3);
            throw field35537.createWithContext(this.field35543, this.field35547.toString(), var4);
         }

         if (this.field35545.containsKey(var5)) {
            this.field35543.setCursor(var3);
            throw field35538.createWithContext(this.field35543, this.field35547.toString(), var4);
         }

         this.field35543.skipWhitespace();
         this.field35553 = this::method28847;
         if (!this.field35543.canRead() || this.field35543.peek() != '=') {
            throw field35540.createWithContext(this.field35543, this.field35547.toString(), var4);
         }

         this.field35543.skip();
         this.field35543.skipWhitespace();
         this.field35553 = (var1, var2) -> method28849(var1, var5).buildFuture();
         int var6 = this.field35543.getCursor();
         this.method28860(var5, this.field35543.readString(), var6);
         this.field35553 = this::method28848;
         this.field35543.skipWhitespace();
         if (this.field35543.canRead()) {
            if (this.field35543.peek() != ',') {
               if (this.field35543.peek() != ']') {
                  throw field35541.createWithContext(this.field35543);
               }
               break;
            }

            this.field35543.skip();
            this.field35553 = this::method28843;
         }
      }

      if (!this.field35543.canRead()) {
         throw field35541.createWithContext(this.field35543);
      } else {
         this.field35543.skip();
      }
   }

   public void method28858() throws CommandSyntaxException {
      this.field35543.skip();
      this.field35553 = this::method28842;
      int var3 = -1;
      this.field35543.skipWhitespace();

      while (this.field35543.canRead() && this.field35543.peek() != ']') {
         this.field35543.skipWhitespace();
         int var4 = this.field35543.getCursor();
         String var5 = this.field35543.readString();
         if (this.field35546.containsKey(var5)) {
            this.field35543.setCursor(var4);
            throw field35538.createWithContext(this.field35543, this.field35547.toString(), var5);
         }

         this.field35543.skipWhitespace();
         if (!this.field35543.canRead() || this.field35543.peek() != '=') {
            this.field35543.setCursor(var4);
            throw field35540.createWithContext(this.field35543, this.field35547.toString(), var5);
         }

         this.field35543.skip();
         this.field35543.skipWhitespace();
         this.field35553 = (var2, var3x) -> this.method28850(var2, var3x, var5);
         var3 = this.field35543.getCursor();
         String var6 = this.field35543.readString();
         this.field35546.put(var5, var6);
         this.field35543.skipWhitespace();
         if (this.field35543.canRead()) {
            var3 = -1;
            if (this.field35543.peek() != ',') {
               if (this.field35543.peek() != ']') {
                  throw field35541.createWithContext(this.field35543);
               }
               break;
            }

            this.field35543.skip();
            this.field35553 = this::method28844;
         }
      }

      if (!this.field35543.canRead()) {
         if (var3 >= 0) {
            this.field35543.setCursor(var3);
         }

         throw field35541.createWithContext(this.field35543);
      } else {
         this.field35543.skip();
      }
   }

   public void method28859() throws CommandSyntaxException {
      this.field35550 = new Class7671(this.field35543).method25195();
   }

   private <T extends Comparable<T>> void method28860(Property<T> var1, String var2, int var3) throws CommandSyntaxException {
      Optional<T> var6 = var1.method30476(var2);
      if (!var6.isPresent()) {
         this.field35543.setCursor(var3);
         throw field35539.createWithContext(this.field35543, this.field35547.toString(), var1.method30472(), var2);
      } else {
         this.field35549 = this.field35549.with(var1, var6.get());
         this.field35545.put(var1, var6.get());
      }
   }

   public static String toString(BlockState var0) {
      StringBuilder var3 = new StringBuilder(Registry.BLOCK.getKey(var0.getBlock()).toString());
      if (!var0.method23461().isEmpty()) {
         var3.append('[');
         boolean var4 = false;

         for (UnmodifiableIterator var5 = var0.method23468().entrySet().iterator(); var5.hasNext(); var4 = true) {
            Entry var6 = (Entry)var5.next();
            if (var4) {
               var3.append(',');
            }

            method28861(var3, (Property)var6.getKey(), (Comparable<?>)var6.getValue());
         }

         var3.append(']');
      }

      return var3.toString();
   }

   private static <T extends Comparable<T>> void method28861(StringBuilder var0, Property<T> var1, Comparable<?> var2) {
      var0.append(var1.method30472());
      var0.append('=');
      var0.append(var1.method30475((T)var2));
   }

   public CompletableFuture<Suggestions> method28862(SuggestionsBuilder var1, Class7984<Block> var2) {
      return this.field35553.apply(var1.createOffset(this.field35543.getCursor()), var2);
   }

   public Map<String, String> method28863() {
      return this.field35546;
   }
}
