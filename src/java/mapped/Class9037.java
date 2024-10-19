package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.nbt.JSONToNBT;
import net.minecraft.util.Util;
import net.minecraft.command.CommandSource;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.network.DebugPacketSender;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.world.server.ServerWorld;
import org.apache.commons.io.IOUtils;

public class Class9037 {
   public static void method33489(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder) Commands.method18839(
                                             "test"
                                          )
                                          .then(Commands.method18839("runthis").executes(var0x -> method33492((CommandSource)var0x.getSource()))))
                                       .then(Commands.method18839("runthese").executes(var0x -> method33493((CommandSource)var0x.getSource()))))
                                    .then(
                                       ((LiteralArgumentBuilder) Commands.method18839("runfailed")
                                             .executes(var0x -> method33501((CommandSource)var0x.getSource(), false, 0, 8)))
                                          .then(
                                             ((RequiredArgumentBuilder) Commands.method18840("onlyRequiredTests", BoolArgumentType.bool())
                                                   .executes(
                                                      var0x -> method33501(
                                                            (CommandSource)var0x.getSource(), BoolArgumentType.getBool(var0x, "onlyRequiredTests"), 0, 8
                                                         )
                                                   ))
                                                .then(
                                                   ((RequiredArgumentBuilder) Commands.method18840("rotationSteps", IntegerArgumentType.integer())
                                                         .executes(
                                                            var0x -> method33501(
                                                                  (CommandSource)var0x.getSource(),
                                                                  BoolArgumentType.getBool(var0x, "onlyRequiredTests"),
                                                                  IntegerArgumentType.getInteger(var0x, "rotationSteps"),
                                                                  8
                                                               )
                                                         ))
                                                      .then(
                                                         Commands.method18840("testsPerRow", IntegerArgumentType.integer())
                                                            .executes(
                                                               var0x -> method33501(
                                                                     (CommandSource)var0x.getSource(),
                                                                     BoolArgumentType.getBool(var0x, "onlyRequiredTests"),
                                                                     IntegerArgumentType.getInteger(var0x, "rotationSteps"),
                                                                     IntegerArgumentType.getInteger(var0x, "testsPerRow")
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    Commands.method18839("run")
                                       .then(
                                          ((RequiredArgumentBuilder) Commands.method18840("testName", Class9418.method36138())
                                                .executes(var0x -> method33497((CommandSource)var0x.getSource(), Class9418.method36139(var0x, "testName"), 0)))
                                             .then(
                                                Commands.method18840("rotationSteps", IntegerArgumentType.integer())
                                                   .executes(
                                                      var0x -> method33497(
                                                            (CommandSource)var0x.getSource(),
                                                            Class9418.method36139(var0x, "testName"),
                                                            IntegerArgumentType.getInteger(var0x, "rotationSteps")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder) Commands.method18839("runall")
                                          .executes(var0x -> method33499((CommandSource)var0x.getSource(), 0, 8)))
                                       .then(
                                          ((RequiredArgumentBuilder) Commands.method18840("testClassName", Class9210.method34510())
                                                .executes(
                                                   var0x -> method33500((CommandSource)var0x.getSource(), Class9210.method34511(var0x, "testClassName"), 0, 8)
                                                ))
                                             .then(
                                                ((RequiredArgumentBuilder) Commands.method18840("rotationSteps", IntegerArgumentType.integer())
                                                      .executes(
                                                         var0x -> method33500(
                                                               (CommandSource)var0x.getSource(),
                                                               Class9210.method34511(var0x, "testClassName"),
                                                               IntegerArgumentType.getInteger(var0x, "rotationSteps"),
                                                               8
                                                            )
                                                      ))
                                                   .then(
                                                      Commands.method18840("testsPerRow", IntegerArgumentType.integer())
                                                         .executes(
                                                            var0x -> method33500(
                                                                  (CommandSource)var0x.getSource(),
                                                                  Class9210.method34511(var0x, "testClassName"),
                                                                  IntegerArgumentType.getInteger(var0x, "rotationSteps"),
                                                                  IntegerArgumentType.getInteger(var0x, "testsPerRow")
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder) Commands.method18840("rotationSteps", IntegerArgumentType.integer())
                                             .executes(
                                                var0x -> method33499((CommandSource)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "rotationSteps"), 8)
                                             ))
                                          .then(
                                             Commands.method18840("testsPerRow", IntegerArgumentType.integer())
                                                .executes(
                                                   var0x -> method33499(
                                                         (CommandSource)var0x.getSource(),
                                                         IntegerArgumentType.getInteger(var0x, "rotationSteps"),
                                                         IntegerArgumentType.getInteger(var0x, "testsPerRow")
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              Commands.method18839("export")
                                 .then(
                                    Commands.method18840("testName", StringArgumentType.word())
                                       .executes(var0x -> method33505((CommandSource)var0x.getSource(), StringArgumentType.getString(var0x, "testName")))
                                 )
                           ))
                        .then(Commands.method18839("exportthis").executes(var0x -> method33504((CommandSource)var0x.getSource()))))
                     .then(
                        Commands.method18839("import")
                           .then(
                              Commands.method18840("testName", StringArgumentType.word())
                                 .executes(var0x -> method33506((CommandSource)var0x.getSource(), StringArgumentType.getString(var0x, "testName")))
                           )
                     ))
                  .then(
                     ((LiteralArgumentBuilder) Commands.method18839("pos").executes(var0x -> method33491((CommandSource)var0x.getSource(), "pos")))
                        .then(
                           Commands.method18840("var", StringArgumentType.word())
                              .executes(var0x -> method33491((CommandSource)var0x.getSource(), StringArgumentType.getString(var0x, "var")))
                        )
                  ))
               .then(
                  Commands.method18839("create")
                     .then(
                        ((RequiredArgumentBuilder) Commands.method18840("testName", StringArgumentType.word())
                              .executes(var0x -> method33490((CommandSource)var0x.getSource(), StringArgumentType.getString(var0x, "testName"), 5, 5, 5)))
                           .then(
                              ((RequiredArgumentBuilder) Commands.method18840("width", IntegerArgumentType.integer())
                                    .executes(
                                       var0x -> method33490(
                                             (CommandSource)var0x.getSource(),
                                             StringArgumentType.getString(var0x, "testName"),
                                             IntegerArgumentType.getInteger(var0x, "width"),
                                             IntegerArgumentType.getInteger(var0x, "width"),
                                             IntegerArgumentType.getInteger(var0x, "width")
                                          )
                                    ))
                                 .then(
                                    Commands.method18840("height", IntegerArgumentType.integer())
                                       .then(
                                          Commands.method18840("depth", IntegerArgumentType.integer())
                                             .executes(
                                                var0x -> method33490(
                                                      (CommandSource)var0x.getSource(),
                                                      StringArgumentType.getString(var0x, "testName"),
                                                      IntegerArgumentType.getInteger(var0x, "width"),
                                                      IntegerArgumentType.getInteger(var0x, "height"),
                                                      IntegerArgumentType.getInteger(var0x, "depth")
                                                   )
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder) Commands.method18839("clearall").executes(var0x -> method33496((CommandSource)var0x.getSource(), 200)))
                  .then(
                     Commands.method18840("radius", IntegerArgumentType.integer())
                        .executes(var0x -> method33496((CommandSource)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "radius")))
                  )
            )
      );
   }

   private static int method33490(CommandSource var0, String var1, int var2, int var3, int var4) {
      if (var2 <= 48 && var3 <= 48 && var4 <= 48) {
         ServerWorld var7 = var0.method20172();
         BlockPos var8 = new BlockPos(var0.method20171());
         BlockPos var9 = new BlockPos(var8.getX(), var0.method20172().method7006(Heightmap.Type.WORLD_SURFACE, var8).getY(), var8.getZ() + 3);
         Class7803.method26055(var1.toLowerCase(), var9, new BlockPos(var2, var3, var4), Rotation.NONE, var7);

         for (int var10 = 0; var10 < var2; var10++) {
            for (int var11 = 0; var11 < var4; var11++) {
               BlockPos var12 = new BlockPos(var9.getX() + var10, var9.getY() + 1, var9.getZ() + var11);
               Block var13 = Blocks.POLISHED_ANDESITE;
               Class164 var14 = new Class164(var13.getDefaultState(), Collections.EMPTY_SET, (CompoundNBT)null);
               var14.method496(var7, var12, 2);
            }
         }

         Class7803.method26054(var9, new BlockPos(1, 0, -1), Rotation.NONE, var7);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int method33491(CommandSource var0, String var1) throws CommandSyntaxException {
      BlockRayTraceResult var4 = (BlockRayTraceResult)var0.method20175().pick(10.0, 1.0F, false);
      BlockPos var5 = var4.getPos();
      ServerWorld var6 = var0.method20172();
      Optional var7 = Class7803.method26060(var5, 15, var6);
      if (!var7.isPresent()) {
         var7 = Class7803.method26060(var5, 200, var6);
      }

      if (var7.isPresent()) {
         Class964 var8 = (Class964)var6.getTileEntity((BlockPos)var7.get());
         BlockPos var9 = var5.method8338((Vector3i)var7.get());
         String var10 = var9.getX() + ", " + var9.getY() + ", " + var9.getZ();
         String var11 = var8.method3935();
         IFormattableTextComponent var12 = new StringTextComponent(var10)
            .setStyle(
               Style.EMPTY
                  .setBold(true)
                  .setFormatting(TextFormatting.GREEN)
                  .setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new StringTextComponent("Click to copy to clipboard")))
                  .setClickEvent(new ClickEvent(ClickEvent$Action.COPY_TO_CLIPBOARD, "final BlockPos " + var1 + " = new BlockPos(" + var10 + ");"))
            );
         var0.sendFeedback(new StringTextComponent("Position relative to " + var11 + ": ").append(var12), false);
         DebugPacketSender.method23610(var6, new BlockPos(var5), var10, -2147418368, 10000);
         return 1;
      } else {
         var0.method20181(new StringTextComponent("Can't find a structure block that contains the targeted pos " + var5));
         return 0;
      }
   }

   private static int method33492(CommandSource var0) {
      BlockPos var3 = new BlockPos(var0.method20171());
      ServerWorld var4 = var0.method20172();
      BlockPos var5 = Class7803.method26061(var3, 15, var4);
      if (var5 != null) {
         Class7440.method24038(var4);
         method33494(var4, var5, (Class9494)null);
         return 1;
      } else {
         method33507(var4, "Couldn't find any structure block within 15 radius", TextFormatting.RED);
         return 0;
      }
   }

   private static int method33493(CommandSource var0) {
      BlockPos var3 = new BlockPos(var0.method20171());
      ServerWorld var4 = var0.method20172();
      Collection<BlockPos> var5 = Class7803.method26062(var3, 200, var4);
      if (!var5.isEmpty()) {
         Class7440.method24038(var4);
         method33503(var0, "Running " + var5.size() + " tests...");
         Class9494 var6 = new Class9494();
         var5.forEach(var2 -> method33494(var4, var2, var6));
         return 1;
      } else {
         method33507(var4, "Couldn't find any structure blocks within 200 block radius", TextFormatting.RED);
         return 1;
      }
   }

   private static void method33494(ServerWorld var0, BlockPos var1, Class9494 var2) {
      Class964 var5 = (Class964)var0.getTileEntity(var1);
      String var6 = var5.method3935();
      Class4871 var7 = Class7936.method26709(var6);
      Class8262 var8 = new Class8262(var7, var5.method3946(), var0);
      if (var2 != null) {
         var2.method36669(var8);
         var8.method28816(new Class8408(var0, var2));
      }

      method33498(var7, var0);
      AxisAlignedBB var9 = Class7803.method26052(var5);
      BlockPos var10 = new BlockPos(var9.minX, var9.minY, var9.minZ);
      Class7440.method24029(var8, var10, Class7879.field33820);
   }

   private static void method33495(ServerWorld var0, Class9494 var1) {
      if (var1.method36678()) {
         method33507(var0, "GameTest done! " + var1.method36677() + " tests were run", TextFormatting.WHITE);
         if (!var1.method36675()) {
            method33507(var0, "All required tests passed :)", TextFormatting.GREEN);
         } else {
            method33507(var0, "" + var1.method36672() + " required tests failed :(", TextFormatting.RED);
         }

         if (var1.method36676()) {
            method33507(var0, "" + var1.method36673() + " optional tests failed", TextFormatting.GRAY);
         }
      }
   }

   private static int method33496(CommandSource var0, int var1) {
      ServerWorld var4 = var0.method20172();
      Class7440.method24038(var4);
      BlockPos var5 = new BlockPos(
         var0.method20171().x,
         (double)var0.method20172().method7006(Heightmap.Type.WORLD_SURFACE, new BlockPos(var0.method20171())).getY(),
         var0.method20171().z
      );
      Class7440.method24040(var4, var5, Class7879.field33820, MathHelper.clamp(var1, 0, 1024));
      return 1;
   }

   private static int method33497(CommandSource var0, Class4871 var1, int var2) {
      ServerWorld var5 = var0.method20172();
      BlockPos var6 = new BlockPos(var0.method20171());
      int var7 = var0.method20172().method7006(Heightmap.Type.WORLD_SURFACE, var6).getY();
      BlockPos var8 = new BlockPos(var6.getX(), var7, var6.getZ() + 3);
      Class7440.method24038(var5);
      method33498(var1, var5);
      Rotation var9 = Class7803.method26051(var2);
      Class8262 var10 = new Class8262(var1, var9, var5);
      Class7440.method24029(var10, var8, Class7879.field33820);
      return 1;
   }

   private static void method33498(Class4871 var0, ServerWorld var1) {
      Consumer var4 = Class7936.method26707(var0.method15038());
      if (var4 != null) {
         var4.accept(var1);
      }
   }

   private static int method33499(CommandSource var0, int var1, int var2) {
      Class7440.method24038(var0.method20172());
      Collection var5 = Class7936.method26704();
      method33503(var0, "Running all " + var5.size() + " tests...");
      Class7936.method26713();
      method33502(var0, var5, var1, var2);
      return 1;
   }

   private static int method33500(CommandSource var0, String var1, int var2, int var3) {
      Collection var6 = Class7936.method26703(var1);
      Class7440.method24038(var0.method20172());
      method33503(var0, "Running " + var6.size() + " tests from " + var1 + "...");
      Class7936.method26713();
      method33502(var0, var6, var2, var3);
      return 1;
   }

   private static int method33501(CommandSource var0, boolean var1, int var2, int var3) {
      Collection var6;
      if (!var1) {
         var6 = Class7936.method26711();
      } else {
         var6 = Class7936.method26711().stream().filter(Class4871::method15037).collect(Collectors.toList());
      }

      if (!var6.isEmpty()) {
         Class7440.method24038(var0.method20172());
         method33503(var0, "Rerunning " + var6.size() + " failed tests (" + (!var1 ? "including optional tests" : "only required tests") + ")");
         method33502(var0, var6, var2, var3);
         return 1;
      } else {
         method33503(var0, "No failed tests to rerun");
         return 0;
      }
   }

   private static void method33502(CommandSource var0, Collection<Class4871> var1, int var2, int var3) {
      BlockPos var6 = new BlockPos(var0.method20171());
      BlockPos var7 = new BlockPos(var6.getX(), var0.method20172().method7006(Heightmap.Type.WORLD_SURFACE, var6).getY(), var6.getZ() + 3);
      ServerWorld var8 = var0.method20172();
      Rotation var9 = Class7803.method26051(var2);
      Collection var10 = Class7440.method24031(var1, var7, var9, var8, Class7879.field33820, var3);
      Class9494 var11 = new Class9494(var10);
      var11.method36670(new Class8408(var8, var11));
      var11.method36671(var0x -> Class7936.method26712(var0x.method28822()));
   }

   private static void method33503(CommandSource var0, String var1) {
      var0.sendFeedback(new StringTextComponent(var1), false);
   }

   private static int method33504(CommandSource var0) {
      BlockPos var3 = new BlockPos(var0.method20171());
      ServerWorld var4 = var0.method20172();
      BlockPos var5 = Class7803.method26061(var3, 15, var4);
      if (var5 != null) {
         Class964 var6 = (Class964)var4.getTileEntity(var5);
         String var7 = var6.method3935();
         return method33505(var0, var7);
      } else {
         method33507(var4, "Couldn't find any structure block within 15 radius", TextFormatting.RED);
         return 0;
      }
   }

   private static int method33505(CommandSource var0, String var1) {
      Path var4 = Paths.get(Class7803.field33501);
      ResourceLocation var5 = new ResourceLocation("minecraft", var1);
      Path var6 = var0.method20172().method6938().method31611(var5, ".nbt");
      Path var7 = Class4448.method14080(var6, var1, var4);
      if (var7 == null) {
         method33503(var0, "Failed to export " + var6);
         return 1;
      } else {
         try {
            Files.createDirectories(var7.getParent());
         } catch (IOException var9) {
            method33503(var0, "Could not create folder " + var7.getParent());
            var9.printStackTrace();
            return 1;
         }

         method33503(var0, "Exported " + var1 + " to " + var7.toAbsolutePath());
         return 0;
      }
   }

   private static int method33506(CommandSource var0, String var1) {
      Path var4 = Paths.get(Class7803.field33501, var1 + ".snbt");
      ResourceLocation var5 = new ResourceLocation("minecraft", var1);
      Path var6 = var0.method20172().method6938().method31611(var5, ".nbt");

      try {
         BufferedReader var7 = Files.newBufferedReader(var4);
         String var8 = IOUtils.toString(var7);
         Files.createDirectories(var6.getParent());

         try (OutputStream var9 = Files.newOutputStream(var6)) {
            CompressedStreamTools.writeCompressed(JSONToNBT.getTagFromJSON(var8), var9);
         }

         method33503(var0, "Imported to " + var6.toAbsolutePath());
         return 0;
      } catch (IOException | CommandSyntaxException var22) {
         System.err.println("Failed to load structure " + var1);
         var22.printStackTrace();
         return 1;
      }
   }

   private static void method33507(ServerWorld var0, String var1, TextFormatting var2) {
      var0.method6914(var0x -> true).forEach(var2x -> var2x.sendMessage(new StringTextComponent(var2 + var1), Util.DUMMY_UUID));
   }

   // $VF: synthetic method
   public static void method33536(ServerWorld var0, Class9494 var1) {
      method33495(var0, var1);
   }
}
