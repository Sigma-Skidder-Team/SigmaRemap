package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.JSONToNBT;

import java.util.Arrays;
import java.util.Collection;

public class Class8780 implements ArgumentType<INBT> {
   private static final Collection<String> field39489 = Arrays.<String>asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private Class8780() {
   }

   public static Class8780 method31660() {
      return new Class8780();
   }

   public static <S> INBT method31661(CommandContext<S> var0, String var1) {
      return (INBT)var0.getArgument(var1, INBT.class);
   }

   public INBT parse(StringReader var1) throws CommandSyntaxException {
      return new JSONToNBT(var1).readValue();
   }

   public Collection<String> getExamples() {
      return field39489;
   }
}
