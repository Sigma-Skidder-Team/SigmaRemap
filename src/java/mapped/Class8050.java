package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

import net.minecraft.command.CommandSource;
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.particles.IParticleData;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8050 implements ArgumentType<IParticleData> {
   private static final Collection<String> field34574 = Arrays.<String>asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType field34575 = new DynamicCommandExceptionType(var0 -> new TranslationTextComponent("particle.notFound", var0));

   public static Class8050 method27648() {
      return new Class8050();
   }

   public static IParticleData method27649(CommandContext<CommandSource> var0, String var1) {
      return (IParticleData)var0.getArgument(var1, IParticleData.class);
   }

   public IParticleData parse(StringReader var1) throws CommandSyntaxException {
      return method27650(var1);
   }

   public Collection<String> getExamples() {
      return field34574;
   }

   public static IParticleData method27650(StringReader var0) throws CommandSyntaxException {
      ResourceLocation var3 = ResourceLocation.method8294(var0);
      ParticleType var4 = Registry.PARTICLE_TYPE.method9187(var3).orElseThrow(() -> field34575.create(var3));
      return method27651(var0, var4);
   }

   private static <T extends IParticleData> T method27651(StringReader var0, ParticleType<T> var1) throws CommandSyntaxException {
      return (T)var1.getDeserializer().deserialize(var1, var0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return ISuggestionProvider.suggestIterable(Registry.PARTICLE_TYPE.keySet(), var2);
   }
}
