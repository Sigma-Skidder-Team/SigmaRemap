package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.minecraft.advancements.Advancement;
import net.minecraft.command.CommandSource;
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.command.arguments.ResourceLocationArgument;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7848 {
   private static final SuggestionProvider<CommandSource> field33657 = (var0, var1) -> {
      Collection<Advancement> var4 = var0.getSource().getServer().method1396().method1066();
      return ISuggestionProvider.method20143(var4.stream().map(Advancement::getId), var1);
   };

   public static void method26285(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder) ((LiteralArgumentBuilder) Commands.method18839("advancement").requires(var0x -> var0x.method20129(2)))
               .then(
                  Commands.method18839("grant")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder) Commands.method18840(
                                          "targets", Class8700.method31353()
                                       )
                                       .then(
                                          Commands.method18839("only")
                                             .then(
                                                ((RequiredArgumentBuilder) Commands.method18840("advancement", ResourceLocationArgument.method29031())
                                                      .suggests(field33657)
                                                      .executes(
                                                         var0x -> method26286(
                                                               (CommandSource)var0x.getSource(),
                                                               Class8700.method31354(var0x, "targets"),
                                                               Class2289.field15224,
                                                               method26288(ResourceLocationArgument.method29032(var0x, "advancement"), Class2028.field13162)
                                                            )
                                                      ))
                                                   .then(
                                                      Commands.method18840("criterion", StringArgumentType.greedyString())
                                                         .suggests(
                                                            (var0x, var1) -> ISuggestionProvider.method20147(
                                                                  ResourceLocationArgument.method29032(var0x, "advancement").method27030().keySet(), var1
                                                               )
                                                         )
                                                         .executes(
                                                            var0x -> method26287(
                                                                  (CommandSource)var0x.getSource(),
                                                                  Class8700.method31354(var0x, "targets"),
                                                                  Class2289.field15224,
                                                                  ResourceLocationArgument.method29032(var0x, "advancement"),
                                                                  StringArgumentType.getString(var0x, "criterion")
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       Commands.method18839("from")
                                          .then(
                                             Commands.method18840("advancement", ResourceLocationArgument.method29031())
                                                .suggests(field33657)
                                                .executes(
                                                   var0x -> method26286(
                                                         (CommandSource)var0x.getSource(),
                                                         Class8700.method31354(var0x, "targets"),
                                                         Class2289.field15224,
                                                         method26288(ResourceLocationArgument.method29032(var0x, "advancement"), Class2028.field13164)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    Commands.method18839("until")
                                       .then(
                                          Commands.method18840("advancement", ResourceLocationArgument.method29031())
                                             .suggests(field33657)
                                             .executes(
                                                var0x -> method26286(
                                                      (CommandSource)var0x.getSource(),
                                                      Class8700.method31354(var0x, "targets"),
                                                      Class2289.field15224,
                                                      method26288(ResourceLocationArgument.method29032(var0x, "advancement"), Class2028.field13165)
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 Commands.method18839("through")
                                    .then(
                                       Commands.method18840("advancement", ResourceLocationArgument.method29031())
                                          .suggests(field33657)
                                          .executes(
                                             var0x -> method26286(
                                                   (CommandSource)var0x.getSource(),
                                                   Class8700.method31354(var0x, "targets"),
                                                   Class2289.field15224,
                                                   method26288(ResourceLocationArgument.method29032(var0x, "advancement"), Class2028.field13163)
                                                )
                                          )
                                    )
                              ))
                           .then(
                              Commands.method18839("everything")
                                 .executes(
                                    var0x -> method26286(
                                          (CommandSource)var0x.getSource(),
                                          Class8700.method31354(var0x, "targets"),
                                          Class2289.field15224,
                                          ((CommandSource)var0x.getSource()).getServer().method1396().method1066()
                                       )
                                 )
                           )
                     )
               )
            .then(
               Commands.method18839("revoke")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder) Commands.method18840(
                                       "targets", Class8700.method31353()
                                    )
                                    .then(
                                       Commands.method18839("only")
                                          .then(
                                             ((RequiredArgumentBuilder) Commands.method18840("advancement", ResourceLocationArgument.method29031())
                                                   .suggests(field33657)
                                                   .executes(
                                                      var0x -> method26286(
                                                            (CommandSource)var0x.getSource(),
                                                            Class8700.method31354(var0x, "targets"),
                                                            Class2289.field15225,
                                                            method26288(ResourceLocationArgument.method29032(var0x, "advancement"), Class2028.field13162)
                                                         )
                                                   ))
                                                .then(
                                                   Commands.method18840("criterion", StringArgumentType.greedyString())
                                                      .suggests(
                                                         (var0x, var1) -> ISuggestionProvider.method20147(
                                                               ResourceLocationArgument.method29032(var0x, "advancement").method27030().keySet(), var1
                                                            )
                                                      )
                                                      .executes(
                                                         var0x -> method26287(
                                                               (CommandSource)var0x.getSource(),
                                                               Class8700.method31354(var0x, "targets"),
                                                               Class2289.field15225,
                                                               ResourceLocationArgument.method29032(var0x, "advancement"),
                                                               StringArgumentType.getString(var0x, "criterion")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    Commands.method18839("from")
                                       .then(
                                          Commands.method18840("advancement", ResourceLocationArgument.method29031())
                                             .suggests(field33657)
                                             .executes(
                                                var0x -> method26286(
                                                      (CommandSource)var0x.getSource(),
                                                      Class8700.method31354(var0x, "targets"),
                                                      Class2289.field15225,
                                                      method26288(ResourceLocationArgument.method29032(var0x, "advancement"), Class2028.field13164)
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 Commands.method18839("until")
                                    .then(
                                       Commands.method18840("advancement", ResourceLocationArgument.method29031())
                                          .suggests(field33657)
                                          .executes(
                                             var0x -> method26286(
                                                   (CommandSource)var0x.getSource(),
                                                   Class8700.method31354(var0x, "targets"),
                                                   Class2289.field15225,
                                                   method26288(ResourceLocationArgument.method29032(var0x, "advancement"), Class2028.field13165)
                                                )
                                          )
                                    )
                              ))
                           .then(
                              Commands.method18839("through")
                                 .then(
                                    Commands.method18840("advancement", ResourceLocationArgument.method29031())
                                       .suggests(field33657)
                                       .executes(
                                          var0x -> method26286(
                                                (CommandSource)var0x.getSource(),
                                                Class8700.method31354(var0x, "targets"),
                                                Class2289.field15225,
                                                method26288(ResourceLocationArgument.method29032(var0x, "advancement"), Class2028.field13163)
                                             )
                                       )
                                 )
                           ))
                        .then(
                           Commands.method18839("everything")
                              .executes(
                                 var0x -> method26286(
                                       (CommandSource)var0x.getSource(),
                                       Class8700.method31354(var0x, "targets"),
                                       Class2289.field15225,
                                       ((CommandSource)var0x.getSource()).getServer().method1396().method1066()
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method26286(CommandSource var0, Collection<ServerPlayerEntity> var1, Class2289 var2, Collection<Advancement> var3) {
      int var6 = 0;

      for (ServerPlayerEntity var8 : var1) {
         var6 += var2.method9037(var8, var3);
      }

      if (var6 != 0) {
         if (var3.size() != 1) {
            if (var1.size() != 1) {
               var0.sendFeedback(new TranslationTextComponent(var2.method9040() + ".many.to.many.success", var3.size(), var1.size()), true);
            } else {
               var0.sendFeedback(
                  new TranslationTextComponent(var2.method9040() + ".many.to.one.success", var3.size(), ((ServerPlayerEntity)var1.iterator().next()).getDisplayName()), true
               );
            }
         } else if (var1.size() != 1) {
            var0.sendFeedback(
               new TranslationTextComponent(var2.method9040() + ".one.to.many.success", ((Advancement)var3.iterator().next()).method27035(), var1.size()), true
            );
         } else {
            var0.sendFeedback(
               new TranslationTextComponent(
                  var2.method9040() + ".one.to.one.success", ((Advancement)var3.iterator().next()).method27035(), ((ServerPlayerEntity)var1.iterator().next()).getDisplayName()
               ),
               true
            );
         }

         return var6;
      } else if (var3.size() != 1) {
         if (var1.size() != 1) {
            throw new Class2468(new TranslationTextComponent(var2.method9040() + ".many.to.many.failure", var3.size(), var1.size()));
         } else {
            throw new Class2468(
               new TranslationTextComponent(var2.method9040() + ".many.to.one.failure", var3.size(), ((ServerPlayerEntity)var1.iterator().next()).getDisplayName())
            );
         }
      } else if (var1.size() != 1) {
         throw new Class2468(
            new TranslationTextComponent(var2.method9040() + ".one.to.many.failure", ((Advancement)var3.iterator().next()).method27035(), var1.size())
         );
      } else {
         throw new Class2468(
            new TranslationTextComponent(
               var2.method9040() + ".one.to.one.failure", ((Advancement)var3.iterator().next()).method27035(), ((ServerPlayerEntity)var1.iterator().next()).getDisplayName()
            )
         );
      }
   }

   private static int method26287(CommandSource var0, Collection<ServerPlayerEntity> var1, Class2289 var2, Advancement var3, String var4) {
      int var7 = 0;
      if (var3.method27030().containsKey(var4)) {
         for (ServerPlayerEntity var9 : var1) {
            if (var2.method9039(var9, var3, var4)) {
               var7++;
            }
         }

         if (var7 != 0) {
            if (var1.size() != 1) {
               var0.sendFeedback(new TranslationTextComponent(var2.method9040() + ".criterion.to.many.success", var4, var3.method27035(), var1.size()), true);
            } else {
               var0.sendFeedback(
                  new TranslationTextComponent(
                     var2.method9040() + ".criterion.to.one.success", var4, var3.method27035(), ((ServerPlayerEntity)var1.iterator().next()).getDisplayName()
                  ),
                  true
               );
            }

            return var7;
         } else if (var1.size() != 1) {
            throw new Class2468(new TranslationTextComponent(var2.method9040() + ".criterion.to.many.failure", var4, var3.method27035(), var1.size()));
         } else {
            throw new Class2468(
               new TranslationTextComponent(
                  var2.method9040() + ".criterion.to.one.failure", var4, var3.method27035(), ((ServerPlayerEntity)var1.iterator().next()).getDisplayName()
               )
            );
         }
      } else {
         throw new Class2468(new TranslationTextComponent("commands.advancement.criterionNotFound", var3.method27035(), var4));
      }
   }

   private static List<Advancement> method26288(Advancement var0, Class2028 var1) {
      ArrayList var4 = Lists.newArrayList();
      if (Class2028.method8661(var1)) {
         for (Advancement var5 = var0.method27026(); var5 != null; var5 = var5.method27026()) {
            var4.add(var5);
         }
      }

      var4.add(var0);
      if (Class2028.method8662(var1)) {
         method26289(var0, var4);
      }

      return var4;
   }

   private static void method26289(Advancement var0, List<Advancement> var1) {
      for (Advancement var5 : var0.method27029()) {
         var1.add(var5);
         method26289(var5, var1);
      }
   }
}
