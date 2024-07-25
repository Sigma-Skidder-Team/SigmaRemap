package remapped;

public class class_3559 extends JSONObjectImpl {
   public class_3559(String var1) {
      super(var1);
   }

   public void method_16547() {
      class_1235.field_6812.interrupt();
      class_1235.field_6812 = new Thread(new class_1235());
      class_1235.field_6812.start();
   }

   public boolean method_16546(String var1) {
      return var1.startsWith("pr") && var1.endsWith("um");
   }

   @Override
   public boolean method_5826(String var1) {
      boolean var4 = super.method_5826(var1);
      if (var4 && this.method_16546(var1)) {
         class_1235.field_6812.interrupt();
      } else if (this.method_16546(var1)) {
         this.method_16547();
      }

      return var4;
   }
}
