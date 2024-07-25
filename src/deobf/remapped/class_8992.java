package remapped;

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

public class class_8992 {
   private static final SimpleCommandExceptionType field_46039 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.scoreboard.objectives.add.duplicate")
   );
   private static final SimpleCommandExceptionType field_46038 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.scoreboard.objectives.display.alreadyEmpty")
   );
   private static final SimpleCommandExceptionType field_46040 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.scoreboard.objectives.display.alreadySet")
   );
   private static final SimpleCommandExceptionType field_46041 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.scoreboard.players.enable.failed")
   );
   private static final SimpleCommandExceptionType field_46037 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.scoreboard.players.enable.invalid")
   );
   private static final Dynamic2CommandExceptionType field_46036 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("commands.scoreboard.players.get.null", var0, var1)
   );

   public static void method_41245(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("scoreboard").requires(var0x -> var0x.method_40314(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("objectives")
                                 .then(class_465.method_2231("list").executes(var0x -> method_41256((class_9155)var0x.getSource()))))
                              .then(
                                 class_465.method_2231("add")
                                    .then(
                                       class_465.method_2236("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)class_465.method_2236("criteria", class_4385.method_20444())
                                                   .executes(
                                                      var0x -> method_41243(
                                                            (class_9155)var0x.getSource(),
                                                            StringArgumentType.getString(var0x, "objective"),
                                                            class_4385.method_20445(var0x, "criteria"),
                                                            new StringTextComponent(StringArgumentType.getString(var0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   class_465.method_2236("displayName", class_3352.method_15361())
                                                      .executes(
                                                         var0x -> method_41243(
                                                               (class_9155)var0x.getSource(),
                                                               StringArgumentType.getString(var0x, "objective"),
                                                               class_4385.method_20445(var0x, "criteria"),
                                                               class_3352.method_15360(var0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              class_465.method_2231("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)class_465.method_2236("objective", class_7728.method_34976())
                                          .then(
                                             class_465.method_2231("displayname")
                                                .then(
                                                   class_465.method_2236("displayName", class_3352.method_15361())
                                                      .executes(
                                                         var0x -> method_41251(
                                                               (class_9155)var0x.getSource(),
                                                               class_7728.method_34978(var0x, "objective"),
                                                               class_3352.method_15360(var0x, "displayName")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(method_41242())
                                 )
                           ))
                        .then(
                           class_465.method_2231("remove")
                              .then(
                                 class_465.method_2236("objective", class_7728.method_34976())
                                    .executes(var0x -> method_41255((class_9155)var0x.getSource(), class_7728.method_34978(var0x, "objective")))
                              )
                        ))
                     .then(
                        class_465.method_2231("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)class_465.method_2236("slot", class_9161.method_42209())
                                    .executes(var0x -> method_41252((class_9155)var0x.getSource(), class_9161.method_42207(var0x, "slot"))))
                                 .then(
                                    class_465.method_2236("objective", class_7728.method_34976())
                                       .executes(
                                          var0x -> method_41258(
                                                (class_9155)var0x.getSource(),
                                                class_9161.method_42207(var0x, "slot"),
                                                class_7728.method_34978(var0x, "objective")
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231(
                                          "players"
                                       )
                                       .then(
                                          ((LiteralArgumentBuilder)class_465.method_2231("list").executes(var0x -> method_41249((class_9155)var0x.getSource())))
                                             .then(
                                                class_465.method_2236("target", class_2282.method_10522())
                                                   .suggests(class_2282.field_11406)
                                                   .executes(var0x -> method_41261((class_9155)var0x.getSource(), class_2282.method_10520(var0x, "target")))
                                             )
                                       ))
                                    .then(
                                       class_465.method_2231("set")
                                          .then(
                                             class_465.method_2236("targets", class_2282.method_10523())
                                                .suggests(class_2282.field_11406)
                                                .then(
                                                   class_465.method_2236("objective", class_7728.method_34976())
                                                      .then(
                                                         class_465.method_2236("score", IntegerArgumentType.integer())
                                                            .executes(
                                                               var0x -> method_41244(
                                                                     (class_9155)var0x.getSource(),
                                                                     class_2282.method_10525(var0x, "targets"),
                                                                     class_7728.method_34977(var0x, "objective"),
                                                                     IntegerArgumentType.getInteger(var0x, "score")
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    class_465.method_2231("get")
                                       .then(
                                          class_465.method_2236("target", class_2282.method_10522())
                                             .suggests(class_2282.field_11406)
                                             .then(
                                                class_465.method_2236("objective", class_7728.method_34976())
                                                   .executes(
                                                      var0x -> method_41253(
                                                            (class_9155)var0x.getSource(),
                                                            class_2282.method_10520(var0x, "target"),
                                                            class_7728.method_34978(var0x, "objective")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 class_465.method_2231("add")
                                    .then(
                                       class_465.method_2236("targets", class_2282.method_10523())
                                          .suggests(class_2282.field_11406)
                                          .then(
                                             class_465.method_2236("objective", class_7728.method_34976())
                                                .then(
                                                   class_465.method_2236("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         var0x -> method_41254(
                                                               (class_9155)var0x.getSource(),
                                                               class_2282.method_10525(var0x, "targets"),
                                                               class_7728.method_34977(var0x, "objective"),
                                                               IntegerArgumentType.getInteger(var0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              class_465.method_2231("remove")
                                 .then(
                                    class_465.method_2236("targets", class_2282.method_10523())
                                       .suggests(class_2282.field_11406)
                                       .then(
                                          class_465.method_2236("objective", class_7728.method_34976())
                                             .then(
                                                class_465.method_2236("score", IntegerArgumentType.integer(0))
                                                   .executes(
                                                      var0x -> method_41248(
                                                            (class_9155)var0x.getSource(),
                                                            class_2282.method_10525(var0x, "targets"),
                                                            class_7728.method_34977(var0x, "objective"),
                                                            IntegerArgumentType.getInteger(var0x, "score")
                                                         )
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           class_465.method_2231("reset")
                              .then(
                                 ((RequiredArgumentBuilder)class_465.method_2236("targets", class_2282.method_10523())
                                       .suggests(class_2282.field_11406)
                                       .executes(var0x -> method_41247((class_9155)var0x.getSource(), class_2282.method_10525(var0x, "targets"))))
                                    .then(
                                       class_465.method_2236("objective", class_7728.method_34976())
                                          .executes(
                                             var0x -> method_41246(
                                                   (class_9155)var0x.getSource(),
                                                   class_2282.method_10525(var0x, "targets"),
                                                   class_7728.method_34978(var0x, "objective")
                                                )
                                          )
                                    )
                              )
                        ))
                     .then(
                        class_465.method_2231("enable")
                           .then(
                              class_465.method_2236("targets", class_2282.method_10523())
                                 .suggests(class_2282.field_11406)
                                 .then(
                                    class_465.method_2236("objective", class_7728.method_34976())
                                       .suggests((var0x, var1) -> method_41260((class_9155)var0x.getSource(), class_2282.method_10525(var0x, "targets"), var1))
                                       .executes(
                                          var0x -> method_41259(
                                                (class_9155)var0x.getSource(),
                                                class_2282.method_10525(var0x, "targets"),
                                                class_7728.method_34978(var0x, "objective")
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(
                     class_465.method_2231("operation")
                        .then(
                           class_465.method_2236("targets", class_2282.method_10523())
                              .suggests(class_2282.field_11406)
                              .then(
                                 class_465.method_2236("targetObjective", class_7728.method_34976())
                                    .then(
                                       class_465.method_2236("operation", class_1103.method_4906())
                                          .then(
                                             class_465.method_2236("source", class_2282.method_10523())
                                                .suggests(class_2282.field_11406)
                                                .then(
                                                   class_465.method_2236("sourceObjective", class_7728.method_34976())
                                                      .executes(
                                                         var0x -> method_41262(
                                                               (class_9155)var0x.getSource(),
                                                               class_2282.method_10525(var0x, "targets"),
                                                               class_7728.method_34977(var0x, "targetObjective"),
                                                               class_1103.method_4903(var0x, "operation"),
                                                               class_2282.method_10525(var0x, "source"),
                                                               class_7728.method_34978(var0x, "sourceObjective")
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

   private static LiteralArgumentBuilder<class_9155> method_41242() {
      LiteralArgumentBuilder var2 = class_465.method_2231("rendertype");

      for (class_8792 var6 : class_8792.values()) {
         var2.then(
            class_465.method_2231(var6.method_40390())
               .executes(var1 -> method_41257((class_9155)var1.getSource(), class_7728.method_34978(var1, "objective"), var6))
         );
      }

      return var2;
   }

   private static CompletableFuture<Suggestions> method_41260(class_9155 var0, Collection<String> var1, SuggestionsBuilder var2) {
      ArrayList var5 = Lists.newArrayList();
      class_2917 var6 = var0.method_42177().method_1655();

      for (class_4399 var8 : var6.method_4836()) {
         if (var8.method_20491() == class_6810.field_35130) {
            boolean var9 = false;

            for (String var11 : var1) {
               if (!var6.method_4857(var11, var8) || var6.method_4855(var11, var8).method_38148()) {
                  var9 = true;
                  break;
               }
            }

            if (var9) {
               var5.add(var8.method_20490());
            }
         }
      }

      return class_8773.method_40319(var5, var2);
   }

   private static int method_41253(class_9155 var0, String var1, class_4399 var2) throws CommandSyntaxException {
      class_2917 var5 = var0.method_42177().method_1655();
      if (var5.method_4857(var1, var2)) {
         class_8274 var6 = var5.method_4855(var1, var2);
         var0.method_42196(new TranslationTextComponent("commands.scoreboard.players.get.success", var1, var6.method_38146(), var2.method_20482()), false);
         return var6.method_38146();
      } else {
         throw field_46036.create(var2.method_20490(), var1);
      }
   }

   private static int method_41262(class_9155 var0, Collection<String> var1, class_4399 var2, class_4533 var3, Collection<String> var4, class_4399 var5) throws CommandSyntaxException {
      class_2917 var8 = var0.method_42177().method_1655();
      int var9 = 0;

      for (String var11 : var1) {
         class_8274 var12 = var8.method_4855(var11, var2);

         for (String var14 : var4) {
            class_8274 var15 = var8.method_4855(var14, var5);
            var3.method_21052(var12, var15);
         }

         var9 += var12.method_38146();
      }

      if (var1.size() != 1) {
         var0.method_42196(new TranslationTextComponent("commands.scoreboard.players.operation.success.multiple", var2.method_20482(), var1.size()), true);
      } else {
         var0.method_42196(
            new TranslationTextComponent("commands.scoreboard.players.operation.success.single", var2.method_20482(), var1.iterator().next(), var9), true
         );
      }

      return var9;
   }

   private static int method_41259(class_9155 var0, Collection<String> var1, class_4399 var2) throws CommandSyntaxException {
      if (var2.method_20491() == class_6810.field_35130) {
         class_2917 var5 = var0.method_42177().method_1655();
         int var6 = 0;

         for (String var8 : var1) {
            class_8274 var9 = var5.method_4855(var8, var2);
            if (var9.method_38148()) {
               var9.method_38141(false);
               var6++;
            }
         }

         if (var6 != 0) {
            if (var1.size() != 1) {
               var0.method_42196(new TranslationTextComponent("commands.scoreboard.players.enable.success.multiple", var2.method_20482(), var1.size()), true);
            } else {
               var0.method_42196(
                  new TranslationTextComponent("commands.scoreboard.players.enable.success.single", var2.method_20482(), var1.iterator().next()), true
               );
            }

            return var6;
         } else {
            throw field_46041.create();
         }
      } else {
         throw field_46037.create();
      }
   }

   private static int method_41247(class_9155 var0, Collection<String> var1) {
      class_2917 var4 = var0.method_42177().method_1655();

      for (String var6 : var1) {
         var4.method_4869(var6, (class_4399)null);
      }

      if (var1.size() != 1) {
         var0.method_42196(new TranslationTextComponent("commands.scoreboard.players.reset.all.multiple", var1.size()), true);
      } else {
         var0.method_42196(new TranslationTextComponent("commands.scoreboard.players.reset.all.single", var1.iterator().next()), true);
      }

      return var1.size();
   }

   private static int method_41246(class_9155 var0, Collection<String> var1, class_4399 var2) {
      class_2917 var5 = var0.method_42177().method_1655();

      for (String var7 : var1) {
         var5.method_4869(var7, var2);
      }

      if (var1.size() != 1) {
         var0.method_42196(new TranslationTextComponent("commands.scoreboard.players.reset.specific.multiple", var2.method_20482(), var1.size()), true);
      } else {
         var0.method_42196(new TranslationTextComponent("commands.scoreboard.players.reset.specific.single", var2.method_20482(), var1.iterator().next()), true);
      }

      return var1.size();
   }

   private static int method_41244(class_9155 var0, Collection<String> var1, class_4399 var2, int var3) {
      class_2917 var6 = var0.method_42177().method_1655();

      for (String var8 : var1) {
         class_8274 var9 = var6.method_4855(var8, var2);
         var9.method_38140(var3);
      }

      if (var1.size() != 1) {
         var0.method_42196(new TranslationTextComponent("commands.scoreboard.players.set.success.multiple", var2.method_20482(), var1.size(), var3), true);
      } else {
         var0.method_42196(
            new TranslationTextComponent("commands.scoreboard.players.set.success.single", var2.method_20482(), var1.iterator().next(), var3), true
         );
      }

      return var3 * var1.size();
   }

   private static int method_41254(class_9155 var0, Collection<String> var1, class_4399 var2, int var3) {
      class_2917 var6 = var0.method_42177().method_1655();
      int var7 = 0;

      for (String var9 : var1) {
         class_8274 var10 = var6.method_4855(var9, var2);
         var10.method_38140(var10.method_38146() + var3);
         var7 += var10.method_38146();
      }

      if (var1.size() != 1) {
         var0.method_42196(new TranslationTextComponent("commands.scoreboard.players.add.success.multiple", var3, var2.method_20482(), var1.size()), true);
      } else {
         var0.method_42196(
            new TranslationTextComponent("commands.scoreboard.players.add.success.single", var3, var2.method_20482(), var1.iterator().next(), var7), true
         );
      }

      return var7;
   }

   private static int method_41248(class_9155 var0, Collection<String> var1, class_4399 var2, int var3) {
      class_2917 var6 = var0.method_42177().method_1655();
      int var7 = 0;

      for (String var9 : var1) {
         class_8274 var10 = var6.method_4855(var9, var2);
         var10.method_38140(var10.method_38146() - var3);
         var7 += var10.method_38146();
      }

      if (var1.size() != 1) {
         var0.method_42196(new TranslationTextComponent("commands.scoreboard.players.remove.success.multiple", var3, var2.method_20482(), var1.size()), true);
      } else {
         var0.method_42196(
            new TranslationTextComponent("commands.scoreboard.players.remove.success.single", var3, var2.method_20482(), var1.iterator().next(), var7), true
         );
      }

      return var7;
   }

   private static int method_41249(class_9155 var0) {
      Collection var3 = var0.method_42177().method_1655().method_4859();
      if (!var3.isEmpty()) {
         var0.method_42196(
            new TranslationTextComponent("commands.scoreboard.players.list.success", var3.size(), TextComponentUtils.makeGreenSortedList(var3)), false
         );
      } else {
         var0.method_42196(new TranslationTextComponent("commands.scoreboard.players.list.empty"), false);
      }

      return var3.size();
   }

   private static int method_41261(class_9155 var0, String var1) {
      Map var4 = var0.method_42177().method_1655().method_4870(var1);
      if (!var4.isEmpty()) {
         var0.method_42196(new TranslationTextComponent("commands.scoreboard.players.list.entity.success", var1, var4.size()), false);

         for (Entry var6 : var4.entrySet()) {
            var0.method_42196(
               new TranslationTextComponent(
                  "commands.scoreboard.players.list.entity.entry", ((class_4399)var6.getKey()).method_20482(), ((class_8274)var6.getValue()).method_38146()
               ),
               false
            );
         }
      } else {
         var0.method_42196(new TranslationTextComponent("commands.scoreboard.players.list.entity.empty", var1), false);
      }

      return var4.size();
   }

   private static int method_41252(class_9155 var0, int var1) throws CommandSyntaxException {
      class_2917 var4 = var0.method_42177().method_1655();
      if (var4.method_4833(var1) != null) {
         var4.method_4831(var1, (class_4399)null);
         var0.method_42196(new TranslationTextComponent("commands.scoreboard.objectives.display.cleared", class_1097.method_4867()[var1]), true);
         return 0;
      } else {
         throw field_46038.create();
      }
   }

   private static int method_41258(class_9155 var0, int var1, class_4399 var2) throws CommandSyntaxException {
      class_2917 var5 = var0.method_42177().method_1655();
      if (var5.method_4833(var1) != var2) {
         var5.method_4831(var1, var2);
         var0.method_42196(
            new TranslationTextComponent("commands.scoreboard.objectives.display.set", class_1097.method_4867()[var1], var2.method_20488()), true
         );
         return 0;
      } else {
         throw field_46040.create();
      }
   }

   private static int method_41251(class_9155 var0, class_4399 var1, ITextComponent var2) {
      if (!var1.method_20488().equals(var2)) {
         var1.method_20485(var2);
         var0.method_42196(new TranslationTextComponent("commands.scoreboard.objectives.modify.displayname", var1.method_20490(), var1.method_20482()), true);
      }

      return 0;
   }

   private static int method_41257(class_9155 var0, class_4399 var1, class_8792 var2) {
      if (var1.method_20483() != var2) {
         var1.method_20484(var2);
         var0.method_42196(new TranslationTextComponent("commands.scoreboard.objectives.modify.rendertype", var1.method_20482()), true);
      }

      return 0;
   }

   private static int method_41255(class_9155 var0, class_4399 var1) {
      class_2917 var4 = var0.method_42177().method_1655();
      var4.method_4834(var1);
      var0.method_42196(new TranslationTextComponent("commands.scoreboard.objectives.remove.success", var1.method_20482()), true);
      return var4.method_4836().size();
   }

   private static int method_41243(class_9155 var0, String var1, class_6810 var2, ITextComponent var3) throws CommandSyntaxException {
      class_2917 var6 = var0.method_42177().method_1655();
      if (var6.method_4858(var1) == null) {
         if (var1.length() <= 16) {
            var6.method_4830(var1, var2, var3, var2.method_31257());
            class_4399 var7 = var6.method_4858(var1);
            var0.method_42196(new TranslationTextComponent("commands.scoreboard.objectives.add.success", var7.method_20482()), true);
            return var6.method_4836().size();
         } else {
            throw class_7728.field_39194.create(16);
         }
      } else {
         throw field_46039.create();
      }
   }

   private static int method_41256(class_9155 var0) {
      Collection var3 = var0.method_42177().method_1655().method_4836();
      if (!var3.isEmpty()) {
         var0.method_42196(
            new TranslationTextComponent(
               "commands.scoreboard.objectives.list.success", var3.size(), TextComponentUtils.func_240649_b_(var3, class_4399::method_20482)
            ),
            false
         );
      } else {
         var0.method_42196(new TranslationTextComponent("commands.scoreboard.objectives.list.empty"), false);
      }

      return var3.size();
   }
}
