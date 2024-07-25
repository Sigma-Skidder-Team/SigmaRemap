package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_8641 {
   public static void method_39647(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("say").requires(var0x -> var0x.method_40314(2)))
            .then(class_465.method_2236("message", class_1282.method_5728()).executes(var0x -> {
               ITextComponent var3 = class_1282.method_5729(var0x, "message");
               TranslationTextComponent var4 = new TranslationTextComponent("chat.type.announcement", ((class_9155)var0x.getSource()).method_42189(), var3);
               class_8145 var5 = ((class_9155)var0x.getSource()).method_42200();
               if (var5 == null) {
                  ((class_9155)var0x.getSource()).method_42177().method_1600().method_39983(var4, ChatType.SYSTEM, Util.NIL_UUID);
               } else {
                  ((class_9155)var0x.getSource()).method_42177().method_1600().method_39983(var4, ChatType.CHAT, var5.method_37328());
               }

               return 1;
            }))
      );
   }
}
