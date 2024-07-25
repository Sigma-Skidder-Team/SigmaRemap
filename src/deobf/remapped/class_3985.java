package remapped;

import java.io.IOException;

public class class_3985 implements Packet<class_392> {
   private static String[] field_19381;
   private int[] field_19382;

   public class_3985() {
   }

   public class_3985(int... var1) {
      this.field_19382 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_19382 = new int[var1.method_37778()];

      for (int var4 = 0; var4 < this.field_19382.length; var4++) {
         this.field_19382[var4] = var1.method_37778();
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_19382.length);

      for (int var7 : this.field_19382) {
         var1.method_37743(var7);
      }
   }

   public void method_18382(class_392 var1) {
      var1.method_1895(this);
   }

   public int[] method_18381() {
      return this.field_19382;
   }
}
