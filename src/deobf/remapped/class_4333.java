package remapped;

public class class_4333 {
   public String field_21072;
   public int field_21071;
   public int field_21073;
   public int field_21075;
   public float field_21077 = 64.0F;
   public final boolean field_21076;

   public class_4333(String var1, int var2, int var3, int var4) {
      this.field_21071 = var2;
      this.field_21073 = var3;
      this.field_21072 = var1;
      this.field_21075 = var4;
      this.field_21076 = true;
   }

   public class_4333(String var1, int var2, int var3, int var4, int var5) {
      this.field_21071 = var2;
      this.field_21073 = var4;
      this.field_21077 = (float)var3;
      this.field_21072 = var1;
      this.field_21075 = var5;
      this.field_21076 = false;
   }

   public class_4333(class_1293 var1) {
      if (var1.method_5850("name")) {
         this.field_21072 = var1.method_5861("name");
      }

      if (var1.method_5850("color")) {
         this.field_21075 = var1.method_5813("color");
      }

      if (var1.method_5850("x")) {
         this.field_21071 = var1.method_5813("x");
      }

      if (var1.method_5850("z")) {
         this.field_21073 = var1.method_5813("z");
      }

      this.field_21076 = true;
   }

   public class_1293 method_20159() {
      class_1293 var3 = new class_1293();
      var3.method_5820("name", this.field_21072);
      var3.method_5818("color", this.field_21075);
      var3.method_5818("x", this.field_21071);
      var3.method_5818("z", this.field_21073);
      return var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class_4333 var4 = (class_4333)var1;
         return var4.field_21072.equals(this.field_21072)
            && var4.field_21071 == this.field_21071
            && var4.field_21073 == this.field_21073
            && var4.field_21075 == this.field_21075;
      } else {
         return false;
      }
   }
}
