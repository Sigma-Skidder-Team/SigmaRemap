package mapped;

import java.util.Comparator;

public class Class8561<T> {
   private final String field38477;
   private final Comparator<T> field38478;
   private final long field38479;
   public static final Class8561<Class2341> field38480 = method30544("start", (var0, var1) -> 0);
   public static final Class8561<Class2341> field38481 = method30544("dragon", (var0, var1) -> 0);
   public static final Class8561<Class7481> field38482 = method30544("player", Comparator.<Class7481>comparingLong(Class7481::method24352));
   public static final Class8561<Class7481> field38483 = method30544("forced", Comparator.<Class7481>comparingLong(Class7481::method24352));
   public static final Class8561<Class7481> field38484 = method30544("light", Comparator.<Class7481>comparingLong(Class7481::method24352));
   public static final Class8561<BlockPos> field38485 = method30545("portal", Class1998::compareTo, 300);
   public static final Class8561<Integer> field38486 = method30545("post_teleport", Integer::compareTo, 5);
   public static final Class8561<Class7481> field38487 = method30545("unknown", Comparator.<Class7481>comparingLong(Class7481::method24352), 1);

   public static <T> Class8561<T> method30544(String var0, Comparator<T> var1) {
      return new Class8561<T>(var0, var1, 0L);
   }

   public static <T> Class8561<T> method30545(String var0, Comparator<T> var1, int var2) {
      return new Class8561<T>(var0, var1, (long)var2);
   }

   public Class8561(String var1, Comparator<T> var2, long var3) {
      this.field38477 = var1;
      this.field38478 = var2;
      this.field38479 = var3;
   }

   @Override
   public String toString() {
      return this.field38477;
   }

   public Comparator<T> method30546() {
      return this.field38478;
   }

   public long method30547() {
      return this.field38479;
   }
}
