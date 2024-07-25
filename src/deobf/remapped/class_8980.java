package remapped;

import java.io.IOException;

public class class_8980 extends class_6926 {
   public static final long field_46015 = 1769239918L;
   private long field_46012;
   private long field_46014;
   private String field_46013;

   public class_8980() {
      super("Scheme Type Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_46012 = var1.method_27524(4);
      this.field_46014 = var1.method_27524(4);
      this.field_46013 = (this.field_35591 & 1) != 1 ? null : var1.method_27539((int)this.method_18113(var1), "UTF-8");
   }

   public long method_41174() {
      return this.field_46012;
   }

   public long method_41172() {
      return this.field_46014;
   }

   public String method_41173() {
      return this.field_46013;
   }
}
