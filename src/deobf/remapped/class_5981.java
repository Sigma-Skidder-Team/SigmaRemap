package remapped;

public class class_5981 extends class_9128 {
   public class_5981() {
      super(class_5664.field_28714, "AntiBot", "Avoid the client to focus bots.");
      this.method_42010(new class_2826("Mode", "Mode", 0, "Advanced", "Hypixel").method_23029(var1 -> this.method_27290()));
   }

   @Override
   public void method_42012() {
      if (this.method_42015()) {
         this.method_27290();
      }
   }

   @Override
   public void method_42006() {
      this.method_27290();
   }

   @Override
   public void method_42020() {
      class_727.method_3328().method_3331().field_21538 = null;
      class_727.method_3328().method_3331().field_21536.clear();
   }

   private void method_27290() {
      class_727.method_3328().method_3331().field_21536.clear();
      String var3 = this.method_42016("Mode");
      switch (var3) {
         case "Advanced":
            class_727.method_3328().method_3331().field_21538 = new class_1590();
            break;
         case "Hypixel":
            class_727.method_3328().method_3331().field_21538 = new class_1911();
      }
   }
}
