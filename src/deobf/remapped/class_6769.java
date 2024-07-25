package remapped;

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
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$class_47;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$class_48;
import org.apache.commons.io.IOUtils;

public class class_6769 {
   public static void method_31066(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231(
                                             "test"
                                          )
                                          .then(class_465.method_2231("runthis").executes(var0x -> method_31065((class_9155)var0x.getSource()))))
                                       .then(class_465.method_2231("runthese").executes(var0x -> method_31077((class_9155)var0x.getSource()))))
                                    .then(
                                       ((LiteralArgumentBuilder)class_465.method_2231("runfailed")
                                             .executes(var0x -> method_31061((class_9155)var0x.getSource(), false, 0, 8)))
                                          .then(
                                             ((RequiredArgumentBuilder)class_465.method_2236("onlyRequiredTests", BoolArgumentType.bool())
                                                   .executes(
                                                      var0x -> method_31061(
                                                            (class_9155)var0x.getSource(), BoolArgumentType.getBool(var0x, "onlyRequiredTests"), 0, 8
                                                         )
                                                   ))
                                                .then(
                                                   ((RequiredArgumentBuilder)class_465.method_2236("rotationSteps", IntegerArgumentType.integer())
                                                         .executes(
                                                            var0x -> method_31061(
                                                                  (class_9155)var0x.getSource(),
                                                                  BoolArgumentType.getBool(var0x, "onlyRequiredTests"),
                                                                  IntegerArgumentType.getInteger(var0x, "rotationSteps"),
                                                                  8
                                                               )
                                                         ))
                                                      .then(
                                                         class_465.method_2236("testsPerRow", IntegerArgumentType.integer())
                                                            .executes(
                                                               var0x -> method_31061(
                                                                     (class_9155)var0x.getSource(),
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
                                    class_465.method_2231("run")
                                       .then(
                                          ((RequiredArgumentBuilder)class_465.method_2236("testName", class_8298.method_38282())
                                                .executes(var0x -> method_31070((class_9155)var0x.getSource(), class_8298.method_38281(var0x, "testName"), 0)))
                                             .then(
                                                class_465.method_2236("rotationSteps", IntegerArgumentType.integer())
                                                   .executes(
                                                      var0x -> method_31070(
                                                            (class_9155)var0x.getSource(),
                                                            class_8298.method_38281(var0x, "testName"),
                                                            IntegerArgumentType.getInteger(var0x, "rotationSteps")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("runall")
                                          .executes(var0x -> method_31063((class_9155)var0x.getSource(), 0, 8)))
                                       .then(
                                          ((RequiredArgumentBuilder)class_465.method_2236("testClassName", class_7479.method_34001())
                                                .executes(
                                                   var0x -> method_31075((class_9155)var0x.getSource(), class_7479.method_34002(var0x, "testClassName"), 0, 8)
                                                ))
                                             .then(
                                                ((RequiredArgumentBuilder)class_465.method_2236("rotationSteps", IntegerArgumentType.integer())
                                                      .executes(
                                                         var0x -> method_31075(
                                                               (class_9155)var0x.getSource(),
                                                               class_7479.method_34002(var0x, "testClassName"),
                                                               IntegerArgumentType.getInteger(var0x, "rotationSteps"),
                                                               8
                                                            )
                                                      ))
                                                   .then(
                                                      class_465.method_2236("testsPerRow", IntegerArgumentType.integer())
                                                         .executes(
                                                            var0x -> method_31075(
                                                                  (class_9155)var0x.getSource(),
                                                                  class_7479.method_34002(var0x, "testClassName"),
                                                                  IntegerArgumentType.getInteger(var0x, "rotationSteps"),
                                                                  IntegerArgumentType.getInteger(var0x, "testsPerRow")
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)class_465.method_2236("rotationSteps", IntegerArgumentType.integer())
                                             .executes(
                                                var0x -> method_31063((class_9155)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "rotationSteps"), 8)
                                             ))
                                          .then(
                                             class_465.method_2236("testsPerRow", IntegerArgumentType.integer())
                                                .executes(
                                                   var0x -> method_31063(
                                                         (class_9155)var0x.getSource(),
                                                         IntegerArgumentType.getInteger(var0x, "rotationSteps"),
                                                         IntegerArgumentType.getInteger(var0x, "testsPerRow")
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              class_465.method_2231("export")
                                 .then(
                                    class_465.method_2236("testName", StringArgumentType.word())
                                       .executes(var0x -> method_31076((class_9155)var0x.getSource(), StringArgumentType.getString(var0x, "testName")))
                                 )
                           ))
                        .then(class_465.method_2231("exportthis").executes(var0x -> method_31072((class_9155)var0x.getSource()))))
                     .then(
                        class_465.method_2231("import")
                           .then(
                              class_465.method_2236("testName", StringArgumentType.word())
                                 .executes(var0x -> method_31057((class_9155)var0x.getSource(), StringArgumentType.getString(var0x, "testName")))
                           )
                     ))
                  .then(
                     ((LiteralArgumentBuilder)class_465.method_2231("pos").executes(var0x -> method_31071((class_9155)var0x.getSource(), "pos")))
                        .then(
                           class_465.method_2236("var", StringArgumentType.word())
                              .executes(var0x -> method_31071((class_9155)var0x.getSource(), StringArgumentType.getString(var0x, "var")))
                        )
                  ))
               .then(
                  class_465.method_2231("create")
                     .then(
                        ((RequiredArgumentBuilder)class_465.method_2236("testName", StringArgumentType.word())
                              .executes(var0x -> method_31060((class_9155)var0x.getSource(), StringArgumentType.getString(var0x, "testName"), 5, 5, 5)))
                           .then(
                              ((RequiredArgumentBuilder)class_465.method_2236("width", IntegerArgumentType.integer())
                                    .executes(
                                       var0x -> method_31060(
                                             (class_9155)var0x.getSource(),
                                             StringArgumentType.getString(var0x, "testName"),
                                             IntegerArgumentType.getInteger(var0x, "width"),
                                             IntegerArgumentType.getInteger(var0x, "width"),
                                             IntegerArgumentType.getInteger(var0x, "width")
                                          )
                                    ))
                                 .then(
                                    class_465.method_2236("height", IntegerArgumentType.integer())
                                       .then(
                                          class_465.method_2236("depth", IntegerArgumentType.integer())
                                             .executes(
                                                var0x -> method_31060(
                                                      (class_9155)var0x.getSource(),
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
               ((LiteralArgumentBuilder)class_465.method_2231("clearall").executes(var0x -> method_31074((class_9155)var0x.getSource(), 200)))
                  .then(
                     class_465.method_2236("radius", IntegerArgumentType.integer())
                        .executes(var0x -> method_31074((class_9155)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "radius")))
                  )
            )
      );
   }

   private static int method_31060(class_9155 var0, String var1, int var2, int var3, int var4) {
      if (var2 <= 48 && var3 <= 48 && var4 <= 48) {
         class_6331 var7 = var0.method_42198();
         class_1331 var8 = new class_1331(var0.method_42192());
         class_1331 var9 = new class_1331(
            var8.method_12173(), var0.method_42198().method_22563(class_3801.field_18592, var8).method_12165(), var8.method_12185() + 3
         );
         class_2765.method_12588(var1.toLowerCase(), var9, new class_1331(var2, var3, var4), class_6631.field_34340, var7);

         for (int var10 = 0; var10 < var2; var10++) {
            for (int var11 = 0; var11 < var4; var11++) {
               class_1331 var12 = new class_1331(var9.method_12173() + var10, var9.method_12165() + 1, var9.method_12185() + var11);
               class_6414 var13 = class_4783.field_23582;
               class_6986 var14 = new class_6986(var13.method_29260(), Collections.EMPTY_SET, (class_5734)null);
               var14.method_31964(var7, var12, 2);
            }
         }

         class_2765.method_12587(var9, new class_1331(1, 0, -1), class_6631.field_34340, var7);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int method_31071(class_9155 var0, String var1) throws CommandSyntaxException {
      class_9529 var4 = (class_9529)var0.method_42179().method_37201(10.0, 1.0F, false);
      class_1331 var5 = var4.method_43955();
      class_6331 var6 = var0.method_42198();
      Optional var7 = class_2765.method_12592(var5, 15, var6);
      if (!var7.isPresent()) {
         var7 = class_2765.method_12592(var5, 200, var6);
      }

      if (var7.isPresent()) {
         class_945 var8 = (class_945)var6.method_28260((class_1331)var7.get());
         class_1331 var9 = var5.method_6093((class_2700)var7.get());
         String var10 = var9.method_12173() + ", " + var9.method_12165() + ", " + var9.method_12185();
         String var11 = var8.method_4102();
         IFormattableTextComponent var12 = new StringTextComponent(var10)
            .setStyle(
               Style.EMPTY
                  .setBold(true)
                  .setFormatting(TextFormatting.GREEN)
                  .setHoverEvent(new HoverEvent(HoverEvent$class_48.SHOW_TEXT, new StringTextComponent("Click to copy to clipboard")))
                  .setClickEvent(new ClickEvent(ClickEvent$class_47.COPY_TO_CLIPBOARD, "final BlockPos " + var1 + " = new BlockPos(" + var10 + ");"))
            );
         var0.method_42196(new StringTextComponent("Position relative to " + var11 + ": ").append(var12), false);
         class_1892.method_8436(var6, new class_1331(var5), var10, -2147418368, 10000);
         return 1;
      } else {
         var0.method_42175(new StringTextComponent("Can't find a structure block that contains the targeted pos " + var5));
         return 0;
      }
   }

   private static int method_31065(class_9155 var0) {
      class_1331 var3 = new class_1331(var0.method_42192());
      class_6331 var4 = var0.method_42198();
      class_1331 var5 = class_2765.method_12597(var3, 15, var4);
      if (var5 != null) {
         class_1954.method_9039(var4);
         method_31073(var4, var5, (class_8604)null);
         return 1;
      } else {
         method_31058(var4, "Couldn't find any structure block within 15 radius", TextFormatting.RED);
         return 0;
      }
   }

   private static int method_31077(class_9155 var0) {
      class_1331 var3 = new class_1331(var0.method_42192());
      class_6331 var4 = var0.method_42198();
      Collection var5 = class_2765.method_12585(var3, 200, var4);
      if (!var5.isEmpty()) {
         class_1954.method_9039(var4);
         method_31069(var0, "Running " + var5.size() + " tests...");
         class_8604 var6 = new class_8604();
         var5.forEach(var2 -> method_31073(var4, var2, var6));
         return 1;
      } else {
         method_31058(var4, "Couldn't find any structure blocks within 200 block radius", TextFormatting.RED);
         return 1;
      }
   }

   private static void method_31073(class_6331 var0, class_1331 var1, class_8604 var2) {
      class_945 var5 = (class_945)var0.method_28260(var1);
      String var6 = var5.method_4102();
      class_226 var7 = class_3084.method_14142(var6);
      class_4085 var8 = new class_4085(var7, var5.method_4120(), var0);
      if (var2 != null) {
         var2.method_39548(var8);
         var8.method_18848(new class_7673(var0, var2));
      }

      method_31067(var7, var0);
      class_4092 var9 = class_2765.method_12596(var5);
      class_1331 var10 = new class_1331(var9.field_19941, var9.field_19937, var9.field_19938);
      class_1954.method_9032(var8, var10, class_2983.field_14682);
   }

   private static void method_31059(class_6331 var0, class_8604 var1) {
      if (var1.method_39541()) {
         method_31058(var0, "GameTest done! " + var1.method_39551() + " tests were run", TextFormatting.WHITE);
         if (!var1.method_39547()) {
            method_31058(var0, "All required tests passed :)", TextFormatting.GREEN);
         } else {
            method_31058(var0, "" + var1.method_39545() + " required tests failed :(", TextFormatting.RED);
         }

         if (var1.method_39552()) {
            method_31058(var0, "" + var1.method_39549() + " optional tests failed", TextFormatting.GRAY);
         }
      }
   }

   private static int method_31074(class_9155 var0, int var1) {
      class_6331 var4 = var0.method_42198();
      class_1954.method_9039(var4);
      class_1331 var5 = new class_1331(
         var0.method_42192().field_7336,
         (double)var0.method_42198().method_22563(class_3801.field_18592, new class_1331(var0.method_42192())).method_12165(),
         var0.method_42192().field_7334
      );
      class_1954.method_9038(var4, var5, class_2983.field_14682, class_9299.method_42829(var1, 0, 1024));
      return 1;
   }

   private static int method_31070(class_9155 var0, class_226 var1, int var2) {
      class_6331 var5 = var0.method_42198();
      class_1331 var6 = new class_1331(var0.method_42192());
      int var7 = var0.method_42198().method_22563(class_3801.field_18592, var6).method_12165();
      class_1331 var8 = new class_1331(var6.method_12173(), var7, var6.method_12185() + 3);
      class_1954.method_9039(var5);
      method_31067(var1, var5);
      class_6631 var9 = class_2765.method_12594(var2);
      class_4085 var10 = new class_4085(var1, var9, var5);
      class_1954.method_9032(var10, var8, class_2983.field_14682);
      return 1;
   }

   private static void method_31067(class_226 var0, class_6331 var1) {
      Consumer var4 = class_3084.method_14147(var0.method_963());
      if (var4 != null) {
         var4.accept(var1);
      }
   }

   private static int method_31063(class_9155 var0, int var1, int var2) {
      class_1954.method_9039(var0.method_42198());
      Collection var5 = class_3084.method_14152();
      method_31069(var0, "Running all " + var5.size() + " tests...");
      class_3084.method_14145();
      method_31064(var0, var5, var1, var2);
      return 1;
   }

   private static int method_31075(class_9155 var0, String var1, int var2, int var3) {
      Collection var6 = class_3084.method_14143(var1);
      class_1954.method_9039(var0.method_42198());
      method_31069(var0, "Running " + var6.size() + " tests from " + var1 + "...");
      class_3084.method_14145();
      method_31064(var0, var6, var2, var3);
      return 1;
   }

   private static int method_31061(class_9155 var0, boolean var1, int var2, int var3) {
      Collection var6;
      if (!var1) {
         var6 = class_3084.method_14149();
      } else {
         var6 = class_3084.method_14149().stream().filter(class_226::method_960).collect(Collectors.toList());
      }

      if (!var6.isEmpty()) {
         class_1954.method_9039(var0.method_42198());
         method_31069(var0, "Rerunning " + var6.size() + " failed tests (" + (!var1 ? "including optional tests" : "only required tests") + ")");
         method_31064(var0, var6, var2, var3);
         return 1;
      } else {
         method_31069(var0, "No failed tests to rerun");
         return 0;
      }
   }

   private static void method_31064(class_9155 var0, Collection<class_226> var1, int var2, int var3) {
      class_1331 var6 = new class_1331(var0.method_42192());
      class_1331 var7 = new class_1331(
         var6.method_12173(), var0.method_42198().method_22563(class_3801.field_18592, var6).method_12165(), var6.method_12185() + 3
      );
      class_6331 var8 = var0.method_42198();
      class_6631 var9 = class_2765.method_12594(var2);
      Collection var10 = class_1954.method_9045(var1, var7, var9, var8, class_2983.field_14682, var3);
      class_8604 var11 = new class_8604(var10);
      var11.method_39546(new class_7673(var8, var11));
      var11.method_39550(var0x -> class_3084.method_14150(var0x.method_18845()));
   }

   private static void method_31069(class_9155 var0, String var1) {
      var0.method_42196(new StringTextComponent(var1), false);
   }

   private static int method_31072(class_9155 var0) {
      class_1331 var3 = new class_1331(var0.method_42192());
      class_6331 var4 = var0.method_42198();
      class_1331 var5 = class_2765.method_12597(var3, 15, var4);
      if (var5 != null) {
         class_945 var6 = (class_945)var4.method_28260(var5);
         String var7 = var6.method_4102();
         return method_31076(var0, var7);
      } else {
         method_31058(var4, "Couldn't find any structure block within 15 radius", TextFormatting.RED);
         return 0;
      }
   }

   private static int method_31076(class_9155 var0, String var1) {
      Path var4 = Paths.get(class_2765.field_13510);
      class_4639 var5 = new class_4639("minecraft", var1);
      Path var6 = var0.method_42198().method_28978().method_26274(var5, ".nbt");
      Path var7 = class_3916.method_18125(var6, var1, var4);
      if (var7 == null) {
         method_31069(var0, "Failed to export " + var6);
         return 1;
      } else {
         try {
            Files.createDirectories(var7.getParent());
         } catch (IOException var9) {
            method_31069(var0, "Could not create folder " + var7.getParent());
            var9.printStackTrace();
            return 1;
         }

         method_31069(var0, "Exported " + var1 + " to " + var7.toAbsolutePath());
         return 0;
      }
   }

   private static int method_31057(class_9155 var0, String var1) {
      Path var4 = Paths.get(class_2765.field_13510, var1 + ".snbt");
      class_4639 var5 = new class_4639("minecraft", var1);
      Path var6 = var0.method_42198().method_28978().method_26274(var5, ".nbt");

      try {
         BufferedReader var7 = Files.newBufferedReader(var4);
         String var8 = IOUtils.toString(var7);
         Files.createDirectories(var6.getParent());

         try (OutputStream var9 = Files.newOutputStream(var6)) {
            class_5957.method_27217(class_2392.method_10916(var8), var9);
         }

         method_31069(var0, "Imported to " + var6.toAbsolutePath());
         return 0;
      } catch (IOException | CommandSyntaxException var22) {
         System.err.println("Failed to load structure " + var1);
         var22.printStackTrace();
         return 1;
      }
   }

   private static void method_31058(class_6331 var0, String var1, TextFormatting var2) {
      var0.method_28990(var0x -> true).forEach(var2x -> var2x.method_26286(new StringTextComponent(var2 + var1), Util.NIL_UUID));
   }
}
