package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.filter.IChatFilter;

public class Class9410 {
   public static void method36043(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)Class6099.method18839("me")
            .then(
               Class6099.method18840("action", StringArgumentType.greedyString())
                  .executes(
                     var0x -> {
                        String var3 = StringArgumentType.getString(var0x, "action");
                        Entity var4 = ((Class6619)var0x.getSource()).method20173();
                        Class314 var5 = ((Class6619)var0x.getSource()).method20177();
                        if (var4 == null) {
                           var5.getPlayerList().method19484(method36044(var0x, var3), ChatType.SYSTEM, Util.field45724);
                        } else {
                           if (var4 instanceof Class878) {
                              IChatFilter var6 = ((Class878)var4).method2837();
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

   private static ITextComponent method36044(CommandContext<Class6619> var0, String var1) {
      return new TranslationTextComponent("chat.type.emote", ((Class6619)var0.getSource()).method20169(), var1);
   }
}
