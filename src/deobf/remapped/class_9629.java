package remapped;

import javax.annotation.Nullable;

public class class_9629 extends class_9310 {
   private int field_49042 = 47999;

   public class_9629(class_6629<? extends class_9629> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public boolean method_42975() {
      return true;
   }

   @Override
   public class_9310 method_42987() {
      return class_6629.field_34230.method_30484(this.field_41768);
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      var1.method_25931("DespawnDelay", this.field_49042);
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      if (var1.method_25939("DespawnDelay", 99)) {
         this.field_49042 = var1.method_25947("DespawnDelay");
      }
   }

   @Override
   public void method_26851() {
      super.method_26851();
      this.field_29916.method_3485(1, new class_518(this, 2.0));
      this.field_29908.method_3485(1, new class_3949(this, this));
   }

   @Override
   public void method_19039(class_704 var1) {
      Entity var4 = this.method_26922();
      if (!(var4 instanceof class_6862)) {
         super.method_19039(var1);
      }
   }

   @Override
   public void method_26606() {
      super.method_26606();
      if (!this.field_41768.field_33055) {
         this.method_44436();
      }
   }

   private void method_44436() {
      if (this.method_44438()) {
         this.field_49042 = !this.method_44439() ? this.field_49042 - 1 : ((class_6862)this.method_26922()).method_31487() - 1;
         if (this.field_49042 <= 0) {
            this.method_26916(true, false);
            this.method_37204();
         }
      }
   }

   private boolean method_44438() {
      return !this.method_19043() && !this.method_44437() && !this.method_37172();
   }

   private boolean method_44439() {
      return this.method_26922() instanceof class_6862;
   }

   private boolean method_44437() {
      return this.method_26920() && !this.method_44439();
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, class_5734 var5) {
      if (var3 == class_2417.field_12040) {
         this.method_8635(0);
      }

      if (var4 == null) {
         var4 = new class_1821(false);
      }

      return super.method_26864(var1, var2, var3, (class_8733)var4, var5);
   }
}
