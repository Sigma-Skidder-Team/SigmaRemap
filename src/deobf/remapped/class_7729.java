package remapped;

public class class_7729 {
   private static String[] field_39204;
   public static final class_7729 field_39206 = new class_7729();
   public final class_944 field_39199;
   public final class_944 field_39205;
   public final class_944 field_39201;
   public final class_944 field_39202;
   public final class_944 field_39207;
   public final class_944 field_39198;
   public final class_944 field_39200;
   public final class_944 field_39203;

   private class_7729() {
      this(
         class_944.field_4823,
         class_944.field_4823,
         class_944.field_4823,
         class_944.field_4823,
         class_944.field_4823,
         class_944.field_4823,
         class_944.field_4823,
         class_944.field_4823
      );
   }

   public class_7729(class_7729 var1) {
      this.field_39199 = var1.field_39199;
      this.field_39205 = var1.field_39205;
      this.field_39201 = var1.field_39201;
      this.field_39202 = var1.field_39202;
      this.field_39207 = var1.field_39207;
      this.field_39198 = var1.field_39198;
      this.field_39200 = var1.field_39200;
      this.field_39203 = var1.field_39203;
   }

   public class_7729(class_944 var1, class_944 var2, class_944 var3, class_944 var4, class_944 var5, class_944 var6, class_944 var7, class_944 var8) {
      this.field_39199 = var1;
      this.field_39205 = var2;
      this.field_39201 = var3;
      this.field_39202 = var4;
      this.field_39207 = var5;
      this.field_39198 = var6;
      this.field_39200 = var7;
      this.field_39203 = var8;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class_944 method_34982(class_5612 var1) {
      switch (var1) {
         case field_28492:
            return this.field_39199;
         case field_28493:
            return this.field_39205;
         case field_28498:
            return this.field_39201;
         case field_28499:
            return this.field_39202;
         case field_28497:
            return this.field_39207;
         case field_28489:
            return this.field_39198;
         case field_28496:
            return this.field_39200;
         case field_28495:
            return this.field_39203;
         default:
            return class_944.field_4823;
      }
   }

   public boolean method_34980(class_5612 var1) {
      return this.method_34982(var1) != class_944.field_4823;
   }
}
