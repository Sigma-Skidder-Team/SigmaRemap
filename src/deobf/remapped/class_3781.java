package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3781 {
   private static final SimpleCommandExceptionType field_18458 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType field_18459 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.data.get.invalid", var0)
   );
   private static final DynamicCommandExceptionType field_18456 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.data.get.unknown", var0)
   );
   private static final SimpleCommandExceptionType field_18462 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType field_18452 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.data.modify.expected_list", var0)
   );
   private static final DynamicCommandExceptionType field_18453 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.data.modify.expected_object", var0)
   );
   private static final DynamicCommandExceptionType field_18461 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.data.modify.invalid_index", var0)
   );
   public static final List<Function<String, class_5098>> field_18455 = ImmutableList.of(class_4288.field_20810, class_5749.field_29109, class_3460.field_16954);
   public static final List<class_5098> field_18460 = field_18455.stream()
      .<class_5098>map(var0 -> var0.apply("target"))
      .collect(ImmutableList.toImmutableList());
   public static final List<class_5098> field_18457 = field_18455.stream()
      .<class_5098>map(var0 -> var0.apply("source"))
      .collect(ImmutableList.toImmutableList());

   public static void method_17537(CommandDispatcher<class_9155> var0) {
      LiteralArgumentBuilder var3 = (LiteralArgumentBuilder)class_465.method_2231("data").requires(var0x -> var0x.method_40314(2));

      for (class_5098 var5 : field_18460) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var3.then(
                     var5.method_23414(
                        class_465.method_2231("merge"),
                        var1 -> var1.then(
                              class_465.method_2236("nbt", class_9646.method_44519())
                                 .executes(
                                    var1x -> method_17544((class_9155)var1x.getSource(), var5.method_23413(var1x), class_9646.method_44521(var1x, "nbt"))
                                 )
                           )
                     )
                  ))
                  .then(
                     var5.method_23414(
                        class_465.method_2231("get"),
                        var1 -> var1.executes(var1x -> method_17546((class_9155)var1x.getSource(), var5.method_23413(var1x)))
                              .then(
                                 ((RequiredArgumentBuilder)class_465.method_2236("path", class_4235.method_19750())
                                       .executes(
                                          var1x -> method_17547((class_9155)var1x.getSource(), var5.method_23413(var1x), class_4235.method_19748(var1x, "path"))
                                       ))
                                    .then(
                                       class_465.method_2236("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             var1x -> method_17545(
                                                   (class_9155)var1x.getSource(),
                                                   var5.method_23413(var1x),
                                                   class_4235.method_19748(var1x, "path"),
                                                   DoubleArgumentType.getDouble(var1x, "scale")
                                                )
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  var5.method_23414(
                     class_465.method_2231("remove"),
                     var1 -> var1.then(
                           class_465.method_2236("path", class_4235.method_19750())
                              .executes(var1x -> method_17539((class_9155)var1x.getSource(), var5.method_23413(var1x), class_4235.method_19748(var1x, "path")))
                        )
                  )
               ))
            .then(
               method_17538(
                  (var0x, var1) -> var0x.then(
                           class_465.method_2231("insert")
                              .then(class_465.method_2236("index", IntegerArgumentType.integer()).then(var1.method_11967((var0xx, var1x, var2, var3x) -> {
                                 int var6 = IntegerArgumentType.getInteger(var0xx, "index");
                                 return method_17542(var6, var1x, var2, var3x);
                              })))
                        )
                        .then(class_465.method_2231("prepend").then(var1.method_11967((var0xx, var1x, var2, var3x) -> method_17542(0, var1x, var2, var3x))))
                        .then(class_465.method_2231("append").then(var1.method_11967((var0xx, var1x, var2, var3x) -> method_17542(-1, var1x, var2, var3x))))
                        .then(
                           class_465.method_2231("set")
                              .then(
                                 var1.method_11967(
                                    (var0xx, var1x, var2, var3x) -> var2.method_42653(var1x, ((class_8406)Iterables.getLast(var3x))::method_38708)
                                 )
                              )
                        )
                        .then(class_465.method_2231("merge").then(var1.method_11967((var0xx, var1x, var2, var3x) -> {
                           List var6 = var2.method_42651(var1x, class_5734::new);
                           int var7 = 0;

                           for (class_8406 var9 : var6) {
                              if (!(var9 instanceof class_5734)) {
                                 throw field_18453.create(var9);
                              }

                              class_5734 var10 = (class_5734)var9;
                              class_5734 var11 = var10.method_25944();

                              for (class_8406 var13 : var3x) {
                                 if (!(var13 instanceof class_5734)) {
                                    throw field_18453.create(var13);
                                 }

                                 var10.method_25925((class_5734)var13);
                              }

                              var7 += !var11.equals(var10) ? 1 : 0;
                           }

                           return var7;
                        })))
               )
            );
      }

      var0.register(var3);
   }

   private static int method_17542(int var0, class_5734 var1, class_9257 var2, List<class_8406> var3) throws CommandSyntaxException {
      List var6 = var2.method_42651(var1, class_3416::new);
      int var7 = 0;

      for (class_8406 var9 : var6) {
         if (!(var9 instanceof class_6850)) {
            throw field_18452.create(var9);
         }

         boolean var10 = false;
         class_6850 var11 = (class_6850)var9;
         int var12 = var0 < 0 ? var11.size() + var0 + 1 : var0;

         for (class_8406 var14 : var3) {
            try {
               if (var11.method_31426(var12, var14.method_38708())) {
                  var12++;
                  var10 = true;
               }
            } catch (IndexOutOfBoundsException var16) {
               throw field_18461.create(var12);
            }
         }

         var7 += var10 ? 1 : 0;
      }

      return var7;
   }

   private static ArgumentBuilder<class_9155, ?> method_17538(BiConsumer<ArgumentBuilder<class_9155, ?>, class_2653> var0) {
      LiteralArgumentBuilder var3 = class_465.method_2231("modify");

      for (class_5098 var5 : field_18460) {
         var5.method_23414(var3, var2 -> {
            RequiredArgumentBuilder var5x = class_465.method_2236("targetPath", class_4235.method_19750());

            for (class_5098 var7 : field_18457) {
               var0.accept(var5x, var2x -> var7.method_23414(class_465.method_2231("from"), var3x -> var3x.executes(var3xx -> {
                        List var6 = Collections.<class_5734>singletonList(var7.method_23413(var3xx).method_6573());
                        return method_17543(var3xx, var5, var2x, var6);
                     }).then(class_465.method_2236("sourcePath", class_4235.method_19750()).executes(var3xx -> {
                        class_1429 var6 = var7.method_23413(var3xx);
                        class_9257 var7x = class_4235.method_19748(var3xx, "sourcePath");
                        List var8 = var7x.method_42652(var6.method_6573());
                        return method_17543(var3xx, var5, var2x, var8);
                     }))));
            }

            var0.accept(var5x, var1x -> class_465.method_2231("value").then(class_465.method_2236("value", class_5874.method_26749()).executes(var2x -> {
                  List var5xx = Collections.<class_8406>singletonList(class_5874.method_26747(var2x, "value"));
                  return method_17543(var2x, var5, var1x, var5xx);
               })));
            return var2.then(var5x);
         });
      }

      return var3;
   }

   private static int method_17543(CommandContext<class_9155> var0, class_5098 var1, class_2823 var2, List<class_8406> var3) throws CommandSyntaxException {
      class_1429 var6 = var1.method_23413(var0);
      class_9257 var7 = class_4235.method_19748(var0, "targetPath");
      class_5734 var8 = var6.method_6573();
      int var9 = var2.method_12850(var0, var8, var7, var3);
      if (var9 != 0) {
         var6.method_6572(var8);
         ((class_9155)var0.getSource()).method_42196(var6.method_6570(), true);
         return var9;
      } else {
         throw field_18458.create();
      }
   }

   private static int method_17539(class_9155 var0, class_1429 var1, class_9257 var2) throws CommandSyntaxException {
      class_5734 var5 = var1.method_6573();
      int var6 = var2.method_42646(var5);
      if (var6 != 0) {
         var1.method_6572(var5);
         var0.method_42196(var1.method_6570(), true);
         return var6;
      } else {
         throw field_18458.create();
      }
   }

   private static class_8406 method_17541(class_9257 var0, class_1429 var1) throws CommandSyntaxException {
      List var4 = var0.method_42652(var1.method_6573());
      Iterator var5 = var4.iterator();
      class_8406 var6 = (class_8406)var5.next();
      if (!var5.hasNext()) {
         return var6;
      } else {
         throw field_18462.create();
      }
   }

   private static int method_17547(class_9155 var0, class_1429 var1, class_9257 var2) throws CommandSyntaxException {
      class_8406 var5 = method_17541(var2, var1);
      int var6;
      if (!(var5 instanceof class_5841)) {
         if (!(var5 instanceof class_6850)) {
            if (!(var5 instanceof class_5734)) {
               if (!(var5 instanceof class_473)) {
                  throw field_18456.create(var2.toString());
               }

               var6 = var5.method_38710().length();
            } else {
               var6 = ((class_5734)var5).method_25924();
            }
         } else {
            var6 = ((class_6850)var5).size();
         }
      } else {
         var6 = class_9299.method_42847(((class_5841)var5).method_26642());
      }

      var0.method_42196(var1.method_6574(var5), false);
      return var6;
   }

   private static int method_17545(class_9155 var0, class_1429 var1, class_9257 var2, double var3) throws CommandSyntaxException {
      class_8406 var7 = method_17541(var2, var1);
      if (var7 instanceof class_5841) {
         int var8 = class_9299.method_42847(((class_5841)var7).method_26642() * var3);
         var0.method_42196(var1.method_6571(var2, var3, var8), false);
         return var8;
      } else {
         throw field_18459.create(var2.toString());
      }
   }

   private static int method_17546(class_9155 var0, class_1429 var1) throws CommandSyntaxException {
      var0.method_42196(var1.method_6574(var1.method_6573()), false);
      return 1;
   }

   private static int method_17544(class_9155 var0, class_1429 var1, class_5734 var2) throws CommandSyntaxException {
      class_5734 var5 = var1.method_6573();
      class_5734 var6 = var5.method_25944().method_25925(var2);
      if (!var5.equals(var6)) {
         var1.method_6572(var6);
         var0.method_42196(var1.method_6570(), true);
         return 1;
      } else {
         throw field_18458.create();
      }
   }
}
