package remapped;

import java.util.ArrayList;

public class class_2485 extends class_4226 {
   private ArrayList field_12379 = new ArrayList();

   public class_2485(class_4226 var1) {
      super(var1.method_19685(), var1.method_19680());

      for (int var4 = 0; var4 < var1.method_19684(); var4++) {
         class_384 var5 = var1.method_19676(var4);
         class_384 var6 = new class_384(var5.method_1872(), new class_342(var5.method_1871()), var5.method_1873(), var5.method_1874());
         this.field_12379.add(var6);
      }
   }

   public void method_11382(class_4226 var1) {
      if (var1.method_19684() != this.field_12379.size()) {
         throw new RuntimeException("Mismatched diagrams, missing ids");
      } else {
         for (int var4 = 0; var4 < var1.method_19684(); var4++) {
            class_384 var5 = var1.method_19676(var4);
            String var6 = var5.method_1873().method_3508();

            for (int var7 = 0; var7 < this.field_12379.size(); var7++) {
               class_384 var8 = (class_384)this.field_12379.get(var7);
               if (var8.method_1873().method_3508().equals(var6)) {
                  class_342 var9 = (class_342)var8.method_1871();
                  var9.method_1761(var5.method_1871());
                  break;
               }
            }
         }
      }
   }

   public void method_11383(class_4226 var1) {
      for (int var4 = 0; var4 < this.field_12379.size(); var4++) {
         class_384 var5 = (class_384)this.field_12379.get(var4);

         for (int var6 = 0; var6 < var1.method_19684(); var6++) {
            class_384 var7 = var1.method_19676(var6);
            if (var7.method_1873().method_3508().equals(var5.method_1873().method_3508())) {
               class_342 var8 = (class_342)var5.method_1871();
               var8.method_1762(var7.method_1871());
               break;
            }
         }
      }
   }

   public void method_11381(float var1) {
      for (int var4 = 0; var4 < this.field_12379.size(); var4++) {
         class_384 var5 = (class_384)this.field_12379.get(var4);
         class_342 var6 = (class_342)var5.method_1871();
         var6.method_1764(var1);
      }
   }

   public void method_11380(float var1) {
      for (int var4 = 0; var4 < this.field_12379.size(); var4++) {
         class_384 var5 = (class_384)this.field_12379.get(var4);
         class_342 var6 = (class_342)var5.method_1871();
         var6.method_1760(var1);
      }
   }

   @Override
   public int method_19684() {
      return this.field_12379.size();
   }

   @Override
   public class_384 method_19676(int var1) {
      return (class_384)this.field_12379.get(var1);
   }
}
