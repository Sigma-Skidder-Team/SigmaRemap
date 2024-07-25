package remapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class class_1634<U> {
   public final List<class_6746<U>> field_8499;
   private final Random field_8497 = new Random();

   public class_1634() {
      this(Lists.newArrayList());
   }

   private class_1634(List<class_6746<U>> var1) {
      this.field_8499 = Lists.newArrayList(var1);
   }

   public static <U> Codec<class_1634<U>> method_7287(Codec<U> var0) {
      return class_6746.method_30901(var0).listOf().xmap(class_1634::new, var0x -> var0x.field_8499);
   }

   public class_1634<U> method_7281(U var1, int var2) {
      this.field_8499.add(new class_6746<U>(var1, var2, null));
      return this;
   }

   public class_1634<U> method_7285() {
      return this.method_7280(this.field_8497);
   }

   public class_1634<U> method_7280(Random var1) {
      this.field_8499.forEach(var1x -> class_6746.method_30899(var1x, var1.nextFloat()));
      this.field_8499.sort(Comparator.comparingDouble(var0 -> class_6746.method_30900(var0)));
      return this;
   }

   public boolean method_7284() {
      return this.field_8499.isEmpty();
   }

   public Stream<U> method_7286() {
      return this.field_8499.stream().<U>map(class_6746::method_30897);
   }

   public U method_7282(Random var1) {
      return this.method_7280(var1).method_7286().findFirst().orElseThrow(RuntimeException::new);
   }

   @Override
   public String toString() {
      return "WeightedList[" + this.field_8499 + "]";
   }
}
