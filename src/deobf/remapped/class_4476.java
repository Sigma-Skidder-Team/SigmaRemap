package remapped;

import java.io.IOException;

public class class_4476 implements Packet<class_392> {
   private static String[] field_21816;
   private int field_21815;
   private int field_21814;
   private int field_21817;

   public class_4476() {
   }

   public class_4476(int var1, int var2, int var3) {
      this.field_21815 = var1;
      this.field_21814 = var2;
      this.field_21817 = var3;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_21815 = var1.method_37778();
      this.field_21814 = var1.method_37778();
      this.field_21817 = var1.method_37778();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_21815);
      var1.method_37743(this.field_21814);
      var1.method_37743(this.field_21817);
   }

   public void method_20772(class_392 var1) {
      var1.method_1961(this);
   }

   public int method_20771() {
      return this.field_21815;
   }

   public int method_20770() {
      return this.field_21814;
   }

   public int method_20769() {
      return this.field_21817;
   }
}
