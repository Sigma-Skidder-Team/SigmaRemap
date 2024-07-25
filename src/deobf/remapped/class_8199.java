package remapped;

import java.io.IOException;

public class class_8199 extends class_6926 {
   private int[] field_41960;

   public class_8199() {
      super("Degradation Priority Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = ((class_2416)this.field_19001.method_34607(1937011578L)).method_11023();
      this.field_41960 = new int[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_41960[var5] = (int)var1.method_27524(2);
      }
   }

   public int[] method_37558() {
      return this.field_41960;
   }
}
