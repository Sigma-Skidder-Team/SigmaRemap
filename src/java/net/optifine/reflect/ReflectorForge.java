package net.optifine.reflect;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import mapped.*;
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
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class ReflectorForge {
   public static Object field44532 = Reflector.method35071(Reflector.field42815);
   public static Object field44533 = Reflector.method35071(Reflector.field42814);
   public static Object field44534 = Reflector.method35071(Reflector.field42816);
   public static final boolean field44535 = Reflector.field42829.exists();
   public static final boolean field44536 = Reflector.field42835.exists();

   public static void putLaunchBlackboard(String var0, Object var1) {
      Map var4 = (Map) Reflector.method35071(Reflector.field42959);
      if (var4 != null) {
         var4.put(var0, var1);
      }
   }

   public static InputStream getOptiFineResourceStream(String var0) {
      if (Reflector.field43133.method20245()) {
         var0 = Class9402.method35762(var0, "/");
         return (InputStream) Reflector.method35062(Reflector.field43134, var0);
      } else {
         return null;
      }
   }

   public static Class6636 getReflectorClassOptiFineResourceLocator() {
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
      return !field44535 ? var0.getBlock().isTileEntityProvider() : Reflector.method35064(var0, Reflector.field42829);
   }

   public static boolean method37046(ItemStack var0) {
      return Reflector.field42919.exists() ? Reflector.method35064(var0.getItem(), Reflector.field42919, var0) : var0.method32116();
   }

   public static int method37047(BlockState var0, IBlockDisplayReader var1, BlockPos var2) {
      return !Reflector.field42826.exists() ? var0.getLightValue() : Reflector.method35065(var0, Reflector.field42826, var1, var2);
   }

   public static Class7529 method37048(ItemStack var0, World var1) {
      if (!Reflector.field42864.method20245()) {
         return Class3316.method11861(var0, var1);
      } else {
         Class3316 var4 = (Class3316)var0.getItem();
         return Class3316.method11861(var0, var1);
      }
   }

   public static String[] method37049() {
      if (Reflector.field42964.method20245()) {
         Object var2 = Reflector.method35062(Reflector.field42966);
         List var3 = (List) Reflector.call(var2, Reflector.field42965);
         if (var3 != null) {
            ArrayList<String> var4 = new ArrayList();

            for (Object var6 : var3) {
               if (Reflector.field42971.method20247(var6)) {
                  String var7 = Reflector.method35069(var6, Reflector.field42972);
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
      return !Reflector.field42830.exists() ? var0.isAir() : Reflector.method35064(var0, Reflector.field42830, var1, var2);
   }

   public static boolean method37051(ItemStack var0, ItemStack var1, PlayerEntity var2, MobEntity var3) {
      return !Reflector.field42921.exists()
         ? var0.getItem() instanceof Class3265
         : Reflector.method35064(var0, Reflector.field42921, var1, var2, var3);
   }

   public static boolean method37052(ItemStack var0, PlayerEntity var1) {
      return !Reflector.field42925.exists() ? var0.getItem() == Items.field38119 : Reflector.method35064(var0, Reflector.field42925, var1);
   }

   public static Button addDemoButtons(VanillaMainMenuScreen var0, int var1, int var2) {
      return Reflector.field42976.exists()
         ? new Button(var0.width / 2 - 100, var1 + var2 * 2, 98, 20, new TranslationTextComponent("fml.menu.mods"), var1x -> {
            Screen var4 = (Screen) Reflector.field42976.method20243(var0);
            Minecraft.getInstance().displayGuiScreen(var4);
         })
         : null;
   }

   public static boolean getForgeUseCombinedDepthStencilAttachment()
   {
      return Reflector.ForgeConfig_Client_useCombinedDepthStencilAttachment.exists() ? getConfigClientBoolean(Reflector.ForgeConfig_Client_useCombinedDepthStencilAttachment, false) : false;
   }

   public static void setForgeUseThing(boolean var0) {
      if (Reflector.ForgeConfig_Client_useCombinedDepthStencilAttachment.exists()) {
         setConfigClientBoolean(Reflector.ForgeConfig_Client_useCombinedDepthStencilAttachment, var0);
      }
   }

   public static boolean getConfigClientBoolean(Class6633 var0, boolean var1) {
      if (var0.exists()) {
         Object var4 = Reflector.field42898.method20234();
         if (var4 != null) {
            Object var5 = Reflector.method35072(var4, var0);
            return var5 != null ? Reflector.method35064(var5, Reflector.field42906) : var1;
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   private static void setConfigClientBoolean(Class6633 var0, boolean var1) {
      if (var0.exists()) {
         Object var4 = Reflector.field42898.method20234();
         if (var4 != null) {
            Object var5 = Reflector.method35072(var4, var0);
            if (var5 != null) {
               Class5139 var6 = new Class5139(var1);
               Reflector.method35082(var5, Reflector.field42904, var6);
               Object var7 = Reflector.method35072(var5, Reflector.field42905);
               if (var7 != null) {
                  Reflector.method35082(var7, Reflector.field42902, null);
               }

               Class9751.method38303("Set ForgeConfig.CLIENT." + var0.method20233().getName() + "=" + var1);
            }
         }
      }
   }

   public static boolean canUpdate(Entity var0) {
      return !field44536 ? true : Reflector.method35064(var0, Reflector.field42835);
   }

   public static boolean isDamageable(Item var0, ItemStack var1) {
      return !Reflector.IForgeItem_isDamageable1.exists() ? var0.isDamageable() : Reflector.method35064(var0, Reflector.IForgeItem_isDamageable1, var1);
   }
}
