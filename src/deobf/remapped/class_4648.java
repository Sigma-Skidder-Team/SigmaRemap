package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_4648 extends class_1080 {
   private static final class_7821<String> field_22685 = class_8073.<String>method_36641(class_4648.class, class_2734.field_13349);
   private static final class_7821<ITextComponent> field_22682 = class_8073.<ITextComponent>method_36641(class_4648.class, class_2734.field_13355);
   private final class_8116 field_22683 = new class_3444(this);
   private int field_22684;

   public class_4648(class_6629<? extends class_4648> var1, World var2) {
      super(var1, var2);
   }

   public class_4648(World var1, double var2, double var4, double var6) {
      super(class_6629.field_34254, var1, var2, var4, var6);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.method_37372().method_36634(field_22685, "");
      this.method_37372().method_36634(field_22682, StringTextComponent.EMPTY);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.field_22683.method_36924(var1);
      this.method_37372().method_36633(field_22685, this.method_21499().method_36920());
      this.method_37372().method_36633(field_22682, this.method_21499().method_36928());
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      this.field_22683.method_36938(var1);
   }

   @Override
   public class_3481 method_4737() {
      return class_3481.field_17069;
   }

   @Override
   public class_2522 method_4752() {
      return class_4783.field_23730.method_29260();
   }

   public class_8116 method_21499() {
      return this.field_22683;
   }

   @Override
   public void method_4758(int var1, int var2, int var3, boolean var4) {
      if (var4 && this.field_41697 - this.field_22684 >= 4) {
         this.method_21499().method_36922(this.field_41768);
         this.field_22684 = this.field_41697;
      }
   }

   @Override
   public class_6910 method_37128(class_704 var1, class_2584 var2) {
      return this.field_22683.method_36933(var1);
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      super.method_37191(var1);
      if (field_22682.equals(var1)) {
         try {
            this.field_22683.method_36937(this.method_37372().<ITextComponent>method_36640(field_22682));
         } catch (Throwable var5) {
         }
      } else if (field_22685.equals(var1)) {
         this.field_22683.method_36930(this.method_37372().<String>method_36640(field_22685));
      }
   }

   @Override
   public boolean method_37131() {
      return true;
   }
}
