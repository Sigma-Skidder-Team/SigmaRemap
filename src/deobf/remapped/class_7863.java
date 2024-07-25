package remapped;

import com.google.common.base.Predicates;

public class class_7863 extends class_6414 {
   public static final class_6162 field_40261 = class_380.field_1543;
   public static final class_6720 field_40260 = class_6023.field_30718;
   public static final class_4190 field_40263 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   public static final class_4190 field_40258 = class_6414.method_29292(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   public static final class_4190 field_40262 = class_3370.method_15530(field_40263, field_40258);
   private static class_9741 field_40259;

   public class_7863(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_40261, Direction.field_818).method_10308(field_40260, Boolean.valueOf(false)));
   }

   @Override
   public boolean method_10768(class_2522 var1) {
      return true;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return !var1.<Boolean>method_10313(field_40260) ? field_40263 : field_40262;
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_10308(field_40261, var1.method_21863().method_1046()).method_10308(field_40260, Boolean.valueOf(false));
   }

   @Override
   public boolean method_10770(class_2522 var1) {
      return true;
   }

   @Override
   public int method_10795(class_2522 var1, World var2, class_1331 var3) {
      return !var1.<Boolean>method_10313(field_40260) ? 0 : 15;
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_40261, var2.method_30489(var1.<Direction>method_10313(field_40261)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<Direction>method_10313(field_40261)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_40261, field_40260);
   }

   public static class_9741 method_35600() {
      if (field_40259 == null) {
         field_40259 = class_9224.method_42577()
            .method_42575("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .method_42576('?', class_9115.method_41965(class_2263.field_11260))
            .method_42576(
               '^',
               class_9115.method_41965(
                  class_2263.method_10400(class_4783.field_23491)
                     .method_10402(field_40260, Predicates.equalTo(true))
                     .method_10402(field_40261, Predicates.equalTo(Direction.field_800))
               )
            )
            .method_42576(
               '>',
               class_9115.method_41965(
                  class_2263.method_10400(class_4783.field_23491)
                     .method_10402(field_40260, Predicates.equalTo(true))
                     .method_10402(field_40261, Predicates.equalTo(Direction.field_809))
               )
            )
            .method_42576(
               'v',
               class_9115.method_41965(
                  class_2263.method_10400(class_4783.field_23491)
                     .method_10402(field_40260, Predicates.equalTo(true))
                     .method_10402(field_40261, Predicates.equalTo(Direction.field_818))
               )
            )
            .method_42576(
               '<',
               class_9115.method_41965(
                  class_2263.method_10400(class_4783.field_23491)
                     .method_10402(field_40260, Predicates.equalTo(true))
                     .method_10402(field_40261, Predicates.equalTo(Direction.field_804))
               )
            )
            .method_42571();
      }

      return field_40259;
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }
}
