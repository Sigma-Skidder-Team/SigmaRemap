package remapped;

import java.io.IOException;
import javax.annotation.Nullable;

public class class_3398 implements Packet<class_1243> {
   private static String[] field_16737;
   private int field_16735;
   private class_92 field_16738;
   private class_1343 field_16734;
   private class_2584 field_16733;
   private boolean field_16736;

   public class_3398() {
   }

   public class_3398(Entity var1, boolean var2) {
      this.field_16735 = var1.method_37145();
      this.field_16738 = class_92.field_183;
      this.field_16736 = var2;
   }

   public class_3398(Entity var1, class_2584 var2, boolean var3) {
      this.field_16735 = var1.method_37145();
      this.field_16738 = class_92.field_185;
      this.field_16733 = var2;
      this.field_16736 = var3;
   }

   public class_3398(Entity var1, class_2584 var2, class_1343 var3, boolean var4) {
      this.field_16735 = var1.method_37145();
      this.field_16738 = class_92.field_184;
      this.field_16733 = var2;
      this.field_16734 = var3;
      this.field_16736 = var4;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_16735 = var1.method_37778();
      this.field_16738 = var1.<class_92>method_37787(class_92.class);
      if (this.field_16738 == class_92.field_184) {
         this.field_16734 = new class_1343((double)var1.readFloat(), (double)var1.readFloat(), (double)var1.readFloat());
      }

      if (this.field_16738 == class_92.field_185 || this.field_16738 == class_92.field_184) {
         this.field_16733 = var1.<class_2584>method_37787(class_2584.class);
      }

      this.field_16736 = var1.readBoolean();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_16735);
      var1.method_37750(this.field_16738);
      if (this.field_16738 == class_92.field_184) {
         var1.writeFloat((float)this.field_16734.field_7336);
         var1.writeFloat((float)this.field_16734.field_7333);
         var1.writeFloat((float)this.field_16734.field_7334);
      }

      if (this.field_16738 == class_92.field_185 || this.field_16738 == class_92.field_184) {
         var1.method_37750(this.field_16733);
      }

      var1.writeBoolean(this.field_16736);
   }

   public void method_15696(class_1243 var1) {
      var1.method_5551(this);
   }

   @Nullable
   public Entity method_15695(World var1) {
      return var1.method_29534(this.field_16735);
   }

   public class_92 method_15694() {
      return this.field_16738;
   }

   @Nullable
   public class_2584 method_15691() {
      return this.field_16733;
   }

   public class_1343 method_15697() {
      return this.field_16734;
   }

   public boolean method_15692() {
      return this.field_16736;
   }
}
