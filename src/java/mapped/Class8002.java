package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8002 {
   private static final SimpleCommandExceptionType field34403 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.summon.failed"));
   private static final SimpleCommandExceptionType field34404 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType field34405 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.summon.invalidPosition"));

   public static void method27335(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("summon").requires(var0x -> var0x.method20129(2)))
            .then(
               ((RequiredArgumentBuilder)Class6099.method18840("entity", Class7822.method26155())
                     .suggests(Class9222.field42457)
                     .executes(
                        var0x -> method27336(
                              (Class6619)var0x.getSource(),
                              Class7822.method26156(var0x, "entity"),
                              ((Class6619)var0x.getSource()).method20171(),
                              new CompoundNBT(),
                              true
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)Class6099.method18840("pos", Class6851.method20857())
                           .executes(
                              var0x -> method27336(
                                    (Class6619)var0x.getSource(),
                                    Class7822.method26156(var0x, "entity"),
                                    Class6851.method20859(var0x, "pos"),
                                    new CompoundNBT(),
                                    true
                                 )
                           ))
                        .then(
                           Class6099.method18840("nbt", Class9770.method38432())
                              .executes(
                                 var0x -> method27336(
                                       (Class6619)var0x.getSource(),
                                       Class7822.method26156(var0x, "entity"),
                                       Class6851.method20859(var0x, "pos"),
                                       Class9770.method38433(var0x, "nbt"),
                                       false
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method27336(Class6619 var0, ResourceLocation var1, Vector3d var2, CompoundNBT var3, boolean var4) throws CommandSyntaxException {
      BlockPos var7 = new BlockPos(var2);
      if (World.isInvalidPosition(var7)) {
         CompoundNBT var8 = var3.method79();
         var8.method109("id", var1.toString());
         ServerWorld var9 = var0.method20172();
         Entity var10 = EntityType.method33223(var8, var9, var1x -> {
            var1x.method3273(var2.field18048, var2.field18049, var2.field18050, var1x.rotationYaw, var1x.rotationPitch);
            return var1x;
         });
         if (var10 != null) {
            if (var4 && var10 instanceof Class1006) {
               ((Class1006)var10)
                  .method4276(var0.method20172(), var0.method20172().method6807(var10.getPosition()), Class2202.field14404, (Class5093)null, (CompoundNBT)null);
            }

            if (var9.method6928(var10)) {
               var0.method20179(new TranslationTextComponent("commands.summon.success", var10.getDisplayName()), true);
               return 1;
            } else {
               throw field34404.create();
            }
         } else {
            throw field34403.create();
         }
      } else {
         throw field34405.create();
      }
   }
}
