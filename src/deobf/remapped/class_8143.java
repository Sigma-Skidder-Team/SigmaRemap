package remapped;

import java.io.IOException;
import java.util.concurrent.Executor;

public abstract class class_8143 implements AutoCloseable {
   public int field_41691 = -1;
   public boolean field_41689;
   public boolean field_41690;
   public class_9510 field_41688;
   private boolean field_41687;
   private boolean field_41693;
   private boolean field_41692;

   public void method_37049(boolean var1, boolean var2) {
      class_3542.method_16431(class_3542::method_16440);
      if (!this.field_41687 || this.field_41689 != var1 || this.field_41690 != var2) {
         this.field_41687 = true;
         this.field_41689 = var1;
         this.field_41690 = var2;
         int var6;
         short var7;
         if (!var1) {
            int var5 = class_3111.method_14392();
            var6 = !var2 ? 9728 : var5;
            var7 = 9728;
         } else {
            var6 = !var2 ? 9729 : 9987;
            var7 = 9729;
         }

         class_1920.method_8791(this.method_37055());
         class_1920.method_8879(3553, 10241, var6);
         class_1920.method_8879(3553, 10240, var7);
      }
   }

   public int method_37055() {
      class_3542.method_16431(class_3542::method_16440);
      if (this.field_41691 == -1) {
         this.field_41691 = class_4970.method_22837();
      }

      return this.field_41691;
   }

   public void method_37052() {
      if (class_3542.method_16366()) {
         if (this.field_41691 != -1) {
            class_7977.method_36141(this, this.field_41691);
            this.field_41687 = false;
            class_4970.method_22838(this.field_41691);
            this.field_41691 = -1;
         }
      } else {
         class_3542.method_16474(() -> {
            class_7977.method_36141(this, this.field_41691);
            this.field_41687 = false;
            if (this.field_41691 != -1) {
               class_4970.method_22838(this.field_41691);
               this.field_41691 = -1;
            }
         });
      }
   }

   public abstract void method_37053(class_7832 var1) throws IOException;

   public void method_37048() {
      if (class_3542.method_16440()) {
         class_1920.method_8791(this.method_37055());
      } else {
         class_3542.method_16474(() -> class_1920.method_8791(this.method_37055()));
      }
   }

   public void method_37054(class_7889 var1, class_7832 var2, class_4639 var3, Executor var4) {
      var1.method_35682(var3, this);
   }

   @Override
   public void close() {
   }

   public class_9510 method_37050() {
      return class_7977.method_36164(this);
   }

   public void method_37056(boolean var1, boolean var2) {
      this.field_41693 = this.field_41689;
      this.field_41692 = this.field_41690;
      this.method_37049(var1, var2);
   }

   public void method_37057() {
      this.method_37049(this.field_41693, this.field_41692);
   }
}
