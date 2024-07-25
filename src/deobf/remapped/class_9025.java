package remapped;

import java.io.IOException;

public class class_9025 extends class_6926 {
   private long field_46191;
   private long field_46189;
   private long field_46192;
   private class_4392[] field_46188;

   public class_9025() {
      super("Sample Group Description Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_46191 = var1.method_27524(4);
      this.field_46189 = this.field_35590 != 1 ? 0L : var1.method_27524(4);
      int var4 = (int)var1.method_27524(4);
   }

   public long method_41409() {
      return this.field_46191;
   }

   public long method_41407() {
      return this.field_46189;
   }

   public long method_41408() {
      return this.field_46192;
   }
}
