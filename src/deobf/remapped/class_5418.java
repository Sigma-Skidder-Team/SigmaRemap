package remapped;

import java.util.function.Function;

public class class_5418 {
   private final class_1685 field_27610;
   private class_4639 field_27609;

   public class_5418(class_8261 var1, class_1685 var2) {
      this.field_27611 = var1;
      this.field_27610 = var2;
   }

   public class_5418 method_24630(class_6414 var1, class_7701 var2) {
      this.field_27609 = var2.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_8261.method_37929(this.field_27611).accept(class_8261.method_38041(var1, this.field_27609));
      return this;
   }

   public class_5418 method_24632(Function<class_1685, class_4639> var1) {
      this.field_27609 = (class_4639)var1.apply(this.field_27610);
      return this;
   }

   public class_5418 method_24634(class_6414 var1) {
      class_4639 var4 = class_9590.field_48858.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_4639 var5 = class_9590.field_48855.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_8261.method_37929(this.field_27611).accept(class_8261.method_37918(var1, var4, var5));
      class_4639 var6 = class_9590.field_48799.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_8261.method_37956(this.field_27611, var1, var6);
      return this;
   }

   public class_5418 method_24631(class_6414 var1) {
      class_4639 var4 = class_9590.field_48827.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_4639 var5 = class_9590.field_48774.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_4639 var6 = class_9590.field_48865.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_8261.method_37929(this.field_27611).accept(class_8261.method_38074(var1, var4, var5, var6));
      class_4639 var7 = class_9590.field_48864.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_8261.method_37956(this.field_27611, var1, var7);
      return this;
   }

   public class_5418 method_24629(class_6414 var1) {
      class_4639 var4 = class_9590.field_48783.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_4639 var5 = class_9590.field_48860.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_8261.method_37929(this.field_27611).accept(class_8261.method_38066(var1, var4, var5));
      class_4639 var6 = class_9590.field_48810.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_8261.method_37956(this.field_27611, var1, var6);
      return this;
   }

   public class_5418 method_24633(class_6414 var1) {
      class_4639 var4 = class_9590.field_48819.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_4639 var5 = class_9590.field_48771.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_4639 var6 = class_9590.field_48828.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_4639 var7 = class_9590.field_48800.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_8261.method_37929(this.field_27611).accept(class_8261.method_37993(var1, var4, var5, var6, var7));
      return this;
   }

   public class_5418 method_24628(class_6414 var1) {
      class_4639 var4 = class_9590.field_48857.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_4639 var5 = class_9590.field_48818.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_8261.method_37929(this.field_27611).accept(class_8261.method_38036(var1, var4, var5));
      return this;
   }

   public class_5418 method_24637(class_6414 var1, class_6414 var2) {
      class_4639 var5 = class_9590.field_48844.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_8261.method_37929(this.field_27611).accept(class_8261.method_38041(var1, var5));
      class_8261.method_37929(this.field_27611).accept(class_8261.method_38041(var2, var5));
      class_8261.method_38067(this.field_27611, var1.method_10803());
      class_8261.method_38079(this.field_27611, var2);
      return this;
   }

   public class_5418 method_24635(class_6414 var1) {
      if (this.field_27609 != null) {
         class_4639 var4 = class_9590.field_48803.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
         class_4639 var5 = class_9590.field_48861.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
         class_8261.method_37929(this.field_27611).accept(class_8261.method_38003(var1, var4, var5, this.field_27609));
         return this;
      } else {
         throw new IllegalStateException("Full block not generated yet");
      }
   }

   public class_5418 method_24638(class_6414 var1) {
      class_4639 var4 = class_9590.field_48791.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_4639 var5 = class_9590.field_48787.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_4639 var6 = class_9590.field_48773.method_34883(var1, this.field_27610, class_8261.method_38027(this.field_27611));
      class_8261.method_37929(this.field_27611).accept(class_8261.method_38049(var1, var4, var5, var6));
      return this;
   }
}
