package remapped;

import java.io.IOException;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_7214 implements Packet<class_392> {
   private static String[] field_37046;
   public class_2820 field_37049;
   public int field_37048;
   public int field_37050;
   public int field_37045;
   public ITextComponent field_37047;

   public class_7214() {
   }

   public class_7214(class_3435 var1, class_2820 var2) {
      this(var1, var2, StringTextComponent.EMPTY);
   }

   public class_7214(class_3435 var1, class_2820 var2, ITextComponent var3) {
      this.field_37049 = var2;
      class_5834 var6 = var1.method_15876();
      switch (var2) {
         case field_13847:
            this.field_37045 = var1.method_15866();
            this.field_37050 = var6 == null ? -1 : var6.method_37145();
            break;
         case field_13845:
            this.field_37048 = var1.method_15867().method_37145();
            this.field_37050 = var6 == null ? -1 : var6.method_37145();
            this.field_37047 = var3;
      }
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_37049 = var1.<class_2820>method_37787(class_2820.class);
      if (this.field_37049 != class_2820.field_13847) {
         if (this.field_37049 == class_2820.field_13845) {
            this.field_37048 = var1.method_37778();
            this.field_37050 = var1.readInt();
            this.field_37047 = var1.method_37776();
         }
      } else {
         this.field_37045 = var1.method_37778();
         this.field_37050 = var1.readInt();
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37750(this.field_37049);
      if (this.field_37049 != class_2820.field_13847) {
         if (this.field_37049 == class_2820.field_13845) {
            var1.method_37743(this.field_37048);
            var1.writeInt(this.field_37050);
            var1.method_37779(this.field_37047);
         }
      } else {
         var1.method_37743(this.field_37045);
         var1.writeInt(this.field_37050);
      }
   }

   public void method_33049(class_392 var1) {
      var1.method_1924(this);
   }

   @Override
   public boolean method_28774() {
      return this.field_37049 == class_2820.field_13845;
   }
}
