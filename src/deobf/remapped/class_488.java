package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.IntFunction;
import net.minecraft.util.text.TranslationTextComponent;

public class class_488 {
   private static final Dynamic2CommandExceptionType field_3060 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("commands.execute.blocks.toobig", var0, var1)
   );
   private static final SimpleCommandExceptionType field_3062 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.execute.conditional.fail")
   );
   private static final DynamicCommandExceptionType field_3057 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.execute.conditional.fail_count", var0)
   );
   private static final BinaryOperator<ResultConsumer<class_9155>> field_3061 = (var0, var1) -> (var2, var3, var4) -> {
         var0.onCommandComplete(var2, var3, var4);
         var1.onCommandComplete(var2, var3, var4);
      };
   private static final SuggestionProvider<class_9155> field_3059 = (var0, var1) -> {
      class_264 var4 = ((class_9155)var0.getSource()).method_42177().method_1676();
      return class_8773.method_40324(var4.method_1145(), var1);
   };

   public static void method_2378(CommandDispatcher<class_9155> var0) {
      LiteralCommandNode var3 = var0.register((LiteralArgumentBuilder)class_465.method_2231("execute").requires(var0x -> var0x.method_40314(2)));
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231(
                                                   "execute"
                                                )
                                                .requires(var0x -> var0x.method_40314(2)))
                                             .then(class_465.method_2231("run").redirect(var0.getRoot())))
                                          .then(method_2374(var3, class_465.method_2231("if"), true)))
                                       .then(method_2374(var3, class_465.method_2231("unless"), false)))
                                    .then(class_465.method_2231("as").then(class_465.method_2236("targets", class_5601.method_25407()).fork(var3, var0x -> {
                                       ArrayList var3x = Lists.newArrayList();

                                       for (class_8145 var5 : class_5601.method_25417(var0x, "targets")) {
                                          var3x.add(((class_9155)var0x.getSource()).method_42193(var5));
                                       }

                                       return var3x;
                                    }))))
                                 .then(
                                    class_465.method_2231("at")
                                       .then(
                                          class_465.method_2236("targets", class_5601.method_25407())
                                             .fork(
                                                var3,
                                                var0x -> {
                                                   ArrayList var3x = Lists.newArrayList();

                                                   for (class_8145 var5 : class_5601.method_25417(var0x, "targets")) {
                                                      var3x.add(
                                                         ((class_9155)var0x.getSource())
                                                            .method_42195((class_6331)var5.field_41768)
                                                            .method_42180(var5.method_37245())
                                                            .method_42183(var5.method_37366())
                                                      );
                                                   }

                                                   return var3x;
                                                }
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)class_465.method_2231("store").then(method_2388(var3, class_465.method_2231("result"), true)))
                                    .then(method_2388(var3, class_465.method_2231("success"), false))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)class_465.method_2231("positioned")
                                    .then(
                                       class_465.method_2236("pos", class_1029.method_4556())
                                          .redirect(
                                             var3,
                                             var0x -> ((class_9155)var0x.getSource())
                                                   .method_42180(class_1029.method_4555(var0x, "pos"))
                                                   .method_42197(class_6139.field_31493)
                                          )
                                    ))
                                 .then(class_465.method_2231("as").then(class_465.method_2236("targets", class_5601.method_25407()).fork(var3, var0x -> {
                                    ArrayList var3x = Lists.newArrayList();

                                    for (class_8145 var5 : class_5601.method_25417(var0x, "targets")) {
                                       var3x.add(((class_9155)var0x.getSource()).method_42180(var5.method_37245()));
                                    }

                                    return var3x;
                                 })))
                           ))
                        .then(
                           ((LiteralArgumentBuilder)class_465.method_2231("rotated")
                                 .then(
                                    class_465.method_2236("rot", class_3030.method_13831())
                                       .redirect(
                                          var3,
                                          var0x -> ((class_9155)var0x.getSource())
                                                .method_42183(class_3030.method_13832(var0x, "rot").method_8025((class_9155)var0x.getSource()))
                                       )
                                 ))
                              .then(class_465.method_2231("as").then(class_465.method_2236("targets", class_5601.method_25407()).fork(var3, var0x -> {
                                 ArrayList var3x = Lists.newArrayList();

                                 for (class_8145 var5 : class_5601.method_25417(var0x, "targets")) {
                                    var3x.add(((class_9155)var0x.getSource()).method_42183(var5.method_37366()));
                                 }

                                 return var3x;
                              })))
                        ))
                     .then(
                        ((LiteralArgumentBuilder)class_465.method_2231("facing")
                              .then(
                                 class_465.method_2231("entity")
                                    .then(
                                       class_465.method_2236("targets", class_5601.method_25407())
                                          .then(class_465.method_2236("anchor", class_7386.method_33644()).fork(var3, var0x -> {
                                             ArrayList var3x = Lists.newArrayList();
                                             class_6139 var4 = class_7386.method_33645(var0x, "anchor");

                                             for (class_8145 var6 : class_5601.method_25417(var0x, "targets")) {
                                                var3x.add(((class_9155)var0x.getSource()).method_42184(var6, var4));
                                             }

                                             return var3x;
                                          }))
                                    )
                              ))
                           .then(
                              class_465.method_2236("pos", class_1029.method_4556())
                                 .redirect(var3, var0x -> ((class_9155)var0x.getSource()).method_42182(class_1029.method_4555(var0x, "pos")))
                           )
                     ))
                  .then(
                     class_465.method_2231("align")
                        .then(
                           class_465.method_2236("axes", class_8834.method_40633())
                              .redirect(
                                 var3,
                                 var0x -> ((class_9155)var0x.getSource())
                                       .method_42180(((class_9155)var0x.getSource()).method_42192().method_6201(class_8834.method_40632(var0x, "axes")))
                              )
                        )
                  ))
               .then(
                  class_465.method_2231("anchored")
                     .then(
                        class_465.method_2236("anchor", class_7386.method_33644())
                           .redirect(var3, var0x -> ((class_9155)var0x.getSource()).method_42197(class_7386.method_33645(var0x, "anchor")))
                     )
               ))
            .then(
               class_465.method_2231("in")
                  .then(
                     class_465.method_2236("dimension", class_6937.method_31737())
                        .redirect(var3, var0x -> ((class_9155)var0x.getSource()).method_42195(class_6937.method_31736(var0x, "dimension")))
                  )
            )
      );
   }

   private static ArgumentBuilder<class_9155, ?> method_2388(LiteralCommandNode<class_9155> var0, LiteralArgumentBuilder<class_9155> var1, boolean var2) {
      var1.then(
         class_465.method_2231("score")
            .then(
               class_465.method_2236("targets", class_2282.method_10523())
                  .suggests(class_2282.field_11406)
                  .then(
                     class_465.method_2236("objective", class_7728.method_34976())
                        .redirect(
                           var0,
                           var1x -> method_2380(
                                 (class_9155)var1x.getSource(), class_2282.method_10525(var1x, "targets"), class_7728.method_34978(var1x, "objective"), var2
                              )
                        )
                  )
            )
      );
      var1.then(
         class_465.method_2231("bossbar")
            .then(
               ((RequiredArgumentBuilder)class_465.method_2236("id", class_4195.method_19515())
                     .suggests(class_1367.field_7429)
                     .then(
                        class_465.method_2231("value")
                           .redirect(var0, var1x -> method_2386((class_9155)var1x.getSource(), class_1367.method_6329(var1x), true, var2))
                     ))
                  .then(
                     class_465.method_2231("max")
                        .redirect(var0, var1x -> method_2386((class_9155)var1x.getSource(), class_1367.method_6329(var1x), false, var2))
                  )
            )
      );

      for (class_5098 var6 : class_3781.field_18460) {
         var6.method_23414(
            var1,
            var3 -> var3.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236(
                                       "path", class_4235.method_19750()
                                    )
                                    .then(
                                       class_465.method_2231("int")
                                          .then(
                                             class_465.method_2236("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   var0,
                                                   var2xx -> method_2387(
                                                         (class_9155)var2xx.getSource(),
                                                         var6.method_23413(var2xx),
                                                         class_4235.method_19748(var2xx, "path"),
                                                         var1xxx -> class_9413.method_43597(
                                                               (int)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale"))
                                                            ),
                                                         var2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    class_465.method_2231("float")
                                       .then(
                                          class_465.method_2236("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                var0,
                                                var2xx -> method_2387(
                                                      (class_9155)var2xx.getSource(),
                                                      var6.method_23413(var2xx),
                                                      class_4235.method_19748(var2xx, "path"),
                                                      var1xxx -> class_5718.method_25854(
                                                            (float)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale"))
                                                         ),
                                                      var2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 class_465.method_2231("short")
                                    .then(
                                       class_465.method_2236("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             var0,
                                             var2xx -> method_2387(
                                                   (class_9155)var2xx.getSource(),
                                                   var6.method_23413(var2xx),
                                                   class_4235.method_19748(var2xx, "path"),
                                                   var1xxx -> class_7745.method_35070(
                                                         (short)((int)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale")))
                                                      ),
                                                   var2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              class_465.method_2231("long")
                                 .then(
                                    class_465.method_2236("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          var0,
                                          var2xx -> method_2387(
                                                (class_9155)var2xx.getSource(),
                                                var6.method_23413(var2xx),
                                                class_4235.method_19748(var2xx, "path"),
                                                var1xxx -> class_3388.method_15658((long)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale"))),
                                                var2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           class_465.method_2231("double")
                              .then(
                                 class_465.method_2236("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       var0,
                                       var2xx -> method_2387(
                                             (class_9155)var2xx.getSource(),
                                             var6.method_23413(var2xx),
                                             class_4235.method_19748(var2xx, "path"),
                                             var1xxx -> class_9708.method_44846((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale")),
                                             var2
                                          )
                                    )
                              )
                        ))
                     .then(
                        class_465.method_2231("byte")
                           .then(
                              class_465.method_2236("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    var0,
                                    var2xx -> method_2387(
                                          (class_9155)var2xx.getSource(),
                                          var6.method_23413(var2xx),
                                          class_4235.method_19748(var2xx, "path"),
                                          var1xxx -> class_5284.method_24120((byte)((int)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale")))),
                                          var2
                                       )
                                 )
                           )
                     )
               )
         );
      }

      return var1;
   }

   private static class_9155 method_2380(class_9155 var0, Collection<String> var1, class_4399 var2, boolean var3) {
      class_2917 var6 = var0.method_42177().method_1655();
      return var0.method_42187((var4, var5, var6x) -> {
         for (String var10 : var1) {
            class_8274 var11 = var6.method_4855(var10, var2);
            int var12 = !var3 ? (!var5 ? 0 : 1) : var6x;
            var11.method_38140(var12);
         }
      }, field_3061);
   }

   private static class_9155 method_2386(class_9155 var0, class_87 var1, boolean var2, boolean var3) {
      return var0.method_42187((var3x, var4, var5) -> {
         int var8 = !var3 ? (!var4 ? 0 : 1) : var5;
         if (!var2) {
            var1.method_219(var8);
         } else {
            var1.method_212(var8);
         }
      }, field_3061);
   }

   private static class_9155 method_2387(class_9155 var0, class_1429 var1, class_9257 var2, IntFunction<class_8406> var3, boolean var4) {
      return var0.method_42187((var4x, var5, var6) -> {
         try {
            class_5734 var9 = var1.method_6573();
            int var10 = var4 ? var6 : (var5 ? 1 : 0);
            var2.method_42653(var9, () -> (class_8406)var3.apply(var10));
            var1.method_6572(var9);
         } catch (CommandSyntaxException var11) {
         }
      }, field_3061);
   }

   private static ArgumentBuilder<class_9155, ?> method_2374(CommandNode<class_9155> var0, LiteralArgumentBuilder<class_9155> var1, boolean var2) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.then(
                     class_465.method_2231("block")
                        .then(
                           class_465.method_2236("pos", class_1024.method_4522())
                              .then(
                                 method_2385(
                                    var0,
                                    class_465.method_2236("block", class_2061.method_9620()),
                                    var2,
                                    var0x -> class_2061.method_9622(var0x, "block")
                                          .test(new class_9115(((class_9155)var0x.getSource()).method_42198(), class_1024.method_4519(var0x, "pos"), true))
                                 )
                              )
                        )
                  ))
                  .then(
                     class_465.method_2231("score")
                        .then(
                           class_465.method_2236("target", class_2282.method_10522())
                              .suggests(class_2282.field_11406)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236(
                                                      "targetObjective", class_7728.method_34976()
                                                   )
                                                   .then(
                                                      class_465.method_2231("=")
                                                         .then(
                                                            class_465.method_2236("source", class_2282.method_10522())
                                                               .suggests(class_2282.field_11406)
                                                               .then(
                                                                  method_2385(
                                                                     var0,
                                                                     class_465.method_2236("sourceObjective", class_7728.method_34976()),
                                                                     var2,
                                                                     var0x -> method_2373(var0x, Integer::equals)
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   class_465.method_2231("<")
                                                      .then(
                                                         class_465.method_2236("source", class_2282.method_10522())
                                                            .suggests(class_2282.field_11406)
                                                            .then(
                                                               method_2385(
                                                                  var0,
                                                                  class_465.method_2236("sourceObjective", class_7728.method_34976()),
                                                                  var2,
                                                                  var0x -> method_2373(var0x, (var0xx, var1x) -> var0xx < var1x)
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                class_465.method_2231("<=")
                                                   .then(
                                                      class_465.method_2236("source", class_2282.method_10522())
                                                         .suggests(class_2282.field_11406)
                                                         .then(
                                                            method_2385(
                                                               var0,
                                                               class_465.method_2236("sourceObjective", class_7728.method_34976()),
                                                               var2,
                                                               var0x -> method_2373(var0x, (var0xx, var1x) -> var0xx <= var1x)
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             class_465.method_2231(">")
                                                .then(
                                                   class_465.method_2236("source", class_2282.method_10522())
                                                      .suggests(class_2282.field_11406)
                                                      .then(
                                                         method_2385(
                                                            var0,
                                                            class_465.method_2236("sourceObjective", class_7728.method_34976()),
                                                            var2,
                                                            var0x -> method_2373(var0x, (var0xx, var1x) -> var0xx > var1x)
                                                         )
                                                      )
                                                )
                                          ))
                                       .then(
                                          class_465.method_2231(">=")
                                             .then(
                                                class_465.method_2236("source", class_2282.method_10522())
                                                   .suggests(class_2282.field_11406)
                                                   .then(
                                                      method_2385(
                                                         var0,
                                                         class_465.method_2236("sourceObjective", class_7728.method_34976()),
                                                         var2,
                                                         var0x -> method_2373(var0x, (var0xx, var1x) -> var0xx >= var1x)
                                                      )
                                                   )
                                             )
                                       ))
                                    .then(
                                       class_465.method_2231("matches")
                                          .then(
                                             method_2385(
                                                var0,
                                                class_465.method_2236("range", class_5303.method_24233()),
                                                var2,
                                                var0x -> method_2381(var0x, class_6640.method_30512(var0x, "range"))
                                             )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  class_465.method_2231("blocks")
                     .then(
                        class_465.method_2236("start", class_1024.method_4522())
                           .then(
                              class_465.method_2236("end", class_1024.method_4522())
                                 .then(
                                    ((RequiredArgumentBuilder)class_465.method_2236("destination", class_1024.method_4522())
                                          .then(method_2371(var0, class_465.method_2231("all"), var2, false)))
                                       .then(method_2371(var0, class_465.method_2231("masked"), var2, true))
                                 )
                           )
                     )
               ))
            .then(
               class_465.method_2231("entity")
                  .then(
                     ((RequiredArgumentBuilder)class_465.method_2236("entities", class_5601.method_25407())
                           .fork(var0, var1x -> method_2376(var1x, var2, !class_5601.method_25417(var1x, "entities").isEmpty())))
                        .executes(method_2377(var2, var0x -> class_5601.method_25417(var0x, "entities").size()))
                  )
            ))
         .then(
            class_465.method_2231("predicate")
               .then(
                  method_2385(
                     var0,
                     class_465.method_2236("predicate", class_4195.method_19515()).suggests(field_3059),
                     var2,
                     var0x -> method_2370((class_9155)var0x.getSource(), class_4195.method_19516(var0x, "predicate"))
                  )
               )
         );

      for (class_5098 var6 : class_3781.field_18457) {
         var1.then(
            var6.method_23414(
               class_465.method_2231("data"),
               var3 -> var3.then(
                     ((RequiredArgumentBuilder)class_465.method_2236("path", class_4235.method_19750())
                           .fork(var0, var2xx -> method_2376(var2xx, var2, method_2372(var6.method_23413(var2xx), class_4235.method_19748(var2xx, "path")) > 0)))
                        .executes(method_2377(var2, var1xx -> method_2372(var6.method_23413(var1xx), class_4235.method_19748(var1xx, "path"))))
                  )
            )
         );
      }

      return var1;
   }

   private static Command<class_9155> method_2377(boolean var0, class_8884 var1) {
      return !var0 ? var1x -> {
         int var4 = var1.method_40897(var1x);
         if (var4 != 0) {
            throw field_3057.create(var4);
         } else {
            ((class_9155)var1x.getSource()).method_42196(new TranslationTextComponent("commands.execute.conditional.pass"), false);
            return 1;
         }
      } : var1x -> {
         int var4 = var1.method_40897(var1x);
         if (var4 <= 0) {
            throw field_3062.create();
         } else {
            ((class_9155)var1x.getSource()).method_42196(new TranslationTextComponent("commands.execute.conditional.pass_count", var4), false);
            return var4;
         }
      };
   }

   private static int method_2372(class_1429 var0, class_9257 var1) throws CommandSyntaxException {
      return var1.method_42654(var0.method_6573());
   }

   private static boolean method_2373(CommandContext<class_9155> var0, BiPredicate<Integer, Integer> var1) throws CommandSyntaxException {
      String var4 = class_2282.method_10520(var0, "target");
      class_4399 var5 = class_7728.method_34978(var0, "targetObjective");
      String var6 = class_2282.method_10520(var0, "source");
      class_4399 var7 = class_7728.method_34978(var0, "sourceObjective");
      class_2917 var8 = ((class_9155)var0.getSource()).method_42177().method_1655();
      if (var8.method_4857(var4, var5) && var8.method_4857(var6, var7)) {
         class_8274 var9 = var8.method_4855(var4, var5);
         class_8274 var10 = var8.method_4855(var6, var7);
         return var1.test(var9.method_38146(), var10.method_38146());
      } else {
         return false;
      }
   }

   private static boolean method_2381(CommandContext<class_9155> var0, class_7781 var1) throws CommandSyntaxException {
      String var4 = class_2282.method_10520(var0, "target");
      class_4399 var5 = class_7728.method_34978(var0, "targetObjective");
      class_2917 var6 = ((class_9155)var0.getSource()).method_42177().method_1655();
      return var6.method_4857(var4, var5) ? var1.method_35307(var6.method_4855(var4, var5).method_38146()) : false;
   }

   private static boolean method_2370(class_9155 var0, class_7279 var1) {
      class_6331 var4 = var0.method_42198();
      class_8480 var5 = new class_8480(var4)
         .method_39065(class_8712.field_44671, var0.method_42192())
         .method_39069(class_8712.field_44676, var0.method_42200());
      return var1.test(var5.method_39064(class_4933.field_25576));
   }

   private static Collection<class_9155> method_2376(CommandContext<class_9155> var0, boolean var1, boolean var2) {
      return (Collection<class_9155>)(var2 != var1 ? Collections.<class_9155>emptyList() : Collections.<class_9155>singleton((class_9155)var0.getSource()));
   }

   private static ArgumentBuilder<class_9155, ?> method_2385(CommandNode<class_9155> var0, ArgumentBuilder<class_9155, ?> var1, boolean var2, class_776 var3) {
      return var1.fork(var0, var2x -> method_2376(var2x, var2, var3.method_3472(var2x))).executes(var2x -> {
         if (var2 != var3.method_3472(var2x)) {
            throw field_3062.create();
         } else {
            ((class_9155)var2x.getSource()).method_42196(new TranslationTextComponent("commands.execute.conditional.pass"), false);
            return 1;
         }
      });
   }

   private static ArgumentBuilder<class_9155, ?> method_2371(CommandNode<class_9155> var0, ArgumentBuilder<class_9155, ?> var1, boolean var2, boolean var3) {
      return var1.fork(var0, var2x -> method_2376(var2x, var2, method_2382(var2x, var3).isPresent()))
         .executes(!var2 ? var1x -> method_2379(var1x, var3) : var1x -> method_2375(var1x, var3));
   }

   private static int method_2375(CommandContext<class_9155> var0, boolean var1) throws CommandSyntaxException {
      OptionalInt var4 = method_2382(var0, var1);
      if (!var4.isPresent()) {
         throw field_3062.create();
      } else {
         ((class_9155)var0.getSource()).method_42196(new TranslationTextComponent("commands.execute.conditional.pass_count", var4.getAsInt()), false);
         return var4.getAsInt();
      }
   }

   private static int method_2379(CommandContext<class_9155> var0, boolean var1) throws CommandSyntaxException {
      OptionalInt var4 = method_2382(var0, var1);
      if (!var4.isPresent()) {
         ((class_9155)var0.getSource()).method_42196(new TranslationTextComponent("commands.execute.conditional.pass"), false);
         return 1;
      } else {
         throw field_3057.create(var4.getAsInt());
      }
   }

   private static OptionalInt method_2382(CommandContext<class_9155> var0, boolean var1) throws CommandSyntaxException {
      return method_2383(
         ((class_9155)var0.getSource()).method_42198(),
         class_1024.method_4519(var0, "start"),
         class_1024.method_4519(var0, "end"),
         class_1024.method_4519(var0, "destination"),
         var1
      );
   }

   private static OptionalInt method_2383(class_6331 var0, class_1331 var1, class_1331 var2, class_1331 var3, boolean var4) throws CommandSyntaxException {
      class_9616 var7 = new class_9616(var1, var2);
      class_9616 var8 = new class_9616(var3, var3.method_6105(var7.method_44394()));
      class_1331 var9 = new class_1331(var8.field_48996 - var7.field_48996, var8.field_48995 - var7.field_48995, var8.field_48992 - var7.field_48992);
      int var10 = var7.method_44393() * var7.method_44398() * var7.method_44387();
      if (var10 > 32768) {
         throw field_3060.create(32768, var10);
      } else {
         int var11 = 0;

         for (int var12 = var7.field_48992; var12 <= var7.field_48994; var12++) {
            for (int var13 = var7.field_48995; var13 <= var7.field_48993; var13++) {
               for (int var14 = var7.field_48996; var14 <= var7.field_48991; var14++) {
                  class_1331 var15 = new class_1331(var14, var13, var12);
                  class_1331 var16 = var15.method_6105(var9);
                  class_2522 var17 = var0.method_28262(var15);
                  if (!var4 || !var17.method_8350(class_4783.field_23184)) {
                     if (var17 != var0.method_28262(var16)) {
                        return OptionalInt.empty();
                     }

                     class_3757 var18 = var0.method_28260(var15);
                     class_3757 var19 = var0.method_28260(var16);
                     if (var18 != null) {
                        if (var19 == null) {
                           return OptionalInt.empty();
                        }

                        class_5734 var20 = var18.method_17396(new class_5734());
                        var20.method_25959("x");
                        var20.method_25959("y");
                        var20.method_25959("z");
                        class_5734 var21 = var19.method_17396(new class_5734());
                        var21.method_25959("x");
                        var21.method_25959("y");
                        var21.method_25959("z");
                        if (!var20.equals(var21)) {
                           return OptionalInt.empty();
                        }
                     }

                     var11++;
                  }
               }
            }
         }

         return OptionalInt.of(var11);
      }
   }
}
