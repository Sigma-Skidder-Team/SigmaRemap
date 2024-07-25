package remapped;

import java.io.Serializable;
import java.util.ArrayList;

public class class_533 implements Serializable {
   private static String[] field_3241;
   private static final long field_3240 = 1L;
   private ArrayList field_3239 = new ArrayList();

   public int method_2590() {
      return this.field_3239.size();
   }

   public class_8074 method_2597(int var1) {
      return (class_8074)this.field_3239.get(var1);
   }

   public int method_2595(int var1) {
      return class_8074.method_36647(this.method_2597(var1));
   }

   public int method_2593(int var1) {
      return class_8074.method_36648(this.method_2597(var1));
   }

   public void method_2594(int var1, int var2) {
      this.field_3239.add(new class_8074(this, var1, var2));
   }

   public void method_2592(int var1, int var2) {
      this.field_3239.add(0, new class_8074(this, var1, var2));
   }

   public boolean method_2596(int var1, int var2) {
      return this.field_3239.contains(new class_8074(this, var1, var2));
   }
}
