package remapped;

public class class_1123 {
   private int field_6417;

   public boolean method_4942() {
      this.field_6417++;
      return this.field_6417 == 1;
   }

   public boolean method_4943() {
      if (this.field_6417 > 0) {
         this.field_6417--;
         return this.field_6417 == 0;
      } else {
         return false;
      }
   }

   public boolean method_4945() {
      return this.field_6417 > 0;
   }

   public int method_4944() {
      return this.field_6417;
   }

   @Override
   public String toString() {
      return "lockCount: " + this.field_6417;
   }
}
