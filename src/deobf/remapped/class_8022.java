package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_8022 {
   private static String[] field_41076;
   public class_3872 field_41075;
   public List<byte[]> field_41074;

   public class_8022(class_3872 var1) {
      this.field_41075 = var1;
      this.field_41074 = new ArrayList<byte[]>();
   }

   public class_3872 method_36448(byte[] var1) {
      this.field_41074.add(var1);
      if (this.field_41074.size() != this.field_41075.field_18857) {
         return null;
      } else {
         class_3872 var4 = class_3364.method_15408(this.field_41075, this.field_41074.<byte[]>toArray(new byte[this.field_41074.size()][]));
         this.method_36447();
         return var4;
      }
   }

   public void method_36447() {
      this.field_41075 = null;
      this.field_41074 = new ArrayList<byte[]>();
   }
}
