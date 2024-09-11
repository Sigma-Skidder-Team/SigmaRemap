package mapped;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Date;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8508 {
   private static final SimpleCommandExceptionType field37206 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.ban.failed"));

   public static void method30139(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("ban").requires(var0x -> var0x.method20129(3)))
            .then(
               ((RequiredArgumentBuilder)Class6099.method18840("targets", Class7713.method25483())
                     .executes(var0x -> method30140((Class6619)var0x.getSource(), Class7713.method25482(var0x, "targets"), (ITextComponent)null)))
                  .then(
                     Class6099.method18840("reason", Class7026.method21755())
                        .executes(
                           var0x -> method30140((Class6619)var0x.getSource(), Class7713.method25482(var0x, "targets"), Class7026.method21756(var0x, "reason"))
                        )
                  )
            )
      );
   }

   private static int method30140(Class6619 var0, Collection<GameProfile> var1, ITextComponent var2) throws CommandSyntaxException {
      Class4528 var5 = var0.method20177().getPlayerList().method19461();
      int var6 = 0;

      for (GameProfile var8 : var1) {
         if (!var5.method14431(var8)) {
            Class6786 var9 = new Class6786(var8, (Date)null, var0.method20170(), (Date)null, var2 != null ? var2.getString() : null);
            var5.method14436(var9);
            var6++;
            var0.method20179(new TranslationTextComponent("commands.ban.success", TextComponentUtils.getDisplayName(var8), var9.method20683()), true);
            ServerPlayerEntity var10 = var0.method20177().getPlayerList().method19489(var8.getId());
            if (var10 != null) {
               var10.field4855.disconnect(new TranslationTextComponent("multiplayer.disconnect.banned"));
            }
         }
      }

      if (var6 != 0) {
         return var6;
      } else {
         throw field37206.create();
      }
   }
}
