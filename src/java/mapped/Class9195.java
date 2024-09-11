package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9195 {
   public static final SimpleCommandExceptionType field42233 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.replaceitem.block.failed"));
   public static final DynamicCommandExceptionType field42234 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.replaceitem.slot.inapplicable", var0)
   );
   public static final Dynamic2CommandExceptionType field42235 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("commands.replaceitem.entity.failed", var0, var1)
   );

   public static void method34454(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("replaceitem").requires(var0x -> var0x.method20129(2)))
               .then(
                  Class6099.method18839("block")
                     .then(
                        Class6099.method18840("pos", Class6849.method20826())
                           .then(
                              Class6099.method18840("slot", Class4914.method15195())
                                 .then(
                                    ((RequiredArgumentBuilder)Class6099.method18840("item", Class8722.method31481())
                                          .executes(
                                             var0x -> method34455(
                                                   (Class6619)var0x.getSource(),
                                                   Class6849.method20827(var0x, "pos"),
                                                   Class4914.method15196(var0x, "slot"),
                                                   Class8722.method31482(var0x, "item").method503(1, false)
                                                )
                                          ))
                                       .then(
                                          Class6099.method18840("count", IntegerArgumentType.integer(1, 64))
                                             .executes(
                                                var0x -> method34455(
                                                      (Class6619)var0x.getSource(),
                                                      Class6849.method20827(var0x, "pos"),
                                                      Class4914.method15196(var0x, "slot"),
                                                      Class8722.method31482(var0x, "item").method503(IntegerArgumentType.getInteger(var0x, "count"), true)
                                                   )
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               Class6099.method18839("entity")
                  .then(
                     Class6099.method18840("targets", Class8700.method31347())
                        .then(
                           Class6099.method18840("slot", Class4914.method15195())
                              .then(
                                 ((RequiredArgumentBuilder)Class6099.method18840("item", Class8722.method31481())
                                       .executes(
                                          var0x -> method34456(
                                                (Class6619)var0x.getSource(),
                                                Class8700.method31348(var0x, "targets"),
                                                Class4914.method15196(var0x, "slot"),
                                                Class8722.method31482(var0x, "item").method503(1, false)
                                             )
                                       ))
                                    .then(
                                       Class6099.method18840("count", IntegerArgumentType.integer(1, 64))
                                          .executes(
                                             var0x -> method34456(
                                                   (Class6619)var0x.getSource(),
                                                   Class8700.method31348(var0x, "targets"),
                                                   Class4914.method15196(var0x, "slot"),
                                                   Class8722.method31482(var0x, "item").method503(IntegerArgumentType.getInteger(var0x, "count"), true)
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method34455(Class6619 var0, BlockPos var1, int var2, ItemStack var3) throws CommandSyntaxException {
      TileEntity var6 = var0.method20172().getTileEntity(var1);
      if (var6 instanceof IInventory) {
         IInventory var7 = (IInventory)var6;
         if (var2 >= 0 && var2 < var7.getSizeInventory()) {
            var7.setInventorySlotContents(var2, var3);
            var0.method20179(
               new TranslationTextComponent("commands.replaceitem.block.success", var1.getX(), var1.getY(), var1.getZ(), var3.method32173()),
               true
            );
            return 1;
         } else {
            throw field42234.create(var2);
         }
      } else {
         throw field42233.create();
      }
   }

   private static int method34456(Class6619 var0, Collection<? extends Entity> var1, int var2, ItemStack var3) throws CommandSyntaxException {
      ArrayList var6 = Lists.newArrayListWithCapacity(var1.size());

      for (Entity var8 : var1) {
         if (var8 instanceof ServerPlayerEntity) {
            ((ServerPlayerEntity)var8).container.detectAndSendChanges();
         }

         if (var8.method2963(var2, var3.copy())) {
            var6.add(var8);
            if (var8 instanceof ServerPlayerEntity) {
               ((ServerPlayerEntity)var8).container.detectAndSendChanges();
            }
         }
      }

      if (!var6.isEmpty()) {
         if (var6.size() != 1) {
            var0.method20179(new TranslationTextComponent("commands.replaceitem.entity.success.multiple", var6.size(), var3.method32173()), true);
         } else {
            var0.method20179(
               new TranslationTextComponent("commands.replaceitem.entity.success.single", ((Entity)var6.iterator().next()).getDisplayName(), var3.method32173()),
               true
            );
         }

         return var6.size();
      } else {
         throw field42235.create(var3.method32173(), var2);
      }
   }
}
