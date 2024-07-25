package remapped;

import java.util.Properties;

public class class_1158 {
   private String field_6573;
   private Identifier[] field_6580;
   private int field_6578 = 1;
   private int field_6582 = 64;
   private int field_6579 = 3;
   private int field_6572 = 3;
   private int field_6581 = -2130706433;
   private int field_6577 = 16777215;
   private int field_6575 = 0;
   private int field_6574 = Integer.MIN_VALUE;

   public class_1158(String var1, Properties var2) {
      class_6284 var5 = new class_6284("CustomPanorama");
      this.field_6573 = var1;
      this.field_6580 = new Identifier[6];

      for (int var6 = 0; var6 < this.field_6580.length; var6++) {
         this.field_6580[var6] = new Identifier(var1 + "/panorama_" + var6 + ".png");
      }

      this.field_6578 = var5.method_28676(var2.getProperty("weight"), 1);
      this.field_6582 = var5.method_28676(var2.getProperty("blur1"), 64);
      this.field_6579 = var5.method_28676(var2.getProperty("blur2"), 3);
      this.field_6572 = var5.method_28676(var2.getProperty("blur3"), 3);
      this.field_6581 = class_6284.method_28664(var2.getProperty("overlay1.top"), -2130706433);
      this.field_6577 = class_6284.method_28664(var2.getProperty("overlay1.bottom"), 16777215);
      this.field_6575 = class_6284.method_28664(var2.getProperty("overlay2.top"), 0);
      this.field_6574 = class_6284.method_28664(var2.getProperty("overlay2.bottom"), Integer.MIN_VALUE);
   }

   public Identifier[] method_5162() {
      return this.field_6580;
   }

   public int method_5164() {
      return this.field_6578;
   }

   public int method_5165() {
      return this.field_6582;
   }

   public int method_5157() {
      return this.field_6579;
   }

   public int method_5160() {
      return this.field_6572;
   }

   public int method_5161() {
      return this.field_6581;
   }

   public int method_5158() {
      return this.field_6577;
   }

   public int method_5163() {
      return this.field_6575;
   }

   public int method_5159() {
      return this.field_6574;
   }

   @Override
   public String toString() {
      return ""
         + this.field_6573
         + ", weight: "
         + this.field_6578
         + ", blur: "
         + this.field_6582
         + " "
         + this.field_6579
         + " "
         + this.field_6572
         + ", overlay: "
         + this.field_6581
         + " "
         + this.field_6577
         + " "
         + this.field_6575
         + " "
         + this.field_6574;
   }
}
