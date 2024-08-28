package mapped;

public enum Class84 implements Class83 {
   field209,
   field210;

   private static final Class84[] field211 = new Class84[]{field209, field210};

   @Override
   public String toString() {
      return this.method257();
   }

   @Override
   public String method257() {
      return this != field209 ? "lower" : "upper";
   }
}
