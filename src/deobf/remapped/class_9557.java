package remapped;

import java.io.IOException;

public class class_9557 extends class_6926 {
   private boolean field_48623;
   private boolean field_48618;
   private boolean field_48622;
   private long field_48610;
   private long field_48616;
   private long field_48619;
   private int field_48615;
   private int field_48617;
   private int field_48621;
   private double field_48620;
   private double field_48611;
   private double field_48612;
   private double[] field_48614 = new double[9];

   public class_9557() {
      super("Track Header Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_48623 = (this.field_35591 & 1) == 1;
      this.field_48618 = (this.field_35591 & 2) == 2;
      this.field_48622 = (this.field_35591 & 4) == 4;
      int var4 = this.field_35590 != 1 ? 4 : 8;
      this.field_48610 = var1.method_27524(var4);
      this.field_48616 = var1.method_27524(var4);
      this.field_48615 = (int)var1.method_27524(4);
      var1.method_27527(4L);
      this.field_48619 = class_504.method_2503(var1.method_27524(var4));
      var1.method_27527(8L);
      this.field_48617 = (int)var1.method_27524(2);
      this.field_48621 = (int)var1.method_27524(2);
      this.field_48620 = var1.method_27530(8, 8);
      var1.method_27527(2L);

      for (int var5 = 0; var5 < 9; var5++) {
         if (var5 >= 6) {
            this.field_48614[var5] = var1.method_27530(2, 30);
         } else {
            this.field_48614[var5] = var1.method_27530(16, 16);
         }
      }

      this.field_48611 = var1.method_27530(16, 16);
      this.field_48612 = var1.method_27530(16, 16);
   }

   public boolean method_44090() {
      return this.field_48623;
   }

   public boolean method_44081() {
      return this.field_48618;
   }

   public boolean method_44085() {
      return this.field_48622;
   }

   public long method_44080() {
      return this.field_48610;
   }

   public long method_44091() {
      return this.field_48616;
   }

   public int method_44082() {
      return this.field_48615;
   }

   public long method_44084() {
      return this.field_48619;
   }

   public int method_44083() {
      return this.field_48617;
   }

   public int method_44087() {
      return this.field_48621;
   }

   public double method_44092() {
      return this.field_48620;
   }

   public double method_44088() {
      return this.field_48611;
   }

   public double method_44086() {
      return this.field_48612;
   }

   public double[] method_44089() {
      return this.field_48614;
   }
}
