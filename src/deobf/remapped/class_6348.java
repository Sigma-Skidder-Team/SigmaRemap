package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class class_6348 {
   private static final SimpleCommandExceptionType field_32403 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.experience.set.points.invalid")
   );

   public static void method_29038(CommandDispatcher<class_9155> var0) {
      LiteralCommandNode var3 = var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("experience")
                     .requires(var0x -> var0x.method_40314(2)))
                  .then(
                     class_465.method_2231("add")
                        .then(
                           class_465.method_2236("targets", class_5601.method_25409())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236("amount", IntegerArgumentType.integer())
                                          .executes(
                                             var0x -> method_29036(
                                                   (class_9155)var0x.getSource(),
                                                   class_5601.method_25412(var0x, "targets"),
                                                   IntegerArgumentType.getInteger(var0x, "amount"),
                                                   class_4772.field_23130
                                                )
                                          ))
                                       .then(
                                          class_465.method_2231("points")
                                             .executes(
                                                var0x -> method_29036(
                                                      (class_9155)var0x.getSource(),
                                                      class_5601.method_25412(var0x, "targets"),
                                                      IntegerArgumentType.getInteger(var0x, "amount"),
                                                      class_4772.field_23130
                                                   )
                                             )
                                       ))
                                    .then(
                                       class_465.method_2231("levels")
                                          .executes(
                                             var0x -> method_29036(
                                                   (class_9155)var0x.getSource(),
                                                   class_5601.method_25412(var0x, "targets"),
                                                   IntegerArgumentType.getInteger(var0x, "amount"),
                                                   class_4772.field_23132
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  class_465.method_2231("set")
                     .then(
                        class_465.method_2236("targets", class_5601.method_25409())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236("amount", IntegerArgumentType.integer(0))
                                       .executes(
                                          var0x -> method_29037(
                                                (class_9155)var0x.getSource(),
                                                class_5601.method_25412(var0x, "targets"),
                                                IntegerArgumentType.getInteger(var0x, "amount"),
                                                class_4772.field_23130
                                             )
                                       ))
                                    .then(
                                       class_465.method_2231("points")
                                          .executes(
                                             var0x -> method_29037(
                                                   (class_9155)var0x.getSource(),
                                                   class_5601.method_25412(var0x, "targets"),
                                                   IntegerArgumentType.getInteger(var0x, "amount"),
                                                   class_4772.field_23130
                                                )
                                          )
                                    ))
                                 .then(
                                    class_465.method_2231("levels")
                                       .executes(
                                          var0x -> method_29037(
                                                (class_9155)var0x.getSource(),
                                                class_5601.method_25412(var0x, "targets"),
                                                IntegerArgumentType.getInteger(var0x, "amount"),
                                                class_4772.field_23132
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               class_465.method_2231("query")
                  .then(
                     ((RequiredArgumentBuilder)class_465.method_2236("targets", class_5601.method_25415())
                           .then(
                              class_465.method_2231("points")
                                 .executes(
                                    var0x -> method_29040((class_9155)var0x.getSource(), class_5601.method_25408(var0x, "targets"), class_4772.field_23130)
                                 )
                           ))
                        .then(
                           class_465.method_2231("levels")
                              .executes(var0x -> method_29040((class_9155)var0x.getSource(), class_5601.method_25408(var0x, "targets"), class_4772.field_23132))
                        )
                  )
            )
      );
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("xp").requires(var0x -> var0x.method_40314(2))).redirect(var3));
   }

   private static int method_29040(class_9155 var0, class_9359 var1, class_4772 var2) {
      int var5 = class_4772.method_21992(var2).applyAsInt(var1);
      var0.method_42196(new TranslationTextComponent("commands.experience.query." + var2.field_23129, var1.method_19839(), var5), false);
      return var5;
   }

   private static int method_29036(class_9155 var0, Collection<? extends class_9359> var1, int var2, class_4772 var3) {
      for (class_9359 var7 : var1) {
         var3.field_23128.accept(var7, var2);
      }

      if (var1.size() != 1) {
         var0.method_42196(new TranslationTextComponent("commands.experience.add." + var3.field_23129 + ".success.multiple", var2, var1.size()), true);
      } else {
         var0.method_42196(
            new TranslationTextComponent(
               "commands.experience.add." + var3.field_23129 + ".success.single", var2, ((class_9359)var1.iterator().next()).method_19839()
            ),
            true
         );
      }

      return var1.size();
   }

   private static int method_29037(class_9155 var0, Collection<? extends class_9359> var1, int var2, class_4772 var3) throws CommandSyntaxException {
      int var6 = 0;

      for (class_9359 var8 : var1) {
         if (var3.field_23126.test(var8, var2)) {
            var6++;
         }
      }

      if (var6 != 0) {
         if (var1.size() != 1) {
            var0.method_42196(new TranslationTextComponent("commands.experience.set." + var3.field_23129 + ".success.multiple", var2, var1.size()), true);
         } else {
            var0.method_42196(
               new TranslationTextComponent(
                  "commands.experience.set." + var3.field_23129 + ".success.single", var2, ((class_9359)var1.iterator().next()).method_19839()
               ),
               true
            );
         }

         return var1.size();
      } else {
         throw field_32403.create();
      }
   }
}
