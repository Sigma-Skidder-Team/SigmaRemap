package remapped;

public final class class_8426 {
   private static String[] field_43086;
   private final class_2297 field_43087;
   private final int field_43088;
   private int field_43089;

   private class_8426(class_2297 var1, int var2) {
      this.field_43087 = var1;
      this.field_43088 = var2;
   }

   private boolean method_38780() {
      this.field_43087.method_10565(Math.min((float)(++this.field_43089) / (float)this.field_43088, 1.0F));
      if (this.field_43089 <= this.field_43088) {
         return false;
      } else {
         this.field_43087.method_10566();
         return true;
      }
   }
}
