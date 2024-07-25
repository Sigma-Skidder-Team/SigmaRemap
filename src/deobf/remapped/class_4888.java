package remapped;

import java.util.function.Predicate;

public class class_4888 extends class_380 implements class_9866 {
   public static final class_6162 field_24302 = class_380.field_1543;
   private class_9741 field_24304;
   private class_9741 field_24305;
   private class_9741 field_24299;
   private class_9741 field_24300;
   private static final Predicate<class_2522> field_24303 = var0 -> var0 != null
         && (var0.method_8350(class_4783.field_23281) || var0.method_8350(class_4783.field_23855));

   public class_4888(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_24302, Direction.field_818));
   }

   @Override
   public void method_10760(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var4.method_8350(var1.method_8360())) {
         this.method_22423(var2, var3);
      }
   }

   public boolean method_22420(class_4924 var1, BlockPos var2) {
      return this.method_22422().method_44981(var1, var2) != null || this.method_22419().method_44981(var1, var2) != null;
   }

   private void method_22423(World var1, BlockPos var2) {
      class_6953 var5 = this.method_22421().method_44981(var1, var2);
      if (var5 == null) {
         var5 = this.method_22424().method_44981(var1, var2);
         if (var5 != null) {
            for (int var6 = 0; var6 < this.method_22424().method_44984(); var6++) {
               for (int var7 = 0; var7 < this.method_22424().method_44986(); var7++) {
                  class_9115 var8 = var5.method_31795(var6, var7, 0);
                  var1.method_7513(var8.method_41966(), class_4783.field_23184.method_29260(), 2);
                  var1.method_43364(2001, var8.method_41966(), class_6414.method_29285(var8.method_41968()));
               }
            }

            BlockPos var12 = var5.method_31795(1, 2, 0).method_41966();
            IronGolemEntity var15 = EntityType.field_34298.method_30484(var1);
            var15.method_36979(true);
            var15.method_37144((double)var12.getX() + 0.5, (double)var12.method_12165() + 0.05, (double)var12.method_12185() + 0.5, 0.0F, 0.0F);
            var1.method_7509(var15);

            for (class_9359 var9 : var1.<class_9359>method_25868(class_9359.class, var15.getBoundingBox().grow(5.0))) {
               class_8807.field_45046.method_22685(var9, var15);
            }

            for (int var19 = 0; var19 < this.method_22424().method_44984(); var19++) {
               for (int var22 = 0; var22 < this.method_22424().method_44986(); var22++) {
                  class_9115 var10 = var5.method_31795(var19, var22, 0);
                  var1.method_43369(var10.method_41966(), class_4783.field_23184);
               }
            }
         }
      } else {
         for (int var13 = 0; var13 < this.method_22421().method_44986(); var13++) {
            class_9115 var16 = var5.method_31795(0, var13, 0);
            var1.method_7513(var16.method_41966(), class_4783.field_23184.method_29260(), 2);
            var1.method_43364(2001, var16.method_41966(), class_6414.method_29285(var16.method_41968()));
         }

         class_223 var14 = EntityType.field_34253.method_30484(var1);
         BlockPos var17 = var5.method_31795(0, 2, 0).method_41966();
         var14.method_37144((double)var17.getX() + 0.5, (double)var17.method_12165() + 0.05, (double)var17.method_12185() + 0.5, 0.0F, 0.0F);
         var1.method_7509(var14);

         for (class_9359 var23 : var1.<class_9359>method_25868(class_9359.class, var14.getBoundingBox().grow(5.0))) {
            class_8807.field_45046.method_22685(var23, var14);
         }

         for (int var21 = 0; var21 < this.method_22421().method_44986(); var21++) {
            class_9115 var24 = var5.method_31795(0, var21, 0);
            var1.method_43369(var24.method_41966(), class_4783.field_23184);
         }
      }
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_10308(field_24302, var1.method_21863().method_1046());
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_24302);
   }

   private class_9741 method_22422() {
      if (this.field_24304 == null) {
         this.field_24304 = class_9224.method_42577()
            .method_42575(" ", "#", "#")
            .method_42576('#', class_9115.method_41965(class_2263.method_10400(class_4783.field_23813)))
            .method_42571();
      }

      return this.field_24304;
   }

   private class_9741 method_22421() {
      if (this.field_24305 == null) {
         this.field_24305 = class_9224.method_42577()
            .method_42575("^", "#", "#")
            .method_42576('^', class_9115.method_41965(field_24303))
            .method_42576('#', class_9115.method_41965(class_2263.method_10400(class_4783.field_23813)))
            .method_42571();
      }

      return this.field_24305;
   }

   private class_9741 method_22419() {
      if (this.field_24299 == null) {
         this.field_24299 = class_9224.method_42577()
            .method_42575("~ ~", "###", "~#~")
            .method_42576('#', class_9115.method_41965(class_2263.method_10400(class_4783.field_23810)))
            .method_42576('~', class_9115.method_41965(class_2927.method_13381(class_5371.field_27403)))
            .method_42571();
      }

      return this.field_24299;
   }

   private class_9741 method_22424() {
      if (this.field_24300 == null) {
         this.field_24300 = class_9224.method_42577()
            .method_42575("~^~", "###", "~#~")
            .method_42576('^', class_9115.method_41965(field_24303))
            .method_42576('#', class_9115.method_41965(class_2263.method_10400(class_4783.field_23810)))
            .method_42576('~', class_9115.method_41965(class_2927.method_13381(class_5371.field_27403)))
            .method_42571();
      }

      return this.field_24300;
   }
}
