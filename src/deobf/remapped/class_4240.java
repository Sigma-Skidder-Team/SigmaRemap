package remapped;

import java.util.stream.Stream;

public abstract class class_4240 extends class_2840<class_3930> implements AutoCloseable {
   private final class_8359 field_20575;
   private final String field_20576;

   public class_4240(TextureManager var1, Identifier var2, String var3) {
      this.field_20576 = var3;
      this.field_20575 = new class_8359(var2);
      var1.method_35682(this.field_20575.method_38519(), this.field_20575);
   }

   public abstract Stream<Identifier> method_19778();

   public class_5155 method_19780(Identifier var1) {
      return this.field_20575.method_38528(this.method_19779(var1));
   }

   private Identifier method_19779(Identifier var1) {
      return new Identifier(var1.method_21461(), this.field_20576 + "/" + var1.method_21456());
   }

   public class_3930 method_19781(class_7832 var1, class_3492 var2) {
      var2.method_16059();
      var2.method_16056("stitching");
      class_3930 var5 = this.field_20575.method_38516(var1, this.method_19778().<Identifier>map(this::method_19779), var2, 0);
      var2.method_16054();
      var2.method_16052();
      return var5;
   }

   public void method_19777(class_3930 var1, class_7832 var2, class_3492 var3) {
      var3.method_16059();
      var3.method_16056("upload");
      this.field_20575.method_38520(var1);
      var3.method_16054();
      var3.method_16052();
   }

   @Override
   public void close() {
      this.field_20575.method_38518();
   }
}
