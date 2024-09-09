package mapped;

public enum Class1892 {
   field11092(1, "Towards positive"),
   field11093(-1, "Towards negative");

   private final int field11094;
   private final String field11095;
   private static final Class1892[] field11096 = new Class1892[]{field11092, field11093};

   private Class1892(int var3, String var4) {
      this.field11094 = var3;
      this.field11095 = var4;
   }

   public int getOffset() {
      return this.field11094;
   }

   @Override
   public String toString() {
      return this.field11095;
   }

   public Class1892 method8151() {
      return this != field11092 ? field11092 : field11093;
   }
}
