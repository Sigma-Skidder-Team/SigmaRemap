package remapped;

import java.io.IOException;
import java.io.InputStream;
import org.newdawn.slick.SlickException;

public class class_8112 implements class_4189 {
   public static final int field_41554 = 0;
   public static final int field_41552 = 1;
   public static final int field_41563 = 2;
   public static final int field_41553 = 3;
   public static class_1299 field_41551 = class_3980.method_18363();
   public static class_8112 field_41565;
   public static final int field_41556 = 1;
   public static final int field_41569 = 2;
   public class_8343 field_41546;
   public int field_41567;
   public int field_41548;
   public float field_41550;
   public float field_41559;
   public float field_41564;
   public float field_41560;
   public float field_41547;
   public float field_41561 = 1.0F;
   public String field_41573;
   public boolean field_41562 = false;
   public byte[] field_41574;
   public boolean field_41566;
   public float field_41549;
   public float field_41558;
   public String field_41557;
   public class_8709[] field_41570;
   private int field_41571 = 9729;
   private boolean field_41568;
   private class_8709 field_41555;

   public class_8112(class_8112 var1) {
      this.field_41567 = var1.method_36877();
      this.field_41548 = var1.method_36856();
      this.field_41546 = var1.field_41546;
      this.field_41550 = var1.field_41550;
      this.field_41559 = var1.field_41559;
      this.field_41573 = var1.field_41573;
      this.field_41564 = var1.field_41564;
      this.field_41560 = var1.field_41560;
      this.field_41549 = (float)(this.field_41567 / 2);
      this.field_41558 = (float)(this.field_41548 / 2);
      this.field_41562 = true;
   }

   public class_8112() {
   }

   public class_8112(class_8343 var1) {
      this.field_41546 = var1;
      this.field_41573 = var1.toString();
      this.method_36865();
   }

   public class_8112(String var1) throws SlickException {
      this(var1, false);
   }

   public class_8112(String var1, class_8709 var2) throws SlickException {
      this(var1, false, 1, var2);
   }

   public class_8112(String var1, boolean var2) throws SlickException {
      this(var1, var2, 1);
   }

   public class_8112(String var1, boolean var2, int var3) throws SlickException {
      this(var1, var2, var3, null);
   }

   public class_8112(String var1, boolean var2, int var3, class_8709 var4) throws SlickException {
      this.field_41571 = var3 == 1 ? 9729 : 9728;
      this.field_41555 = var4;
      this.field_41568 = var2;

      try {
         this.field_41573 = var1;
         int[] var7 = null;
         if (var4 != null) {
            var7 = new int[]{(int)(var4.field_44663 * 255.0F), (int)(var4.field_44649 * 255.0F), (int)(var4.field_44648 * 255.0F)};
         }

         this.field_41546 = class_8256.method_37848().method_37863(var1, var2, this.field_41571, var7);
      } catch (IOException var8) {
         class_2598.method_11785(var8);
         throw new class_1162("Failed to load image from: " + var1, var8);
      }
   }

   public void method_36850(int var1) {
      this.field_41571 = var1 != 1 ? 9728 : 9729;
      this.field_41546.method_38419();
      field_41551.method_5908(3553, 10241, this.field_41571);
      field_41551.method_5908(3553, 10240, this.field_41571);
   }

   public class_8112(int var1, int var2) throws SlickException {
      this(var1, var2, 2);
   }

   public class_8112(int var1, int var2, int var3) throws SlickException {
      this.field_41573 = super.toString();
      this.field_41571 = var3 == 1 ? 9729 : 9728;

      try {
         this.field_41546 = class_8256.method_37848().method_37866(var1, var2, this.field_41571);
      } catch (IOException var7) {
         class_2598.method_11785(var7);
         throw new class_1162("Failed to create empty image " + var1 + "x" + var2);
      }

      this.method_36895();
   }

