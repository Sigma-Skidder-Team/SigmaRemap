package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class class_2338 implements class_7279 {
   private static String[] field_11671;
   private final class_865 field_11672;
   private final class_5848 field_11670;

   private class_2338(class_865 var1, class_5848 var2) {
      this.field_11672 = var1;
      this.field_11670 = var2;
   }

   @Override
   public class_2190 method_33269() {
      return class_5110.field_26359;
   }

   @Override
   public Set<class_9791<?>> method_12681() {
      return ImmutableSet.of(class_8712.field_44671, this.field_11670.method_26666());
   }

   public boolean test(class_2792 var1) {
      Entity var4 = var1.<Entity>method_12698(this.field_11670.method_26666());
      class_1343 var5 = var1.<class_1343>method_12698(class_8712.field_44671);
      return this.field_11672.method_3736(var1.method_12694(), var5, var4);
   }

   public static class_5704 method_10700(class_5848 var0) {
      return method_10701(var0, class_2184.method_10127());
   }

   public static class_5704 method_10701(class_5848 var0, class_2184 var1) {
      return () -> new class_2338(var1.method_10139(), var0);
   }

   public static class_5704 method_10704(class_5848 var0, class_865 var1) {
      return () -> new class_2338(var1, var0);
   }
}
