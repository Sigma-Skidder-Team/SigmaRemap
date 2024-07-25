package remapped;

import java.util.Iterator;

public class class_8161<T> {
   private class_2418<T> field_41809;
   private class_2418<T> field_41810;
   private int field_41811;

   public void method_37441(class_2418<T> var1) {
      this.method_37436(var1);
      if (!this.method_37449()) {
         class_2418 var4 = this.field_41809;
         class_2418.method_11026(var1, var4);
         class_2418.method_11032(var4, var1);
         this.field_41809 = var1;
      } else {
         this.field_41809 = var1;
         this.field_41810 = var1;
      }

      class_2418.method_11035(var1, this);
      this.field_41811++;
   }

   public void method_37446(class_2418<T> var1) {
      this.method_37436(var1);
      if (!this.method_37449()) {
         class_2418 var4 = this.field_41810;
         class_2418.method_11032(var1, var4);
         class_2418.method_11026(var4, var1);
         this.field_41810 = var1;
      } else {
         this.field_41809 = var1;
         this.field_41810 = var1;
      }

      class_2418.method_11035(var1, this);
      this.field_41811++;
   }

   public void method_37439(class_2418<T> var1, class_2418<T> var2) {
      if (var1 != null) {
         if (var1 != this.field_41810) {
            this.method_37444(var1);
            this.method_37436(var2);
            class_2418 var5 = var1.method_11027();
            class_2418.method_11026(var1, var2);
            class_2418.method_11032(var2, var1);
            class_2418.method_11032(var5, var2);
            class_2418.method_11026(var2, var5);
            class_2418.method_11035(var2, this);
            this.field_41811++;
         } else {
            this.method_37446(var2);
         }
      } else {
         this.method_37441(var2);
      }
   }

   public class_2418<T> method_37437(class_2418<T> var1) {
      this.method_37444(var1);
      class_2418 var4 = var1.method_11034();
      class_2418 var5 = var1.method_11027();
      if (var4 == null) {
         this.field_41809 = var5;
      } else {
         class_2418.method_11026(var4, var5);
      }

      if (var5 == null) {
         this.field_41810 = var4;
      } else {
         class_2418.method_11032(var5, var4);
      }

      class_2418.method_11032(var1, (class_2418)null);
      class_2418.method_11026(var1, (class_2418)null);
      class_2418.method_11035(var1, (class_8161)null);
      this.field_41811--;
      return var1;
   }

   public void method_37447(class_2418<T> var1, class_2418<T> var2) {
      this.method_37437(var2);
      this.method_37439(var1, var2);
   }

   public boolean method_37442(class_2418<T> var1, class_2418<T> var2, class_2418<T> var3) {
      this.method_37444(var2);
      if (var3 != null) {
         this.method_37444(var3);
      }

      class_2418 var6;
      for (var6 = var2; var6 != null && var6 != var3; var6 = var6.method_11027()) {
         if (var6 == var1) {
            return true;
         }
      }

      if (var6 == var3) {
         return false;
      } else {
         throw new IllegalArgumentException("Sublist is not linked, from: " + var2 + ", to: " + var3);
      }
   }

   private void method_37444(class_2418<T> var1) {
      if (class_2418.method_11031(var1) != this) {
         throw new IllegalArgumentException("Node has different parent, node: " + var1 + ", parent: " + class_2418.method_11031(var1) + ", this: " + this);
      }
   }

   private void method_37436(class_2418<T> var1) {
      if (class_2418.method_11031(var1) != null) {
         throw new IllegalArgumentException("Node has different parent, node: " + var1 + ", parent: " + class_2418.method_11031(var1) + ", this: " + this);
      }
   }

   public boolean method_37450(class_2418<T> var1) {
      return class_2418.method_11031(var1) == this;
   }

   public Iterator<class_2418<T>> method_37438() {
      return new class_3593(this);
   }

   public class_2418<T> method_37448() {
      return this.field_41809;
   }

   public class_2418<T> method_37440() {
      return this.field_41810;
   }

   public int method_37445() {
      return this.field_41811;
   }

   public boolean method_37449() {
      return this.field_41811 <= 0;
   }

   @Override
   public String toString() {
      StringBuffer var3 = new StringBuffer();
      Iterator var4 = this.method_37438();

      while (var4.hasNext()) {
         class_2418 var5 = (class_2418)var4.next();
         if (var3.length() > 0) {
            var3.append(", ");
         }

         var3.append(var5.method_11037());
      }

      return "" + this.field_41811 + " [" + var3.toString() + "]";
   }
}
