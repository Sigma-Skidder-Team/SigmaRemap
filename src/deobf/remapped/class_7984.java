package remapped;

import java.util.List;

public class class_7984 extends class_2233<class_8473> {
   private List<class_8473> field_40893;
   private boolean field_40894 = false;

   public class_7984(class_9592 var1, boolean var2, List<class_8473> var3, class_404 var4, class_404 var5, class_435 var6) {
      super(var1, var4, var5, var6);
      if (var3 != null) {
         this.field_40893 = var3;
         this.field_8429 = var2;
      } else {
         throw new NullPointerException("value in a Node is required.");
      }
   }

   public class_7984(class_9592 var1, List<class_8473> var2, class_435 var3) {
      this(var1, true, var2, null, null, var3);
   }

   @Override
   public class_99 method_7221() {
      return class_99.field_233;
   }

   @Override
   public List<class_8473> method_10282() {
      return this.field_40893;
   }

   public void method_36234(List<class_8473> var1) {
      this.field_40893 = var1;
   }

   public void method_36233(Class<? extends Object> var1) {
      for (class_8473 var5 : this.field_40893) {
         var5.method_38998().method_7226(var1);
      }
   }

   public void method_36235(Class<? extends Object> var1, Class<? extends Object> var2) {
      for (class_8473 var6 : this.field_40893) {
         var6.method_38999().method_7226(var2);
         var6.method_38998().method_7226(var1);
      }
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder();

      for (class_8473 var6 : this.method_10282()) {
         var3.append("{ key=");
         var3.append(var6.method_38998());
         var3.append("; value=");
         if (!(var6.method_38999() instanceof class_2233)) {
            var3.append(var6.toString());
         } else {
            var3.append(System.identityHashCode(var6.method_38999()));
         }

         var3.append(" }");
      }

      String var5 = var3.toString();
      return "<" + this.getClass().getName() + " (tag=" + this.method_7232() + ", values=" + var5 + ")>";
   }

   public void method_36232(boolean var1) {
      this.field_40894 = var1;
   }

   public boolean method_36231() {
      return this.field_40894;
   }
}
