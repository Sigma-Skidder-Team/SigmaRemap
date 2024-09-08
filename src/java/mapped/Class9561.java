package mapped;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class9561 {
   public static Object field44532 = Class9299.method35071(Class9299.field42815);
   public static Object field44533 = Class9299.method35071(Class9299.field42814);
   public static Object field44534 = Class9299.method35071(Class9299.field42816);
   public static final boolean field44535 = Class9299.field42829.method20214();
   public static final boolean field44536 = Class9299.field42835.method20214();

   public static void method37042(String var0, Object var1) {
      Map var4 = (Map)Class9299.method35071(Class9299.field42959);
      if (var4 != null) {
         var4.put(var0, var1);
      }
   }

   public static InputStream method37043(String var0) {
      if (Class9299.field43133.method20245()) {
         var0 = Class9402.method35762(var0, "/");
         return (InputStream)Class9299.method35062(Class9299.field43134, var0);
      } else {
         return null;
      }
   }

   public static Class6636 method37044() {
      String var2 = "optifine.OptiFineResourceLocator";
      Object var3 = System.getProperties().get(var2 + ".class");
      if (!(var3 instanceof Class)) {
         return new Class6636(var2);
      } else {
         Class var4 = (Class)var3;
         return new Class6636(var4);
      }
   }

   public static boolean method37045(BlockState var0) {
      return !field44535 ? var0.getBlock().isTileEntityProvider() : Class9299.method35064(var0, Class9299.field42829);
   }

   public static boolean method37046(ItemStack var0) {
      return Class9299.field42919.method20214() ? Class9299.method35064(var0.getItem(), Class9299.field42919, var0) : var0.method32116();
   }

   public static int method37047(BlockState var0, Class1663 var1, BlockPos var2) {
      return !Class9299.field42826.method20214() ? var0.getLightValue() : Class9299.method35065(var0, Class9299.field42826, var1, var2);
   }

   public static Class7529 method37048(ItemStack var0, World var1) {
      if (!Class9299.field42864.method20245()) {
         return Class3316.method11861(var0, var1);
      } else {
         Class3316 var4 = (Class3316)var0.getItem();
         return Class3316.method11861(var0, var1);
      }
   }

   public static String[] method37049() {
      if (Class9299.field42964.method20245()) {
         Object var2 = Class9299.method35062(Class9299.field42966);
         List var3 = (List)Class9299.method35070(var2, Class9299.field42965);
         if (var3 != null) {
            ArrayList<String> var4 = new ArrayList();

            for (Object var6 : var3) {
               if (Class9299.field42971.method20247(var6)) {
                  String var7 = Class9299.method35069(var6, Class9299.field42972);
                  if (var7 != null) {
                     var4.add(var7);
                  }
               }
            }

            return var4.toArray(new String[var4.size()]);
         } else {
            return new String[0];
         }
      } else {
         return new String[0];
      }
   }

   public static boolean method37050(BlockState var0, IBlockReader var1, BlockPos var2) {
      return !Class9299.field42830.method20214() ? var0.isAir() : Class9299.method35064(var0, Class9299.field42830, var1, var2);
   }

   public static boolean method37051(ItemStack var0, ItemStack var1, PlayerEntity var2, Class1006 var3) {
      return !Class9299.field42921.method20214()
         ? var0.getItem() instanceof Class3265
         : Class9299.method35064(var0, Class9299.field42921, var1, var2, var3);
   }

   public static boolean method37052(ItemStack var0, PlayerEntity var1) {
      return !Class9299.field42925.method20214() ? var0.getItem() == Items.field38119 : Class9299.method35064(var0, Class9299.field42925, var1);
   }

   public static Button method37053(MainMenuScreen var0, int var1, int var2) {
      return Class9299.field42976.method20241()
         ? new Button(var0.width / 2 - 100, var1 + var2 * 2, 98, 20, new TranslationTextComponent("fml.menu.mods"), var1x -> {
            Screen var4 = (Screen)Class9299.field42976.method20243(var0);
            Minecraft.getInstance().displayGuiScreen(var4);
         })
         : null;
   }

   public static void method37054(boolean var0) {
      if (Class9299.field42900.method20238()) {
         method37056(Class9299.field42900, var0);
      }
   }

   public static boolean method37055(Class6633 var0, boolean var1) {
      if (var0.method20238()) {
         Object var4 = Class9299.field42898.method20234();
         if (var4 != null) {
            Object var5 = Class9299.method35072(var4, var0);
            return var5 != null ? Class9299.method35064(var5, Class9299.field42906) : var1;
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   private static void method37056(Class6633 var0, boolean var1) {
      if (var0.method20238()) {
         Object var4 = Class9299.field42898.method20234();
         if (var4 != null) {
            Object var5 = Class9299.method35072(var4, var0);
            if (var5 != null) {
               Class5139 var6 = new Class5139(var1);
               Class9299.method35082(var5, Class9299.field42904, var6);
               Object var7 = Class9299.method35072(var5, Class9299.field42905);
               if (var7 != null) {
                  Class9299.method35082(var7, Class9299.field42902, null);
               }

               Class9751.method38303("Set ForgeConfig.CLIENT." + var0.method20233().getName() + "=" + var1);
            }
         }
      }
   }

   public static boolean method37057(Entity var0) {
      return !field44536 ? true : Class9299.method35064(var0, Class9299.field42835);
   }

   public static boolean method37058(Item var0, ItemStack var1) {
      return !Class9299.field42915.method20214() ? var0.method11712() : Class9299.method35064(var0, Class9299.field42915, var1);
   }
}
