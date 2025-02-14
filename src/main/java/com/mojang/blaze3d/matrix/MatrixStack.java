package com.mojang.blaze3d.matrix;

import com.google.common.collect.Queues;
import mapped.Class8892;
import net.minecraft.util.math.vector.Matrix3f;
import mapped.Matrix4f;
import net.minecraft.util.Util;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Quaternion;

import java.util.ArrayDeque;
import java.util.Deque;

public class MatrixStack {
   private static String[] field43309;
   public Deque<Class8892> field43310 = new ArrayDeque<Class8892>();
   private final Deque<Class8892> field43311 = Util.<Deque<Class8892>>make(Queues.newArrayDeque(), var0 -> {
      Matrix4f var3 = new Matrix4f();
      var3.method35503();
      Matrix3f var4 = new Matrix3f();
      var4.method32824();
      var0.add(new Class8892(var3, var4));
   });

   public void translate(double var1, double var3, double var5) {
      Class8892 var9 = this.field43311.getLast();
      Class8892.method32363(var9).method35521((float)var1, (float)var3, (float)var5);
   }

   public void scale(float var1, float var2, float var3) {
      Class8892 var6 = this.field43311.getLast();
      Class8892.method32363(var6).method35522(var1, var2, var3);
      if (var1 == var2 && var2 == var3) {
         if (var1 > 0.0F) {
            return;
         }

         Class8892.method32364(var6).method32830(-1.0F);
      }

      float var7 = 1.0F / var1;
      float var8 = 1.0F / var2;
      float var9 = 1.0F / var3;
      float var10 = MathHelper.method37817(var7 * var8 * var9);
      Class8892.method32364(var6).method32828(Matrix3f.method32817(var10 * var7, var10 * var8, var10 * var9));
   }

   public void rotate(Quaternion var1) {
      Class8892 var4 = this.field43311.getLast();
      Class8892.method32363(var4).method35509(var1);
      Class8892.method32364(var4).method32829(var1);
   }

   public void push() {
      Class8892 var3 = this.field43311.getLast();
      Class8892 var4 = this.field43310.pollLast();
      if (var4 != null) {
         Class8892.method32363(var4).method35525(Class8892.method32363(var3));
         Class8892.method32364(var4).method32823(Class8892.method32364(var3));
      } else {
         var4 = new Class8892(Class8892.method32363(var3).method35514(), Class8892.method32364(var3).method32831());
      }

      this.field43311.addLast(var4);
   }

   public void pop() {
      Class8892 var3 = this.field43311.removeLast();
      if (var3 != null) {
         this.field43310.add(var3);
      }
   }

   public Class8892 getLast() {
      return this.field43311.getLast();
   }

   public boolean method35297() {
      return this.field43311.size() == 1;
   }

   @Override
   public String toString() {
      return this.getLast().toString();
   }
}
