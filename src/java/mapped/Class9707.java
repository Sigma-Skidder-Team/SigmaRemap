package mapped;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

import net.minecraft.command.CommandSource;
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9707 {
   private static final SimpleCommandExceptionType field45372 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.deop.failed"));

   public static void method38035(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder) Commands.method18839("deop").requires(var0x -> var0x.method20129(3)))
            .then(
               Commands.method18840("targets", Class7713.method25483())
                  .suggests((var0x, var1) -> ISuggestionProvider.suggest(((CommandSource)var0x.getSource()).getServer().getPlayerList().method19471(), var1))
                  .executes(var0x -> method38036((CommandSource)var0x.getSource(), Class7713.method25482(var0x, "targets")))
            )
      );
   }

   private static int method38036(CommandSource var0, Collection<GameProfile> var1) throws CommandSyntaxException {
      Class6395 var4 = var0.getServer().getPlayerList();
      int var5 = 0;

      for (GameProfile var7 : var1) {
         if (var4.canSendCommands(var7)) {
            var4.method19431(var7);
            var5++;
            var0.sendFeedback(new TranslationTextComponent("commands.deop.success", ((GameProfile)var1.iterator().next()).getName()), true);
         }
      }

      if (var5 != 0) {
         var0.getServer().method1401(var0);
         return var5;
      } else {
         throw field45372.create();
      }
   }
}
