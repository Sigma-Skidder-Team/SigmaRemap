package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2425 {
   public static void method_11053(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("kick").requires(var0x -> var0x.method_40314(3)))
            .then(
               ((RequiredArgumentBuilder)class_465.method_2236("targets", class_5601.method_25409())
                     .executes(
                        var0x -> method_11052(
                              (class_9155)var0x.getSource(),
                              class_5601.method_25412(var0x, "targets"),
                              new TranslationTextComponent("multiplayer.disconnect.kicked")
                           )
                     ))
                  .then(
                     class_465.method_2236("reason", class_1282.method_5728())
                        .executes(
                           var0x -> method_11052(
                                 (class_9155)var0x.getSource(), class_5601.method_25412(var0x, "targets"), class_1282.method_5729(var0x, "reason")
                              )
                        )
                  )
            )
      );
   }

   private static int method_11052(class_9155 var0, Collection<class_9359> var1, ITextComponent var2) {
      for (class_9359 var6 : var1) {
         var6.field_47794.method_4161(var2);
         var0.method_42196(new TranslationTextComponent("commands.kick.success", var6.method_19839(), var2), true);
      }

      return var1.size();
   }
}
