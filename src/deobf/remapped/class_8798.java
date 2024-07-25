package remapped;

import java.util.List;

public class class_8798 extends class_3200<class_1941> {
   private static String[] field_45013;

   public class_8798(class_5390<class_1941> var1, int var2, int var3, class_9616 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method_40442(class_6322 var1, class_6541 var2, class_5799 var3, int var4, int var5, class_6325 var6, class_1941 var7) {
      class_1695 var10 = new class_1695(this.field_15989, (var4 << 4) + 2, (var5 << 4) + 2);
      this.field_15986.add(var10);
      var10.method_32527(var10, this.field_15986, this.field_15989);
      List var11 = var10.field_8767;

      while (!var11.isEmpty()) {
         int var12 = this.field_15989.nextInt(var11.size());
         class_7060 var13 = (class_7060)var11.remove(var12);
         var13.method_32527(var10, this.field_15986, this.field_15989);
      }

      this.method_14720();
      this.method_14735(this.field_15989, 48, 70);
   }
}
