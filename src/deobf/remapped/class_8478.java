package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class class_8478 {
   private class_9022 field_43450 = class_9022.field_46145;
   private class_6631 field_43447 = class_6631.field_34340;
   private BlockPos field_43446 = BlockPos.field_7306;
   private boolean field_43445;
   private class_2034 field_43443;
   private class_9616 field_43439;
   private boolean field_43441 = true;
   private Random field_43448;
   private int field_43444;
   private final List<class_2103> field_43440 = Lists.newArrayList();
   private boolean field_43438;
   private boolean field_43449;

   public class_8478 method_39047() {
      class_8478 var3 = new class_8478();
      var3.field_43450 = this.field_43450;
      var3.field_43447 = this.field_43447;
      var3.field_43446 = this.field_43446;
      var3.field_43445 = this.field_43445;
      var3.field_43443 = this.field_43443;
      var3.field_43439 = this.field_43439;
      var3.field_43441 = this.field_43441;
      var3.field_43448 = this.field_43448;
      var3.field_43444 = this.field_43444;
      var3.field_43440.addAll(this.field_43440);
      var3.field_43438 = this.field_43438;
      var3.field_43449 = this.field_43449;
      return var3;
   }

   public class_8478 method_39055(class_9022 var1) {
      this.field_43450 = var1;
      return this;
   }

   public class_8478 method_39053(class_6631 var1) {
      this.field_43447 = var1;
      return this;
   }

   public class_8478 method_39037(BlockPos var1) {
      this.field_43446 = var1;
      return this;
   }

   public class_8478 method_39045(boolean var1) {
      this.field_43445 = var1;
      return this;
   }

   public class_8478 method_39049(class_2034 var1) {
      this.field_43443 = var1;
      return this;
   }

   public class_8478 method_39051(class_9616 var1) {
      this.field_43439 = var1;
      return this;
   }

   public class_8478 method_39041(Random var1) {
      this.field_43448 = var1;
      return this;
   }

   public class_8478 method_39043(boolean var1) {
      this.field_43438 = var1;
      return this;
   }

   public class_8478 method_39035() {
      this.field_43440.clear();
      return this;
   }

   public class_8478 method_39048(class_2103 var1) {
      this.field_43440.add(var1);
      return this;
   }

   public class_8478 method_39033(class_2103 var1) {
      this.field_43440.remove(var1);
      return this;
   }

   public class_9022 method_39054() {
      return this.field_43450;
   }

   public class_6631 method_39056() {
      return this.field_43447;
   }

   public BlockPos method_39036() {
      return this.field_43446;
   }

   public Random method_39052(BlockPos var1) {
      if (this.field_43448 == null) {
         return var1 != null ? new Random(class_9299.method_42802(var1)) : new Random(Util.getMeasuringTimeMs());
      } else {
         return this.field_43448;
      }
   }

   public boolean method_39032() {
      return this.field_43445;
   }

   @Nullable
   public class_9616 method_39050() {
      if (this.field_43439 == null && this.field_43443 != null) {
         this.method_39038();
      }

      return this.field_43439;
   }

   public boolean method_39031() {
      return this.field_43438;
   }

   public List<class_2103> method_39034() {
      return this.field_43440;
   }

   public void method_39038() {
      if (this.field_43443 != null) {
         this.field_43439 = this.method_39042(this.field_43443);
      }
   }

   public boolean method_39040() {
      return this.field_43441;
   }

   public class_1673 method_39057(List<class_1673> var1, BlockPos var2) {
      int var5 = var1.size();
      if (var5 != 0) {
         return (class_1673)var1.get(this.method_39052(var2).nextInt(var5));
      } else {
         throw new IllegalStateException("No palettes");
      }
   }

   @Nullable
   private class_9616 method_39042(class_2034 var1) {
      if (var1 != null) {
         int var4 = var1.field_10328 * 16;
         int var5 = var1.field_10327 * 16;
         return new class_9616(var4, 0, var5, var4 + 16 - 1, 255, var5 + 16 - 1);
      } else {
         return this.field_43439;
      }
   }

   public class_8478 method_39044(boolean var1) {
      this.field_43449 = var1;
      return this;
   }

   public boolean method_39046() {
      return this.field_43449;
   }
}
