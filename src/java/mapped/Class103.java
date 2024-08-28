package mapped;

public enum Class103 implements Class83 {
   field313("floor"),
   field314("wall"),
   field315("ceiling");

   private final String field316;
   private static final Class103[] field317 = new Class103[]{field313, field314, field315};

   private Class103(String var3) {
      this.field316 = var3;
   }

   @Override
   public String method257() {
      return this.field316;
   }
}
