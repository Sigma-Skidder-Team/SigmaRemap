package mapped;

public enum ItemCameraTransformsTransformType {
   NONE,
   THIRD_PERSON_LEFT_HAND,
   THIRD_PERSON_RIGHT_HAND,
   FIRST_PERSON_LEFT_HAND,
   FIRST_PERSON_RIGHT_HAND,
   HEAD,
   GUI,
   GROUND,
   FIXED;

   public boolean isFirstPerson() {
      return this == FIRST_PERSON_LEFT_HAND || this == FIRST_PERSON_RIGHT_HAND;
   }
}
