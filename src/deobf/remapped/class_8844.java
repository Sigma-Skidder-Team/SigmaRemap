package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class class_8844 extends class_6414 {
   public final Direction field_45228;
   public final boolean field_45227;
   public final class_4190 field_45229;

   public class_8844(class_3073 var1, Direction var2, class_4190 var3, boolean var4) {
      super(var1);
      this.field_45228 = var2;
      this.field_45229 = var3;
      this.field_45227 = var4;
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_2522 var4 = var1.method_21862().method_28262(var1.method_21858().method_6098(this.field_45228));
      return !var4.method_8350(this.method_40682()) && !var4.method_8350(this.method_40683())
         ? this.method_40685(var1.method_21862())
         : this.method_40683().method_29260();
   }

   public class_2522 method_40685(class_9379 var1) {
      return this.method_29260();
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, BlockPos var3) {
      BlockPos var6 = var3.method_6098(this.field_45228.method_1046());
      class_2522 var7 = var2.method_28262(var6);
      class_6414 var8 = var7.method_8360();
      return !this.method_40684(var8) ? false : var8 == this.method_40682() || var8 == this.method_40683() || var7.method_8308(var2, var6, this.field_45228);
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      if (!var1.method_8309(var2, var3)) {
         var2.method_7510(var3, true);
      }
   }

   public boolean method_40684(class_6414 var1) {
      return true;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return this.field_45229;
   }

   public abstract class_6408 method_40682();

   public abstract class_6414 method_40683();
}
