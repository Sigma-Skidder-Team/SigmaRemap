package mapped;

public enum Class1955 {
   field12728(-1, "unknown", false),
   field12729(1, "AAC Main Profile", true),
   field12730(2, "AAC Low Complexity", true),
   field12731(3, "AAC Scalable Sample Rate", false),
   field12732(4, "AAC Long Term Prediction", false),
   field12733(5, "AAC SBR", true),
   field12734(6, "Scalable AAC", false),
   field12735(7, "TwinVQ", false),
   field12736(11, "AAC Low Delay", false),
   field12737(17, "Error Resilient AAC Low Complexity", true),
   field12738(18, "Error Resilient AAC SSR", false),
   field12739(19, "Error Resilient AAC Long Term Prediction", false),
   field12740(20, "Error Resilient Scalable AAC", false),
   field12741(21, "Error Resilient TwinVQ", false),
   field12742(22, "Error Resilient BSAC", false),
   field12743(23, "Error Resilient AAC Low Delay", false);

   private static final Class1955[] field12744 = new Class1955[]{
      field12729,
      field12730,
      field12731,
      field12732,
      field12733,
      field12734,
      field12735,
      null,
      null,
      null,
      field12736,
      null,
      null,
      null,
      null,
      null,
      field12737,
      field12738,
      field12739,
      field12740,
      field12741,
      field12742,
      field12743
   };
   private final int field12745;
   private final String field12746;
   private final boolean field12747;
   private static final Class1955[] field12748 = new Class1955[]{
      field12728,
      field12729,
      field12730,
      field12731,
      field12732,
      field12733,
      field12734,
      field12735,
      field12736,
      field12737,
      field12738,
      field12739,
      field12740,
      field12741,
      field12742,
      field12743
   };

   public static Class1955 method8214(int var0) {
      Class1955 var3;
      if (var0 > 0 && var0 <= field12744.length) {
         var3 = field12744[var0 - 1];
      } else {
         var3 = field12728;
      }

      return var3;
   }

   private Class1955(int var3, String var4, boolean var5) {
      this.field12745 = var3;
      this.field12746 = var4;
      this.field12747 = var5;
   }

   public int method8215() {
      return this.field12745;
   }

   public String method8216() {
      return this.field12746;
   }

   @Override
   public String toString() {
      return this.field12746;
   }

   public boolean method8217() {
      return this.field12747;
   }

   public boolean method8218() {
      return this.field12745 > 16;
   }
}
