package remapped;

public abstract class class_7900 extends class_9446 {
   @Override
   public class_6098 method_43688(class_8743 var1, class_6098 var2) {
      class_6331 var5 = var1.method_40140();
      class_66 var6 = class_6451.method_29411(var1);
      Direction var7 = var1.method_40141().<Direction>method_10313(class_6451.field_32900);
      class_5783 var8 = this.method_35710(var5, var6, var2);
      var8.method_26161(
         (double)var7.method_1041(), (double)((float)var7.method_1054() + 0.1F), (double)var7.method_1034(), this.method_35711(), this.method_35709()
      );
      var5.method_7509(var8);
      var2.method_27970(1);
      return var2;
   }

   @Override
   public void method_43687(class_8743 var1) {
      var1.method_40140().method_43364(1002, var1.method_40142(), 0);
   }

   public abstract class_5783 method_35710(World var1, class_66 var2, class_6098 var3);

   public float method_35709() {
      return 6.0F;
   }

   public float method_35711() {
      return 1.1F;
   }
}
