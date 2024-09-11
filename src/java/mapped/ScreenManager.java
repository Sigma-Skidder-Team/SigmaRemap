package mapped;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.IHasContainer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.inventory.ChestScreen;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ScreenManager {
   private static final Logger field32353 = LogManager.getLogger();
   private static final Map<ContainerType<?>, Class8457<?, ?>> field32354 = Maps.newHashMap();

   public static <T extends Container> void method24653(ContainerType<T> var0, Minecraft var1, int var2, ITextComponent var3) {
      if (var0 != null) {
         Class8457 var6 = method24654(var0);
         if (var6 != null) {
            var6.method29747(var3, var0, var1, var2);
         } else {
            field32353.warn("Failed to create screen for menu type: {}", Registry.field16084.getKey(var0));
         }
      } else {
         field32353.warn("Trying to open invalid screen with name: {}", var3.getString());
      }
   }

   @Nullable
   private static <T extends Container> Class8457<T, ?> method24654(ContainerType<T> var0) {
      return (Class8457<T, ?>)field32354.get(var0);
   }

   private static <M extends Container, U extends Screen & IHasContainer<M>> void method24655(ContainerType<? extends M> var0, Class8457<M, U> var1) {
      Class8457 var4 = field32354.put(var0, var1);
      if (var4 != null) {
         throw new IllegalStateException("Duplicate registration for " + Registry.field16084.getKey(var0));
      }
   }

   public static boolean isMissingScreen() {
      boolean var2 = false;

      for (ContainerType var4 : Registry.field16084) {
         if (!field32354.containsKey(var4)) {
            field32353.debug("Menu {} has no matching screen", Registry.field16084.getKey(var4));
            var2 = true;
         }
      }

      return var2;
   }

   static {
      method24655(ContainerType.field35648, ChestScreen::new);
      method24655(ContainerType.field35649, ChestScreen::new);
      method24655(ContainerType.field35650, ChestScreen::new);
      method24655(ContainerType.field35651, ChestScreen::new);
      method24655(ContainerType.field35652, ChestScreen::new);
      method24655(ContainerType.field35653, ChestScreen::new);
      method24655(ContainerType.field35654, Class874::new);
      method24655(ContainerType.field35655, Class1124::new);
      method24655(ContainerType.field35656, Class872::new);
      method24655(ContainerType.field35657, Class857::new);
      method24655(ContainerType.field35658, Class863::new);
      method24655(ContainerType.field35659, Class853::new);
      method24655(ContainerType.field35660, Class871::new);
      method24655(ContainerType.field35661, Class856::new);
      method24655(ContainerType.field35662, Class1126::new);
      method24655(ContainerType.field35663, Class866::new);
      method24655(ContainerType.field35664, Class869::new);
      method24655(ContainerType.field35665, Class865::new);
      method24655(ContainerType.field35666, Class862::new);
      method24655(ContainerType.field35667, Class873::new);
      method24655(ContainerType.field35668, Class1123::new);
      method24655(ContainerType.field35669, Class858::new);
      method24655(ContainerType.field35670, Class852::new);
      method24655(ContainerType.field35671, Class864::new);
   }
}
