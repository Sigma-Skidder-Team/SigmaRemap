package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.util.text.TextComponentUtils;

public class class_6515 {
   public static void method_29691(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("tellraw").requires(var0x -> var0x.method_40314(2)))
            .then(
               class_465.method_2236("targets", class_5601.method_25409())
                  .then(
                     class_465.method_2236("message", class_3352.method_15361())
                        .executes(
                           var0x -> {
                              int var3 = 0;

                              for (class_9359 var5 : class_5601.method_25412(var0x, "targets")) {
                                 var5.method_26286(
                                    TextComponentUtils.func_240645_a_((class_9155)var0x.getSource(), class_3352.method_15360(var0x, "message"), var5, 0),
                                    class_9665.field_49232
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
