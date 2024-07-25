package remapped;

import java.io.IOException;
import net.minecraft.util.text.ITextComponent;

public class class_3299 implements class_6310<class_392> {
   private static String[] field_16322;
   private class_7357 field_16325;
   private ITextComponent field_16324;
   private int field_16323;
   private int field_16320;
   private int field_16321;

   public class_3299() {
   }

   public class_3299(class_7357 var1, ITextComponent var2) {
      this(var1, var2, -1, -1, -1);
   }

   public class_3299(int var1, int var2, int var3) {
      this(class_7357.field_37605, (ITextComponent)null, var1, var2, var3);
   }

   public class_3299(class_7357 var1, ITextComponent var2, int var3, int var4, int var5) {
      this.field_16325 = var1;
      this.field_16324 = var2;
      this.field_16323 = var3;
      this.field_16320 = var4;
      this.field_16321 = var5;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_16325 = var1.<class_7357>method_37787(class_7357.class);
      if (this.field_16325 == class_7357.field_37609 || this.field_16325 == class_7357.field_37607 || this.field_16325 == class_7357.field_37610) {
         this.field_16324 = var1.method_37776();
      }

      if (this.field_16325 == class_7357.field_37605) {
         this.field_16323 = var1.readInt();
         this.field_16320 = var1.readInt();
         this.field_16321 = var1.readInt();
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37750(this.field_16325);
      if (this.field_16325 == class_7357.field_37609 || this.field_16325 == class_7357.field_37607 || this.field_16325 == class_7357.field_37610) {
         var1.method_37779(this.field_16324);
      }

      if (this.field_16325 == class_7357.field_37605) {
         var1.writeInt(this.field_16323);
         var1.writeInt(this.field_16320);
         var1.writeInt(this.field_16321);
      }
   }

   public void method_15126(class_392 var1) {
      var1.method_1950(this);
   }

   public class_7357 method_15125() {
      return this.field_16325;
   }

   public ITextComponent method_15124() {
      return this.field_16324;
   }

   public int method_15123() {
      return this.field_16323;
   }

   public int method_15121() {
      return this.field_16320;
   }

   public int method_15127() {
      return this.field_16321;
   }
}
