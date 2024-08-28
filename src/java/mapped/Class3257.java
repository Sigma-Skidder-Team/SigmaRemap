package mapped;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class Class3257 implements Class3303 {
   public static final Map<Block, Class3257> field18732 = Maps.newHashMap();
   public static final UUID field18733 = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID field18734 = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final Random field18735 = new Random();
   public final Class7401 field18736;
   private final Class1978 field18737;
   private final int field18738;
   private final int field18739;
   private final boolean field18740;
   private final Class3257 field18741;
   private String field18742;
   private final Class9427 field18743;

   public static int method11701(Class3257 var0) {
      return var0 != null ? Class2348.field16075.method9171(var0) : 0;
   }

   public static Class3257 method11702(int var0) {
      return Class2348.field16075.method9172(var0);
   }

   @Deprecated
   public static Class3257 method11703(Block var0) {
      return field18732.getOrDefault(var0, Class8514.field37222);
   }

   public Class3257(Class5643 var1) {
      this.field18736 = Class5643.method17782(var1);
      this.field18737 = Class5643.method17783(var1);
      this.field18741 = Class5643.method17784(var1);
      this.field18739 = Class5643.method17785(var1);
      this.field18738 = Class5643.method17786(var1);
      this.field18743 = Class5643.method17787(var1);
      this.field18740 = Class5643.method17788(var1);
   }

   public void method11704(Class1655 var1, Class880 var2, Class8848 var3, int var4) {
   }

   public boolean method11705(Class39 var1) {
      return false;
   }

   public boolean method11706(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4) {
      return true;
   }

   @Override
   public Class3257 method11581() {
      return this;
   }

   public Class2274 method11707(Class5911 var1) {
      return Class2274.field14820;
   }

   public float method11708(Class8848 var1, Class7380 var2) {
      return 1.0F;
   }

   public Class6794<Class8848> method11700(Class1655 var1, PlayerEntity var2, Class79 var3) {
      if (!this.method11744()) {
         return Class6794.<Class8848>method20698(var2.method3094(var3));
      } else {
         Class8848 var6 = var2.method3094(var3);
         if (!var2.method2933(this.method11745().method36160())) {
            return Class6794.<Class8848>method20699(var6);
         } else {
            var2.method3154(var3);
            return Class6794.<Class8848>method20697(var6);
         }
      }
   }

   public Class8848 method11709(Class8848 var1, Class1655 var2, Class880 var3) {
      return !this.method11744() ? var1 : var3.method2984(var2, var1);
   }

   public final int method11710() {
      return this.field18738;
   }

   public final int method11711() {
      return this.field18739;
   }

   public boolean method11712() {
      return this.field18739 > 0;
   }

   public boolean method11713(Class8848 var1, Class880 var2, Class880 var3) {
      return false;
   }

   public boolean method11714(Class8848 var1, Class1655 var2, Class7380 var3, BlockPos var4, Class880 var5) {
      return false;
   }

   public boolean method11715(Class7380 var1) {
      return false;
   }

   public Class2274 method11716(Class8848 var1, PlayerEntity var2, Class880 var3, Class79 var4) {
      return Class2274.field14820;
   }

   public ITextComponent method11717() {
      return new TranslationTextComponent(this.method11719());
   }

   @Override
   public String toString() {
      return Class2348.field16075.method9181(this).method8292();
   }

   public String method11718() {
      if (this.field18742 == null) {
         this.field18742 = Util.method38486("item", Class2348.field16075.method9181(this));
      }

      return this.field18742;
   }

   public String method11719() {
      return this.method11718();
   }

   public String method11720(Class8848 var1) {
      return this.method11719();
   }

   public boolean method11721() {
      return true;
   }

   @Nullable
   public final Class3257 method11722() {
      return this.field18741;
   }

   public boolean method11723() {
      return this.field18741 != null;
   }

   public void method11724(Class8848 var1, Class1655 var2, Entity var3, int var4, boolean var5) {
   }

   public void method11725(Class8848 var1, Class1655 var2, PlayerEntity var3) {
   }

   public boolean method11726() {
      return false;
   }

   public Class2103 method11727(Class8848 var1) {
      return !var1.method32107().method11744() ? Class2103.field13706 : Class2103.field13707;
   }

   public int method11728(Class8848 var1) {
      if (!var1.method32107().method11744()) {
         return 0;
      } else {
         return !this.method11745().method36161() ? 32 : 16;
      }
   }

   public void method11729(Class8848 var1, Class1655 var2, Class880 var3, int var4) {
   }

   public void method11730(Class8848 var1, Class1655 var2, List<ITextComponent> var3, Class2216 var4) {
   }

   public ITextComponent method11731(Class8848 var1) {
      return new TranslationTextComponent(this.method11720(var1));
   }

   public boolean method11732(Class8848 var1) {
      return var1.method32163();
   }

   public Class1978 method11733(Class8848 var1) {
      if (!var1.method32163()) {
         return this.field18737;
      } else {
         switch (Class9591.field44867[this.field18737.ordinal()]) {
            case 1:
            case 2:
               return Class1978.field12887;
            case 3:
               return Class1978.field12888;
            case 4:
            default:
               return this.field18737;
         }
      }
   }

   public boolean method11734(Class8848 var1) {
      return this.method11710() == 1 && this.method11712();
   }

   public static Class8711 method11735(Class1655 var0, PlayerEntity var1, Class1985 var2) {
      float var5 = var1.field5032;
      float var6 = var1.field5031;
      Vector3d var7 = var1.method3286(1.0F);
      float var8 = Class9679.method37764(-var6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var9 = Class9679.method37763(-var6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var10 = -Class9679.method37764(-var5 * (float) (Math.PI / 180.0));
      float var11 = Class9679.method37763(-var5 * (float) (Math.PI / 180.0));
      float var12 = var9 * var10;
      float var13 = var8 * var10;
      double var14 = 5.0;
      Vector3d var16 = var7.method11339((double)var12 * 5.0, (double)var11 * 5.0, (double)var13 * 5.0);
      return var0.method7036(new Class6809(var7, var16, Class2271.field14775, var2, var1));
   }

   public int method11736() {
      return 0;
   }

   public void method11737(Class7401 var1, Class25<Class8848> var2) {
      if (this.method11738(var1)) {
         var2.add(new Class8848(this));
      }
   }

   public boolean method11738(Class7401 var1) {
      Class7401 var4 = this.method11739();
      return var4 != null && (var1 == Class7401.field31670 || var1 == var4);
   }

   @Nullable
   public final Class7401 method11739() {
      return this.field18736;
   }

   public boolean method11699(Class8848 var1, Class8848 var2) {
      return false;
   }

   public Multimap<Class4869, Class9689> method11740(Class2106 var1) {
      return ImmutableMultimap.of();
   }

   public boolean method11741(Class8848 var1) {
      return var1.method32107() == Class8514.field38148;
   }

   public Class8848 method11742() {
      return new Class8848(this);
   }

   public boolean method11743(Class7608<Class3257> var1) {
      return var1.method24917(this);
   }

   public boolean method11744() {
      return this.field18743 != null;
   }

   @Nullable
   public Class9427 method11745() {
      return this.field18743;
   }

   public Class9455 method11746() {
      return Class6067.field26608;
   }

   public Class9455 method11747() {
      return Class6067.field26609;
   }

   public boolean method11748() {
      return this.field18740;
   }

   public boolean method11749(Class8654 var1) {
      return !this.field18740 || !var1.method31141();
   }
}
