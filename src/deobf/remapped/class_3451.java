package remapped;

import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class class_3451 extends class_1859 {
   private List<class_6220> field_16932 = new ArrayList<class_6220>();
   public int field_16927;
   public class_993 field_16933;
   public class_5940 field_16931;
   public int field_16930;
   private final List<class_8686> field_16929 = new ArrayList<class_8686>();

   public class_3451(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_16930 = 260;
      this.method_32148(this.field_16931 = new class_5940(this, "waypointList", 0, 65, this.field_16930, this.field_36257 - 65));

      for (class_4333 var10 : class_727.method_3328().method_3309().method_21960()) {
         this.field_16931.method_27166(var10.field_21072, new class_2700(var10.field_21071, 64, var10.field_21073), var10.field_21075);
      }

      this.method_32148(this.field_16933 = new class_993(this, "mapFrame", this.field_16930, 0, this.field_36278 - this.field_16930, this.field_36257));
      this.method_32105(false);
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      if (this.field_36267) {
         class_727.method_3328().method_3309().field_23058.clear();
      }
   }

   @Override
   public void method_32178(float var1) {
      byte var4 = 14;
      class_73.method_128(
         (float)(this.field_36270 + var4 / 2),
         (float)(this.field_36261 + var4 / 2),
         (float)(this.field_36278 - var4),
         (float)(this.field_36257 - var4),
         20.0F,
         var1 * 0.9F
      );
      float var5 = 0.88F;
      if (!class_727.method_3328().method_3299().method_31000()) {
         var5 = 0.95F;
      }

      class_73.method_108(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)this.field_36278,
         (float)this.field_36257,
         14.0F,
         class_314.method_1444(class_1255.field_6918.field_6917, var5)
      );
      class_73.method_139(
         (float)(this.field_36270 + this.field_16930),
         (float)this.field_36261,
         (float)(this.field_36278 - this.field_16930),
         (float)this.field_36257,
         14.0F,
         -7687425
      );
      class_73.method_107();
      class_73.method_139(
         (float)this.field_36270, (float)this.field_36261, (float)this.field_36278, (float)this.field_36257, 14.0F, class_1255.field_6918.field_6917
      );
      class_73.method_85(class_3118.field_15505);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)this.method_32132(), (float)this.method_32173(), 0.0F);
      this.field_16931.method_32178(var1);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glTranslatef((float)this.method_32132(), (float)this.method_32173(), 0.0F);
      this.field_16933.method_32178(var1);
      GL11.glPopMatrix();
      class_73.method_145();
      class_73.method_103(
         (float)(this.field_36270 + this.field_16930),
         (float)(this.field_36261 + 0),
         1.0F,
         (float)this.field_36257,
         class_314.method_1444(class_1255.field_6929.field_6917, 0.14F)
      );
      int var6 = class_314.method_1444(class_314.method_1401(-7687425, 0.2F), 0.8F);
      var6 = class_314.method_1444(class_1255.field_6929.field_6917, 0.6F);
      class_73.method_87(class_5320.field_27141, (float)(this.field_36270 + 30), (float)(this.field_36261 + 25), "Waypoints", var6);
      class_73.method_87(
         class_5320.field_27147,
         (float)this.field_36270,
         (float)((this.field_36283.method_32137() - this.field_36257) / 2 - 70),
         "Jello Maps",
         class_1255.field_6918.field_6917
      );
      String var7 = class_727.method_3328().method_3309().method_21978().replace("/", " - ");
      class_73.method_87(
         class_5320.field_27150,
         (float)(this.field_36270 + this.field_36278 - class_5320.field_27150.method_18547(var7) - 10),
         (float)((this.field_36283.method_32137() - this.field_36257) / 2 - 62),
         var7,
         class_314.method_1444(class_1255.field_6918.field_6917, 0.5F)
      );
   }

   public final void method_15892(class_8686 var1) {
      this.field_16929.add(var1);
   }

   public final void method_15893(int var1, int var2, class_4215 var3) {
      for (class_8686 var7 : this.field_16929) {
         var7.method_39880(this, var1, var2, var3);
      }
   }
}