   public class_8112(InputStream var1, String var2, boolean var3) throws SlickException {
      this(var1, var2, var3, 1);
   }

   public class_8112(InputStream var1, String var2, boolean var3, int var4) throws SlickException {
      this.method_36843(var1, var2, var3, var4, null);
   }

   public class_8112(class_5688 var1) {
      this(var1, 1);
      class_9162.method_42217();
   }

   public class_8112(class_5688 var1, int var2) {
      this((class_1155)var1, var2);
      class_9162.method_42217();
   }

   public class_8112(class_1155 var1) {
      this(var1, 1);
   }

   public class_8112(class_1155 var1, int var2) {
      try {
         this.field_41571 = var2 == 1 ? 9729 : 9728;
         this.field_41546 = class_8256.method_37848().method_37864(var1, this.field_41571);
         this.field_41573 = this.field_41546.toString();
      } catch (IOException var6) {
         class_2598.method_11785(var6);
      }
   }

   public int method_36900() {
      return this.field_41571;
   }

   public String method_36869() {
      return this.field_41573;
   }

   public void method_36864(float var1, float var2, float var3, float var4) {
      this.method_36873(0, var1, var2, var3, var4);
      this.method_36873(1, var1, var2, var3, var4);
      this.method_36873(3, var1, var2, var3, var4);
      this.method_36873(2, var1, var2, var3, var4);
   }

   public void method_36863(float var1, float var2, float var3) {
      this.method_36872(0, var1, var2, var3);
      this.method_36872(1, var1, var2, var3);
      this.method_36872(3, var1, var2, var3);
      this.method_36872(2, var1, var2, var3);
   }

   public void method_36873(int var1, float var2, float var3, float var4, float var5) {
      if (this.field_41570 == null) {
         this.field_41570 = new class_8709[]{
            new class_8709(1.0F, 1.0F, 1.0F, 1.0F),
            new class_8709(1.0F, 1.0F, 1.0F, 1.0F),
            new class_8709(1.0F, 1.0F, 1.0F, 1.0F),
            new class_8709(1.0F, 1.0F, 1.0F, 1.0F)
         };
      }

      this.field_41570[var1].field_44663 = var2;
      this.field_41570[var1].field_44649 = var3;
      this.field_41570[var1].field_44648 = var4;
      this.field_41570[var1].field_44645 = var5;
   }

   public void method_36872(int var1, float var2, float var3, float var4) {
      if (this.field_41570 == null) {
         this.field_41570 = new class_8709[]{
            new class_8709(1.0F, 1.0F, 1.0F, 1.0F),
            new class_8709(1.0F, 1.0F, 1.0F, 1.0F),
            new class_8709(1.0F, 1.0F, 1.0F, 1.0F),
            new class_8709(1.0F, 1.0F, 1.0F, 1.0F)
         };
      }

      this.field_41570[var1].field_44663 = var2;
      this.field_41570[var1].field_44649 = var3;
      this.field_41570[var1].field_44648 = var4;
   }

   public void method_36865() {
      if (!field_41551.method_5923()) {
         field_41551.method_5908(3553, 10242, 10496);
         field_41551.method_5908(3553, 10243, 10496);
      } else {
         field_41551.method_5908(3553, 10242, 34627);
         field_41551.method_5908(3553, 10243, 34627);
      }
   }

   public void method_36901(String var1) {
      this.field_41557 = var1;
   }

   public String method_36884() {
      return this.field_41557;
   }

   private void method_36843(InputStream var1, String var2, boolean var3, int var4, class_8709 var5) throws SlickException {
      this.field_41571 = var4 == 1 ? 9729 : 9728;

      try {
         this.field_41573 = var2;
         int[] var8 = null;
         if (var5 != null) {
            var8 = new int[]{(int)(var5.field_44663 * 255.0F), (int)(var5.field_44649 * 255.0F), (int)(var5.field_44648 * 255.0F)};
         }

         this.field_41546 = class_8256.method_37848().method_37861(var1, var2, var3, this.field_41571, var8);
      } catch (IOException var9) {
         class_2598.method_11785(var9);
         throw new class_1162("Failed to load image from: " + var2, var9);
      }
   }

