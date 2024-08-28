package mapped;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class Class8443 {
   private static String[] field36173;
   public final Class6698 field36174;
   public final Class6698 field36175;
   private final Class6819 field36176;
   private final Class6896 field36177;
   private final Class7617 field36178;
   private List<Class7139> field36179 = ImmutableList.of();
   private int field36180;
   private boolean field36181;
   private Class101 field36182 = Class101.field298;

   public Class8443(Class6698 var1, Class6698 var2, Class6819 var3, Class6896 var4, Class7617 var5) {
      this.field36174 = var1;
      this.field36175 = var2;
      this.field36176 = var3;
      this.field36177 = var4;
      this.field36178 = var5;
   }

   public Class8443 method29690(List<Class7139> var1) {
      this.field36179 = var1;
      return this;
   }

   public Class8443 method29691(int var1) {
      this.field36180 = var1;
      return this;
   }

   public Class8443 method29692() {
      this.field36181 = true;
      return this;
   }

   public Class8443 method29693(Class101 var1) {
      this.field36182 = var1;
      return this;
   }

   public Class4733 method29694() {
      return new Class4733(
         this.field36174,
         this.field36175,
         this.field36176,
         this.field36177,
         this.field36178,
         this.field36179,
         this.field36180,
         this.field36181,
         this.field36182
      );
   }
}
