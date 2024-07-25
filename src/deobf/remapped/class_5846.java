package remapped;

import java.io.IOException;

public class class_5846 extends class_6926 {
   private long field_29701;
   private long field_29698;
   private long field_29699;
   private long field_29697;
   private long field_29696;

   public class_5846() {
      super("Track Extends Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_29701 = var1.method_27524(4);
      this.field_29698 = var1.method_27524(4);
      this.field_29699 = var1.method_27524(4);
      this.field_29697 = var1.method_27524(4);
      this.field_29696 = var1.method_27524(4);
   }

   public long method_26652() {
      return this.field_29701;
   }

   public long method_26653() {
      return this.field_29698;
   }

   public long method_26655() {
      return this.field_29699;
   }

   public long method_26657() {
      return this.field_29697;
   }

   public int method_26659() {
      return (int)(this.field_29696 >> 24 & 3L);
   }

   public int method_26654() {
      return (int)(this.field_29696 >> 22 & 3L);
   }

   public int method_26660() {
      return (int)(this.field_29696 >> 20 & 3L);
   }

   public int method_26658() {
      return (int)(this.field_29696 >> 17 & 7L);
   }

   public boolean method_26661() {
      return (this.field_29696 >> 16 & 1L) == 1L;
   }

   public int method_26656() {
      return (int)(this.field_29696 & 65535L);
   }
}
