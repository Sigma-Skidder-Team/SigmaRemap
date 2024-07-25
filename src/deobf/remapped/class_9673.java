package remapped;

import java.io.IOException;

public class class_9673 extends class_5535 {
   private int field_49269;
   private double field_49268;
   private double field_49271;
   private double field_49270;
   private String field_49274;
   private String field_49272;
   private String field_49267;

   public class_9673() {
      super("3GPP Location Information Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      this.method_25141(var1);
      this.field_49274 = var1.method_27538((int)this.method_18113(var1));
      this.field_49269 = var1.method_27531();
      this.field_49268 = var1.method_27530(16, 16);
      this.field_49271 = var1.method_27530(16, 16);
      this.field_49270 = var1.method_27530(16, 16);
      this.field_49272 = var1.method_27538((int)this.method_18113(var1));
      this.field_49267 = var1.method_27538((int)this.method_18113(var1));
   }

   public String method_44735() {
      return this.field_49274;
   }

   public int method_44736() {
      return this.field_49269;
   }

   public double method_44732() {
      return this.field_49268;
   }

   public double method_44733() {
      return this.field_49271;
   }

   public double method_44734() {
      return this.field_49270;
   }

   public String method_44737() {
      return this.field_49272;
   }

   public String method_44738() {
      return this.field_49267;
   }
}
