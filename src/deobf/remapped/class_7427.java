package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7427 {
   public static final SimpleCommandExceptionType field_37896 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.replaceitem.block.failed")
   );
   public static final DynamicCommandExceptionType field_37897 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.replaceitem.slot.inapplicable", var0)
   );
   public static final Dynamic2CommandExceptionType field_37899 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("commands.replaceitem.entity.failed", var0, var1)
   );

   public static void method_33818(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("replaceitem")
                  .requires(var0x -> var0x.method_40314(2)))
               .then(
                  class_465.method_2231("block")
                     .then(
                        class_465.method_2236("pos", class_1024.method_4522())
                           .then(
                              class_465.method_2236("slot", class_237.method_1011())
                                 .then(
                                    ((RequiredArgumentBuilder)class_465.method_2236("item", class_5663.method_25627())
                                          .executes(
                                             var0x -> method_33819(
                                                   (class_9155)var0x.getSource(),
                                                   class_1024.method_4519(var0x, "pos"),
                                                   class_237.method_1013(var0x, "slot"),
                                                   class_5663.method_25625(var0x, "item").method_14833(1, false)
                                                )
                                          ))
                                       .then(
                                          class_465.method_2236("count", IntegerArgumentType.integer(1, 64))
                                             .executes(
                                                var0x -> method_33819(
                                                      (class_9155)var0x.getSource(),
                                                      class_1024.method_4519(var0x, "pos"),
                                                      class_237.method_1013(var0x, "slot"),
                                                      class_5663.method_25625(var0x, "item").method_14833(IntegerArgumentType.getInteger(var0x, "count"), true)
                                                   )
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               class_465.method_2231("entity")
                  .then(
                     class_465.method_2236("targets", class_5601.method_25407())
                        .then(
                           class_465.method_2236("slot", class_237.method_1011())
                              .then(
                                 ((RequiredArgumentBuilder)class_465.method_2236("item", class_5663.method_25627())
                                       .executes(
                                          var0x -> method_33820(
                                                (class_9155)var0x.getSource(),
                                                class_5601.method_25410(var0x, "targets"),
                                                class_237.method_1013(var0x, "slot"),
                                                class_5663.method_25625(var0x, "item").method_14833(1, false)
                                             )
                                       ))
                                    .then(
                                       class_465.method_2236("count", IntegerArgumentType.integer(1, 64))
                                          .executes(
                                             var0x -> method_33820(
                                                   (class_9155)var0x.getSource(),
                                                   class_5601.method_25410(var0x, "targets"),
                                                   class_237.method_1013(var0x, "slot"),
                                                   class_5663.method_25625(var0x, "item").method_14833(IntegerArgumentType.getInteger(var0x, "count"), true)
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method_33819(class_9155 var0, class_1331 var1, int var2, ItemStack var3) throws CommandSyntaxException {
      class_3757 var6 = var0.method_42198().method_28260(var1);
      if (var6 instanceof class_6867) {
         class_6867 var7 = (class_6867)var6;
         if (var2 >= 0 && var2 < var7.method_31505()) {
            var7.method_31503(var2, var3);
            var0.method_42196(
               new TranslationTextComponent(
                  "commands.replaceitem.block.success", var1.method_12173(), var1.method_12165(), var1.method_12185(), var3.method_28001()
               ),
               true
            );
            return 1;
         } else {
            throw field_37897.create(var2);
         }
      } else {
         throw field_37896.create();
      }
   }

   private static int method_33820(class_9155 var0, Collection<? extends Entity> var1, int var2, ItemStack var3) throws CommandSyntaxException {
      ArrayList var6 = Lists.newArrayListWithCapacity(var1.size());

      for (Entity var8 : var1) {
         if (var8 instanceof class_9359) {
            ((class_9359)var8).field_3869.method_18877();
         }

         if (var8.method_37166(var2, var3.method_27973())) {
            var6.add(var8);
            if (var8 instanceof class_9359) {
               ((class_9359)var8).field_3869.method_18877();
            }
         }
      }

      if (!var6.isEmpty()) {
         if (var6.size() != 1) {
            var0.method_42196(new TranslationTextComponent("commands.replaceitem.entity.success.multiple", var6.size(), var3.method_28001()), true);
         } else {
            var0.method_42196(
               new TranslationTextComponent(
                  "commands.replaceitem.entity.success.single", ((Entity)var6.iterator().next()).method_19839(), var3.method_28001()
               ),
               true
            );
         }

         return var6.size();
      } else {
         throw field_37899.create(var3.method_28001(), var2);
      }
   }
}
