package mapped;

public enum Class181 implements Class83 {
   field642("none"),
   field643("small"),
   field644("large");

   private final String field645;
   private static final Class181[] field646 = new Class181[]{field642, field643, field644};

   private Class181(String var3) {
      this.field645 = var3;
   }

   @Override
   public String toString() {
      return this.field645;
   }

   @Override
   public String method257() {
      return this.field645;
   }
}
