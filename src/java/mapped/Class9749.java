package mapped;

import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class Class9749 {
   private static final Dynamic2CommandExceptionType field45507 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("commands.forceload.toobig", var0, var1)
   );
   private static final Dynamic2CommandExceptionType field45508 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("commands.forceload.query.failure", var0, var1)
   );
   private static final SimpleCommandExceptionType field45509 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType field45510 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.forceload.removed.failure")
   );

   public static void method38286(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("forceload")
                     .requires(var0x -> var0x.method20129(2)))
                  .then(
                     Class6099.method18839("add")
                        .then(
                           ((RequiredArgumentBuilder)Class6099.method18840("from", Class8693.method31319())
                                 .executes(
                                    var0x -> method38290(
                                          (Class6619)var0x.getSource(), Class8693.method31320(var0x, "from"), Class8693.method31320(var0x, "from"), true
                                       )
                                 ))
                              .then(
                                 Class6099.method18840("to", Class8693.method31319())
                                    .executes(
                                       var0x -> method38290(
                                             (Class6619)var0x.getSource(), Class8693.method31320(var0x, "from"), Class8693.method31320(var0x, "to"), true
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)Class6099.method18839("remove")
                        .then(
                           ((RequiredArgumentBuilder)Class6099.method18840("from", Class8693.method31319())
                                 .executes(
                                    var0x -> method38290(
                                          (Class6619)var0x.getSource(), Class8693.method31320(var0x, "from"), Class8693.method31320(var0x, "from"), false
                                       )
                                 ))
                              .then(
                                 Class6099.method18840("to", Class8693.method31319())
                                    .executes(
                                       var0x -> method38290(
                                             (Class6619)var0x.getSource(), Class8693.method31320(var0x, "from"), Class8693.method31320(var0x, "to"), false
                                          )
                                    )
                              )
                        ))
                     .then(Class6099.method18839("all").executes(var0x -> method38289((Class6619)var0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)Class6099.method18839("query").executes(var0x -> method38288((Class6619)var0x.getSource())))
                  .then(
                     Class6099.method18840("pos", Class8693.method31319())
                        .executes(var0x -> method38287((Class6619)var0x.getSource(), Class8693.method31320(var0x, "pos")))
                  )
            )
      );
   }

   private static int method38287(Class6619 var0, Class7760 var1) throws CommandSyntaxException {
      ChunkPos var4 = new ChunkPos(var1.field33332 >> 4, var1.field33333 >> 4);
      ServerWorld var5 = var0.method20172();
      RegistryKey var6 = var5.getDimensionKey();
      boolean var7 = var5.method6949().contains(var4.asLong());
      if (!var7) {
         throw field45508.create(var4, var6.getLocation());
      } else {
         var0.method20179(new TranslationTextComponent("commands.forceload.query.success", var4, var6.getLocation()), false);
         return 1;
      }
   }

   private static int method38288(Class6619 var0) {
      ServerWorld var3 = var0.method20172();
      RegistryKey var4 = var3.getDimensionKey();
      LongSet var5 = var3.method6949();
      int var6 = var5.size();
      if (var6 <= 0) {
         var0.method20181(new TranslationTextComponent("commands.forceload.added.none", var4.getLocation()));
      } else {
         String var7 = Joiner.on(", ").join(var5.stream().sorted().<ChunkPos>map(ChunkPos::new).<String>map(ChunkPos::toString).iterator());
         if (var6 != 1) {
            var0.method20179(new TranslationTextComponent("commands.forceload.list.multiple", var6, var4.getLocation(), var7), false);
         } else {
            var0.method20179(new TranslationTextComponent("commands.forceload.list.single", var4.getLocation(), var7), false);
         }
      }

      return var6;
   }

   private static int method38289(Class6619 var0) {
      ServerWorld var3 = var0.method20172();
      RegistryKey<World> var4 = var3.getDimensionKey();
      LongSet var5 = var3.method6949();
      for (long var1 : var5) {
         var3.method6950(ChunkPos.getX(var1), ChunkPos.getZ(var1), false);
      }
      var0.method20179(new TranslationTextComponent("commands.forceload.removed.all", var4.getLocation()), true);
      return 0;
   }

   private static int method38290(Class6619 var0, Class7760 var1, Class7760 var2, boolean var3) throws CommandSyntaxException {
      int var6 = Math.min(var1.field33332, var2.field33332);
      int var7 = Math.min(var1.field33333, var2.field33333);
      int var8 = Math.max(var1.field33332, var2.field33332);
      int var9 = Math.max(var1.field33333, var2.field33333);
      if (var6 >= -30000000 && var7 >= -30000000 && var8 < 30000000 && var9 < 30000000) {
         int var10 = var6 >> 4;
         int var11 = var7 >> 4;
         int var12 = var8 >> 4;
         int var13 = var9 >> 4;
         long var14 = ((long)(var12 - var10) + 1L) * ((long)(var13 - var11) + 1L);
         if (var14 > 256L) {
            throw field45507.create(256, var14);
         } else {
            ServerWorld var16 = var0.method20172();
            RegistryKey var17 = var16.getDimensionKey();
            ChunkPos var18 = null;
            int var19 = 0;

            for (int var20 = var10; var20 <= var12; var20++) {
               for (int var21 = var11; var21 <= var13; var21++) {
                  boolean var22 = var16.method6950(var20, var21, var3);
                  if (var22) {
                     var19++;
                     if (var18 == null) {
                        var18 = new ChunkPos(var20, var21);
                     }
                  }
               }
            }

            if (var19 != 0) {
               if (var19 != 1) {
                  ChunkPos var23 = new ChunkPos(var10, var11);
                  ChunkPos var24 = new ChunkPos(var12, var13);
                  var0.method20179(
                     new TranslationTextComponent("commands.forceload." + (!var3 ? "removed" : "added") + ".multiple", var19, var17.getLocation(), var23, var24),
                     true
                  );
               } else {
                  var0.method20179(
                     new TranslationTextComponent("commands.forceload." + (!var3 ? "removed" : "added") + ".single", var18, var17.getLocation()), true
                  );
               }

               return var19;
            } else {
               throw (!var3 ? field45510 : field45509).create();
            }
         }
      } else {
         throw Class6849.field29742.create();
      }
   }
}
