package mapped;

import com.google.common.collect.ImmutableList;

public final class Class9484 {
   private final Class4518 field44079;
   private final Class4525 field44080;
   private final Class4508 field44081;
   private final Class4522 field44082;
   private final Class4511 field44083;
   private final Class4517 field44084;
   private final Class4507 field44085;
   private final Class4506 field44086;
   private final Class4509 field44087;
   private final Class4512 field44088;
   private final Class4524 field44089;
   private final Class4519 field44090;
   private final Class4513 field44091;
   private final Class4523 field44092;
   private final Class4516 field44093;
   private final Class2041 field44094;
   private final ImmutableList<Class4510> field44095;

   public Class9484(
           Class4518 var1,
           Class4525 var2,
           Class4508 var3,
           Class4522 var4,
           Class4511 var5,
           Class4517 var6,
           Class4507 var7,
           Class4506 var8,
           Class4509 var9,
           Class4512 var10,
           Class4524 var11,
           Class4519 var12,
           Class4513 var13,
           Class4523 var14,
           Class4516 var15,
           Class2041 var16
   ) {
      this.field44079 = var1;
      this.field44080 = var2;
      this.field44081 = var3;
      this.field44082 = var4;
      this.field44083 = var5;
      this.field44084 = var6;
      this.field44085 = var7;
      this.field44086 = var8;
      this.field44087 = var9;
      this.field44088 = var10;
      this.field44089 = var11;
      this.field44090 = var12;
      this.field44091 = var13;
      this.field44092 = var14;
      this.field44093 = var15;
      this.field44094 = var16;
      this.field44095 = ImmutableList.of(
         this.field44079,
         this.field44080,
         this.field44081,
         this.field44082,
         this.field44083,
         this.field44084,
         this.field44085,
         this.field44086,
         this.field44087,
         this.field44088,
         this.field44089,
         this.field44090,
         new Class4510[]{this.field44091, this.field44092, this.field44093}
      );
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Class9484 var4 = (Class9484)var1;
         return this.field44094 == var4.field44094 && this.field44095.equals(var4.field44095);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Class8589.method30731(this.field44095, this.field44094);
   }

   @Override
   public String toString() {
      return "CompositeState[" + this.field44095 + ", outlineProperty=" + this.field44094 + ']';
   }

   public static Class8701 method36614() {
      return new Class8701();
   }

   public Class8701 method36615() {
      Class8701 var3 = new Class8701();
      var3.method31358(this.field44079);
      var3.method31359(this.field44080);
      var3.method31360(this.field44081);
      var3.method31361(this.field44082);
      var3.method31362(this.field44083);
      var3.method31363(this.field44084);
      var3.method31364(this.field44085);
      var3.method31365(this.field44086);
      var3.method31366(this.field44087);
      var3.method31367(this.field44088);
      var3.method31368(this.field44089);
      var3.method31369(this.field44090);
      var3.method31370(this.field44091);
      var3.method31371(this.field44092);
      var3.method31372(this.field44093);
      return var3;
   }

   // $VF: synthetic method
   public static ImmutableList method36616(Class9484 var0) {
      return var0.field44095;
   }

   // $VF: synthetic method
   public static Class2041 method36617(Class9484 var0) {
      return var0.field44094;
   }

   // $VF: synthetic method
   public static Class4518 method36618(Class9484 var0) {
      return var0.field44079;
   }

   // $VF: synthetic method
   public static Class4507 method36619(Class9484 var0) {
      return var0.field44085;
   }
}
