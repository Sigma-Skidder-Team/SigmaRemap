package remapped;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_1144 extends class_4167 {
   private static final Logger field_6489 = Logger.getLogger(class_1144.class.getName());
   private static final String field_6501 = "probe error";
   public static final String field_6521 = "open";
   public static final String field_6516 = "close";
   public static final String field_6483 = "message";
   public static final String field_6515 = "error";
   public static final String field_6496 = "upgradeError";
   public static final String field_6506 = "flush";
   public static final String field_6484 = "drain";
   public static final String field_6508 = "handshake";
   public static final String field_6507 = "upgrading";
   public static final String field_6510 = "upgrade";
   public static final String field_6475 = "packet";
   public static final String field_6490 = "packetCreate";
   public static final String field_6514 = "heartbeat";
   public static final String field_6517 = "data";
   public static final String field_6477 = "ping";
   public static final String field_6481 = "pong";
   public static final String field_6519 = "transport";
   public static final int field_6473 = 3;
   private static boolean field_6499 = false;
   private static class_3323 field_6485;
   private static class_2839 field_6498;
   private static class_8075 field_6504;
   private boolean field_6512;
   private boolean field_6472;
   private boolean field_6491;
   private boolean field_6497;
   private boolean field_6479;
   public int field_6520;
   private int field_6505;
   private int field_6518;
   private long field_6513;
   private long field_6474;
   private String field_6471;
   public String field_6493;
   private String field_6494;
   private String field_6495;
   private List<String> field_6509;
   private Map<String, class_3198> field_6522;
   private List<String> field_6488;
   private Map<String, String> field_6476;
   public LinkedList<class_8970> field_6503 = new LinkedList<class_8970>();
   public class_2291 field_6492;
   private Future field_6502;
   private Future field_6486;
   private class_3323 field_6482;
   private class_2839 field_6511;
   private class_5119 field_6500;
   private ScheduledExecutorService field_6478;
   private final class_6224 field_6487 = new class_9855(this);

   public class_1144() {
      this(new class_5921());
   }

   public class_1144(String var1) throws URISyntaxException {
      this(var1, null);
   }

   public class_1144(URI var1) {
      this(var1, null);
   }

   public class_1144(String var1, class_5921 var2) throws URISyntaxException {
      this(var1 != null ? new URI(var1) : null, var2);
   }

   public class_1144(URI var1, class_5921 var2) {
      this(var1 != null ? class_5921.method_27091(var1, var2) : var2);
   }

   public class_1144(class_5921 var1) {
      if (var1.field_30048 != null) {
         String var4 = var1.field_30048;
         boolean var5 = var4.split(":").length > 2;
         if (var5) {
            int var6 = var4.indexOf(91);
            if (var6 != -1) {
               var4 = var4.substring(var6 + 1);
            }

            int var7 = var4.lastIndexOf(93);
            if (var7 != -1) {
               var4 = var4.substring(0, var7);
            }
         }

         var1.field_15974 = var4;
      }

      this.field_6512 = var1.field_15978;
      if (var1.field_15982 == -1) {
         var1.field_15982 = !this.field_6512 ? 80 : 443;
      }

      this.field_6493 = var1.field_15974 == null ? "localhost" : var1.field_15974;
      this.field_6520 = var1.field_15982;
      this.field_6476 = (Map<String, String>)(var1.field_30043 == null ? new HashMap<String, String>() : class_7718.method_34913(var1.field_30043));
      this.field_6472 = var1.field_30045;
      this.field_6494 = (var1.field_15975 == null ? "/engine.io" : var1.field_15975).replaceAll("/$", "") + "/";
      this.field_6495 = var1.field_15976 == null ? "t" : var1.field_15976;
      this.field_6491 = var1.field_15973;
      this.field_6509 = new ArrayList<String>(Arrays.asList(var1.field_30042 == null ? new String[]{"polling", "websocket"} : var1.field_30042));
      this.field_6522 = (Map<String, class_3198>)(var1.field_30047 == null ? new HashMap<String, class_3198>() : var1.field_30047);
      this.field_6505 = var1.field_15981 == 0 ? 843 : var1.field_15981;
      this.field_6479 = var1.field_30044;
      this.field_6511 = var1.field_15979 == null ? field_6498 : var1.field_15979;
      this.field_6482 = var1.field_15977 == null ? field_6485 : var1.field_15977;
      if (this.field_6511 == null) {
         if (field_6504 == null) {
            field_6504 = new class_8075();
         }

         this.field_6511 = field_6504;
      }

      if (this.field_6482 == null) {
         if (field_6504 == null) {
            field_6504 = new class_8075();
         }

         this.field_6482 = field_6504;
      }
   }

   public static void method_5060(class_3323 var0) {
      field_6485 = var0;
   }

   public static void method_5019(class_2839 var0) {
      field_6498 = var0;
   }

   public class_1144 method_5039() {
      class_8482.method_39073(new class_7090(this));
      return this;
   }

   private class_2291 method_5042(String var1) {
      if (field_6489.isLoggable(Level.FINE)) {
         field_6489.fine(String.format("creating transport '%s'", var1));
      }

      HashMap var4 = new HashMap<String, String>(this.field_6476);
      var4.put("EIO", String.valueOf(3));
      var4.put("transport", var1);
      if (this.field_6471 != null) {
         var4.put("sid", this.field_6471);
      }

      class_3198 var5 = this.field_6522.get(var1);
      class_3198 var6 = new class_3198();
      var6.field_15971 = var4;
      var6.field_15972 = this;
      var6.field_15974 = var5 == null ? this.field_6493 : var5.field_15974;
      var6.field_15982 = var5 == null ? this.field_6520 : var5.field_15982;
      var6.field_15978 = var5 == null ? this.field_6512 : var5.field_15978;
      var6.field_15975 = var5 == null ? this.field_6494 : var5.field_15975;
      var6.field_15973 = var5 == null ? this.field_6491 : var5.field_15973;
      var6.field_15976 = var5 == null ? this.field_6495 : var5.field_15976;
      var6.field_15981 = var5 == null ? this.field_6505 : var5.field_15981;
      var6.field_15979 = var5 == null ? this.field_6511 : var5.field_15979;
      var6.field_15977 = var5 == null ? this.field_6482 : var5.field_15977;
      Object var7;
      if (!"websocket".equals(var1)) {
         if (!"polling".equals(var1)) {
            throw new RuntimeException();
         }

         var7 = new class_5831(var6);
      } else {
         var7 = new class_1161(var6);
      }

      this.method_19325("transport", new Object[]{var7});
      return (class_2291)var7;
   }

   private void method_5021(class_2291 var1) {
      if (field_6489.isLoggable(Level.FINE)) {
         field_6489.fine(String.format("setting transport %s", var1.field_11434));
      }

      if (this.field_6492 != null) {
         if (field_6489.isLoggable(Level.FINE)) {
            field_6489.fine(String.format("clearing existing transport %s", this.field_6492.field_11434));
         }

         this.field_6492.method_19326();
      }

      this.field_6492 = var1;
      var1.method_19329("drain", new class_7296(this, this))
         .method_19329("packet", new class_8409(this, this))
         .method_19329("error", new class_2050(this, this))
         .method_19329("close", new class_5335(this, this));
   }

   private void method_5037(String var1) {
      if (field_6489.isLoggable(Level.FINE)) {
         field_6489.fine(String.format("probing transport '%s'", var1));
      }

      class_2291[] var4 = new class_2291[]{this.method_5042(var1)};
      boolean[] var5 = new boolean[]{false};
      field_6499 = false;
      Runnable[] var7 = new Runnable[1];
      class_6836 var8 = new class_6836(this, var5, var1, var4, this, var7);
      class_9318 var9 = new class_9318(this, var5, var7, var4);
      class_3146 var10 = new class_3146(this, var4, var9, var1, this);
      class_1583 var11 = new class_1583(this, var10);
      class_344 var12 = new class_344(this, var10);
      class_4662 var13 = new class_4662(this, var4, var9);
      var7[0] = new class_3738(this, var4, var8, var10, var11, this, var12, var13);
      var4[0].method_19331("open", var8);
      var4[0].method_19331("error", var10);
      var4[0].method_19331("close", var11);
      this.method_19331("close", var12);
      this.method_19331("upgrading", var13);
      var4[0].method_10548();
   }

   private void method_5032() {
      field_6489.fine("socket open");
      this.field_6500 = class_5119.field_26412;
      field_6499 = "websocket".equals(this.field_6492.field_11434);
      this.method_19325("open", new Object[0]);
      this.method_5016();
      if (this.field_6500 == class_5119.field_26412 && this.field_6472 && this.field_6492 instanceof class_6586) {
         field_6489.fine("starting upgrade probes");

         for (String var4 : this.field_6488) {
            this.method_5037(var4);
         }
      }
   }

   private void method_5054(class_8970 var1) {
      if (this.field_6500 != class_5119.field_26407 && this.field_6500 != class_5119.field_26412 && this.field_6500 != class_5119.field_26408) {
         if (field_6489.isLoggable(Level.FINE)) {
            field_6489.fine(String.format("packet received with socket readyState '%s'", this.field_6500));
         }
      } else {
         if (field_6489.isLoggable(Level.FINE)) {
            field_6489.fine(String.format("socket received: type '%s', data '%s'", var1.field_45957, var1.field_45952));
         }

         this.method_19325("packet", new Object[]{var1});
         this.method_19325("heartbeat", new Object[0]);
         if ("open".equals(var1.field_45957)) {
            try {
               this.method_5024(new class_8548((String)var1.field_45952));
            } catch (class_7584 var5) {
               this.method_19325("error", new Object[]{new class_5773(var5)});
            }
         } else if ("pong".equals(var1.field_45957)) {
            this.method_5055();
            this.method_19325("pong", new Object[0]);
         } else if ("error".equals(var1.field_45957)) {
            class_5773 var4 = new class_5773("server error");
            var4.field_29159 = var1.field_45952;
            this.method_5040(var4);
         } else if ("message".equals(var1.field_45957)) {
            this.method_19325("data", new Object[]{var1.field_45952});
            this.method_19325("message", new Object[]{var1.field_45952});
         }
      }
   }

   private void method_5024(class_8548 var1) {
      this.method_19325("handshake", new Object[]{var1});
      this.field_6471 = var1.field_43745;
      this.field_6492.field_11448.put("sid", var1.field_43745);
      this.field_6488 = this.method_5031(Arrays.<String>asList(var1.field_43747));
      this.field_6513 = var1.field_43749;
      this.field_6474 = var1.field_43748;
      this.method_5032();
      if (class_5119.field_26410 != this.field_6500) {
         this.method_5055();
         this.method_19328("heartbeat", this.field_6487);
         this.method_19329("heartbeat", this.field_6487);
      }
   }

   private void method_5038(long var1) {
      if (this.field_6502 != null) {
         this.field_6502.cancel(false);
      }

      if (var1 <= 0L) {
         var1 = this.field_6513 + this.field_6474;
      }

      this.field_6502 = this.method_5052().schedule(new class_8609(this, this), var1, TimeUnit.MILLISECONDS);
   }

   private void method_5055() {
      if (this.field_6486 != null) {
         this.field_6486.cancel(false);
      }

      this.field_6486 = this.method_5052().schedule(new class_6110(this, this), this.field_6513, TimeUnit.MILLISECONDS);
   }

   private void method_5047() {
      class_8482.method_39073(new class_3996(this));
   }

   private void method_5044() {
      for (int var3 = 0; var3 < this.field_6518; var3++) {
         this.field_6503.poll();
      }

      this.field_6518 = 0;
      if (0 != this.field_6503.size()) {
         this.method_5016();
      } else {
         this.method_19325("drain", new Object[0]);
      }
   }

   private void method_5016() {
      if (this.field_6500 != class_5119.field_26410 && this.field_6492.field_11436 && !this.field_6497 && this.field_6503.size() != 0) {
         if (field_6489.isLoggable(Level.FINE)) {
            field_6489.fine(String.format("flushing %d packets in socket", this.field_6503.size()));
         }

         this.field_6518 = this.field_6503.size();
         this.field_6492.method_10541(this.field_6503.<class_8970>toArray(new class_8970[this.field_6503.size()]));
         this.method_19325("flush", new Object[0]);
      }
   }

   public void method_5056(String var1) {
      this.method_5057(var1, null);
   }

   public void method_5057(String var1, Runnable var2) {
      this.method_5012(var1, var2);
   }

   public void method_5058(byte[] var1) {
      this.method_5059(var1, null);
   }

   public void method_5059(byte[] var1, Runnable var2) {
      this.method_5014(var1, var2);
   }

   public void method_5011(String var1) {
      this.method_5012(var1, null);
   }

   public void method_5013(byte[] var1) {
      this.method_5014(var1, null);
   }

   public void method_5012(String var1, Runnable var2) {
      class_8482.method_39073(new class_1765(this, var1, var2));
   }

   public void method_5014(byte[] var1, Runnable var2) {
      class_8482.method_39073(new class_807(this, var1, var2));
   }

   private void method_5026(String var1, Runnable var2) {
      this.method_5029(new class_8970(var1), var2);
   }

   private void method_5027(String var1, String var2, Runnable var3) {
      class_8970 var6 = new class_8970<String>(var1, var2);
      this.method_5029(var6, var3);
   }

   private void method_5028(String var1, byte[] var2, Runnable var3) {
      class_8970 var6 = new class_8970<byte[]>(var1, var2);
      this.method_5029(var6, var3);
   }

   private void method_5029(class_8970 var1, Runnable var2) {
      if (class_5119.field_26408 != this.field_6500 && class_5119.field_26410 != this.field_6500) {
         this.method_19325("packetCreate", new Object[]{var1});
         this.field_6503.offer(var1);
         if (null != var2) {
            this.method_19331("flush", new class_1855(this, var2));
         }

         this.method_5016();
      }
   }

   public class_1144 method_5053() {
      class_8482.method_39073(new class_4829(this));
      return this;
   }

   private void method_5040(Exception var1) {
      if (field_6489.isLoggable(Level.FINE)) {
         field_6489.fine(String.format("socket error %s", var1));
      }

      field_6499 = false;
      this.method_19325("error", new Object[]{var1});
      this.method_5034("transport error", var1);
   }

   private void method_5033(String var1) {
      this.method_5034(var1, null);
   }

   private void method_5034(String var1, Exception var2) {
      if (class_5119.field_26407 == this.field_6500 || class_5119.field_26412 == this.field_6500 || class_5119.field_26408 == this.field_6500) {
         if (field_6489.isLoggable(Level.FINE)) {
            field_6489.fine(String.format("socket close with reason: %s", var1));
         }

         if (this.field_6486 != null) {
            this.field_6486.cancel(false);
         }

         if (this.field_6502 != null) {
            this.field_6502.cancel(false);
         }

         if (this.field_6478 != null) {
            this.field_6478.shutdown();
         }

         this.field_6492.method_19327("close");
         this.field_6492.method_10547();
         this.field_6492.method_19326();
         this.field_6500 = class_5119.field_26410;
         this.field_6471 = null;
         this.method_19325("close", new Object[]{var1, var2});
         this.field_6503.clear();
         this.field_6518 = 0;
      }
   }

   public List<String> method_5031(List<String> var1) {
      ArrayList var4 = new ArrayList();

      for (String var6 : var1) {
         if (this.field_6509.contains(var6)) {
            var4.add(var6);
         }
      }

      return var4;
   }

   public String method_5043() {
      return this.field_6471;
   }

   private ScheduledExecutorService method_5052() {
      if (this.field_6478 == null || this.field_6478.isShutdown()) {
         this.field_6478 = Executors.newSingleThreadScheduledExecutor();
      }

      return this.field_6478;
   }
}
