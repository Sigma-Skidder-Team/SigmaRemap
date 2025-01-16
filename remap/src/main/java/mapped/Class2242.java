// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

public enum Class2242
{
    field13779("START", 0) {
        public Class2244(final String s, final int n) {
        }
        
        @Override
        public void method8445(final Class1849 class1849, final Class8619 class1850, final List<Class858> list, final int n, final BlockPos class1851) {
            final BlockPos class1852 = new BlockPos(0, 128, 0);
            final Iterator<Class858> iterator = list.iterator();
            while (iterator.hasNext()) {
                iterator.next().method5182(class1852);
            }
            class1850.method29238(Class2244.field13780);
        }
    }, 
    field13780("PREPARING_TO_SUMMON_PILLARS", 1) {
        public Class2247(final String s, final int n) {
        }
        
        @Override
        public void method8445(final Class1849 class1849, final Class8619 class1850, final List<Class858> list, final int n, final BlockPos class1851) {
            if (n >= 100) {
                class1850.method29238(Class2247.field13781);
            }
            else {
                if (n != 0) {
                    if (n != 50) {
                        if (n != 51) {
                            if (n != 52) {
                                if (n < 95) {
                                    return;
                                }
                            }
                        }
                    }
                }
                class1849.method6955(3001, new BlockPos(0, 128, 0), 0);
            }
        }
    }, 
    field13781("SUMMONING_PILLARS", 2) {
        public Class2243(final String s, final int n) {
        }
        
        @Override
        public void method8445(final Class1849 class1849, final Class8619 class1850, final List<Class858> list, final int n, final BlockPos class1851) {
            final boolean b = n % 40 == 0;
            final boolean b2 = n % 40 == 39;
            if (b || b2) {
                final List<Class9341> method13560 = Class4550.method13560(class1849);
                final int n2 = n / 40;
                if (n2 >= method13560.size()) {
                    if (b) {
                        class1850.method29238(Class2243.field13782);
                    }
                }
                else {
                    final Class9341 class1852 = method13560.get(n2);
                    if (!b) {
                        final Iterator<BlockPos> iterator = BlockPos.getAllInBoxMutable(new BlockPos(class1852.method34619() - 10, class1852.method34622() - 10, class1852.method34620() - 10), new BlockPos(class1852.method34619() + 10, class1852.method34622() + 10, class1852.method34620() + 10)).iterator();
                        while (iterator.hasNext()) {
                            class1849.method6690(iterator.next(), false);
                        }
                        class1849.createExplosion(null, class1852.method34619() + 0.5f, class1852.method34622(), class1852.method34620() + 0.5f, 5.0f, Class2196.field13367);
                        Class4535.field20004.method13527(new Class5143(true, (List<Class9341>)ImmutableList.of((Object)class1852), new BlockPos(0, 128, 0))).method28613(class1849, (Class6346<? extends Class7065>)class1849.method6904().method7438(), new Random(), new BlockPos(class1852.method34619(), 45, class1852.method34620()));
                    }
                    else {
                        final Iterator<Class858> iterator2 = list.iterator();
                        while (iterator2.hasNext()) {
                            iterator2.next().method5182(new BlockPos(class1852.method34619(), class1852.method34622() + 1, class1852.method34620()));
                        }
                    }
                }
            }
        }
    }, 
    field13782("SUMMONING_DRAGON", 3) {
        public Class2245(final String s, final int n) {
        }
        
        @Override
        public void method8445(final Class1849 class1849, final Class8619 class1850, final List<Class858> list, final int n, final BlockPos class1851) {
            if (n < 100) {
                if (n < 80) {
                    if (n != 0) {
                        if (n < 5) {
                            class1849.method6955(3001, new BlockPos(0, 128, 0), 0);
                        }
                    }
                    else {
                        final Iterator<Class858> iterator = list.iterator();
                        while (iterator.hasNext()) {
                            iterator.next().method5182(new BlockPos(0, 128, 0));
                        }
                    }
                }
                else {
                    class1849.method6955(3001, new BlockPos(0, 128, 0), 0);
                }
            }
            else {
                class1850.method29238(Class2245.field13783);
                class1850.method29255();
                for (final Class858 class1852 : list) {
                    class1852.method5182(null);
                    class1849.createExplosion(class1852, class1852.getPosX(), class1852.getPosY(), class1852.getPosZ(), 6.0f, Class2196.field13365);
                    class1852.method1652();
                }
            }
        }
    }, 
    field13783("END", 4) {
        public Class2246(final String s, final int n) {
        }
        
        @Override
        public void method8445(final Class1849 class1849, final Class8619 class1850, final List<Class858> list, final int n, final BlockPos class1851) {
        }
    };
    
    public abstract void method8445(final Class1849 p0, final Class8619 p1, final List<Class858> p2, final int p3, final BlockPos p4);
}
