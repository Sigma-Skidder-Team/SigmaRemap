package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.util.text.TextComponentUtils;

public class Class8957 {
   public static void method32725(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("tellraw").requires(var0x -> var0x.method20129(2)))
            .then(
               Class6099.method18840("targets", Class8700.method31353())
                  .then(
                     Class6099.method18840("message", Class8010.method27395())
                        .executes(
                           var0x -> {
                              int var3 = 0;

                              for (ServerPlayerEntity var5 : Class8700.method31354(var0x, "targets")) {
                                 var5.sendMessage(
                                    TextComponentUtils.func_240645_a_((Class6619)var0x.getSource(), Class8010.method27394(var0x, "message"), var5, 0),
                                    Util.DUMMY_UUID
                                 );
                                 var3++;
                              }

                              return var3;
                           }
                        )
                  )
            )
      );
   }
}
