package mapped;

public enum Class2321 {
   field15904 {
      @Override
      public int method9098(int var1, int var2, int var3, Direction var4) {
         return var4.method327(var1, var2, var3);
      }

      @Override
      public Direction method9099(Direction var1) {
         return var1;
      }

      @Override
      public Class2321 method9100() {
         return this;
      }
   },
   field15905 {
      @Override
      public int method9098(int var1, int var2, int var3, Direction var4) {
         return var4.method327(var3, var1, var2);
      }

      @Override
      public Direction method9099(Direction var1) {
         return field15907[Math.floorMod(var1.ordinal() + 1, 3)];
      }

      @Override
      public Class2321 method9100() {
         return field15906;
      }
   },
   field15906 {
      @Override
      public int method9098(int var1, int var2, int var3, Direction var4) {
         return var4.method327(var2, var3, var1);
      }

      @Override
      public Direction method9099(Direction var1) {
         return field15907[Math.floorMod(var1.ordinal() - 1, 3)];
      }

      @Override
      public Class2321 method9100() {
         return field15905;
      }
   };

   public static final Direction[] field15907 = Direction.values();
   public static final Class2321[] field15908 = values();
   private static final Class2321[] field15909 = new Class2321[]{field15904, field15905, field15906};

   private Class2321() {
   }

   public abstract int method9098(int var1, int var2, int var3, Direction var4);

   public abstract Direction method9099(Direction var1);

   public abstract Class2321 method9100();

   public static Class2321 method9101(Direction var0, Direction var1) {
      return field15908[Math.floorMod(var1.ordinal() - var0.ordinal(), 3)];
   }
}
