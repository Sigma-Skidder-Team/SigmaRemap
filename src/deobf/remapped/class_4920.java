package remapped;

import java.io.IOException;

public class class_4920 extends class_1237 {
   private static String[] field_25465;
   private int field_25463;
   private int field_25462;
   private int field_25461;
   private boolean field_25466;
   private boolean field_25464;
   private boolean field_25468;
   private String field_25467;

   @Override
   public void method_5498(class_6041 var1) throws IOException {
      this.field_25463 = (int)var1.method_27524(2);
      int var4 = var1.method_27531();
      this.field_25466 = (var4 >> 7 & 1) == 1;
      this.field_25464 = (var4 >> 6 & 1) == 1;
      this.field_25462 = var4 & 31;
      if (!this.field_25466) {
         this.field_25461 = -1;
      } else {
         this.field_25461 = (int)var1.method_27524(2);
      }

      if (this.field_25464) {
         int var5 = var1.method_27531();
         this.field_25467 = var1.method_27533(var5);
      }

      this.method_5493(var1);
   }

   public int method_22534() {
      return this.field_25463;
   }

   public boolean method_22535() {
      return this.field_25466;
   }

   public int method_22531() {
      return this.field_25461;
   }

   public boolean method_22536() {
      return this.field_25464;
   }

   public String method_22532() {
      return this.field_25467;
   }

   public int method_22533() {
      return this.field_25462;
   }
}
