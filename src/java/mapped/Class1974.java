package mapped;

public enum Class1974 {
   field12848(0, 1, 2, 3),
   field12849(2, 3, 0, 1),
   field12850(3, 0, 1, 2),
   field12851(0, 1, 2, 3),
   field12852(3, 0, 1, 2),
   field12853(1, 2, 3, 0);

   private final int field12854;
   private final int field12855;
   private final int field12856;
   private final int field12857;
   private static final Class1974[] field12858 = Util.<Class1974[]>method38508(new Class1974[6], var0 -> {
      var0[Direction.field672.method533()] = field12848;
      var0[Direction.field673.method533()] = field12849;
      var0[Direction.NORTH.method533()] = field12850;
      var0[Direction.SOUTH.method533()] = field12851;
      var0[Direction.WEST.method533()] = field12852;
      var0[Direction.EAST.method533()] = field12853;
   });
   private static final Class1974[] field12859 = new Class1974[]{field12848, field12849, field12850, field12851, field12852, field12853};

   private Class1974(int var3, int var4, int var5, int var6) {
      this.field12854 = var3;
      this.field12855 = var4;
      this.field12856 = var5;
      this.field12857 = var6;
   }

   public static Class1974 method8256(Direction var0) {
      return field12858[var0.method533()];
   }

   // $VF: synthetic method
   public static int method8258(Class1974 var0) {
      return var0.field12854;
   }

   // $VF: synthetic method
   public static int method8259(Class1974 var0) {
      return var0.field12855;
   }

   // $VF: synthetic method
   public static int method8260(Class1974 var0) {
      return var0.field12856;
   }

   // $VF: synthetic method
   public static int method8261(Class1974 var0) {
      return var0.field12857;
   }
}
