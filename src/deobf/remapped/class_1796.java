package remapped;

public class class_1796 implements Runnable {
   public class_1796(class_8177 var1) {
      this.field_9166 = var1;
   }

   @Override
   public void run() {
      class_1289.method_5741().fine(String.format("connect attempt timed out after %d", this.field_9166.field_41865));
      this.field_9166.field_41867.method_33626();
      this.field_9166.field_41864.method_5053();
      this.field_9166.field_41864.method_19325("error", new Object[]{new class_6434("timeout")});
      class_1289.method_5767(this.field_9166.field_41863, "connect_timeout", new Object[]{this.field_9166.field_41865});
   }
}
