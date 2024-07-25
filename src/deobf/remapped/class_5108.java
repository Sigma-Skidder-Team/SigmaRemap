package remapped;

public class class_5108 implements Runnable {
   private static String[] field_26343;

   public class_5108(class_9697 var1, long var2, long var4, long var6, class_1702 var8, class_1702 var9) {
      this.field_26342 = var1;
      this.field_26341 = var2;
      this.field_26344 = var4;
      this.field_26338 = var6;
      this.field_26340 = var8;
      this.field_26339 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_26341; var3 < this.field_26344; var3++) {
         long var5 = 2L * var3;
         long var7 = this.field_26338 + var3;
         this.field_26340
            .method_36114(
               var7,
               class_9697.method_44811(this.field_26342).method_36107(var5) * this.field_26339.method_36107(var5)
                  - class_9697.method_44811(this.field_26342).method_36107(var5 + 1L) * this.field_26339.method_36107(var5 + 1L)
            );
      }
   }
}
