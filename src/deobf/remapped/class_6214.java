package remapped;

import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class class_6214 extends class_1859 {
   private static String[] field_31749;
   public static final class_590 field_31746 = new class_590(1250067, -15329770)
      .method_2765(class_1255.field_6929.field_6917)
      .method_2775(class_6206.field_31726);
   public List<String> field_31748 = new ArrayList<String>();
   public int field_31747 = 0;

   public class_6214(class_7038 var1, String var2, int var3, int var4, int var5, int var6, List<String> var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, field_31746, false);
      this.field_31748 = var7;
      this.field_31747 = var8;
      this.method_28424();
   }

   private void method_28424() {
      this.method_32134().clear();
      this.field_36258 = class_5320.field_27139;

      for (String var4 : this.field_31748) {
         class_6220 var5;
         this.method_32148(
            var5 = new class_6220(
               this,
               var4,
               0,
               0,
               this.method_32109(),
               this.method_32137(),
               new class_590(
                  class_1255.field_6918.field_6917,
                  -1381654,
                  this.field_36272.method_2764(),
                  this.field_36272.method_2764(),
                  class_6206.field_31724,
                  class_6206.field_31726
               ),
               var4,
               this.method_32097()
            )
         );
         var5.method_28444(10);
         var5.method_32100((var2, var3) -> {
            this.method_28425(this.field_31748.indexOf(var4));
            this.method_8235();
         });
      }

      this.method_32153(new class_8348(1));
   }

   private int method_28420() {
      return this.method_32137() * (this.field_31748.size() - 1);
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      FontManager.method_94(
         (float)this.method_32132(),
         (float)this.method_32173(),
         (float)(this.method_32132() + this.method_32109()),
         (float)(this.method_32173() + this.method_32137() + this.method_28420()),
         class_314.method_1444(class_1255.field_6918.field_6917, var1)
      );
      FontManager.method_128(
         (float)this.method_32132(),
         (float)this.method_32173(),
         (float)this.method_32109(),
         (float)(this.method_32137() + this.method_28420() - 1),
         6.0F,
         var1 * 0.1F
      );
      FontManager.method_128(
         (float)this.method_32132(),
         (float)this.method_32173(),
         (float)this.method_32109(),
         (float)(this.method_32137() + this.method_28420() - 1),
         20.0F,
         var1 * 0.2F
      );
      GL11.glPushMatrix();
      super.method_32178(var1);
      GL11.glPopMatrix();
   }

   public List<String> method_28426() {
      return this.field_31748;
   }

   public void method_28423(String var1, int var2) {
      this.method_28426().add(var2, var1);
      this.method_28424();
   }

   public void method_28422(String var1) {
      this.method_28423(var1, this.field_31748.size());
   }

   public <E extends Enum<E>> void method_28419(Class<E> var1) {
      this.field_31748.clear();

      for (Enum var7 : (Enum[])var1.getEnumConstants()) {
         String var8 = var7.toString().substring(0, 1).toUpperCase() + var7.toString().substring(1, var7.toString().length()).toLowerCase();
         this.method_28423(var8, var7.ordinal());
      }
   }

   public int method_28421() {
      return this.field_31747;
   }

   public void method_28425(int var1) {
      this.field_31747 = var1;
   }

   @Override
   public String method_32165() {
      return this.method_28426().size() <= 0 ? null : this.method_28426().get(this.method_28421());
   }

   @Override
   public boolean method_32120(int var1, int var2) {
      var1 -= this.method_32155();
      var2 -= this.method_32093();
      return var1 >= -10 && var1 <= this.method_32109() && var2 >= 0 && var2 <= this.method_32137() + this.method_28420();
   }
}
