// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Spliterator;
import java.util.stream.StreamSupport;
import com.google.common.collect.Streams;
import java.util.stream.Stream;
import java.util.Set;
import java.util.Collections;
import javax.annotation.Nullable;

public interface Class1853 extends Class1855
{
    Class9375 method6787();
    
    @Nullable
    Class1855 method6736(final int p0, final int p1);
    
    default boolean method6957(final Class399 class399, final Class7702 class400) {
        return true;
    }
    
    default boolean method6974(final Class7096 class7096, final Class354 class7097, final Class7543 class7098) {
        final Class7702 method21728 = class7096.method21728(this, class7097, class7098);
        return method21728.method24540() || this.method6957(null, method21728.method24541(class7097.method1074(), class7097.method1075(), class7097.method1076()));
    }
    
    default boolean method6975(final Class399 class399) {
        return this.method6957(class399, Class7698.method24489(class399.method1886()));
    }
    
    default boolean method6976(final Class6221 class6221) {
        return this.method6979(null, class6221, Collections.emptySet());
    }
    
    default boolean method6977(final Class399 class399) {
        return this.method6979(class399, class399.method1886(), Collections.emptySet());
    }
    
    default boolean method6978(final Class399 class399, final Class6221 class400) {
        return this.method6979(class399, class400, Collections.emptySet());
    }
    
    default boolean method6979(final Class399 class399, final Class6221 class400, final Set<Class399> set) {
        return this.method6980(class399, class400, set).allMatch(Class7702::method24540);
    }
    
    default Stream<Class7702> method6956(final Class399 class399, final Class6221 class400, final Set<Class399> set) {
        return Stream.empty();
    }
    
    default Stream<Class7702> method6980(final Class399 class399, final Class6221 class400, final Set<Class399> set) {
        return Streams.concat(new Stream[] { this.method6981(class399, class400), this.method6956(class399, class400, set) });
    }
    
    default Stream<Class7702> method6981(final Class399 class399, final Class6221 class400) {
        return StreamSupport.stream((Spliterator<Class7702>)new Class7583(this, Long.MAX_VALUE, 1280, class399, new Class8243(Class9546.method35644(class400.field25073 - 1.0E-7) - 1, Class9546.method35644(class400.field25074 - 1.0E-7) - 1, Class9546.method35644(class400.field25075 - 1.0E-7) - 1, Class9546.method35644(class400.field25076 + 1.0E-7) + 1, Class9546.method35644(class400.field25077 + 1.0E-7) + 1, Class9546.method35644(class400.field25078 + 1.0E-7) + 1), new Class385(), (class399 != null) ? Class7543.method23630(class399) : Class7543.method23629(), Class7698.method24489(class400)), false);
    }
}
