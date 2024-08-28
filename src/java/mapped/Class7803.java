package mapped;

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

public class Class7803 {
   public static String field33501 = "gameteststructures";

   public static Class80 method26051(int var0) {
      switch (var0) {
         case 0:
            return Class80.field185;
         case 1:
            return Class80.field186;
         case 2:
            return Class80.field187;
         case 3:
            return Class80.field188;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + var0);
      }
   }

   public static Class6488 method26052(Class964 var0) {
      BlockPos var3 = var0.method3774();
      BlockPos var4 = var3.method8337(var0.method3942().method8336(-1, -1, -1));
      BlockPos var5 = Class8969.method32905(var4, Class2089.field13614, var0.method3946(), var3);
      return new Class6488(var3, var5);
   }

   public static Class9764 method26053(Class964 var0) {
      BlockPos var3 = var0.method3774();
      BlockPos var4 = var3.method8337(var0.method3942().method8336(-1, -1, -1));
      BlockPos var5 = Class8969.method32905(var4, Class2089.field13614, var0.method3946(), var3);
      return new Class9764(var3, var5);
   }

   public static void method26054(BlockPos var0, BlockPos var1, Class80 var2, Class1657 var3) {
      BlockPos var6 = Class8969.method32905(var0.method8337(var1), Class2089.field13614, var2, var0);
      var3.method6730(var6, Blocks.COMMAND_BLOCK.method11579());
      Class969 var7 = (Class969)var3.method6759(var6);
      var7.method4009().method3562("test runthis");
      BlockPos var8 = Class8969.method32905(var6.method8336(0, 0, -1), Class2089.field13614, var2, var6);
      var3.method6730(var8, Blocks.STONE_BUTTON.method11579().method23395(var2));
   }

   public static void method26055(String var0, BlockPos var1, BlockPos var2, Class80 var3, Class1657 var4) {
      Class9764 var7 = method26059(var1, var2, var3);
      method26058(var7, var1.getY(), var4);
      var4.method6730(var1, Blocks.field37113.method11579());
      Class964 var8 = (Class964)var4.method6759(var1);
      var8.method3954(false);
      var8.method3938(new ResourceLocation(var0));
      var8.method3943(var2);
      var8.method3951(Class104.field318);
      var8.method3976(true);
   }

   public static Class964 method26056(String var0, BlockPos var1, Class80 var2, int var3, Class1657 var4, boolean var5) {
      BlockPos var8 = method26063(var0, var4).method32886();
      Class9764 var9 = method26059(var1, var8, var2);
      BlockPos var10;
      if (var2 != Class80.field185) {
         if (var2 != Class80.field186) {
            if (var2 != Class80.field187) {
               if (var2 != Class80.field188) {
                  throw new IllegalArgumentException("Invalid rotation: " + var2);
               }

               var10 = var1.method8336(0, 0, var8.method8304() - 1);
            } else {
               var10 = var1.method8336(var8.method8304() - 1, 0, var8.method8306() - 1);
            }
         } else {
            var10 = var1.method8336(var8.method8306() - 1, 0, 0);
         }
      } else {
         var10 = var1;
      }

      method26057(var1, var4);
      method26058(var9, var1.getY(), var4);
      Class964 var11 = method26064(var0, var10, var2, var4, var5);
      var4.method6860().method20730(var9, true, false);
      var4.method6963(var9);
      return var11;
   }

   private static void method26057(BlockPos var0, Class1657 var1) {
      Class7481 var4 = new Class7481(var0);

      for (int var5 = -1; var5 < 4; var5++) {
         for (int var6 = -1; var6 < 4; var6++) {
            int var7 = var4.field32174 + var5;
            int var8 = var4.field32175 + var6;
            var1.method6950(var7, var8, true);
         }
      }
   }

   public static void method26058(Class9764 var0, int var1, Class1657 var2) {
      Class9764 var5 = new Class9764(
         var0.field45678 - 2, var0.field45679 - 3, var0.field45680 - 3, var0.field45681 + 3, var0.field45682 + 20, var0.field45683 + 3
      );
      BlockPos.method8361(var5).forEach(var2x -> method26066(var1, var2x, var2));
      var2.method6860().method20730(var5, true, false);
      var2.method6963(var5);
      Class6488 var6 = new Class6488(
         (double)var5.field45678, (double)var5.field45679, (double)var5.field45680, (double)var5.field45681, (double)var5.field45682, (double)var5.field45683
      );
      List<Entity> var7 = var2.<Entity>method6772(Entity.class, var6, var0x -> !(var0x instanceof PlayerEntity));
      var7.forEach(Entity::method2904);
   }

   public static Class9764 method26059(BlockPos var0, BlockPos var1, Class80 var2) {
      BlockPos var5 = var0.method8337(var1).method8336(-1, -1, -1);
      BlockPos var6 = Class8969.method32905(var5, Class2089.field13614, var2, var0);
      Class9764 var7 = Class9764.method38389(var0.method8304(), var0.getY(), var0.method8306(), var6.method8304(), var6.getY(), var6.method8306());
      int var8 = Math.min(var7.field45678, var7.field45681);
      int var9 = Math.min(var7.field45680, var7.field45683);
      BlockPos var10 = new BlockPos(var0.method8304() - var8, 0, var0.method8306() - var9);
      var7.method38395(var10);
      return var7;
   }

   public static Optional<BlockPos> method26060(BlockPos var0, int var1, Class1657 var2) {
      return method26062(var0, var1, var2).stream().filter(var2x -> method26067(var2x, var0, var2)).findFirst();
   }

   @Nullable
   public static BlockPos method26061(BlockPos var0, int var1, Class1657 var2) {
      Comparator var5 = Comparator.<BlockPos>comparingInt(var1x -> var1x.method8321(var0));
      Collection var6 = method26062(var0, var1, var2);
      Optional var7 = var6.stream().min(var5);
      return (BlockPos)var7.orElse((BlockPos)null);
   }

   public static Collection<BlockPos> method26062(BlockPos var0, int var1, Class1657 var2) {
      ArrayList var5 = Lists.newArrayList();
      Class6488 var6 = new Class6488(var0);
      var6 = var6.method19664((double)var1);

      for (int var7 = (int)var6.field28449; var7 <= (int)var6.field28452; var7++) {
         for (int var8 = (int)var6.field28450; var8 <= (int)var6.field28453; var8++) {
            for (int var9 = (int)var6.field28451; var9 <= (int)var6.field28454; var9++) {
               BlockPos var10 = new BlockPos(var7, var8, var9);
               Class7380 var11 = var2.method6738(var10);
               if (var11.method23448(Blocks.field37113)) {
                  var5.add(var10);
               }
            }
         }
      }

      return var5;
   }

   private static Class8969 method26063(String var0, Class1657 var1) {
      Class8761 var4 = var1.method6938();
      Class8969 var5 = var4.method31604(new ResourceLocation(var0));
      if (var5 == null) {
         String var6 = var0 + ".snbt";
         Path var7 = Paths.get(field33501, var6);
         Class39 var8 = method26065(var7);
         if (var8 != null) {
            return var4.method31609(var8);
         } else {
            throw new RuntimeException("Could not find structure file " + var7 + ", and the structure is not available in the world structures either.");
         }
      } else {
         return var5;
      }
   }

   private static Class964 method26064(String var0, BlockPos var1, Class80 var2, Class1657 var3, boolean var4) {
      var3.method6730(var1, Blocks.field37113.method11579());
      Class964 var7 = (Class964)var3.method6759(var1);
      var7.method3951(Class104.field319);
      var7.method3947(var2);
      var7.method3954(false);
      var7.method3938(new ResourceLocation(var0));
      var7.method3967(var3, var4);
      if (var7.method3942() == BlockPos.field13032) {
         Class8969 var8 = method26063(var0, var3);
         var7.method3968(var3, var4, var8);
         if (var7.method3942() != BlockPos.field13032) {
            return var7;
         } else {
            throw new RuntimeException("Failed to load structure " + var0);
         }
      } else {
         return var7;
      }
   }

   @Nullable
   private static Class39 method26065(Path var0) {
      try {
         BufferedReader var3 = Files.newBufferedReader(var0);
         String var4 = IOUtils.toString(var3);
         return Class7671.method25188(var4);
      } catch (IOException var5) {
         return null;
      } catch (CommandSyntaxException var6) {
         throw new RuntimeException("Error while trying to load structure " + var0, var6);
      }
   }

   private static void method26066(int var0, BlockPos var1, Class1657 var2) {
      Class7380 var5 = null;
      Class9733 var6 = Class9733.method38132(var2.method6867().<Class8907>method32453(Class2348.field16106));
      if (!(var6 instanceof Class9733)) {
         if (var1.getY() != var0 - 1) {
            if (var1.getY() < var0 - 1) {
               var5 = var2.method7003(var1).method32507().method24283().method28935();
            }
         } else {
            var5 = var2.method7003(var1).method32507().method24283().method28934();
         }
      } else {
         Class7380[] var7 = var6.method38130();
         if (var1.getY() < var0 && var1.getY() <= var7.length) {
            var5 = var7[var1.getY() - 1];
         }
      }

      if (var5 == null) {
         var5 = Blocks.AIR.method11579();
      }

      Class164 var8 = new Class164(var5, Collections.<Class8550<?>>emptySet(), (Class39)null);
      var8.method496(var2, var1, 2);
      var2.method6964(var1, var5.method23383());
   }

   private static boolean method26067(BlockPos var0, BlockPos var1, Class1657 var2) {
      Class964 var5 = (Class964)var2.method6759(var0);
      Class6488 var6 = method26052(var5).method19664(1.0);
      return var6.method19673(Vector3d.method11328(var1));
   }
}
