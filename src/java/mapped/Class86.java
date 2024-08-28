package mapped;

public enum Class86 implements Class83 {
   field218("top"),
   field219("bottom"),
   field220("double");

   private final String field221;
   private static final Class86[] field222 = new Class86[]{field218, field219, field220};

   private Class86(String var3) {
      this.field221 = var3;
   }

   @Override
   public String toString() {
      return this.field221;
   }

   @Override
   public String method257() {
      return this.field221;
   }
}
