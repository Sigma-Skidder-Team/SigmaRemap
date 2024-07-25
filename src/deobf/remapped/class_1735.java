package remapped;

import java.io.IOException;

public class class_1735 extends class_2955 {
   private static String[] field_8938;
   private int field_8936;
   private int field_8937;
   private int field_8939;

   public class_1735(String var1) {
      super(var1);
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      var1.method_27527(8L);
      this.field_8936 = (int)var1.method_27524(2);
      this.field_8937 = (int)var1.method_27524(2);
      var1.method_27527(2L);
      var1.method_27527(2L);
      this.field_8939 = (int)var1.method_27524(2);
      var1.method_27527(2L);
      this.method_18110(var1);
   }

   public int method_7743() {
      return this.field_8936;
   }

   public int method_7744() {
      return this.field_8939;
   }

   public int method_7742() {
      return this.field_8937;
   }
}
