package remapped;

import java.io.IOException;

public class class_1579 extends class_6926 {
   private int[] field_8279;
   private int[][] field_8277;

   public class_1579() {
      super("Sample Dependency Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = ((class_2416)this.field_19001.method_34607(1937011578L)).method_11023();

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_8279[var5] = (int)var1.method_27524(2);

         for (int var6 = 0; var6 < this.field_8279[var5]; var6++) {
            this.field_8277[var5][var6] = (int)var1.method_27524(2);
         }
      }
   }

   public int[] method_7119() {
      return this.field_8279;
   }

   public int[][] method_7118() {
      return this.field_8277;
   }
}
