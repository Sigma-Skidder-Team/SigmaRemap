package remapped;

public class class_7947 extends class_6414 {
   private static String[] field_40672;
   public static final class_7360<class_9249> field_40671 = class_6023.field_30682;

   public class_7947(class_3073 var1) {
      super(var1);
      this.method_29284(this.method_29260().method_10308(field_40671, class_9249.field_47216));
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      switch (var2) {
         case field_34335:
         case field_34334:
            switch ((class_9249)var1.method_10313(field_40671)) {
               case field_47215:
                  return var1.method_10308(field_40671, class_9249.field_47219);
               case field_47219:
                  return var1.method_10308(field_40671, class_9249.field_47215);
               default:
                  return var1;
            }
         default:
            return var1;
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_40671);
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_10308(field_40671, var1.method_21857().method_1029());
   }
}
