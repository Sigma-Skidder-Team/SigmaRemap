package remapped;

public class class_2367 extends class_8856 {
   private static String[] field_11863;
   public final class_8748 field_11861;
   private final class_8067 field_11862;
   private final String field_11860;
   private final String field_11859;

   public class_2367(class_8748 var1, String var2, String var3) {
      this.field_11861 = var1;
      this.field_11860 = var2;
      this.field_11859 = var3;
      class_5322 var6 = var1.method_40153(1);
      this.field_11862 = class_1259.method_5671(new class_9062(this, var6, var1));
   }

   @Override
   public class_1972 method_40738() {
      return this.field_11860 == null ? null : class_1972.method_9069(this.field_11860);
   }

   @Override
   public long method_40730() {
      try {
         return this.field_11859 != null ? Long.parseLong(this.field_11859) : -1L;
      } catch (NumberFormatException var4) {
         return -1L;
      }
   }

   @Override
   public class_8067 method_40735() {
      return this.field_11862;
   }
}
