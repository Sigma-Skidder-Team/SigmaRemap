package remapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class class_8910 {
   private static String[] field_45686;
   private List<class_5024> field_45685 = new ArrayList<class_5024>();
   private List<class_2522> field_45683 = new ArrayList<class_2522>();
   private List<class_5024> field_45684 = Arrays.<class_5024>asList();

   public void method_40989(class_5024 var1, class_2522 var2) {
      if (var1 != null) {
         this.field_45685.add(var1);
         this.field_45683.add(var2);
      }
   }

   public int method_40987() {
      return this.field_45685.size();
   }

   public class_5024 method_40992(int var1) {
      return this.field_45685.get(var1);
   }

   public class_2522 method_40986(int var1) {
      return var1 >= 0 && var1 < this.field_45683.size() ? this.field_45683.get(var1) : class_4783.field_23184.method_29260();
   }

   public List<class_5024> method_40991(class_5024 var1) {
      this.field_45684.set(0, var1);
      return this.field_45684;
   }

   public void method_40990() {
      this.field_45685.clear();
      this.field_45683.clear();
   }
}