   public void method_36849() {
      this.field_41546.method_38419();
   }

   public void method_36860() {
      this.field_41562 = false;
      this.method_36895();
   }

   public final void method_36895() {
      if (!this.field_41562) {
         this.field_41562 = true;
         if (this.field_41546 != null) {
            this.field_41567 = this.field_41546.method_38415();
            this.field_41548 = this.field_41546.method_38421();
            this.field_41564 = 0.0F;
            this.field_41560 = 0.0F;
            this.field_41550 = this.field_41546.method_38423();
            this.field_41559 = this.field_41546.method_38414();
         }

         this.method_36868();
         this.field_41549 = (float)(this.field_41567 / 2);
         this.field_41558 = (float)(this.field_41548 / 2);
      }
   }

   public void method_36868() {
   }

   public void method_36886() {
      this.method_19475(0.0F, 0.0F);
   }

   public void method_36861(float var1, float var2) {
      this.method_19475(var1 - (float)(this.method_36877() / 2), var2 - (float)(this.method_36856() / 2));
   }

   @Override
   public void method_19475(float var1, float var2) {
      this.method_36895();
      this.method_36888(var1, var2, (float)this.field_41567, (float)this.field_41548);
   }

   public void method_36894(float var1, float var2, class_8709 var3) {
      this.method_36895();
      this.method_36892(var1, var2, (float)this.field_41567, (float)this.field_41548, var3);
   }

   public void method_36903(float var1, float var2, float var3, float var4) {
      this.method_36895();
      if (this.field_41570 != null) {
         this.field_41570[0].method_40021();
         field_41551.method_5924(this.field_41564, this.field_41560);
         field_41551.method_5913(var1, var2, 0.0F);
         this.field_41570[3].method_40021();
         field_41551.method_5924(this.field_41564, this.field_41560 + this.field_41559);
         field_41551.method_5913(var1, var2 + var4, 0.0F);
         this.field_41570[2].method_40021();
         field_41551.method_5924(this.field_41564 + this.field_41550, this.field_41560 + this.field_41559);
         field_41551.method_5913(var1 + var3, var2 + var4, 0.0F);
         this.field_41570[1].method_40021();
         field_41551.method_5924(this.field_41564 + this.field_41550, this.field_41560);
         field_41551.method_5913(var1 + var3, var2, 0.0F);
      } else {
         field_41551.method_5924(this.field_41564, this.field_41560);
         field_41551.method_5913(var1, var2, 0.0F);
         field_41551.method_5924(this.field_41564, this.field_41560 + this.field_41559);
         field_41551.method_5913(var1, var2 + var4, 0.0F);
         field_41551.method_5924(this.field_41564 + this.field_41550, this.field_41560 + this.field_41559);
         field_41551.method_5913(var1 + var3, var2 + var4, 0.0F);
         field_41551.method_5924(this.field_41564 + this.field_41550, this.field_41560);
         field_41551.method_5913(var1 + var3, var2, 0.0F);
      }
   }

   public float method_36883() {
      this.method_36895();
      return this.field_41564;
   }

   public float method_36859() {
      this.method_36895();
      return this.field_41560;
   }

   public float method_36862() {
      this.method_36895();
      return this.field_41550;
   }

   public float method_36867() {
      this.method_36895();
      return this.field_41559;
   }

   public void method_36887(float var1, float var2, float var3) {
      this.method_36895();
      this.method_36892(var1, var2, (float)this.field_41567 * var3, (float)this.field_41548 * var3, class_8709.field_44646);
   }

   public void method_36893(float var1, float var2, float var3, class_8709 var4) {
      this.method_36895();
      this.method_36892(var1, var2, (float)this.field_41567 * var3, (float)this.field_41548 * var3, var4);
   }

