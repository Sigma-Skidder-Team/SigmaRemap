package remapped;

import java.io.IOException;

public class class_3100 extends class_1237 {
   private static String[] field_15418;
   private int field_15414;
   private int field_15412;
   private int field_15416;
   private boolean field_15417;
   private long field_15415;
   private long field_15413;

   @Override
   public void method_5498(class_6041 var1) throws IOException {
      this.field_15414 = var1.method_27531();
      int var4 = var1.method_27531();
      this.field_15412 = var4 >> 2 & 63;
      this.field_15417 = (var4 >> 1 & 1) == 1;
      this.field_15416 = (int)var1.method_27524(3);
      this.field_15415 = var1.method_27524(4);
      this.field_15413 = var1.method_27524(4);
      this.method_5493(var1);
   }

   public int method_14183() {
      return this.field_15414;
   }

   public int method_14187() {
      return this.field_15412;
   }

   public boolean method_14184() {
      return this.field_15417;
   }

   public int method_14182() {
      return this.field_15416;
   }

   public long method_14186() {
      return this.field_15415;
   }

   public long method_14185() {
      return this.field_15413;
   }
}
