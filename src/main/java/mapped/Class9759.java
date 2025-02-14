package mapped;

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

import net.minecraft.command.ISuggestionProvider;
import net.minecraft.item.Item;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.JSONToNBT;
import net.minecraft.state.Property;
import net.minecraft.tags.ITagCollection;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9759 {
   public static final SimpleCommandExceptionType field45652 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.item.tag.disallowed"));
   public static final DynamicCommandExceptionType field45653 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.item.id.invalid", var0)
   );
   private static final BiFunction<SuggestionsBuilder, ITagCollection<Item>, CompletableFuture<Suggestions>> field45654 = (var0, var1) -> var0.buildFuture();
   private final StringReader field45655;
   private final boolean field45656;
   private final Map<Property<?>, Comparable<?>> field45657 = Maps.newHashMap();
   private Item field45658;
   private CompoundNBT field45659;
   private ResourceLocation field45660 = new ResourceLocation("");
   private int field45661;
   private BiFunction<SuggestionsBuilder, ITagCollection<Item>, CompletableFuture<Suggestions>> field45662 = field45654;

   public Class9759(StringReader var1, boolean var2) {
      this.field45655 = var1;
      this.field45656 = var2;
   }

   public Item method38353() {
      return this.field45658;
   }

   @Nullable
   public CompoundNBT method38354() {
      return this.field45659;
   }

   public ResourceLocation method38355() {
      return this.field45660;
   }

   public void method38356() throws CommandSyntaxException {
      int var3 = this.field45655.getCursor();
      ResourceLocation var4 = ResourceLocation.method8294(this.field45655);
      this.field45658 = Registry.ITEM.method9187(var4).orElseThrow(() -> {
         this.field45655.setCursor(var3);
         return field45653.createWithContext(this.field45655, var4.toString());
      });
   }

   public void method38357() throws CommandSyntaxException {
      if (this.field45656) {
         this.field45662 = this::method38361;
         this.field45655.expect('#');
         this.field45661 = this.field45655.getCursor();
         this.field45660 = ResourceLocation.method8294(this.field45655);
      } else {
         throw field45652.create();
      }
   }

   public void method38358() throws CommandSyntaxException {
      this.field45659 = new JSONToNBT(this.field45655).readStruct();
   }

   public Class9759 method38359() throws CommandSyntaxException {
      this.field45662 = this::method38362;
      if (this.field45655.canRead() && this.field45655.peek() == '#') {
         this.method38357();
      } else {
         this.method38356();
         this.field45662 = this::method38360;
      }

      if (this.field45655.canRead() && this.field45655.peek() == '{') {
         this.field45662 = field45654;
         this.method38358();
      }

      return this;
   }

   private CompletableFuture<Suggestions> method38360(SuggestionsBuilder var1, ITagCollection<Item> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf('{'));
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> method38361(SuggestionsBuilder var1, ITagCollection<Item> var2) {
      return ISuggestionProvider.suggestIterable(var2.getRegisteredTags(), var1.createOffset(this.field45661));
   }

   private CompletableFuture<Suggestions> method38362(SuggestionsBuilder var1, ITagCollection<Item> var2) {
      if (this.field45656) {
         ISuggestionProvider.suggestIterable(var2.getRegisteredTags(), var1, String.valueOf('#'));
      }

      return ISuggestionProvider.suggestIterable(Registry.ITEM.keySet(), var1);
   }

   public CompletableFuture<Suggestions> method38363(SuggestionsBuilder var1, ITagCollection<Item> var2) {
      return this.field45662.apply(var1.createOffset(this.field45655.getCursor()), var2);
   }
}
