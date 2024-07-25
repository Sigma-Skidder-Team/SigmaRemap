package remapped;

import java.util.Comparator;

public class class_5032<T> {
   private final String field_26028;
   private final Comparator<T> field_26019;
   private final long field_26027;
   public static final class_5032<class_3256> field_26021 = method_23202("start", (var0, var1) -> 0);
   public static final class_5032<class_3256> field_26023 = method_23202("dragon", (var0, var1) -> 0);
   public static final class_5032<class_2034> field_26029 = method_23202("player", Comparator.<class_2034>comparingLong(class_2034::method_9539));
   public static final class_5032<class_2034> field_26025 = method_23202("forced", Comparator.<class_2034>comparingLong(class_2034::method_9539));
   public static final class_5032<class_2034> field_26026 = method_23202("light", Comparator.<class_2034>comparingLong(class_2034::method_9539));
   public static final class_5032<class_1331> field_26022 = method_23203("portal", class_2700::compareTo, 300);
   public static final class_5032<Integer> field_26020 = method_23203("post_teleport", Integer::compareTo, 5);
   public static final class_5032<class_2034> field_26024 = method_23203("unknown", Comparator.<class_2034>comparingLong(class_2034::method_9539), 1);

   public static <T> class_5032<T> method_23202(String var0, Comparator<T> var1) {
      return new class_5032<T>(var0, var1, 0L);
   }

   public static <T> class_5032<T> method_23203(String var0, Comparator<T> var1, int var2) {
      return new class_5032<T>(var0, var1, (long)var2);
   }

   public class_5032(String var1, Comparator<T> var2, long var3) {
      this.field_26028 = var1;
      this.field_26019 = var2;
      this.field_26027 = var3;
   }

   @Override
   public String toString() {
      return this.field_26028;
   }

   public Comparator<T> method_23201() {
      return this.field_26019;
   }

   public long method_23199() {
      return this.field_26027;
   }
}
