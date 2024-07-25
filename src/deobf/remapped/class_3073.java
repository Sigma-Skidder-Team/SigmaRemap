package remapped;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class class_3073 {
   private static String[] field_15092;
   private class_5371 field_15103;
   private Function<class_2522, class_1513> field_15093;
   private boolean field_15096 = true;
   private class_4618 field_15095 = class_4618.field_22448;
   private ToIntFunction<class_2522> field_15102 = var0 -> 0;
   private float field_15106;
   private float field_15100;
   private boolean field_15104;
   private boolean field_15099;
   private float field_15089 = 0.6F;
   private float field_15105 = 1.0F;
   private float field_15109 = 1.0F;
   private class_4639 field_15108;
   private boolean field_15110 = true;
   private boolean field_15111;
   private class_9778<class_6629<?>> field_15101 = (var0, var1x, var2x, var3) -> var0.method_8308(var1x, var2x, class_240.field_817) && var0.method_8339() < 14;
   private class_5199 field_15107 = (var0, var1x, var2x) -> var0.method_8362().method_24498() && var0.method_8306(var1x, var2x);
   private class_5199 field_15097 = (var1x, var2x, var3) -> this.field_15103.method_24502() && var1x.method_8306(var2x, var3);
   private class_5199 field_15094 = this.field_15097;
   private class_5199 field_15091 = (var0, var1x, var2x) -> false;
   private class_5199 field_15090 = (var0, var1x, var2x) -> false;
   private boolean field_15098;

   private class_3073(class_5371 var1, class_1513 var2) {
      this(var1, var1x -> var2);
   }

   private class_3073(class_5371 var1, Function<class_2522, class_1513> var2) {
      this.field_15103 = var1;
      this.field_15093 = var2;
   }

   public static class_3073 method_14056(class_5371 var0) {
      return method_14058(var0, var0.method_24501());
   }

   public static class_3073 method_14059(class_5371 var0, class_9077 var1) {
      return method_14058(var0, var1.method_41787());
   }

   public static class_3073 method_14058(class_5371 var0, class_1513 var1) {
      return new class_3073(var0, var1);
   }

   public static class_3073 method_14057(class_5371 var0, Function<class_2522, class_1513> var1) {
      return new class_3073(var0, var1);
   }

   public static class_3073 method_14094(class_2353 var0) {
      class_3073 var3 = new class_3073(var0.field_11820, var0.field_11821.field_15093);
      var3.field_15103 = var0.field_11821.field_15103;
      var3.field_15100 = var0.field_11821.field_15100;
      var3.field_15106 = var0.field_11821.field_15106;
      var3.field_15096 = var0.field_11821.field_15096;
      var3.field_15099 = var0.field_11821.field_15099;
      var3.field_15102 = var0.field_11821.field_15102;
      var3.field_15093 = var0.field_11821.field_15093;
      var3.field_15095 = var0.field_11821.field_15095;
      var3.field_15089 = var0.field_11821.field_15089;
      var3.field_15105 = var0.field_11821.field_15105;
      var3.field_15098 = var0.field_11821.field_15098;
      var3.field_15110 = var0.field_11821.field_15110;
      var3.field_15111 = var0.field_11821.field_15111;
      var3.field_15104 = var0.field_11821.field_15104;
      return var3;
   }

   public class_3073 method_14077() {
      this.field_15096 = false;
      this.field_15110 = false;
      return this;
   }

   public class_3073 method_14054() {
      this.field_15110 = false;
      return this;
   }

   public class_3073 method_14049(float var1) {
      this.field_15089 = var1;
      return this;
   }

   public class_3073 method_14083(float var1) {
      this.field_15105 = var1;
      return this;
   }

   public class_3073 method_14084(float var1) {
      this.field_15109 = var1;
      return this;
   }

   public class_3073 method_14061(class_4618 var1) {
      this.field_15095 = var1;
      return this;
   }

   public class_3073 method_14068(ToIntFunction<class_2522> var1) {
      this.field_15102 = var1;
      return this;
   }

   public class_3073 method_14097(float var1, float var2) {
      this.field_15100 = var1;
      this.field_15106 = Math.max(0.0F, var2);
      return this;
   }

   public class_3073 method_14060() {
      return this.method_14096(0.0F);
   }

   public class_3073 method_14096(float var1) {
      this.method_14097(var1, var1);
      return this;
   }

   public class_3073 method_14055() {
      this.field_15099 = true;
      return this;
   }

   public class_3073 method_14050() {
      this.field_15098 = true;
      return this;
   }

   public class_3073 method_14095() {
      this.field_15108 = class_5931.field_30157;
      return this;
   }

   public class_3073 method_14066(class_6414 var1) {
      this.field_15108 = var1.method_10786();
      return this;
   }

   public class_3073 method_14074() {
      this.field_15111 = true;
      return this;
   }

   public class_3073 method_14087(class_9778<class_6629<?>> var1) {
      this.field_15101 = var1;
      return this;
   }

   public class_3073 method_14051(class_5199 var1) {
      this.field_15107 = var1;
      return this;
   }

   public class_3073 method_14067(class_5199 var1) {
      this.field_15097 = var1;
      return this;
   }

   public class_3073 method_14098(class_5199 var1) {
      this.field_15094 = var1;
      return this;
   }

   public class_3073 method_14071(class_5199 var1) {
      this.field_15091 = var1;
      return this;
   }

   public class_3073 method_14079(class_5199 var1) {
      this.field_15090 = var1;
      return this;
   }

   public class_3073 method_14052() {
      this.field_15104 = true;
      return this;
   }
}
