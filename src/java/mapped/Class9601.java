package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9601 {
   private static final SimpleCommandExceptionType field44912 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.scoreboard.objectives.add.duplicate")
   );
   private static final SimpleCommandExceptionType field44913 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.scoreboard.objectives.display.alreadyEmpty")
   );
   private static final SimpleCommandExceptionType field44914 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.scoreboard.objectives.display.alreadySet")
   );
   private static final SimpleCommandExceptionType field44915 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.scoreboard.players.enable.failed")
   );
   private static final SimpleCommandExceptionType field44916 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.scoreboard.players.enable.invalid")
   );
   private static final Dynamic2CommandExceptionType field44917 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("commands.scoreboard.players.get.null", var0, var1)
   );

   public static void method37271(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("scoreboard").requires(var0x -> var0x.method20129(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("objectives")
                                 .then(Class6099.method18839("list").executes(var0x -> method37290((Class6619)var0x.getSource()))))
                              .then(
                                 Class6099.method18839("add")
                                    .then(
                                       Class6099.method18840("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)Class6099.method18840("criteria", Class8371.method29322())
                                                   .executes(
                                                      var0x -> method37289(
                                                            (Class6619)var0x.getSource(),
                                                            StringArgumentType.getString(var0x, "objective"),
                                                            Class8371.method29323(var0x, "criteria"),
                                                            new StringTextComponent(StringArgumentType.getString(var0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   Class6099.method18840("displayName", Class8010.method27395())
                                                      .executes(
                                                         var0x -> method37289(
                                                               (Class6619)var0x.getSource(),
                                                               StringArgumentType.getString(var0x, "objective"),
                                                               Class8371.method29323(var0x, "criteria"),
                                                               Class8010.method27394(var0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              Class6099.method18839("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)Class6099.method18840("objective", Class9263.method34860())
                                          .then(
                                             Class6099.method18839("displayname")
                                                .then(
                                                   Class6099.method18840("displayName", Class8010.method27395())
                                                      .executes(
                                                         var0x -> method37286(
                                                               (Class6619)var0x.getSource(),
                                                               Class9263.method34861(var0x, "objective"),
                                                               Class8010.method27394(var0x, "displayName")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(method37272())
                                 )
                           ))
                        .then(
                           Class6099.method18839("remove")
                              .then(
                                 Class6099.method18840("objective", Class9263.method34860())
                                    .executes(var0x -> method37288((Class6619)var0x.getSource(), Class9263.method34861(var0x, "objective")))
                              )
                        ))
                     .then(
                        Class6099.method18839("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)Class6099.method18840("slot", Class9639.method37566())
                                    .executes(var0x -> method37284((Class6619)var0x.getSource(), Class9639.method37567(var0x, "slot"))))
                                 .then(
                                    Class6099.method18840("objective", Class9263.method34860())
                                       .executes(
                                          var0x -> method37285(
                                                (Class6619)var0x.getSource(), Class9639.method37567(var0x, "slot"), Class9263.method34861(var0x, "objective")
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839(
                                          "players"
                                       )
                                       .then(
                                          ((LiteralArgumentBuilder)Class6099.method18839("list").executes(var0x -> method37282((Class6619)var0x.getSource())))
                                             .then(
                                                Class6099.method18840("target", Class7591.method24862())
                                                   .suggests(Class7591.field32590)
                                                   .executes(var0x -> method37283((Class6619)var0x.getSource(), Class7591.method24858(var0x, "target")))
                                             )
                                       ))
                                    .then(
                                       Class6099.method18839("set")
                                          .then(
                                             Class6099.method18840("targets", Class7591.method24863())
                                                .suggests(Class7591.field32590)
                                                .then(
                                                   Class6099.method18840("objective", Class9263.method34860())
                                                      .then(
                                                         Class6099.method18840("score", IntegerArgumentType.integer())
                                                            .executes(
                                                               var0x -> method37279(
                                                                     (Class6619)var0x.getSource(),
                                                                     Class7591.method24860(var0x, "targets"),
                                                                     Class9263.method34862(var0x, "objective"),
                                                                     IntegerArgumentType.getInteger(var0x, "score")
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    Class6099.method18839("get")
                                       .then(
                                          Class6099.method18840("target", Class7591.method24862())
                                             .suggests(Class7591.field32590)
                                             .then(
                                                Class6099.method18840("objective", Class9263.method34860())
                                                   .executes(
                                                      var0x -> method37274(
                                                            (Class6619)var0x.getSource(),
                                                            Class7591.method24858(var0x, "target"),
                                                            Class9263.method34861(var0x, "objective")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 Class6099.method18839("add")
                                    .then(
                                       Class6099.method18840("targets", Class7591.method24863())
                                          .suggests(Class7591.field32590)
                                          .then(
                                             Class6099.method18840("objective", Class9263.method34860())
                                                .then(
                                                   Class6099.method18840("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         var0x -> method37280(
                                                               (Class6619)var0x.getSource(),
                                                               Class7591.method24860(var0x, "targets"),
                                                               Class9263.method34862(var0x, "objective"),
                                                               IntegerArgumentType.getInteger(var0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              Class6099.method18839("remove")
                                 .then(
                                    Class6099.method18840("targets", Class7591.method24863())
                                       .suggests(Class7591.field32590)
                                       .then(
                                          Class6099.method18840("objective", Class9263.method34860())
                                             .then(
                                                Class6099.method18840("score", IntegerArgumentType.integer(0))
                                                   .executes(
                                                      var0x -> method37281(
                                                            (Class6619)var0x.getSource(),
                                                            Class7591.method24860(var0x, "targets"),
                                                            Class9263.method34862(var0x, "objective"),
                                                            IntegerArgumentType.getInteger(var0x, "score")
                                                         )
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           Class6099.method18839("reset")
                              .then(
                                 ((RequiredArgumentBuilder)Class6099.method18840("targets", Class7591.method24863())
                                       .suggests(Class7591.field32590)
                                       .executes(var0x -> method37277((Class6619)var0x.getSource(), Class7591.method24860(var0x, "targets"))))
                                    .then(
                                       Class6099.method18840("objective", Class9263.method34860())
                                          .executes(
                                             var0x -> method37278(
                                                   (Class6619)var0x.getSource(),
                                                   Class7591.method24860(var0x, "targets"),
                                                   Class9263.method34861(var0x, "objective")
                                                )
                                          )
                                    )
                              )
                        ))
                     .then(
                        Class6099.method18839("enable")
                           .then(
                              Class6099.method18840("targets", Class7591.method24863())
                                 .suggests(Class7591.field32590)
                                 .then(
                                    Class6099.method18840("objective", Class9263.method34860())
                                       .suggests((var0x, var1) -> method37273((Class6619)var0x.getSource(), Class7591.method24860(var0x, "targets"), var1))
                                       .executes(
                                          var0x -> method37276(
                                                (Class6619)var0x.getSource(),
                                                Class7591.method24860(var0x, "targets"),
                                                Class9263.method34861(var0x, "objective")
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(
                     Class6099.method18839("operation")
                        .then(
                           Class6099.method18840("targets", Class7591.method24863())
                              .suggests(Class7591.field32590)
                              .then(
                                 Class6099.method18840("targetObjective", Class9263.method34860())
                                    .then(
                                       Class6099.method18840("operation", Class6888.method21028())
                                          .then(
                                             Class6099.method18840("source", Class7591.method24863())
                                                .suggests(Class7591.field32590)
                                                .then(
                                                   Class6099.method18840("sourceObjective", Class9263.method34860())
                                                      .executes(
                                                         var0x -> method37275(
                                                               (Class6619)var0x.getSource(),
                                                               Class7591.method24860(var0x, "targets"),
                                                               Class9263.method34862(var0x, "targetObjective"),
                                                               Class6888.method21029(var0x, "operation"),
                                                               Class7591.method24860(var0x, "source"),
                                                               Class9263.method34861(var0x, "sourceObjective")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static LiteralArgumentBuilder<Class6619> method37272() {
      LiteralArgumentBuilder var2 = Class6099.method18839("rendertype");

      for (Class2316 var6 : Class2316.values()) {
         var2.then(
            Class6099.method18839(var6.method9088()).executes(var1 -> method37287((Class6619)var1.getSource(), Class9263.method34861(var1, "objective"), var6))
         );
      }

      return var2;
   }

   private static CompletableFuture<Suggestions> method37273(Class6619 var0, Collection<String> var1, SuggestionsBuilder var2) {
      ArrayList var5 = Lists.newArrayList();
      Class6887 var6 = var0.method20177().method1409();

      for (Class8375 var8 : var6.method20982()) {
         if (var8.method29337() == Class9008.field41190) {
            boolean var9 = false;

            for (String var11 : var1) {
               if (!var6.method20979(var11, var8) || var6.method20980(var11, var8).method36056()) {
                  var9 = true;
                  break;
               }
            }

            if (var9) {
               var5.add(var8.method29336());
            }
         }
      }

      return Class6618.method20147(var5, var2);
   }

   private static int method37274(Class6619 var0, String var1, Class8375 var2) throws CommandSyntaxException {
      Class6887 var5 = var0.method20177().method1409();
      if (var5.method20979(var1, var2)) {
         Class9411 var6 = var5.method20980(var1, var2);
         var0.method20179(new TranslationTextComponent("commands.scoreboard.players.get.success", var1, var6.method36050(), var2.method29340()), false);
         return var6.method36050();
      } else {
         throw field44917.create(var2.method29336(), var1);
      }
   }

   private static int method37275(Class6619 var0, Collection<String> var1, Class8375 var2, Class8420 var3, Collection<String> var4, Class8375 var5) throws CommandSyntaxException {
      Class6887 var8 = var0.method20177().method1409();
      int var9 = 0;

      for (String var11 : var1) {
         Class9411 var12 = var8.method20980(var11, var2);

         for (String var14 : var4) {
            Class9411 var15 = var8.method20980(var14, var5);
            var3.method29592(var12, var15);
         }

         var9 += var12.method36050();
      }

      if (var1.size() != 1) {
         var0.method20179(new TranslationTextComponent("commands.scoreboard.players.operation.success.multiple", var2.method29340(), var1.size()), true);
      } else {
         var0.method20179(
            new TranslationTextComponent("commands.scoreboard.players.operation.success.single", var2.method29340(), var1.iterator().next(), var9), true
         );
      }

      return var9;
   }

   private static int method37276(Class6619 var0, Collection<String> var1, Class8375 var2) throws CommandSyntaxException {
      if (var2.method29337() == Class9008.field41190) {
         Class6887 var5 = var0.method20177().method1409();
         int var6 = 0;

         for (String var8 : var1) {
            Class9411 var9 = var5.method20980(var8, var2);
            if (var9.method36056()) {
               var9.method36057(false);
               var6++;
            }
         }

         if (var6 != 0) {
            if (var1.size() != 1) {
               var0.method20179(new TranslationTextComponent("commands.scoreboard.players.enable.success.multiple", var2.method29340(), var1.size()), true);
            } else {
               var0.method20179(
                  new TranslationTextComponent("commands.scoreboard.players.enable.success.single", var2.method29340(), var1.iterator().next()), true
               );
            }

            return var6;
         } else {
            throw field44915.create();
         }
      } else {
         throw field44916.create();
      }
   }

   private static int method37277(Class6619 var0, Collection<String> var1) {
      Class6887 var4 = var0.method20177().method1409();

      for (String var6 : var1) {
         var4.method20985(var6, (Class8375)null);
      }

      if (var1.size() != 1) {
         var0.method20179(new TranslationTextComponent("commands.scoreboard.players.reset.all.multiple", var1.size()), true);
      } else {
         var0.method20179(new TranslationTextComponent("commands.scoreboard.players.reset.all.single", var1.iterator().next()), true);
      }

      return var1.size();
   }

   private static int method37278(Class6619 var0, Collection<String> var1, Class8375 var2) {
      Class6887 var5 = var0.method20177().method1409();

      for (String var7 : var1) {
         var5.method20985(var7, var2);
      }

      if (var1.size() != 1) {
         var0.method20179(new TranslationTextComponent("commands.scoreboard.players.reset.specific.multiple", var2.method29340(), var1.size()), true);
      } else {
         var0.method20179(new TranslationTextComponent("commands.scoreboard.players.reset.specific.single", var2.method29340(), var1.iterator().next()), true);
      }

      return var1.size();
   }

   private static int method37279(Class6619 var0, Collection<String> var1, Class8375 var2, int var3) {
      Class6887 var6 = var0.method20177().method1409();

      for (String var8 : var1) {
         Class9411 var9 = var6.method20980(var8, var2);
         var9.method36052(var3);
      }

      if (var1.size() != 1) {
         var0.method20179(new TranslationTextComponent("commands.scoreboard.players.set.success.multiple", var2.method29340(), var1.size(), var3), true);
      } else {
         var0.method20179(
            new TranslationTextComponent("commands.scoreboard.players.set.success.single", var2.method29340(), var1.iterator().next(), var3), true
         );
      }

      return var3 * var1.size();
   }

   private static int method37280(Class6619 var0, Collection<String> var1, Class8375 var2, int var3) {
      Class6887 var6 = var0.method20177().method1409();
      int var7 = 0;

      for (String var9 : var1) {
         Class9411 var10 = var6.method20980(var9, var2);
         var10.method36052(var10.method36050() + var3);
         var7 += var10.method36050();
      }

      if (var1.size() != 1) {
         var0.method20179(new TranslationTextComponent("commands.scoreboard.players.add.success.multiple", var3, var2.method29340(), var1.size()), true);
      } else {
         var0.method20179(
            new TranslationTextComponent("commands.scoreboard.players.add.success.single", var3, var2.method29340(), var1.iterator().next(), var7), true
         );
      }

      return var7;
   }

   private static int method37281(Class6619 var0, Collection<String> var1, Class8375 var2, int var3) {
      Class6887 var6 = var0.method20177().method1409();
      int var7 = 0;

      for (String var9 : var1) {
         Class9411 var10 = var6.method20980(var9, var2);
         var10.method36052(var10.method36050() - var3);
         var7 += var10.method36050();
      }

      if (var1.size() != 1) {
         var0.method20179(new TranslationTextComponent("commands.scoreboard.players.remove.success.multiple", var3, var2.method29340(), var1.size()), true);
      } else {
         var0.method20179(
            new TranslationTextComponent("commands.scoreboard.players.remove.success.single", var3, var2.method29340(), var1.iterator().next(), var7), true
         );
      }

      return var7;
   }

   private static int method37282(Class6619 var0) {
      Collection var3 = var0.method20177().method1409().method20984();
      if (!var3.isEmpty()) {
         var0.method20179(
            new TranslationTextComponent("commands.scoreboard.players.list.success", var3.size(), TextComponentUtils.makeGreenSortedList(var3)), false
         );
      } else {
         var0.method20179(new TranslationTextComponent("commands.scoreboard.players.list.empty"), false);
      }

      return var3.size();
   }

   private static int method37283(Class6619 var0, String var1) {
      Map<Class8375, Class9411> var4 = var0.method20177().method1409().method20986(var1);
      if (!var4.isEmpty()) {
         var0.method20179(new TranslationTextComponent("commands.scoreboard.players.list.entity.success", var1, var4.size()), false);

         for (Entry var6 : var4.entrySet()) {
            var0.method20179(
               new TranslationTextComponent(
                  "commands.scoreboard.players.list.entity.entry", ((Class8375)var6.getKey()).method29340(), ((Class9411)var6.getValue()).method36050()
               ),
               false
            );
         }
      } else {
         var0.method20179(new TranslationTextComponent("commands.scoreboard.players.list.entity.empty", var1), false);
      }

      return var4.size();
   }

   private static int method37284(Class6619 var0, int var1) throws CommandSyntaxException {
      Class6887 var4 = var0.method20177().method1409();
      if (var4.method20989(var1) != null) {
         var4.method20988(var1, (Class8375)null);
         var0.method20179(new TranslationTextComponent("commands.scoreboard.objectives.display.cleared", Class6886.method21010()[var1]), true);
         return 0;
      } else {
         throw field44913.create();
      }
   }

   private static int method37285(Class6619 var0, int var1, Class8375 var2) throws CommandSyntaxException {
      Class6887 var5 = var0.method20177().method1409();
      if (var5.method20989(var1) != var2) {
         var5.method20988(var1, var2);
         var0.method20179(new TranslationTextComponent("commands.scoreboard.objectives.display.set", Class6886.method21010()[var1], var2.method29338()), true);
         return 0;
      } else {
         throw field44914.create();
      }
   }

   private static int method37286(Class6619 var0, Class8375 var1, ITextComponent var2) {
      if (!var1.method29338().equals(var2)) {
         var1.method29341(var2);
         var0.method20179(new TranslationTextComponent("commands.scoreboard.objectives.modify.displayname", var1.method29336(), var1.method29340()), true);
      }

      return 0;
   }

   private static int method37287(Class6619 var0, Class8375 var1, Class2316 var2) {
      if (var1.method29342() != var2) {
         var1.method29343(var2);
         var0.method20179(new TranslationTextComponent("commands.scoreboard.objectives.modify.rendertype", var1.method29340()), true);
      }

      return 0;
   }

   private static int method37288(Class6619 var0, Class8375 var1) {
      Class6887 var4 = var0.method20177().method1409();
      var4.method20987(var1);
      var0.method20179(new TranslationTextComponent("commands.scoreboard.objectives.remove.success", var1.method29340()), true);
      return var4.method20982().size();
   }

   private static int method37289(Class6619 var0, String var1, Class9008 var2, ITextComponent var3) throws CommandSyntaxException {
      Class6887 var6 = var0.method20177().method1409();
      if (var6.method20976(var1) == null) {
         if (var1.length() <= 16) {
            var6.method20977(var1, var2, var3, var2.method33282());
            Class8375 var7 = var6.method20976(var1);
            var0.method20179(new TranslationTextComponent("commands.scoreboard.objectives.add.success", var7.method29340()), true);
            return var6.method20982().size();
         } else {
            throw Class9263.field42601.create(16);
         }
      } else {
         throw field44912.create();
      }
   }

   private static int method37290(Class6619 var0) {
      Collection var3 = var0.method20177().method1409().method20982();
      if (!var3.isEmpty()) {
         var0.method20179(
            new TranslationTextComponent(
               "commands.scoreboard.objectives.list.success", var3.size(), TextComponentUtils.func_240649_b_(var3, Class8375::method29340)
            ),
            false
         );
      } else {
         var0.method20179(new TranslationTextComponent("commands.scoreboard.objectives.list.empty"), false);
      }

      return var3.size();
   }
}
