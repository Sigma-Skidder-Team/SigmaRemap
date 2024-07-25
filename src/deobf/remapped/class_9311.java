package remapped;

public class class_9311 extends class_5251 {
   private static final long field_47551 = -9119388488683035101L;
   private String field_47550;
   private class_404 field_47547;
   private String field_47552;
   private class_404 field_47546;
   private String field_47549;

   public class_9311(String var1, class_404 var2, String var3, class_404 var4, String var5) {
      this(var1, var2, var3, var4, var5, null);
   }

   public class_9311(String var1, class_404 var2, String var3, class_404 var4, String var5, Throwable var6) {
      super(var1 + "; " + var3 + "; " + var4, var6);
      this.field_47550 = var1;
      this.field_47547 = var2;
      this.field_47552 = var3;
      this.field_47546 = var4;
      this.field_47549 = var5;
   }

   public class_9311(String var1, class_404 var2, String var3, class_404 var4) {
      this(var1, var2, var3, var4, null, null);
   }

   public class_9311(String var1, class_404 var2, String var3, class_404 var4, Throwable var5) {
      this(var1, var2, var3, var4, null, var5);
   }

   @Override
   public String getMessage() {
      return this.toString();
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder();
      if (this.field_47550 != null) {
         var3.append(this.field_47550);
         var3.append("\n");
      }

      if (this.field_47547 != null
         && (
            this.field_47552 == null
               || this.field_47546 == null
               || this.field_47547.method_2011().equals(this.field_47546.method_2011())
               || this.field_47547.method_2015() != this.field_47546.method_2015()
               || this.field_47547.method_2006() != this.field_47546.method_2006()
         )) {
         var3.append(this.field_47547.toString());
         var3.append("\n");
      }

      if (this.field_47552 != null) {
         var3.append(this.field_47552);
         var3.append("\n");
      }

      if (this.field_47546 != null) {
         var3.append(this.field_47546.toString());
         var3.append("\n");
      }

      if (this.field_47549 != null) {
         var3.append(this.field_47549);
         var3.append("\n");
      }

      return var3.toString();
   }

   public String method_42992() {
      return this.field_47550;
   }

   public class_404 method_42993() {
      return this.field_47547;
   }

   public String method_42994() {
      return this.field_47552;
   }

   public class_404 method_42991() {
      return this.field_47546;
   }
}
