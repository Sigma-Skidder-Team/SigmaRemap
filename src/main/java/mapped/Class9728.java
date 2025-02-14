package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.minecraft.command.CommandSource;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9728 implements ArgumentType<UUID> {
   public static final SimpleCommandExceptionType field45430 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.uuid.invalid"));
   private static final Collection<String> field45431 = Arrays.<String>asList("dd12be42-52a9-4a91-a8a1-11c01849e498");
   private static final Pattern field45432 = Pattern.compile("^([-A-Fa-f0-9]+)");

   public static UUID method38109(CommandContext<CommandSource> var0, String var1) {
      return (UUID)var0.getArgument(var1, UUID.class);
   }

   public static Class9728 method38110() {
      return new Class9728();
   }

   public UUID parse(StringReader var1) throws CommandSyntaxException {
      String var4 = var1.getRemaining();
      Matcher var5 = field45432.matcher(var4);
      if (var5.find()) {
         String var6 = var5.group(1);

         try {
            UUID var7 = UUID.fromString(var6);
            var1.setCursor(var1.getCursor() + var6.length());
            return var7;
         } catch (IllegalArgumentException var8) {
         }
      }

      throw field45430.create();
   }

   public Collection<String> getExamples() {
      return field45431;
   }
}
