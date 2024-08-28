package mapped;

public enum Class1951 implements Class1949 {
   field12647(0, Class4750.field22518),
   field12648(1, Class4750.field22544),
   field12649(2, Class4750.field22532),
   field12650(3, Class4750.field22539),
   field12651(4, Class4750.field22538),
   field12652(5, Class4750.field22558),
   field12653(6, Class4750.field22569),
   field12654(7, Class4750.field22524),
   field12655(8, Class4750.field22553),
   field12656(9, Class4750.field22551),
   field12657(10, Class4750.field22559),
   field12658(11, Class4750.field22544),
   field12659(12, Class4750.field22557),
   field12660(13, Class4750.field22544),
   field12661(14, Class4750.field22555),
   field12662(15, Class8707.field39308),
   field12663(99, null);

   private final int field12664;
   private final Class4750 field12665;
   private static final Class1951[] field12666 = new Class1951[]{
      field12647,
      field12648,
      field12649,
      field12650,
      field12651,
      field12652,
      field12653,
      field12654,
      field12655,
      field12656,
      field12657,
      field12658,
      field12659,
      field12660,
      field12661,
      field12662,
      field12663
   };

   private Class1951(int var3, Class4750 var4) {
      this.field12664 = var3;
      this.field12665 = var4;
   }

   public static Class1951 method8210(int var0) {
      return values()[var0];
   }

   @Override
   public int method8207() {
      return this.field12664;
   }

   @Override
   public Class4750 method8208() {
      return this.field12665;
   }
}
