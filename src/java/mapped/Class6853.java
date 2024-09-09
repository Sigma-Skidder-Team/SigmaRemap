package mapped;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.stream.Collectors;

public abstract class Class6853<T> extends Class6852<T> {
   private final UUID field29769;
   private final Set<Class7161> field29770;
   private final Set<Class2204> field29771;
   private String field29772;
   private float field29773;
   private Class2080 field29774;
   private Class2326 field29775;
   private boolean field29776;

   public Class6853(String var1, float var2, Class2080 var3, Class2326 var4) {
      Preconditions.checkNotNull(var1, "Title cannot be null");
      Preconditions.checkArgument(var2 >= 0.0F && var2 <= 1.0F, "Health must be between 0 and 1");
      this.field29769 = UUID.randomUUID();
      this.field29772 = var1;
      this.field29773 = var2;
      this.field29774 = var3 != null ? var3 : Class2080.field13551;
      this.field29775 = var4 != null ? var4 : Class2326.field15917;
      this.field29770 = Collections.<Class7161>newSetFromMap(new WeakHashMap<Class7161, Boolean>());
      this.field29771 = new HashSet<Class2204>();
      this.field29776 = true;
   }

   @Override
   public Class6852 method20862(String var1) {
      Preconditions.checkNotNull(var1);
      this.field29772 = var1;
      this.method20888(Class2198.field14362);
      return this;
   }

   @Override
   public Class6852 method20864(float var1) {
      Preconditions.checkArgument(var1 >= 0.0F && var1 <= 1.0F, "Health must be between 0 and 1");
      this.field29773 = var1;
      this.method20888(Class2198.field14361);
      return this;
   }

   @Override
   public Class2080 method20865() {
      return this.field29774;
   }

   @Override
   public Class6852 method20866(Class2080 var1) {
      Preconditions.checkNotNull(var1);
      this.field29774 = var1;
      this.method20888(Class2198.field14363);
      return this;
   }

   @Override
   public Class6852 method20868(Class2326 var1) {
      Preconditions.checkNotNull(var1);
      this.field29775 = var1;
      this.method20888(Class2198.field14363);
      return this;
   }

   @Override
   public Class6852 method20870(UUID var1) {
      return this.method20871(ViaVersion3.method27614().method34431(var1));
   }

   @Override
   public Class6852 method20871(Class7161 var1) {
      if (this.field29770.add(var1) && this.field29776) {
         this.method20889(var1, this.method20890(Class2198.field14359, var1));
      }

      return this;
   }

   @Override
   public Class6852 method20874(UUID var1) {
      return this.method20875(ViaVersion3.method27614().method34431(var1));
   }

   @Override
   public Class6852 method20875(Class7161 var1) {
      if (this.field29770.remove(var1)) {
         this.method20889(var1, this.method20890(Class2198.field14360, var1));
      }

      return this;
   }

   @Override
   public Class6852 method20876(Class2204 var1) {
      Preconditions.checkNotNull(var1);
      if (!this.method20878(var1)) {
         this.field29771.add(var1);
      }

      this.method20888(Class2198.field14364);
      return this;
   }

   @Override
   public Class6852 method20877(Class2204 var1) {
      Preconditions.checkNotNull(var1);
      if (this.method20878(var1)) {
         this.field29771.remove(var1);
      }

      this.method20888(Class2198.field14364);
      return this;
   }

   @Override
   public boolean method20878(Class2204 var1) {
      Preconditions.checkNotNull(var1);
      return this.field29771.contains(var1);
   }

   @Override
   public Set<UUID> method20879() {
      return this.field29770.stream().<UUID>map(var0 -> ViaVersion3.method27614().method34420(var0)).filter(Objects::nonNull).collect(Collectors.<UUID>toSet());
   }

   @Override
   public Set<Class7161> method20880() {
      return Collections.<Class7161>unmodifiableSet(this.field29770);
   }

   @Override
   public Class6852 method20881() {
      this.method20885(true);
      return this;
   }

   @Override
   public Class6852 method20882() {
      this.method20885(false);
      return this;
   }

   @Override
   public boolean method20883() {
      return this.field29776;
   }

   private void method20885(boolean var1) {
      if (this.field29776 != var1) {
         this.field29776 = var1;
         this.method20888(!var1 ? Class2198.field14360 : Class2198.field14359);
      }
   }

   @Override
   public UUID method20884() {
      return this.field29769;
   }

   public UUID method20886() {
      return this.field29769;
   }

   @Override
   public String method20861() {
      return this.field29772;
   }

   @Override
   public float method20863() {
      return this.field29773;
   }

   @Override
   public Class2326 method20867() {
      return this.field29775;
   }

   public Set<Class2204> method20887() {
      return this.field29771;
   }

   private void method20888(Class2198 var1) {
      for (Class7161 var5 : new ArrayList<Class7161>(this.field29770)) {
         Class8563 var6 = this.method20890(var1, var5);
         this.method20889(var5, var6);
      }
   }

   private void method20889(Class7161 var1, Class8563 var2) {
      if (var1.method22465() != null && var1.method22465().method18683().method19390(Class6363.class)) {
         try {
            var2.method30570(Class6363.class);
         } catch (Exception var6) {
            var6.printStackTrace();
         }
      } else {
         this.field29770.remove(var1);
      }
   }

   private Class8563 method20890(Class2198 var1, Class7161 var2) {
      try {
         Class8563 var5 = new Class8563(12, null, var2);
         var5.method30560(Class4750.field22541, this.field29769);
         var5.method30560(Class4750.field22544, var1.method8912());
         switch (Class9656.field45138[var1.ordinal()]) {
            case 1:
               Class6363.field27929.method11399(var5, this.field29772);
               var5.method30560(Class4750.field22532, this.field29773);
               var5.method30560(Class4750.field22544, this.field29774.method8736());
               var5.method30560(Class4750.field22544, this.field29775.method9102());
               var5.method30560(Class4750.field22518, (byte)this.method20891());
            case 2:
            default:
               break;
            case 3:
               var5.method30560(Class4750.field22532, this.field29773);
               break;
            case 4:
               Class6363.field27929.method11399(var5, this.field29772);
               break;
            case 5:
               var5.method30560(Class4750.field22544, this.field29774.method8736());
               var5.method30560(Class4750.field22544, this.field29775.method9102());
               break;
            case 6:
               var5.method30560(Class4750.field22518, (byte)this.method20891());
         }

         return var5;
      } catch (Exception var6) {
         var6.printStackTrace();
         return null;
      }
   }

   private int method20891() {
      int var3 = 0;

      for (Class2204 var5 : this.field29771) {
         var3 |= var5.method8919();
      }

      return var3;
   }
}
