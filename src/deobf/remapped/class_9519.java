package remapped;

public class class_9519 extends class_353 {
   private static String[] field_48461;
   private final Direction field_48460;

   public class_9519(World var1, class_1331 var2, Direction var3, class_6098 var4, Direction var5) {
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
   public Direction method_1782() {
      return Direction.field_802;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Direction[] method_1786() {
      switch (this.field_48460) {
         case field_802:
         default:
            return new Direction[]{
               Direction.field_802, Direction.field_818, Direction.field_804, Direction.field_800, Direction.field_809, Direction.field_817
            };
         case field_817:
            return new Direction[]{
               Direction.field_802, Direction.field_817, Direction.field_818, Direction.field_804, Direction.field_800, Direction.field_809
            };
         case field_818:
            return new Direction[]{
               Direction.field_802, Direction.field_818, Direction.field_804, Direction.field_809, Direction.field_817, Direction.field_800
            };
         case field_800:
            return new Direction[]{
               Direction.field_802, Direction.field_800, Direction.field_804, Direction.field_809, Direction.field_817, Direction.field_818
            };
         case field_809:
            return new Direction[]{
               Direction.field_802, Direction.field_809, Direction.field_800, Direction.field_817, Direction.field_818, Direction.field_804
            };
         case field_804:
            return new Direction[]{
               Direction.field_802, Direction.field_804, Direction.field_800, Direction.field_817, Direction.field_818, Direction.field_809
            };
      }
   }

   @Override
   public Direction method_21863() {
      return this.field_48460.method_1029() != class_9249.field_47216 ? this.field_48460 : Direction.field_818;
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
