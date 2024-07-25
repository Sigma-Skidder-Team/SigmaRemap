package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.util.text.TranslationTextComponent;

public class class_654 {
   private static final SimpleCommandExceptionType field_3640 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType field_3641 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("commands.clone.toobig", var0, var1)
   );
   private static final SimpleCommandExceptionType field_3638 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.clone.failed"));
   public static final Predicate<class_9115> field_3637 = var0 -> !var0.method_41968().method_8345();

   public static void method_3008(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("clone").requires(var0x -> var0x.method_40314(2)))
            .then(
               class_465.method_2236("begin", class_1024.method_4522())
                  .then(
                     class_465.method_2236("end", class_1024.method_4522())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236(
                                          "destination", class_1024.method_4522()
                                       )
                                       .executes(
                                          var0x -> method_3009(
                                                (class_9155)var0x.getSource(),
                                                class_1024.method_4519(var0x, "begin"),
                                                class_1024.method_4519(var0x, "end"),
                                                class_1024.method_4519(var0x, "destination"),
                                                var0xx -> true,
                                                class_6648.field_34401
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("replace")
                                                   .executes(
                                                      var0x -> method_3009(
                                                            (class_9155)var0x.getSource(),
                                                            class_1024.method_4519(var0x, "begin"),
                                                            class_1024.method_4519(var0x, "end"),
                                                            class_1024.method_4519(var0x, "destination"),
                                                            var0xx -> true,
                                                            class_6648.field_34401
                                                         )
                                                   ))
                                                .then(
                                                   class_465.method_2231("force")
                                                      .executes(
                                                         var0x -> method_3009(
                                                               (class_9155)var0x.getSource(),
                                                               class_1024.method_4519(var0x, "begin"),
                                                               class_1024.method_4519(var0x, "end"),
                                                               class_1024.method_4519(var0x, "destination"),
                                                               var0xx -> true,
                                                               class_6648.field_34404
                                                            )
                                                      )
                                                ))
                                             .then(
                                                class_465.method_2231("move")
                                                   .executes(
                                                      var0x -> method_3009(
                                                            (class_9155)var0x.getSource(),
                                                            class_1024.method_4519(var0x, "begin"),
                                                            class_1024.method_4519(var0x, "end"),
                                                            class_1024.method_4519(var0x, "destination"),
                                                            var0xx -> true,
                                                            class_6648.field_34403
                                                         )
                                                   )
                                             ))
                                          .then(
                                             class_465.method_2231("normal")
                                                .executes(
                                                   var0x -> method_3009(
                                                         (class_9155)var0x.getSource(),
                                                         class_1024.method_4519(var0x, "begin"),
                                                         class_1024.method_4519(var0x, "end"),
                                                         class_1024.method_4519(var0x, "destination"),
                                                         var0xx -> true,
                                                         class_6648.field_34401
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("masked")
                                                .executes(
                                                   var0x -> method_3009(
                                                         (class_9155)var0x.getSource(),
                                                         class_1024.method_4519(var0x, "begin"),
                                                         class_1024.method_4519(var0x, "end"),
                                                         class_1024.method_4519(var0x, "destination"),
                                                         field_3637,
                                                         class_6648.field_34401
                                                      )
                                                ))
                                             .then(
                                                class_465.method_2231("force")
                                                   .executes(
                                                      var0x -> method_3009(
                                                            (class_9155)var0x.getSource(),
                                                            class_1024.method_4519(var0x, "begin"),
                                                            class_1024.method_4519(var0x, "end"),
                                                            class_1024.method_4519(var0x, "destination"),
                                                            field_3637,
                                                            class_6648.field_34404
                                                         )
                                                   )
                                             ))
                                          .then(
                                             class_465.method_2231("move")
                                                .executes(
                                                   var0x -> method_3009(
                                                         (class_9155)var0x.getSource(),
                                                         class_1024.method_4519(var0x, "begin"),
                                                         class_1024.method_4519(var0x, "end"),
                                                         class_1024.method_4519(var0x, "destination"),
                                                         field_3637,
                                                         class_6648.field_34403
                                                      )
                                                )
                                          ))
                                       .then(
                                          class_465.method_2231("normal")
                                             .executes(
                                                var0x -> method_3009(
                                                      (class_9155)var0x.getSource(),
                                                      class_1024.method_4519(var0x, "begin"),
                                                      class_1024.method_4519(var0x, "end"),
                                                      class_1024.method_4519(var0x, "destination"),
                                                      field_3637,
                                                      class_6648.field_34401
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 class_465.method_2231("filtered")
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236(
                                                      "filter", class_2061.method_9620()
                                                   )
                                                   .executes(
                                                      var0x -> method_3009(
                                                            (class_9155)var0x.getSource(),
                                                            class_1024.method_4519(var0x, "begin"),
                                                            class_1024.method_4519(var0x, "end"),
                                                            class_1024.method_4519(var0x, "destination"),
                                                            class_2061.method_9622(var0x, "filter"),
                                                            class_6648.field_34401
                                                         )
                                                   ))
                                                .then(
                                                   class_465.method_2231("force")
                                                      .executes(
                                                         var0x -> method_3009(
                                                               (class_9155)var0x.getSource(),
                                                               class_1024.method_4519(var0x, "begin"),
                                                               class_1024.method_4519(var0x, "end"),
                                                               class_1024.method_4519(var0x, "destination"),
                                                               class_2061.method_9622(var0x, "filter"),
                                                               class_6648.field_34404
                                                            )
                                                      )
                                                ))
                                             .then(
                                                class_465.method_2231("move")
                                                   .executes(
                                                      var0x -> method_3009(
                                                            (class_9155)var0x.getSource(),
                                                            class_1024.method_4519(var0x, "begin"),
                                                            class_1024.method_4519(var0x, "end"),
                                                            class_1024.method_4519(var0x, "destination"),
                                                            class_2061.method_9622(var0x, "filter"),
                                                            class_6648.field_34403
                                                         )
                                                   )
                                             ))
                                          .then(
                                             class_465.method_2231("normal")
                                                .executes(
                                                   var0x -> method_3009(
                                                         (class_9155)var0x.getSource(),
                                                         class_1024.method_4519(var0x, "begin"),
                                                         class_1024.method_4519(var0x, "end"),
                                                         class_1024.method_4519(var0x, "destination"),
                                                         class_2061.method_9622(var0x, "filter"),
                                                         class_6648.field_34401
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

   private static int method_3009(class_9155 var0, BlockPos var1, BlockPos var2, BlockPos var3, Predicate<class_9115> var4, class_6648 var5) throws CommandSyntaxException {
      class_9616 var8 = new class_9616(var1, var2);
      BlockPos var9 = var3.method_6105(var8.method_44394());
      class_9616 var10 = new class_9616(var3, var9);
      if (!var5.method_30543() && var10.method_44402(var8)) {
         throw field_3640.create();
      } else {
         int var11 = var8.method_44393() * var8.method_44398() * var8.method_44387();
         if (var11 > 32768) {
            throw field_3641.create(32768, var11);
         } else {
            class_6331 var12 = var0.method_42198();
            if (var12.method_22570(var1, var2) && var12.method_22570(var3, var9)) {
               ArrayList var13 = Lists.newArrayList();
               ArrayList var14 = Lists.newArrayList();
               ArrayList var15 = Lists.newArrayList();
               LinkedList var16 = Lists.newLinkedList();
               BlockPos var17 = new BlockPos(
                  var10.field_48996 - var8.field_48996, var10.field_48995 - var8.field_48995, var10.field_48992 - var8.field_48992
               );

               for (int var18 = var8.field_48992; var18 <= var8.field_48994; var18++) {
                  for (int var19 = var8.field_48995; var19 <= var8.field_48993; var19++) {
                     for (int var20 = var8.field_48996; var20 <= var8.field_48991; var20++) {
                        BlockPos var21 = new BlockPos(var20, var19, var18);
                        BlockPos var22 = var21.method_6105(var17);
                        class_9115 var23 = new class_9115(var12, var21, false);
                        class_2522 var24 = var23.method_41968();
                        if (var4.test(var23)) {
                           class_3757 var25 = var12.method_28260(var21);
                           if (var25 == null) {
                              if (!var24.method_8321(var12, var21) && !var24.method_8306(var12, var21)) {
                                 var15.add(new class_519(var22, var24, (CompoundNBT)null));
                                 var16.addFirst(var21);
                              } else {
                                 var13.add(new class_519(var22, var24, (CompoundNBT)null));
                                 var16.addLast(var21);
                              }
                           } else {
                              CompoundNBT var26 = var25.method_17396(new CompoundNBT());
                              var14.add(new class_519(var22, var24, var26));
                              var16.addLast(var21);
                           }
                        }
                     }
                  }
               }

               if (var5 == class_6648.field_34403) {
                  for (BlockPos var30 : var16) {
                     class_3757 var33 = var12.method_28260(var30);
                     class_5507.method_24976(var33);
                     var12.method_7513(var30, class_4783.field_23207.method_29260(), 2);
                  }

                  for (BlockPos var31 : var16) {
                     var12.method_7513(var31, class_4783.field_23184.method_29260(), 3);
                  }
               }

               ArrayList var29 = Lists.newArrayList();
               var29.addAll(var13);
               var29.addAll(var14);
               var29.addAll(var15);
               List var32 = Lists.reverse(var29);

               for (class_519 var36 : var32) {
                  class_3757 var40 = var12.method_28260(var36.field_3175);
                  class_5507.method_24976(var40);
                  var12.method_7513(var36.field_3175, class_4783.field_23207.method_29260(), 2);
               }

               int var35 = 0;

               for (class_519 var41 : var29) {
                  if (var12.method_7513(var41.field_3175, var41.field_3176, 2)) {
                     var35++;
                  }
               }

               for (class_519 var42 : var14) {
                  class_3757 var44 = var12.method_28260(var42.field_3175);
                  if (var42.field_3174 != null && var44 != null) {
                     var42.field_3174.putInt("x", var42.field_3175.getX());
                     var42.field_3174.putInt("y", var42.field_3175.getY());
                     var42.field_3174.putInt("z", var42.field_3175.getZ());
                     var44.method_17394(var42.field_3176, var42.field_3174);
                     var44.method_17407();
                  }

                  var12.method_7513(var42.field_3175, var42.field_3176, 2);
               }

               for (class_519 var43 : var32) {
                  var12.method_43369(var43.field_3175, var43.field_3176.method_8360());
               }

               var12.method_28968().method_13091(var8, var17);
               if (var35 != 0) {
                  var0.method_42196(new TranslationTextComponent("commands.clone.success", var35), true);
                  return var35;
               } else {
                  throw field_3638.create();
               }
            } else {
               throw class_1024.field_5670.create();
            }
         }
      }
   }
}
