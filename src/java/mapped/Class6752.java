package mapped;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class Class6752 {
   private static final SimpleCommandExceptionType field29459 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.op.failed"));

   public static void method20581(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("op").requires(var0x -> var0x.method20129(3)))
            .then(
               Class6099.method18840("targets", Class7713.method25483())
                  .suggests(
                     (var0x, var1) -> {
                        Class6395 var4 = ((Class6619)var0x.getSource()).method20177().getPlayerList();
                        return Class6618.method20148(
                           var4.method19488()
                              .stream()
                              .filter(var1x -> !var4.canSendCommands(var1x.getGameProfile()))
                              .<String>map(var0xx -> var0xx.getGameProfile().getName()),
                           var1
                        );
                     }
                  )
                  .executes(var0x -> method20582((Class6619)var0x.getSource(), Class7713.method25482(var0x, "targets")))
            )
      );
   }

   private static int method20582(Class6619 var0, Collection<GameProfile> var1) throws CommandSyntaxException {
      Class6395 var4 = var0.method20177().getPlayerList();
      int var5 = 0;

      for (GameProfile var7 : var1) {
         if (!var4.canSendCommands(var7)) {
            var4.method19430(var7);
            var5++;
            var0.method20179(new TranslationTextComponent("commands.op.success", ((GameProfile)var1.iterator().next()).getName()), true);
         }
      }

      if (var5 != 0) {
         return var5;
      } else {
         throw field29459.create();
      }
   }
}
