package remapped;

public class class_9519 extends class_353 {
   private static String[] field_48461;
   private final class_240 field_48460;

   public class_9519(class_6486 var1, class_1331 var2, class_240 var3, class_6098 var4, class_240 var5) {
      super(var1, (class_704)null, class_2584.field_12791, var4, new class_9529(class_1343.method_6200(var2), var5, var2, false));
      this.field_48460 = var3;
   }

   @Override
   public class_1331 method_21858() {
      return this.method_21864().method_43955();
   }

   @Override
   public boolean method_1785() {
      return this.method_21862().method_28262(this.method_21864().method_43955()).method_8374(this);
   }

   @Override
   public boolean method_1783() {
      return this.method_1785();
   }

   @Override
   public class_240 method_1782() {
      return class_240.field_802;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public class_240[] method_1786() {
      switch (this.field_48460) {
         case field_802:
         default:
            return new class_240[]{
               class_240.field_802, class_240.field_818, class_240.field_804, class_240.field_800, class_240.field_809, class_240.field_817
            };
         case field_817:
            return new class_240[]{
               class_240.field_802, class_240.field_817, class_240.field_818, class_240.field_804, class_240.field_800, class_240.field_809
            };
         case field_818:
            return new class_240[]{
               class_240.field_802, class_240.field_818, class_240.field_804, class_240.field_809, class_240.field_817, class_240.field_800
            };
         case field_800:
            return new class_240[]{
               class_240.field_802, class_240.field_800, class_240.field_804, class_240.field_809, class_240.field_817, class_240.field_818
            };
         case field_809:
            return new class_240[]{
               class_240.field_802, class_240.field_809, class_240.field_800, class_240.field_817, class_240.field_818, class_240.field_804
            };
         case field_804:
            return new class_240[]{
               class_240.field_802, class_240.field_804, class_240.field_800, class_240.field_817, class_240.field_818, class_240.field_809
            };
      }
   }

   @Override
   public class_240 method_21863() {
      return this.field_48460.method_1029() != class_9249.field_47216 ? this.field_48460 : class_240.field_818;
   }

   @Override
   public boolean method_21859() {
      return false;
   }

   @Override
   public float method_21861() {
      return (float)(this.field_48460.method_1031() * 90);
   }
}
