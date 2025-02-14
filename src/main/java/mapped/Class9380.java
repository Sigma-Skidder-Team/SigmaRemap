package mapped;

import java.util.Iterator;

public class Class9380<T> {
   private Class7678<T> field43526;
   private Class7678<T> field43527;
   private int field43528;

   public void method35593(Class7678<T> var1) {
      this.method35600(var1);
      if (!this.method35606()) {
         Class7678 var4 = this.field43526;
         Class7678.method25259(var1, var4);
         Class7678.method25260(var4, var1);
         this.field43526 = var1;
      } else {
         this.field43526 = var1;
         this.field43527 = var1;
      }

      Class7678.method25261(var1, this);
      this.field43528++;
   }

   public void method35594(Class7678<T> var1) {
      this.method35600(var1);
      if (!this.method35606()) {
         Class7678 var4 = this.field43527;
         Class7678.method25260(var1, var4);
         Class7678.method25259(var4, var1);
         this.field43527 = var1;
      } else {
         this.field43526 = var1;
         this.field43527 = var1;
      }

      Class7678.method25261(var1, this);
      this.field43528++;
   }

   public void method35595(Class7678<T> var1, Class7678<T> var2) {
      if (var1 != null) {
         if (var1 != this.field43527) {
            this.method35599(var1);
            this.method35600(var2);
            Class7678 var5 = var1.method25255();
            Class7678.method25259(var1, var2);
            Class7678.method25260(var2, var1);
            Class7678.method25260(var5, var2);
            Class7678.method25259(var2, var5);
            Class7678.method25261(var2, this);
            this.field43528++;
         } else {
            this.method35594(var2);
         }
      } else {
         this.method35593(var2);
      }
   }

   public Class7678<T> method35596(Class7678<T> var1) {
      this.method35599(var1);
      Class7678 var4 = var1.method25254();
      Class7678 var5 = var1.method25255();
      if (var4 == null) {
         this.field43526 = var5;
      } else {
         Class7678.method25259(var4, var5);
      }

      if (var5 == null) {
         this.field43527 = var4;
      } else {
         Class7678.method25260(var5, var4);
      }

      Class7678.method25260(var1, (Class7678)null);
      Class7678.method25259(var1, (Class7678)null);
      Class7678.method25261(var1, (Class9380)null);
      this.field43528--;
      return var1;
   }

   public void method35597(Class7678<T> var1, Class7678<T> var2) {
      this.method35596(var2);
      this.method35595(var1, var2);
   }

   public boolean method35598(Class7678<T> var1, Class7678<T> var2, Class7678<T> var3) {
      this.method35599(var2);
      if (var3 != null) {
         this.method35599(var3);
      }

      Class7678 var6;
      for (var6 = var2; var6 != null && var6 != var3; var6 = var6.method25255()) {
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

   private void method35599(Class7678<T> var1) {
      if (Class7678.method25262(var1) != this) {
         throw new IllegalArgumentException("Node has different parent, node: " + var1 + ", parent: " + Class7678.method25262(var1) + ", this: " + this);
      }
   }

   private void method35600(Class7678<T> var1) {
      if (Class7678.method25262(var1) != null) {
         throw new IllegalArgumentException("Node has different parent, node: " + var1 + ", parent: " + Class7678.method25262(var1) + ", this: " + this);
      }
   }

   public boolean method35601(Class7678<T> var1) {
      return Class7678.method25262(var1) == this;
   }

   public Iterator<Class7678<T>> method35602() {
      return new Class4540(this);
   }

   public Class7678<T> method35603() {
      return this.field43526;
   }

   public Class7678<T> method35604() {
      return this.field43527;
   }

   public int method35605() {
      return this.field43528;
   }

   public boolean method35606() {
      return this.field43528 <= 0;
   }

   @Override
   public String toString() {
      StringBuffer var3 = new StringBuffer();
      Iterator var4 = this.method35602();

      while (var4.hasNext()) {
         Class7678 var5 = (Class7678)var4.next();
         if (var3.length() > 0) {
            var3.append(", ");
         }

         var3.append(var5.method25253());
      }

      return "" + this.field43528 + " [" + var3.toString() + "]";
   }
}
