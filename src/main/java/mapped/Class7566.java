package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Collection;

import net.minecraft.command.CommandSource;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7566 implements ArgumentType<Class7352> {
   private static final Collection<String> field32497 = Arrays.<String>asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType field32498 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("arguments.function.tag.unknown", var0)
   );
   private static final DynamicCommandExceptionType field32499 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("arguments.function.unknown", var0)
   );

   public static Class7566 method24766() {
      return new Class7566();
   }

   public Class7352 parse(StringReader var1) throws CommandSyntaxException {
      if (var1.canRead() && var1.peek() == '#') {
         var1.skip();
         ResourceLocation var5 = ResourceLocation.method8294(var1);
         return new Class7351(this, var5);
      } else {
         ResourceLocation var4 = ResourceLocation.method8294(var1);
         return new Class7353(this, var4);
      }
   }

   private static Class7744 method24767(CommandContext<CommandSource> var0, ResourceLocation var1) throws CommandSyntaxException {
      return ((CommandSource)var0.getSource()).getServer().method1397().method22829(var1).orElseThrow(() -> field32499.create(var1.toString()));
   }

   private static ITag<Class7744> method24768(CommandContext<CommandSource> var0, ResourceLocation var1) throws CommandSyntaxException {
      ITag var4 = ((CommandSource)var0.getSource()).getServer().method1397().method22830(var1);
      if (var4 != null) {
         return var4;
      } else {
         throw field32498.create(var1.toString());
      }
   }

   public static Collection<Class7744> method24769(CommandContext<CommandSource> var0, String var1) throws CommandSyntaxException {
      return ((Class7352)var0.getArgument(var1, Class7352.class)).method23305(var0);
   }

   public static Pair<ResourceLocation, Either<Class7744, ITag<Class7744>>> method24770(CommandContext<CommandSource> var0, String var1) throws CommandSyntaxException {
      return ((Class7352)var0.getArgument(var1, Class7352.class)).method23306(var0);
   }

   public Collection<String> getExamples() {
      return field32497;
   }

   // $VF: synthetic method
   public static ITag method24774(CommandContext var0, ResourceLocation var1) throws CommandSyntaxException {
      return method24768(var0, var1);
   }

   // $VF: synthetic method
   public static Class7744 method24775(CommandContext var0, ResourceLocation var1) throws CommandSyntaxException {
      return method24767(var0, var1);
   }
}
