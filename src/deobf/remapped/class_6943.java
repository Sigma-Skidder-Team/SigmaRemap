package remapped;

public enum class_6943 {
   field_35707(class_7268.field_37218, 0, 0, "mainhand"),
   field_35701(class_7268.field_37218, 1, 5, "offhand"),
   field_35700(class_7268.field_37219, 0, 1, "feet"),
   field_35698(class_7268.field_37219, 1, 2, "legs"),
   field_35708(class_7268.field_37219, 2, 3, "chest"),
   field_35704(class_7268.field_37219, 3, 4, "head");

   private final class_7268 field_35702;
   private final int field_35699;
   private final int field_35703;
   private final String field_35706;

   private class_6943(class_7268 var3, int var4, int var5, String var6) {
      this.field_35702 = var3;
      this.field_35699 = var4;
      this.field_35703 = var5;
      this.field_35706 = var6;
   }

   public class_7268 method_31772() {
      return this.field_35702;
   }

   public int method_31767() {
      return this.field_35699;
   }

   public int method_31773() {
      return this.field_35703;
   }

   public String method_31769() {
      return this.field_35706;
   }

   public static class_6943 method_31771(String var0) {
      for (class_6943 var6 : values()) {
         if (var6.method_31769().equals(var0)) {
            return var6;
         }
      }

      throw new IllegalArgumentException("Invalid slot '" + var0 + "'");
   }

   public static class_6943 method_31768(class_7268 var0, int var1) {
      for (class_6943 var7 : values()) {
         if (var7.method_31772() == var0 && var7.method_31767() == var1) {
            return var7;
         }
      }

      throw new IllegalArgumentException("Invalid slot '" + var0 + "': " + var1);
   }
}