   public void method_36888(float var1, float var2, float var3, float var4) {
      this.method_36895();
      this.method_36892(var1, var2, var3, var4, class_8709.field_44646);
   }

   public void method_36851(float var1, float var2, float var3, float var4) {
      this.method_36852(var1, var2, var3, var4, class_8709.field_44646);
   }

   public void method_36852(float var1, float var2, float var3, float var4, class_8709 var5) {
      if (this.field_41561 != 1.0F) {
         if (var5 == null) {
            var5 = class_8709.field_44646;
         }

         var5 = new class_8709(var5);
         var5.field_44645 = var5.field_44645 * this.field_41561;
      }

      if (var5 != null) {
         var5.method_40021();
      }

      this.field_41546.method_38419();
      field_41551.method_5902(var1, var2, 0.0F);
      if (this.field_41547 != 0.0F) {
         field_41551.method_5902(this.field_41549, this.field_41558, 0.0F);
         field_41551.method_5937(this.field_41547, 0.0F, 0.0F, 1.0F);
         field_41551.method_5902(-this.field_41549, -this.field_41558, 0.0F);
      }

      field_41551.method_5934(7);
      this.method_36895();
      field_41551.method_5924(this.field_41564, this.field_41560);
      field_41551.method_5913(0.0F, 0.0F, 0.0F);
      field_41551.method_5924(this.field_41564, this.field_41560 + this.field_41559);
      field_41551.method_5913(var3, (float)this.field_41548, 0.0F);
      field_41551.method_5924(this.field_41564 + this.field_41550, this.field_41560 + this.field_41559);
      field_41551.method_5913((float)this.field_41567 + var3, (float)this.field_41548 + var4, 0.0F);
      field_41551.method_5924(this.field_41564 + this.field_41550, this.field_41560);
      field_41551.method_5913((float)this.field_41567, var4, 0.0F);
      field_41551.method_5940();
      if (this.field_41547 != 0.0F) {
         field_41551.method_5902(this.field_41549, this.field_41558, 0.0F);
         field_41551.method_5937(-this.field_41547, 0.0F, 0.0F, 1.0F);
         field_41551.method_5902(-this.field_41549, -this.field_41558, 0.0F);
      }

      field_41551.method_5902(-var1, -var2, 0.0F);
   }

   public void method_36892(float var1, float var2, float var3, float var4, class_8709 var5) {
      if (this.field_41561 != 1.0F) {
         if (var5 == null) {
            var5 = class_8709.field_44646;
         }

         var5 = new class_8709(var5);
         var5.field_44645 = var5.field_44645 * this.field_41561;
      }

      if (var5 != null) {
         var5.method_40021();
      }

      this.field_41546.method_38419();
      field_41551.method_5902(var1, var2, 0.0F);
      if (this.field_41547 != 0.0F) {
         field_41551.method_5902(this.field_41549, this.field_41558, 0.0F);
         field_41551.method_5937(this.field_41547, 0.0F, 0.0F, 1.0F);
         field_41551.method_5902(-this.field_41549, -this.field_41558, 0.0F);
      }

      field_41551.method_5934(7);
      this.method_36903(0.0F, 0.0F, var3, var4);
      field_41551.method_5940();
      if (this.field_41547 != 0.0F) {
         field_41551.method_5902(this.field_41549, this.field_41558, 0.0F);
         field_41551.method_5937(-this.field_41547, 0.0F, 0.0F, 1.0F);
         field_41551.method_5902(-this.field_41549, -this.field_41558, 0.0F);
      }

      field_41551.method_5902(-var1, -var2, 0.0F);
   }

   public void method_36847(float var1, float var2, float var3, float var4) {
      this.method_36848(var1, var2, var3, var4, class_8709.field_44646);
   }

   public void method_36853(float var1, float var2) {
      this.field_41549 = var1;
      this.field_41558 = var2;
   }

