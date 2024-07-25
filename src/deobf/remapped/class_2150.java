package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2150 {
   private static final Logger field_10755 = LogManager.getLogger();
   private static final Map<class_4165<?>, class_4668<?, ?>> field_10756 = Maps.newHashMap();

   public static <T extends class_4088> void method_10038(class_4165<T> var0, MinecraftClient var1, int var2, ITextComponent var3) {
      if (var0 != null) {
         class_4668 var6 = method_10035(var0);
         if (var6 != null) {
            var6.method_21601(var3, var0, var1, var2);
         } else {
            field_10755.warn("Failed to create screen for menu type: {}", class_8669.field_44402.method_39797(var0));
         }
      } else {
         field_10755.warn("Trying to open invalid screen with name: {}", var3.getString());
      }
   }

   @Nullable
   private static <T extends class_4088> class_4668<T, ?> method_10035(class_4165<T> var0) {
      return (class_4668<T, ?>)field_10756.get(var0);
   }

   private static <M extends class_4088, U extends Screen & class_4378<M>> void method_10034(class_4165<? extends M> var0, class_4668<M, U> var1) {
      class_4668 var4 = field_10756.put(var0, var1);
      if (var4 != null) {
         throw new IllegalStateException("Duplicate registration for " + class_8669.field_44402.method_39797(var0));
      }
   }

   public static boolean method_10037() {
      boolean var2 = false;

      for (class_4165 var4 : class_8669.field_44402) {
         if (!field_10756.containsKey(var4)) {
            field_10755.debug("Menu {} has no matching screen", class_8669.field_44402.method_39797(var4));
            var2 = true;
         }
      }

      return var2;
   }

   static {
      method_10034(class_4165.field_20257, class_2141::new);
      method_10034(class_4165.field_20251, class_2141::new);
      method_10034(class_4165.field_20259, class_2141::new);
      method_10034(class_4165.field_20261, class_2141::new);
      method_10034(class_4165.field_20252, class_2141::new);
      method_10034(class_4165.field_20256, class_2141::new);
      method_10034(class_4165.field_20244, class_1399::new);
      method_10034(class_4165.field_20266, class_2713::new);
      method_10034(class_4165.field_20247, class_340::new);
      method_10034(class_4165.field_20260, class_4412::new);
      method_10034(class_4165.field_20249, class_8547::new);
      method_10034(class_4165.field_20250, class_9831::new);
      method_10034(class_4165.field_20243, class_8226::new);
      method_10034(class_4165.field_20254, class_309::new);
      method_10034(class_4165.field_20241, class_3209::new);
      method_10034(class_4165.field_20265, class_395::new);
      method_10034(class_4165.field_20245, class_4718::new);
      method_10034(class_4165.field_20263, class_408::new);
      method_10034(class_4165.field_20262, class_57::new);
      method_10034(class_4165.field_20246, class_8097::new);
      method_10034(class_4165.field_20258, class_1969::new);
      method_10034(class_4165.field_20253, class_5046::new);
      method_10034(class_4165.field_20248, class_4061::new);
      method_10034(class_4165.field_20255, class_1599::new);
   }
}
