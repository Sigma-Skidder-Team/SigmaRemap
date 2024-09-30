package net.minecraft.client.gui;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.inventory.*;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ScreenManager {
   private static final Logger LOG = LogManager.getLogger();
   private static final Map<ContainerType<?>, IScreenFactory<?, ?>> FACTORIES = Maps.newHashMap();

   public static <T extends Container> void openScreen(ContainerType<T> var0, Minecraft var1, int var2, ITextComponent var3) {
      if (var0 != null) {
         IScreenFactory< T, ? > iscreenfactory = getFactory(var0);
         if (iscreenfactory != null) {
            iscreenfactory.createScreen(var3, var0, var1, var2);
         } else {
            LOG.warn("Failed to create screen for menu type: {}", Registry.MENU.getKey(var0));
         }
      } else {
         LOG.warn("Trying to open invalid screen with name: {}", var3.getString());
      }
   }

   @Nullable
   private static <T extends Container> IScreenFactory<T, ?> getFactory(ContainerType<T> var0) {
      return (IScreenFactory<T, ?>) FACTORIES.get(var0);
   }

   private static <M extends Container, U extends Screen & IHasContainer<M>> void registerFactory(ContainerType<? extends M> var0, IScreenFactory<M, U> var1) {
      IScreenFactory iscreenfactory = FACTORIES.put(var0, var1);
      if (iscreenfactory != null) {
         throw new IllegalStateException("Duplicate registration for " + Registry.MENU.getKey(var0));
      }
   }

   public static boolean isMissingScreen() {
      boolean flag = false;

      for (ContainerType<?>    containertype : Registry.MENU) {
         if (!FACTORIES.containsKey(containertype)) {
            LOG.debug("Menu {} has no matching screen", Registry.MENU.getKey(containertype));
            flag = true;
         }
      }

      return flag;
   }

   static {
      registerFactory(ContainerType.GENERIC_9X1, ChestScreen::new);
      registerFactory(ContainerType.GENERIC_9X2, ChestScreen::new);
      registerFactory(ContainerType.GENERIC_9X3, ChestScreen::new);
      registerFactory(ContainerType.GENERIC_9X4, ChestScreen::new);
      registerFactory(ContainerType.GENERIC_9X5, ChestScreen::new);
      registerFactory(ContainerType.GENERIC_9X6, ChestScreen::new);
      registerFactory(ContainerType.GENERIC_3X3, DispenserScreen::new);
      registerFactory(ContainerType.ANVIL, AnvilScreen::new);
      registerFactory(ContainerType.BEACON, BeaconScreen::new);
      registerFactory(ContainerType.BLAST_FURNACE, BlastFurnaceScreen::new);
      registerFactory(ContainerType.BREWING_STAND, BrewingStandScreen::new);
      registerFactory(ContainerType.CRAFTING, CraftingScreen::new);
      registerFactory(ContainerType.ENCHANTMENT, EnchantmentScreen::new);
      registerFactory(ContainerType.FURNACE, FurnaceScreen::new);
      registerFactory(ContainerType.GRINDSTONE, GrindstoneScreen::new);
      registerFactory(ContainerType.HOPPER, HopperScreen::new);
      registerFactory(ContainerType.LECTERN, LecternScreen::new);
      registerFactory(ContainerType.LOOM, LoomScreen::new);
      registerFactory(ContainerType.MERCHANT, MerchantScreen::new);
      registerFactory(ContainerType.SHULKER_BOX, ShulkerBoxScreen::new);
      registerFactory(ContainerType.SMITHING, SmithingTableScreen::new);
      registerFactory(ContainerType.SMOKER, SmokerScreen::new);
      registerFactory(ContainerType.CARTOGRAPHY_TABLE, CartographyTableScreen::new);
      registerFactory(ContainerType.STONECUTTER, StonecutterScreen::new);
   }

   public static interface IScreenFactory<T extends Container, U extends Screen & IHasContainer<T>> {
      default void createScreen(ITextComponent var1, ContainerType<T> var2, Minecraft var3, int var4) {
         Screen var7 = this.method29748((T)var2.method29013(var4, var3.player.inventory), var3.player.inventory, var1);
         var3.player.openContainer = ((IHasContainer)var7).method2628();
         var3.displayGuiScreen(var7);
      }

      U method29748(T var1, PlayerInventory var2, ITextComponent var3);
   }
}
