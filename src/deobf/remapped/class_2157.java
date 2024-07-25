package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_2157 extends class_7764 {
   private static String[] field_10770;
   private class_6310 field_10769;
   private List<class_6310> field_10768 = new ArrayList<class_6310>();

   public class_2157(class_6310 var1) {
      this.field_10769 = var1;
      this.field_10768.add(var1);
   }

   public class_6310 method_10047() {
      return this.field_10769;
   }

   public List<class_6310> method_10048() {
      return this.field_10768;
   }

   public void method_10046(class_6310 var1) {
      this.field_10769 = var1;
   }
}
