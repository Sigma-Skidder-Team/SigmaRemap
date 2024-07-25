package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_4580 {
   private static String[] field_22287;
   private List<class_7030> field_22284 = new ArrayList<class_7030>();
   private class_3122 field_22289 = class_3122.field_15515;
   private boolean field_22288 = false;
   private boolean field_22286 = false;
   private boolean field_22285 = false;

   public class_4580(class_7030 var1) {
      this.field_22284.add(var1.method_32066(this.method_21233().method_32066(this.method_21233())));
      this.field_22284.add(var1.method_32066(this.method_21233()));
      this.field_22284.add(var1);
   }

   private class_7030 method_21233() {
      return class_4578.method_21227(this.field_22289);
   }

   public void method_21232() {
      class_7030 var3 = this.field_22284.get(0).method_32066(this.method_21233());
      this.field_22285 = this.field_22284.contains(var3);
      this.field_22284.add(0, var3);
      if (!this.field_22286) {
         this.field_22284.remove(this.field_22284.size() - 1);
      }

      this.field_22288 = false;
      this.field_22286 = false;
   }

   public void method_21234() {
      this.field_22286 = true;
   }

   public void method_21229(class_3122 var1) {
      class_7030 var4 = class_4578.method_21227(var1).method_32066(class_4578.method_21227(this.field_22289));
      if ((var4.field_36201 != 0 || var4.field_36203 != 0) && var1 != this.field_22289 && !this.field_22288) {
         this.field_22289 = var1;
         this.field_22288 = true;
      }
   }

   public boolean method_21235() {
      return this.field_22285;
   }

   public List<class_7030> method_21230() {
      return this.field_22284;
   }

   public boolean method_21231(class_7030 var1) {
      return var1 != null ? this.field_22284.contains(var1) : true;
   }
}
