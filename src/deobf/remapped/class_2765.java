package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;

public class class_2765 {
   public static String field_13510 = "gameteststructures";

   public static class_6631 method_12594(int var0) {
      switch (var0) {
         case 0:
            return class_6631.field_34340;
         case 1:
            return class_6631.field_34334;
         case 2:
            return class_6631.field_34338;
         case 3:
            return class_6631.field_34335;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + var0);
      }
   }

   public static Box method_12596(class_945 var0) {
      BlockPos var3 = var0.method_17399();
      BlockPos var4 = var3.method_6105(var0.method_4096().method_6104(-1, -1, -1));
      BlockPos var5 = class_6561.method_29966(var4, class_9022.field_46145, var0.method_4120(), var3);
      return new Box(var3, var5);
   }

   public static class_9616 method_12591(class_945 var0) {
      BlockPos var3 = var0.method_17399();
      BlockPos var4 = var3.method_6105(var0.method_4096().method_6104(-1, -1, -1));
      BlockPos var5 = class_6561.method_29966(var4, class_9022.field_46145, var0.method_4120(), var3);
      return new class_9616(var3, var5);
   }

   public static void method_12587(BlockPos var0, BlockPos var1, class_6631 var2, class_6331 var3) {
      BlockPos var6 = class_6561.method_29966(var0.method_6105(var1), class_9022.field_46145, var2, var0);
      var3.method_29594(var6, class_4783.field_23730.method_29260());
      class_7454 var7 = (class_7454)var3.method_28260(var6);
      var7.method_33929().method_36930("test runthis");
      BlockPos var8 = class_6561.method_29966(var6.method_6104(0, 0, -1), class_9022.field_46145, var2, var6);
      var3.method_29594(var8, class_4783.field_23448.method_29260().method_8318(var2));
   }

   public static void method_12588(String var0, BlockPos var1, BlockPos var2, class_6631 var3, class_6331 var4) {
      class_9616 var7 = method_12589(var1, var2, var3);
      method_12583(var7, var1.method_12165(), var4);
      var4.method_29594(var1, class_4783.field_23846.method_29260());
      class_945 var8 = (class_945)var4.method_28260(var1);
      var8.method_4110(false);
      var8.method_4099(new Identifier(var0));
      var8.method_4107(var2);
      var8.method_4108(class_589.field_3417);
      var8.method_4123(true);
   }

   public static class_945 method_12584(String var0, BlockPos var1, class_6631 var2, int var3, class_6331 var4, boolean var5) {
      BlockPos var8 = method_12595(var0, var4).method_29975();
      class_9616 var9 = method_12589(var1, var8, var2);
      BlockPos var10;
      if (var2 != class_6631.field_34340) {
         if (var2 != class_6631.field_34334) {
            if (var2 != class_6631.field_34338) {
               if (var2 != class_6631.field_34335) {
                  throw new IllegalArgumentException("Invalid rotation: " + var2);
               }

               var10 = var1.method_6104(0, 0, var8.method_12173() - 1);
            } else {
               var10 = var1.method_6104(var8.method_12173() - 1, 0, var8.method_12185() - 1);
            }
         } else {
            var10 = var1.method_6104(var8.method_12185() - 1, 0, 0);
         }
      } else {
         var10 = var1;
      }

      method_12580(var1, var4);
      method_12583(var9, var1.method_12165(), var4);
      class_945 var11 = method_12586(var0, var10, var2, var4, var5);
      var4.method_28968().method_13096(var9, true, false);
      var4.method_28937(var9);
      return var11;
   }

   private static void method_12580(BlockPos var0, class_6331 var1) {
      class_2034 var4 = new class_2034(var0);

      for (int var5 = -1; var5 < 4; var5++) {
         for (int var6 = -1; var6 < 4; var6++) {
            int var7 = var4.field_10328 + var5;
            int var8 = var4.field_10327 + var6;
            var1.method_28961(var7, var8, true);
         }
      }
   }

   public static void method_12583(class_9616 var0, int var1, class_6331 var2) {
      class_9616 var5 = new class_9616(
         var0.field_48996 - 2, var0.field_48995 - 3, var0.field_48992 - 3, var0.field_48991 + 3, var0.field_48993 + 20, var0.field_48994 + 3
      );
      BlockPos.method_6086(var5).forEach(var2x -> method_12590(var1, var2x, var2));
      var2.method_28968().method_13096(var5, true, false);
      var2.method_28937(var5);
      Box var6 = new Box(
         (double)var5.field_48996,
         (double)var5.field_48995,
         (double)var5.field_48992,
         (double)var5.field_48991,
         (double)var5.field_48993,
         (double)var5.field_48994
      );
      List var7 = var2.<Entity>method_25869(Entity.class, var6, var0x -> !(var0x instanceof PlayerEntity));
      var7.forEach(Entity::method_37204);
   }

   public static class_9616 method_12589(BlockPos var0, BlockPos var1, class_6631 var2) {
      BlockPos var5 = var0.method_6105(var1).method_6104(-1, -1, -1);
      BlockPos var6 = class_6561.method_29966(var5, class_9022.field_46145, var2, var0);
      class_9616 var7 = class_9616.method_44400(
         var0.method_12173(), var0.method_12165(), var0.method_12185(), var6.method_12173(), var6.method_12165(), var6.method_12185()
      );
      int var8 = Math.min(var7.field_48996, var7.field_48991);
      int var9 = Math.min(var7.field_48992, var7.field_48994);
      BlockPos var10 = new BlockPos(var0.method_12173() - var8, 0, var0.method_12185() - var9);
      var7.method_44385(var10);
      return var7;
   }

   public static Optional<BlockPos> method_12592(BlockPos var0, int var1, class_6331 var2) {
      return method_12585(var0, var1, var2).stream().filter(var2x -> method_12593(var2x, var0, var2)).findFirst();
   }

   @Nullable
   public static BlockPos method_12597(BlockPos var0, int var1, class_6331 var2) {
      Comparator var5 = Comparator.<BlockPos>comparingInt(var1x -> var1x.method_12176(var0));
      Collection var6 = method_12585(var0, var1, var2);
      Optional var7 = var6.stream().min(var5);
      return (BlockPos)var7.orElse((BlockPos)null);
   }

   public static Collection<BlockPos> method_12585(BlockPos var0, int var1, class_6331 var2) {
      ArrayList var5 = Lists.newArrayList();
      Box var6 = new Box(var0);
      var6 = var6.method_18898((double)var1);

      for (int var7 = (int)var6.field_19941; var7 <= (int)var6.field_19940; var7++) {
         for (int var8 = (int)var6.field_19937; var8 <= (int)var6.field_19939; var8++) {
            for (int var9 = (int)var6.field_19938; var9 <= (int)var6.field_19942; var9++) {
               BlockPos var10 = new BlockPos(var7, var8, var9);
               class_2522 var11 = var2.method_28262(var10);
               if (var11.method_8350(class_4783.field_23846)) {
                  var5.add(var10);
               }
            }
         }
      }

      return var5;
   }

   private static class_6561 method_12595(String var0, class_6331 var1) {
      class_5799 var4 = var1.method_28978();
      class_6561 var5 = var4.method_26270(new Identifier(var0));
      if (var5 == null) {
         String var6 = var0 + ".snbt";
         Path var7 = Paths.get(field_13510, var6);
         CompoundNBT var8 = method_12581(var7);
         if (var8 != null) {
            return var4.method_26269(var8);
         } else {
            throw new RuntimeException("Could not find structure file " + var7 + ", and the structure is not available in the world structures either.");
         }
      } else {
         return var5;
      }
   }

   private static class_945 method_12586(String var0, BlockPos var1, class_6631 var2, class_6331 var3, boolean var4) {
      var3.method_29594(var1, class_4783.field_23846.method_29260());
      class_945 var7 = (class_945)var3.method_28260(var1);
      var7.method_4108(class_589.field_3414);
      var7.method_4092(var2);
      var7.method_4110(false);
      var7.method_4099(new Identifier(var0));
      var7.method_4088(var3, var4);
      if (var7.method_4096() == BlockPos.field_7306) {
         class_6561 var8 = method_12595(var0, var3);
         var7.method_4109(var3, var4, var8);
         if (var7.method_4096() != BlockPos.field_7306) {
            return var7;
         } else {
            throw new RuntimeException("Failed to load structure " + var0);
         }
      } else {
         return var7;
      }
   }

   @Nullable
   private static CompoundNBT method_12581(Path var0) {
      try {
         BufferedReader var3 = Files.newBufferedReader(var0);
         String var4 = IOUtils.toString(var3);
         return class_2392.method_10916(var4);
      } catch (IOException var5) {
         return null;
      } catch (CommandSyntaxException var6) {
         throw new RuntimeException("Error while trying to load structure " + var0, var6);
      }
   }

   private static void method_12590(int var0, BlockPos var1, class_6331 var2) {
      class_2522 var5 = null;
      class_9512 var6 = class_9512.method_43900(var2.method_2755().<class_6325>method_28813(class_8669.field_44359));
      if (!(var6 instanceof class_9512)) {
         if (var1.method_12165() != var0 - 1) {
            if (var1.method_12165() < var0 - 1) {
               var5 = var2.method_22561(var1).method_28875().method_9460().method_19216();
            }
         } else {
            var5 = var2.method_22561(var1).method_28875().method_9460().method_19215();
         }
      } else {
         class_2522[] var7 = var6.method_43902();
         if (var1.method_12165() < var0 && var1.method_12165() <= var7.length) {
            var5 = var7[var1.method_12165() - 1];
         }
      }

      if (var5 == null) {
         var5 = class_4783.field_23184.method_29260();
      }

      class_6986 var8 = new class_6986(var5, Collections.<class_5019<?>>emptySet(), (CompoundNBT)null);
      var8.method_31964(var2, var1, 2);
      var2.method_43369(var1, var5.method_8360());
   }

   private static boolean method_12593(BlockPos var0, BlockPos var1, class_6331 var2) {
      class_945 var5 = (class_945)var2.method_28260(var0);
      Box var6 = method_12596(var5).method_18898(1.0);
      return var6.method_18903(class_1343.method_6216(var1));
   }
}
