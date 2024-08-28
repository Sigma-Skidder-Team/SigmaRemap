package mapped;

public abstract class Class7255 {
   private Class9757 field31129;
   private Class2512 field31130;
   public Class2512 field31131;
   private Class<? extends Object> field31132;
   private boolean field31133;
   public boolean field31134;
   public Boolean field31135;

   public Class7255(Class9757 var1, Class2512 var2, Class2512 var3) {
      this.method22783(var1);
      this.field31130 = var2;
      this.field31131 = var3;
      this.field31132 = Object.class;
      this.field31133 = false;
      this.field31134 = true;
      this.field31135 = null;
   }

   public Class9757 method22780() {
      return this.field31129;
   }

   public Class2512 method22781() {
      return this.field31131;
   }

   public abstract Class2048 method22769();

   public Class2512 method22782() {
      return this.field31130;
   }

   public void method22783(Class9757 var1) {
      if (var1 != null) {
         this.field31129 = var1;
      } else {
         throw new NullPointerException("tag in a Node is required.");
      }
   }

   @Override
   public final boolean equals(Object var1) {
      return super.equals(var1);
   }

   public Class<? extends Object> method22784() {
      return this.field31132;
   }

   public void method22785(Class<? extends Object> var1) {
      if (!var1.isAssignableFrom(this.field31132)) {
         this.field31132 = var1;
      }
   }

   public void method22786(boolean var1) {
      this.field31133 = var1;
   }

   public boolean method22787() {
      return this.field31133;
   }

   @Override
   public final int hashCode() {
      return super.hashCode();
   }

   public boolean method22788() {
      if (this.field31135 != null) {
         return this.field31135;
      } else {
         return !this.field31129.method38338() && this.field31134 && !Object.class.equals(this.field31132) && !this.field31129.equals(Class9757.field45641)
            ? true
            : this.field31129.method38342(this.method22784());
      }
   }

   public void method22789(Boolean var1) {
      this.field31135 = var1;
   }
}
