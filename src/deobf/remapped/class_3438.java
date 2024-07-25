package remapped;

public class class_3438 extends class_535 {
   private String field_16908;

   public class_3438(String var1) {
      this.field_16908 = var1;
   }

   @Override
   public Class<?> method_20239(String var1) throws ClassNotFoundException {
      if (var1.indexOf(46) < 0) {
         try {
            return Class.forName(this.field_16908 + "." + var1);
         } catch (ClassNotFoundException var5) {
         }
      }

      return super.method_20239(var1);
   }
}
