package mapped;

public enum Class98 implements Class83 {
   field265("up"),
   field266("side"),
   field267("none");

   private final String field268;
   private static final Class98[] field269 = new Class98[]{field265, field266, field267};

   private Class98(String var3) {
      this.field268 = var3;
   }

   @Override
   public String toString() {
      return this.method257();
   }

   @Override
   public String method257() {
      return this.field268;
   }

   public boolean method279() {
      return this != field267;
   }
}
