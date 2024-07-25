package remapped;

public class class_3900 extends Exception {
   public final int field_18958;
   public final String field_18960;
   public final int field_18957;
   public final String field_18959;

   public class_3900(int var1, String var2, class_9131 var3) {
      super(var2);
      this.field_18958 = var1;
      this.field_18960 = var2;
      this.field_18957 = var3.method_42031();
      this.field_18959 = var3.method_42029();
   }

   public class_3900(int var1, String var2, int var3, String var4) {
      super(var2);
      this.field_18958 = var1;
      this.field_18960 = var2;
      this.field_18957 = var3;
      this.field_18959 = var4;
   }

   @Override
   public String toString() {
      if (this.field_18957 != -1) {
         String var3 = "mco.errorMessage." + this.field_18957;
         String var4 = class_6956.method_31803(var3);
         return (!var4.equals(var3) ? var4 : this.field_18959) + " - " + this.field_18957;
      } else {
         return "Realms (" + this.field_18958 + ") " + this.field_18960;
      }
   }
}
