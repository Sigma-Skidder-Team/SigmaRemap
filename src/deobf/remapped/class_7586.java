package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7586 {
   public static void method_34473(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("list").executes(var0x -> method_34474((class_9155)var0x.getSource())))
            .then(class_465.method_2231("uuids").executes(var0x -> method_34472((class_9155)var0x.getSource())))
      );
   }

   private static int method_34474(class_9155 var0) {
      return method_34475(var0, class_704::method_19839);
   }

   private static int method_34472(class_9155 var0) {
      return method_34475(var0, var0x -> new TranslationTextComponent("commands.list.nameAndId", var0x.method_45509(), var0x.method_3247().getId()));
   }

   private static int method_34475(class_9155 var0, Function<class_9359, ITextComponent> var1) {
      class_8704 var4 = var0.method_42177().method_1600();
      List var5 = var4.method_39951();
      IFormattableTextComponent var6 = TextComponentUtils.func_240649_b_(var5, var1);
      var0.method_42196(new TranslationTextComponent("commands.list.players", var5.size(), var4.method_39963(), var6), false);
      return var5.size();
   }
}
