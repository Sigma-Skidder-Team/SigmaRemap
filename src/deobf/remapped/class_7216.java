package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7216 {
   public static void method_33054(CommandDispatcher<class_9155> var0) {
      LiteralArgumentBuilder var3 = (LiteralArgumentBuilder)class_465.method_2231("defaultgamemode").requires(var0x -> var0x.method_40314(2));

      for (class_4666 var7 : class_4666.values()) {
         if (var7 != class_4666.field_22762) {
            var3.then(class_465.method_2231(var7.method_21588()).executes(var1 -> method_33056((class_9155)var1.getSource(), var7)));
         }
      }

      var0.register(var3);
   }

   private static int method_33056(class_9155 var0, class_4666 var1) {
      int var4 = 0;
      class_341 var5 = var0.method_42177();
      var5.method_1716(var1);
      if (var5.method_1621()) {
         for (class_9359 var7 : var5.method_1600().method_39951()) {
            if (var7.field_47807.method_39517() != var1) {
               var7.method_3155(var1);
               var4++;
            }
         }
      }

      var0.method_42196(new TranslationTextComponent("commands.defaultgamemode.success", var1.method_21592()), true);
      return var4;
   }
}
