package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class class_2792 {
   private static String[] field_13715;
   private final Random field_13723;
   private final float field_13722;
   private final class_6331 field_13721;
   private final Function<Identifier, class_1758> field_13716;
   private final Set<class_1758> field_13714 = Sets.newLinkedHashSet();
   private final Function<Identifier, class_7279> field_13720;
   private final Set<class_7279> field_13718 = Sets.newLinkedHashSet();
   private final Map<class_9791<?>, Object> field_13717;
   private final Map<Identifier, class_7006> field_13719;

   private class_2792(
      Random var1,
      float var2,
      class_6331 var3,
      Function<Identifier, class_1758> var4,
      Function<Identifier, class_7279> var5,
      Map<class_9791<?>, Object> var6,
      Map<Identifier, class_7006> var7
   ) {
      this.field_13723 = var1;
      this.field_13722 = var2;
      this.field_13721 = var3;
      this.field_13716 = var4;
      this.field_13720 = var5;
      this.field_13717 = ImmutableMap.copyOf(var6);
      this.field_13719 = ImmutableMap.copyOf(var7);
   }

   public boolean method_12689(class_9791<?> var1) {
      return this.field_13717.containsKey(var1);
   }

   public void method_12697(Identifier var1, Consumer<ItemStack> var2) {
      class_7006 var5 = this.field_13719.get(var1);
      if (var5 != null) {
         var5.method_32019(this, var2);
      }
   }

   @Nullable
   public <T> T method_12698(class_9791<T> var1) {
      return (T)this.field_13717.get(var1);
   }

   public boolean method_12688(class_1758 var1) {
      return this.field_13714.add(var1);
   }

   public void method_12695(class_1758 var1) {
      this.field_13714.remove(var1);
   }

   public boolean method_12696(class_7279 var1) {
      return this.field_13718.add(var1);
   }

   public void method_12690(class_7279 var1) {
      this.field_13718.remove(var1);
   }

   public class_1758 method_12686(Identifier var1) {
      return this.field_13716.apply(var1);
   }

   public class_7279 method_12692(Identifier var1) {
      return this.field_13720.apply(var1);
   }

   public Random method_12693() {
      return this.field_13723;
   }

   public float method_12691() {
      return this.field_13722;
   }

   public class_6331 method_12694() {
      return this.field_13721;
   }
}
