package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7822 implements ArgumentType<ResourceLocation> {
   private static final Collection<String> field33563 = Arrays.<String>asList("minecraft:pig", "cow");
   public static final DynamicCommandExceptionType field33564 = new DynamicCommandExceptionType(var0 -> new TranslationTextComponent("entity.notFound", var0));

   public static Class7822 method26155() {
      return new Class7822();
   }

   public static ResourceLocation method26156(CommandContext<Class6619> var0, String var1) throws CommandSyntaxException {
      return method26157((ResourceLocation)var0.getArgument(var1, ResourceLocation.class));
   }

   private static ResourceLocation method26157(ResourceLocation var0) throws CommandSyntaxException {
      Class2348.field16074.method9187(var0).filter(Class8992::method33206).orElseThrow(() -> field33564.create(var0));
      return var0;
   }

   public ResourceLocation parse(StringReader var1) throws CommandSyntaxException {
      return method26157(ResourceLocation.method8294(var1));
   }

   public Collection<String> getExamples() {
      return field33563;
   }
}
