package remapped;

import java.util.function.Predicate;

public class class_5668 extends class_1820 {
   private static String[] field_28743;
   private final Predicate<class_423> field_28742;
   public int field_28741;
   public int field_28744 = -1;
   public int field_28745 = -1;

   public class_5668(MobEntity var1, Predicate<class_423> var2) {
      super(var1);
      this.field_28742 = var2;
   }

   public class_5668(MobEntity var1, int var2, Predicate<class_423> var3) {
      this(var1, var3);
      this.field_28745 = var2;
   }

   public int method_25652() {
      return Math.max(240, this.field_28745);
   }

   @Override
   public boolean method_16795() {
      if (super.method_16795()) {
         return !this.field_9241.world.method_29537().method_1285(class_291.field_1047)
            ? false
            : this.method_25653(this.field_9241.world.method_43370()) && !this.method_8057();
      } else {
         return false;
      }
   }

   @Override
   public void method_16796() {
      super.method_16796();
      this.field_28741 = 0;
   }

   @Override
   public boolean method_16799() {
      return this.field_28741 <= this.method_25652()
         && !this.method_8057()
         && this.field_9240.method_12170(this.field_9241.method_37245(), 2.0)
         && this.method_25653(this.field_9241.world.method_43370());
   }

   @Override
   public void method_16793() {
      super.method_16793();
      this.field_9241.world.method_29568(this.field_9241.method_37145(), this.field_9240, -1);
   }

   @Override
   public void method_16794() {
      super.method_16794();
      if (this.field_9241.method_26594().nextInt(20) == 0) {
         this.field_9241.world.method_43364(1019, this.field_9240, 0);
         if (!this.field_9241.field_29599) {
            this.field_9241.method_26597(this.field_9241.method_26500());
         }
      }

      this.field_28741++;
      int var3 = (int)((float)this.field_28741 / (float)this.method_25652() * 10.0F);
      if (var3 != this.field_28744) {
         this.field_9241.world.method_29568(this.field_9241.method_37145(), this.field_9240, var3);
         this.field_28744 = var3;
      }

      if (this.field_28741 == this.method_25652() && this.method_25653(this.field_9241.world.method_43370())) {
         this.field_9241.world.method_7508(this.field_9240, false);
         this.field_9241.world.method_43364(1021, this.field_9240, 0);
         this.field_9241.world.method_43364(2001, this.field_9240, class_6414.method_29285(this.field_9241.world.method_28262(this.field_9240)));
      }
   }

   private boolean method_25653(class_423 var1) {
      return this.field_28742.test(var1);
   }
}
