package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class class_1321 {
   public static void method_6034(CommandDispatcher<class_9155> var0) {
      RequiredArgumentBuilder var3 = (RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236("targets", class_5601.method_25409())
            .executes(var0x -> method_6033((class_9155)var0x.getSource(), class_5601.method_25412(var0x, "targets"), (class_562)null, (Identifier)null)))
         .then(
            class_465.method_2231("*")
               .then(
                  class_465.method_2236("sound", class_4195.method_19515())
                     .suggests(class_7510.field_38351)
                     .executes(
                        var0x -> method_6033(
                              (class_9155)var0x.getSource(),
                              class_5601.method_25412(var0x, "targets"),
                              (class_562)null,
                              class_4195.method_19511(var0x, "sound")
                           )
                     )
               )
         );

      for (class_562 var7 : class_562.values()) {
         var3.then(
            ((LiteralArgumentBuilder)class_465.method_2231(var7.method_2681())
                  .executes(var1 -> method_6033((class_9155)var1.getSource(), class_5601.method_25412(var1, "targets"), var7, (Identifier)null)))
               .then(
                  class_465.method_2236("sound", class_4195.method_19515())
                     .suggests(class_7510.field_38351)
                     .executes(
                        var1 -> method_6033(
                              (class_9155)var1.getSource(), class_5601.method_25412(var1, "targets"), var7, class_4195.method_19511(var1, "sound")
                           )
                     )
               )
         );
      }

      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("stopsound").requires(var0x -> var0x.method_40314(2))).then(var3));
   }

   private static int method_6033(class_9155 var0, Collection<class_9359> var1, class_562 var2, Identifier var3) {
      class_4935 var6 = new class_4935(var3, var2);

      for (class_9359 var8 : var1) {
         var8.field_47794.method_4156(var6);
      }

      if (var2 == null) {
         if (var3 == null) {
            var0.method_42196(new TranslationTextComponent("commands.stopsound.success.sourceless.any"), true);
         } else {
            var0.method_42196(new TranslationTextComponent("commands.stopsound.success.sourceless.sound", var3), true);
         }
      } else if (var3 == null) {
         var0.method_42196(new TranslationTextComponent("commands.stopsound.success.source.any", var2.method_2681()), true);
      } else {
         var0.method_42196(new TranslationTextComponent("commands.stopsound.success.source.sound", var3, var2.method_2681()), true);
      }

      return var1.size();
   }
}
