package remapped;

public enum class_8296 {
   field_42518(-1, "unknown", false),
   field_42513(1, "AAC Main Profile", true),
   field_42521(2, "AAC Low Complexity", true),
   field_42524(3, "AAC Scalable Sample Rate", false),
   field_42522(4, "AAC Long Term Prediction", false),
   field_42515(5, "AAC SBR", true),
   field_42517(6, "Scalable AAC", false),
   field_42510(7, "TwinVQ", false),
   field_42505(11, "AAC Low Delay", false),
   field_42519(17, "Error Resilient AAC Low Complexity", true),
   field_42520(18, "Error Resilient AAC SSR", false),
   field_42503(19, "Error Resilient AAC Long Term Prediction", false),
   field_42516(20, "Error Resilient Scalable AAC", false),
   field_42504(21, "Error Resilient TwinVQ", false),
   field_42508(22, "Error Resilient BSAC", false),
   field_42507(23, "Error Resilient AAC Low Delay", false);

   private static final class_8296[] field_42523 = new class_8296[]{
      field_42513,
      field_42521,
      field_42524,
      field_42522,
      field_42515,
      field_42517,
      field_42510,
      null,
      null,
      null,
      field_42505,
      null,
      null,
      null,
      null,
      null,
      field_42519,
      field_42520,
      field_42503,
      field_42516,
      field_42504,
      field_42508,
      field_42507
   };
   private final int field_42512;
   private final String field_42506;
   private final boolean field_42511;

   public static class_8296 method_38275(int var0) {
      class_8296 var3;
      if (var0 > 0 && var0 <= field_42523.length) {
         var3 = field_42523[var0 - 1];
      } else {
         var3 = field_42518;
      }

      return var3;
   }

   private class_8296(int var3, String var4, boolean var5) {
      this.field_42512 = var3;
      this.field_42506 = var4;
      this.field_42511 = var5;
   }

   public int method_38274() {
      return this.field_42512;
   }

   public String method_38272() {
      return this.field_42506;
   }

   @Override
   public String toString() {
      return this.field_42506;
   }

   public boolean method_38271() {
      return this.field_42511;
   }

   public boolean method_38276() {
      return this.field_42512 > 16;
   }
}
