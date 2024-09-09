package mapped;

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

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8533 {
   public static final SimpleCommandExceptionType field38328 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.entity.invalid"));
   public static final DynamicCommandExceptionType field38329 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.entity.selector.unknown", var0)
   );
   public static final SimpleCommandExceptionType field38330 = new SimpleCommandExceptionType(
      new TranslationTextComponent("argument.entity.selector.not_allowed")
   );
   public static final SimpleCommandExceptionType field38331 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.entity.selector.missing"));
   public static final SimpleCommandExceptionType field38332 = new SimpleCommandExceptionType(
      new TranslationTextComponent("argument.entity.options.unterminated")
   );
   public static final DynamicCommandExceptionType field38333 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.entity.options.valueless", var0)
   );
   public static final BiConsumer<Vector3d, List<? extends Entity>> field38334 = (var0, var1) -> {
   };
   public static final BiConsumer<Vector3d, List<? extends Entity>> field38335 = (var0, var1) -> var1.sort(
         (var1x, var2) -> Doubles.compare(var1x.getDistanceNearest3(var0), var2.getDistanceNearest3(var0))
      );
   public static final BiConsumer<Vector3d, List<? extends Entity>> field38336 = (var0, var1) -> var1.sort(
         (var1x, var2) -> Doubles.compare(var2.getDistanceNearest3(var0), var1x.getDistanceNearest3(var0))
      );
   public static final BiConsumer<Vector3d, List<? extends Entity>> field38337 = (var0, var1) -> Collections.shuffle(var1);
   public static final BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> field38338 = (var0, var1) -> var0.buildFuture();
   private final StringReader field38339;
   private final boolean field38340;
   private int field38341;
   private boolean field38342;
   private boolean field38343;
   private Class8841 field38344 = Class8841.field39940;
   private Class8840 field38345 = Class8840.field39936;
   private Double field38346;
   private Double field38347;
   private Double field38348;
   private Double field38349;
   private Double field38350;
   private Double field38351;
   private Class9795 field38352 = Class9795.field45809;
   private Class9795 field38353 = Class9795.field45809;
   private Predicate<Entity> field38354 = var0 -> true;
   private BiConsumer<Vector3d, List<? extends Entity>> field38355 = field38334;
   private boolean field38356;
   private String field38357;
   private int field38358;
   private UUID field38359;
   private BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> field38360 = field38338;
   private boolean field38361;
   private boolean field38362;
   private boolean field38363;
   private boolean field38364;
   private boolean field38365;
   private boolean field38366;
   private boolean field38367;
   private boolean field38368;
   private EntityType<?> field38369;
   private boolean field38370;
   private boolean field38371;
   private boolean field38372;
   private boolean field38373;

   public Class8533(StringReader var1) {
      this(var1, true);
   }

   public Class8533(StringReader var1, boolean var2) {
      this.field38339 = var1;
      this.field38340 = var2;
   }

   public Class8429 method30268() {
      AxisAlignedBB var3;
      if (this.field38349 == null && this.field38350 == null && this.field38351 == null) {
         if (this.field38344.method32003() == null) {
            var3 = null;
         } else {
            float var4 = this.field38344.method32003();
            var3 = new AxisAlignedBB((double)(-var4), (double)(-var4), (double)(-var4), (double)(var4 + 1.0F), (double)(var4 + 1.0F), (double)(var4 + 1.0F));
         }
      } else {
         var3 = this.method30269(
            this.field38349 != null ? this.field38349 : 0.0, this.field38350 != null ? this.field38350 : 0.0, this.field38351 != null ? this.field38351 : 0.0
         );
      }

      Function<Vector3d, Vector3d> var5;
      if (this.field38346 == null && this.field38347 == null && this.field38348 == null) {
         var5 = var0 -> var0;
      } else {
         var5 = var1 -> new Vector3d(
               this.field38346 != null ? this.field38346 : var1.x,
               this.field38347 != null ? this.field38347 : var1.y,
               this.field38348 != null ? this.field38348 : var1.z
            );
      }

      return new Class8429(
         this.field38341,
         this.field38342,
         this.field38343,
         this.field38354,
         this.field38344,
         var5,
         var3,
         this.field38355,
         this.field38356,
         this.field38357,
         this.field38359,
         this.field38369,
         this.field38373
      );
   }

   private AxisAlignedBB method30269(double var1, double var3, double var5) {
      boolean var9 = var1 < 0.0;
      boolean var10 = var3 < 0.0;
      boolean var11 = var5 < 0.0;
      double var12 = !var9 ? 0.0 : var1;
      double var14 = !var10 ? 0.0 : var3;
      double var16 = !var11 ? 0.0 : var5;
      double var18 = (!var9 ? var1 : 0.0) + 1.0;
      double var20 = (!var10 ? var3 : 0.0) + 1.0;
      double var22 = (!var11 ? var5 : 0.0) + 1.0;
      return new AxisAlignedBB(var12, var14, var16, var18, var20, var22);
   }

   private void method30270() {
      if (this.field38352 != Class9795.field45809) {
         this.field38354 = this.field38354.and(this.method30271(this.field38352, var0 -> (double)var0.rotationPitch));
      }

      if (this.field38353 != Class9795.field45809) {
         this.field38354 = this.field38354.and(this.method30271(this.field38353, var0 -> (double)var0.rotationYaw));
      }

      if (!this.field38345.method32004()) {
         this.field38354 = this.field38354.and(var1 -> var1 instanceof ServerPlayerEntity ? this.field38345.method32015(((ServerPlayerEntity)var1).field4920) : false);
      }
   }

   private Predicate<Entity> method30271(Class9795 var1, ToDoubleFunction<Entity> var2) {
      double var5 = (double) MathHelper.method37792(var1.method38630() != null ? var1.method38630() : 0.0F);
      double var7 = (double) MathHelper.method37792(var1.method38631() != null ? var1.method38631() : 359.0F);
      return var5x -> {
         double var8 = MathHelper.wrapDegrees(var2.applyAsDouble(var5x));
         return !(var5 > var7) ? var8 >= var5 && var8 <= var7 : var8 >= var5 || var8 <= var7;
      };
   }

   public void method30272() throws CommandSyntaxException {
      this.field38373 = true;
      this.field38360 = this::method30307;
      if (this.field38339.canRead()) {
         int var3 = this.field38339.getCursor();
         char var4 = this.field38339.read();
         if (var4 != 'p') {
            if (var4 != 'a') {
               if (var4 != 'r') {
                  if (var4 != 's') {
                     if (var4 != 'e') {
                        this.field38339.setCursor(var3);
                        throw field38329.createWithContext(this.field38339, '@' + String.valueOf(var4));
                     }

                     this.field38341 = Integer.MAX_VALUE;
                     this.field38342 = true;
                     this.field38355 = field38334;
                     this.field38354 = Entity::isAlive;
                  } else {
                     this.field38341 = 1;
                     this.field38342 = true;
                     this.field38356 = true;
                  }
               } else {
                  this.field38341 = 1;
                  this.field38342 = false;
                  this.field38355 = field38337;
                  this.method30330(EntityType.PLAYER);
               }
            } else {
               this.field38341 = Integer.MAX_VALUE;
               this.field38342 = false;
               this.field38355 = field38334;
               this.method30330(EntityType.PLAYER);
            }
         } else {
            this.field38341 = 1;
            this.field38342 = false;
            this.field38355 = field38335;
            this.method30330(EntityType.PLAYER);
         }

         this.field38360 = this::method30308;
         if (this.field38339.canRead() && this.field38339.peek() == '[') {
            this.field38339.skip();
            this.field38360 = this::method30309;
            this.method30274();
         }
      } else {
         throw field38331.createWithContext(this.field38339);
      }
   }

   public void method30273() throws CommandSyntaxException {
      if (this.field38339.canRead()) {
         this.field38360 = this::method30306;
      }

      int var3 = this.field38339.getCursor();
      String var4 = this.field38339.readString();

      try {
         this.field38359 = UUID.fromString(var4);
         this.field38342 = true;
      } catch (IllegalArgumentException var6) {
         if (var4.isEmpty() || var4.length() > 16) {
            this.field38339.setCursor(var3);
            throw field38328.createWithContext(this.field38339);
         }

         this.field38342 = false;
         this.field38357 = var4;
      }

      this.field38341 = 1;
   }

   public void method30274() throws CommandSyntaxException {
      this.field38360 = this::method30310;
      this.field38339.skipWhitespace();

      while (this.field38339.canRead() && this.field38339.peek() != ']') {
         this.field38339.skipWhitespace();
         int var3 = this.field38339.getCursor();
         String var4 = this.field38339.readString();
         Class8642 var5 = Class9748.method38220(this, var4, var3);
         this.field38339.skipWhitespace();
         if (!this.field38339.canRead() || this.field38339.peek() != '=') {
            this.field38339.setCursor(var3);
            throw field38333.createWithContext(this.field38339, var4);
         }

         this.field38339.skip();
         this.field38339.skipWhitespace();
         this.field38360 = field38338;
         var5.method31074(this);
         this.field38339.skipWhitespace();
         this.field38360 = this::method30311;
         if (this.field38339.canRead()) {
            if (this.field38339.peek() != ',') {
               if (this.field38339.peek() != ']') {
                  throw field38332.createWithContext(this.field38339);
               }
               break;
            }

            this.field38339.skip();
            this.field38360 = this::method30310;
         }
      }

      if (!this.field38339.canRead()) {
         throw field38332.createWithContext(this.field38339);
      } else {
         this.field38339.skip();
         this.field38360 = field38338;
      }
   }

   public boolean method30275() {
      this.field38339.skipWhitespace();
      if (this.field38339.canRead() && this.field38339.peek() == '!') {
         this.field38339.skip();
         this.field38339.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   public boolean method30276() {
      this.field38339.skipWhitespace();
      if (this.field38339.canRead() && this.field38339.peek() == '#') {
         this.field38339.skip();
         this.field38339.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   public StringReader method30277() {
      return this.field38339;
   }

   public void method30278(Predicate<Entity> var1) {
      this.field38354 = this.field38354.and(var1);
   }

   public void method30279() {
      this.field38343 = true;
   }

   public Class8841 method30280() {
      return this.field38344;
   }

   public void method30281(Class8841 var1) {
      this.field38344 = var1;
   }

   public Class8840 method30282() {
      return this.field38345;
   }

   public void method30283(Class8840 var1) {
      this.field38345 = var1;
   }

   public Class9795 method30284() {
      return this.field38352;
   }

   public void method30285(Class9795 var1) {
      this.field38352 = var1;
   }

   public Class9795 method30286() {
      return this.field38353;
   }

   public void method30287(Class9795 var1) {
      this.field38353 = var1;
   }

   @Nullable
   public Double method30288() {
      return this.field38346;
   }

   @Nullable
   public Double method30289() {
      return this.field38347;
   }

   @Nullable
   public Double method30290() {
      return this.field38348;
   }

   public void method30291(double var1) {
      this.field38346 = var1;
   }

   public void method30292(double var1) {
      this.field38347 = var1;
   }

   public void method30293(double var1) {
      this.field38348 = var1;
   }

   public void method30294(double var1) {
      this.field38349 = var1;
   }

   public void method30295(double var1) {
      this.field38350 = var1;
   }

   public void method30296(double var1) {
      this.field38351 = var1;
   }

   @Nullable
   public Double method30297() {
      return this.field38349;
   }

   @Nullable
   public Double method30298() {
      return this.field38350;
   }

   @Nullable
   public Double method30299() {
      return this.field38351;
   }

   public void method30300(int var1) {
      this.field38341 = var1;
   }

   public void method30301(boolean var1) {
      this.field38342 = var1;
   }

   public void method30302(BiConsumer<Vector3d, List<? extends Entity>> var1) {
      this.field38355 = var1;
   }

   public Class8429 method30303() throws CommandSyntaxException {
      this.field38358 = this.field38339.getCursor();
      this.field38360 = this::method30305;
      if (this.field38339.canRead() && this.field38339.peek() == '@') {
         if (!this.field38340) {
            throw field38330.createWithContext(this.field38339);
         }

         this.field38339.skip();
         this.method30272();
      } else {
         this.method30273();
      }

      this.method30270();
      return this.method30268();
   }

   private static void method30304(SuggestionsBuilder var0) {
      var0.suggest("@p", new TranslationTextComponent("argument.entity.selector.nearestPlayer"));
      var0.suggest("@a", new TranslationTextComponent("argument.entity.selector.allPlayers"));
      var0.suggest("@r", new TranslationTextComponent("argument.entity.selector.randomPlayer"));
      var0.suggest("@s", new TranslationTextComponent("argument.entity.selector.self"));
      var0.suggest("@e", new TranslationTextComponent("argument.entity.selector.allEntities"));
   }

   private CompletableFuture<Suggestions> method30305(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var2.accept(var1);
      if (this.field38340) {
         method30304(var1);
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method30306(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      SuggestionsBuilder var5 = var1.createOffset(this.field38358);
      var2.accept(var5);
      return var1.add(var5).buildFuture();
   }

   private CompletableFuture<Suggestions> method30307(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      SuggestionsBuilder var5 = var1.createOffset(var1.getStart() - 1);
      method30304(var5);
      var1.add(var5);
      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method30308(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var1.suggest(String.valueOf('['));
      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method30309(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var1.suggest(String.valueOf(']'));
      Class9748.method38221(this, var1);
      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method30310(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      Class9748.method38221(this, var1);
      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method30311(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var1.suggest(String.valueOf(','));
      var1.suggest(String.valueOf(']'));
      return var1.buildFuture();
   }

   public boolean method30312() {
      return this.field38356;
   }

   public void method30313(BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> var1) {
      this.field38360 = var1;
   }

   public CompletableFuture<Suggestions> method30314(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      return this.field38360.apply(var1.createOffset(this.field38339.getCursor()), var2);
   }

   public boolean method30315() {
      return this.field38361;
   }

   public void method30316(boolean var1) {
      this.field38361 = var1;
   }

   public boolean method30317() {
      return this.field38362;
   }

   public void method30318(boolean var1) {
      this.field38362 = var1;
   }

   public boolean method30319() {
      return this.field38363;
   }

   public void method30320(boolean var1) {
      this.field38363 = var1;
   }

   public boolean method30321() {
      return this.field38364;
   }

   public void method30322(boolean var1) {
      this.field38364 = var1;
   }

   public boolean method30323() {
      return this.field38365;
   }

   public void method30324(boolean var1) {
      this.field38365 = var1;
   }

   public boolean method30325() {
      return this.field38366;
   }

   public void method30326(boolean var1) {
      this.field38366 = var1;
   }

   public boolean method30327() {
      return this.field38367;
   }

   public void method30328(boolean var1) {
      this.field38367 = var1;
   }

   public void method30329(boolean var1) {
      this.field38368 = var1;
   }

   public void method30330(EntityType<?> var1) {
      this.field38369 = var1;
   }

   public void method30331() {
      this.field38370 = true;
   }

   public boolean method30332() {
      return this.field38369 != null;
   }

   public boolean method30333() {
      return this.field38370;
   }

   public boolean method30334() {
      return this.field38371;
   }

   public void method30335(boolean var1) {
      this.field38371 = var1;
   }

   public boolean method30336() {
      return this.field38372;
   }

   public void method30337(boolean var1) {
      this.field38372 = var1;
   }
}
