package remapped;

public class class_7926 extends class_8894<class_7926> {
   public class_7926(String var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public class_7926 method_35840() {
      try {
         this.field_45622.setDoOutput(true);
         this.field_45622.setRequestMethod("DELETE");
         this.field_45622.connect();
         return this;
      } catch (Exception var4) {
         throw new class_8647(var4.getMessage(), var4);
      }
   }
}
