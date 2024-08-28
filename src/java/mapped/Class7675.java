package mapped;

public class Class7675 {
   private boolean field32881;
   private int field32882;
   private float field32883;

   public Class7675() {
      this(false, 519, 0.0F);
   }

   public Class7675(boolean var1) {
      this(var1, 519, 0.0F);
   }

   public Class7675(boolean var1, int var2, float var3) {
      this.field32881 = var1;
      this.field32882 = var2;
      this.field32883 = var3;
   }

   public void method25207(boolean var1, int var2, float var3) {
      this.field32881 = var1;
      this.field32882 = var2;
      this.field32883 = var3;
   }

   public void method25208(Class7675 var1) {
      this.field32881 = var1.field32881;
      this.field32882 = var1.field32882;
      this.field32883 = var1.field32883;
   }

   public void method25209(int var1, float var2) {
      this.field32882 = var1;
      this.field32883 = var2;
   }

   public void method25210(boolean var1) {
      this.field32881 = var1;
   }

   public void method25211() {
      this.field32881 = true;
   }

   public void method25212() {
      this.field32881 = false;
   }

   public boolean method25213() {
      return this.field32881;
   }

   public int method25214() {
      return this.field32882;
   }

   public float method25215() {
      return this.field32883;
   }

   public void method25216() {
      if (this.field32881) {
         Class7414.method23696();
         Class7414.method23697(this.field32882, this.field32883);
      } else {
         Class7414.method23695();
      }
   }

   @Override
   public String toString() {
      return "enabled: " + this.field32881 + ", func: " + this.field32882 + ", ref: " + this.field32883;
   }
}
