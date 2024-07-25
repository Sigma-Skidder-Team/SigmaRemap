package remapped;

import java.io.IOException;
import javax.annotation.Nullable;

public class class_2436 implements class_6310<class_392> {
   private static String[] field_12106;
   private double field_12112;
   private double field_12110;
   private double field_12107;
   private int field_12109;
   private class_6139 field_12108;
   private class_6139 field_12111;
   private boolean field_12105;

   public class_2436() {
   }

   public class_2436(class_6139 var1, double var2, double var4, double var6) {
      this.field_12108 = var1;
      this.field_12112 = var2;
      this.field_12110 = var4;
      this.field_12107 = var6;
   }

   public class_2436(class_6139 var1, Entity var2, class_6139 var3) {
      this.field_12108 = var1;
      this.field_12109 = var2.method_37145();
      this.field_12111 = var3;
      class_1343 var6 = var3.method_28187(var2);
      this.field_12112 = var6.field_7336;
      this.field_12110 = var6.field_7333;
      this.field_12107 = var6.field_7334;
      this.field_12105 = true;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_12108 = var1.<class_6139>method_37787(class_6139.class);
      this.field_12112 = var1.readDouble();
      this.field_12110 = var1.readDouble();
      this.field_12107 = var1.readDouble();
      if (var1.readBoolean()) {
         this.field_12105 = true;
         this.field_12109 = var1.method_37778();
         this.field_12111 = var1.<class_6139>method_37787(class_6139.class);
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37750(this.field_12108);
      var1.writeDouble(this.field_12112);
      var1.writeDouble(this.field_12110);
      var1.writeDouble(this.field_12107);
      var1.writeBoolean(this.field_12105);
      if (this.field_12105) {
         var1.method_37743(this.field_12109);
         var1.method_37750(this.field_12111);
      }
   }

   public void method_11102(class_392 var1) {
      var1.method_1920(this);
   }

   public class_6139 method_11099() {
      return this.field_12108;
   }

   @Nullable
   public class_1343 method_11101(World var1) {
      if (!this.field_12105) {
         return new class_1343(this.field_12112, this.field_12110, this.field_12107);
      } else {
         Entity var4 = var1.method_29534(this.field_12109);
         return var4 != null ? this.field_12111.method_28187(var4) : new class_1343(this.field_12112, this.field_12110, this.field_12107);
      }
   }
}
