package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class8438 {
   private static String[] field36151;
   private List<Class9108> field36152 = new ArrayList<Class9108>();
   private Class2097 field36153 = Class2097.field13663;
   private boolean field36154 = false;
   private boolean field36155 = false;
   private boolean field36156 = false;

   public Class8438(Class9108 var1) {
      this.field36152.add(var1.method33962(this.method29650().method33962(this.method29650())));
      this.field36152.add(var1.method33962(this.method29650()));
      this.field36152.add(var1);
   }

   private Class9108 method29650() {
      return Class8437.method29649(this.field36153);
   }

   public void method29651() {
      Class9108 var3 = this.field36152.get(0).method33962(this.method29650());
      this.field36156 = this.field36152.contains(var3);
      this.field36152.add(0, var3);
      if (!this.field36155) {
         this.field36152.remove(this.field36152.size() - 1);
      }

      this.field36154 = false;
      this.field36155 = false;
   }

   public void method29652() {
      this.field36155 = true;
   }

   public void method29653(Class2097 var1) {
      Class9108 var4 = Class8437.method29649(var1).method33962(Class8437.method29649(this.field36153));
      if ((var4.field41839 != 0 || var4.field41840 != 0) && var1 != this.field36153 && !this.field36154) {
         this.field36153 = var1;
         this.field36154 = true;
      }
   }

   public boolean method29654() {
      return this.field36156;
   }

   public List<Class9108> method29655() {
      return this.field36152;
   }

   public boolean method29656(Class9108 var1) {
      return var1 != null ? this.field36152.contains(var1) : true;
   }
}
