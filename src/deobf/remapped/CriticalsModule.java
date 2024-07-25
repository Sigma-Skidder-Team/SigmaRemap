package remapped;

public class CriticalsModule extends SecondModule {
   public CriticalsModule() {
      super(
         Category.COMBAT,
         "Criticals",
         "Automatically does criticals without jumping",
         new MinisCriticals(),
         new PacketCriticals(),
         new NoGroundCriticals(),
         new HoverCriticals(),
         new AAC4Criticals()
      );
   }
}
