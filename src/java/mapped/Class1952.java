package mapped;

public enum Class1952 implements Class1949 {
   field12667(0, Class4750.field22518),
   field12668(1, Class4750.field22544),
   field12669(2, Class4750.field22532),
   field12670(3, Class4750.field22539),
   field12671(4, Class4750.field22538),
   field12672(5, Class4750.field22561),
   field12673(6, Class4750.field22524),
   field12674(7, Class4750.field22553),
   field12675(8, Class4750.field22551),
   field12676(9, Class4750.field22559),
   field12677(10, Class4750.field22544),
   field12678(11, Class4750.field22557),
   field12679(12, Class4750.field22544),
   field12680(13, Class4750.field22555),
   field12681(99, null);

   private final int field12682;
   private final Class4750 field12683;
   private static final Class1952[] field12684 = new Class1952[]{
      field12667,
      field12668,
      field12669,
      field12670,
      field12671,
      field12672,
      field12673,
      field12674,
      field12675,
      field12676,
      field12677,
      field12678,
      field12679,
      field12680,
      field12681
   };

   private Class1952(int var3, Class4750 var4) {
      this.field12682 = var3;
      this.field12683 = var4;
   }

   public static Class1952 method8211(int var0) {
      return values()[var0];
   }

   @Override
   public int method8207() {
      return this.field12682;
   }

   @Override
   public Class4750 method8208() {
      return this.field12683;
   }
}
