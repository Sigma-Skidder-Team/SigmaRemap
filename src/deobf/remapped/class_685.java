package remapped;

import java.io.IOException;
import javax.annotation.Nullable;

public class class_685 implements class_6310<class_1243> {
   private static String[] field_3771;
   private int field_3770;
   private String field_3769;
   private boolean field_3772;

   public class_685() {
   }

   public class_685(int var1, String var2, boolean var3) {
      this.field_3770 = var1;
      this.field_3769 = var2;
      this.field_3772 = var3;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_3770 = var1.method_37778();
      this.field_3769 = var1.method_37784(32767);
      this.field_3772 = var1.readBoolean();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_3770);
      var1.method_37760(this.field_3769);
      var1.writeBoolean(this.field_3772);
   }

   public void method_3103(class_1243 var1) {
      var1.method_5555(this);
   }

   @Nullable
   public class_8116 method_3102(World var1) {
      Entity var4 = var1.method_29534(this.field_3770);
      return !(var4 instanceof class_4648) ? null : ((class_4648)var4).method_21499();
   }

   public String method_3101() {
      return this.field_3769;
   }

   public boolean method_3105() {
      return this.field_3772;
   }
}
