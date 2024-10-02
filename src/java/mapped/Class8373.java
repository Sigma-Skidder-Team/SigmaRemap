package mapped;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

import net.minecraft.command.CommandSource;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8373 {
   private static final SimpleCommandExceptionType field35935 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.pardon.failed"));

   public static void method29330(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("pardon").requires(var0x -> var0x.method20129(3)))
            .then(
               Class6099.method18840("targets", Class7713.method25483())
                  .suggests((var0x, var1) -> Class6618.method20149(((CommandSource)var0x.getSource()).method20177().getPlayerList().method19461().method14432(), var1))
                  .executes(var0x -> method29331((CommandSource)var0x.getSource(), Class7713.method25482(var0x, "targets")))
            )
      );
   }

   private static int method29331(CommandSource var0, Collection<GameProfile> var1) throws CommandSyntaxException {
      Class4528 var4 = var0.method20177().getPlayerList().method19461();
      int var5 = 0;

      for (GameProfile var7 : var1) {
         if (var4.method14431(var7)) {
            var4.method14438(var7);
            var5++;
            var0.method20179(new TranslationTextComponent("commands.pardon.success", TextComponentUtils.getDisplayName(var7)), true);
         }
      }

      if (var5 != 0) {
         return var5;
      } else {
         throw field35935.create();
      }
   }
}
