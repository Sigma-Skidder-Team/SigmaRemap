package mapped;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;

public final class Class9260 {
   public Class7281 field42568;
   public Proxy field42569;
   public List<Class2201> field42570;
   public List<Class8574> field42571;
   public final List<Class6172> field42572 = new ArrayList<Class6172>();
   public final List<Class6172> field42573 = new ArrayList<Class6172>();
   public Class8774 field42574;
   public ProxySelector field42575;
   public Class9520 field42576;
   public Class1715 field42577;
   public Class8530 field42578;
   public SocketFactory field42579;
   public Class8110 field42584;
   public Class8110 field42585;
   public Class9457 field42586;
   public Class7004 field42587;
   public boolean field42588;
   public boolean field42589;
   public boolean field42590;
   public int field42591;
   public int field42592;
   public int field42593;
   public int field42594;

   public Class9260() {
      this.field42568 = new Class7281();
      this.field42570 = Class2391.field16284;
      this.field42571 = Class2391.field16285;
      this.field42574 = Class4830.method14930(Class4830.field22605);
      this.field42575 = ProxySelector.getDefault();
      this.field42576 = Class9520.field44322;
      this.field42579 = SocketFactory.getDefault();
      this.field42584 = Class8110.field34864;
      this.field42585 = Class8110.field34864;
      this.field42586 = new Class9457();
      this.field42587 = Class7004.field30285;
      this.field42588 = true;
      this.field42589 = true;
      this.field42590 = true;
      this.field42591 = 10000;
      this.field42592 = 10000;
      this.field42593 = 10000;
      this.field42594 = 0;
   }

   public Class9260(Class2391 var1) {
      this.field42568 = var1.field16286;
      this.field42569 = var1.field16287;
      this.field42570 = var1.field16288;
      this.field42571 = var1.field16289;
      this.field42572.addAll(var1.field16290);
      this.field42573.addAll(var1.field16291);
      this.field42574 = var1.field16292;
      this.field42575 = var1.field16293;
      this.field42576 = var1.field16294;
      this.field42578 = var1.field16296;
      this.field42577 = var1.field16295;
      this.field42579 = var1.field16297;
      this.field42584 = var1.field16302;
      this.field42585 = var1.field16303;
      this.field42586 = var1.field16304;
      this.field42587 = var1.field16305;
      this.field42588 = var1.field16306;
      this.field42589 = var1.field16307;
      this.field42590 = var1.field16308;
      this.field42591 = var1.field16309;
      this.field42592 = var1.field16310;
      this.field42593 = var1.field16311;
      this.field42594 = var1.field16312;
   }


   public void method34827(Class8530 var1) {
      this.field42578 = var1;
      this.field42577 = null;
   }

   public Class9260 method34842(List<Class2201> var1) {
      ArrayList var3 = new ArrayList(var1);
      if (var3.contains(Class2201.field14386)) {
         if (!var3.contains(Class2201.field14385)) {
            if (!var3.contains(null)) {
               var3.remove(Class2201.field14387);
               this.field42570 = Collections.<Class2201>unmodifiableList(var3);
               return this;
            } else {
               throw new IllegalArgumentException("protocols must not contain null");
            }
         } else {
            throw new IllegalArgumentException("protocols must not contain http/1.0: " + var3);
         }
      } else {
         throw new IllegalArgumentException("protocols doesn't contain http/1.1: " + var3);
      }
   }

   public Class2391 method34850() {
      return new Class2391(this);
   }
}