   public float method_36855() {
      this.method_36895();
      return this.field_41549;
   }

   public float method_36875() {
      this.method_36895();
      return this.field_41558;
   }

   public void method_36848(float var1, float var2, float var3, float var4, class_8709 var5) {
      this.method_36895();
      var5.method_40021();
      this.field_41546.method_38419();
      if (field_41551.method_5935()) {
         field_41551.method_5911(33880);
         field_41551.method_5890((byte)((int)(var5.field_44663 * 255.0F)), (byte)((int)(var5.field_44649 * 255.0F)), (byte)((int)(var5.field_44648 * 255.0F)));
      }

      field_41551.method_5893(8960, 8704, 8448);
      field_41551.method_5902(var1, var2, 0.0F);
      if (this.field_41547 != 0.0F) {
         field_41551.method_5902(this.field_41549, this.field_41558, 0.0F);
         field_41551.method_5937(this.field_41547, 0.0F, 0.0F, 1.0F);
         field_41551.method_5902(-this.field_41549, -this.field_41558, 0.0F);
      }

      field_41551.method_5934(7);
      this.method_36903(0.0F, 0.0F, var3, var4);
      field_41551.method_5940();
      if (this.field_41547 != 0.0F) {
         field_41551.method_5902(this.field_41549, this.field_41558, 0.0F);
         field_41551.method_5937(-this.field_41547, 0.0F, 0.0F, 1.0F);
         field_41551.method_5902(-this.field_41549, -this.field_41558, 0.0F);
      }

      field_41551.method_5902(-var1, -var2, 0.0F);
      if (field_41551.method_5935()) {
         field_41551.method_5938(33880);
      }
   }

   public void method_36846(float var1, float var2) {
      this.method_36847(var1, var2, (float)this.method_36877(), (float)this.method_36856());
   }

   public void method_36874(float var1) {
      this.field_41547 = var1 % 360.0F;
   }

   public float method_36871() {
      return this.field_41547;
   }

   public float method_36854() {
      return this.field_41561;
   }

   public void method_36899(float var1) {
      this.field_41561 = var1;
   }

   public void method_36896(float var1) {
      this.field_41547 += var1;
      this.field_41547 %= 360.0F;
   }

   public class_8112 method_36858(int var1, int var2, int var3, int var4) {
      this.method_36895();
      float var7 = (float)var1 / (float)this.field_41567 * this.field_41550 + this.field_41564;
      float var8 = (float)var2 / (float)this.field_41548 * this.field_41559 + this.field_41560;
      float var9 = (float)var3 / (float)this.field_41567 * this.field_41550;
      float var10 = (float)var4 / (float)this.field_41548 * this.field_41559;
      class_8112 var11 = new class_8112();
      var11.field_41562 = true;
      var11.field_41546 = this.field_41546;
      var11.field_41564 = var7;
      var11.field_41560 = var8;
      var11.field_41550 = var9;
      var11.field_41559 = var10;
      var11.field_41567 = var3;
      var11.field_41548 = var4;
      var11.field_41573 = this.field_41573;
      var11.field_41549 = (float)(var3 / 2);
      var11.field_41558 = (float)(var4 / 2);
      return var11;
   }

   public void method_36889(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method_36890(var1, var2, var1 + (float)this.field_41567, var2 + (float)this.field_41548, var3, var4, var5, var6);
   }

   public void method_36890(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.method_36891(var1, var2, var3, var4, var5, var6, var7, var8, class_8709.field_44646);
   }

