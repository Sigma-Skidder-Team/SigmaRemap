package remapped;

import java.io.IOException;

public class class_3485 extends class_6926 {
   private long field_17108;
   private long field_17105;
   private long field_17109;
   private long field_17106;
   private double field_17104;
   private double field_17111;
   private double[] field_17110 = new double[9];
   private long field_17112;

   public class_3485() {
      super("Movie Header Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = this.field_35590 != 1 ? 4 : 8;
      this.field_17108 = var1.method_27524(var4);
      this.field_17105 = var1.method_27524(var4);
      this.field_17109 = var1.method_27524(4);
      this.field_17106 = class_504.method_2503(var1.method_27524(var4));
      this.field_17104 = var1.method_27530(16, 16);
      this.field_17111 = var1.method_27530(8, 8);
      var1.method_27527(10L);

      for (int var5 = 0; var5 < 9; var5++) {
         if (var5 >= 6) {
            this.field_17110[var5] = var1.method_27530(2, 30);
         } else {
            this.field_17110[var5] = var1.method_27530(16, 16);
         }
      }

      var1.method_27527(24L);
      this.field_17112 = var1.method_27524(4);
   }

   public long method_16027() {
      return this.field_17108;
   }

   public long method_16029() {
      return this.field_17105;
   }

   public long method_16026() {
      return this.field_17109;
   }

   public long method_16025() {
      return this.field_17106;
   }

   public double method_16028() {
      return this.field_17104;
   }

   public double method_16024() {
      return this.field_17111;
   }

   public double[] method_16023() {
      return this.field_17110;
   }

   public long method_16030() {
      return this.field_17112;
   }
}
