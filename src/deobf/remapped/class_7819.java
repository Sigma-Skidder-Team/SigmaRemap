package remapped;

public abstract class class_7819 extends class_8990 {
   private int field_39665;

   public class_7819(EntityType<? extends class_7819> var1, World var2) {
      super(var1, var2);
   }

   public boolean method_35416(class_9359 var1) {
      CompoundNBT var4 = new CompoundNBT();
      var4.method_25941("id", this.method_37271());
      this.method_37258(var4);
      if (!var1.method_3225(var4)) {
         return false;
      } else {
         this.method_37204();
         return true;
      }
   }

   @Override
   public void method_37123() {
      this.field_39665++;
      super.method_37123();
   }

   public boolean method_35417() {
      return this.field_39665 > 100;
   }
}
