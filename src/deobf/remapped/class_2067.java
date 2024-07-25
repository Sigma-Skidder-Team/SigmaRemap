package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.UUID;
import java.util.function.Consumer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2067 {
   public static void method_9660(CommandDispatcher<class_9155> var0) {
      LiteralCommandNode var3 = var0.register(
         (LiteralArgumentBuilder)class_465.method_2231("msg")
            .then(
               class_465.method_2236("targets", class_5601.method_25409())
                  .then(
                     class_465.method_2236("message", class_1282.method_5728())
                        .executes(
                           var0x -> method_9658(
                                 (class_9155)var0x.getSource(), class_5601.method_25412(var0x, "targets"), class_1282.method_5729(var0x, "message")
                              )
                        )
                  )
            )
      );
      var0.register((LiteralArgumentBuilder)class_465.method_2231("tell").redirect(var3));
      var0.register((LiteralArgumentBuilder)class_465.method_2231("w").redirect(var3));
   }

   private static int method_9658(class_9155 var0, Collection<class_9359> var1, ITextComponent var2) {
      UUID var5 = var0.method_42200() != null ? var0.method_42200().method_37328() : Util.NIL_UUID;
      class_8145 var6 = var0.method_42200();
      Consumer var7;
      if (!(var6 instanceof class_9359)) {
         var7 = var2x -> var0.method_42196(
               new TranslationTextComponent("commands.message.display.outgoing", var2x, var2)
                  .mergeStyle(new TextFormatting[]{TextFormatting.GRAY, TextFormatting.ITALIC}),
               false
            );
      } else {
         class_9359 var8 = (class_9359)var6;
         var7 = var2x -> var8.method_26286(
               new TranslationTextComponent("commands.message.display.outgoing", var2x, var2)
                  .mergeStyle(new TextFormatting[]{TextFormatting.GRAY, TextFormatting.ITALIC}),
               var8.method_37328()
            );
      }

      for (class_9359 var9 : var1) {
         var7.accept(var9.method_19839());
         var9.method_26286(
            new TranslationTextComponent("commands.message.display.incoming", var0.method_42189(), var2)
               .mergeStyle(new TextFormatting[]{TextFormatting.GRAY, TextFormatting.ITALIC}),
            var5
         );
      }

      return var1.size();
   }
}
