package mapped;

import com.google.gson.JsonElement;
import java.util.UUID;

public abstract class Class4750<T> implements Class4823<T>, Class4791<T> {
   public static final Class4750<Byte> field22518 = new Class4765();
   /** @deprecated */
   public static final Class4750<Byte[]> field22519 = new Class4752<Byte>(field22518);
   public static final Class4750<byte[]> field22520 = new Class4777();
   public static final Class4750<byte[]> field22521 = new Class4776();
   public static final Class4750<Short> field22522 = new Class4756();
   /** @deprecated */
   public static final Class4750<Short[]> field22523 = new Class4752<Short>(field22522);
   public static final Class4750<Boolean> field22524 = new Class4758();
   /** @deprecated */
   public static final Class4750<Boolean[]> field22525 = new Class4752<Boolean>(field22524);
   public static final Class4750<Integer> field22526 = new Class4762();
   /** @deprecated */
   public static final Class4750<Integer[]> field22527 = new Class4752<Integer>(field22526);
   public static final Class4750<Double> field22528 = new Class4764();
   /** @deprecated */
   public static final Class4750<Double[]> field22529 = new Class4752<Double>(field22528);
   public static final Class4750<Long> field22530 = new Class4759();
   /** @deprecated */
   public static final Class4750<Long[]> field22531 = new Class4752<Long>(field22530);
   public static final Class4760 field22532 = new Class4760();
   /** @deprecated */
   public static final Class4750<Float[]> field22533 = new Class4752<Float>(field22532);
   public static final Class4766 field22534 = new Class4766();
   /** @deprecated */
   public static final Class4750<Short[]> field22535 = new Class4752<Short>(field22534);
   public static final Class4750<Integer> field22536 = new Class4757();
   /** @deprecated */
   public static final Class4750<Integer[]> field22537 = new Class4752<Integer>(field22536);
   public static final Class4750<JsonElement> field22538 = new Class4767();
   public static final Class4750<String> field22539 = new Class4790();
   public static final Class4750<String[]> field22540 = new Class4752<String>(field22539);
   public static final Class4750<UUID> field22541 = new Class4816();
   public static final Class4750<UUID> field22542 = new Class4794();
   public static final Class4750<UUID[]> field22543 = new Class4752<UUID>(field22541);
   public static final Class4761 field22544 = new Class4761();
   /** @deprecated */
   public static final Class4750<Integer[]> field22545 = new Class4752<Integer>(field22544);
   public static final Class4750<int[]> field22546 = new Class4796();
   public static final Class4750<Integer> field22547 = new Class4768();
   public static final Class4754 field22548 = new Class4754();
   /** @deprecated */
   public static final Class4750<Long[]> field22549 = new Class4752<Long>(field22548);
   public static final Class4750<Void> field22550 = new Class4763();
   public static final Class4750<Class9695> field22551 = new Class4769();
   public static final Class4750<Class9695> field22552 = new Class4792();
   public static final Class4750<Class8665> field22553 = new Class4799();
   public static final Class4750<Class9691> field22554 = new Class4795();
   public static final Class4750<Class72> field22555 = new Class4753();
   public static final Class4750<Class72[]> field22556 = new Class4752<Class72>(field22555);
   public static final Class4750<UUID> field22557 = new Class4798();
   public static final Class4750<JsonElement> field22558 = new Class4817();
   public static final Class4750<Class9695> field22559 = new Class4778();
   public static final Class4750<Class9695> field22560 = new Class4814();
   public static final Class4750<Class9738> field22561 = new Class4820();
   public static final Class4750<Class9738[]> field22562 = new Class4804();
   public static final Class4750<Class6949> field22563 = new Class4774();
   public static final Class4750<Class6949[]> field22564 = new Class4752<Class6949>(field22563);
   public static final Class4750<Class6949> field22565 = new Class4788();
   public static final Class4750<Class6949[]> field22566 = new Class4752<Class6949>(field22565);
   public static final Class4750<Class9207> field22567 = new Class4775();
   public static final Class4750<Class9738> field22568 = new Class4821();
   public static final Class4750<Class9738> field22569 = new Class4822();
   public static final Class4750<Class9738[]> field22570 = new Class4805();
   public static final Class4750<Class9738[]> field22571 = new Class4803();
   public static final Class4750<Class9738[]> field22572 = new Class4752<Class9738>(field22568);
   public static final Class4750<Class9738[]> field22573 = new Class4752<Class9738>(field22569);
   private final Class<? super T> field22574;
   private final String field22575;

   public Class4750(Class<? super T> var1) {
      this(var1.getSimpleName(), var1);
   }

   public Class4750(String var1, Class<? super T> var2) {
      this.field22574 = var2;
      this.field22575 = var1;
   }

   public Class<? super T> method14898() {
      return this.field22574;
   }

   public String method14899() {
      return this.field22575;
   }

   public Class<? extends Class4750> method14897() {
      return (Class<? extends Class4750>)this.getClass();
   }

   @Override
   public String toString() {
      return "Type|" + this.field22575;
   }
}
