package remapped;

import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9562 {
   private static final Dynamic2CommandExceptionType field_48674 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("commands.forceload.toobig", var0, var1)
   );
   private static final Dynamic2CommandExceptionType field_48670 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("commands.forceload.query.failure", var0, var1)
   );
   private static final SimpleCommandExceptionType field_48671 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.forceload.added.failure")
   );
   private static final SimpleCommandExceptionType field_48673 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.forceload.removed.failure")
   );

   public static void method_44204(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("forceload")
                     .requires(var0x -> var0x.method_40314(2)))
                  .then(
                     class_465.method_2231("add")
                        .then(
                           ((RequiredArgumentBuilder)class_465.method_2236("from", class_5565.method_25275())
                                 .executes(
                                    var0x -> method_44205(
                                          (class_9155)var0x.getSource(), class_5565.method_25276(var0x, "from"), class_5565.method_25276(var0x, "from"), true
                                       )
                                 ))
                              .then(
                                 class_465.method_2236("to", class_5565.method_25275())
                                    .executes(
                                       var0x -> method_44205(
                                             (class_9155)var0x.getSource(), class_5565.method_25276(var0x, "from"), class_5565.method_25276(var0x, "to"), true
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)class_465.method_2231("remove")
                        .then(
                           ((RequiredArgumentBuilder)class_465.method_2236("from", class_5565.method_25275())
                                 .executes(
                                    var0x -> method_44205(
                                          (class_9155)var0x.getSource(), class_5565.method_25276(var0x, "from"), class_5565.method_25276(var0x, "from"), false
                                       )
                                 ))
                              .then(
                                 class_465.method_2236("to", class_5565.method_25275())
                                    .executes(
                                       var0x -> method_44205(
                                             (class_9155)var0x.getSource(), class_5565.method_25276(var0x, "from"), class_5565.method_25276(var0x, "to"), false
                                          )
                                    )
                              )
                        ))
                     .then(class_465.method_2231("all").executes(var0x -> method_44207((class_9155)var0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)class_465.method_2231("query").executes(var0x -> method_44206((class_9155)var0x.getSource())))
                  .then(
                     class_465.method_2236("pos", class_5565.method_25275())
                        .executes(var0x -> method_44203((class_9155)var0x.getSource(), class_5565.method_25276(var0x, "pos")))
                  )
            )
      );
   }

   private static int method_44203(class_9155 var0, class_2651 var1) throws CommandSyntaxException {
      class_2034 var4 = new class_2034(var1.field_13051 >> 4, var1.field_13052 >> 4);
      class_6331 var5 = var0.method_42198();
      class_5621 var6 = var5.method_29545();
      boolean var7 = var5.method_28923().contains(var4.method_9539());
      if (!var7) {
         throw field_48670.create(var4, var6.method_25499());
      } else {
         var0.method_42196(new TranslationTextComponent("commands.forceload.query.success", var4, var6.method_25499()), false);
         return 1;
      }
   }

   private static int method_44206(class_9155 var0) {
      class_6331 var3 = var0.method_42198();
      class_5621 var4 = var3.method_29545();
      LongSet var5 = var3.method_28923();
      int var6 = var5.size();
      if (var6 <= 0) {
         var0.method_42175(new TranslationTextComponent("commands.forceload.added.none", var4.method_25499()));
      } else {
         String var7 = Joiner.on(", ").join(var5.stream().sorted().<class_2034>map(class_2034::new).<String>map(class_2034::toString).iterator());
         if (var6 != 1) {
            var0.method_42196(new TranslationTextComponent("commands.forceload.list.multiple", var6, var4.method_25499(), var7), false);
         } else {
            var0.method_42196(new TranslationTextComponent("commands.forceload.list.single", var4.method_25499(), var7), false);
         }
      }

      return var6;
   }

   private static int method_44207(class_9155 var0) {
      class_6331 var3 = var0.method_42198();
      class_5621 var4 = var3.method_29545();
      LongSet var5 = var3.method_28923();
      var5.forEach(var1 -> var3.method_28961(class_2034.method_9541(var1), class_2034.method_9533(var1), false));
      var0.method_42196(new TranslationTextComponent("commands.forceload.removed.all", var4.method_25499()), true);
      return 0;
   }

   private static int method_44205(class_9155 var0, class_2651 var1, class_2651 var2, boolean var3) throws CommandSyntaxException {
      int var6 = Math.min(var1.field_13051, var2.field_13051);
      int var7 = Math.min(var1.field_13052, var2.field_13052);
      int var8 = Math.max(var1.field_13051, var2.field_13051);
      int var9 = Math.max(var1.field_13052, var2.field_13052);
      if (var6 >= -30000000 && var7 >= -30000000 && var8 < 30000000 && var9 < 30000000) {
         int var10 = var6 >> 4;
         int var11 = var7 >> 4;
         int var12 = var8 >> 4;
         int var13 = var9 >> 4;
         long var14 = ((long)(var12 - var10) + 1L) * ((long)(var13 - var11) + 1L);
         if (var14 > 256L) {
            throw field_48674.create(256, var14);
         } else {
            class_6331 var16 = var0.method_42198();
            class_5621 var17 = var16.method_29545();
            class_2034 var18 = null;
            int var19 = 0;

            for (int var20 = var10; var20 <= var12; var20++) {
               for (int var21 = var11; var21 <= var13; var21++) {
                  boolean var22 = var16.method_28961(var20, var21, var3);
                  if (var22) {
                     var19++;
                     if (var18 == null) {
                        var18 = new class_2034(var20, var21);
                     }
                  }
               }
            }

            if (var19 != 0) {
               if (var19 != 1) {
                  class_2034 var23 = new class_2034(var10, var11);
                  class_2034 var24 = new class_2034(var12, var13);
                  var0.method_42196(
                     new TranslationTextComponent(
                        "commands.forceload." + (!var3 ? "removed" : "added") + ".multiple", var19, var17.method_25499(), var23, var24
                     ),
                     true
                  );
               } else {
                  var0.method_42196(
                     new TranslationTextComponent("commands.forceload." + (!var3 ? "removed" : "added") + ".single", var18, var17.method_25499()), true
                  );
               }

               return var19;
            } else {
               throw (!var3 ? field_48673 : field_48671).create();
            }
         }
      } else {
         throw class_1024.field_5672.create();
      }
   }
}
