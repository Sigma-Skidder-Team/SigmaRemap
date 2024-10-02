package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.client.util.Util;
import net.minecraft.command.CommandSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.filter.IChatFilter;

public class Class9410 {
   public static void method36043(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)Class6099.method18839("me")
            .then(
               Class6099.method18840("action", StringArgumentType.greedyString())
                  .executes(
                     var0x -> {
                        String var3 = StringArgumentType.getString(var0x, "action");
                        Entity var4 = ((CommandSource)var0x.getSource()).method20173();
                        MinecraftServer var5 = ((CommandSource)var0x.getSource()).method20177();
                        if (var4 == null) {
                           var5.getPlayerList().method19484(method36044(var0x, var3), ChatType.SYSTEM, Util.DUMMY_UUID);
                        } else {
                           if (var4 instanceof ServerPlayerEntity) {
                              IChatFilter var6 = ((ServerPlayerEntity)var4).method2837();
                              if (var6 != null) {
                                 var6.func_244432_a(var3)
                                    .thenAcceptAsync(
                                       var3x -> var3x.ifPresent(
                                             var3xx -> var5.getPlayerList().method19484(method36044(var0x, var3xx), ChatType.CHAT, var4.getUniqueID())
                                          ),
                                       var5
                                    );
                                 return 1;
                              }
                           }

                           var5.getPlayerList().method19484(method36044(var0x, var3), ChatType.CHAT, var4.getUniqueID());
                        }

                        return 1;
                     }
                  )
            )
      );
   }

   private static ITextComponent method36044(CommandContext<CommandSource> var0, String var1) {
      return new TranslationTextComponent("chat.type.emote", ((CommandSource)var0.getSource()).method20169(), var1);
   }
}
