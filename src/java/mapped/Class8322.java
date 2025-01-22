package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

import net.minecraft.command.CommandSource;
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ServerScoreboard;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8322 {
   private static final SimpleCommandExceptionType field35749 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType field35750 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.trigger.failed.invalid"));

   public static void method29142(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder) Commands.method18839("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder) Commands.method18840("objective", Class9263.method34860())
                        .suggests((var0x, var1) -> method29143((CommandSource)var0x.getSource(), var1))
                        .executes(
                           var0x -> method29146(
                                 (CommandSource)var0x.getSource(),
                                 method29147(((CommandSource)var0x.getSource()).method20175(), Class9263.method34861(var0x, "objective"))
                              )
                        ))
                     .then(
                        Commands.method18839("add")
                           .then(
                              Commands.method18840("value", IntegerArgumentType.integer())
                                 .executes(
                                    var0x -> method29144(
                                          (CommandSource)var0x.getSource(),
                                          method29147(((CommandSource)var0x.getSource()).method20175(), Class9263.method34861(var0x, "objective")),
                                          IntegerArgumentType.getInteger(var0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     Commands.method18839("set")
                        .then(
                           Commands.method18840("value", IntegerArgumentType.integer())
                              .executes(
                                 var0x -> method29145(
                                       (CommandSource)var0x.getSource(),
                                       method29147(((CommandSource)var0x.getSource()).method20175(), Class9263.method34861(var0x, "objective")),
                                       IntegerArgumentType.getInteger(var0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> method29143(CommandSource var0, SuggestionsBuilder var1) {
      Entity var4 = var0.method20173();
      ArrayList var5 = Lists.newArrayList();
      if (var4 != null) {
         ServerScoreboard var6 = var0.getServer().method1409();
         String var7 = var4.getScoreboardName();

         for (ScoreObjective var9 : var6.method20982()) {
            if (var9.getCriteria() == Class9008.field41190 && var6.method20979(var7, var9)) {
               Score var10 = var6.method20980(var7, var9);
               if (!var10.isLocked()) {
                  var5.add(var9.method29336());
               }
            }
         }
      }

      return ISuggestionProvider.suggest(var5, var1);
   }

   private static int method29144(CommandSource var0, Score var1, int var2) {
      var1.increaseScore(var2);
      var0.sendFeedback(new TranslationTextComponent("commands.trigger.add.success", var1.getObjective().method29340(), var2), true);
      return var1.getScorePoints();
   }

   private static int method29145(CommandSource var0, Score var1, int var2) {
      var1.setScorePoints(var2);
      var0.sendFeedback(new TranslationTextComponent("commands.trigger.set.success", var1.getObjective().method29340(), var2), true);
      return var2;
   }

   private static int method29146(CommandSource var0, Score var1) {
      var1.increaseScore(1);
      var0.sendFeedback(new TranslationTextComponent("commands.trigger.simple.success", var1.getObjective().method29340()), true);
      return var1.getScorePoints();
   }

   private static Score method29147(ServerPlayerEntity var0, ScoreObjective var1) throws CommandSyntaxException {
      if (var1.getCriteria() == Class9008.field41190) {
         Scoreboard var4 = var0.method2953();
         String var5 = var0.getScoreboardName();
         if (var4.method20979(var5, var1)) {
            Score var6 = var4.method20980(var5, var1);
            if (!var6.isLocked()) {
               var6.setLocked(true);
               return var6;
            } else {
               throw field35749.create();
            }
         } else {
            throw field35749.create();
         }
      } else {
         throw field35750.create();
      }
   }
}
