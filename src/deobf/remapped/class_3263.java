package remapped;

import java.io.IOException;
import net.minecraft.util.text.ITextComponent;

public class class_3263 implements class_6310<class_392> {
   private static String[] field_16175;
   private String field_16174;
   private ITextComponent field_16173;
   private class_8792 field_16177;
   private int field_16176;

   public class_3263() {
   }

   public class_3263(class_4399 var1, int var2) {
      this.field_16174 = var1.method_20490();
      this.field_16173 = var1.method_20488();
      this.field_16177 = var1.method_20483();
      this.field_16176 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_16174 = var1.method_37784(16);
      this.field_16176 = var1.readByte();
      if (this.field_16176 == 0 || this.field_16176 == 2) {
         this.field_16173 = var1.method_37776();
         this.field_16177 = var1.<class_8792>method_37787(class_8792.class);
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37760(this.field_16174);
      var1.writeByte(this.field_16176);
      if (this.field_16176 == 0 || this.field_16176 == 2) {
         var1.method_37779(this.field_16173);
         var1.method_37750(this.field_16177);
      }
   }

   public void method_14885(class_392 var1) {
      var1.method_1940(this);
   }

   public String method_14884() {
      return this.field_16174;
   }

   public ITextComponent method_14886() {
      return this.field_16173;
   }

   public int method_14881() {
      return this.field_16176;
   }

   public class_8792 method_14883() {
      return this.field_16177;
   }
}
