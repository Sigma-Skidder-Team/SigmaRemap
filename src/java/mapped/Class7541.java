package mapped;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7541 {
   private static final Logger field32353 = LogManager.getLogger();
   private static final Map<Class8298<?>, Class8457<?, ?>> field32354 = Maps.newHashMap();

   public static <T extends Class5812> void method24653(Class8298<T> var0, Minecraft var1, int var2, ITextComponent var3) {
      if (var0 != null) {
         Class8457 var6 = method24654(var0);
         if (var6 != null) {
            var6.method29747(var3, var0, var1, var2);
         } else {
            field32353.warn("Failed to create screen for menu type: {}", Registry.field16084.method9181(var0));
         }
      } else {
         field32353.warn("Trying to open invalid screen with name: {}", var3.getString());
      }
   }

   @Nullable
   private static <T extends Class5812> Class8457<T, ?> method24654(Class8298<T> var0) {
      return (Class8457<T, ?>)field32354.get(var0);
   }

   private static <M extends Class5812, U extends Screen & Class867<M>> void method24655(Class8298<? extends M> var0, Class8457<M, U> var1) {
      Class8457 var4 = field32354.put(var0, var1);
      if (var4 != null) {
         throw new IllegalStateException("Duplicate registration for " + Registry.field16084.method9181(var0));
      }
   }

   public static boolean method24656() {
      boolean var2 = false;

      for (Class8298 var4 : Registry.field16084) {
         if (!field32354.containsKey(var4)) {
            field32353.debug("Menu {} has no matching screen", Registry.field16084.method9181(var4));
            var2 = true;
         }
      }

      return var2;
   }

   static {
      method24655(Class8298.field35648, Class868::new);
      method24655(Class8298.field35649, Class868::new);
      method24655(Class8298.field35650, Class868::new);
      method24655(Class8298.field35651, Class868::new);
      method24655(Class8298.field35652, Class868::new);
      method24655(Class8298.field35653, Class868::new);
      method24655(Class8298.field35654, Class874::new);
      method24655(Class8298.field35655, Class1124::new);
      method24655(Class8298.field35656, Class872::new);
      method24655(Class8298.field35657, Class857::new);
      method24655(Class8298.field35658, Class863::new);
      method24655(Class8298.field35659, Class853::new);
      method24655(Class8298.field35660, Class871::new);
      method24655(Class8298.field35661, Class856::new);
      method24655(Class8298.field35662, Class1126::new);
      method24655(Class8298.field35663, Class866::new);
      method24655(Class8298.field35664, Class869::new);
      method24655(Class8298.field35665, Class865::new);
      method24655(Class8298.field35666, Class862::new);
      method24655(Class8298.field35667, Class873::new);
      method24655(Class8298.field35668, Class1123::new);
      method24655(Class8298.field35669, Class858::new);
      method24655(Class8298.field35670, Class852::new);
      method24655(Class8298.field35671, Class864::new);
   }
}
