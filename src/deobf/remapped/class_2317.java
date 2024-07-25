package remapped;

import java.io.IOException;

public class class_2317 implements Packet<class_1243> {
   private static String[] field_11606;
   private int field_11607;
   private Action field_11608;
   private int field_11609;

   public class_2317() {
   }

   public class_2317(Entity var1, Action var2) {
      this(var1, var2, 0);
   }

   public class_2317(Entity var1, Action var2, int var3) {
      this.field_11607 = var1.method_37145();
      this.field_11608 = var2;
      this.field_11609 = var3;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_11607 = var1.method_37778();
      this.field_11608 = var1.<Action>method_37787(Action.class);
      this.field_11609 = var1.method_37778();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_11607);
      var1.method_37750(this.field_11608);
      var1.method_37743(this.field_11609);
   }

   public void method_10653(class_1243 var1) {
      var1.method_5575(this);
   }

   public Action method_10650() {
      return this.field_11608;
   }

   public int method_10652() {
      return this.field_11609;
   }
}
