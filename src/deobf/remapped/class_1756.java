package remapped;

import java.util.Optional;

public class class_1756 implements class_7978 {
   private static String[] field_9021;

   public void method_7850(class_1455 var1, class_9371 var2, class_5531 var3) throws Exception {
      this.method_7852(var1);
      if (this.method_7853()) {
         this.method_7856(var1).method_20476(var2, var3);
      }
   }

   public Optional<class_5531> method_7857(class_1455 var1, class_9371 var2) throws Exception {
      this.method_7852(var1);
      return !this.method_7853() ? Optional.<class_5531>empty() : this.method_7856(var1).method_20477(var2);
   }

   public void method_7854(class_1455 var1, int var2, int var3) throws Exception {
      this.method_7852(var1);
      if (this.method_7853()) {
         this.method_7856(var1).method_20479(var2, var3);
      }
   }

   private class_4398 method_7856(class_1455 var1) {
      return var1.<class_4398>method_6746(class_4398.class);
   }

   public void method_7849(class_1455 var1) throws Exception {
      if (this.method_7853()) {
         class_5051 var4 = new class_5051(27, null, var1);
         var4.method_23236(class_8039.field_41179, var1.<class_1189>method_6746(class_1189.class).method_5246());
         var4.method_23236(class_8039.field_41133, (byte)26);
         var4.method_23233(class_6890.class);
         var1.<class_4398>method_6746(class_4398.class).method_20480(true);
      }
   }

   private void method_7852(class_1455 var1) throws Exception {
      if (this.method_7853()) {
         class_4398 var4 = this.method_7856(var1);
         if (!var4.method_20474()) {
            this.method_7849(var1);
         }
      }
   }

   public boolean method_7853() {
      return true;
   }

   public void method_7855(class_1455 var1) {
      if (this.method_7853()) {
         this.method_7856(var1).method_20475();
      }
   }
}
