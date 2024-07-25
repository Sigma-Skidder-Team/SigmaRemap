package remapped;

import java.io.IOException;

public class class_7125 extends class_6926 {
   private long[] field_36715;
   private long[] field_36716;

   public class_7125() {
      super("Time To Sample Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = (int)var1.method_27524(4);
      this.field_36715 = new long[var4];
      this.field_36716 = new long[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_36715[var5] = var1.method_27524(4);
         this.field_36716[var5] = var1.method_27524(4);
      }
   }

   public long[] method_32736() {
      return this.field_36715;
   }

   public long[] method_32735() {
      return this.field_36716;
   }
}
