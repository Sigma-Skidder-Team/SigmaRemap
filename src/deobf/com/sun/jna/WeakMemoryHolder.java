package com.sun.jna;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.IdentityHashMap;

public class WeakMemoryHolder {
   public ReferenceQueue<Object> referenceQueue = new ReferenceQueue<Object>();
   public IdentityHashMap<Reference<Object>, Memory> backingMap = new IdentityHashMap<Reference<Object>, Memory>();

   public synchronized void put(Object o, Memory m) {
      this.clean();
      WeakReference var5 = new WeakReference<Object>(o, this.referenceQueue);
      this.backingMap.put(var5, m);
   }

   public synchronized void clean() {
      for (Reference var3 = this.referenceQueue.poll(); var3 != null; var3 = this.referenceQueue.poll()) {
         this.backingMap.remove(var3);
      }
   }
}
