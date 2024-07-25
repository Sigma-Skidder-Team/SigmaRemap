package remapped;

public abstract class class_958 extends class_3599 {
   private class_958(class_8829 var1) {
      this.field_4925 = var1;
   }

   public abstract boolean method_4213();

   public abstract boolean method_4214();

   @Override
   public boolean method_16795() {
      return this.method_4213() && !this.field_4925.method_28537();
   }

   @Override
   public boolean method_16799() {
      return this.method_4214() && !this.field_4925.method_28537();
   }
}
