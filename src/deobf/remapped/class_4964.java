package remapped;

import com.google.common.primitives.Doubles;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4964 {
   public static final SimpleCommandExceptionType field_25669 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.entity.invalid"));
   public static final DynamicCommandExceptionType field_25683 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.entity.selector.unknown", var0)
   );
   public static final SimpleCommandExceptionType field_25680 = new SimpleCommandExceptionType(
      new TranslationTextComponent("argument.entity.selector.not_allowed")
   );
   public static final SimpleCommandExceptionType field_25695 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.entity.selector.missing"));
   public static final SimpleCommandExceptionType field_25705 = new SimpleCommandExceptionType(
      new TranslationTextComponent("argument.entity.options.unterminated")
   );
   public static final DynamicCommandExceptionType field_25675 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.entity.options.valueless", var0)
   );
   public static final BiConsumer<class_1343, List<? extends class_8145>> field_25668 = (var0, var1) -> {
   };
   public static final BiConsumer<class_1343, List<? extends class_8145>> field_25697 = (var0, var1) -> var1.sort(
         (var1x, var2) -> Doubles.compare(var1x.method_37274(var0), var2.method_37274(var0))
      );
   public static final BiConsumer<class_1343, List<? extends class_8145>> field_25703 = (var0, var1) -> var1.sort(
         (var1x, var2) -> Doubles.compare(var2.method_37274(var0), var1x.method_37274(var0))
      );
   public static final BiConsumer<class_1343, List<? extends class_8145>> field_25696 = (var0, var1) -> Collections.shuffle(var1);
   public static final BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> field_25676 = (var0, var1) -> var0.buildFuture();
   private final StringReader field_25677;
   private final boolean field_25671;
   private int field_25692;
   private boolean field_25681;
   private boolean field_25690;
   private class_6115 field_25688 = class_6115.field_31261;
   private class_7781 field_25694 = class_7781.field_39439;
   private Double field_25704;
   private Double field_25700;
   private Double field_25707;
   private Double field_25667;
   private Double field_25684;
   private Double field_25689;
   private class_9721 field_25693 = class_9721.field_49421;
   private class_9721 field_25673 = class_9721.field_49421;
   private Predicate<class_8145> field_25665 = var0 -> true;
   private BiConsumer<class_1343, List<? extends class_8145>> field_25701 = field_25668;
   private boolean field_25691;
   private String field_25711;
   private int field_25679;
   private UUID field_25710;
   private BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> field_25709 = field_25676;
   private boolean field_25670;
   private boolean field_25674;
   private boolean field_25682;
   private boolean field_25666;
   private boolean field_25678;
   private boolean field_25687;
   private boolean field_25708;
   private boolean field_25686;
   private class_6629<?> field_25699;
   private boolean field_25672;
   private boolean field_25702;
   private boolean field_25698;
   private boolean field_25706;

   public class_4964(StringReader var1) {
      this(var1, true);
   }

   public class_4964(StringReader var1, boolean var2) {
      this.field_25677 = var1;
      this.field_25671 = var2;
   }

   public class_4550 method_22750() {
      class_4092 var3;
      if (this.field_25667 == null && this.field_25684 == null && this.field_25689 == null) {
         if (this.field_25688.method_27855() == null) {
            var3 = null;
         } else {
            float var4 = this.field_25688.method_27855();
            var3 = new class_4092((double)(-var4), (double)(-var4), (double)(-var4), (double)(var4 + 1.0F), (double)(var4 + 1.0F), (double)(var4 + 1.0F));
         }
      } else {
         var3 = this.method_22781(
            this.field_25667 != null ? this.field_25667 : 0.0,
            this.field_25684 != null ? this.field_25684 : 0.0,
            this.field_25689 != null ? this.field_25689 : 0.0
         );
      }

      Function var5;
      if (this.field_25704 == null && this.field_25700 == null && this.field_25707 == null) {
         var5 = var0 -> var0;
      } else {
         var5 = var1 -> new class_1343(
               this.field_25704 != null ? this.field_25704 : var1.field_7336,
               this.field_25700 != null ? this.field_25700 : var1.field_7333,
               this.field_25707 != null ? this.field_25707 : var1.field_7334
            );
      }

      return new class_4550(
         this.field_25692,
         this.field_25681,
         this.field_25690,
         this.field_25665,
         this.field_25688,
         var5,
         var3,
         this.field_25701,
         this.field_25691,
         this.field_25711,
         this.field_25710,
         this.field_25699,
         this.field_25706
      );
   }

   private class_4092 method_22781(double var1, double var3, double var5) {
      boolean var9 = var1 < 0.0;
      boolean var10 = var3 < 0.0;
      boolean var11 = var5 < 0.0;
      double var12 = !var9 ? 0.0 : var1;
      double var14 = !var10 ? 0.0 : var3;
      double var16 = !var11 ? 0.0 : var5;
      double var18 = (!var9 ? var1 : 0.0) + 1.0;
      double var20 = (!var10 ? var3 : 0.0) + 1.0;
      double var22 = (!var11 ? var5 : 0.0) + 1.0;
      return new class_4092(var12, var14, var16, var18, var20, var22);
   }

   private void method_22800() {
      if (this.field_25693 != class_9721.field_49421) {
         this.field_25665 = this.field_25665.and(this.method_22738(this.field_25693, var0 -> (double)var0.field_41755));
      }

      if (this.field_25673 != class_9721.field_49421) {
         this.field_25665 = this.field_25665.and(this.method_22738(this.field_25673, var0 -> (double)var0.field_41701));
      }

      if (!this.field_25694.method_27852()) {
         this.field_25665 = this.field_25665.and(var1 -> var1 instanceof class_9359 ? this.field_25694.method_35307(((class_9359)var1).field_3840) : false);
      }
   }

   private Predicate<class_8145> method_22738(class_9721 var1, ToDoubleFunction<class_8145> var2) {
      double var5 = (double)class_9299.method_42810(var1.method_44916() != null ? var1.method_44916() : 0.0F);
      double var7 = (double)class_9299.method_42810(var1.method_44921() != null ? var1.method_44921() : 359.0F);
      return var5x -> {
         double var8 = class_9299.method_42809(var2.applyAsDouble(var5x));
         return !(var5 > var7) ? var8 >= var5 && var8 <= var7 : var8 >= var5 || var8 <= var7;
      };
   }

   public void method_22764() throws CommandSyntaxException {
      this.field_25706 = true;
      this.field_25709 = this::method_22791;
      if (this.field_25677.canRead()) {
         int var3 = this.field_25677.getCursor();
         char var4 = this.field_25677.read();
         if (var4 != 'p') {
            if (var4 != 'a') {
               if (var4 != 'r') {
                  if (var4 != 's') {
                     if (var4 != 'e') {
                        this.field_25677.setCursor(var3);
                        throw field_25683.createWithContext(this.field_25677, '@' + String.valueOf(var4));
                     }

                     this.field_25692 = Integer.MAX_VALUE;
                     this.field_25681 = true;
                     this.field_25701 = field_25668;
                     this.field_25665 = class_8145::method_37330;
                  } else {
                     this.field_25692 = 1;
                     this.field_25681 = true;
                     this.field_25691 = true;
                  }
               } else {
                  this.field_25692 = 1;
                  this.field_25681 = false;
                  this.field_25701 = field_25696;
                  this.method_22751(class_6629.field_34300);
               }
            } else {
               this.field_25692 = Integer.MAX_VALUE;
               this.field_25681 = false;
               this.field_25701 = field_25668;
               this.method_22751(class_6629.field_34300);
            }
         } else {
            this.field_25692 = 1;
            this.field_25681 = false;
            this.field_25701 = field_25697;
            this.method_22751(class_6629.field_34300);
         }

         this.field_25709 = this::method_22802;
         if (this.field_25677.canRead() && this.field_25677.peek() == '[') {
            this.field_25677.skip();
            this.field_25709 = this::method_22797;
            this.method_22739();
         }
      } else {
         throw field_25695.createWithContext(this.field_25677);
      }
   }

   public void method_22808() throws CommandSyntaxException {
      if (this.field_25677.canRead()) {
         this.field_25709 = this::method_22777;
      }

      int var3 = this.field_25677.getCursor();
      String var4 = this.field_25677.readString();

      try {
         this.field_25710 = UUID.fromString(var4);
         this.field_25681 = true;
      } catch (IllegalArgumentException var6) {
         if (var4.isEmpty() || var4.length() > 16) {
            this.field_25677.setCursor(var3);
            throw field_25669.createWithContext(this.field_25677);
         }

         this.field_25681 = false;
         this.field_25711 = var4;
      }

      this.field_25692 = 1;
   }

   public void method_22739() throws CommandSyntaxException {
      this.field_25709 = this::method_22761;
      this.field_25677.skipWhitespace();

      while (this.field_25677.canRead() && this.field_25677.peek() != ']') {
         this.field_25677.skipWhitespace();
         int var3 = this.field_25677.getCursor();
         String var4 = this.field_25677.readString();
         class_5353 var5 = class_9558.method_44157(this, var4, var3);
         this.field_25677.skipWhitespace();
         if (!this.field_25677.canRead() || this.field_25677.peek() != '=') {
            this.field_25677.setCursor(var3);
            throw field_25675.createWithContext(this.field_25677, var4);
         }

         this.field_25677.skip();
         this.field_25677.skipWhitespace();
         this.field_25709 = field_25676;
         var5.method_24435(this);
         this.field_25677.skipWhitespace();
         this.field_25709 = this::method_22740;
         if (this.field_25677.canRead()) {
            if (this.field_25677.peek() != ',') {
               if (this.field_25677.peek() != ']') {
                  throw field_25705.createWithContext(this.field_25677);
               }
               break;
            }

            this.field_25677.skip();
            this.field_25709 = this::method_22761;
         }
      }

      if (!this.field_25677.canRead()) {
         throw field_25705.createWithContext(this.field_25677);
      } else {
         this.field_25677.skip();
         this.field_25709 = field_25676;
      }
   }

   public boolean method_22796() {
      this.field_25677.skipWhitespace();
      if (this.field_25677.canRead() && this.field_25677.peek() == '!') {
         this.field_25677.skip();
         this.field_25677.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   public boolean method_22774() {
      this.field_25677.skipWhitespace();
      if (this.field_25677.canRead() && this.field_25677.peek() == '#') {
         this.field_25677.skip();
         this.field_25677.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   public StringReader method_22749() {
      return this.field_25677;
   }

   public void method_22758(Predicate<class_8145> var1) {
      this.field_25665 = this.field_25665.and(var1);
   }

   public void method_22785() {
      this.field_25690 = true;
   }

   public class_6115 method_22799() {
      return this.field_25688;
   }

   public void method_22747(class_6115 var1) {
      this.field_25688 = var1;
   }

   public class_7781 method_22779() {
      return this.field_25694;
   }

   public void method_22772(class_7781 var1) {
      this.field_25694 = var1;
   }

   public class_9721 method_22746() {
      return this.field_25693;
   }

   public void method_22763(class_9721 var1) {
      this.field_25693 = var1;
   }

   public class_9721 method_22765() {
      return this.field_25673;
   }

   public void method_22775(class_9721 var1) {
      this.field_25673 = var1;
   }

   @Nullable
   public Double method_22789() {
      return this.field_25704;
   }

   @Nullable
   public Double method_22741() {
      return this.field_25700;
   }

   @Nullable
   public Double method_22778() {
      return this.field_25707;
   }

   public void method_22798(double var1) {
      this.field_25704 = var1;
   }

   public void method_22787(double var1) {
      this.field_25700 = var1;
   }

   public void method_22766(double var1) {
      this.field_25707 = var1;
   }

   public void method_22788(double var1) {
      this.field_25667 = var1;
   }

   public void method_22790(double var1) {
      this.field_25684 = var1;
   }

   public void method_22759(double var1) {
      this.field_25689 = var1;
   }

   @Nullable
   public Double method_22792() {
      return this.field_25667;
   }

   @Nullable
   public Double method_22803() {
      return this.field_25684;
   }

   @Nullable
   public Double method_22752() {
      return this.field_25689;
   }

   public void method_22745(int var1) {
      this.field_25692 = var1;
   }

   public void method_22768(boolean var1) {
      this.field_25681 = var1;
   }

   public void method_22806(BiConsumer<class_1343, List<? extends class_8145>> var1) {
      this.field_25701 = var1;
   }

   public class_4550 method_22744() throws CommandSyntaxException {
      this.field_25679 = this.field_25677.getCursor();
      this.field_25709 = this::method_22804;
      if (this.field_25677.canRead() && this.field_25677.peek() == '@') {
         if (!this.field_25671) {
            throw field_25680.createWithContext(this.field_25677);
         }

         this.field_25677.skip();
         this.method_22764();
      } else {
         this.method_22808();
      }

      this.method_22800();
      return this.method_22750();
   }

   private static void method_22786(SuggestionsBuilder var0) {
      var0.suggest("@p", new TranslationTextComponent("argument.entity.selector.nearestPlayer"));
      var0.suggest("@a", new TranslationTextComponent("argument.entity.selector.allPlayers"));
      var0.suggest("@r", new TranslationTextComponent("argument.entity.selector.randomPlayer"));
      var0.suggest("@s", new TranslationTextComponent("argument.entity.selector.self"));
      var0.suggest("@e", new TranslationTextComponent("argument.entity.selector.allEntities"));
   }

   private CompletableFuture<Suggestions> method_22804(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var2.accept(var1);
      if (this.field_25671) {
         method_22786(var1);
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method_22777(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      SuggestionsBuilder var5 = var1.createOffset(this.field_25679);
      var2.accept(var5);
      return var1.add(var5).buildFuture();
   }

   private CompletableFuture<Suggestions> method_22791(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      SuggestionsBuilder var5 = var1.createOffset(var1.getStart() - 1);
      method_22786(var5);
      var1.add(var5);
      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method_22802(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var1.suggest(String.valueOf('['));
      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method_22797(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var1.suggest(String.valueOf(']'));
      class_9558.method_44160(this, var1);
      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method_22761(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      class_9558.method_44160(this, var1);
      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method_22740(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var1.suggest(String.valueOf(','));
      var1.suggest(String.valueOf(']'));
      return var1.buildFuture();
   }

   public boolean method_22783() {
      return this.field_25691;
   }

   public void method_22776(BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> var1) {
      this.field_25709 = var1;
   }

   public CompletableFuture<Suggestions> method_22769(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      return this.field_25709.apply(var1.createOffset(this.field_25677.getCursor()), var2);
   }

   public boolean method_22748() {
      return this.field_25670;
   }

   public void method_22782(boolean var1) {
      this.field_25670 = var1;
   }

   public boolean method_22753() {
      return this.field_25674;
   }

   public void method_22757(boolean var1) {
      this.field_25674 = var1;
   }

   public boolean method_22773() {
      return this.field_25682;
   }

   public void method_22770(boolean var1) {
      this.field_25682 = var1;
   }

   public boolean method_22771() {
      return this.field_25666;
   }

   public void method_22760(boolean var1) {
      this.field_25666 = var1;
   }

   public boolean method_22767() {
      return this.field_25678;
   }

   public void method_22762(boolean var1) {
      this.field_25678 = var1;
   }

   public boolean method_22780() {
      return this.field_25687;
   }

   public void method_22794(boolean var1) {
      this.field_25687 = var1;
   }

   public boolean method_22754() {
      return this.field_25708;
   }

   public void method_22755(boolean var1) {
      this.field_25708 = var1;
   }

   public void method_22784(boolean var1) {
      this.field_25686 = var1;
   }

   public void method_22751(class_6629<?> var1) {
      this.field_25699 = var1;
   }

   public void method_22743() {
      this.field_25672 = true;
   }

   public boolean method_22756() {
      return this.field_25699 != null;
   }

   public boolean method_22807() {
      return this.field_25672;
   }

   public boolean method_22742() {
      return this.field_25702;
   }

   public void method_22801(boolean var1) {
      this.field_25702 = var1;
   }

   public boolean method_22793() {
      return this.field_25698;
   }

   public void method_22795(boolean var1) {
      this.field_25698 = var1;
   }
}
