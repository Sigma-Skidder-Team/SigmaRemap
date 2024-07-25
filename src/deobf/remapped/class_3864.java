package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3864 {
   private static final SimpleCommandExceptionType field_18828 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType field_18830 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.recipe.take.failed"));

   public static void method_17912(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("recipe").requires(var0x -> var0x.method_40314(2)))
               .then(
                  class_465.method_2231("give")
                     .then(
                        ((RequiredArgumentBuilder)class_465.method_2236("targets", class_5601.method_25409())
                              .then(
                                 class_465.method_2236("recipe", class_4195.method_19515())
                                    .suggests(class_7510.field_38355)
                                    .executes(
                                       var0x -> method_17911(
                                             (class_9155)var0x.getSource(),
                                             class_5601.method_25412(var0x, "targets"),
                                             Collections.<class_8932<?>>singleton(class_4195.method_19513(var0x, "recipe"))
                                          )
                                    )
                              ))
                           .then(
                              class_465.method_2231("*")
                                 .executes(
                                    var0x -> method_17911(
                                          (class_9155)var0x.getSource(),
                                          class_5601.method_25412(var0x, "targets"),
                                          ((class_9155)var0x.getSource()).method_42177().method_1705().method_23141()
                                       )
                                 )
                           )
                     )
               ))
            .then(
               class_465.method_2231("take")
                  .then(
                     ((RequiredArgumentBuilder)class_465.method_2236("targets", class_5601.method_25409())
                           .then(
                              class_465.method_2236("recipe", class_4195.method_19515())
                                 .suggests(class_7510.field_38355)
                                 .executes(
                                    var0x -> method_17910(
                                          (class_9155)var0x.getSource(),
                                          class_5601.method_25412(var0x, "targets"),
                                          Collections.<class_8932<?>>singleton(class_4195.method_19513(var0x, "recipe"))
                                       )
                                 )
                           ))
                        .then(
                           class_465.method_2231("*")
                              .executes(
                                 var0x -> method_17910(
                                       (class_9155)var0x.getSource(),
                                       class_5601.method_25412(var0x, "targets"),
                                       ((class_9155)var0x.getSource()).method_42177().method_1705().method_23141()
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method_17911(class_9155 var0, Collection<class_9359> var1, Collection<class_8932<?>> var2) throws CommandSyntaxException {
      int var5 = 0;

      for (class_9359 var7 : var1) {
         var5 += var7.method_3223(var2);
      }

      if (var5 != 0) {
         if (var1.size() != 1) {
            var0.method_42196(new TranslationTextComponent("commands.recipe.give.success.multiple", var2.size(), var1.size()), true);
         } else {
            var0.method_42196(
               new TranslationTextComponent("commands.recipe.give.success.single", var2.size(), ((class_9359)var1.iterator().next()).method_19839()), true
            );
         }

         return var5;
      } else {
         throw field_18828.create();
      }
   }

   private static int method_17910(class_9155 var0, Collection<class_9359> var1, Collection<class_8932<?>> var2) throws CommandSyntaxException {
      int var5 = 0;

      for (class_9359 var7 : var1) {
         var5 += var7.method_3197(var2);
      }

      if (var5 != 0) {
         if (var1.size() != 1) {
            var0.method_42196(new TranslationTextComponent("commands.recipe.take.success.multiple", var2.size(), var1.size()), true);
         } else {
            var0.method_42196(
               new TranslationTextComponent("commands.recipe.take.success.single", var2.size(), ((class_9359)var1.iterator().next()).method_19839()), true
            );
         }

         return var5;
      } else {
         throw field_18830.create();
      }
   }
}
