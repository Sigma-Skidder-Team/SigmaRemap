package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;

import net.minecraft.command.CommandSource;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7679 {
   public static void method25264(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder) Commands.method18839("kick").requires(var0x -> var0x.method20129(3)))
            .then(
               ((RequiredArgumentBuilder) Commands.method18840("targets", Class8700.method31353())
                     .executes(
                        var0x -> method25265(
                              (CommandSource)var0x.getSource(),
                              Class8700.method31354(var0x, "targets"),
                              new TranslationTextComponent("multiplayer.disconnect.kicked")
                           )
                     ))
                  .then(
                     Commands.method18840("reason", Class7026.method21755())
                        .executes(
                           var0x -> method25265((CommandSource)var0x.getSource(), Class8700.method31354(var0x, "targets"), Class7026.method21756(var0x, "reason"))
                        )
                  )
            )
      );
   }

   private static int method25265(CommandSource var0, Collection<ServerPlayerEntity> var1, ITextComponent var2) {
      for (ServerPlayerEntity var6 : var1) {
         var6.connection.disconnect(var2);
         var0.sendFeedback(new TranslationTextComponent("commands.kick.success", var6.getDisplayName(), var2), true);
      }

      return var1.size();
   }
}
