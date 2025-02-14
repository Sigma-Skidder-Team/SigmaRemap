package mapped;

public class Class8697 {
   private int field39256 = -1;
   private int field39257 = 0;
   private Class7678<Class8697> field39258 = new Class7678<Class8697>(this);

   public int method31335() {
      return this.field39256;
   }

   public int method31336() {
      return this.field39257;
   }

   public int method31337() {
      return this.field39256 + this.field39257;
   }

   public void method31338(int var1) {
      this.field39256 = var1;
   }

   public void method31339(int var1) {
      this.field39257 = var1;
   }

   public Class7678<Class8697> method31340() {
      return this.field39258;
   }

   public Class8697 method31341() {
      Class7678 var3 = this.field39258.method25254();
      return var3 != null ? (Class8697)var3.method25253() : null;
   }

   public Class8697 method31342() {
      Class7678 var3 = this.field39258.method25255();
      return var3 != null ? (Class8697)var3.method25253() : null;
   }

   @Override
   public String toString() {
      return "" + this.field39256 + "/" + this.field39257 + "/" + (this.field39256 + this.field39257);
   }
}