   public void method_36891(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, class_8709 var9) {
      this.method_36895();
      if (this.field_41561 != 1.0F) {
         if (var9 == null) {
            var9 = class_8709.field_44646;
         }

         var9 = new class_8709(var9);
         var9.field_44645 = var9.field_44645 * this.field_41561;
      }

      var9.method_40021();
      this.field_41546.method_38419();
      field_41551.method_5902(var1, var2, 0.0F);
      if (this.field_41547 != 0.0F) {
         field_41551.method_5902(this.field_41549, this.field_41558, 0.0F);
         field_41551.method_5937(this.field_41547, 0.0F, 0.0F, 1.0F);
         field_41551.method_5902(-this.field_41549, -this.field_41558, 0.0F);
      }

      field_41551.method_5934(7);
      this.method_36904(0.0F, 0.0F, var3 - var1, var4 - var2, var5, var6, var7, var8);
      field_41551.method_5940();
      if (this.field_41547 != 0.0F) {
         field_41551.method_5902(this.field_41549, this.field_41558, 0.0F);
         field_41551.method_5937(-this.field_41547, 0.0F, 0.0F, 1.0F);
         field_41551.method_5902(-this.field_41549, -this.field_41558, 0.0F);
      }

      field_41551.method_5902(-var1, -var2, 0.0F);
   }

   public void method_36904(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.method_36905(var1, var2, var3, var4, var5, var6, var7, var8, null);
   }

   public void method_36905(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, class_8709 var9) {
      if (var9 != null) {
         var9.method_40021();
      }

      float var12 = var3 - var1;
      float var13 = var4 - var2;
      float var14 = var7 - var5;
      float var15 = var8 - var6;
      float var16 = var5 / (float)this.field_41567 * this.field_41550 + this.field_41564;
      float var17 = var6 / (float)this.field_41548 * this.field_41559 + this.field_41560;
      float var18 = var14 / (float)this.field_41567 * this.field_41550;
      float var19 = var15 / (float)this.field_41548 * this.field_41559;
      field_41551.method_5924(var16, var17);
      field_41551.method_5913(var1, var2, 0.0F);
      field_41551.method_5924(var16, var17 + var19);
      field_41551.method_5913(var1, var2 + var13, 0.0F);
      field_41551.method_5924(var16 + var18, var17 + var19);
      field_41551.method_5913(var1 + var12, var2 + var13, 0.0F);
      field_41551.method_5924(var16 + var18, var17);
      field_41551.method_5913(var1 + var12, var2, 0.0F);
   }

   public void method_36879(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      class_8709.field_44646.method_40021();
      this.field_41546.method_38419();
      field_41551.method_5902(var1, var2, 0.0F);
      if (this.field_41547 != 0.0F) {
         field_41551.method_5902(this.field_41549, this.field_41558, 0.0F);
         field_41551.method_5937(this.field_41547, 0.0F, 0.0F, 1.0F);
         field_41551.method_5902(-this.field_41549, -this.field_41558, 0.0F);
      }

      field_41551.method_5934(7);
      this.method_36895();
      field_41551.method_5924(this.field_41564, this.field_41560);
      field_41551.method_5913(0.0F, 0.0F, 0.0F);
      field_41551.method_5924(this.field_41564, this.field_41560 + this.field_41559);
      field_41551.method_5913(var3 - var1, var4 - var2, 0.0F);
      field_41551.method_5924(this.field_41564 + this.field_41550, this.field_41560 + this.field_41559);
      field_41551.method_5913(var5 - var1, var6 - var2, 0.0F);
      field_41551.method_5924(this.field_41564 + this.field_41550, this.field_41560);
      field_41551.method_5913(var7 - var1, var8 - var2, 0.0F);
      field_41551.method_5940();
      if (this.field_41547 != 0.0F) {
         field_41551.method_5902(this.field_41549, this.field_41558, 0.0F);
         field_41551.method_5937(-this.field_41547, 0.0F, 0.0F, 1.0F);
         field_41551.method_5902(-this.field_41549, -this.field_41558, 0.0F);
      }

      field_41551.method_5902(-var1, -var2, 0.0F);
   }

   public int method_36877() {
      this.method_36895();
      return this.field_41567;
   }

   public int method_36856() {
      this.method_36895();
      return this.field_41548;
   }

   public class_8112 method_36876() {
      this.method_36895();
      return this.method_36858(0, 0, this.field_41567, this.field_41548);
   }

