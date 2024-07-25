package remapped;

import java.util.ArrayList;
import java.util.HashMap;

public class class_4226 {
   private ArrayList field_20507 = new ArrayList();
   private HashMap field_20504 = new HashMap();
   private HashMap field_20505 = new HashMap();
   private HashMap field_20509 = new HashMap();
   private float field_20503;
   private float field_20508;

   public class_4226(float var1, float var2) {
      this.field_20503 = var1;
      this.field_20508 = var2;
   }

   public float method_19685() {
      return this.field_20503;
   }

   public float method_19680() {
      return this.field_20508;
   }

   public void method_19683(String var1, String var2) {
      this.field_20504.put(var1, var2);
   }

   public void method_19682(String var1, class_1993 var2) {
      this.field_20505.put(var1, var2);
   }

   public String method_19678(String var1) {
      return (String)this.field_20504.get(var1);
   }

   public class_1993 method_19681(String var1) {
      return (class_1993)this.field_20505.get(var1);
   }

   public String[] method_19679() {
      return this.field_20504.keySet().<String>toArray(new String[0]);
   }

   public class_384 method_19686(String var1) {
      return (class_384)this.field_20509.get(var1);
   }

   public void method_19675(class_384 var1) {
      this.field_20507.add(var1);
      this.field_20509.put(var1.method_1873().method_3518("id"), var1);
      String var4 = var1.method_1873().method_3514("fill");
      class_1993 var5 = this.method_19681(var4);
      if (var5 != null && var5.method_9248()) {
         for (int var6 = 0; var6 < class_8249.field_42342; var6++) {
            var1.method_1871().method_15234();
         }
      }
   }

   public int method_19684() {
      return this.field_20507.size();
   }

   public class_384 method_19676(int var1) {
      return (class_384)this.field_20507.get(var1);
   }

   public void method_19674(class_384 var1) {
      this.field_20507.remove(var1);
      this.field_20509.remove(var1.method_1873().method_3518("id"));
   }
}
