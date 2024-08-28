package mapped;

public enum Class1954 implements Class1949 {
   field12708(0, Class4750.field22518),
   field12709(1, Class4750.field22544),
   field12710(2, Class4750.field22532),
   field12711(3, Class4750.field22539),
   field12712(4, Class4750.field22538),
   field12713(5, Class4750.field22558),
   field12714(6, Class4750.field22568),
   field12715(7, Class4750.field22524),
   field12716(8, Class4750.field22553),
   field12717(9, Class4750.field22551),
   field12718(10, Class4750.field22559),
   field12719(11, Class4750.field22544),
   field12720(12, Class4750.field22557),
   field12721(13, Class4750.field22544),
   field12722(14, Class4750.field22555),
   field12723(15, Class8845.field39966),
   field12724(99, null);

   private final int field12725;
   private final Class4750 field12726;
   private static final Class1954[] field12727 = new Class1954[]{
      field12708,
      field12709,
      field12710,
      field12711,
      field12712,
      field12713,
      field12714,
      field12715,
      field12716,
      field12717,
      field12718,
      field12719,
      field12720,
      field12721,
      field12722,
      field12723,
      field12724
   };

   private Class1954(int var3, Class4750 var4) {
      this.field12725 = var3;
      this.field12726 = var4;
   }

   public static Class1954 method8213(int var0) {
      return values()[var0];
   }

   @Override
   public int method8207() {
      return this.field12725;
   }

   @Override
   public Class4750 method8208() {
      return this.field12726;
   }
}
