package remapped;

import java.util.List;

public class class_6474<T extends class_5886 & class_6250> extends class_3599 {
   private static String[] field_32996;
   private final T field_32994;
   private final boolean field_32995;
   private int field_32997;

   public class_6474(T var1, boolean var2) {
      this.field_32994 = (T)var1;
      this.field_32995 = var2;
   }

   @Override
   public boolean method_16795() {
      return this.field_32994.world.method_29537().method_1285(class_291.field_1039) && this.method_29486();
   }

   private boolean method_29486() {
      return this.field_32994.method_26531() != null
         && this.field_32994.method_26531().method_37387() == class_6629.field_34300
         && this.field_32994.method_26577() > this.field_32997;
   }

   @Override
   public void method_16796() {
      this.field_32997 = this.field_32994.method_26577();
      this.field_32994.method_28536();
      if (this.field_32995) {
         this.method_29487().stream().filter(var1 -> var1 != this.field_32994).<class_6250>map(var0 -> (class_6250)var0).forEach(class_6250::method_28536);
      }

      super.method_16796();
   }

   private List<class_5886> method_29487() {
      double var3 = this.field_32994.method_26575(class_7331.field_37471);
      class_4092 var5 = class_4092.method_18911(this.field_32994.method_37245()).method_18899(var3, 10.0, var3);
      return this.field_32994.world.<class_5886>method_25874((Class<? extends class_5886>)this.field_32994.getClass(), var5);
   }
}
