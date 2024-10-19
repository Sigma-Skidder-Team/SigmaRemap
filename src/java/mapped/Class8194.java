package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

import net.minecraft.command.CommandSource;
import net.minecraft.command.arguments.ResourceLocationArgument;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8194 {
   private static final SimpleCommandExceptionType field35220 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType field35221 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.recipe.take.failed"));

   public static void method28495(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder) Commands.method18839("recipe").requires(var0x -> var0x.method20129(2)))
               .then(
                  Commands.method18839("give")
                     .then(
                        ((RequiredArgumentBuilder) Commands.method18840("targets", Class8700.method31353())
                              .then(
                                 Commands.method18840("recipe", ResourceLocationArgument.method29031())
                                    .suggests(Class9222.field42454)
                                    .executes(
                                       var0x -> method28496(
                                             (CommandSource)var0x.getSource(),
                                             Class8700.method31354(var0x, "targets"),
                                             Collections.<IRecipe<?>>singleton(ResourceLocationArgument.method29033(var0x, "recipe"))
                                          )
                                    )
                              ))
                           .then(
                              Commands.method18839("*")
                                 .executes(
                                    var0x -> method28496(
                                          (CommandSource)var0x.getSource(),
                                          Class8700.method31354(var0x, "targets"),
                                          ((CommandSource)var0x.getSource()).getServer().method1407().method1036()
                                       )
                                 )
                           )
                     )
               ))
            .then(
               Commands.method18839("take")
                  .then(
                     ((RequiredArgumentBuilder) Commands.method18840("targets", Class8700.method31353())
                           .then(
                              Commands.method18840("recipe", ResourceLocationArgument.method29031())
                                 .suggests(Class9222.field42454)
                                 .executes(
                                    var0x -> method28497(
                                          (CommandSource)var0x.getSource(),
                                          Class8700.method31354(var0x, "targets"),
                                          Collections.<IRecipe<?>>singleton(ResourceLocationArgument.method29033(var0x, "recipe"))
                                       )
                                 )
                           ))
                        .then(
                           Commands.method18839("*")
                              .executes(
                                 var0x -> method28497(
                                       (CommandSource)var0x.getSource(),
                                       Class8700.method31354(var0x, "targets"),
                                       ((CommandSource)var0x.getSource()).getServer().method1407().method1036()
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method28496(CommandSource var0, Collection<ServerPlayerEntity> var1, Collection<IRecipe<?>> var2) throws CommandSyntaxException {
      int var5 = 0;

      for (ServerPlayerEntity var7 : var1) {
         var5 += var7.method2778(var2);
      }

      if (var5 != 0) {
         if (var1.size() != 1) {
            var0.sendFeedback(new TranslationTextComponent("commands.recipe.give.success.multiple", var2.size(), var1.size()), true);
         } else {
            var0.sendFeedback(
               new TranslationTextComponent("commands.recipe.give.success.single", var2.size(), ((ServerPlayerEntity)var1.iterator().next()).getDisplayName()), true
            );
         }

         return var5;
      } else {
         throw field35220.create();
      }
   }

   private static int method28497(CommandSource var0, Collection<ServerPlayerEntity> var1, Collection<IRecipe<?>> var2) throws CommandSyntaxException {
      int var5 = 0;

      for (ServerPlayerEntity var7 : var1) {
         var5 += var7.method2780(var2);
      }

      if (var5 != 0) {
         if (var1.size() != 1) {
            var0.sendFeedback(new TranslationTextComponent("commands.recipe.take.success.multiple", var2.size(), var1.size()), true);
         } else {
            var0.sendFeedback(
               new TranslationTextComponent("commands.recipe.take.success.single", var2.size(), ((ServerPlayerEntity)var1.iterator().next()).getDisplayName()), true
            );
         }

         return var5;
      } else {
         throw field35221.create();
      }
   }
}
