package remapped;

import java.util.ArrayList;

public class class_5461 {
   private static String[] field_27818;
   private ArrayList field_27820;

   public class_5461(class_1411 var1) {
      this.field_27819 = var1;
      this.field_27820 = new ArrayList();
   }

   public boolean method_24859(class_5324 var1) {
      return this.field_27820.contains(var1);
   }

   public void method_24858(class_5324 var1) {
      this.field_27820.add(var1);
   }

   public void method_24856(class_5324 var1) {
      this.field_27820.remove(var1);
   }

   public int method_24854() {
      return this.field_27820.size();
   }

   public class_5324 method_24855(int var1) {
      return (class_5324)this.field_27820.get(var1);
   }

   public void method_24853() {
      this.field_27820.clear();
   }
}
