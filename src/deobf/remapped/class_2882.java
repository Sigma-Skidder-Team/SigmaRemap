package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Locale;
import java.util.Set;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2882 extends class_5837 {
   private static final Logger field_14110 = LogManager.getLogger();
   public static final class_5390<?> field_14112 = class_5390.field_27501;
   public static final class_8086 field_14116 = class_8086.field_41400;
   private final class_5390<?> field_14118;
   private final class_8086 field_14111;
   private final byte field_14115;
   private final int field_14114;
   private final boolean field_14117;

   private class_2882(class_7279[] var1, class_5390<?> var2, class_8086 var3, byte var4, int var5, boolean var6) {
      super(var1);
      this.field_14118 = var2;
      this.field_14111 = var3;
      this.field_14115 = var4;
      this.field_14114 = var5;
      this.field_14117 = var6;
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26398;
   }

   @Override
   public Set<class_9791<?>> method_12681() {
      return ImmutableSet.of(class_8712.field_44671);
   }

   @Override
   public class_6098 method_26627(class_6098 var1, class_2792 var2) {
      if (var1.method_27960() == class_4897.field_25113) {
         class_1343 var5 = var2.<class_1343>method_12698(class_8712.field_44671);
         if (var5 != null) {
            class_6331 var6 = var2.method_12694();
            class_1331 var7 = var6.method_29000(this.field_14118, new class_1331(var5), this.field_14114, this.field_14117);
            if (var7 != null) {
               class_6098 var8 = class_2143.method_10014(var6, var7.method_12173(), var7.method_12185(), this.field_14115, true, true);
               class_2143.method_10013(var6, var8);
               class_2134.method_9969(var8, var7, "+", this.field_14111);
               var8.method_28032(new TranslationTextComponent("filled_map." + this.field_14118.method_24556().toLowerCase(Locale.ROOT)));
               return var8;
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static class_8736 method_13219() {
      return new class_8736();
   }
}
