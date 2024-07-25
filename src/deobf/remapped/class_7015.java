package remapped;

public class class_7015 extends class_4106<class_9364, class_998, class_7066, class_6410> {
   private static String[] field_35957;

   public class_7015() {
      super(class_9364.class, class_998.class, class_7066.class, class_6410.class);
   }

   @Override
   public void method_18998() {
      class_9341 var3 = new class_9341(this);
      class_6454.method_29418(this);
      this.method_19015(class_9364.field_47834, new class_8464(this, var3));
      this.method_19015(class_9364.field_47833, new class_6372(this, var3));
      this.method_19015(class_9364.field_47853, new class_1484(this));
      this.method_19015(class_9364.field_47859, new class_8639(this));
      var3.method_33112(class_9364.field_47879);
      var3.method_33128(class_9364.field_47892, class_633.field_3566);
      this.method_19015(class_9364.field_47842, new class_6513(this));
      this.method_19015(class_9364.field_47832, new class_5620(this));
      new class_267(this, this::method_32030).method_1194(class_9364.field_47898);
      this.method_19003(class_6410.field_32739);
      this.method_18992(class_6410.field_32740, new class_6152(this));
      this.method_19003(class_6410.field_32728);
      this.method_19003(class_6410.field_32732);
   }

   private int method_32030(int var1) {
      int var4 = var1;
      if (var1 >= 26) {
         var4 = var1 + 2;
      }

      if (var1 >= 70) {
         var4 += 4;
      }

      if (var1 >= 74) {
         var4++;
      }

      if (var1 >= 143) {
         var4 += 3;
      }

      if (var1 >= 185) {
         var4++;
      }

      if (var1 >= 263) {
         var4 += 7;
      }

      if (var1 >= 301) {
         var4 += 33;
      }

      if (var1 >= 317) {
         var4 += 2;
      }

      if (var1 >= 491) {
         var4 += 3;
      }

      return var4;
   }

   @Override
   public void method_19020(class_5368 var1) {
      var1.method_24491(class_9480.class, new class_9480());
   }

   @Override
   public void method_19025(class_1455 var1) {
      var1.method_6737(new class_6373(var1));
      if (!var1.method_6708(class_4787.class)) {
         var1.method_6737(new class_4787(var1));
      }
   }
}
