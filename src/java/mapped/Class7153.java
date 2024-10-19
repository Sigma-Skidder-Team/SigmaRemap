package mapped;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

import net.minecraft.command.CommandSource;
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.storage.CommandStorage;

public class Class7153 implements Class7151 {
   private static final SuggestionProvider<CommandSource> field30727 = (var0, var1) -> ISuggestionProvider.method20143(method22318(var0).method32750(), var1);
   public static final Function<String, Class8196> field30728 = var0 -> new Class8198(var0);
   private final CommandStorage field30729;
   private final ResourceLocation field30730;

   private static CommandStorage method22318(CommandContext<CommandSource> var0) {
      return ((CommandSource)var0.getSource()).getServer().method1410();
   }

   private Class7153(CommandStorage var1, ResourceLocation var2) {
      this.field30729 = var1;
      this.field30730 = var2;
   }

   @Override
   public void method22311(CompoundNBT var1) {
      this.field30729.method32749(this.field30730, var1);
   }

   @Override
   public CompoundNBT method22312() {
      return this.field30729.method32748(this.field30730);
   }

   @Override
   public ITextComponent method22313() {
      return new TranslationTextComponent("commands.data.storage.modified", this.field30730);
   }

   @Override
   public ITextComponent method22314(INBT var1) {
      return new TranslationTextComponent("commands.data.storage.query", this.field30730, var1.toFormattedComponent());
   }

   @Override
   public ITextComponent method22315(Class9670 var1, double var2, int var4) {
      return new TranslationTextComponent("commands.data.storage.get", var1, this.field30730, String.format(Locale.ROOT, "%.2f", var2), var4);
   }

   // $VF: synthetic method
   public static CommandStorage method22321(CommandContext var0) {
      return method22318(var0);
   }

   // $VF: synthetic method
   public Class7153(CommandStorage var1, ResourceLocation var2, Class8198 var3) {
      this(var1, var2);
   }

   // $VF: synthetic method
   public static SuggestionProvider method22322() {
      return field30727;
   }
}
