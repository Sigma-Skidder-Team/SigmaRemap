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

public class Class6752 {
   private static final SimpleCommandExceptionType field29459 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.op.failed"));

   public static void method20581(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder) Commands.method18839("op").requires(var0x -> var0x.method20129(3)))
            .then(
               Commands.method18840("targets", Class7713.method25483())
                  .suggests(
                     (var0x, var1) -> {
                        Class6395 var4 = ((CommandSource)var0x.getSource()).getServer().getPlayerList();
                        return ISuggestionProvider.suggest(
                           var4.getPlayers()
                              .stream()
                              .filter(var1x -> !var4.canSendCommands(var1x.getGameProfile()))
                              .<String>map(var0xx -> var0xx.getGameProfile().getName()),
                           var1
                        );
                     }
                  )
                  .executes(var0x -> method20582((CommandSource)var0x.getSource(), Class7713.method25482(var0x, "targets")))
            )
      );
   }

   private static int method20582(CommandSource var0, Collection<GameProfile> var1) throws CommandSyntaxException {
      Class6395 var4 = var0.getServer().getPlayerList();
      int var5 = 0;

      for (GameProfile var7 : var1) {
         if (!var4.canSendCommands(var7)) {
            var4.method19430(var7);
            var5++;
            var0.sendFeedback(new TranslationTextComponent("commands.op.success", ((GameProfile)var1.iterator().next()).getName()), true);
         }
      }

      if (var5 != 0) {
         return var5;
      } else {
         throw field29459.create();
      }
   }
}
