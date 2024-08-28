package mapped;

public enum Class2061 {
   field13430(4, "Float", 5126),
   field13431(1, "Unsigned Byte", 5121),
   field13432(1, "Byte", 5120),
   field13433(2, "Unsigned Short", 5123),
   field13434(2, "Short", 5122),
   field13435(4, "Unsigned Int", 5125),
   field13436(4, "Int", 5124);

   private final int field13437;
   private final String field13438;
   private final int field13439;
   private static final Class2061[] field13440 = new Class2061[]{field13430, field13431, field13432, field13433, field13434, field13435, field13436};

   private Class2061(int var3, String var4, int var5) {
      this.field13437 = var3;
      this.field13438 = var4;
      this.field13439 = var5;
   }

   public int method8707() {
      return this.field13437;
   }

   public String method8708() {
      return this.field13438;
   }

   public int method8709() {
      return this.field13439;
   }
}