   public class_8112 method_36881(float var1) {
      this.method_36895();
      return this.method_36882((int)((float)this.field_41567 * var1), (int)((float)this.field_41548 * var1));
   }

   public class_8112 method_36882(int var1, int var2) {
      this.method_36895();
      class_8112 var5 = this.method_36876();
      var5.field_41567 = var1;
      var5.field_41548 = var2;
      var5.field_41549 = (float)(var1 / 2);
      var5.field_41558 = (float)(var2 / 2);
      return var5;
   }

   public void method_36870() {
      if (this.field_41559 > 0.0F) {
         this.field_41560 = this.field_41560 + this.field_41559;
         this.field_41559 = -this.field_41559;
      }
   }

   public class_8112 method_36902(boolean var1, boolean var2) {
      this.method_36895();
      class_8112 var5 = this.method_36876();
      if (var1) {
         var5.field_41564 = this.field_41564 + this.field_41550;
         var5.field_41550 = -this.field_41550;
      }

      if (var2) {
         var5.field_41560 = this.field_41560 + this.field_41559;
         var5.field_41559 = -this.field_41559;
      }

      return var5;
   }

   public void method_36878() {
      if (field_41565 == this) {
         field_41565 = null;
         field_41551.method_5940();
      } else {
         throw new RuntimeException("The sprite sheet is not currently in use");
      }
   }

   public void method_36880() {
      if (field_41565 == null) {
         field_41565 = this;
         this.method_36895();
         class_8709.field_44646.method_40021();
         this.field_41546.method_38419();
         field_41551.method_5934(7);
      } else {
         throw new RuntimeException("Attempt to start use of a sprite sheet before ending use with another - see endUse()");
      }
   }

   @Override
   public String toString() {
      this.method_36895();
      return "[Image "
         + this.field_41573
         + " "
         + this.field_41567
         + "x"
         + this.field_41548
         + "  "
         + this.field_41564
         + ","
         + this.field_41560
         + ","
         + this.field_41550
         + ","
         + this.field_41559
         + "]";
   }

   public class_8343 method_36897() {
      return this.field_41546;
   }

   public void method_36845(class_8343 var1) {
      this.field_41546 = var1;
      this.method_36860();
   }

   private int method_36866(byte var1) {
      return var1 >= 0 ? var1 : 256 + var1;
   }

   public class_8709 method_36885(int var1, int var2) {
      if (this.field_41574 == null) {
         this.field_41574 = this.field_41546.method_38418();
      }

      int var5 = (int)(this.field_41564 * (float)this.field_41546.method_38420());
      int var6 = (int)(this.field_41560 * (float)this.field_41546.method_38422());
      if (!(this.field_41550 < 0.0F)) {
         var1 = var5 + var1;
      } else {
         var1 = var5 - var1;
      }

      if (!(this.field_41559 < 0.0F)) {
         var2 = var6 + var2;
      } else {
         var2 = var6 - var2;
      }

      int var7 = var1 + var2 * this.field_41546.method_38420();
      var7 *= !this.field_41546.method_38412() ? 3 : 4;
      return !this.field_41546.method_38412()
         ? new class_8709(
            this.method_36866(this.field_41574[var7]), this.method_36866(this.field_41574[var7 + 1]), this.method_36866(this.field_41574[var7 + 2])
         )
         : new class_8709(
            this.method_36866(this.field_41574[var7]),
            this.method_36866(this.field_41574[var7 + 1]),
            this.method_36866(this.field_41574[var7 + 2]),
            this.method_36866(this.field_41574[var7 + 3])
         );
   }

   public boolean method_36844() {
      return this.field_41566;
   }

   public void method_36857() throws SlickException {
      if (!this.method_36844()) {
         this.field_41566 = true;
         this.field_41546.method_38413();
      }
   }

   public void method_36842() {
      this.field_41574 = null;
   }
}
