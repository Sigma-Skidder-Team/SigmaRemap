package remapped;

import java.util.List;

public class class_9591 extends class_3200<class_1941> {
   private static String[] field_48867;
   private final long field_48868;

   public class_9591(class_5390<class_1941> var1, int var2, int var3, class_9616 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.field_48868 = var6;
   }

   public void method_44295(class_6322 var1, class_6541 var2, class_5799 var3, int var4, int var5, class_6325 var6, class_1941 var7) {
      int var10 = 0;

      class_4960 var11;
      do {
         this.field_15986.clear();
         this.field_15988 = class_9616.method_44397();
         this.field_15989.method_39861(this.field_48868 + (long)(var10++), var4, var5);
         class_7965.method_36049();
         var11 = new class_4960(this.field_15989, (var4 << 4) + 2, (var5 << 4) + 2);
         this.field_15986.add(var11);
         var11.method_32527(var11, this.field_15986, this.field_15989);
         List var12 = var11.field_25657;

         while (!var12.isEmpty()) {
            int var13 = this.field_15989.nextInt(var12.size());
            class_7060 var14 = (class_7060)var12.remove(var13);
            var14.method_32527(var11, this.field_15986, this.field_15989);
         }

         this.method_14720();
         this.method_14723(var2.method_29816(), this.field_15989, 10);
      } while (this.field_15986.isEmpty() || var11.field_25655 == null);
   }
}
