package mapped;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class AbstractBlock {
   private static String[] field33963;
   private Class8649 field33964;
   private Function<BlockState, Class7210> field33965;
   private boolean field33966 = true;
   private Class8447 field33967 = Class8447.field36204;
   private ToIntFunction<BlockState> field33968 = var0 -> 0;
   private float field33969;
   private float field33970;
   private boolean field33971;
   private boolean field33972;
   private float field33973 = 0.6F;
   private float field33974 = 1.0F;
   private float field33975 = 1.0F;
   private ResourceLocation field33976;
   private boolean field33977 = true;
   private boolean field33978;
   private Class9817<EntityType<?>> field33979 = (var0, var1x, var2x, var3) -> var0.method23454(var1x, var2x, Direction.field673) && var0.method23392() < 14;
   private Class8609 field33980 = (var0, var1x, var2x) -> var0.method23384().method31090() && var0.method23456(var1x, var2x);
   private Class8609 field33981 = (var1x, var2x, var3) -> this.field33964.method31087() && var1x.method23456(var2x, var3);
   private Class8609 field33982 = this.field33981;
   private Class8609 field33983 = (var0, var1x, var2x) -> false;
   private Class8609 field33984 = (var0, var1x, var2x) -> false;
   private boolean field33985;

   private AbstractBlock(Class8649 var1, Class7210 var2) {
      this(var1, var1x -> var2);
   }

   private AbstractBlock(Class8649 var1, Function<BlockState, Class7210> var2) {
      this.field33964 = var1;
      this.field33965 = var2;
   }

   public static AbstractBlock method26609(Class8649 var0) {
      return method26611(var0, var0.method31092());
   }

   public static AbstractBlock method26610(Class8649 var0, Class112 var1) {
      return method26611(var0, var1.method312());
   }

   public static AbstractBlock method26611(Class8649 var0, Class7210 var1) {
      return new AbstractBlock(var0, var1);
   }

   public static AbstractBlock method26612(Class8649 var0, Function<BlockState, Class7210> var1) {
      return new AbstractBlock(var0, var1);
   }

   public static AbstractBlock method26613(Class3390 var0) {
      AbstractBlock var3 = new AbstractBlock(var0.field19004, var0.field19013.field33965);
      var3.field33964 = var0.field19013.field33964;
      var3.field33970 = var0.field19013.field33970;
      var3.field33969 = var0.field19013.field33969;
      var3.field33966 = var0.field19013.field33966;
      var3.field33972 = var0.field19013.field33972;
      var3.field33968 = var0.field19013.field33968;
      var3.field33965 = var0.field19013.field33965;
      var3.field33967 = var0.field19013.field33967;
      var3.field33973 = var0.field19013.field33973;
      var3.field33974 = var0.field19013.field33974;
      var3.field33985 = var0.field19013.field33985;
      var3.field33977 = var0.field19013.field33977;
      var3.field33978 = var0.field19013.field33978;
      var3.field33971 = var0.field19013.field33971;
      return var3;
   }

   public AbstractBlock method26614() {
      this.field33966 = false;
      this.field33977 = false;
      return this;
   }

   public AbstractBlock method26615() {
      this.field33977 = false;
      return this;
   }

   public AbstractBlock method26616(float var1) {
      this.field33973 = var1;
      return this;
   }

   public AbstractBlock method26617(float var1) {
      this.field33974 = var1;
      return this;
   }

   public AbstractBlock method26618(float var1) {
      this.field33975 = var1;
      return this;
   }

   public AbstractBlock method26619(Class8447 var1) {
      this.field33967 = var1;
      return this;
   }

   public AbstractBlock method26620(ToIntFunction<BlockState> var1) {
      this.field33968 = var1;
      return this;
   }

   public AbstractBlock method26621(float var1, float var2) {
      this.field33970 = var1;
      this.field33969 = Math.max(0.0F, var2);
      return this;
   }

   public AbstractBlock method26622() {
      return this.method26623(0.0F);
   }

   public AbstractBlock method26623(float var1) {
      this.method26621(var1, var1);
      return this;
   }

   public AbstractBlock method26624() {
      this.field33972 = true;
      return this;
   }

   public AbstractBlock method26625() {
      this.field33985 = true;
      return this;
   }

   public AbstractBlock method26626() {
      this.field33976 = Class8793.field39533;
      return this;
   }

   public AbstractBlock method26627(Block var1) {
      this.field33976 = var1.method11999();
      return this;
   }

   public AbstractBlock method26628() {
      this.field33978 = true;
      return this;
   }

   public AbstractBlock method26629(Class9817<EntityType<?>> var1) {
      this.field33979 = var1;
      return this;
   }

   public AbstractBlock method26630(Class8609 var1) {
      this.field33980 = var1;
      return this;
   }

   public AbstractBlock method26631(Class8609 var1) {
      this.field33981 = var1;
      return this;
   }

   public AbstractBlock method26632(Class8609 var1) {
      this.field33982 = var1;
      return this;
   }

   public AbstractBlock method26633(Class8609 var1) {
      this.field33983 = var1;
      return this;
   }

   public AbstractBlock method26634(Class8609 var1) {
      this.field33984 = var1;
      return this;
   }

   public AbstractBlock method26635() {
      this.field33971 = true;
      return this;
   }

   // $VF: synthetic method
   public static Class8649 method26643(AbstractBlock var0) {
      return var0.field33964;
   }

   // $VF: synthetic method
   public static boolean method26644(AbstractBlock var0) {
      return var0.field33966;
   }

   // $VF: synthetic method
   public static ResourceLocation method26645(AbstractBlock var0) {
      return var0.field33976;
   }

   // $VF: synthetic method
   public static float method26646(AbstractBlock var0) {
      return var0.field33969;
   }

   // $VF: synthetic method
   public static boolean method26647(AbstractBlock var0) {
      return var0.field33972;
   }

   // $VF: synthetic method
   public static Class8447 method26648(AbstractBlock var0) {
      return var0.field33967;
   }

   // $VF: synthetic method
   public static float method26649(AbstractBlock var0) {
      return var0.field33973;
   }

   // $VF: synthetic method
   public static float method26650(AbstractBlock var0) {
      return var0.field33974;
   }

   // $VF: synthetic method
   public static float method26651(AbstractBlock var0) {
      return var0.field33975;
   }

   // $VF: synthetic method
   public static boolean method26652(AbstractBlock var0) {
      return var0.field33985;
   }

   // $VF: synthetic method
   public static Function method26653(AbstractBlock var0) {
      return var0.field33965;
   }

   // $VF: synthetic method
   public static ToIntFunction method26654(AbstractBlock var0) {
      return var0.field33968;
   }

   // $VF: synthetic method
   public static boolean method26655(AbstractBlock var0) {
      return var0.field33978;
   }

   // $VF: synthetic method
   public static float method26656(AbstractBlock var0) {
      return var0.field33970;
   }

   // $VF: synthetic method
   public static boolean method26657(AbstractBlock var0) {
      return var0.field33971;
   }

   // $VF: synthetic method
   public static boolean method26658(AbstractBlock var0) {
      return var0.field33977;
   }

   // $VF: synthetic method
   public static Class8609 method26659(AbstractBlock var0) {
      return var0.field33980;
   }

   // $VF: synthetic method
   public static Class8609 method26660(AbstractBlock var0) {
      return var0.field33981;
   }

   // $VF: synthetic method
   public static Class8609 method26661(AbstractBlock var0) {
      return var0.field33982;
   }

   // $VF: synthetic method
   public static Class8609 method26662(AbstractBlock var0) {
      return var0.field33983;
   }

   // $VF: synthetic method
   public static Class8609 method26663(AbstractBlock var0) {
      return var0.field33984;
   }

   // $VF: synthetic method
   public static Class9817 method26664(AbstractBlock var0) {
      return var0.field33979;
   }
}
