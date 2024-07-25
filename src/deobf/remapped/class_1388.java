package remapped;

import java.io.IOException;

public class class_1388 implements class_6310<class_392> {
   private static String[] field_7581;
   private class_1534 field_7582;
   private int field_7576;
   private double field_7574;
   private double field_7578;
   private double field_7579;
   private double field_7577;
   private long field_7580;
   private int field_7573;
   private int field_7575;

   public class_1388() {
   }

   public class_1388(class_2098 var1, class_1534 var2) {
      this.field_7582 = var2;
      this.field_7574 = var1.method_9807();
      this.field_7578 = var1.method_9835();
      this.field_7577 = var1.method_9824();
      this.field_7579 = var1.method_9817();
      this.field_7580 = var1.method_9804();
      this.field_7576 = var1.method_9811();
      this.field_7575 = var1.method_9819();
      this.field_7573 = var1.method_9812();
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_7582 = var1.<class_1534>method_37787(class_1534.class);
      switch (this.field_7582) {
         case field_8131:
            this.field_7579 = var1.readDouble();
            break;
         case field_8133:
            this.field_7577 = var1.readDouble();
            this.field_7579 = var1.readDouble();
            this.field_7580 = var1.method_37781();
            break;
         case field_8135:
            this.field_7574 = var1.readDouble();
            this.field_7578 = var1.readDouble();
            break;
         case field_8138:
            this.field_7575 = var1.method_37778();
            break;
         case field_8132:
            this.field_7573 = var1.method_37778();
            break;
         case field_8136:
            this.field_7574 = var1.readDouble();
            this.field_7578 = var1.readDouble();
            this.field_7577 = var1.readDouble();
            this.field_7579 = var1.readDouble();
            this.field_7580 = var1.method_37781();
            this.field_7576 = var1.method_37778();
            this.field_7575 = var1.method_37778();
            this.field_7573 = var1.method_37778();
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37750(this.field_7582);
      switch (this.field_7582) {
         case field_8131:
            var1.writeDouble(this.field_7579);
            break;
         case field_8133:
            var1.writeDouble(this.field_7577);
            var1.writeDouble(this.field_7579);
            var1.method_37752(this.field_7580);
            break;
         case field_8135:
            var1.writeDouble(this.field_7574);
            var1.writeDouble(this.field_7578);
            break;
         case field_8138:
            var1.method_37743(this.field_7575);
            break;
         case field_8132:
            var1.method_37743(this.field_7573);
            break;
         case field_8136:
            var1.writeDouble(this.field_7574);
            var1.writeDouble(this.field_7578);
            var1.writeDouble(this.field_7577);
            var1.writeDouble(this.field_7579);
            var1.method_37752(this.field_7580);
            var1.method_37743(this.field_7576);
            var1.method_37743(this.field_7575);
            var1.method_37743(this.field_7573);
      }
   }

   public void method_6431(class_392 var1) {
      var1.method_1954(this);
   }

   public void method_6429(class_2098 var1) {
      switch (this.field_7582) {
         case field_8131:
            var1.method_9822(this.field_7579);
            break;
         case field_8133:
            var1.method_9823(this.field_7577, this.field_7579, this.field_7580);
            break;
         case field_8135:
            var1.method_9836(this.field_7574, this.field_7578);
            break;
         case field_8138:
            var1.method_9832(this.field_7575);
            break;
         case field_8132:
            var1.method_9803(this.field_7573);
            break;
         case field_8136:
            var1.method_9836(this.field_7574, this.field_7578);
            if (this.field_7580 > 0L) {
               var1.method_9823(this.field_7577, this.field_7579, this.field_7580);
            } else {
               var1.method_9822(this.field_7579);
            }

            var1.method_9810(this.field_7576);
            var1.method_9832(this.field_7575);
            var1.method_9803(this.field_7573);
      }
   }
}
