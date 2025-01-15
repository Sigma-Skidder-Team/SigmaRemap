// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1343 extends Class1334
{
    private final Class9019 field7352;
    private final Class7428 field7353;
    
    public Class1343(final Class5046 class5046, final Class7428 field7353) {
        this.field7353 = field7353;
        this.field7352 = new Class9019(class5046);
    }
    
    @Override
    public void run() {
        this.method5621(Class5046.method15438("mco.connect.connecting"));
        final Class8068 method26468 = Class8068.method26468(this.field7353.field28641);
        this.field7352.method32307(method26468.method26466(), method26468.method26467());
    }
    
    @Override
    public void method5625() {
        this.field7352.method32308();
        Class7847.method25371();
    }
    
    @Override
    public void method5623() {
        this.field7352.method32309();
    }
}
