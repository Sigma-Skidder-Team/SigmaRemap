package remapped;

import it.unimi.dsi.fastutil.longs.Long2ByteLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class class_4460 {
   private static String[] field_21741;
   private class_2522 field_21749;
   private BlockPos field_21740;
   private int field_21743 = -1;
   private int field_21738 = -1;
   private int field_21725 = -1;
   private int field_21735 = -1;
   private float[] field_21728 = new float[Direction.field_803.length * 2];
   private BitSet field_21731 = new BitSet(3);
   private class_8742 field_21745 = new class_8742();
   private class_523 field_21746 = null;
   private boolean[] field_21726 = null;
   private boolean[] field_21734 = null;
   private boolean[] field_21747 = null;
   private Direction[] field_21748 = null;
   private List<class_5024> field_21732 = new ArrayList<class_5024>();
   private List<class_5024> field_21727 = new ArrayList<class_5024>();
   private class_5024[] field_21722 = new class_5024[1];
   private class_5024[] field_21730 = new class_5024[2];
   private class_5024[] field_21739 = new class_5024[3];
   private class_5024[] field_21723 = new class_5024[4];
   private class_2848 field_21742 = null;
   private class_8910[] field_21737 = new class_8910[RenderLayer.field_17580.length];
   private boolean field_21744 = false;
   private Long2ByteLinkedOpenHashMap field_21724 = new Long2ByteLinkedOpenHashMap();
   private static final int field_21733 = -1;
   private static final int field_21736 = 0;
   private static final int field_21729 = 1;

   public class_4460(class_2522 var1, BlockPos var2) {
      this.field_21749 = var1;
      this.field_21740 = var2;
   }

   public void method_20678(class_2522 var1, BlockPos var2) {
      if (this.field_21749 != var1 || this.field_21740 != var2) {
         this.field_21749 = var1;
         this.field_21740 = var2;
         this.field_21743 = -1;
         this.field_21738 = -1;
         this.field_21725 = -1;
         this.field_21735 = -1;
         this.field_21731.clear();
      }
   }

   public int method_20694() {
      if (this.field_21743 < 0) {
         this.field_21743 = this.field_21749.method_11477();
      }

      return this.field_21743;
   }

   public int method_20679() {
      if (this.field_21738 < 0) {
         this.field_21738 = this.field_21749.method_11473();
      }

      return this.field_21738;
   }

   public float[] method_20693() {
      return this.field_21728;
   }

   public BitSet method_20682() {
      return this.field_21731;
   }

   public class_8742 method_20680() {
      return this.field_21745;
   }

   public boolean method_20690(List var1) {
      if (this.field_21725 == -1 && var1.size() > 0) {
         if (!(var1.get(0) instanceof class_9363)) {
            this.field_21725 = 0;
         } else {
            this.field_21725 = 1;
         }
      }

      return this.field_21725 == 1;
   }

   public boolean method_20691(class_5024 var1) {
      if (this.field_21725 < 0) {
         if (!(var1 instanceof class_9363)) {
            this.field_21725 = 0;
         } else {
            this.field_21725 = 1;
         }
      }

      return this.field_21725 == 1;
   }

   public boolean method_20689() {
      return this.field_21725 == 1;
   }

   public class_2522 method_20687() {
      return this.field_21749;
   }

   public class_523 method_20673() {
      if (this.field_21746 == null) {
         this.field_21746 = new class_523(0, 0, 0);
      }

      return this.field_21746;
   }

   public boolean[] method_20688() {
      if (this.field_21726 == null) {
         this.field_21726 = new boolean[4];
      }

      return this.field_21726;
   }

   public boolean[] method_20676() {
      if (this.field_21734 == null) {
         this.field_21734 = new boolean[4];
      }

      return this.field_21734;
   }

   public boolean[] method_20672() {
      if (this.field_21747 == null) {
         this.field_21747 = new boolean[4];
      }

      return this.field_21747;
   }

   public Direction[] method_20674() {
      if (this.field_21748 == null) {
         this.field_21748 = new Direction[4];
      }

      return this.field_21748;
   }

   public Direction[] method_20675(Direction var1, Direction var2, Direction var3, Direction var4) {
      Direction[] var7 = this.method_20674();
      var7[0] = var1;
      var7[1] = var2;
      var7[2] = var3;
      var7[3] = var4;
      return var7;
   }

   public boolean method_20696() {
      if (this.field_21735 == -1) {
         if (Config.method_14410() && this.field_21749.method_8360() instanceof class_4423) {
            this.field_21735 = 1;
         } else {
            this.field_21735 = 0;
         }
      }

      return this.field_21735 == 1;
   }

   public List<class_5024> method_20697() {
      return this.field_21732;
   }

   public class_5024[] method_20683(class_5024 var1) {
      this.field_21722[0] = var1;
      return this.field_21722;
   }

   public class_5024[] method_20684(class_5024 var1, class_5024 var2) {
      this.field_21730[0] = var1;
      this.field_21730[1] = var2;
      return this.field_21730;
   }

   public class_5024[] method_20685(class_5024 var1, class_5024 var2, class_5024 var3) {
      this.field_21739[0] = var1;
      this.field_21739[1] = var2;
      this.field_21739[2] = var3;
      return this.field_21739;
   }

   public class_5024[] method_20686(class_5024 var1, class_5024 var2, class_5024 var3, class_5024 var4) {
      this.field_21723[0] = var1;
      this.field_21723[1] = var2;
      this.field_21723[2] = var3;
      this.field_21723[3] = var4;
      return this.field_21723;
   }

   public List<class_5024> method_20669(class_5024[] var1) {
      this.field_21727.clear();
      if (var1 != null) {
         for (int var4 = 0; var4 < var1.length; var4++) {
            class_5024 var5 = var1[var4];
            this.field_21727.add(var5);
         }
      }

      return this.field_21727;
   }

   public class_2848 method_20670() {
      return this.field_21742;
   }

   public void method_20692(class_2848 var1) {
      this.field_21742 = var1;
   }

   public class_8910 method_20695(RenderLayer var1) {
      class_8910 var4 = this.field_21737[var1.method_16704()];
      if (var4 == null) {
         var4 = new class_8910();
         this.field_21737[var1.method_16704()] = var4;
      }

      return var4;
   }

   public boolean method_20671() {
      return this.field_21744;
   }

   public void method_20698(boolean var1) {
      this.field_21744 = var1;
   }

   public Long2ByteLinkedOpenHashMap method_20677() {
      return this.field_21724;
   }
}
