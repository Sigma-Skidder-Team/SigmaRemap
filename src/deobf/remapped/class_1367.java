package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;
import java.util.Collections;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;

public class class_1367 {
   private static final DynamicCommandExceptionType field_7437 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.bossbar.create.failed", var0)
   );
   private static final DynamicCommandExceptionType field_7434 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.bossbar.unknown", var0)
   );
   private static final SimpleCommandExceptionType field_7428 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.bossbar.set.players.unchanged")
   );
   private static final SimpleCommandExceptionType field_7430 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.bossbar.set.name.unchanged")
   );
   private static final SimpleCommandExceptionType field_7432 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.bossbar.set.color.unchanged")
   );
   private static final SimpleCommandExceptionType field_7435 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.bossbar.set.style.unchanged")
   );
   private static final SimpleCommandExceptionType field_7427 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.bossbar.set.value.unchanged")
   );
   private static final SimpleCommandExceptionType field_7438 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.bossbar.set.max.unchanged")
   );
   private static final SimpleCommandExceptionType field_7433 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.bossbar.set.visibility.unchanged.hidden")
   );
   private static final SimpleCommandExceptionType field_7431 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.bossbar.set.visibility.unchanged.visible")
   );
   public static final SuggestionProvider<class_9155> field_7429 = (var0, var1) -> class_8773.method_40324(
         ((class_9155)var0.getSource()).method_42177().method_1699().method_21075(), var1
      );

   public static void method_6325(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231(
                              "bossbar"
                           )
                           .requires(var0x -> var0x.method_40314(2)))
                        .then(
                           class_465.method_2231("add")
                              .then(
                                 class_465.method_2236("id", class_4195.method_19515())
                                    .then(
                                       class_465.method_2236("name", class_3352.method_15361())
                                          .executes(
                                             var0x -> method_6327(
                                                   (class_9155)var0x.getSource(), class_4195.method_19511(var0x, "id"), class_3352.method_15360(var0x, "name")
                                                )
                                          )
                                    )
                              )
                        ))
                     .then(
                        class_465.method_2231("remove")
                           .then(
                              class_465.method_2236("id", class_4195.method_19515())
                                 .suggests(field_7429)
                                 .executes(var0x -> method_6317((class_9155)var0x.getSource(), method_6329(var0x)))
                           )
                     ))
                  .then(class_465.method_2231("list").executes(var0x -> method_6323((class_9155)var0x.getSource()))))
               .then(
                  class_465.method_2231("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236(
                                                "id", class_4195.method_19515()
                                             )
                                             .suggests(field_7429)
                                             .then(
                                                class_465.method_2231("name")
                                                   .then(
                                                      class_465.method_2236("name", class_3352.method_15361())
                                                         .executes(
                                                            var0x -> method_6318(
                                                                  (class_9155)var0x.getSource(), method_6329(var0x), class_3352.method_15360(var0x, "name")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231(
                                                                     "color"
                                                                  )
                                                                  .then(
                                                                     class_465.method_2231("pink")
                                                                        .executes(
                                                                           var0x -> method_6314(
                                                                                 (class_9155)var0x.getSource(), method_6329(var0x), class_1062.field_5825
                                                                              )
                                                                        )
                                                                  ))
                                                               .then(
                                                                  class_465.method_2231("blue")
                                                                     .executes(
                                                                        var0x -> method_6314(
                                                                              (class_9155)var0x.getSource(), method_6329(var0x), class_1062.field_5829
                                                                           )
                                                                     )
                                                               ))
                                                            .then(
                                                               class_465.method_2231("red")
                                                                  .executes(
                                                                     var0x -> method_6314(
                                                                           (class_9155)var0x.getSource(), method_6329(var0x), class_1062.field_5828
                                                                        )
                                                                  )
                                                            ))
                                                         .then(
                                                            class_465.method_2231("green")
                                                               .executes(
                                                                  var0x -> method_6314((class_9155)var0x.getSource(), method_6329(var0x), class_1062.field_5827)
                                                               )
                                                         ))
                                                      .then(
                                                         class_465.method_2231("yellow")
                                                            .executes(
                                                               var0x -> method_6314((class_9155)var0x.getSource(), method_6329(var0x), class_1062.field_5826)
                                                            )
                                                      ))
                                                   .then(
                                                      class_465.method_2231("purple")
                                                         .executes(
                                                            var0x -> method_6314((class_9155)var0x.getSource(), method_6329(var0x), class_1062.field_5821)
                                                         )
                                                   ))
                                                .then(
                                                   class_465.method_2231("white")
                                                      .executes(var0x -> method_6314((class_9155)var0x.getSource(), method_6329(var0x), class_1062.field_5823))
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231(
                                                            "style"
                                                         )
                                                         .then(
                                                            class_465.method_2231("progress")
                                                               .executes(
                                                                  var0x -> method_6321(
                                                                        (class_9155)var0x.getSource(), method_6329(var0x), class_2976.field_14631
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         class_465.method_2231("notched_6")
                                                            .executes(
                                                               var0x -> method_6321((class_9155)var0x.getSource(), method_6329(var0x), class_2976.field_14628)
                                                            )
                                                      ))
                                                   .then(
                                                      class_465.method_2231("notched_10")
                                                         .executes(
                                                            var0x -> method_6321((class_9155)var0x.getSource(), method_6329(var0x), class_2976.field_14629)
                                                         )
                                                   ))
                                                .then(
                                                   class_465.method_2231("notched_12")
                                                      .executes(var0x -> method_6321((class_9155)var0x.getSource(), method_6329(var0x), class_2976.field_14625))
                                                ))
                                             .then(
                                                class_465.method_2231("notched_20")
                                                   .executes(var0x -> method_6321((class_9155)var0x.getSource(), method_6329(var0x), class_2976.field_14632))
                                             )
                                       ))
                                    .then(
                                       class_465.method_2231("value")
                                          .then(
                                             class_465.method_2236("value", IntegerArgumentType.integer(0))
                                                .executes(
                                                   var0x -> method_6326(
                                                         (class_9155)var0x.getSource(), method_6329(var0x), IntegerArgumentType.getInteger(var0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    class_465.method_2231("max")
                                       .then(
                                          class_465.method_2236("max", IntegerArgumentType.integer(1))
                                             .executes(
                                                var0x -> method_6324(
                                                      (class_9155)var0x.getSource(), method_6329(var0x), IntegerArgumentType.getInteger(var0x, "max")
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 class_465.method_2231("visible")
                                    .then(
                                       class_465.method_2236("visible", BoolArgumentType.bool())
                                          .executes(
                                             var0x -> method_6320((class_9155)var0x.getSource(), method_6329(var0x), BoolArgumentType.getBool(var0x, "visible"))
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)class_465.method_2231("players")
                                    .executes(var0x -> method_6328((class_9155)var0x.getSource(), method_6329(var0x), Collections.<class_9359>emptyList())))
                                 .then(
                                    class_465.method_2236("targets", class_5601.method_25409())
                                       .executes(
                                          var0x -> method_6328((class_9155)var0x.getSource(), method_6329(var0x), class_5601.method_25414(var0x, "targets"))
                                       )
                                 )
                           )
                     )
               ))
            .then(
               class_465.method_2231("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236("id", class_4195.method_19515())
                                 .suggests(field_7429)
                                 .then(class_465.method_2231("value").executes(var0x -> method_6330((class_9155)var0x.getSource(), method_6329(var0x)))))
                              .then(class_465.method_2231("max").executes(var0x -> method_6319((class_9155)var0x.getSource(), method_6329(var0x)))))
                           .then(class_465.method_2231("visible").executes(var0x -> method_6315((class_9155)var0x.getSource(), method_6329(var0x)))))
                        .then(class_465.method_2231("players").executes(var0x -> method_6322((class_9155)var0x.getSource(), method_6329(var0x))))
                  )
            )
      );
   }

   private static int method_6330(class_9155 var0, class_87 var1) {
      var0.method_42196(new TranslationTextComponent("commands.bossbar.get.value", var1.method_217(), var1.method_221()), true);
      return var1.method_221();
   }

   private static int method_6319(class_9155 var0, class_87 var1) {
      var0.method_42196(new TranslationTextComponent("commands.bossbar.get.max", var1.method_217(), var1.method_218()), true);
      return var1.method_218();
   }

   private static int method_6315(class_9155 var0, class_87 var1) {
      if (!var1.method_2409()) {
         var0.method_42196(new TranslationTextComponent("commands.bossbar.get.visible.hidden", var1.method_217()), true);
         return 0;
      } else {
         var0.method_42196(new TranslationTextComponent("commands.bossbar.get.visible.visible", var1.method_217()), true);
         return 1;
      }
   }

   private static int method_6322(class_9155 var0, class_87 var1) {
      if (!var1.method_2406().isEmpty()) {
         var0.method_42196(
            new TranslationTextComponent(
               "commands.bossbar.get.players.some",
               var1.method_217(),
               var1.method_2406().size(),
               TextComponentUtils.func_240649_b_(var1.method_2406(), class_704::method_19839)
            ),
            true
         );
      } else {
         var0.method_42196(new TranslationTextComponent("commands.bossbar.get.players.none", var1.method_217()), true);
      }

      return var1.method_2406().size();
   }

   private static int method_6320(class_9155 var0, class_87 var1, boolean var2) throws CommandSyntaxException {
      if (var1.method_2409() != var2) {
         var1.method_2404(var2);
         if (!var2) {
            var0.method_42196(new TranslationTextComponent("commands.bossbar.set.visible.success.hidden", var1.method_217()), true);
         } else {
            var0.method_42196(new TranslationTextComponent("commands.bossbar.set.visible.success.visible", var1.method_217()), true);
         }

         return 0;
      } else if (!var2) {
         throw field_7433.create();
      } else {
         throw field_7431.create();
      }
   }

   private static int method_6326(class_9155 var0, class_87 var1, int var2) throws CommandSyntaxException {
      if (var1.method_221() != var2) {
         var1.method_212(var2);
         var0.method_42196(new TranslationTextComponent("commands.bossbar.set.value.success", var1.method_217(), var2), true);
         return var2;
      } else {
         throw field_7427.create();
      }
   }

   private static int method_6324(class_9155 var0, class_87 var1, int var2) throws CommandSyntaxException {
      if (var1.method_218() != var2) {
         var1.method_219(var2);
         var0.method_42196(new TranslationTextComponent("commands.bossbar.set.max.success", var1.method_217(), var2), true);
         return var2;
      } else {
         throw field_7438.create();
      }
   }

   private static int method_6314(class_9155 var0, class_87 var1, class_1062 var2) throws CommandSyntaxException {
      if (!var1.method_43456().equals(var2)) {
         var1.method_43452(var2);
         var0.method_42196(new TranslationTextComponent("commands.bossbar.set.color.success", var1.method_217()), true);
         return 0;
      } else {
         throw field_7432.create();
      }
   }

   private static int method_6321(class_9155 var0, class_87 var1, class_2976 var2) throws CommandSyntaxException {
      if (!var1.method_43462().equals(var2)) {
         var1.method_43458(var2);
         var0.method_42196(new TranslationTextComponent("commands.bossbar.set.style.success", var1.method_217()), true);
         return 0;
      } else {
         throw field_7435.create();
      }
   }

   private static int method_6318(class_9155 var0, class_87 var1, ITextComponent var2) throws CommandSyntaxException {
      IFormattableTextComponent var5 = TextComponentUtils.func_240645_a_(var0, var2, (class_8145)null, 0);
      if (!var1.method_43453().equals(var5)) {
         var1.method_43451(var5);
         var0.method_42196(new TranslationTextComponent("commands.bossbar.set.name.success", var1.method_217()), true);
         return 0;
      } else {
         throw field_7430.create();
      }
   }

   private static int method_6328(class_9155 var0, class_87 var1, Collection<class_9359> var2) throws CommandSyntaxException {
      boolean var5 = var1.method_222(var2);
      if (var5) {
         if (!var1.method_2406().isEmpty()) {
            var0.method_42196(
               new TranslationTextComponent(
                  "commands.bossbar.set.players.success.some", var1.method_217(), var2.size(), TextComponentUtils.func_240649_b_(var2, class_704::method_19839)
               ),
               true
            );
         } else {
            var0.method_42196(new TranslationTextComponent("commands.bossbar.set.players.success.none", var1.method_217()), true);
         }

         return var1.method_2406().size();
      } else {
         throw field_7428.create();
      }
   }

   private static int method_6323(class_9155 var0) {
      Collection var3 = var0.method_42177().method_1699().method_21074();
      if (!var3.isEmpty()) {
         var0.method_42196(
            new TranslationTextComponent("commands.bossbar.list.bars.some", var3.size(), TextComponentUtils.func_240649_b_(var3, class_87::method_217)), false
         );
      } else {
         var0.method_42196(new TranslationTextComponent("commands.bossbar.list.bars.none"), false);
      }

      return var3.size();
   }

   private static int method_6327(class_9155 var0, Identifier var1, ITextComponent var2) throws CommandSyntaxException {
      class_4543 var5 = var0.method_42177().method_1699();
      if (var5.method_21079(var1) == null) {
         class_87 var6 = var5.method_21081(var1, TextComponentUtils.func_240645_a_(var0, var2, (class_8145)null, 0));
         var0.method_42196(new TranslationTextComponent("commands.bossbar.create.success", var6.method_217()), true);
         return var5.method_21074().size();
      } else {
         throw field_7437.create(var1.toString());
      }
   }

   private static int method_6317(class_9155 var0, class_87 var1) {
      class_4543 var4 = var0.method_42177().method_1699();
      var1.method_2408();
      var4.method_21078(var1);
      var0.method_42196(new TranslationTextComponent("commands.bossbar.remove.success", var1.method_217()), true);
      return var4.method_21074().size();
   }

   public static class_87 method_6329(CommandContext<class_9155> var0) throws CommandSyntaxException {
      Identifier var3 = class_4195.method_19511(var0, "id");
      class_87 var4 = ((class_9155)var0.getSource()).method_42177().method_1699().method_21079(var3);
      if (var4 != null) {
         return var4;
      } else {
         throw field_7434.create(var3.toString());
      }
   }
}
