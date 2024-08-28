package mapped;

public enum Class184 implements Class83 {
   field667("none"),
   field668("low"),
   field669("tall");

   private final String field670;
   private static final Class184[] field671 = new Class184[]{field667, field668, field669};

   private Class184(String var3) {
      this.field670 = var3;
   }

   @Override
   public String toString() {
      return this.method257();
   }

   @Override
   public String method257() {
      return this.field670;
   }
}
