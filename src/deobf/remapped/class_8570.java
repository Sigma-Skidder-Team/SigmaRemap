package remapped;

import com.google.common.collect.ImmutableList;

public final class class_8570 {
   private final class_3771 field_43923;
   private final class_4298 field_43922;
   private final class_3899 field_43933;
   private final class_1594 field_43936;
   private final class_7017 field_43932;
   private final class_8385 field_43928;
   private final class_3754 field_43934;
   private final class_8384 field_43930;
   private final class_376 field_43937;
   private final class_4781 field_43931;
   private final class_9603 field_43935;
   private final class_6160 field_43925;
   private final class_4696 field_43926;
   private final class_7207 field_43938;
   private final class_8315 field_43924;
   private final class_3409 field_43929;
   private final ImmutableList<class_5348> field_43927;

   private class_8570(
      class_3771 var1,
      class_4298 var2,
      class_3899 var3,
      class_1594 var4,
      class_7017 var5,
      class_8385 var6,
      class_3754 var7,
      class_8384 var8,
      class_376 var9,
      class_4781 var10,
      class_9603 var11,
      class_6160 var12,
      class_4696 var13,
      class_7207 var14,
      class_8315 var15,
      class_3409 var16
   ) {
      this.field_43923 = var1;
      this.field_43922 = var2;
      this.field_43933 = var3;
      this.field_43936 = var4;
      this.field_43932 = var5;
      this.field_43928 = var6;
      this.field_43934 = var7;
      this.field_43930 = var8;
      this.field_43937 = var9;
      this.field_43931 = var10;
      this.field_43935 = var11;
      this.field_43925 = var12;
      this.field_43926 = var13;
      this.field_43938 = var14;
      this.field_43924 = var15;
      this.field_43929 = var16;
      this.field_43927 = ImmutableList.of(
         this.field_43923,
         this.field_43922,
         this.field_43933,
         this.field_43936,
         this.field_43932,
         this.field_43928,
         this.field_43934,
         this.field_43930,
         this.field_43937,
         this.field_43931,
         this.field_43935,
         this.field_43925,
         new class_5348[]{this.field_43926, this.field_43938, this.field_43924}
      );
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class_8570 var4 = (class_8570)var1;
         return this.field_43929 == var4.field_43929 && this.field_43927.equals(var4.field_43927);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return class_5129.method_23524(this.field_43927, this.field_43929);
   }

   @Override
   public String toString() {
      return "CompositeState[" + this.field_43927 + ", outlineProperty=" + this.field_43929 + ']';
   }

   public static class_5604 method_39411() {
      return new class_5604(null);
   }

   public class_5604 method_39415() {
      class_5604 var3 = new class_5604(null);
      var3.method_25435(this.field_43923);
      var3.method_25431(this.field_43922);
      var3.method_25437(this.field_43933);
      var3.method_25434(this.field_43936);
      var3.method_25433(this.field_43932);
      var3.method_25439(this.field_43928);
      var3.method_25432(this.field_43934);
      var3.method_25438(this.field_43930);
      var3.method_25442(this.field_43937);
      var3.method_25444(this.field_43931);
      var3.method_25430(this.field_43935);
      var3.method_25427(this.field_43925);
      var3.method_25440(this.field_43926);
      var3.method_25428(this.field_43938);
      var3.method_25443(this.field_43924);
      return var3;
   }
}
