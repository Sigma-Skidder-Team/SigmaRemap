package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class class_6328 {
   public static void method_28895(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("give").requires(var0x -> var0x.method_40314(2)))
            .then(
               class_465.method_2236("targets", class_5601.method_25409())
                  .then(
                     ((RequiredArgumentBuilder)class_465.method_2236("item", class_5663.method_25627())
                           .executes(
                              var0x -> method_28894(
                                    (class_9155)var0x.getSource(), class_5663.method_25625(var0x, "item"), class_5601.method_25412(var0x, "targets"), 1
                                 )
                           ))
                        .then(
                           class_465.method_2236("count", IntegerArgumentType.integer(1))
                              .executes(
                                 var0x -> method_28894(
                                       (class_9155)var0x.getSource(),
                                       class_5663.method_25625(var0x, "item"),
                                       class_5601.method_25412(var0x, "targets"),
                                       IntegerArgumentType.getInteger(var0x, "count")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method_28894(class_9155 var0, class_3238 var1, Collection<class_9359> var2, int var3) throws CommandSyntaxException {
      for (class_9359 var7 : var2) {
         int var8 = var3;

         while (var8 > 0) {
            int var9 = Math.min(var1.method_14834().method_11245(), var8);
            var8 -= var9;
            ItemStack var10 = var1.method_14833(var9, false);
            boolean var11 = var7.inventory.method_32414(var10);
            if (var11 && var10.method_28022()) {
               var10.method_28017(1);
               class_91 var13 = var7.method_3153(var10, false);
               if (var13 != null) {
                  var13.method_246();
               }

               var7.world
                  .method_29528(
                     (class_704)null,
                     var7.getPosX(),
                     var7.method_37309(),
                     var7.getPosZ(),
                     class_463.field_2732,
                     class_562.field_3335,
                     0.2F,
                     ((var7.method_26594().nextFloat() - var7.method_26594().nextFloat()) * 0.7F + 1.0F) * 2.0F
                  );
               var7.field_3869.method_18877();
            } else {
               class_91 var12 = var7.method_3153(var10, false);
               if (var12 != null) {
                  var12.method_250();
                  var12.method_252(var7.method_37328());
               }
            }
         }
      }

      if (var2.size() != 1) {
         var0.method_42196(new TranslationTextComponent("commands.give.success.single", var3, var1.method_14833(var3, false).method_28001(), var2.size()), true);
      } else {
         var0.method_42196(
            new TranslationTextComponent(
               "commands.give.success.single", var3, var1.method_14833(var3, false).method_28001(), ((class_9359)var2.iterator().next()).method_19839()
            ),
            true
         );
      }

      return var2.size();
   }
}
