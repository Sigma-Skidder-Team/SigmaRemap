package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9202 {
   private static final SimpleCommandExceptionType field_47079 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.teleport.invalidPosition")
   );

   public static void method_42457(CommandDispatcher<class_9155> var0) {
      LiteralCommandNode var3 = var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("teleport")
                     .requires(var0x -> var0x.method_40314(2)))
                  .then(
                     ((RequiredArgumentBuilder)class_465.method_2236("targets", class_5601.method_25407())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236("location", class_1029.method_4556())
                                       .executes(
                                          var0x -> method_42459(
                                                (class_9155)var0x.getSource(),
                                                class_5601.method_25410(var0x, "targets"),
                                                ((class_9155)var0x.getSource()).method_42198(),
                                                class_1029.method_4558(var0x, "location"),
                                                (class_1808)null,
                                                (class_4839)null
                                             )
                                       ))
                                    .then(
                                       class_465.method_2236("rotation", class_3030.method_13831())
                                          .executes(
                                             var0x -> method_42459(
                                                   (class_9155)var0x.getSource(),
                                                   class_5601.method_25410(var0x, "targets"),
                                                   ((class_9155)var0x.getSource()).method_42198(),
                                                   class_1029.method_4558(var0x, "location"),
                                                   class_3030.method_13832(var0x, "rotation"),
                                                   (class_4839)null
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)class_465.method_2231("facing")
                                          .then(
                                             class_465.method_2231("entity")
                                                .then(
                                                   ((RequiredArgumentBuilder)class_465.method_2236("facingEntity", class_5601.method_25411())
                                                         .executes(
                                                            var0x -> method_42459(
                                                                  (class_9155)var0x.getSource(),
                                                                  class_5601.method_25410(var0x, "targets"),
                                                                  ((class_9155)var0x.getSource()).method_42198(),
                                                                  class_1029.method_4558(var0x, "location"),
                                                                  (class_1808)null,
                                                                  new class_4839(class_5601.method_25413(var0x, "facingEntity"), class_6139.field_31493)
                                                               )
                                                         ))
                                                      .then(
                                                         class_465.method_2236("facingAnchor", class_7386.method_33644())
                                                            .executes(
                                                               var0x -> method_42459(
                                                                     (class_9155)var0x.getSource(),
                                                                     class_5601.method_25410(var0x, "targets"),
                                                                     ((class_9155)var0x.getSource()).method_42198(),
                                                                     class_1029.method_4558(var0x, "location"),
                                                                     (class_1808)null,
                                                                     new class_4839(
                                                                        class_5601.method_25413(var0x, "facingEntity"),
                                                                        class_7386.method_33645(var0x, "facingAnchor")
                                                                     )
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          class_465.method_2236("facingLocation", class_1029.method_4556())
                                             .executes(
                                                var0x -> method_42459(
                                                      (class_9155)var0x.getSource(),
                                                      class_5601.method_25410(var0x, "targets"),
                                                      ((class_9155)var0x.getSource()).method_42198(),
                                                      class_1029.method_4558(var0x, "location"),
                                                      (class_1808)null,
                                                      new class_4839(class_1029.method_4555(var0x, "facingLocation"))
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           class_465.method_2236("destination", class_5601.method_25411())
                              .executes(
                                 var0x -> method_42460(
                                       (class_9155)var0x.getSource(), class_5601.method_25410(var0x, "targets"), class_5601.method_25413(var0x, "destination")
                                    )
                              )
                        )
                  ))
               .then(
                  class_465.method_2236("location", class_1029.method_4556())
                     .executes(
                        var0x -> method_42459(
                              (class_9155)var0x.getSource(),
                              Collections.singleton(((class_9155)var0x.getSource()).method_42178()),
                              ((class_9155)var0x.getSource()).method_42198(),
                              class_1029.method_4558(var0x, "location"),
                              class_5095.method_23408(),
                              (class_4839)null
                           )
                     )
               ))
            .then(
               class_465.method_2236("destination", class_5601.method_25411())
                  .executes(
                     var0x -> method_42460(
                           (class_9155)var0x.getSource(),
                           Collections.singleton(((class_9155)var0x.getSource()).method_42178()),
                           class_5601.method_25413(var0x, "destination")
                        )
                  )
            )
      );
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("tp").requires(var0x -> var0x.method_40314(2))).redirect(var3));
   }

   private static int method_42460(class_9155 var0, Collection<? extends Entity> var1, Entity var2) throws CommandSyntaxException {
      for (Entity var6 : var1) {
         method_42461(
            var0,
            var6,
            (class_6331)var2.world,
            var2.getPosX(),
            var2.method_37309(),
            var2.getPosZ(),
            EnumSet.<class_8089>noneOf(class_8089.class),
            var2.rotationYaw,
            var2.rotationPitch,
            (class_4839)null
         );
      }

      if (var1.size() != 1) {
         var0.method_42196(new TranslationTextComponent("commands.teleport.success.entity.multiple", var1.size(), var2.method_19839()), true);
      } else {
         var0.method_42196(
            new TranslationTextComponent("commands.teleport.success.entity.single", ((Entity)var1.iterator().next()).method_19839(), var2.method_19839()),
            true
         );
      }

      return var1.size();
   }

   private static int method_42459(class_9155 var0, Collection<? extends Entity> var1, class_6331 var2, class_1808 var3, class_1808 var4, class_4839 var5) throws CommandSyntaxException {
      class_1343 var8 = var3.method_8027(var0);
      class_4895 var9 = var4 != null ? var4.method_8025(var0) : null;
      EnumSet var10 = EnumSet.<class_8089>noneOf(class_8089.class);
      if (var3.method_8028()) {
         var10.add(class_8089.field_41423);
      }

      if (var3.method_8026()) {
         var10.add(class_8089.field_41427);
      }

      if (var3.method_8029()) {
         var10.add(class_8089.field_41424);
      }

      if (var4 != null) {
         if (var4.method_8028()) {
            var10.add(class_8089.field_41429);
         }

         if (var4.method_8026()) {
            var10.add(class_8089.field_41428);
         }
      } else {
         var10.add(class_8089.field_41429);
         var10.add(class_8089.field_41428);
      }

      for (Entity var12 : var1) {
         if (var4 != null) {
            method_42461(var0, var12, var2, var8.field_7336, var8.field_7333, var8.field_7334, var10, var9.field_24329, var9.field_24326, var5);
         } else {
            method_42461(var0, var12, var2, var8.field_7336, var8.field_7333, var8.field_7334, var10, var12.rotationYaw, var12.rotationPitch, var5);
         }
      }

      if (var1.size() != 1) {
         var0.method_42196(
            new TranslationTextComponent("commands.teleport.success.location.multiple", var1.size(), var8.field_7336, var8.field_7333, var8.field_7334), true
         );
      } else {
         var0.method_42196(
            new TranslationTextComponent(
               "commands.teleport.success.location.single",
               ((Entity)var1.iterator().next()).method_19839(),
               var8.field_7336,
               var8.field_7333,
               var8.field_7334
            ),
            true
         );
      }

      return var1.size();
   }

   private static void method_42461(
      class_9155 var0,
      Entity var1,
      class_6331 var2,
      double var3,
      double var5,
      double var7,
      Set<class_8089> var9,
      float var10,
      float var11,
      class_4839 var12
   ) throws CommandSyntaxException {
      BlockPos var15 = new BlockPos(var3, var5, var7);
      if (World.method_29593(var15)) {
         if (!(var1 instanceof class_9359)) {
            float var16 = class_9299.method_42810(var10);
            float var17 = class_9299.method_42810(var11);
            var17 = class_9299.method_42828(var17, -90.0F, 90.0F);
            if (var2 != var1.world) {
               var1.method_37269();
               Entity var18 = var1;
               var1 = var1.method_37387().method_30484(var2);
               if (var1 == null) {
                  return;
               }

               var1.method_37199(var18);
               var1.method_37144(var3, var5, var7, var16, var17);
               var1.setRotationYawHead(var16);
               var2.method_28954(var1);
               var18.field_41751 = true;
            } else {
               var1.method_37144(var3, var5, var7, var16, var17);
               var1.setRotationYawHead(var16);
            }
         } else {
            class_2034 var19 = new class_2034(new BlockPos(var3, var5, var7));
            var2.method_28945().method_10177(class_5032.field_26020, var19, 1, var1.method_37145());
            var1.method_37390();
            if (((class_9359)var1).method_26507()) {
               ((class_9359)var1).method_3162(true, true);
            }

            if (var2 != var1.world) {
               ((class_9359)var1).method_43274(var2, var3, var5, var7, var10, var11);
            } else {
               ((class_9359)var1).field_47794.method_4171(var3, var5, var7, var10, var11, var9);
            }

            var1.setRotationYawHead(var10);
         }

         if (var12 != null) {
            var12.method_22262(var0, var1);
         }

         if (!(var1 instanceof class_5834) || !((class_5834)var1).method_26618()) {
            var1.method_37215(var1.method_37098().method_6210(1.0, 0.0, 1.0));
            var1.method_37386(true);
         }

         if (var1 instanceof class_4612) {
            ((class_4612)var1).method_26927().method_5620();
         }
      } else {
         throw field_47079.create();
      }
   }
}
