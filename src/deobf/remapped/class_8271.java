package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.filter.IChatFilter;

public class class_8271 {
   public static void method_38129(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)class_465.method_2231("me")
            .then(
               class_465.method_2236("action", StringArgumentType.greedyString())
                  .executes(
                     var0x -> {
                        String var3 = StringArgumentType.getString(var0x, "action");
                        class_8145 var4 = ((class_9155)var0x.getSource()).method_42200();
                        class_341 var5 = ((class_9155)var0x.getSource()).method_42177();
                        if (var4 == null) {
                           var5.method_1600().method_39983(method_38130(var0x, var3), ChatType.SYSTEM, class_9665.field_49232);
                        } else {
                           if (var4 instanceof class_9359) {
                              IChatFilter var6 = ((class_9359)var4).method_43257();
                              if (var6 != null) {
                                 var6.func_244432_a(var3)
                                    .thenAcceptAsync(
                                       var3x -> var3x.ifPresent(
                                             var3xx -> var5.method_1600().method_39983(method_38130(var0x, var3xx), ChatType.CHAT, var4.method_37328())
                                          ),
                                       var5
                                    );
                                 return 1;
                              }
                           }

                           var5.method_1600().method_39983(method_38130(var0x, var3), ChatType.CHAT, var4.method_37328());
                        }

                        return 1;
                     }
                  )
            )
      );
   }

   private static ITextComponent method_38130(CommandContext<class_9155> var0, String var1) {
      return new TranslationTextComponent("chat.type.emote", ((class_9155)var0.getSource()).method_42189(), var1);
   }
}
