package net.optifine.render;

import mapped.GlStateManager;

public class GlBlendState {
   private boolean field34645;
   private int field34646;
   private int field34647;
   private int field34648;
   private int field34649;

   public GlBlendState() {
      this(false, 1, 0);
   }

   public GlBlendState(boolean var1) {
      this(var1, 1, 0);
   }

   public GlBlendState(boolean var1, int var2, int var3, int var4, int var5) {
      this.field34645 = var1;
      this.field34646 = var2;
      this.field34647 = var3;
      this.field34648 = var4;
      this.field34649 = var5;
   }

   public GlBlendState(boolean var1, int var2, int var3) {
      this(var1, var2, var3, var2, var3);
   }

   public void method27773(boolean var1, int var2, int var3, int var4, int var5) {
      this.field34645 = var1;
      this.field34646 = var2;
      this.field34647 = var3;
      this.field34648 = var4;
      this.field34649 = var5;
   }

   public void method27774(GlBlendState var1) {
      this.field34645 = var1.field34645;
      this.field34646 = var1.field34646;
      this.field34647 = var1.field34647;
      this.field34648 = var1.field34648;
      this.field34649 = var1.field34649;
   }

   public void method27775(boolean var1) {
      this.field34645 = var1;
   }

   public void method27776() {
      this.field34645 = true;
   }

   public void method27777() {
      this.field34645 = false;
   }

   public void method27778(int var1, int var2) {
      this.field34646 = var1;
      this.field34647 = var2;
      this.field34648 = var1;
      this.field34649 = var2;
   }

   public void method27779(int var1, int var2, int var3, int var4) {
      this.field34646 = var1;
      this.field34647 = var2;
      this.field34648 = var3;
      this.field34649 = var4;
   }

   public boolean method27780() {
      return this.field34645;
   }

   public int method27781() {
      return this.field34646;
   }

   public int method27782() {
      return this.field34647;
   }

   public int method27783() {
      return this.field34648;
   }

   public int method27784() {
      return this.field34649;
   }

   public boolean method27785() {
      return this.field34646 != this.field34648 || this.field34647 != this.field34649;
   }

   @Override
   public String toString() {
      return "enabled: "
         + this.field34645
         + ", src: "
         + this.field34646
         + ", dst: "
         + this.field34647
         + ", srcAlpha: "
         + this.field34648
         + ", dstAlpha: "
         + this.field34649;
   }

   public void method27786() {
      if (this.field34645) {
         GlStateManager.method23715();
         GlStateManager.method23717(this.field34646, this.field34647, this.field34648, this.field34649);
      } else {
         GlStateManager.method23714();
      }
   }
}
