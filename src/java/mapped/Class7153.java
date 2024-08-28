package mapped;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7153 implements Class7151 {
   private static final SuggestionProvider<Class6619> field30727 = (var0, var1) -> Class6618.method20143(method22318(var0).method32750(), var1);
   public static final Function<String, Class8196> field30728 = var0 -> new Class8198(var0);
   private final Class8962 field30729;
   private final ResourceLocation field30730;

   private static Class8962 method22318(CommandContext<Class6619> var0) {
      return ((Class6619)var0.getSource()).method20177().method1410();
   }

   private Class7153(Class8962 var1, ResourceLocation var2) {
      this.field30729 = var1;
      this.field30730 = var2;
   }

   @Override
   public void method22311(Class39 var1) {
      this.field30729.method32749(this.field30730, var1);
   }

   @Override
   public Class39 method22312() {
      return this.field30729.method32748(this.field30730);
   }

   @Override
   public ITextComponent method22313() {
      return new TranslationTextComponent("commands.data.storage.modified", this.field30730);
   }

   @Override
   public ITextComponent method22314(Class30 var1) {
      return new TranslationTextComponent("commands.data.storage.query", this.field30730, var1.method82());
   }

   @Override
   public ITextComponent method22315(Class9670 var1, double var2, int var4) {
      return new TranslationTextComponent("commands.data.storage.get", var1, this.field30730, String.format(Locale.ROOT, "%.2f", var2), var4);
   }

   // $VF: synthetic method
   public static Class8962 method22321(CommandContext var0) {
      return method22318(var0);
   }

   // $VF: synthetic method
   public Class7153(Class8962 var1, ResourceLocation var2, Class8198 var3) {
      this(var1, var2);
   }

   // $VF: synthetic method
   public static SuggestionProvider method22322() {
      return field30727;
   }
}
