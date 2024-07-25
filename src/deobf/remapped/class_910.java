package remapped;

import java.io.IOException;

public class class_910 extends class_3912 {
   public static final String field_4660 = "isom";
   public static final String field_4661 = "iso2";
   public static final String field_4666 = "iso3";
   public static final String field_4667 = "mp41";
   public static final String field_4668 = "mp42";
   public static final String field_4674 = "mmp4";
   public static final String field_4671 = "qm  ";
   public static final String field_4665 = "avc1";
   public static final String field_4669 = "M4A ";
   public static final String field_4664 = "M4B ";
   public static final String field_4662 = "M4P ";
   public static final String field_4663 = "mp71";
   public String field_4675;
   public String field_4673;
   public String[] field_4672;

   public class_910() {
      super("File Type Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      this.field_4675 = var1.method_27533(4);
      this.field_4673 = var1.method_27533(4);
      this.field_4672 = new String[(int)this.method_18113(var1) / 4];

      for (int var4 = 0; var4 < this.field_4672.length; var4++) {
         this.field_4672[var4] = var1.method_27533(4);
      }
   }

   public String method_3896() {
      return this.field_4675;
   }

   public String method_3895() {
      return this.field_4673;
   }

   public String[] method_3897() {
      return this.field_4672;
   }
}
