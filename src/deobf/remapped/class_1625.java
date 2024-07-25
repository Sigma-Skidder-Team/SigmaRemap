package remapped;

import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;

public class class_1625 implements Packet<class_392> {
   private String field_8460 = "";
   private String field_8462;
   private int field_8463;
   private class_9120 field_8461;

   public class_1625() {
   }

   public class_1625(class_9120 var1, String var2, String var3, int var4) {
      if (var1 != class_9120.field_46675 && var2 == null) {
         throw new IllegalArgumentException("Need an objective name");
      } else {
         this.field_8460 = var3;
         this.field_8462 = var2;
         this.field_8463 = var4;
         this.field_8461 = var1;
      }
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_8460 = var1.method_37784(40);
      this.field_8461 = var1.<class_9120>method_37787(class_9120.class);
      String var4 = var1.method_37784(16);
      this.field_8462 = !Objects.equals(var4, "") ? var4 : null;
      if (this.field_8461 != class_9120.field_46675) {
         this.field_8463 = var1.method_37778();
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37760(this.field_8460);
      var1.method_37750(this.field_8461);
      var1.method_37760(this.field_8462 != null ? this.field_8462 : "");
      if (this.field_8461 != class_9120.field_46675) {
         var1.method_37743(this.field_8463);
      }
   }

   public void method_7242(class_392 var1) {
      var1.method_1899(this);
   }

   public String method_7240() {
      return this.field_8460;
   }

   @Nullable
   public String method_7243() {
      return this.field_8462;
   }

   public int method_7238() {
      return this.field_8463;
   }

   public class_9120 method_7241() {
      return this.field_8461;
   }
}
